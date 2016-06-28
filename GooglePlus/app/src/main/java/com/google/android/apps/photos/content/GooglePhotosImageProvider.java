package com.google.android.apps.photos.content;

import android.annotation.TargetApi;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import arr;
import art;
import bco;
import bjh;
import bqj;
import btl;
import giz;
import iab;
import ifj;
import ipb;
import ipc;
import ipf;
import iph;
import ipm;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import jqx;
import kbc;
import kbm;
import mar;
import mbb;
import ojf;
import ojv;
import qas;
import qat;

public class GooglePhotosImageProvider
  extends ContentProvider
{
  private static final String[] a = { "_display_name", "_size", "mime_type" };
  private static final String[] c = { "owner_id", "photo_id" };
  private static final String[] d = { "data", "media_attr", "title" };
  private static final String[] e = { "data", "media_attr" };
  private static final String[] f = { "filename" };
  private static final bco g = new bco();
  private final UriMatcher b = new UriMatcher(-1);
  
  static
  {
    new String[] { "timestamp" };
    new String[] { "image_url" };
  }
  
  public static Uri a(Context paramContext, String paramString, ipm paramipm)
  {
    return Uri.parse(b(paramContext, paramString, paramipm));
  }
  
  public static Uri a(Context paramContext, String paramString, ipm paramipm, int paramInt1, int paramInt2, int paramInt3)
  {
    String str = String.valueOf(b(paramContext, paramString, paramipm));
    return Uri.parse(36 + String.valueOf(str).length() + str + "/" + paramInt1 + "/" + paramInt2 + "/288");
  }
  
  private static art a(Context paramContext, int paramInt, String paramString)
  {
    Cursor localCursor = bqj.a(paramContext, paramInt).getReadableDatabase().query("all_photos", e, "image_url = ? AND data NOT NULL", new String[] { paramString }, null, null, null);
    try
    {
      boolean bool = localCursor.moveToFirst();
      if (bool) {
        try
        {
          ojf localojf1 = new ojf();
          byte[] arrayOfByte = localCursor.getBlob(0);
          ojf localojf2 = (ojf)qat.b(localojf1, arrayOfByte, 0, arrayOfByte.length);
          art localart = new art();
          localart.a = paramInt;
          localart.b = mar.a(localojf2);
          localart.d = Long.valueOf(localCursor.getLong(1));
          localart.c = localojf2.i;
          localart.e = localojf2;
          return localart;
        }
        catch (qas localqas)
        {
          Log.e("PhotosContentProvider", "Bad Proto.", localqas);
        }
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private final File a(Uri paramUri, int paramInt, boolean paramBoolean)
  {
    File localFile1;
    try
    {
      localList = paramUri.getPathSegments();
      localipm = ipm.a(Integer.parseInt((String)localList.get(0)));
      Uri localUri = Uri.parse((String)localList.get(1));
      str2 = Uri.decode((String)localList.get(1));
      if (localUri.getScheme().equals("file")) {
        localFile1 = new File(localUri.getPath());
      }
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      List localList;
      ipm localipm;
      String str2;
      boolean bool;
      ipf localipf;
      File localFile2;
      localFile1 = null;
      NumberFormatException localNumberFormatException2 = localNumberFormatException1;
      String str1 = String.valueOf(paramUri);
      Log.e("PhotosContentProvider", 19 + String.valueOf(str1).length() + "Error parsing URI: " + str1, localNumberFormatException2);
      return localFile1;
    }
    try
    {
      if (!a(localFile1)) {
        return null;
      }
      if (paramInt != 2) {
        break label266;
      }
      bool = Log.isLoggable("PhotosContentProvider", 4);
      if (!bool) {
        break label266;
      }
      return localFile1;
    }
    catch (NumberFormatException localNumberFormatException3)
    {
      break label209;
      localFile1 = null;
    }
    localipf = ipf.a(getContext(), str2, localipm);
    if (paramInt == 1) {
      return a(localipf, paramBoolean);
    }
    if (paramInt == 2)
    {
      localFile2 = a(localipf, Integer.parseInt((String)localList.get(2)), Integer.parseInt((String)localList.get(3)), Integer.parseInt((String)localList.get(4)));
      return localFile2;
    }
    label209:
    return localFile1;
  }
  
  public static File a(Uri paramUri, Context paramContext)
  {
    localObject1 = null;
    try
    {
      localCursor = paramContext.getContentResolver().query(paramUri, new String[] { "_data" }, null, null, null);
      File localFile;
      boolean bool;
      if ((localCursor == null) || (localObject1 != null)) {
        localObject1.close();
      }
    }
    finally
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          localFile = new File(localCursor.getString(0));
          bool = localFile.exists();
          if (bool)
          {
            if (localCursor != null) {
              localCursor.close();
            }
            return localFile;
          }
        }
        if (localCursor != null) {
          localCursor.close();
        }
        return null;
      }
      finally
      {
        Cursor localCursor;
        localObject1 = localCursor;
      }
      localObject2 = finally;
    }
    throw localObject2;
  }
  
  private final File a(ipf paramipf, int paramInt1, int paramInt2, int paramInt3)
  {
    ipb localipb = (ipb)mbb.a(getContext(), ipb.class);
    int i = paramInt3 | 0x2;
    try
    {
      File localFile = (File)new ipc(localipb, null, paramipf, 0, paramInt1, paramInt2, i).a();
      return localFile;
    }
    catch (kbm localkbm)
    {
      Log.e("PhotosContentProvider", "couldn't find resource", localkbm);
      return null;
    }
    catch (kbc localkbc)
    {
      for (;;)
      {
        Log.e("PhotosContentProvider", "Canceled", localkbc);
      }
    }
  }
  
  private final File a(ipf paramipf, boolean paramBoolean)
  {
    ipb localipb = (ipb)mbb.a(getContext(), ipb.class);
    File localFile1;
    if (paramipf.e == ipm.b)
    {
      localFile1 = a(paramipf.c, getContext());
      if ((localFile1 == null) || (!localFile1.exists())) {}
    }
    do
    {
      do
      {
        String str3;
        do
        {
          return localFile1;
          if (paramBoolean) {
            return null;
          }
          art localart = b(paramipf.c, getContext());
          if ((localart == null) || (localart.b == null))
          {
            String str1 = String.valueOf(paramipf.c);
            if (str1.length() != 0) {}
            for (String str2 = "Couldn't find video information for image: ".concat(str1);; str2 = new String("Couldn't find video information for image: "))
            {
              Log.e("PhotosContentProvider", str2);
              return null;
            }
          }
          str3 = btl.a(getContext()).a(new arr(this, localart, paramipf));
          if (str3 == null) {
            return null;
          }
          Uri localUri = Uri.parse(str3);
          if ((localUri == null) || (!"content".equals(localUri.getScheme())) || (!"media".equals(localUri.getAuthority()))) {
            break;
          }
          localFile1 = a(localUri, getContext());
        } while (localFile1 != null);
        localFile1 = new File(str3);
      } while (localFile1.exists());
      return null;
      localFile1 = iph.a(getContext(), paramipf);
    } while ((localFile1 != null) && (localFile1.exists()));
    try
    {
      File localFile2 = (File)new ipc(localipb, null, paramipf, 1, 0, 0, 38).a();
      return localFile2;
    }
    catch (kbm localkbm)
    {
      Log.e("PhotosContentProvider", "couldn't find resource", localkbm);
      return null;
    }
    catch (kbc localkbc)
    {
      for (;;)
      {
        Log.e("PhotosContentProvider", "Canceled", localkbc);
      }
    }
  }
  
  private static File a(String paramString, Context paramContext)
  {
    iab localiab = ((ifj)mbb.a(paramContext, ifj.class)).f();
    Iterator localIterator = ((giz)mbb.a(paramContext, giz.class)).a(new String[] { "logged_in" }).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      Object localObject1 = null;
      int i;
      if (bool)
      {
        i = ((Integer)localIterator.next()).intValue();
        String str1 = jqx.a(paramContext, paramString, i);
        if (str1 != null)
        {
          Uri localUri2 = Uri.parse(str1);
          if (("content".equals(localUri2.getScheme())) && ("media".equals(localUri2.getAuthority())))
          {
            File localFile3 = a(localUri2, paramContext);
            if (localFile3 != null) {
              localObject1 = localFile3;
            }
          }
        }
      }
      else
      {
        return localObject1;
      }
      Cursor localCursor = bqj.a(paramContext, i).getReadableDatabase().query("media_cache", f, "image_url = ? AND representation_type = 8", new String[] { paramString }, null, null, null);
      try
      {
        if (localCursor.moveToFirst())
        {
          String str2 = localCursor.getString(0);
          Uri localUri1 = Uri.parse(str2);
          if ("content".equals(localUri1.getScheme()))
          {
            File localFile2 = a(localUri1, paramContext);
            if (localFile2 != null) {
              return localFile2;
            }
          }
          File localFile1 = localiab.a(str2);
          return localFile1;
        }
        localCursor.close();
      }
      finally
      {
        localCursor.close();
      }
    }
  }
  
  public static String a()
  {
    return "com.google.android.apps.photos.content";
  }
  
  public static String a(ipm paramipm)
  {
    if (paramipm == ipm.b) {
      return "video/mpeg";
    }
    if (paramipm == ipm.d) {
      return "image/gif";
    }
    return "image/jpeg";
  }
  
  private static void a(Context paramContext, int paramInt, String paramString, long paramLong)
  {
    new bjh(paramContext, paramInt, paramString, paramLong).i();
  }
  
  public static void a(Context paramContext, Uri paramUri, String paramString1, String paramString2)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new Intent(paramString1);
    localIntent.setDataAndType(paramUri, paramString2);
    Iterator localIterator = localPackageManager.queryIntentActivities(localIntent, 65536).iterator();
    while (localIterator.hasNext()) {
      paramContext.grantUriPermission(((ResolveInfo)localIterator.next()).activityInfo.packageName, paramUri, 1);
    }
  }
  
  public static boolean a(Uri paramUri)
  {
    if ((paramUri == null) || (!"com.google.android.apps.photos.content".equals(paramUri.getAuthority())) || (!"content".equals(paramUri.getScheme()))) {
      return false;
    }
    List localList = paramUri.getPathSegments();
    if (localList.size() < 2) {
      return false;
    }
    return !"file".equals(Uri.parse((String)localList.get(1)).getScheme());
  }
  
  private final boolean a(File paramFile)
  {
    try
    {
      String str1 = getContext().getCacheDir().getCanonicalPath();
      String str2;
      String str3;
      if (!str1.endsWith(File.separator))
      {
        str2 = String.valueOf(str1);
        str3 = String.valueOf(File.separator);
        if (str3.length() == 0) {
          break label60;
        }
      }
      label60:
      for (str1 = str2.concat(str3);; str1 = new String(str2)) {
        return paramFile.getCanonicalPath().startsWith(str1);
      }
      return false;
    }
    catch (IOException localIOException) {}
  }
  
  private static art b(String paramString, Context paramContext)
  {
    List localList = ((giz)mbb.a(paramContext, giz.class)).a(new String[] { "logged_in" });
    int i = 0;
    int j = -1;
    int k;
    Cursor localCursor2;
    if (i < localList.size())
    {
      k = ((Integer)localList.get(i)).intValue();
      art localart2 = a(paramContext, k, paramString);
      if ((localart2 != null) && (g.a(localart2.b)))
      {
        a(paramContext, k, localart2.e.g.b, Long.valueOf(localart2.e.d).longValue());
        return a(paramContext, k, paramString);
      }
      localCursor2 = bqj.a(paramContext, k).getReadableDatabase().query("all_tiles", c, "image_url = ? AND owner_id NOT NULL AND photo_id != 0", new String[] { paramString }, null, null, null);
    }
    for (;;)
    {
      try
      {
        if (localCursor2.moveToFirst())
        {
          String str2 = localCursor2.getString(0);
          long l2 = localCursor2.getLong(1);
          localCursor2.close();
          str1 = str2;
          l1 = l2;
          if (str1 != null) {}
          return null;
        }
        localCursor2.close();
        i++;
        j = k;
      }
      finally
      {
        localCursor2.close();
      }
      SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, k).getReadableDatabase();
      String[] arrayOfString1 = d;
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = str1;
      arrayOfString2[1] = Long.toString(l1);
      Cursor localCursor1 = localSQLiteDatabase.query("all_tiles", arrayOfString1, "owner_id = ? AND photo_id = ?", arrayOfString2, null, null, null);
      try
      {
        if (localCursor1.moveToFirst())
        {
          ojf localojf1 = new ojf();
          byte[] arrayOfByte = localCursor1.getBlob(0);
          ojf localojf2 = (ojf)qat.b(localojf1, arrayOfByte, 0, arrayOfByte.length);
          art localart1 = new art();
          localart1.a = k;
          localart1.b = mar.a(localojf2);
          localart1.d = Long.valueOf(localCursor1.getLong(1));
          localart1.c = localCursor1.getString(2);
          localart1.e = localojf2;
          return localart1;
        }
      }
      catch (qas localqas)
      {
        for (;;)
        {
          Log.e("PhotosContentProvider", "Bad proto", localqas);
          localCursor1.close();
        }
      }
      finally
      {
        localCursor1.close();
      }
      return null;
      k = j;
      long l1 = 0L;
      String str1 = null;
    }
  }
  
  private static String b(Context paramContext, String paramString, ipm paramipm)
  {
    String str1 = String.valueOf("com.google.android.apps.photos.content");
    int i = paramipm.e;
    String str2 = String.valueOf(Uri.encode(paramString));
    return 23 + String.valueOf(str1).length() + String.valueOf(str2).length() + "content://" + str1 + "/" + i + "/" + str2;
  }
  
  public static String b(Uri paramUri)
  {
    if (!a(paramUri)) {
      return null;
    }
    return Uri.decode((String)paramUri.getPathSegments().get(1));
  }
  
  private static ipm c(Uri paramUri)
  {
    try
    {
      ipm localipm = ipm.a(Integer.parseInt((String)paramUri.getPathSegments().get(0)));
      return localipm;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      String str = String.valueOf(paramUri);
      new StringBuilder(20 + String.valueOf(str).length()).append("cannot get id from: ").append(str);
    }
    return null;
  }
  
  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
    super.attachInfo(paramContext, paramProviderInfo);
    String str = paramProviderInfo.authority;
    this.b.addURI(str, "#/*", 1);
    this.b.addURI(str, "#/*/#/#/#", 2);
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    throw new RuntimeException("GooglePhotosImageProvider.delete not supported");
  }
  
  @TargetApi(11)
  public String[] getStreamTypes(Uri paramUri, String paramString)
  {
    return super.getStreamTypes(paramUri, paramString);
  }
  
  public String getType(Uri paramUri)
  {
    switch (this.b.match(paramUri))
    {
    default: 
      return null;
    }
    return a(c(paramUri));
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    throw new RuntimeException("GooglePhotosImageProvider.insert not supported");
  }
  
  public boolean onCreate()
  {
    return true;
  }
  
  public ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    int i = this.b.match(paramUri);
    if (i == -1)
    {
      String str = String.valueOf(paramUri);
      throw new IllegalArgumentException(17 + String.valueOf(str).length() + "unsupported uri: " + str);
    }
    File localFile = a(paramUri, i, paramUri.getBooleanQueryParameter("synced", false));
    if (localFile != null) {
      return ParcelFileDescriptor.open(localFile, 268435456);
    }
    throw new FileNotFoundException();
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    int i = 0;
    int j = this.b.match(paramUri);
    if (j == -1)
    {
      String str4 = String.valueOf(paramUri);
      throw new IllegalArgumentException(17 + String.valueOf(str4).length() + "unsupported uri: " + str4);
    }
    boolean bool = paramUri.getBooleanQueryParameter("synced", false);
    ipm localipm = c(paramUri);
    File localFile = a(paramUri, j, bool);
    if (localFile != null)
    {
      String str1;
      String str2;
      switch (ars.a[localipm.ordinal()])
      {
      default: 
        str1 = "image/jpeg";
        str2 = "image.jpg";
      }
      long l;
      for (;;)
      {
        l = localFile.length();
        if (paramArrayOfString1 != null) {
          break;
        }
        MatrixCursor localMatrixCursor1 = new MatrixCursor(a);
        String[] arrayOfString = new String[3];
        arrayOfString[0] = str2;
        arrayOfString[1] = Long.toString(l);
        arrayOfString[2] = str1;
        localMatrixCursor1.addRow(arrayOfString);
        return localMatrixCursor1;
        str1 = "image/gif";
        str2 = "image.gif";
        continue;
        str1 = "video/mpeg";
        str2 = "video.mpeg";
      }
      MatrixCursor localMatrixCursor2 = new MatrixCursor(paramArrayOfString1);
      Object[] arrayOfObject = new Object[paramArrayOfString1.length];
      if (i < paramArrayOfString1.length)
      {
        String str3 = paramArrayOfString1[i];
        if (str3.equals("_display_name")) {
          arrayOfObject[i] = str2;
        }
        for (;;)
        {
          i++;
          break;
          if (str3.equals("_size")) {
            arrayOfObject[i] = Long.valueOf(l);
          } else if (str3.equals("mime_type")) {
            arrayOfObject[i] = str1;
          }
        }
      }
      localMatrixCursor2.addRow(arrayOfObject);
      return localMatrixCursor2;
    }
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    throw new RuntimeException("GooglePhotosImageProvider.update not supported");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.content.GooglePhotosImageProvider
 * JD-Core Version:    0.7.0.1
 */