import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.HandlerThread;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

public final class hbo
  implements hbn
{
  static final String[] a;
  static final String[] b;
  private static final String[] f = { "bucket_id" };
  private static final String[] g = { "media_type", "volume_name", "last_media_id" };
  private static final String[] h = { "bucket_id" };
  final Context c;
  final hci d;
  final Object e = new Object();
  private final Map<hbr, Long> i = new kl();
  private boolean j;
  private final Set<String> k = new HashSet();
  private final Handler l;
  private final Set<String> m = new HashSet();
  private final Object n = new Object();
  
  static
  {
    String[] arrayOfString1 = new String[7];
    arrayOfString1[0] = "_id";
    arrayOfString1[1] = "bucket_id";
    arrayOfString1[2] = "_data";
    String str1 = String.valueOf(efj.a(efj.m("date_added"), efj.m("date_modified")));
    String str2 = String.valueOf("corrected_added_modified");
    arrayOfString1[3] = (4 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + " as " + str2);
    arrayOfString1[4] = "mime_type";
    arrayOfString1[5] = "0 as orientation";
    arrayOfString1[6] = "bucket_display_name";
    a = arrayOfString1;
    String[] arrayOfString2 = new String[7];
    arrayOfString2[0] = "_id";
    arrayOfString2[1] = "bucket_id";
    arrayOfString2[2] = "_data";
    String str3 = String.valueOf(efj.a(efj.m("date_added"), efj.m("date_modified")));
    String str4 = String.valueOf("corrected_added_modified");
    arrayOfString2[3] = (4 + String.valueOf(str3).length() + String.valueOf(str4).length() + str3 + " as " + str4);
    arrayOfString2[4] = "mime_type";
    arrayOfString2[5] = "orientation";
    arrayOfString2[6] = "bucket_display_name";
    b = arrayOfString2;
  }
  
  hbo(Context paramContext)
  {
    this.c = paramContext;
    this.d = ((hci)mbb.a(paramContext, hci.class));
    HandlerThread localHandlerThread = new HandlerThread("MediaTracker bucket changes");
    localHandlerThread.start();
    this.l = new Handler(localHandlerThread.getLooper());
    h();
  }
  
  public static long a(Context paramContext, String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase = ((hci)mbb.a(paramContext, hci.class)).getReadableDatabase();
    try
    {
      localCursor2 = localSQLiteDatabase.query("media_tracker", g, "volume_name = ? AND media_type = ?", new String[] { paramString2, paramString1 }, null, null, null);
      long l1;
      if (localCursor1 == null) {
        break label115;
      }
    }
    finally
    {
      try
      {
        if (localCursor2.moveToFirst())
        {
          l1 = localCursor2.getLong(localCursor2.getColumnIndex("last_media_id"));
          if (localCursor2 != null) {
            localCursor2.close();
          }
          return l1;
        }
        if (localCursor2 != null) {
          localCursor2.close();
        }
        return 0L;
      }
      finally
      {
        Cursor localCursor2;
        Cursor localCursor1 = localCursor2;
      }
      localObject1 = finally;
      localCursor1 = null;
    }
    localCursor1.close();
    label115:
    throw localObject1;
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE media_tracker (_id INTEGER PRIMARY KEY, volume_name TEXT NOT NULL, media_type TEXT NOT NULL,last_media_id INTEGER NOT NULL DEFAULT(0))");
    paramSQLiteDatabase.execSQL("CREATE TABLE exclude_bucket (_id INTEGER PRIMARY KEY, bucket_id TEXT UNIQUE NOT NULL)");
    paramSQLiteDatabase.execSQL("CREATE TABLE local_folders (bucket_id TEXT UNIQUE NOT NULL)");
  }
  
  private final int e()
  {
    HashSet localHashSet;
    synchronized (this.e)
    {
      synchronized (this.n)
      {
        localHashSet = new HashSet(this.k);
        if (this.j) {
          return 0;
        }
      }
    }
    ContentValues localContentValues1 = new ContentValues();
    ContentResolver localContentResolver = this.c.getContentResolver();
    SQLiteDatabase localSQLiteDatabase1 = this.d.getWritableDatabase();
    int i1 = 0;
    int i2 = 0;
    long l1 = System.currentTimeMillis();
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c);
    boolean bool1 = localSharedPreferences.getBoolean("exclusion_scanner.has_run", false);
    i();
    Iterator localIterator = this.i.keySet().iterator();
    hbr localhbr;
    long l4;
    String str1;
    Uri localUri;
    boolean bool2;
    while (localIterator.hasNext())
    {
      localhbr = (hbr)localIterator.next();
      if (!this.j) {
        if (!localhbr.a(localContentResolver))
        {
          if (Log.isLoggable("iu.UploadsManager", 3))
          {
            String str6 = localhbr.b;
            String str7 = localhbr.a;
            new StringBuilder(9 + String.valueOf(str6).length() + String.valueOf(str7).length()).append("SKIP; ").append(str6).append(" [").append(str7).append("]");
          }
        }
        else
        {
          if (!Log.isLoggable("iu.UploadsManager", 3)) {
            break label953;
          }
          String str4 = localhbr.b;
          String str5 = localhbr.a;
          new StringBuilder(10 + String.valueOf(str4).length() + String.valueOf(str5).length()).append("START; ").append(str4).append(" [").append(str5).append("]");
          break label953;
          long l3 = ((Long)this.i.get(localhbr)).longValue();
          localhbr.d[0] = String.valueOf(l3);
          hbs localhbs = hbr.a(localContentResolver.query(localhbr.c, localhbr.e, "_id > ? AND _data IS NOT NULL", localhbr.d, "_id LIMIT 1"));
          l4 = localhbs.a;
          str1 = localhbs.b;
          if (l4 == -1L) {
            break label942;
          }
          if ((str1 != null) && (!this.m.contains(str1)))
          {
            this.m.add(str1);
            SQLiteDatabase localSQLiteDatabase2 = this.d.getWritableDatabase();
            ContentValues localContentValues2 = new ContentValues(1);
            localContentValues2.put("bucket_id", str1);
            localSQLiteDatabase2.insert("local_folders", null, localContentValues2);
            localHashSet.add(str1);
            b(str1);
            if (bool1)
            {
              hba localhba = (hba)mbb.a(this.c, hba.class);
              if (!localhba.e().isEmpty())
              {
                Integer localInteger = (Integer)localhba.e().get(0);
                hcw.a(this.c, localInteger.intValue(), localhbs.c, str1);
              }
            }
          }
          this.i.put(localhbr, Long.valueOf(l4));
          g();
          localUri = localhbr.c.buildUpon().appendEncodedPath(String.valueOf(l4)).build();
          bool2 = localhbr.a.equals("photo");
          if (TextUtils.isEmpty(str1)) {
            break label960;
          }
          if (localHashSet.contains(str1)) {
            break label973;
          }
          break label960;
        }
      }
    }
    for (;;)
    {
      label654:
      boolean bool4 = hbm.a(this.c, localContentResolver, localSQLiteDatabase1, localContentValues1, str1, l4, localUri, bool2, bool3);
      int i3;
      i1 = i3 + 1;
      int i4;
      if (bool4)
      {
        i4 = i2 + 1;
        label696:
        if (!this.j) {}
      }
      for (;;)
      {
        if (Log.isLoggable("iu.UploadsManager", 3))
        {
          String str2 = localhbr.b;
          String str3 = localhbr.a;
          new StringBuilder(24 + String.valueOf(str2).length() + String.valueOf(str3).length()).append("DONE; no more media; ").append(str2).append(" [").append(str3).append("]");
          break label966;
          if (Log.isLoggable("iu.UploadsManager", 4))
          {
            long l2 = System.currentTimeMillis() - l1;
            new StringBuilder(88).append("End new media; added: ").append(i1).append(", uploading: ").append(i2).append(", time: ").append(l2).append(" ms");
          }
          localSharedPreferences.edit().putBoolean("exclusion_scanner.has_run", true).commit();
          f();
          if (i1 > 0) {
            hcw.d(this.c);
          }
          if (i2 > 0)
          {
            localContentResolver.notifyChange(hbu.a(this.c), null);
            hcw.a(this.c, System.currentTimeMillis(), false);
          }
          return i1;
          i2 = i4;
          i3 = i1;
          break;
          i4 = i2;
          break label696;
          label942:
          i4 = i2;
          i1 = i3;
          continue;
          label953:
          i3 = i1;
          break;
          label960:
          bool3 = true;
          break label654;
        }
      }
      label966:
      i2 = i4;
      break;
      label973:
      boolean bool3 = false;
    }
  }
  
  private final void f()
  {
    hbt localhbt = new hbt(this.c, "AUTO_BACKUP_MEDIA_TRACKER_INCLUDED_BUCKET_IDS");
    Iterator localIterator = localhbt.a().iterator();
    while (localIterator.hasNext()) {
      a((String)localIterator.next());
    }
    PreferenceManager.getDefaultSharedPreferences(localhbt.a).edit().remove(localhbt.b).commit();
  }
  
  private final void g()
  {
    Iterator localIterator = this.i.keySet().iterator();
    while (localIterator.hasNext())
    {
      hbr localhbr = (hbr)localIterator.next();
      hci localhci = this.d;
      long l1 = ((Long)this.i.get(localhbr)).longValue();
      SQLiteDatabase localSQLiteDatabase = localhci.getWritableDatabase();
      ContentValues localContentValues = new ContentValues(3);
      localContentValues.put("volume_name", localhbr.b);
      localContentValues.put("media_type", localhbr.a);
      localContentValues.put("last_media_id", Long.valueOf(l1));
      String[] arrayOfString = new String[2];
      arrayOfString[0] = localhbr.a;
      arrayOfString[1] = localhbr.b;
      if (DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT count(*) FROM media_tracker WHERE media_type = ? AND volume_name = ?", arrayOfString) == 0L) {
        localSQLiteDatabase.insert("media_tracker", null, localContentValues);
      } else {
        localSQLiteDatabase.update("media_tracker", localContentValues, "media_type = ? AND volume_name = ?", arrayOfString);
      }
    }
  }
  
  private final void h()
  {
    this.i.clear();
    this.i.put(new hbr("photo", "external"), Long.valueOf(0L));
    this.i.put(new hbr("photo", "phoneStorage"), Long.valueOf(0L));
    this.i.put(new hbr("video", "external"), Long.valueOf(0L));
    this.i.put(new hbr("video", "phoneStorage"), Long.valueOf(0L));
    localSQLiteDatabase = this.d.getReadableDatabase();
    Cursor localCursor1 = localSQLiteDatabase.query("media_tracker", g, null, null, null, null, null);
    try
    {
      while (localCursor1.moveToNext())
      {
        String str3 = localCursor1.getString(0);
        String str4 = localCursor1.getString(1);
        long l1 = localCursor1.getLong(2);
        this.i.put(new hbr(str3, str4), Long.valueOf(l1));
      }
      try
      {
        i();
        String str2;
        synchronized (this.n)
        {
          this.k.clear();
          localCursor2 = localSQLiteDatabase.query("exclude_bucket", f, null, null, null, null, null);
        }
      }
      catch (SecurityException localSecurityException)
      {
        Cursor localCursor2;
        for (;;)
        {
          if (Log.isLoggable("iu.UploadsManager", 6)) {
            Log.e("iu.UploadsManager", "Insufficient permissions to access media store", localSecurityException);
          }
        }
        localCursor2.close();
        Cursor localCursor3 = localSQLiteDatabase.query("local_folders", h, null, null, null, null, null);
        try
        {
          if (localCursor3.moveToNext())
          {
            String str1 = localCursor3.getString(0);
            this.m.add(str1);
          }
          return;
        }
        finally
        {
          localCursor3.close();
        }
      }
    }
    finally
    {
      localCursor1.close();
    }
  }
  
  private final void i()
  {
    Iterator localIterator = this.i.keySet().iterator();
    int i1 = 0;
    if (localIterator.hasNext())
    {
      hbr localhbr = (hbr)localIterator.next();
      ContentResolver localContentResolver = this.c.getContentResolver();
      localhbr.d[0] = "-1";
      hbs localhbs = hbr.a(localContentResolver.query(localhbr.c, localhbr.e, "_id > ? AND _data IS NOT NULL", localhbr.d, "_id DESC LIMIT 1"));
      long l1 = ((Long)this.i.get(localhbr)).longValue();
      if ((localhbs.a >= l1) || (localhbs.a == -1L)) {
        break label156;
      }
      this.i.put(localhbr, Long.valueOf(0L));
    }
    label156:
    for (int i2 = 1;; i2 = i1)
    {
      i1 = i2;
      break;
      if (i1 != 0) {
        g();
      }
      return;
    }
  }
  
  public final int a()
  {
    try
    {
      int i1 = e();
      return i1;
    }
    catch (SecurityException localSecurityException)
    {
      if (Log.isLoggable("iu.UploadsManager", 6)) {
        Log.e("iu.UploadsManager", "Insufficient permissions to process media", localSecurityException);
      }
    }
    return 0;
  }
  
  public final void a(Context paramContext)
  {
    synchronized (this.e)
    {
      this.j = true;
      SQLiteDatabase localSQLiteDatabase = this.d.getWritableDatabase();
      localSQLiteDatabase.delete("media_tracker", null, null);
      localSQLiteDatabase.delete("local_folders", null, null);
      PreferenceManager.getDefaultSharedPreferences(paramContext).edit().remove("exclusion_scanner.has_run").commit();
      h();
      this.j = false;
      return;
    }
  }
  
  public final void a(String paramString)
  {
    synchronized (this.n)
    {
      if (!this.m.contains(paramString))
      {
        hbt localhbt = new hbt(this.c, "AUTO_BACKUP_MEDIA_TRACKER_INCLUDED_BUCKET_IDS");
        Set localSet = localhbt.a();
        localSet.add(paramString);
        JSONArray localJSONArray = new JSONArray(localSet);
        PreferenceManager.getDefaultSharedPreferences(localhbt.a).edit().putString(localhbt.b, localJSONArray.toString()).commit();
      }
      if (!this.k.remove(paramString)) {
        return;
      }
      this.c.getContentResolver().notifyChange(hbu.b(this.c), null);
      this.l.post(new hbp(this, paramString));
      return;
    }
  }
  
  public final int b()
  {
    HashSet localHashSet;
    synchronized (this.e)
    {
      synchronized (this.n)
      {
        localHashSet = new HashSet(this.k);
        if (this.j) {
          return 0;
        }
      }
    }
    ContentValues localContentValues = new ContentValues();
    ContentResolver localContentResolver = this.c.getContentResolver();
    SQLiteDatabase localSQLiteDatabase = this.d.getWritableDatabase();
    int i1 = 0;
    int i2 = 0;
    long l1 = System.currentTimeMillis();
    Iterator localIterator = this.i.keySet().iterator();
    label195:
    long l4;
    String str1;
    int i3;
    Uri localUri;
    boolean bool1;
    while (localIterator.hasNext())
    {
      hbr localhbr = (hbr)localIterator.next();
      if (!this.j)
      {
        if (localhbr.a(localContentResolver)) {
          break label565;
        }
        if (Log.isLoggable("iu.UploadsManager", 3))
        {
          String str3 = String.valueOf(localhbr);
          new StringBuilder(29 + String.valueOf(str3).length()).append("SKIP; no storage for config: ").append(str3);
          continue;
          Object localObject5;
          localhbr.d[0] = String.valueOf(localObject5);
          hbs localhbs = hbr.a(localContentResolver.query(localhbr.c, localhbr.e, "_id > ? AND _data IS NOT NULL", localhbr.d, "_id LIMIT 1"));
          l4 = localhbs.a;
          str1 = localhbs.b;
          if (l4 == -1L)
          {
            if (Log.isLoggable("iu.UploadsManager", 3))
            {
              String str2 = String.valueOf(localhbr);
              new StringBuilder(29 + String.valueOf(str2).length()).append("DONE; no more media of type: ").append(str2);
            }
            this.i.put(localhbr, Long.valueOf(localObject5));
            g();
            i1 = i3;
          }
          else
          {
            localUri = localhbr.c.buildUpon().appendEncodedPath(String.valueOf(l4)).build();
            bool1 = localhbr.a.equals("photo");
            boolean bool2 = TextUtils.isEmpty(str1);
            if ((localHashSet.contains(str1)) || (bool2)) {
              break label577;
            }
          }
        }
      }
    }
    label565:
    label577:
    for (boolean bool3 = true;; bool3 = false)
    {
      boolean bool4 = hbm.a(this.c, localContentResolver, localSQLiteDatabase, localContentValues, str1, l4, localUri, bool1, bool3);
      i1 = i3 + 1;
      if (bool4) {}
      for (int i4 = i2 + 1;; i4 = i2)
      {
        if (this.j)
        {
          i2 = i4;
          break;
          if (Log.isLoggable("iu.UploadsManager", 4))
          {
            long l2 = System.currentTimeMillis() - l1;
            new StringBuilder(88).append("End all media; added: ").append(i1).append(", uploading: ").append(i2).append(", time: ").append(l2).append(" ms");
          }
          if (i2 > 0) {
            localContentResolver.notifyChange(hbu.a(this.c), null);
          }
          return i1;
        }
        l3 = l4;
        i2 = i4;
        i3 = i1;
        break label195;
      }
      long l3 = -1L;
      i3 = i1;
      break label195;
    }
  }
  
  public final void b(String paramString)
  {
    synchronized (this.n)
    {
      if (!this.k.add(paramString)) {
        return;
      }
      this.c.getContentResolver().notifyChange(hbu.b(this.c), null);
      this.l.post(new hbq(this, paramString));
      return;
    }
  }
  
  public final boolean c()
  {
    return PreferenceManager.getDefaultSharedPreferences(this.c).getBoolean("exclusion_scanner.has_run", false);
  }
  
  public final boolean c(String paramString)
  {
    for (;;)
    {
      synchronized (this.n)
      {
        if (!this.k.contains(paramString))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final Set<String> d()
  {
    return new HashSet(this.k);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MediaTracker:");
    Iterator localIterator = this.i.keySet().iterator();
    while (localIterator.hasNext())
    {
      hbr localhbr = (hbr)localIterator.next();
      localStringBuilder.append(';').append(localhbr).append(',').append(this.i.get(localhbr));
    }
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbo
 * JD-Core Version:    0.7.0.1
 */