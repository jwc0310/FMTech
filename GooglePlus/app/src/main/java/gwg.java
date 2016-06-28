import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class gwg
{
  final hgs a;
  
  public gwg(Context paramContext)
  {
    this.a = ((hgs)mbb.a(paramContext, hgs.class));
  }
  
  public static long a(SQLiteDatabase paramSQLiteDatabase)
  {
    hsn localhsn = new hsn(paramSQLiteDatabase);
    localhsn.a = "album_upload_media";
    localhsn.b = new String[] { "_id" };
    localhsn.c = gwh.b;
    localhsn.f = "1";
    Cursor localCursor = localhsn.a();
    try
    {
      if (localCursor.moveToFirst())
      {
        long l = localCursor.getLong(localCursor.getColumnIndexOrThrow("_id"));
        return l;
      }
      return -1L;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private static gvv a(Cursor paramCursor)
  {
    boolean bool1 = true;
    gvx localgvx = new gvx();
    localgvx.a = paramCursor.getLong(paramCursor.getColumnIndexOrThrow("_id"));
    localgvx.c = paramCursor.getLong(paramCursor.getColumnIndexOrThrow("batch_id"));
    String str = paramCursor.getString(paramCursor.getColumnIndexOrThrow("status"));
    localgvx.d = ((gvy)gvy.g.get(str));
    localgvx.f = paramCursor.getString(paramCursor.getColumnIndexOrThrow("photo_id"));
    localgvx.g = paramCursor.getString(paramCursor.getColumnIndexOrThrow("media_key"));
    localgvx.e = paramCursor.getInt(paramCursor.getColumnIndexOrThrow("attempt_count"));
    localgvx.b = paramCursor.getString(paramCursor.getColumnIndexOrThrow("local_uri"));
    localgvx.h = paramCursor.getLong(paramCursor.getColumnIndexOrThrow("update_time"));
    boolean bool2;
    boolean bool3;
    label200:
    boolean bool4;
    if (localgvx.a > -1L)
    {
      bool2 = bool1;
      efj.c(bool2, "Must have valid uploadId");
      if (localgvx.c <= -1L) {
        break label265;
      }
      bool3 = bool1;
      efj.c(bool3, "Must have a valid batchId");
      if (TextUtils.isEmpty(localgvx.b)) {
        break label271;
      }
      bool4 = bool1;
      label220:
      efj.c(bool4, "Must have a non-empty mediaLocalUri");
      if (localgvx.e < 0) {
        break label277;
      }
    }
    for (;;)
    {
      efj.c(bool1, "Must have non-negative attemptCount.");
      efj.e(localgvx.d, "UploadState must be non-null.");
      return new gvv(localgvx);
      bool2 = false;
      break;
      label265:
      bool3 = false;
      break label200;
      label271:
      bool4 = false;
      break label220;
      label277:
      bool1 = false;
    }
  }
  
  static String[] a(Collection<Long> paramCollection)
  {
    String[] arrayOfString = new String[paramCollection.size()];
    Iterator localIterator = paramCollection.iterator();
    int j;
    for (int i = 0; localIterator.hasNext(); i = j)
    {
      Long localLong = (Long)localIterator.next();
      j = i + 1;
      arrayOfString[i] = Long.toString(localLong.longValue());
    }
    return arrayOfString;
  }
  
  public final gvv a(SQLiteDatabase paramSQLiteDatabase, long paramLong)
  {
    hsn localhsn = new hsn(paramSQLiteDatabase);
    localhsn.a = "album_upload_media";
    localhsn.b = gwh.c;
    localhsn.c = "_id = ?";
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Long.toString(paramLong);
    localhsn.d = arrayOfString;
    localhsn.f = "1";
    Cursor localCursor = localhsn.a();
    try
    {
      boolean bool = localCursor.moveToNext();
      Object localObject2 = null;
      if (bool)
      {
        gvv localgvv = a(localCursor);
        localObject2 = localgvv;
      }
      return localObject2;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public final Collection<Long> a(SQLiteDatabase paramSQLiteDatabase, long paramLong, Collection<String> paramCollection)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("batch_id", Long.valueOf(paramLong));
    localContentValues.put("update_time", Long.valueOf(this.a.a()));
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      localContentValues.put("local_uri", (String)localIterator.next());
      localArrayList.add(Long.valueOf(paramSQLiteDatabase.insert("album_upload_media", null, localContentValues)));
    }
    return localArrayList;
  }
  
  public final List<gvv> a(SQLiteDatabase paramSQLiteDatabase, List<Long> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = new gwe(paramList, 500).iterator();
    while (localIterator.hasNext())
    {
      List localList = (List)localIterator.next();
      String str1 = String.valueOf("batch_id");
      String str2 = String.valueOf(efj.f(localList.size()));
      String str3;
      if (str2.length() != 0) {
        str3 = str1.concat(str2);
      }
      Cursor localCursor;
      for (;;)
      {
        String[] arrayOfString = a(localList);
        hsn localhsn = new hsn(paramSQLiteDatabase);
        localhsn.a = "album_upload_media";
        localhsn.b = gwh.c;
        localhsn.c = str3;
        localhsn.d = arrayOfString;
        localCursor = localhsn.a();
        try
        {
          while (localCursor.moveToNext()) {
            localArrayList.add(a(localCursor));
          }
        }
        finally
        {
          localCursor.close();
        }
      }
      localCursor.close();
    }
    return localArrayList;
  }
  
  public final void a(SQLiteDatabase paramSQLiteDatabase, long paramLong, gvy paramgvy)
  {
    if (paramgvy != gvy.c) {}
    for (boolean bool = true;; bool = false)
    {
      efj.c(bool, "use updateComplete to specify a photoId when upload is complete");
      a(paramSQLiteDatabase, paramLong, paramgvy, null, null);
      return;
    }
  }
  
  final void a(SQLiteDatabase paramSQLiteDatabase, long paramLong, gvy paramgvy, String paramString1, String paramString2)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("status", paramgvy.h);
    localContentValues.put("update_time", Long.valueOf(this.a.a()));
    if (paramString1 != null) {
      localContentValues.put("photo_id", paramString1);
    }
    if (paramString2 != null) {
      localContentValues.put("media_key", paramString2);
    }
    paramSQLiteDatabase.update("album_upload_media", localContentValues, "_id = ?", gwh.a(paramLong));
  }
  
  public final HashMap<gvy, Integer> b(SQLiteDatabase paramSQLiteDatabase, List<Long> paramList)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = new gwe(paramList, 500).iterator();
    while (localIterator.hasNext())
    {
      List localList = (List)localIterator.next();
      String str1 = String.valueOf("batch_id");
      String str2 = String.valueOf(efj.f(localList.size()));
      String str3;
      if (str2.length() != 0) {
        str3 = str1.concat(str2);
      }
      Cursor localCursor;
      for (;;)
      {
        String[] arrayOfString = a(localList);
        hsn localhsn = new hsn(paramSQLiteDatabase);
        localhsn.a = "album_upload_media";
        localhsn.b = new String[] { "status", "COUNT(_id)" };
        localhsn.c = str3;
        localhsn.d = arrayOfString;
        localhsn.e = "status";
        localCursor = localhsn.a();
        try
        {
          while (localCursor.moveToNext())
          {
            String str4 = localCursor.getString(localCursor.getColumnIndex("status"));
            gvy localgvy = (gvy)gvy.g.get(str4);
            int i = localCursor.getInt(1);
            if (!localHashMap.containsKey(localgvy)) {
              localHashMap.put(localgvy, Integer.valueOf(0));
            }
            localHashMap.put(localgvy, Integer.valueOf(i + ((Integer)localHashMap.get(localgvy)).intValue()));
          }
          str3 = new String(str1);
        }
        finally
        {
          localCursor.close();
        }
      }
      localCursor.close();
    }
    return localHashMap;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwg
 * JD-Core Version:    0.7.0.1
 */