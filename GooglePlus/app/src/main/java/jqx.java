import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class jqx
{
  public static final Uri a = Uri.parse("content://EsPhotoData/comment");
  public static final Uri b = Uri.parse("content://EsPhotoData/shared_collection");
  private static final Uri c = Uri.parse("content://EsPhotoData/all_remote_photos");
  private static final String[] d = { "_id" };
  private static final String[] e = { "local_file_path", "local_content_uri", "signature" };
  private static final String[] f = { "_id", "user_actions", "media_attr", "photo_id", "data", "image_url", "timestamp", "has_edit_list" };
  private static final String[] g = { "photo_id" };
  private static final String[] h = { "_id" };
  private static final String[] i = { "is_primary", "fingerprint" };
  private static final String[] j = { "photo_id", "local_content_uri" };
  private static final mcq k = new mcq("dogfood");
  
  private static int a(SQLiteDatabase paramSQLiteDatabase, String paramString, oix[] paramArrayOfoix, List<Uri> paramList, Set<ojv> paramSet, boolean paramBoolean)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Cursor localCursor = paramSQLiteDatabase.query("photo_comments", new String[] { "comment_id", "update_time", "plusone_timestamp" }, "tile_id = ?", new String[] { paramString }, null, null, null);
    try
    {
      while (localCursor.moveToNext())
      {
        localHashMap1.put(localCursor.getString(0), Long.valueOf(localCursor.getLong(1)));
        localHashMap2.put(localCursor.getString(0), Long.valueOf(localCursor.getLong(2)));
      }
      localContentValues = new ContentValues();
    }
    finally
    {
      localCursor.close();
    }
    ContentValues localContentValues;
    int n;
    int m;
    oix localoix;
    long l1;
    label242:
    long l2;
    label429:
    String str2;
    if (paramArrayOfoix != null)
    {
      n = 0;
      m = 0;
      if (n >= paramArrayOfoix.length) {
        break label598;
      }
      localoix = paramArrayOfoix[n];
      localContentValues.clear();
      localContentValues.put("tile_id", paramString);
      localContentValues.put("comment_id", localoix.a);
      localContentValues.put("author_id", localoix.f.b);
      localContentValues.put("content", localoix.b);
      if (localoix.d != null)
      {
        l1 = localoix.d.longValue();
        localContentValues.put("view_order", Long.valueOf(l1));
        if (localoix.e != null) {
          l1 = localoix.e.longValue();
        }
        localContentValues.put("update_time", Long.valueOf(l1));
        if (!paramBoolean)
        {
          long l3 = 0L;
          oks localoks = localoix.g;
          boolean bool = false;
          int i2 = 0;
          if (localoks != null)
          {
            i2 = localoix.g.e.intValue();
            bool = localoix.g.c.booleanValue();
            l3 = Math.round(efj.a(localoix.g.b));
          }
          localContentValues.put("plusone_count", Integer.valueOf(i2));
          localContentValues.put("plusone_by_viewer", Boolean.valueOf(bool));
          localContentValues.put("plusone_timestamp", Long.valueOf(l3));
        }
        Long localLong1 = (Long)localHashMap1.remove(localoix.a);
        Long localLong2 = (Long)localHashMap2.remove(localoix.a);
        if (localoix.g != null) {
          break label548;
        }
        l2 = 0L;
        Long localLong3 = Long.valueOf(l2);
        if ((localLong1 != null) && (localLong1.equals(localoix.e)) && (localLong2.equals(localLong3))) {
          break label766;
        }
        paramSet.add(localoix.f);
        str2 = localoix.a;
        if (c(paramSQLiteDatabase, str2) != -1L) {
          break label567;
        }
        paramSQLiteDatabase.insertWithOnConflict("photo_comments", null, localContentValues, 4);
      }
    }
    label508:
    label766:
    for (int i1 = m + 1;; i1 = m)
    {
      n++;
      m = i1;
      break;
      l1 = (1000.0D * Double.valueOf(Double.parseDouble(localoix.c)).doubleValue());
      break label242;
      l2 = Math.round(efj.a(localoix.g.b));
      break label429;
      paramSQLiteDatabase.update("photo_comments", localContentValues, "tile_id = ? AND comment_id = ?", new String[] { paramString, str2 });
      break label508;
      m = 0;
      if (!localHashMap1.isEmpty())
      {
        ArrayList localArrayList = new ArrayList(localHashMap1.size());
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("comment_id IN(");
        Iterator localIterator = localHashMap1.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          localStringBuilder.append("?,");
          localArrayList.add(str1);
        }
        localStringBuilder.setLength(-1 + localStringBuilder.length());
        localStringBuilder.append(')');
        paramSQLiteDatabase.delete("photo_comments", localStringBuilder.toString(), (String[])localArrayList.toArray(new String[0]));
      }
      if ((m > 0) || (!localHashMap1.isEmpty())) {
        paramList.add(Uri.withAppendedPath(a, paramString));
      }
      return m;
    }
  }
  
  public static int a(ojf paramojf, ipm paramipm, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int m;
    if ((ipm.b.equals(paramipm)) || (ipm.c.equals(paramipm)) || (paramBoolean1)) {
      if (efj.a(Integer.valueOf(paramojf.I)) == 8) {
        if (efj.a(Integer.valueOf(paramojf.l.b)) == 3) {
          m = 10;
        }
      }
    }
    label225:
    boolean bool2;
    label281:
    do
    {
      do
      {
        int n;
        do
        {
          boolean bool1;
          do
          {
            ojx localojx;
            do
            {
              return m;
              if (efj.a(Integer.valueOf(paramojf.l.b)) == 1) {
                return 21;
              }
              return 20;
              localojx = paramojf.l;
              m = 0;
            } while (localojx == null);
            if (efj.a(Integer.valueOf(paramojf.l.b)) != 3) {
              break;
            }
            bool1 = efj.b(paramojf.G);
            m = 0;
          } while (!bool1);
          return 14;
          n = efj.a(Integer.valueOf(paramojf.l.b));
          m = 0;
        } while (n == 1);
        if (efj.b(paramojf.G)) {
          return 16;
        }
        if (efj.a(Integer.valueOf(paramojf.l.f)) == 4) {
          return 17;
        }
        return 18;
        if (!paramBoolean2) {
          break;
        }
        m = 0;
      } while (!paramBoolean3);
      return 1;
      int[] arrayOfInt = paramojf.H;
      if (arrayOfInt != null)
      {
        int i2 = 0;
        if (i2 < arrayOfInt.length) {
          if ((arrayOfInt[i2] != 2) && (arrayOfInt[i2] != 3)) {}
        }
        for (int i3 = 1;; i3 = 0)
        {
          if (i3 == 0) {
            break label281;
          }
          m = 0;
          if (!paramBoolean3) {
            break;
          }
          return 1;
          i2++;
          break label225;
        }
      }
      int i1 = paramojf.I;
      if (i1 != -2147483648) {}
      switch (i1)
      {
      case 11: 
      case 14: 
      case 16: 
      case 18: 
      default: 
        bool2 = efj.b(paramojf.G);
        m = 0;
      }
    } while (!bool2);
    return 2;
    return 3;
    return 4;
    return 6;
    return 5;
    return 7;
    return 8;
    return 9;
    return 10;
    return 11;
    return 12;
    return 13;
    return 15;
    return 19;
    return 22;
    return 23;
  }
  
  public static long a(Context paramContext, int paramInt)
  {
    return DatabaseUtils.longForQuery(((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getReadableDatabase(), "SELECT COUNT(*) FROM all_photos WHERE is_primary = 1", null);
  }
  
  private static long a(Context paramContext, String paramString)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    ((jqs)mbb.a(paramContext, jqs.class));
    long l = 278528L;
    if (mfq.c(Uri.parse(paramString))) {
      l = 278560L;
    }
    TextUtils.isEmpty(mfq.a(localContentResolver, Uri.parse(paramString)));
    return l;
  }
  
  public static Uri a(int paramInt)
  {
    return c.buildUpon().appendEncodedPath(Integer.toString(paramInt)).build();
  }
  
  private static Long a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    String[] arrayOfString = h;
    String str = String.valueOf("photo_id");
    Cursor localCursor = paramSQLiteDatabase.query("all_photos", arrayOfString, 17 + String.valueOf(paramString1).length() + String.valueOf(str).length() + paramString1 + " = ? AND " + str + " IS NULL", new String[] { paramString2 }, null, null, null, "1");
    try
    {
      boolean bool = localCursor.moveToFirst();
      Object localObject2 = null;
      if (bool)
      {
        Long localLong = Long.valueOf(localCursor.getLong(0));
        localObject2 = localLong;
      }
      return localObject2;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static String a(Context paramContext, String paramString, int paramInt)
  {
    Cursor localCursor = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getReadableDatabase().query("all_photos", jqy.a, "image_url = ? AND local_content_uri NOT NULL", new String[] { paramString }, null, null, null);
    try
    {
      if (localCursor.moveToFirst())
      {
        String str = localCursor.getString(0);
        return str;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private static String a(SQLiteDatabase paramSQLiteDatabase, long paramLong)
  {
    String[] arrayOfString1 = jra.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(paramLong);
    Cursor localCursor = paramSQLiteDatabase.query("all_photos", arrayOfString1, "_id = ?", arrayOfString2, null, null, null);
    try
    {
      if (localCursor.moveToFirst())
      {
        String str = localCursor.getString(0);
        return str;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static String a(ojf paramojf)
  {
    String str = paramojf.D;
    if (TextUtils.isEmpty(str)) {
      str = paramojf.C;
    }
    if (TextUtils.isEmpty(str)) {
      str = null;
    }
    return str;
  }
  
  public static List<Long> a(Context paramContext, int paramInt, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getReadableDatabase();
    localArrayList = new ArrayList();
    String str = a(localSQLiteDatabase, paramLong);
    if (TextUtils.isEmpty(str)) {
      return localArrayList;
    }
    Cursor localCursor = localSQLiteDatabase.query("all_photos", jqz.a, "photo_id IS NOT NULL AND fingerprint = ?", new String[] { str }, null, null, null);
    try
    {
      if (localCursor.moveToNext()) {
        localArrayList.add(Long.valueOf(localCursor.getLong(0)));
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static jqu a(Context paramContext, int paramInt, ArrayList<String> paramArrayList, ArrayList<Long> paramArrayList1)
  {
    int m = 1;
    int n = 0;
    jqu localjqu = new jqu();
    localjqu.a = 2;
    if ((paramArrayList.isEmpty()) && (paramArrayList1.isEmpty())) {
      return localjqu;
    }
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getReadableDatabase();
    String[] arrayOfString = a(localSQLiteDatabase);
    StringBuilder localStringBuilder = new StringBuilder();
    int i1;
    if (!paramArrayList.isEmpty())
    {
      i1 = m;
      if (paramArrayList1.isEmpty()) {
        break label244;
      }
    }
    for (;;)
    {
      if (i1 != 0) {
        a(localStringBuilder, "fingerprint", paramArrayList);
      }
      if ((i1 != 0) && (m != 0)) {
        localStringBuilder.append(" OR ");
      }
      if (m != 0) {
        a(localStringBuilder, "photo_id", paramArrayList1);
      }
      Cursor localCursor = localSQLiteDatabase.query("all_photos", arrayOfString, localStringBuilder.toString(), null, null, null, null);
      try
      {
        ContentValues[] arrayOfContentValues = new ContentValues[localCursor.getCount()];
        while (localCursor.moveToNext())
        {
          ContentValues localContentValues = new ContentValues();
          DatabaseUtils.cursorRowToContentValues(localCursor, localContentValues);
          arrayOfContentValues[n] = localContentValues;
          n++;
        }
        localjqu.b = arrayOfContentValues;
        return localjqu;
      }
      finally
      {
        localCursor.close();
      }
      i1 = 0;
      break;
      label244:
      m = 0;
    }
  }
  
  private static jrb a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase, okn[] paramArrayOfokn, pre[] paramArrayOfpre, ojv paramojv)
  {
    if (Log.isLoggable("EsPhotoData", 3))
    {
      int i18 = paramArrayOfokn.length;
      int i19 = paramArrayOfpre.length;
      new StringBuilder(99).append("insertUpdateDeleteRemotePhotosInTransaction tiles to insert=").append(i18).append(" tiles to delete=").append(i19);
    }
    ContentValues localContentValues = new ContentValues();
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = paramArrayOfokn.length;
    int i4 = 0;
    okn localokn;
    int i11;
    int i15;
    int i12;
    int i14;
    if (i4 < i3)
    {
      localokn = paramArrayOfokn[i4];
      if (localokn.b(okm.a) == null)
      {
        if (!Log.isLoggable("EsPhotoData", 3)) {
          break label925;
        }
        i11 = i2;
        i15 = i1;
        i12 = n;
        i14 = m;
      }
    }
    for (;;)
    {
      i4++;
      m = i14;
      i1 = i15;
      n = i12;
      i2 = i11;
      break;
      okm localokm = (okm)localokn.b(okm.a);
      ojf localojf = localokm.b;
      String str2 = a(localojf);
      if (TextUtils.isEmpty(str2))
      {
        if (Log.isLoggable("EsPhotoData", 3))
        {
          String str6 = String.valueOf(localojf.d);
          if (str6.length() == 0) {
            break label244;
          }
          "skipping remote photo with empty or null sha, id=".concat(str6);
        }
        for (;;)
        {
          i15 = i1 + 1;
          i14 = m;
          i11 = i2;
          i12 = n;
          break;
          label244:
          new String("skipping remote photo with empty or null sha, id=");
        }
      }
      if (efj.b(localojf.E))
      {
        if (Log.isLoggable("EsPhotoData", 5))
        {
          String str4 = String.valueOf("Got deleted photo tile, id: ");
          String str5 = String.valueOf(localojf.d);
          new StringBuilder(15 + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str2).length()).append(str4).append(str5).append(", fingerprint: ").append(str2);
        }
        a(paramContext, paramSQLiteDatabase, localojf.d);
        int i17 = n + 1;
        i15 = i1;
        i14 = m;
        i11 = i2;
        i12 = i17;
      }
      else
      {
        localojf.g = paramojv;
        String str3 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
        localContentValues.clear();
        long l = Math.round(1000.0D * localojf.m.doubleValue());
        localContentValues.put("photo_id", localojf.d);
        localContentValues.put("fingerprint", str2);
        localContentValues.put("timestamp", Long.valueOf(l));
        int i16;
        if (!efj.b(localojf.G))
        {
          oih localoih = localojf.F;
          if ((localoih == null) || (localoih.a == null) || (localoih.a.a == null) || (localoih.a.a.length <= 0)) {
            break label763;
          }
          i16 = 1;
          label535:
          if (i16 == 0) {
            break label769;
          }
        }
        label769:
        for (boolean bool = true;; bool = false)
        {
          localContentValues.put("has_edit_list", Boolean.valueOf(bool));
          localContentValues.put("image_url", iqw.b(localokn.e.a));
          localContentValues.put("media_attr", Long.valueOf(jrf.a(localojf, str3)));
          Long localLong = jrf.a(paramContext, localokm, paramInt);
          if (localLong != null) {
            localContentValues.put("user_actions", localLong);
          }
          if (localojf.a != null) {
            localojf.a.a = iqw.b(localojf.a.a);
          }
          if (localojf.r != null) {
            localojf.r.a = iqw.b(localojf.r.a);
          }
          if (localojf.s != null) {
            localojf.s.a = iqw.b(localojf.s.a);
          }
          localContentValues.put("data", qat.a(localojf));
          a(paramSQLiteDatabase, localContentValues, str2, localojf.d);
          int i10 = m + 1;
          i11 = i2 + 1;
          if (i11 % 10 == 0) {
            paramSQLiteDatabase.yieldIfContendedSafely();
          }
          i12 = n;
          int i13 = i1;
          i14 = i10;
          i15 = i13;
          break;
          label763:
          i16 = 0;
          break label535;
        }
        int i5 = paramArrayOfpre.length;
        int i6 = n;
        int i7 = i2;
        int i8 = 0;
        int i9 = i7;
        if (i8 < i5)
        {
          pre localpre = paramArrayOfpre[i8];
          if (localpre.b != null)
          {
            a(paramContext, paramSQLiteDatabase, localpre.b.b);
            i6++;
            i9++;
            if (i9 % 10 == 0) {
              paramSQLiteDatabase.yieldIfContendedSafely();
            }
          }
          for (;;)
          {
            i8++;
            break;
            if (Log.isLoggable("EsPhotoData", 5))
            {
              String str1 = String.valueOf(efj.a(localpre));
              if (str1.length() != 0) {
                "Missing legacy photo id in tombstone: ".concat(str1);
              } else {
                new String("Missing legacy photo id in tombstone: ");
              }
            }
          }
        }
        return new jrb(m, i6, i1, i9);
        label925:
        i11 = i2;
        i15 = i1;
        i12 = n;
        i14 = m;
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("_id", paramString);
    localSQLiteDatabase.insert("shared_collections", null, localContentValues);
    paramContext.getContentResolver().notifyChange(b.buildUpon().appendEncodedPath(paramString).build(), null);
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    long l = SystemClock.currentThreadTimeMillis();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("local_content_uri", paramString1);
    localContentValues.put("fingerprint", paramString2);
    localSQLiteDatabase.beginTransaction();
    try
    {
      a(paramContext, localSQLiteDatabase, paramString1, paramString2, localContentValues);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      if (Log.isLoggable("EsPhotoData", 2))
      {
        String str1 = String.valueOf("[INSERT FINGERPRINT], duration: ");
        String str2 = String.valueOf(efj.a(SystemClock.currentThreadTimeMillis() - l));
        new StringBuilder(36 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(paramString2).length() + String.valueOf(paramString1).length()).append(str1).append(str2).append(", fingerprint: ").append(paramString2).append(", local content uri: ").append(paramString1);
      }
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    ArrayList localArrayList = new ArrayList();
    long l = SystemClock.currentThreadTimeMillis();
    try
    {
      if (localSQLiteDatabase.delete("photo_comments", "tile_id = ? AND comment_id = ?", new String[] { paramString1, paramString3 }) > 0) {
        jrf.a(paramContext, paramInt, paramString1, paramString2, (int)DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT COUNT(*) FROM photo_comments WHERE tile_id = ?", new String[] { paramString1 }), localArrayList);
      }
      if (Log.isLoggable("EsPhotoData", 4))
      {
        String str3 = String.valueOf("[DELETE_PHOTO_COMMENT], tile: ");
        String str4 = String.valueOf(efj.a(SystemClock.currentThreadTimeMillis() - l));
        new StringBuilder(25 + String.valueOf(str3).length() + String.valueOf(paramString1).length() + String.valueOf(paramString3).length() + String.valueOf(str4).length()).append(str3).append(paramString1).append(", commentId: ").append(paramString3).append(", duration: ").append(str4);
      }
      ContentResolver localContentResolver = paramContext.getContentResolver();
      Iterator localIterator;
      String str1;
      String str2;
      return;
    }
    finally
    {
      if (Log.isLoggable("EsPhotoData", 4))
      {
        str1 = String.valueOf("[DELETE_PHOTO_COMMENT], tile: ");
        str2 = String.valueOf(efj.a(SystemClock.currentThreadTimeMillis() - l));
        new StringBuilder(25 + String.valueOf(str1).length() + String.valueOf(paramString1).length() + String.valueOf(paramString3).length() + String.valueOf(str2).length()).append(str1).append(paramString1).append(", commentId: ").append(paramString3).append(", duration: ").append(str2);
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    long l = SystemClock.currentThreadTimeMillis();
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("flagged", Boolean.valueOf(paramBoolean));
      localSQLiteDatabase.update("photo_comments", localContentValues, "tile_id = ? AND comment_id = ?", new String[] { paramString1, paramString2 });
      if (Log.isLoggable("EsPhotoData", 4))
      {
        String str3 = String.valueOf("[UPDATE_PHOTO_COMMENT_FLAGGED], tile: ");
        String str4 = String.valueOf(efj.a(SystemClock.currentThreadTimeMillis() - l));
        new StringBuilder(25 + String.valueOf(str3).length() + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + String.valueOf(str4).length()).append(str3).append(paramString1).append(", commentId: ").append(paramString2).append(", duration: ").append(str4);
      }
      paramContext.getContentResolver().notifyChange(a.buildUpon().appendEncodedPath(paramString1).build(), null);
      return;
    }
    finally
    {
      if (Log.isLoggable("EsPhotoData", 4))
      {
        String str1 = String.valueOf("[UPDATE_PHOTO_COMMENT_FLAGGED], tile: ");
        String str2 = String.valueOf(efj.a(SystemClock.currentThreadTimeMillis() - l));
        new StringBuilder(25 + String.valueOf(str1).length() + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + String.valueOf(str2).length()).append(str1).append(paramString1).append(", commentId: ").append(paramString2).append(", duration: ").append(str2);
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2, oix[] paramArrayOfoix, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    long l = SystemClock.currentThreadTimeMillis();
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    localSQLiteDatabase.beginTransaction();
    ContentResolver localContentResolver;
    label432:
    for (;;)
    {
      try
      {
        int n = a(localSQLiteDatabase, paramString1, paramArrayOfoix, localArrayList, localHashSet, paramBoolean);
        jii.a(localSQLiteDatabase, new ArrayList(localHashSet));
        if (n > 0)
        {
          if (paramArrayOfoix == null)
          {
            i2 = 0;
            jrf.a(paramContext, paramInt, paramString1, paramString2, i2, localArrayList);
          }
        }
        else
        {
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          if (Log.isLoggable("EsPhotoData", 4))
          {
            String str3 = String.valueOf("[INSERT_PHOTO_COMMENTS], tile: ");
            if (paramArrayOfoix == null) {
              continue;
            }
            i1 = paramArrayOfoix.length;
            String str4 = String.valueOf(efj.a(SystemClock.currentThreadTimeMillis() - l));
            new StringBuilder(47 + String.valueOf(str3).length() + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + String.valueOf(str4).length()).append(str3).append(paramString1).append(", view: ").append(paramString2).append(", num comments: ").append(i1).append(", duration: ").append(str4);
          }
          localContentResolver = paramContext.getContentResolver();
          Iterator localIterator = localArrayList.iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          localContentResolver.notifyChange((Uri)localIterator.next(), null);
          continue;
        }
        int i2 = paramArrayOfoix.length;
        continue;
        int i1 = 0;
        continue;
        String str1;
        String str2;
        int m = 0;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
        if (Log.isLoggable("EsPhotoData", 4))
        {
          str1 = String.valueOf("[INSERT_PHOTO_COMMENTS], tile: ");
          if (paramArrayOfoix == null) {
            break label432;
          }
          m = paramArrayOfoix.length;
          str2 = String.valueOf(efj.a(SystemClock.currentThreadTimeMillis() - l));
          new StringBuilder(47 + String.valueOf(str1).length() + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + String.valueOf(str2).length()).append(str1).append(paramString1).append(", view: ").append(paramString2).append(", num comments: ").append(m).append(", duration: ").append(str2);
        }
      }
    }
    localContentResolver.notifyChange(a.buildUpon().appendEncodedPath(paramString1).build(), null);
  }
  
  public static void a(Context paramContext, int paramInt, String paramString, oix paramoix)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    long l = SystemClock.currentThreadTimeMillis();
    try
    {
      ContentValues localContentValues = new ContentValues();
      if (paramoix.a != null) {
        localContentValues.put("comment_id", paramoix.a);
      }
      if ((paramoix.f != null) && (paramoix.f.b != null)) {
        localContentValues.put("author_id", paramoix.f.b);
      }
      if (paramoix.b != null) {
        localContentValues.put("content", paramoix.b);
      }
      if (paramoix.d != null) {
        localContentValues.put("view_order", paramoix.d);
      }
      if (paramoix.e != null) {
        localContentValues.put("update_time", paramoix.e);
      }
      if (paramoix.g != null)
      {
        int m = paramoix.g.e.intValue();
        boolean bool = paramoix.g.c.booleanValue();
        localContentValues.put("plusone_count", Integer.valueOf(m));
        localContentValues.put("plusone_by_viewer", Boolean.valueOf(bool));
      }
      String[] arrayOfString = new String[2];
      arrayOfString[0] = paramString;
      arrayOfString[1] = paramoix.a;
      localSQLiteDatabase.update("photo_comments", localContentValues, "tile_id = ? AND comment_id = ?", arrayOfString);
      if (Log.isLoggable("EsPhotoData", 4))
      {
        String str4 = String.valueOf("[UPDATE_PHOTO_COMMENT], tile: ");
        String str5 = String.valueOf(paramoix.a);
        String str6 = String.valueOf(efj.a(SystemClock.currentThreadTimeMillis() - l));
        new StringBuilder(25 + String.valueOf(str4).length() + String.valueOf(paramString).length() + String.valueOf(str5).length() + String.valueOf(str6).length()).append(str4).append(paramString).append(", commentId: ").append(str5).append(", duration: ").append(str6);
      }
      paramContext.getContentResolver().notifyChange(a.buildUpon().appendEncodedPath(paramString).build(), null);
      return;
    }
    finally
    {
      if (Log.isLoggable("EsPhotoData", 4))
      {
        String str1 = String.valueOf("[UPDATE_PHOTO_COMMENT], tile: ");
        String str2 = String.valueOf(paramoix.a);
        String str3 = String.valueOf(efj.a(SystemClock.currentThreadTimeMillis() - l));
        new StringBuilder(25 + String.valueOf(str1).length() + String.valueOf(paramString).length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str1).append(paramString).append(", commentId: ").append(str2).append(", duration: ").append(str3);
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt, ArrayList<Long> paramArrayList, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    if ((paramArrayList != null) && (paramInt != -1))
    {
      pre[] arrayOfpre = new pre[paramArrayList.size()];
      for (int m = -1 + paramArrayList.size(); m >= 0; m--)
      {
        pre localpre = new pre();
        localpre.b = new prf();
        localpre.b.b = String.valueOf(paramArrayList.get(m));
        arrayOfpre[m] = localpre;
      }
      String str = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
      ojv localojv = new ojv();
      localojv.b = str;
      a(paramContext, paramInt, new okn[0], arrayOfpre, localojv, false);
      SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
      StringBuilder localStringBuilder = new StringBuilder();
      a(localStringBuilder, "fingerprint", paramArrayList1);
      localSQLiteDatabase.delete("all_photos", localStringBuilder.toString(), null);
      Iterator localIterator = paramArrayList2.iterator();
      while (localIterator.hasNext()) {
        a(localSQLiteDatabase, (String)localIterator.next());
      }
      paramContext.getContentResolver().notifyChange(a(paramInt), null);
    }
  }
  
  public static void a(Context paramContext, int paramInt, jqu[] paramArrayOfjqu)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    int m = 0;
    int n = 0;
    int i1 = 0;
    for (;;)
    {
      int i3;
      try
      {
        if (m < paramArrayOfjqu.length)
        {
          jqu localjqu = paramArrayOfjqu[m];
          if (localjqu.a != 2) {
            break label381;
          }
          if (localjqu.b == null) {
            break label363;
          }
          i2 = 1;
          if (i2 == 0) {
            break label381;
          }
          ContentValues[] arrayOfContentValues = localjqu.b;
          HashSet localHashSet = new HashSet();
          i3 = 0;
          if (i3 >= arrayOfContentValues.length) {
            break label369;
          }
          ContentValues localContentValues2 = arrayOfContentValues[i3];
          String str4 = localContentValues2.getAsString("local_content_uri");
          String str5 = localContentValues2.getAsString("fingerprint");
          if ((!TextUtils.isEmpty(str4)) && (!TextUtils.isEmpty(str5)))
          {
            localHashSet.add(str5);
            break label357;
            if (i4 >= arrayOfContentValues.length) {
              break label381;
            }
            ContentValues localContentValues1 = arrayOfContentValues[i4];
            String str2 = localContentValues1.getAsString("photo_id");
            String str3 = localContentValues1.getAsString("fingerprint");
            if ((!TextUtils.isEmpty(str2)) && (!TextUtils.isEmpty(str3)) && (!localHashSet.contains(str3)))
            {
              localContentValues1.remove("_id");
              localContentValues1.remove("local_content_uri");
              localContentValues1.remove("local_file_path");
              a(localSQLiteDatabase, localContentValues1, localContentValues1.getAsString("fingerprint"), str2);
              i1++;
              break label375;
            }
            if (TextUtils.isEmpty(str2)) {
              break label375;
            }
            n++;
            break label375;
          }
        }
        else
        {
          localSQLiteDatabase.setTransactionSuccessful();
          if (Log.isLoggable("EsPhotoData", 4))
          {
            String str1 = String.valueOf("[RESTORE_PHOTOS], num remote inserted: ");
            new StringBuilder(44 + String.valueOf(str1).length()).append(str1).append(i1).append(", num remote ignored: ").append(n);
          }
          if (i1 > 0) {
            paramContext.getContentResolver().notifyChange(a(paramInt), null);
          }
          return;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      label357:
      i3++;
      continue;
      label363:
      int i2 = 0;
      continue;
      label369:
      int i4 = 0;
      continue;
      label375:
      i4++;
      continue;
      label381:
      m++;
    }
  }
  
  public static void a(Context paramContext, int paramInt, okn[] paramArrayOfokn, pre[] paramArrayOfpre, ojv paramojv, boolean paramBoolean)
  {
    if ((paramArrayOfokn.length == 0) && (paramArrayOfpre.length == 0)) {}
    label10:
    do
    {
      return;
      if (TextUtils.equals(((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id"), paramojv.b)) {
        break;
      }
    } while (!Log.isLoggable("EsPhotoData", 3));
    String str5 = String.valueOf("Ignoring insertUpdateDelete, null owner or non matching owner and account, owner: ");
    String str6 = String.valueOf(paramojv);
    new StringBuilder(22 + String.valueOf(str5).length() + String.valueOf(str6).length()).append(str5).append(str6).append(", account: ").append(paramInt);
    return;
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    long l = SystemClock.currentThreadTimeMillis();
    localSQLiteDatabase.beginTransaction();
    jrb localjrb1 = new jrb(0, 0, 0, 0);
    jrb localjrb2;
    try
    {
      jrb localjrb3 = a(paramContext, paramInt, localSQLiteDatabase, paramArrayOfokn, paramArrayOfpre, paramojv);
      localjrb2 = localjrb3;
    }
    finally
    {
      try
      {
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        if (Log.isLoggable("EsPhotoData", 4))
        {
          String str3 = String.valueOf("[INSERT_REMOTE_PHOTOS], num tiles: ");
          int i4 = paramArrayOfokn.length;
          int i5 = localjrb2.a;
          int i6 = localjrb2.b;
          int i7 = localjrb2.c;
          int i8 = localjrb2.d;
          String str4 = String.valueOf(efj.a(SystemClock.currentThreadTimeMillis() - l));
          new StringBuilder(144 + String.valueOf(str3).length() + String.valueOf(str4).length()).append(str3).append(i4).append(", num inserted or updated: ").append(i5).append(", num deleted: ").append(i6).append(", num skipped: ").append(i7).append(", total operations: ").append(i8).append(", duration: ").append(str4);
        }
        if (!paramBoolean) {
          break label10;
        }
        paramContext.getContentResolver().notifyChange(a(paramInt), null);
        return;
      }
      finally {}
      localObject1 = finally;
      localjrb2 = localjrb1;
    }
    localSQLiteDatabase.endTransaction();
    if (Log.isLoggable("EsPhotoData", 4))
    {
      String str1 = String.valueOf("[INSERT_REMOTE_PHOTOS], num tiles: ");
      int m = paramArrayOfokn.length;
      int n = localjrb2.a;
      int i1 = localjrb2.b;
      int i2 = localjrb2.c;
      int i3 = localjrb2.d;
      String str2 = String.valueOf(efj.a(SystemClock.currentThreadTimeMillis() - l));
      new StringBuilder(144 + String.valueOf(str1).length() + String.valueOf(str2).length()).append(str1).append(m).append(", num inserted or updated: ").append(n).append(", num deleted: ").append(i1).append(", num skipped: ").append(i2).append(", total operations: ").append(i3).append(", duration: ").append(str2);
    }
    throw localObject1;
  }
  
  private static void a(Context paramContext, ContentValues paramContentValues, SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    paramContentValues.put("media_attr", Long.valueOf(a(paramContext, paramString)));
    paramContentValues.put("user_actions", Long.valueOf(jrf.c.longValue()));
    paramContentValues.put("is_primary", Integer.valueOf(1));
    paramSQLiteDatabase.insert("all_photos", null, paramContentValues);
  }
  
  /* Error */
  private static void a(Context paramContext, SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 458
    //   4: getstatic 78	jqx:i	[Ljava/lang/String;
    //   7: ldc_w 810
    //   10: iconst_1
    //   11: anewarray 40	java/lang/String
    //   14: dup
    //   15: iconst_0
    //   16: aload_2
    //   17: aastore
    //   18: aconst_null
    //   19: aconst_null
    //   20: aconst_null
    //   21: invokevirtual 111	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   24: astore_3
    //   25: aload_3
    //   26: invokeinterface 472 1 0
    //   31: ifeq +570 -> 601
    //   34: aload_3
    //   35: iconst_0
    //   36: invokeinterface 814 2 0
    //   41: iconst_1
    //   42: if_icmpne +195 -> 237
    //   45: iconst_1
    //   46: istore 24
    //   48: aload_3
    //   49: iconst_1
    //   50: invokeinterface 121 2 0
    //   55: astore 25
    //   57: aload 25
    //   59: astore 7
    //   61: iload 24
    //   63: istore 6
    //   65: iconst_1
    //   66: istore 5
    //   68: aload_3
    //   69: invokeinterface 138 1 0
    //   74: iload 5
    //   76: ifeq +473 -> 549
    //   79: iload 6
    //   81: ifeq +388 -> 469
    //   84: aload_1
    //   85: ldc_w 458
    //   88: getstatic 80	jqx:j	[Ljava/lang/String;
    //   91: ldc_w 504
    //   94: iconst_1
    //   95: anewarray 40	java/lang/String
    //   98: dup
    //   99: iconst_0
    //   100: aload 7
    //   102: aastore
    //   103: aconst_null
    //   104: aconst_null
    //   105: ldc_w 816
    //   108: invokevirtual 111	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   111: astore 14
    //   113: aload 14
    //   115: invokeinterface 522 1 0
    //   120: iconst_1
    //   121: if_icmpne +336 -> 457
    //   124: aload 14
    //   126: invokeinterface 472 1 0
    //   131: pop
    //   132: aload 14
    //   134: iconst_1
    //   135: invokeinterface 121 2 0
    //   140: astore 17
    //   142: aload 17
    //   144: invokestatic 435	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   147: ifeq +107 -> 254
    //   150: aload_1
    //   151: aload_2
    //   152: invokestatic 818	jqx:b	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    //   155: ldc_w 532
    //   158: iconst_3
    //   159: invokestatic 538	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   162: ifeq +67 -> 229
    //   165: ldc_w 820
    //   168: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   171: astore 22
    //   173: new 290	java/lang/StringBuilder
    //   176: dup
    //   177: bipush 23
    //   179: aload 22
    //   181: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   184: invokevirtual 459	java/lang/String:length	()I
    //   187: iadd
    //   188: aload_2
    //   189: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   192: invokevirtual 459	java/lang/String:length	()I
    //   195: iadd
    //   196: aload 7
    //   198: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   201: invokevirtual 459	java/lang/String:length	()I
    //   204: iadd
    //   205: invokespecial 460	java/lang/StringBuilder:<init>	(I)V
    //   208: aload 22
    //   210: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: aload_2
    //   214: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: ldc_w 822
    //   220: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: aload 7
    //   225: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: aload 14
    //   231: invokeinterface 138 1 0
    //   236: return
    //   237: iconst_0
    //   238: istore 24
    //   240: goto -192 -> 48
    //   243: astore 4
    //   245: aload_3
    //   246: invokeinterface 138 1 0
    //   251: aload 4
    //   253: athrow
    //   254: new 140	android/content/ContentValues
    //   257: dup
    //   258: invokespecial 141	android/content/ContentValues:<init>	()V
    //   261: astore 18
    //   263: aload 18
    //   265: ldc 58
    //   267: invokevirtual 825	android/content/ContentValues:putNull	(Ljava/lang/String;)V
    //   270: aload 18
    //   272: ldc 62
    //   274: invokevirtual 825	android/content/ContentValues:putNull	(Ljava/lang/String;)V
    //   277: aload 18
    //   279: ldc 60
    //   281: invokevirtual 825	android/content/ContentValues:putNull	(Ljava/lang/String;)V
    //   284: aload 18
    //   286: ldc 56
    //   288: aload_0
    //   289: aload 17
    //   291: invokestatic 806	jqx:a	(Landroid/content/Context;Ljava/lang/String;)J
    //   294: invokestatic 131	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   297: invokevirtual 178	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   300: aload 18
    //   302: ldc 54
    //   304: getstatic 808	jrf:c	Ljava/lang/Long;
    //   307: invokevirtual 173	java/lang/Long:longValue	()J
    //   310: invokestatic 131	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   313: invokevirtual 178	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   316: aload 18
    //   318: ldc 74
    //   320: iconst_1
    //   321: invokestatic 229	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   324: invokevirtual 232	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   327: aload_1
    //   328: ldc_w 458
    //   331: aload 18
    //   333: ldc_w 810
    //   336: iconst_1
    //   337: anewarray 40	java/lang/String
    //   340: dup
    //   341: iconst_0
    //   342: aload_2
    //   343: aastore
    //   344: invokevirtual 277	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   347: pop
    //   348: ldc_w 532
    //   351: iconst_3
    //   352: invokestatic 538	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   355: ifeq -126 -> 229
    //   358: ldc_w 827
    //   361: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   364: astore 20
    //   366: new 290	java/lang/StringBuilder
    //   369: dup
    //   370: bipush 30
    //   372: aload 20
    //   374: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   377: invokevirtual 459	java/lang/String:length	()I
    //   380: iadd
    //   381: aload_2
    //   382: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   385: invokevirtual 459	java/lang/String:length	()I
    //   388: iadd
    //   389: aload 7
    //   391: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   394: invokevirtual 459	java/lang/String:length	()I
    //   397: iadd
    //   398: aload 17
    //   400: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   403: invokevirtual 459	java/lang/String:length	()I
    //   406: iadd
    //   407: invokespecial 460	java/lang/StringBuilder:<init>	(I)V
    //   410: aload 20
    //   412: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: aload_2
    //   416: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: ldc_w 576
    //   422: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: aload 7
    //   427: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: ldc_w 829
    //   433: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: aload 17
    //   438: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: pop
    //   442: goto -213 -> 229
    //   445: astore 15
    //   447: aload 14
    //   449: invokeinterface 138 1 0
    //   454: aload 15
    //   456: athrow
    //   457: aload_1
    //   458: aload_2
    //   459: aload 7
    //   461: aload 14
    //   463: invokestatic 832	jqx:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Landroid/database/Cursor;)V
    //   466: goto -237 -> 229
    //   469: aload_1
    //   470: aload_2
    //   471: invokestatic 818	jqx:b	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    //   474: ldc_w 532
    //   477: iconst_3
    //   478: invokestatic 538	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   481: ifeq -245 -> 236
    //   484: ldc_w 834
    //   487: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   490: astore 12
    //   492: new 290	java/lang/StringBuilder
    //   495: dup
    //   496: bipush 15
    //   498: aload 12
    //   500: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   503: invokevirtual 459	java/lang/String:length	()I
    //   506: iadd
    //   507: aload_2
    //   508: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   511: invokevirtual 459	java/lang/String:length	()I
    //   514: iadd
    //   515: aload 7
    //   517: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   520: invokevirtual 459	java/lang/String:length	()I
    //   523: iadd
    //   524: invokespecial 460	java/lang/StringBuilder:<init>	(I)V
    //   527: aload 12
    //   529: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   532: aload_2
    //   533: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   536: ldc_w 576
    //   539: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   542: aload 7
    //   544: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   547: pop
    //   548: return
    //   549: ldc_w 532
    //   552: iconst_3
    //   553: invokestatic 538	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   556: ifeq -320 -> 236
    //   559: ldc_w 836
    //   562: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   565: astore 8
    //   567: aload_2
    //   568: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   571: astore 9
    //   573: aload 9
    //   575: invokevirtual 459	java/lang/String:length	()I
    //   578: ifeq +12 -> 590
    //   581: aload 8
    //   583: aload 9
    //   585: invokevirtual 568	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   588: pop
    //   589: return
    //   590: new 40	java/lang/String
    //   593: dup
    //   594: aload 8
    //   596: invokespecial 569	java/lang/String:<init>	(Ljava/lang/String;)V
    //   599: pop
    //   600: return
    //   601: iconst_0
    //   602: istore 5
    //   604: iconst_0
    //   605: istore 6
    //   607: aconst_null
    //   608: astore 7
    //   610: goto -542 -> 68
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	613	0	paramContext	Context
    //   0	613	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	613	2	paramString	String
    //   24	222	3	localCursor1	Cursor
    //   243	9	4	localObject1	Object
    //   66	537	5	m	int
    //   63	543	6	n	int
    //   59	550	7	str1	String
    //   565	30	8	str2	String
    //   571	13	9	str3	String
    //   490	38	12	str4	String
    //   111	351	14	localCursor2	Cursor
    //   445	10	15	localObject2	Object
    //   140	297	17	str5	String
    //   261	71	18	localContentValues	ContentValues
    //   364	47	20	str6	String
    //   171	38	22	str7	String
    //   46	193	24	i1	int
    //   55	3	25	str8	String
    // Exception table:
    //   from	to	target	type
    //   25	45	243	finally
    //   48	57	243	finally
    //   113	229	445	finally
    //   254	442	445	finally
    //   457	466	445	finally
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, ContentValues paramContentValues, String paramString1, String paramString2)
  {
    int m;
    String str3;
    if (DatabaseUtils.longForQuery(paramSQLiteDatabase, "SELECT COUNT(*) FROM all_photos WHERE photo_id = ?", new String[] { paramString2 }) > 0L)
    {
      m = 1;
      if (m == 0) {
        break label317;
      }
      if (!b(paramSQLiteDatabase, paramString1, paramString2)) {
        break label176;
      }
      b(paramSQLiteDatabase, paramString2);
      a(paramSQLiteDatabase, paramString1, paramString2, paramContentValues);
      if (Log.isLoggable("EsPhotoData", 3))
      {
        if (!paramContentValues.containsKey("is_primary")) {
          break label168;
        }
        str3 = String.valueOf(paramContentValues.getAsInteger("is_primary"));
        label79:
        String str4 = String.valueOf("[INSERT_REMOTE_PHOTO] Updating remote photo with changed fingerprint photoId: ");
        new StringBuilder(30 + String.valueOf(str4).length() + String.valueOf(paramString2).length() + String.valueOf(paramString1).length() + String.valueOf(str3).length()).append(str4).append(paramString2).append(" new fingerprint: ").append(paramString1).append(" isPrimary: ").append(str3);
      }
    }
    label168:
    label176:
    do
    {
      return;
      m = 0;
      break;
      str3 = "not changing";
      break label79;
      paramSQLiteDatabase.update("all_photos", paramContentValues, "photo_id = ?", new String[] { paramString2 });
    } while (!Log.isLoggable("EsPhotoData", 2));
    if (paramContentValues.containsKey("is_primary")) {}
    for (String str1 = String.valueOf(paramContentValues.getAsInteger("is_primary"));; str1 = "not changing")
    {
      String str2 = String.valueOf("[INSERT_REMOTE_PHOTO] updating remote photo with same id in database, photoId: ");
      new StringBuilder(28 + String.valueOf(str2).length() + String.valueOf(paramString2).length() + String.valueOf(paramString1).length() + String.valueOf(str1).length()).append(str2).append(paramString2).append(", fingerprint: ").append(paramString1).append(", isPrimary: ").append(str1);
      return;
    }
    label317:
    a(paramSQLiteDatabase, paramString1, paramString2, paramContentValues);
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    String[] arrayOfString = { paramString };
    int m = paramSQLiteDatabase.delete("all_photos", "local_content_uri = ? AND photo_id IS NULL", arrayOfString);
    int n = 0;
    if (m == 0)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.putNull("local_content_uri");
      localContentValues.putNull("local_file_path");
      localContentValues.putNull("signature");
      n = paramSQLiteDatabase.update("all_photos", localContentValues, "local_content_uri = ?", arrayOfString);
    }
    if (Log.isLoggable("EsPhotoData", 3))
    {
      String str = String.valueOf("[REMOVE_DELETED_LOCAL_MEDIA], mediaStoreUri: ");
      new StringBuilder(80 + String.valueOf(str).length() + String.valueOf(paramString).length()).append(str).append(paramString).append(", total rows deleted: ").append(m).append(", total rows cleared of local data: ").append(n);
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, ContentValues paramContentValues)
  {
    boolean bool = c(paramSQLiteDatabase, paramString1, paramString2);
    int m;
    Long localLong;
    if (bool)
    {
      m = 1;
      paramContentValues.put("is_primary", Integer.valueOf(m));
      if (!bool) {
        break label206;
      }
      localLong = a(paramSQLiteDatabase, "fingerprint", paramString1);
      label41:
      if (localLong == null) {
        break label212;
      }
      String[] arrayOfString = new String[1];
      arrayOfString[0] = localLong.toString();
      paramSQLiteDatabase.update("all_photos", paramContentValues, "_id = ?", arrayOfString);
      if (Log.isLoggable("EsPhotoData", 2))
      {
        String str6 = String.valueOf("[INSERT_REMOTE_PHOTO] update local only row with primary photo, local only row id: ");
        String str7 = String.valueOf(localLong);
        String str8 = String.valueOf(paramContentValues.getAsInteger("is_primary"));
        new StringBuilder(21 + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(paramString2).length() + String.valueOf(paramString1).length() + String.valueOf(str8).length()).append(str6).append(str7).append(", id: ").append(paramString2).append(", fingerprint: ").append(paramString1).append(str8);
      }
    }
    for (;;)
    {
      return;
      m = 0;
      break;
      label206:
      localLong = null;
      break label41;
      label212:
      Cursor localCursor = paramSQLiteDatabase.query("all_photos", e, "fingerprint = ? AND local_file_path IS NOT NULL AND local_content_uri IS NOT NULL", new String[] { paramString1 }, null, null, null);
      try
      {
        if (localCursor.moveToFirst())
        {
          String str3 = localCursor.getString(1);
          String str4 = localCursor.getString(0);
          String str5 = localCursor.getString(2);
          paramContentValues.put("local_content_uri", str3);
          paramContentValues.put("local_file_path", str4);
          paramContentValues.put("signature", str5);
        }
        localCursor.close();
        paramSQLiteDatabase.insert("all_photos", null, paramContentValues);
        if (!Log.isLoggable("EsPhotoData", 2)) {
          continue;
        }
        String str1 = String.valueOf("[INSERT_REMOTE_PHOTO] insert new photo in database, id: ");
        String str2 = String.valueOf(paramContentValues.getAsInteger("is_primary"));
        new StringBuilder(28 + String.valueOf(str1).length() + String.valueOf(paramString2).length() + String.valueOf(paramString1).length() + String.valueOf(str2).length()).append(str1).append(paramString2).append(", fingerprint: ").append(paramString1).append(", isPrimary: ").append(str2);
        return;
      }
      finally
      {
        localCursor.close();
      }
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, Cursor paramCursor)
  {
    paramCursor.moveToFirst();
    String str1 = paramCursor.getString(0);
    if (!TextUtils.equals(str1, paramString1)) {}
    for (;;)
    {
      TextUtils.isEmpty(str1);
      b(paramSQLiteDatabase, paramString1);
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("is_primary", Boolean.valueOf(true));
      paramSQLiteDatabase.update("all_photos", localContentValues, "photo_id = ?", new String[] { str1 });
      if (Log.isLoggable("EsPhotoData", 3))
      {
        String str2 = String.valueOf("[DELETE_PRIMARY_REMOTE_PHOTO] setting new primary, deleted photo id: ");
        new StringBuilder(39 + String.valueOf(str2).length() + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + String.valueOf(str1).length()).append(str2).append(paramString1).append(", fingerprint: ").append(paramString2).append(", new primary photo id: ").append(str1);
      }
      return;
      if (paramCursor.moveToNext()) {
        break;
      }
      str1 = null;
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString, ArrayList<?> paramArrayList)
  {
    paramStringBuilder.append(paramString).append(" IN (");
    for (int m = -1 + paramArrayList.size(); m >= 0; m--)
    {
      Object localObject = paramArrayList.get(m);
      paramStringBuilder.append('\'').append(localObject).append('\'');
      if (m > 0) {
        paramStringBuilder.append(',');
      }
    }
    paramStringBuilder.append(')');
  }
  
  public static boolean a(Context paramContext, SQLiteDatabase paramSQLiteDatabase, ContentValues paramContentValues, String paramString1, String paramString2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (!TextUtils.isEmpty(paramString2))
    {
      paramContentValues.put("fingerprint", paramString2);
      bool2 = a(paramContext, paramSQLiteDatabase, paramString1, paramString2, paramContentValues);
    }
    for (;;)
    {
      return bool2;
      String[] arrayOfString = new String[bool1];
      arrayOfString[0] = paramString1;
      int m = paramSQLiteDatabase.update("all_photos", paramContentValues, "local_content_uri = ?", arrayOfString);
      if (m == 0) {
        a(paramContext, paramContentValues, paramSQLiteDatabase, paramString1);
      }
      for (bool2 = bool1; Log.isLoggable("EsPhotoData", 2); bool2 = false)
      {
        String str = String.valueOf("[INSERT_LOCAL_MEDIA_ITEM_IN_TRANSACTION], content uri: ");
        if (m == 0) {}
        for (;;)
        {
          new StringBuilder(73 + String.valueOf(str).length() + String.valueOf(paramString1).length() + String.valueOf(paramString2).length()).append(str).append(paramString1).append(", fingerprint: ").append(paramString2).append(", total rows updated: ").append(m).append(", new row inserted: ").append(bool1);
          return bool2;
          bool1 = false;
        }
      }
    }
  }
  
  private static boolean a(Context paramContext, SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, ContentValues paramContentValues)
  {
    boolean bool1;
    if (!mfq.b(Uri.parse(paramString1)))
    {
      if (Log.isLoggable("EsPhotoData", 3))
      {
        String str3 = String.valueOf(paramString1);
        if (str3.length() == 0) {
          break label49;
        }
        "Ignoring non media store uri in insertWithFingerprint uri: ".concat(str3);
      }
      for (;;)
      {
        bool1 = false;
        return bool1;
        label49:
        new String("Ignoring non media store uri in insertWithFingerprint uri: ");
      }
    }
    Long localLong = a(paramSQLiteDatabase, "local_content_uri", paramString1);
    long l3;
    Cursor localCursor;
    if (localLong != null)
    {
      l3 = localLong.longValue();
      localCursor = paramSQLiteDatabase.query("all_photos", f, "photo_id IS NOT NULL AND fingerprint = ? AND is_primary = 1", new String[] { paramString2 }, null, null, null);
    }
    for (;;)
    {
      long l1;
      long l2;
      boolean bool2;
      try
      {
        ContentValues localContentValues = new ContentValues(paramContentValues);
        if (localCursor.moveToFirst())
        {
          long l4 = localCursor.getLong(0);
          if (!localCursor.isNull(1)) {
            localContentValues.put("user_actions", Long.valueOf(localCursor.getLong(1)));
          }
          if (!localCursor.isNull(2)) {
            localContentValues.put("media_attr", Long.valueOf(localCursor.getLong(2)));
          }
          if (!localCursor.isNull(3)) {
            localContentValues.put("photo_id", localCursor.getString(3));
          }
          if (!localCursor.isNull(4)) {
            localContentValues.put("data", localCursor.getBlob(4));
          }
          if (!localCursor.isNull(5)) {
            localContentValues.put("image_url", localCursor.getString(5));
          }
          if (!localCursor.isNull(6)) {
            localContentValues.put("timestamp", Long.valueOf(localCursor.getLong(6)));
          }
          if (!localCursor.isNull(7)) {
            localContentValues.put("has_edit_list", Integer.valueOf(localCursor.getInt(7)));
          }
          String[] arrayOfString2 = new String[1];
          arrayOfString2[0] = Long.toString(l4);
          paramSQLiteDatabase.delete("all_photos", "_id = ?", arrayOfString2);
        }
        String[] arrayOfString1 = new String[1];
        arrayOfString1[0] = Long.toString(l3);
        paramSQLiteDatabase.update("all_photos", localContentValues, "_id = ?", arrayOfString1);
        localCursor.close();
        l1 = DatabaseUtils.longForQuery(paramSQLiteDatabase, "SELECT COUNT(*) FROM all_photos WHERE photo_id IS NOT NULL AND fingerprint = ?", new String[] { paramString2 });
        if (l1 > 0L)
        {
          paramContentValues.remove("media_attr");
          paramContentValues.remove("user_actions");
          paramContentValues.remove("timestamp");
          paramSQLiteDatabase.update("all_photos", paramContentValues, "photo_id IS NOT NULL AND fingerprint = ?", new String[] { paramString2 });
          bool1 = false;
          if (!Log.isLoggable("EsPhotoData", 2)) {
            break;
          }
          String str1 = String.valueOf("[INSERT LOCAL MEDIA ITEM WITH FINGERPRINT], content uri: ");
          if (localLong == null) {
            break label654;
          }
          l2 = 1L + l1;
          if ((l1 != 0L) || (localLong != null)) {
            break label661;
          }
          bool2 = true;
          String str2 = String.valueOf(localLong);
          new StringBuilder(94 + String.valueOf(str1).length() + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + String.valueOf(str2).length()).append(str1).append(paramString1).append(", fingerprint: ").append(paramString2).append(", rows updated: ").append(l2).append(", row inserted?: ").append(bool2).append(", local only row id: ").append(str2);
          return bool1;
        }
      }
      finally
      {
        localCursor.close();
      }
      if (localLong == null)
      {
        bool1 = true;
        a(paramContext, paramContentValues, paramSQLiteDatabase, paramString1);
        continue;
        label654:
        l2 = l1;
        continue;
        label661:
        bool2 = false;
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  private static String[] a(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = paramSQLiteDatabase.query("all_photos", null, null, null, null, null, null);
    try
    {
      String[] arrayOfString = localCursor.getColumnNames();
      return arrayOfString;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  @Deprecated
  static int b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 1: 
      return 2;
    case 5: 
      return 0;
    case 4: 
      return 3;
    }
    return 1;
  }
  
  public static long b(Context paramContext, int paramInt)
  {
    return DatabaseUtils.longForQuery(((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getReadableDatabase(), "SELECT COUNT(*) FROM all_photos WHERE photo_id IS NOT NULL", null);
  }
  
  public static ipm b(ojf paramojf)
  {
    if (efj.b(paramojf.A)) {
      return ipm.c;
    }
    if (paramojf.l != null) {
      return ipm.b;
    }
    if (efj.b(paramojf.L)) {
      return ipm.d;
    }
    return ipm.a;
  }
  
  public static String b(Context paramContext, int paramInt, long paramLong)
  {
    return a(((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getReadableDatabase(), paramLong);
  }
  
  /* Error */
  public static void b(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 387
    //   4: invokestatic 392	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   7: checkcast 387	hrz
    //   10: aload_0
    //   11: iload_1
    //   12: invokevirtual 395	hrz:b	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteOpenHelper;
    //   15: invokevirtual 670	android/database/sqlite/SQLiteOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore 5
    //   20: invokestatic 688	android/os/SystemClock:currentThreadTimeMillis	()J
    //   23: lstore 6
    //   25: aload 5
    //   27: ldc_w 961
    //   30: iconst_2
    //   31: anewarray 40	java/lang/String
    //   34: dup
    //   35: iconst_0
    //   36: aload_2
    //   37: aastore
    //   38: dup
    //   39: iconst_1
    //   40: aload_3
    //   41: aastore
    //   42: invokestatic 409	android/database/DatabaseUtils:longForQuery	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)J
    //   45: l2i
    //   46: istore 12
    //   48: iload 4
    //   50: ifeq +199 -> 249
    //   53: iconst_1
    //   54: istore 13
    //   56: iload 13
    //   58: iload 12
    //   60: iadd
    //   61: istore 14
    //   63: new 140	android/content/ContentValues
    //   66: dup
    //   67: invokespecial 141	android/content/ContentValues:<init>	()V
    //   70: astore 15
    //   72: aload 15
    //   74: ldc 218
    //   76: iload 14
    //   78: invokestatic 221	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   81: invokevirtual 224	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   84: aload 15
    //   86: ldc 226
    //   88: iload 4
    //   90: invokestatic 229	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   93: invokevirtual 232	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   96: aload 5
    //   98: ldc 97
    //   100: aload 15
    //   102: ldc_w 273
    //   105: iconst_2
    //   106: anewarray 40	java/lang/String
    //   109: dup
    //   110: iconst_0
    //   111: aload_2
    //   112: aastore
    //   113: dup
    //   114: iconst_1
    //   115: aload_3
    //   116: aastore
    //   117: invokevirtual 277	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   120: pop
    //   121: ldc_w 532
    //   124: iconst_4
    //   125: invokestatic 538	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   128: ifeq +99 -> 227
    //   131: ldc_w 963
    //   134: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   137: astore 17
    //   139: invokestatic 688	android/os/SystemClock:currentThreadTimeMillis	()J
    //   142: lload 6
    //   144: lsub
    //   145: invokestatic 704	efj:a	(J)Ljava/lang/String;
    //   148: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   151: astore 18
    //   153: new 290	java/lang/StringBuilder
    //   156: dup
    //   157: bipush 25
    //   159: aload 17
    //   161: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   164: invokevirtual 459	java/lang/String:length	()I
    //   167: iadd
    //   168: aload_2
    //   169: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   172: invokevirtual 459	java/lang/String:length	()I
    //   175: iadd
    //   176: aload_3
    //   177: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   180: invokevirtual 459	java/lang/String:length	()I
    //   183: iadd
    //   184: aload 18
    //   186: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   189: invokevirtual 459	java/lang/String:length	()I
    //   192: iadd
    //   193: invokespecial 460	java/lang/StringBuilder:<init>	(I)V
    //   196: aload 17
    //   198: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: aload_2
    //   202: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: ldc_w 716
    //   208: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: aload_3
    //   212: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: ldc_w 718
    //   218: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: aload 18
    //   223: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: pop
    //   227: aload_0
    //   228: invokevirtual 416	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   231: getstatic 30	jqx:a	Landroid/net/Uri;
    //   234: invokevirtual 440	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   237: aload_2
    //   238: invokevirtual 448	android/net/Uri$Builder:appendEncodedPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   241: invokevirtual 452	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   244: aconst_null
    //   245: invokevirtual 682	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   248: return
    //   249: iconst_m1
    //   250: istore 13
    //   252: goto -196 -> 56
    //   255: astore 8
    //   257: ldc_w 532
    //   260: iconst_4
    //   261: invokestatic 538	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   264: ifeq +99 -> 363
    //   267: ldc_w 963
    //   270: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   273: astore 9
    //   275: invokestatic 688	android/os/SystemClock:currentThreadTimeMillis	()J
    //   278: lload 6
    //   280: lsub
    //   281: invokestatic 704	efj:a	(J)Ljava/lang/String;
    //   284: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   287: astore 10
    //   289: new 290	java/lang/StringBuilder
    //   292: dup
    //   293: bipush 25
    //   295: aload 9
    //   297: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   300: invokevirtual 459	java/lang/String:length	()I
    //   303: iadd
    //   304: aload_2
    //   305: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   308: invokevirtual 459	java/lang/String:length	()I
    //   311: iadd
    //   312: aload_3
    //   313: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   316: invokevirtual 459	java/lang/String:length	()I
    //   319: iadd
    //   320: aload 10
    //   322: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   325: invokevirtual 459	java/lang/String:length	()I
    //   328: iadd
    //   329: invokespecial 460	java/lang/StringBuilder:<init>	(I)V
    //   332: aload 9
    //   334: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: aload_2
    //   338: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: ldc_w 716
    //   344: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: aload_3
    //   348: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: ldc_w 718
    //   354: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: aload 10
    //   359: invokevirtual 297	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: pop
    //   363: aload 8
    //   365: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	366	0	paramContext	Context
    //   0	366	1	paramInt	int
    //   0	366	2	paramString1	String
    //   0	366	3	paramString2	String
    //   0	366	4	paramBoolean	boolean
    //   18	79	5	localSQLiteDatabase	SQLiteDatabase
    //   23	256	6	l	long
    //   255	109	8	localObject	Object
    //   273	60	9	str1	String
    //   287	71	10	str2	String
    //   46	15	12	m	int
    //   54	197	13	n	int
    //   61	16	14	i1	int
    //   70	31	15	localContentValues	ContentValues
    //   137	60	17	str3	String
    //   151	71	18	str4	String
    // Exception table:
    //   from	to	target	type
    //   25	48	255	finally
    //   63	121	255	finally
  }
  
  private static void b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    paramSQLiteDatabase.delete("all_photos", "photo_id = ?", new String[] { paramString });
  }
  
  private static boolean b(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    Cursor localCursor = paramSQLiteDatabase.query("all_photos", i, "photo_id = ?", new String[] { paramString2 }, null, null, null);
    try
    {
      if (localCursor.moveToFirst())
      {
        String str = localCursor.getString(1);
        if (localCursor.getInt(0) == 1)
        {
          boolean bool2 = TextUtils.equals(str, paramString1);
          if (bool2) {}
        }
        for (boolean bool1 = true;; bool1 = false) {
          return bool1;
        }
      }
      return true;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  /* Error */
  private static long c(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 97
    //   3: getstatic 44	jqx:d	[Ljava/lang/String;
    //   6: ldc_w 965
    //   9: iconst_1
    //   10: anewarray 40	java/lang/String
    //   13: dup
    //   14: iconst_0
    //   15: aload_1
    //   16: aastore
    //   17: aconst_null
    //   18: aconst_null
    //   19: aconst_null
    //   20: invokevirtual 111	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   23: astore_2
    //   24: aload_2
    //   25: invokeinterface 117 1 0
    //   30: ifeq +25 -> 55
    //   33: aload_2
    //   34: iconst_0
    //   35: invokeinterface 125 2 0
    //   40: lstore 6
    //   42: lload 6
    //   44: lstore 4
    //   46: aload_2
    //   47: invokeinterface 138 1 0
    //   52: lload 4
    //   54: lreturn
    //   55: ldc2_w 249
    //   58: lstore 4
    //   60: goto -14 -> 46
    //   63: astore_3
    //   64: aload_2
    //   65: invokeinterface 138 1 0
    //   70: aload_3
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	72	1	paramString	String
    //   23	42	2	localCursor	Cursor
    //   63	8	3	localObject	Object
    //   44	15	4	l1	long
    //   40	3	6	l2	long
    // Exception table:
    //   from	to	target	type
    //   24	42	63	finally
  }
  
  public static String c(ojf paramojf)
  {
    return paramojf.e;
  }
  
  public static void c(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    localSQLiteDatabase.delete("all_photos", null, null);
    localSQLiteDatabase.delete("all_photos_local_sync", null, null);
  }
  
  private static boolean c(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    Cursor localCursor = paramSQLiteDatabase.query("all_photos", g, "is_primary = 1 AND photo_id IS NOT NULL AND fingerprint = ?", new String[] { paramString1 }, null, null, null);
    boolean bool1;
    try
    {
      if (localCursor.moveToFirst())
      {
        boolean bool2 = paramString2.equals(localCursor.getString(0));
        if (!bool2) {}
      }
      else
      {
        for (bool1 = true;; bool1 = true) {
          return bool1;
        }
      }
    }
    finally
    {
      localCursor.close();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jqx
 * JD-Core Version:    0.7.0.1
 */