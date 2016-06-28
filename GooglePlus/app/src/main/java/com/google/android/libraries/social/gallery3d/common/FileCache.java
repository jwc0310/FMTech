package com.google.android.libraries.social.gallery3d.common;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import iao;
import iaq;
import iar;
import iat;
import iaw;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public final class FileCache
  implements Closeable
{
  private static final String f = FileCache.FileEntry.a.a;
  private static final String[] g;
  private static final String[] h = { "_id", "filename", "content_url", "size" };
  private static final String i = String.format("%s ASC", new Object[] { "last_access" });
  public File a;
  public long b;
  public boolean c = false;
  public long d;
  public iar e;
  private final iat<String, iaq> j = new iat(4);
  
  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.format("sum(%s)", new Object[] { "size" });
    g = arrayOfString;
  }
  
  public FileCache(Context paramContext, File paramFile, String paramString, long paramLong)
  {
    if (paramFile == null) {
      throw new NullPointerException();
    }
    this.a = ((File)paramFile);
    this.b = paramLong;
    this.e = new iar(this, paramContext, paramString);
  }
  
  private final void a(long paramLong)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("last_access", Long.valueOf(System.currentTimeMillis()));
    SQLiteDatabase localSQLiteDatabase = this.e.getWritableDatabase();
    String str = f;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    localSQLiteDatabase.update(str, localContentValues, "_id=?", arrayOfString);
  }
  
  public static void a(Context paramContext, File paramFile, String paramString)
  {
    try
    {
      paramContext.getDatabasePath(paramString).delete();
      if (paramFile.listFiles() == null) {
        return;
      }
      for (File localFile : paramFile.listFiles())
      {
        String str = localFile.getName();
        if ((localFile.isFile()) && (str.startsWith("download")) && (str.endsWith(".tmp"))) {
          localFile.delete();
        }
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public final iaq a(String paramString)
  {
    if (!this.c) {
      a();
    }
    iaq localiaq1;
    synchronized (this.j)
    {
      localiaq1 = (iaq)this.j.b(paramString);
      if (localiaq1 == null) {}
    }
    iaq localiaq2;
    label242:
    for (;;)
    {
      try
      {
        FileCache.FileEntry localFileEntry = b(paramString);
        if (localFileEntry == null) {
          return null;
        }
        localiaq2 = new iaq(localFileEntry.id, paramString, new File(this.a, localFileEntry.filename));
        iaw.a(a(localiaq2.b));
        boolean bool = localiaq2.b.isFile();
        if (bool) {
          break;
        }
        String str1;
        try
        {
          SQLiteDatabase localSQLiteDatabase = this.e.getWritableDatabase();
          String str2 = f;
          String[] arrayOfString = new String[1];
          arrayOfString[0] = String.valueOf(localFileEntry.id);
          localSQLiteDatabase.delete(str2, "_id=?", arrayOfString);
          this.d -= localFileEntry.size;
          return null;
        }
        catch (Throwable localThrowable)
        {
          str1 = String.valueOf(localFileEntry.filename);
          if (str1.length() == 0) {
            break label242;
          }
        }
        "cannot delete entry: ".concat(str1);
        continue;
        new String("cannot delete entry: ");
      }
      finally {}
    }
    synchronized (this.j)
    {
      this.j.a(paramString, localiaq2);
      return localiaq2;
    }
  }
  
  public final void a()
  {
    for (;;)
    {
      try
      {
        boolean bool = this.c;
        if (bool) {
          return;
        }
        if (this.a.isDirectory()) {
          break label100;
        }
        this.a.mkdirs();
        if (this.a.isDirectory()) {
          break label100;
        }
        String str1 = String.valueOf(this.a.getAbsolutePath());
        if (str1.length() != 0)
        {
          str2 = "cannot create: ".concat(str1);
          throw new RuntimeException(str2);
        }
      }
      finally {}
      String str2 = new String("cannot create: ");
      continue;
      label100:
      Cursor localCursor = this.e.getReadableDatabase().query(f, g, null, null, null, null, null);
      try
      {
        if (localCursor.moveToNext()) {
          this.d = localCursor.getLong(0);
        }
        localCursor.close();
        if (this.d > this.b) {
          a(16);
        }
        this.c = true;
      }
      finally
      {
        localCursor.close();
      }
    }
  }
  
  public final void a(int paramInt)
  {
    Cursor localCursor = this.e.getReadableDatabase().query(f, h, null, null, null, null, i);
    while (paramInt > 0)
    {
      long l1;
      String str1;
      long l2;
      try
      {
        if ((this.d <= this.b) || (!localCursor.moveToNext())) {
          break;
        }
        l1 = localCursor.getLong(0);
        str1 = localCursor.getString(1);
        String str2 = localCursor.getString(2);
        l2 = localCursor.getLong(3);
        synchronized (this.j)
        {
          if (!this.j.a(str2)) {}
        }
      }
      finally
      {
        localCursor.close();
      }
      paramInt--;
      if (new File(this.a, str1).delete())
      {
        this.d -= l2;
        SQLiteDatabase localSQLiteDatabase = this.e.getWritableDatabase();
        String str4 = f;
        String[] arrayOfString = new String[1];
        arrayOfString[0] = String.valueOf(l1);
        localSQLiteDatabase.delete(str4, "_id=?", arrayOfString);
      }
      else
      {
        String str3 = String.valueOf(str1);
        if (str3.length() != 0) {
          "unable to delete file: ".concat(str3);
        } else {
          new String("unable to delete file: ");
        }
      }
    }
    localCursor.close();
  }
  
  public final boolean a(File paramFile)
  {
    try
    {
      String str1 = this.a.getCanonicalPath();
      String str2;
      String str3;
      if (!str1.endsWith(File.separator))
      {
        str2 = String.valueOf(str1);
        str3 = String.valueOf(File.separator);
        if (str3.length() == 0) {
          break label57;
        }
      }
      label57:
      for (str1 = str2.concat(str3);; str1 = new String(str2)) {
        return paramFile.getCanonicalPath().startsWith(str1);
      }
      return false;
    }
    catch (IOException localIOException) {}
  }
  
  public final FileCache.FileEntry b(String paramString)
  {
    long l = iaw.a(paramString);
    String[] arrayOfString = new String[2];
    arrayOfString[0] = String.valueOf(l);
    arrayOfString[1] = paramString;
    Cursor localCursor = this.e.getReadableDatabase().query(f, FileCache.FileEntry.a.b, "hash_code=? AND content_url=?", arrayOfString, null, null, null);
    try
    {
      boolean bool = localCursor.moveToNext();
      if (!bool) {
        return null;
      }
      FileCache.FileEntry localFileEntry = new FileCache.FileEntry();
      FileCache.FileEntry.a.a(localCursor, localFileEntry);
      a(localFileEntry.id);
      return localFileEntry;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public final void close()
  {
    this.e.close();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.gallery3d.common.FileCache
 * JD-Core Version:    0.7.0.1
 */