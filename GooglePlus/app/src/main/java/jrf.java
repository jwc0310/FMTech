import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class jrf
{
  public static final Uri a = Uri.parse("content://EsTileData/view");
  public static final Uri b = Uri.parse("content://EsTileData/tile");
  public static Long c;
  private static final String[] d = { "_id" };
  private static final String[] e = { "tile_id" };
  private static final String[] f = { "parent_id", "count(distinct photo_id)" };
  private static final String[] g = { "resume_token", "last_refresh_time" };
  private static final int[] h = { 12, 4, 13, 2 };
  private static SparseArray<Long> i;
  private static SparseArray<Long> j;
  
  static
  {
    SparseArray localSparseArray1 = new SparseArray();
    i = localSparseArray1;
    localSparseArray1.put(0, Long.valueOf(1L));
    i.put(1, Long.valueOf(2L));
    i.put(3, Long.valueOf(4L));
    i.put(22, Long.valueOf(8L));
    i.put(4, Long.valueOf(16L));
    i.put(5, Long.valueOf(32L));
    i.put(6, Long.valueOf(64L));
    i.put(7, Long.valueOf(128L));
    i.put(8, Long.valueOf(256L));
    i.put(9, Long.valueOf(512L));
    i.put(10, Long.valueOf(1024L));
    i.put(11, Long.valueOf(2048L));
    i.put(12, Long.valueOf(4096L));
    i.put(13, Long.valueOf(8192L));
    i.put(14, Long.valueOf(16384L));
    i.put(15, Long.valueOf(32768L));
    i.put(16, Long.valueOf(65536L));
    i.put(17, Long.valueOf(131072L));
    i.put(18, Long.valueOf(262144L));
    i.put(19, Long.valueOf(524288L));
    i.put(20, Long.valueOf(1048576L));
    i.put(21, Long.valueOf(2097152L));
    i.put(23, Long.valueOf(4194304L));
    i.put(24, Long.valueOf(8388608L));
    i.put(25, Long.valueOf(16777216L));
    i.put(31, Long.valueOf(137438953472L));
    i.put(30, Long.valueOf(274877906944L));
    i.put(32, Long.valueOf(549755813888L));
    SparseArray localSparseArray2 = new SparseArray();
    j = localSparseArray2;
    localSparseArray2.put(0, Long.valueOf(33554432L));
    j.put(1, Long.valueOf(67108864L));
    j.put(2, Long.valueOf(134217728L));
    j.put(3, Long.valueOf(268435456L));
    j.put(4, Long.valueOf(536870912L));
    j.put(5, Long.valueOf(1073741824L));
    j.put(6, Long.valueOf(2147483648L));
    j.put(11, Long.valueOf(4294967296L));
    j.put(12, Long.valueOf(8589934592L));
    j.put(13, Long.valueOf(17179869184L));
    j.put(9, Long.valueOf(34359738368L));
    j.put(8, Long.valueOf(68719476736L));
    c = Long.valueOf(0L);
    for (int n : h) {
      c = Long.valueOf(c.longValue() | efj.a((Long)j.get(n)));
    }
  }
  
  public static int a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("View ID must not be empty");
    }
    String str = paramString.split(":", 2)[0];
    if ("best".equals(str)) {
      return 0;
    }
    if ("all".equals(str)) {
      return 1;
    }
    if ("search".equals(str)) {
      return 5;
    }
    if ("notification".equals(str)) {
      return 6;
    }
    if ("albums".equals(str)) {
      return 2;
    }
    if ("album".equals(str)) {
      return 3;
    }
    if ("event".equals(str)) {
      return 4;
    }
    if ("trash".equals(str)) {
      return 7;
    }
    if ("story".equals(str)) {
      return 8;
    }
    return -1;
  }
  
  private static int a(oic paramoic)
  {
    if (paramoic == null) {
      return -1;
    }
    switch (paramoic.a)
    {
    default: 
      return -1;
    case 1: 
      if (paramoic.b != null) {
        return 3;
      }
    case 4: 
      return 2;
      return 0;
    case 2: 
      return 4;
    }
    return 1;
  }
  
  private static long a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase, String paramString1, okn[] paramArrayOfokn, long paramLong, List<Uri> paramList, String paramString2, Set<String> paramSet)
  {
    if (paramArrayOfokn != null) {}
    long l;
    for (int k = paramArrayOfokn.length;; k = 0)
    {
      ContentValues localContentValues = new ContentValues();
      int m = 0;
      l = paramLong;
      while (m < k)
      {
        okn localokn = paramArrayOfokn[m];
        efj.a(3, "EsTileData", a(localokn, 0));
        localContentValues.clear();
        a(paramContext, paramInt, localokn, paramString2, localContentValues, paramSet);
        localContentValues.put("view_id", paramString1);
        localContentValues.put("view_order", Long.valueOf(l));
        localContentValues.put("media_attr", Long.valueOf(0x200 | localContentValues.getAsLong("media_attr").longValue()));
        l += 1L;
        if (b(paramSQLiteDatabase, paramString1, localokn.a) == -1L) {
          paramSQLiteDatabase.insert("all_tiles", null, localContentValues);
        }
        if (paramList != null)
        {
          String str = localokn.a;
          paramList.add(b.buildUpon().appendEncodedPath(str).build());
        }
        if (localokn.i != null) {
          l += a(paramContext, paramInt, paramSQLiteDatabase, paramString1, localokn.i, l, paramList, null, paramSet);
        }
        m++;
      }
    }
    return l - paramLong;
  }
  
  public static long a(Set<String> paramSet)
  {
    ;
    int m;
    if (localObject1 != null) {
      m = localObject1.length;
    }
    for (;;)
    {
      ContentValues localContentValues1 = new ContentValues();
      CharSequence localCharSequence;
      int n;
      label30:
      SQLiteDatabase localSQLiteDatabase;
      String str1;
      Object localObject3;
      int i1;
      Object localObject2;
      long l1;
      label44:
      okn localokn;
      label109:
      int k;
      Set localSet;
      if (!TextUtils.isEmpty(localCharSequence))
      {
        n = 1;
        localObject3 = b(localSQLiteDatabase, str1);
        i1 = 0;
        l1 = localObject2;
        if (i1 >= m) {
          break label846;
        }
        localokn = localObject1[i1];
        efj.a(3, "EsTileData", a(localokn, 0));
        localContentValues1.clear();
        localContentValues1.put("view_id", str1);
        localContentValues1.put("view_order", Long.valueOf(l1));
        if (n == 0) {
          break label708;
        }
        localContentValues1.put("parent_id", localCharSequence);
        String str2;
        a(paramSet, k, localokn, str2, localContentValues1, localSet);
      }
      try
      {
        if (2 == localContentValues1.getAsInteger("type").intValue())
        {
          long l6 = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT media_attr FROM all_tiles WHERE view_id = ? AND tile_id = ?  AND media_attr & 512 == 0", new String[] { str1, localContentValues1.getAsString("tile_id") });
          localContentValues1.put("media_attr", Long.valueOf(localContentValues1.getAsLong("media_attr").longValue() | l6 & 0x100000));
        }
        l2 = l1 + 1L;
        int i2;
        label231:
        boolean bool;
        label244:
        List localList1;
        List localList2;
        okm localokm;
        Object localObject5;
        if ((i1 == 0) && (localokn.b(okl.a) != null) && (a(localSQLiteDatabase, str1, Long.valueOf(l2), localokn)))
        {
          i2 = 1;
          if ((n != 0) || (i2 == 0)) {
            break label724;
          }
          bool = true;
          a(localSQLiteDatabase, str1, localokn.a, localContentValues1, false, bool);
          if (localObject3 == null) {
            break label864;
          }
          String str8 = a(localokn);
          if (!((HashSet)localObject3).remove(str8)) {
            break label864;
          }
          localContentValues1.put("media_attr", Long.valueOf(0x200 | localContentValues1.getAsLong("media_attr").longValue()));
          long l5 = b(localSQLiteDatabase, str1, str8);
          if (l5 != -1L)
          {
            localContentValues1.remove("view_order");
            String[] arrayOfString = new String[1];
            arrayOfString[0] = Long.toString(l5);
            localSQLiteDatabase.update("all_tiles", localContentValues1, "_id = ? ", arrayOfString);
          }
          if (localList1 != null) {
            localList1.add(b.buildUpon().appendEncodedPath(str8).build());
          }
          if (!((HashSet)localObject3).isEmpty()) {
            break label864;
          }
          localObject4 = null;
          if (localList1 != null)
          {
            String str7 = localokn.a;
            localList1.add(b.buildUpon().appendEncodedPath(str7).build());
          }
          if (localList2 != null)
          {
            localokm = (okm)localokn.b(okm.a);
            if ((localokm != null) && (localokm.b != null)) {
              break label730;
            }
            localObject5 = null;
          }
        }
        label708:
        label724:
        label730:
        ojf localojf;
        String str5;
        String str6;
        for (;;)
        {
          if (localObject5 != null) {
            localList2.add(localObject5);
          }
          if (localokn.i == null) {
            break label857;
          }
          String str4 = localContentValues1.getAsString("cluster_id");
          l3 = l2 + a(paramSet, k, localSQLiteDatabase, str1, localokn.i, l2, localList1, localList2, null, str4, localSet);
          String str3 = localContentValues1.getAsString("cluster_id");
          if ((localContentValues1.containsKey("cluster_id")) && (!TextUtils.isEmpty(str3)))
          {
            ContentValues localContentValues2 = new ContentValues();
            if (localContentValues1.containsKey("cluster_count")) {
              localContentValues2.put("cluster_count", localContentValues1.getAsInteger("cluster_count"));
            }
            if (localContentValues1.containsKey("title")) {
              localContentValues2.put("title", localContentValues1.getAsString("title"));
            }
            if (localContentValues1.containsKey("acl")) {
              localContentValues2.put("acl", localContentValues1.getAsInteger("acl"));
            }
            if (localContentValues2.size() > 0) {
              localSQLiteDatabase.update("all_tiles", localContentValues2, "cluster_id = ? AND type = ?", new String[] { str3, "2" });
            }
          }
          i1++;
          localObject3 = localObject4;
          l1 = l3;
          break label44;
          m = 0;
          break;
          n = 0;
          break label30;
          localContentValues1.putNull("parent_id");
          break label109;
          i2 = 0;
          break label231;
          bool = false;
          break label244;
          localojf = localokm.b;
          if (localojf == null)
          {
            localObject5 = null;
          }
          else
          {
            str5 = jqx.a(localojf);
            if (TextUtils.isEmpty(str5))
            {
              localObject5 = null;
            }
            else
            {
              str6 = iqw.b(localojf.a.a);
              if (!TextUtils.isEmpty(str6)) {
                break label796;
              }
              localObject5 = null;
            }
          }
        }
        label796:
        if (localojf.d != null) {}
        for (long l4 = Long.parseLong(localojf.d);; l4 = 0L)
        {
          localObject5 = new jrg(l4, str6, localojf.g.b, str5);
          break;
        }
        label846:
        return l1 - localObject2;
      }
      catch (SQLiteDoneException localSQLiteDoneException)
      {
        for (;;)
        {
          long l2;
          continue;
          label857:
          long l3 = l2;
          continue;
          label864:
          Object localObject4 = localObject3;
        }
      }
    }
  }
  
  private static long a(Context paramContext, okn paramokn, int paramInt)
  {
    if (paramokn == null) {
      return 0L;
    }
    okl localokl = (okl)paramokn.b(okl.a);
    if ((localokl != null) && (localokl.d != null) && (localokl.d.a != null)) {}
    for (int[] arrayOfInt = localokl.d.a;; arrayOfInt = null)
    {
      if (arrayOfInt != null)
      {
        int k = -1 + arrayOfInt.length;
        long l = 0L;
        while (k >= 0)
        {
          int m = arrayOfInt[k];
          l |= efj.a((Long)i.get(m));
          k--;
        }
        localLong = Long.valueOf(l);
        if (localLong == null) {
          localLong = a(paramContext, (okm)paramokn.b(okm.a), paramInt);
        }
        if (localLong == null)
        {
          okk localokk = (okk)paramokn.b(okk.a);
          if ((localokk == null) || (localokk.b == null)) {
            break label303;
          }
          oir localoir = localokk.b;
          String str = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
          if ((localoir.e == null) || (!TextUtils.equals(localoir.e.b, str)) || ((localoir.d != 3) && (localoir.d != 7))) {
            break label303;
          }
        }
      }
      label303:
      for (Long localLong = Long.valueOf(2L);; localLong = null)
      {
        if (localLong == null) {
          localLong = Long.valueOf(0L);
        }
        if (("~local".equals(paramokn.a)) && (4 == paramokn.j)) {
          localLong = Long.valueOf(localLong.longValue() | c.longValue());
        }
        return localLong.longValue();
        localLong = null;
        break;
      }
    }
  }
  
  /* Error */
  private static long a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 269
    //   4: getstatic 42	jrf:d	[Ljava/lang/String;
    //   7: ldc_w 481
    //   10: iconst_2
    //   11: anewarray 38	java/lang/String
    //   14: dup
    //   15: iconst_0
    //   16: aload_1
    //   17: aastore
    //   18: dup
    //   19: iconst_1
    //   20: aload_2
    //   21: aastore
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: invokevirtual 485	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_3
    //   29: aload_3
    //   30: invokeinterface 490 1 0
    //   35: ifeq +25 -> 60
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 494 2 0
    //   45: lstore 7
    //   47: lload 7
    //   49: lstore 5
    //   51: aload_3
    //   52: invokeinterface 497 1 0
    //   57: lload 5
    //   59: lreturn
    //   60: ldc2_w 266
    //   63: lstore 5
    //   65: goto -14 -> 51
    //   68: astore 4
    //   70: aload_3
    //   71: invokeinterface 497 1 0
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	79	1	paramString1	String
    //   0	79	2	paramString2	String
    //   28	43	3	localCursor	Cursor
    //   68	9	4	localObject	Object
    //   49	15	5	l1	long
    //   45	3	7	l2	long
    // Exception table:
    //   from	to	target	type
    //   29	47	68	finally
  }
  
  /* Error */
  private static long a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 42	jrf:d	[Ljava/lang/String;
    //   3: astore 4
    //   5: iload_3
    //   6: ifeq +70 -> 76
    //   9: ldc_w 500
    //   12: astore 5
    //   14: aload_0
    //   15: ldc_w 269
    //   18: aload 4
    //   20: aload 5
    //   22: iconst_2
    //   23: anewarray 38	java/lang/String
    //   26: dup
    //   27: iconst_0
    //   28: aload_1
    //   29: aastore
    //   30: dup
    //   31: iconst_1
    //   32: aload_2
    //   33: aastore
    //   34: aconst_null
    //   35: aconst_null
    //   36: aconst_null
    //   37: invokevirtual 485	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   40: astore 6
    //   42: aload 6
    //   44: invokeinterface 490 1 0
    //   49: ifeq +35 -> 84
    //   52: aload 6
    //   54: iconst_0
    //   55: invokeinterface 494 2 0
    //   60: lstore 10
    //   62: lload 10
    //   64: lstore 8
    //   66: aload 6
    //   68: invokeinterface 497 1 0
    //   73: lload 8
    //   75: lreturn
    //   76: ldc_w 502
    //   79: astore 5
    //   81: goto -67 -> 14
    //   84: ldc2_w 266
    //   87: lstore 8
    //   89: goto -23 -> 66
    //   92: astore 7
    //   94: aload 6
    //   96: invokeinterface 497 1 0
    //   101: aload 7
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	104	1	paramString1	String
    //   0	104	2	paramString2	String
    //   0	104	3	paramBoolean	boolean
    //   3	16	4	arrayOfString	String[]
    //   12	68	5	str	String
    //   40	55	6	localCursor	Cursor
    //   92	10	7	localObject	Object
    //   64	24	8	l1	long
    //   60	3	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   42	62	92	finally
  }
  
  private static long a(SQLiteDatabase paramSQLiteDatabase, String paramString, boolean paramBoolean)
  {
    try
    {
      String[] arrayOfString = { paramString };
      if (paramBoolean) {}
      for (String str = "SELECT view_order FROM all_tiles WHERE view_id = ? ORDER BY view_order ASC  LIMIT 1";; str = "SELECT view_order FROM all_tiles WHERE view_id = ? ORDER BY view_order DESC  LIMIT 1") {
        return DatabaseUtils.longForQuery(paramSQLiteDatabase, str, arrayOfString);
      }
      return 1000000L;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
  }
  
  public static long a(ojf paramojf, String paramString)
  {
    String str;
    long l;
    int k;
    if (paramojf.g != null)
    {
      str = paramojf.g.b;
      l = 0L;
      if ((str != null) && (TextUtils.equals(paramString, str))) {
        l = 16384L;
      }
      if (efj.b(paramojf.L)) {
        l |= 0x80;
      }
      if (efj.b(paramojf.A)) {
        l |= 0x40;
      }
      if (efj.b(paramojf.B)) {
        l |= 0x800000;
      }
      if (paramojf.l != null) {
        l |= 0x20;
      }
      if (efj.b(paramojf.J)) {
        l |= 0x100;
      }
      if (paramojf.K == null) {
        break label243;
      }
      k = -1 + paramojf.K.length;
      label126:
      if (k < 0) {
        break label243;
      }
      switch (paramojf.K[k].a)
      {
      }
    }
    for (;;)
    {
      k--;
      break label126;
      str = null;
      break;
      l |= 1L;
      continue;
      l |= 0x2;
      continue;
      l |= 0x4;
      continue;
      l |= 0x8;
      continue;
      l |= 0x10;
      continue;
      l |= 0x400000;
    }
    label243:
    if (efj.b(paramojf.E)) {
      l |= 0x80000;
    }
    return l;
  }
  
  public static ipm a(long paramLong)
  {
    if ((0x40 & paramLong) != 0L) {
      return ipm.c;
    }
    if ((0x20 & paramLong) != 0L) {
      return ipm.b;
    }
    if ((0x80 & paramLong) != 0L) {
      return ipm.d;
    }
    return ipm.a;
  }
  
  public static Long a(Context paramContext, okm paramokm, int paramInt)
  {
    int[] arrayOfInt1;
    int n;
    Object localObject;
    if ((paramokm != null) && (paramokm.b != null))
    {
      ojf localojf = paramokm.b;
      if (localojf.p != null)
      {
        arrayOfInt1 = paramokm.b.p.a;
        String str = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
        if ((localojf.g != null) && (TextUtils.equals(localojf.g.b, str)))
        {
          oir localoir = localojf.k;
          if ((localoir != null) && (localoir.d != 4) && (localoir.d != 1))
          {
            n = 1;
            if (n == 0) {
              break label233;
            }
            if (arrayOfInt1 != null) {
              break label197;
            }
            localObject = new int[] { 13 };
          }
        }
      }
    }
    for (;;)
    {
      label139:
      Long localLong = null;
      if (localObject != null)
      {
        long l = 0L;
        int k = -1 + localObject.length;
        for (;;)
        {
          if (k >= 0)
          {
            int m = localObject[k];
            l |= efj.a((Long)j.get(m));
            k--;
            continue;
            n = 0;
            break;
            label197:
            int[] arrayOfInt2 = Arrays.copyOf(arrayOfInt1, 1 + arrayOfInt1.length);
            arrayOfInt2[arrayOfInt1.length] = 13;
            localObject = arrayOfInt2;
            break label139;
          }
        }
        localLong = Long.valueOf(l);
      }
      return localLong;
      label233:
      localObject = arrayOfInt1;
      continue;
      arrayOfInt1 = null;
      break;
      localObject = null;
    }
  }
  
  private static Long a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    Cursor localCursor = paramSQLiteDatabase.query("all_tiles", new String[] { "cluster_count" }, "cluster_id = ? AND type = ?", new String[] { paramString, "2" }, null, null, "cluster_count DESC LIMIT 1");
    try
    {
      if ((localCursor.moveToFirst()) && (!localCursor.isNull(0)))
      {
        Long localLong = Long.valueOf(localCursor.getLong(0));
        return localLong;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static String a()
  {
    return k(null);
  }
  
  public static String a(int paramInt1, int paramInt2)
  {
    String str = null;
    switch (paramInt2)
    {
    }
    for (;;)
    {
      return a(5, new String[] { str });
      str = "SEARCH_MY_PHOTOS";
      continue;
      str = "SEARCH_MY_CIRCLES";
    }
  }
  
  public static String a(int paramInt, String... paramVarArgs)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException(25 + "Unknown view: " + paramInt);
    case 0: 
      if ((paramVarArgs.length != 1) || (paramVarArgs[0] == null)) {
        throw new IllegalArgumentException("BEST_PHOTOS_VIEW requires one argument");
      }
      String str13 = String.valueOf("best:");
      String str14 = String.valueOf(paramVarArgs[0]);
      if (str14.length() != 0) {
        return str13.concat(str14);
      }
      return new String(str13);
    case 7: 
      return "trash";
    case 1: 
      return "all";
    case 5: 
      if ((paramVarArgs.length != 1) || (paramVarArgs[0] == null)) {
        throw new IllegalArgumentException("SEARCH_PHOTOS_VIEW requires one argument");
      }
      String str11 = String.valueOf("search:");
      String str12 = String.valueOf(paramVarArgs[0]);
      if (str12.length() != 0) {
        return str11.concat(str12);
      }
      return new String(str11);
    case 6: 
      if ((paramVarArgs.length != 1) || (paramVarArgs[0] == null)) {
        throw new IllegalArgumentException("NOTIFICATION_VIEW requires one argument");
      }
      String str9 = String.valueOf("notification:");
      String str10 = String.valueOf(paramVarArgs[0]);
      if (str10.length() != 0) {
        return str9.concat(str10);
      }
      return new String(str9);
    case 2: 
      if ((paramVarArgs.length != 1) || (paramVarArgs[0] == null)) {
        throw new IllegalArgumentException("ALL_ALBUMS_VIEW requires one argument");
      }
      String str7 = String.valueOf("albums:");
      String str8 = String.valueOf(paramVarArgs[0]);
      if (str8.length() != 0) {
        return str7.concat(str8);
      }
      return new String(str7);
    case 3: 
      if ((paramVarArgs.length != 1) || (paramVarArgs[0] == null)) {
        throw new IllegalArgumentException("ALBUM_VIEW requires one argument");
      }
      String str5 = String.valueOf("album:");
      String str6 = String.valueOf(paramVarArgs[0]);
      if (str6.length() != 0) {
        return str5.concat(str6);
      }
      return new String(str5);
    case 4: 
      if ((paramVarArgs.length != 1) || (paramVarArgs[0] == null)) {
        throw new IllegalArgumentException("EVENT_PHOTOS_VIEW requires two arguments");
      }
      String str3 = String.valueOf("event:");
      String str4 = String.valueOf(paramVarArgs[0]);
      if (str4.length() != 0) {
        return str3.concat(str4);
      }
      return new String(str3);
    case 8: 
      if ((paramVarArgs.length != 1) || (paramVarArgs[0] == null)) {
        throw new IllegalArgumentException("STORY_PHOTOS_VIEW requires one argument");
      }
      String str1 = String.valueOf("story:");
      String str2 = String.valueOf(paramVarArgs[0]);
      if (str2.length() != 0) {
        return str1.concat(str2);
      }
      return new String(str1);
    case 9: 
      return "manual_awesome";
    }
    return "story_element_picker";
  }
  
  public static String a(Context paramContext, int paramInt)
  {
    if (paramInt == -1) {
      throw new IllegalArgumentException("BEST_PHOTOS requires a valid account");
    }
    return a(0, new String[] { ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id") });
  }
  
  private static String a(Context paramContext, int paramInt, String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("owner_id = ");
    DatabaseUtils.appendEscapedSQLString(localStringBuilder, ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id"));
    localStringBuilder.append(" AND ");
    a(localStringBuilder, "photo_id", new ArrayList(Arrays.asList(paramArrayOfString)));
    return localStringBuilder.toString();
  }
  
  @Deprecated
  private static String a(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("~post:");
    if (paramString1 != null) {
      localStringBuilder.append(paramString1);
    }
    localStringBuilder.append(':');
    if (paramString2 != null) {
      localStringBuilder.append(paramString2);
    }
    localStringBuilder.append(':');
    if (paramString3 != null) {
      localStringBuilder.append(paramString3);
    }
    return localStringBuilder.toString();
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    String str = "UNKNOWN";
    switch (paramInt)
    {
    }
    for (;;)
    {
      return a(paramString1, paramString2, paramString3, str);
      str = "PLUS_EVENT";
      continue;
      str = "PHOTO_COLLECTION";
      continue;
      str = "ALBUM";
      continue;
      str = "AD_HOC";
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    if (paramString2 != null) {
      localStringBuilder.append(paramString2);
    }
    localStringBuilder.append(':');
    if (paramString3 != null) {
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.append(':');
    if (paramString1 != null) {
      localStringBuilder.append(paramString1);
    }
    localStringBuilder.append(':');
    localStringBuilder.append(paramString4);
    return localStringBuilder.toString();
  }
  
  public static String a(okn paramokn)
  {
    if (paramokn.b(okm.a) != null)
    {
      ojf localojf = ((okm)paramokn.b(okm.a)).b;
      return a(localojf.g.b, null, localojf.d);
    }
    if (paramokn.b(okl.a) != null)
    {
      oif localoif = ((okl)paramokn.b(okl.a)).b;
      return a(localoif.e, localoif.b, null);
    }
    if (paramokn.b(okk.a) != null)
    {
      oir localoir = ((okk)paramokn.b(okk.a)).b;
      return a(localoir.e.b, localoir.c, null);
    }
    if ((paramokn.a != null) && (paramokn.a.startsWith("~"))) {
      return paramokn.a;
    }
    throw new IllegalArgumentException("Tile must be a known type");
  }
  
  private static String a(okn paramokn, int paramInt)
  {
    int k = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramInt > 0) {
      for (int n = 0; n < paramInt; n++) {
        localStringBuilder.append(' ');
      }
    }
    String str = localStringBuilder.toString();
    localStringBuilder.setLength(0);
    localStringBuilder.append(str).append("TILE [id: ").append(paramokn.a).append(", type: ").append(paramokn.j).append(", colour: ").append(paramokn.f);
    if (paramokn.b != null) {
      localStringBuilder.append('\n').append(str).append("      title: ").append(paramokn.b);
    }
    if (paramokn.i != null)
    {
      okn[] arrayOfokn = paramokn.i;
      int m = arrayOfokn.length;
      while (k < m)
      {
        okn localokn = arrayOfokn[k];
        localStringBuilder.append('\n').append(a(localokn, paramInt + 2));
        k++;
      }
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public static List<ipn> a(Context paramContext, int paramInt, List<String> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return new ArrayList(0);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("tile_id IN (");
    int k = paramList.size();
    for (int m = 0; m < k; m++)
    {
      String str = (String)paramList.get(m);
      if (!TextUtils.isEmpty(str))
      {
        DatabaseUtils.appendEscapedSQLString(localStringBuilder, str);
        if (m < k - 1) {
          localStringBuilder.append(',');
        }
      }
    }
    localStringBuilder.append(')');
    Cursor localCursor = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase().query(true, "all_tiles", new String[] { "owner_id", "photo_id" }, localStringBuilder.toString(), null, null, null, null, null);
    localArrayList = new ArrayList(paramList.size());
    try
    {
      if (localCursor.moveToNext()) {
        localArrayList.add(new ipn(localCursor.getString(0), localCursor.getLong(1)));
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static jqu a(Context paramContext, int paramInt, ArrayList<Long> paramArrayList)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getReadableDatabase();
    String[] arrayOfString = new String[paramArrayList.size()];
    ArrayList localArrayList = new ArrayList();
    for (int k = 0; k < arrayOfString.length; k++) {
      arrayOfString[k] = String.valueOf(paramArrayList.get(k));
    }
    Cursor localCursor1 = localSQLiteDatabase.query("all_tiles", a(localSQLiteDatabase), a(paramContext, paramInt, arrayOfString), null, null, null, null, null);
    HashSet localHashSet = new HashSet();
    try
    {
      while (localCursor1.moveToNext())
      {
        ContentValues localContentValues1 = new ContentValues();
        DatabaseUtils.cursorRowToContentValues(localCursor1, localContentValues1);
        localContentValues1.remove("_id");
        String str = localContentValues1.getAsString("parent_id");
        if (!TextUtils.isEmpty(str)) {
          localHashSet.add(str);
        }
        localArrayList.add(localContentValues1);
      }
    }
    finally
    {
      localCursor1.close();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("type = ").append(2);
    localStringBuilder.append(" AND ");
    a(localStringBuilder, "cluster_id", new ArrayList(localHashSet));
    Cursor localCursor2 = localSQLiteDatabase.query("all_tiles", a(localSQLiteDatabase), localStringBuilder.toString(), null, null, null, null, null);
    try
    {
      while (localCursor2.moveToNext())
      {
        ContentValues localContentValues2 = new ContentValues();
        DatabaseUtils.cursorRowToContentValues(localCursor2, localContentValues2);
        localContentValues2.remove("_id");
        localArrayList.add(localContentValues2);
      }
      localjqu = new jqu();
    }
    finally
    {
      localCursor2.close();
    }
    jqu localjqu;
    localjqu.a = 1;
    localjqu.b = ((ContentValues[])localArrayList.toArray(new ContentValues[localArrayList.size()]));
    return localjqu;
  }
  
  public static npe a(String paramString1, String paramString2)
  {
    npe localnpe = new npe();
    String str1 = e(paramString1);
    if (!TextUtils.isEmpty(str1)) {
      localnpe.a = str1;
    }
    String str2 = c(paramString1);
    if (!TextUtils.isEmpty(str2)) {
      localnpe.c = str2;
    }
    String str3 = d(paramString1);
    if (!TextUtils.isEmpty(str3)) {
      localnpe.b = str3;
    }
    String str4 = g(paramString1);
    if ("PLUS_EVENT".equals(str4)) {
      localnpe.e = 1;
    }
    for (;;)
    {
      localnpe.d = paramString2;
      return localnpe;
      if ("PHOTO_COLLECTION".equals(str4)) {
        localnpe.e = 2;
      } else if ("ALBUM".equals(str4)) {
        localnpe.e = 3;
      } else if ("AD_HOC".equals(str4)) {
        localnpe.e = 4;
      } else if (!TextUtils.isEmpty(str4)) {
        localnpe.e = 0;
      }
    }
  }
  
  private static void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase, String paramString, long paramLong)
  {
    String str = a(paramContext, paramInt);
    ContentValues localContentValues1 = new ContentValues(1);
    localContentValues1.put("cluster_count", Long.valueOf(paramLong));
    paramSQLiteDatabase.update("all_tiles", localContentValues1, "cluster_id = ? AND type = ?", new String[] { paramString, "2" });
    long l1 = DatabaseUtils.longForQuery(paramSQLiteDatabase, "SELECT count(*) FROM all_tiles WHERE type = ? AND view_id = ? AND parent_id = ?", new String[] { "4", str, paramString });
    long l2;
    ContentValues localContentValues2;
    String[] arrayOfString1;
    if (l1 > 0L)
    {
      l2 = paramLong - l1;
      localContentValues2 = new ContentValues(1);
      localContentValues2.put("title", Long.valueOf(l2));
      arrayOfString1 = new String[] { "101", str, paramString };
      if (l2 != 0L) {
        break label164;
      }
      paramSQLiteDatabase.delete("all_tiles", "type = ? AND view_id = ? AND parent_id = ?", arrayOfString1);
    }
    label164:
    while (paramSQLiteDatabase.update("all_tiles", localContentValues2, "type = ? AND view_id = ? AND parent_id = ?", arrayOfString1) != 0) {
      return;
    }
    okn localokn = efj.a(paramString, l2);
    long l3 = 1L + DatabaseUtils.longForQuery(paramSQLiteDatabase, "SELECT view_order FROM all_tiles WHERE view_id = ? AND parent_id = ? ORDER BY view_order DESC limit 1", new String[] { str, paramString });
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = str;
    arrayOfString2[1] = String.valueOf(l3);
    paramSQLiteDatabase.execSQL("UPDATE all_tiles SET view_order = view_order + 1 WHERE view_id = ? AND view_order >= ?", arrayOfString2);
    a(paramContext, paramInt, paramSQLiteDatabase, str, new okn[] { localokn }, l3, null, null, null, paramString, new HashSet());
  }
  
  private static void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase, okn paramokn, HashSet<Uri> paramHashSet, long paramLong)
  {
    String str1 = paramokn.a;
    ContentValues localContentValues = new ContentValues();
    a(paramContext, paramInt, paramokn, localContentValues);
    if (paramLong != -1L) {
      localContentValues.put("last_refresh_time", Long.valueOf(paramLong));
    }
    localContentValues.put("media_attr", Long.valueOf(0x2000 | localContentValues.getAsLong("media_attr").longValue()));
    paramSQLiteDatabase.update("all_tiles", localContentValues, "tile_id = ? AND media_attr & 512 == 0", new String[] { str1 });
    hxi.a(paramSQLiteDatabase, paramokn, paramHashSet);
    Cursor localCursor = paramSQLiteDatabase.query("all_tiles", new String[] { "view_id" }, "tile_id = ? AND media_attr & 512 == 0", new String[] { str1 }, null, null, null);
    try
    {
      while (localCursor.moveToNext())
      {
        String str2 = localCursor.getString(0);
        paramHashSet.add(a.buildUpon().appendEncodedPath(str2).build());
      }
      paramHashSet.add(b.buildUpon().appendEncodedPath(str1).build());
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    int k = 0;
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    long l = System.currentTimeMillis();
    localSQLiteDatabase.beginTransaction();
    try
    {
      k = 0 + localSQLiteDatabase.delete("all_tiles", "cluster_id = ? OR parent_id = ? OR view_id = ?", new String[] { paramString, paramString, paramString });
      k += localSQLiteDatabase.delete("tile_requests", "view_id = ?", new String[] { paramString });
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      if (Log.isLoggable("EsTileData", 4))
      {
        String str3 = String.valueOf("[DELETE_ALBUM], count: ");
        String str4 = String.valueOf(efj.a(System.currentTimeMillis() - l));
        new StringBuilder(23 + String.valueOf(str3).length() + String.valueOf(str4).length()).append(str3).append(k).append(", duration: ").append(str4);
      }
      paramContext.getContentResolver().notifyChange(a, null);
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
      if (Log.isLoggable("EsTileData", 4))
      {
        String str1 = String.valueOf("[DELETE_ALBUM], count: ");
        String str2 = String.valueOf(efj.a(System.currentTimeMillis() - l));
        new StringBuilder(23 + String.valueOf(str1).length() + String.valueOf(str2).length()).append(str1).append(k).append(", duration: ").append(str2);
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    a(paramContext, paramInt, localSQLiteDatabase, paramString, paramLong + efj.a(a(localSQLiteDatabase, paramString)));
    if (paramLong > 0L) {
      localSQLiteDatabase.delete("tile_requests", "view_id = ? ", new String[] { paramString });
    }
    localSQLiteDatabase.setTransactionSuccessful();
    localSQLiteDatabase.endTransaction();
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    a(paramContext, ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase(), paramString1, paramString2);
  }
  
  public static void a(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2, List<Uri> paramList)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt1).getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("comment_count", Integer.valueOf(paramInt2));
    byte[] arrayOfByte = a(paramContext, paramInt1, paramString1, paramString2, false);
    if (arrayOfByte != null) {}
    Cursor localCursor;
    for (;;)
    {
      try
      {
        ojf localojf = (ojf)qat.b(new ojf(), arrayOfByte, 0, arrayOfByte.length);
        if (localojf != null)
        {
          localojf.j = Integer.valueOf(paramInt2);
          localContentValues.put("data", qat.a(localojf));
        }
        localSQLiteDatabase.update("all_tiles", localContentValues, "tile_id = ?", new String[] { paramString1 });
        paramList.add(b.buildUpon().appendEncodedPath(paramString1).build());
        localCursor = localSQLiteDatabase.query("all_tiles", new String[] { "view_id" }, "tile_id = ?", new String[] { paramString1 }, null, null, null);
        if (!localCursor.moveToNext()) {
          break;
        }
        String str = localCursor.getString(0);
        paramList.add(a.buildUpon().appendEncodedPath(str).build());
        continue;
        localojf = null;
      }
      catch (qas localqas)
      {
        Log.e("EsTileData", "unable to parse photo proto", localqas);
      }
    }
    localCursor.close();
  }
  
  public static void a(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    String[] arrayOfString;
    ArrayList localArrayList;
    Cursor localCursor;
    try
    {
      arrayOfString = new String[] { "best", paramString, paramString, paramString };
      localArrayList = new ArrayList(2);
      localCursor = localSQLiteDatabase.query("all_tiles", new String[] { "media_attr" }, "(view_id = ? AND (parent_id = ? OR cluster_id = ?)) OR (view_id = ? AND cluster_id IS NOT NULL)", arrayOfString, null, null, null);
    }
    finally
    {
      try
      {
        while (localCursor.moveToNext())
        {
          localArrayList.add(Long.valueOf(localCursor.getLong(0)));
          continue;
          localSQLiteDatabase.endTransaction();
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    localCursor.close();
    if ((localArrayList.size() > 2) && (Log.isLoggable("EsTileData", 6)))
    {
      int k = localArrayList.size();
      Log.e("EsTileData", 49 + String.valueOf(paramString).length() + "Too many matching tiles: " + k + " for viewId: " + paramString);
    }
    Iterator localIterator = localArrayList.iterator();
    long l1;
    long l2;
    if (localIterator.hasNext())
    {
      l1 = ((Long)localIterator.next()).longValue();
      if (!paramBoolean) {
        break label433;
      }
      l2 = l1 | 0x800;
    }
    for (;;)
    {
      ContentValues localContentValues = new ContentValues(1);
      localContentValues.put("media_attr", Long.valueOf(l2));
      String str1 = String.valueOf("(view_id = ? AND (parent_id = ? OR cluster_id = ?)) OR (view_id = ? AND cluster_id IS NOT NULL) AND ");
      String str2 = String.valueOf(localObject3);
      if (str2.length() != 0) {}
      for (String str3 = str1.concat(str2);; str3 = new String(str1))
      {
        localSQLiteDatabase.update("all_tiles", localContentValues, str3, arrayOfString);
        break;
      }
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      ContentResolver localContentResolver = paramContext.getContentResolver();
      localContentResolver.notifyChange(a.buildUpon().appendEncodedPath(paramString).build(), null);
      localContentResolver.notifyChange(a.buildUpon().appendEncodedPath("best").build(), null);
      return;
      for (;;)
      {
        if ((0x200 & l2) == 0L) {
          break label444;
        }
        localObject3 = "media_attr & 512 != 0";
        break;
        label433:
        l2 = l1 & 0xFFFFF7FF;
      }
      label444:
      Object localObject3 = "media_attr & 512 == 0";
    }
  }
  
  /* Error */
  public static void a(Context paramContext, int paramInt, String paramString1, okn[] paramArrayOfokn, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 737
    //   4: invokestatic 458	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   7: checkcast 737	hrz
    //   10: aload_0
    //   11: iload_1
    //   12: invokevirtual 740	hrz:b	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteOpenHelper;
    //   15: invokevirtual 746	android/database/sqlite/SQLiteOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore 5
    //   20: invokestatic 860	java/lang/System:currentTimeMillis	()J
    //   23: lstore 6
    //   25: new 664	java/util/ArrayList
    //   28: dup
    //   29: invokespecial 766	java/util/ArrayList:<init>	()V
    //   32: astore 8
    //   34: iconst_1
    //   35: anewarray 38	java/lang/String
    //   38: dup
    //   39: iconst_0
    //   40: aload_2
    //   41: aastore
    //   42: astore 9
    //   44: aload 5
    //   46: invokevirtual 863	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   49: ldc2_w 508
    //   52: lstore 10
    //   54: aload_3
    //   55: ifnull +71 -> 126
    //   58: aload 5
    //   60: ldc_w 979
    //   63: aload 9
    //   65: invokestatic 329	android/database/DatabaseUtils:longForQuery	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)J
    //   68: lstore 32
    //   70: lload 32
    //   72: lstore 10
    //   74: lload 10
    //   76: aload_3
    //   77: arraylength
    //   78: i2l
    //   79: lsub
    //   80: lstore 26
    //   82: iconst_m1
    //   83: aload_3
    //   84: arraylength
    //   85: iadd
    //   86: istore 28
    //   88: lload 26
    //   90: lstore 29
    //   92: iload 28
    //   94: iflt +372 -> 466
    //   97: aload_3
    //   98: iload 28
    //   100: aaload
    //   101: astore 31
    //   103: aload 31
    //   105: getfield 297	okn:i	[Lokn;
    //   108: ifnull +352 -> 460
    //   111: lload 29
    //   113: aload 31
    //   115: getfield 297	okn:i	[Lokn;
    //   118: arraylength
    //   119: i2l
    //   120: lsub
    //   121: lstore 29
    //   123: goto +337 -> 460
    //   126: aload_0
    //   127: iload_1
    //   128: aload 5
    //   130: aload_2
    //   131: aload_3
    //   132: lload 10
    //   134: aload 8
    //   136: aload 4
    //   138: new 348	java/util/HashSet
    //   141: dup
    //   142: invokespecial 776	java/util/HashSet:<init>	()V
    //   145: invokestatic 299	jrf:a	(Landroid/content/Context;ILandroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Lokn;JLjava/util/List;Ljava/lang/String;Ljava/util/Set;)J
    //   148: pop2
    //   149: aload 5
    //   151: invokevirtual 872	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   154: aload 5
    //   156: invokevirtual 875	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   159: ldc 229
    //   161: iconst_4
    //   162: invokestatic 881	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   165: ifeq +100 -> 265
    //   168: ldc_w 981
    //   171: invokestatic 612	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   174: astore 21
    //   176: aload_3
    //   177: ifnull +130 -> 307
    //   180: aload_3
    //   181: arraylength
    //   182: istore 22
    //   184: invokestatic 860	java/lang/System:currentTimeMillis	()J
    //   187: lload 6
    //   189: lsub
    //   190: invokestatic 885	efj:a	(J)Ljava/lang/String;
    //   193: invokestatic 612	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   196: astore 23
    //   198: new 591	java/lang/StringBuilder
    //   201: dup
    //   202: bipush 36
    //   204: aload 21
    //   206: invokestatic 612	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   209: invokevirtual 615	java/lang/String:length	()I
    //   212: iadd
    //   213: aload_2
    //   214: invokestatic 612	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   217: invokevirtual 615	java/lang/String:length	()I
    //   220: iadd
    //   221: aload 23
    //   223: invokestatic 612	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   226: invokevirtual 615	java/lang/String:length	()I
    //   229: iadd
    //   230: invokespecial 594	java/lang/StringBuilder:<init>	(I)V
    //   233: aload 21
    //   235: invokevirtual 600	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: aload_2
    //   239: invokevirtual 600	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: ldc_w 983
    //   245: invokevirtual 600	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: iload 22
    //   250: invokevirtual 603	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   253: ldc_w 887
    //   256: invokevirtual 600	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: aload 23
    //   261: invokevirtual 600	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: pop
    //   265: aload_0
    //   266: invokevirtual 893	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   269: astore 19
    //   271: aload 8
    //   273: invokevirtual 984	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   276: astore 20
    //   278: aload 20
    //   280: invokeinterface 964 1 0
    //   285: ifeq +150 -> 435
    //   288: aload 19
    //   290: aload 20
    //   292: invokeinterface 968 1 0
    //   297: checkcast 26	android/net/Uri
    //   300: aconst_null
    //   301: invokevirtual 899	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   304: goto -26 -> 278
    //   307: iconst_0
    //   308: istore 22
    //   310: goto -126 -> 184
    //   313: astore 12
    //   315: aload 5
    //   317: invokevirtual 875	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   320: ldc 229
    //   322: iconst_4
    //   323: invokestatic 881	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   326: ifeq +100 -> 426
    //   329: ldc_w 981
    //   332: invokestatic 612	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   335: astore 13
    //   337: aload_3
    //   338: ifnull +91 -> 429
    //   341: aload_3
    //   342: arraylength
    //   343: istore 14
    //   345: invokestatic 860	java/lang/System:currentTimeMillis	()J
    //   348: lload 6
    //   350: lsub
    //   351: invokestatic 885	efj:a	(J)Ljava/lang/String;
    //   354: invokestatic 612	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   357: astore 15
    //   359: new 591	java/lang/StringBuilder
    //   362: dup
    //   363: bipush 36
    //   365: aload 13
    //   367: invokestatic 612	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   370: invokevirtual 615	java/lang/String:length	()I
    //   373: iadd
    //   374: aload_2
    //   375: invokestatic 612	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   378: invokevirtual 615	java/lang/String:length	()I
    //   381: iadd
    //   382: aload 15
    //   384: invokestatic 612	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   387: invokevirtual 615	java/lang/String:length	()I
    //   390: iadd
    //   391: invokespecial 594	java/lang/StringBuilder:<init>	(I)V
    //   394: aload 13
    //   396: invokevirtual 600	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: aload_2
    //   400: invokevirtual 600	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   403: ldc_w 983
    //   406: invokevirtual 600	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: iload 14
    //   411: invokevirtual 603	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   414: ldc_w 887
    //   417: invokevirtual 600	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   420: aload 15
    //   422: invokevirtual 600	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: pop
    //   426: aload 12
    //   428: athrow
    //   429: iconst_0
    //   430: istore 14
    //   432: goto -87 -> 345
    //   435: aload 19
    //   437: getstatic 32	jrf:a	Landroid/net/Uri;
    //   440: invokevirtual 279	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   443: aload_2
    //   444: invokevirtual 285	android/net/Uri$Builder:appendEncodedPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   447: invokevirtual 289	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   450: aconst_null
    //   451: invokevirtual 899	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   454: return
    //   455: astore 25
    //   457: goto -383 -> 74
    //   460: iinc 28 255
    //   463: goto -371 -> 92
    //   466: lload 29
    //   468: lstore 10
    //   470: goto -344 -> 126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	473	0	paramContext	Context
    //   0	473	1	paramInt	int
    //   0	473	2	paramString1	String
    //   0	473	3	paramArrayOfokn	okn[]
    //   0	473	4	paramString2	String
    //   18	298	5	localSQLiteDatabase	SQLiteDatabase
    //   23	326	6	l1	long
    //   32	240	8	localArrayList	ArrayList
    //   42	22	9	arrayOfString	String[]
    //   52	417	10	l2	long
    //   313	114	12	localObject	Object
    //   335	60	13	str1	String
    //   343	88	14	k	int
    //   357	64	15	str2	String
    //   269	167	19	localContentResolver	ContentResolver
    //   276	15	20	localIterator	Iterator
    //   174	60	21	str3	String
    //   182	127	22	m	int
    //   196	64	23	str4	String
    //   455	1	25	localSQLiteDoneException	SQLiteDoneException
    //   80	9	26	l3	long
    //   86	375	28	n	int
    //   90	377	29	l4	long
    //   101	13	31	localokn	okn
    //   68	3	32	l5	long
    // Exception table:
    //   from	to	target	type
    //   58	70	313	finally
    //   74	88	313	finally
    //   97	123	313	finally
    //   126	154	313	finally
    //   58	70	455	android/database/sqlite/SQLiteDoneException
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, okn[] paramArrayOfokn, boolean paramBoolean1, boolean paramBoolean2, String paramString2, boolean paramBoolean3)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    long l = System.currentTimeMillis();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    localSQLiteDatabase.beginTransaction();
    if (paramBoolean1) {}
    ContentResolver localContentResolver;
    label386:
    for (;;)
    {
      try
      {
        localSQLiteDatabase.delete("all_tiles", "view_id = ? AND media_attr & 512 == 0", new String[] { paramString1 });
        a(paramContext, paramInt, localSQLiteDatabase, paramString1, paramArrayOfokn, 1L + a(localSQLiteDatabase, paramString1, false), localArrayList1, localArrayList2, paramString2, null, new HashSet());
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        if (Log.isLoggable("EsTileData", 4))
        {
          String str3 = String.valueOf("[INSERT_TILES], view: ");
          if (paramArrayOfokn != null)
          {
            m = paramArrayOfokn.length;
            String str4 = String.valueOf(efj.a(System.currentTimeMillis() - l));
            new StringBuilder(36 + String.valueOf(str3).length() + String.valueOf(paramString1).length() + String.valueOf(str4).length()).append(str3).append(paramString1).append(", num tiles: ").append(m).append(", duration: ").append(str4);
          }
        }
        else
        {
          localContentResolver = paramContext.getContentResolver();
          Iterator localIterator = localArrayList1.iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          localContentResolver.notifyChange((Uri)localIterator.next(), null);
          continue;
        }
        int m = 0;
        continue;
        String str1;
        String str2;
        int k = 0;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
        if (Log.isLoggable("EsTileData", 4))
        {
          str1 = String.valueOf("[INSERT_TILES], view: ");
          if (paramArrayOfokn == null) {
            break label386;
          }
          k = paramArrayOfokn.length;
          str2 = String.valueOf(efj.a(System.currentTimeMillis() - l));
          new StringBuilder(36 + String.valueOf(str1).length() + String.valueOf(paramString1).length() + String.valueOf(str2).length()).append(str1).append(paramString1).append(", num tiles: ").append(k).append(", duration: ").append(str2);
        }
      }
    }
    if (paramBoolean3) {
      localContentResolver.notifyChange(a.buildUpon().appendEncodedPath(paramString1).build(), null);
    }
  }
  
  public static void a(Context paramContext, int paramInt1, okn paramokn, int paramInt2)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt1).getWritableDatabase();
    long l1 = System.currentTimeMillis();
    HashSet localHashSet = new HashSet();
    localSQLiteDatabase.beginTransaction();
    long l2;
    switch (paramInt2)
    {
    default: 
      l2 = -1L;
    }
    try
    {
      for (;;)
      {
        a(paramContext, paramInt1, localSQLiteDatabase, paramokn, localHashSet, l2);
        b(paramContext, paramInt1, localSQLiteDatabase, paramokn, localHashSet, l2);
        c(paramContext, paramInt1, localSQLiteDatabase, paramokn, localHashSet, l2);
        localSQLiteDatabase.setTransactionSuccessful();
        localSQLiteDatabase.endTransaction();
        if (Log.isLoggable("EsTileData", 4))
        {
          String str4 = String.valueOf("[UPDATE_PHOTO_TILE], tile: ");
          String str5 = String.valueOf(paramokn.a);
          String str6 = String.valueOf(efj.a(System.currentTimeMillis() - l1));
          new StringBuilder(12 + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length()).append(str4).append(str5).append(", duration: ").append(str6);
        }
        ContentResolver localContentResolver = paramContext.getContentResolver();
        Iterator localIterator = localHashSet.iterator();
        while (localIterator.hasNext()) {
          localContentResolver.notifyChange((Uri)localIterator.next(), null);
        }
        long l3 = System.currentTimeMillis();
        l2 = l3;
        continue;
        l2 = 0L;
      }
      String str1;
      String str2;
      String str3;
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
      if (Log.isLoggable("EsTileData", 4))
      {
        str1 = String.valueOf("[UPDATE_PHOTO_TILE], tile: ");
        str2 = String.valueOf(paramokn.a);
        str3 = String.valueOf(efj.a(System.currentTimeMillis() - l1));
        new StringBuilder(12 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str1).append(str2).append(", duration: ").append(str3);
      }
    }
  }
  
  private static void a(Context paramContext, int paramInt, okn paramokn, ContentValues paramContentValues)
  {
    if (paramokn.a != null) {
      paramContentValues.put("tile_id", paramokn.a);
    }
    if (paramokn.j != -2147483648) {
      paramContentValues.put("type", Integer.valueOf(paramokn.j));
    }
    if (paramokn.b != null) {
      paramContentValues.put("title", paramokn.b);
    }
    if ((paramokn.c != null) && (paramokn.c.length > 0)) {
      paramContentValues.put("subtitle", TextUtils.join(" • ", paramokn.c));
    }
    if (paramokn.e != null)
    {
      if (paramokn.e.a != null) {
        paramContentValues.put("image_url", iqw.b(paramokn.e.a));
      }
      if (paramokn.e.b != null) {
        paramContentValues.put("image_width", paramokn.e.b);
      }
      if (paramokn.e.c != null) {
        paramContentValues.put("image_height", paramokn.e.c);
      }
    }
    long l;
    if ((paramokn.b(okm.a) != null) && (((okm)paramokn.b(okm.a)).b != null))
    {
      ojf localojf = ((okm)paramokn.b(okm.a)).b;
      if (localojf.a != null) {
        localojf.a.a = iqw.b(localojf.a.a);
      }
      if (localojf.r != null) {
        localojf.r.a = iqw.b(localojf.r.a);
      }
      if (localojf.s != null) {
        localojf.s.a = iqw.b(localojf.s.a);
      }
      if (localojf.j != null) {
        paramContentValues.put("comment_count", Integer.valueOf(localojf.j.intValue()));
      }
      if (localojf.q != null) {
        paramContentValues.put("plusone_count", Integer.valueOf(Math.max(0, efj.a(localojf.q.e))));
      }
      String str = mar.a(localojf);
      if (str != null) {
        paramContentValues.put("content_url", str);
      }
      localojf.n = new oix[0];
      paramContentValues.put("data", qat.a(localojf));
      l = 0L | a(localojf, ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id"));
      paramContentValues.put("timestamp", Long.valueOf((1000.0D * efj.a(localojf.m))));
      if ((localojf.x != null) && (localojf.x.length != 0) && (localojf.x[0].k != null)) {
        paramContentValues.put("acl", Integer.valueOf(a(localojf.x[0].k)));
      }
    }
    for (;;)
    {
      paramContentValues.put("media_attr", Long.valueOf(l));
      paramContentValues.put("user_actions", Long.valueOf(a(paramContext, paramokn, paramInt)));
      return;
      l = 0L;
    }
  }
  
  private static void a(Context paramContext, int paramInt, okn paramokn, String paramString, ContentValues paramContentValues, Set<String> paramSet)
  {
    long l1 = 0L;
    paramContentValues.put("tile_id", paramokn.a);
    if (paramokn.j != -2147483648) {
      paramContentValues.put("type", Integer.valueOf(paramokn.j));
    }
    if (paramokn.g != null)
    {
      paramContentValues.put("photographer_gaia_id", paramokn.g.b);
      paramContentValues.put("photographer_avatar_url", efj.E(paramokn.g.d));
    }
    paramContentValues.put("title", paramokn.b);
    label179:
    String str15;
    label230:
    int k;
    label237:
    oir localoir;
    String str13;
    long l4;
    label435:
    String str8;
    label468:
    String str10;
    long l2;
    if ((paramokn.c != null) && (paramokn.c.length > 0))
    {
      paramContentValues.put("subtitle", TextUtils.join(" • ", paramokn.c));
      if (paramokn.e == null) {
        break label693;
      }
      paramContentValues.put("image_url", iqw.b(paramokn.e.a));
      paramContentValues.put("image_width", paramokn.e.b);
      paramContentValues.put("image_height", paramokn.e.c);
      paramContentValues.put("user_actions", Long.valueOf(a(paramContext, paramokn, paramInt)));
      if (paramokn.f == null) {
        break label719;
      }
      String str14 = String.valueOf(paramokn.f);
      if (str14.length() == 0) {
        break label704;
      }
      str15 = "#".concat(str14);
      k = Color.parseColor(str15);
      paramContentValues.put("background_color", Integer.valueOf(k));
      if (paramokn.b(okk.a) == null) {
        break label904;
      }
      localoir = ((okk)paramokn.b(okk.a)).b;
      if ((localoir.g == null) || (localoir.g.length == 0)) {
        break label768;
      }
      oif localoif2 = localoir.g[0];
      paramContentValues.put("media_key", localoif2.a);
      paramContentValues.put("equivalence_token", localoif2.n);
      String str12 = localoif2.e;
      str13 = a(3, new String[] { a(localoif2.a, str12, localoif2.b, localoif2.c) });
      paramContentValues.put("cluster_id", str13);
      if (localoif2.k == null) {
        break label742;
      }
      int i1 = a(localoif2.k);
      paramContentValues.put("acl", Integer.valueOf(i1));
      if ((i1 != 2) && (i1 != -1)) {
        break label725;
      }
      paramSet.add(str13);
      l4 = 16777216L;
      paramContentValues.put("data", jqt.a(new jqt(paramString, localoir.c, paramokn)));
      l1 = l4;
      str8 = str12;
      if ((localoir.d != 3) && (localoir.d != 7)) {
        break label881;
      }
      paramContentValues.put("cluster_count", localoir.b);
      str10 = str8;
      l2 = l1;
    }
    label527:
    boolean bool;
    label580:
    label719:
    label725:
    label742:
    label881:
    String str11;
    for (Object localObject = str10;; localObject = str11)
    {
      if (localObject == null) {
        break label2195;
      }
      paramContentValues.put("owner_id", (String)localObject);
      if ("~local".equals(paramokn.a))
      {
        l2 |= 0x40000;
        if ((paramokn.e == null) || (paramokn.e.a == null)) {
          break label2206;
        }
        bool = mfq.c(Uri.parse(paramokn.e.a));
        if (bool) {
          l2 |= 0x20;
        }
      }
      String str1 = paramContentValues.getAsString("parent_id");
      if ((str1 != null) && (paramSet.contains(str1))) {
        l2 |= 0x1000000;
      }
      paramContentValues.put("media_attr", Long.valueOf(l2));
      if (paramokn.j == 101) {
        paramContentValues.put("cluster_id", paramokn.d);
      }
      if (paramokn.j == 110) {
        paramContentValues.put("cluster_id", paramokn.a);
      }
      return;
      paramContentValues.putNull("subtitle");
      break;
      label693:
      paramContentValues.putNull("image_url");
      break label179;
      label704:
      str15 = new String("#");
      break label230;
      k = 0;
      break label237;
      paramSet.remove(str13);
      l4 = l1;
      break label435;
      paramContentValues.putNull("acl");
      paramSet.add(str13);
      l4 = 16777216L;
      break label435;
      label768:
      str8 = localoir.e.b;
      String str9 = a(3, new String[] { a(null, str8, localoir.c, "ALBUM") });
      int n = jqx.b(localoir.f);
      paramContentValues.put("cluster_id", str9);
      paramContentValues.put("acl", Integer.valueOf(n));
      if ((n == 2) || (n == -1))
      {
        paramSet.add(str9);
        l1 = 16777216L;
        break label468;
      }
      paramSet.remove(str9);
      break label468;
      paramContentValues.putNull("cluster_count");
      str11 = str8;
      l2 = l1;
    }
    label904:
    oif localoif1;
    String str5;
    String str6;
    label1022:
    String[] arrayOfString2;
    if (paramokn.b(okl.a) != null)
    {
      localoif1 = ((okl)paramokn.b(okl.a)).b;
      str5 = localoif1.e;
      if ((localoif1.l != null) && (localoif1.l.a != null)) {
        paramContentValues.put("timestamp", localoif1.l.a);
      }
      if ((localoif1.l != null) && (localoif1.l.b != null)) {
        paramContentValues.put("duration_days", localoif1.l.b);
      }
      if (0L != 0L)
      {
        str6 = k(localoif1.b);
        paramContentValues.put("cluster_id", str6);
        paramContentValues.put("media_key", localoif1.a);
        paramContentValues.put("equivalence_token", localoif1.n);
        paramContentValues.put("cluster_count", localoif1.h);
        if ((paramContentValues.get("subtitle") == null) && (localoif1.m != null) && (localoif1.m.length != 0)) {
          paramContentValues.put("subtitle", localoif1.m[0].a);
        }
        if (localoif1.k == null) {
          break label1573;
        }
        int m = a(localoif1.k);
        paramContentValues.put("acl", Integer.valueOf(m));
        if ((m != 2) && (m != -1)) {
          break label1560;
        }
        paramSet.add(str6);
        l1 = 16777216L;
        label1175:
        if (localoif1.d != null) {}
        switch (localoif1.d.a)
        {
        default: 
          label1256:
          oie localoie;
          if (((okl)paramokn.b(okl.a)).e != null)
          {
            localoie = ((okl)paramokn.b(okl.a)).e;
            if (localoie.a == null) {}
          }
          switch (localoie.a.c)
          {
          default: 
            label1324:
            if (efj.b(localoie.a.a)) {
              l1 |= 0x10000;
            }
            if (((okl)paramokn.b(okl.a)).f != null)
            {
              oii localoii = ((okl)paramokn.b(okl.a)).f.a;
              if ((localoii != null) && (localoii.a == 1)) {
                l1 |= 0x8000;
              }
            }
            if ((((okl)paramokn.b(okl.a)).d != null) && (((okl)paramokn.b(okl.a)).d.b != null))
            {
              arrayOfString2 = ((okl)paramokn.b(okl.a)).d.b;
              if (arrayOfString2.length == 0) {}
            }
            break;
          }
          break;
        }
      }
    }
    for (String str7 = arrayOfString2[0];; str7 = null)
    {
      if (!TextUtils.isEmpty(localoif1.j)) {
        l1 |= 0x20000;
      }
      paramContentValues.put("data", jqt.a(new jqt(paramString, str7, paramokn)));
      l2 = l1;
      localObject = str5;
      break;
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = a(localoif1.a, str5, localoif1.b, localoif1.c);
      str6 = a(3, arrayOfString1);
      break label1022;
      label1560:
      paramSet.remove(str6);
      break label1175;
      label1573:
      paramContentValues.putNull("acl");
      paramSet.add(str6);
      l1 = 16777216L;
      break label1175;
      l1 |= 1L;
      break label1256;
      l1 |= 0x2;
      break label1256;
      l1 |= 0x4;
      break label1256;
      l1 |= 0x8;
      break label1256;
      l1 |= 0x10;
      break label1256;
      l1 |= 0x40000;
      break label1256;
      l1 |= 0x400000;
      paramContentValues.put("content_url", localoif1.d.b);
      break label1256;
      l1 |= 0x800;
      break label1324;
      l1 |= 0x400;
      break label1324;
      if (paramokn.b(okm.a) != null)
      {
        ojf localojf = ((okm)paramokn.b(okm.a)).b;
        paramContentValues.put("media_key", localojf.e);
        if (localojf.a != null) {
          localojf.a.a = iqw.b(localojf.a.a);
        }
        if (localojf.r != null) {
          localojf.r.a = iqw.b(localojf.r.a);
        }
        if (localojf.s != null) {
          localojf.s.a = iqw.b(localojf.s.a);
        }
        label1858:
        label1902:
        String str2;
        if (localojf.j != null)
        {
          paramContentValues.put("comment_count", Integer.valueOf(localojf.j.intValue()));
          if ((localojf.q == null) || (efj.a(localojf.q.e) <= 0)) {
            break label2151;
          }
          paramContentValues.put("plusone_count", Integer.valueOf(efj.a(localojf.q.e)));
          if ((localojf.x == null) || (localojf.x.length == 0) || (localojf.x[0].k == null)) {
            break label2162;
          }
          paramContentValues.put("acl", Integer.valueOf(a(localojf.x[0].k)));
          label1956:
          if (localojf.d == null) {
            break label2173;
          }
          paramContentValues.put("photo_id", Long.valueOf(Long.parseLong(localojf.d)));
          label1983:
          ojv localojv = localojf.g;
          str2 = null;
          if (localojv != null) {
            str2 = localojf.g.b;
          }
          String str3 = mar.a(localojf);
          if (str3 == null) {
            break label2184;
          }
          paramContentValues.put("content_url", str3);
        }
        for (;;)
        {
          paramContentValues.putNull("cluster_id");
          paramContentValues.putNull("cluster_count");
          localojf.n = new oix[0];
          paramContentValues.put("data", qat.a(localojf));
          long l3 = 0L | a(localojf, ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id"));
          paramContentValues.put("timestamp", Long.valueOf((1000.0D * efj.a(localojf.m))));
          String str4 = str2;
          l2 = l3;
          localObject = str4;
          break;
          paramContentValues.putNull("comment_count");
          break label1858;
          label2151:
          paramContentValues.putNull("plusone_count");
          break label1902;
          label2162:
          paramContentValues.putNull("acl");
          break label1956;
          label2173:
          paramContentValues.putNull("photo_id");
          break label1983;
          label2184:
          paramContentValues.putNull("content_url");
        }
        label2195:
        paramContentValues.putNull("owner_id");
        break label527;
        label2206:
        bool = false;
        break label580;
      }
      l2 = l1;
      localObject = null;
      break;
    }
  }
  
  public static void a(Context paramContext, int paramInt, String[] paramArrayOfString, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    long l1 = System.currentTimeMillis();
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      return;
    }
    localSQLiteDatabase.beginTransaction();
    String str4;
    HashMap localHashMap;
    Cursor localCursor;
    for (;;)
    {
      try
      {
        str4 = a(paramContext, paramInt, paramArrayOfString);
        localHashMap = new HashMap();
        if (!paramBoolean) {
          break label326;
        }
        localCursor = localSQLiteDatabase.query("all_tiles", f, str4, null, "parent_id", null, null, null);
        String str9;
        long l3;
        try
        {
          if (!localCursor.moveToNext()) {
            break;
          }
          str9 = localCursor.getString(0);
          long l2 = localCursor.getLong(1);
          if (TextUtils.isEmpty(str9)) {
            continue;
          }
          Long localLong = a(localSQLiteDatabase, str9);
          if (localLong == null) {
            continue;
          }
          l3 = localLong.longValue() - l2;
          if (l3 <= 0L)
          {
            localSQLiteDatabase.delete("all_tiles", "cluster_id = ? OR parent_id = ?", new String[] { str9, str9 });
            continue;
            localObject1 = finally;
          }
        }
        finally
        {
          localCursor.close();
        }
        String str1;
        String str2;
        String str3;
        localHashMap.put(str9, Long.valueOf(l3));
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
        if (Log.isLoggable("EsTileData", 4))
        {
          str1 = String.valueOf("[DELETE_TILE], photoIds: ");
          str2 = String.valueOf(TextUtils.join(",", paramArrayOfString));
          str3 = String.valueOf(efj.a(System.currentTimeMillis() - l1));
          new StringBuilder(12 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str1).append(str2).append(", duration: ").append(str3);
        }
      }
    }
    localCursor.close();
    label326:
    localSQLiteDatabase.delete("all_tiles", str4, null);
    if (!localHashMap.isEmpty())
    {
      Iterator localIterator1 = localHashMap.keySet().iterator();
      while (localIterator1.hasNext())
      {
        String str8 = (String)localIterator1.next();
        a(paramContext, paramInt, localSQLiteDatabase, str8, ((Long)localHashMap.get(str8)).longValue());
      }
      Iterator localIterator2 = localHashMap.keySet().iterator();
      while (localIterator2.hasNext()) {
        a(paramContext, localSQLiteDatabase, (String)localIterator2.next());
      }
    }
    localSQLiteDatabase.setTransactionSuccessful();
    localSQLiteDatabase.endTransaction();
    if (Log.isLoggable("EsTileData", 4))
    {
      String str5 = String.valueOf("[DELETE_TILE], photoIds: ");
      String str6 = String.valueOf(TextUtils.join(",", paramArrayOfString));
      String str7 = String.valueOf(efj.a(System.currentTimeMillis() - l1));
      new StringBuilder(12 + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length()).append(str5).append(str6).append(", duration: ").append(str7);
    }
    paramContext.getContentResolver().notifyChange(a, null);
  }
  
  public static void a(Context paramContext, int paramInt, jqu[] paramArrayOfjqu)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    HashSet localHashSet = new HashSet();
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      int k;
      try
      {
        k = -1 + paramArrayOfjqu.length;
        if (k < 0) {
          break label279;
        }
        jqu localjqu = paramArrayOfjqu[k];
        if (localjqu.a != 1) {
          break label360;
        }
        if (localjqu.b == null) {
          break label348;
        }
        m = 1;
        if (m == 0) {
          break label360;
        }
        ContentValues[] arrayOfContentValues = localjqu.b;
        int n = -1 + arrayOfContentValues.length;
        if (n < 0) {
          break label360;
        }
        ContentValues localContentValues = arrayOfContentValues[n];
        String str1 = localContentValues.getAsString("view_id");
        Long localLong = localContentValues.getAsLong("media_attr");
        if ((localLong == null) || ((0x200 & localLong.longValue()) == 0L)) {
          break label354;
        }
        bool = true;
        if (localContentValues.getAsInteger("type").intValue() == 2)
        {
          long l = a(localSQLiteDatabase, str1, localContentValues.getAsString("cluster_id"), bool);
          if (l == -1L)
          {
            localSQLiteDatabase.insert("all_tiles", null, localContentValues);
            localHashSet.add(str1);
            n--;
            continue;
          }
          localContentValues.remove("view_order");
          String[] arrayOfString = new String[1];
          arrayOfString[0] = Long.toString(l);
          localSQLiteDatabase.update("all_tiles", localContentValues, "_id = ? ", arrayOfString);
          continue;
        }
        a(localSQLiteDatabase, str1, localContentValues.getAsString("tile_id"), localContentValues, bool, true);
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      continue;
      label279:
      localSQLiteDatabase.setTransactionSuccessful();
      ContentResolver localContentResolver = paramContext.getContentResolver();
      Iterator localIterator = localHashSet.iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        localContentResolver.notifyChange(a.buildUpon().appendEncodedPath(str2).build(), null);
      }
      localSQLiteDatabase.endTransaction();
      return;
      label348:
      int m = 0;
      continue;
      label354:
      boolean bool = false;
      continue;
      label360:
      k--;
    }
  }
  
  private static void a(Context paramContext, SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    Cursor localCursor1 = paramSQLiteDatabase.query("all_tiles", e, "cluster_id = ? AND type = ?", new String[] { paramString, "2" }, null, null, null, null);
    for (;;)
    {
      try
      {
        if (localCursor1.moveToNext())
        {
          str1 = localCursor1.getString(localCursor1.getColumnIndex("tile_id"));
          localCursor2 = paramSQLiteDatabase.query("all_tiles", e, "type = ? AND view_id = ? AND parent_id = ?", new String[] { "4", paramString, paramString }, null, null, "view_order", "1");
        }
      }
      finally
      {
        try
        {
          String str1;
          if (!localCursor2.moveToNext()) {
            break label185;
          }
          String str3 = localCursor2.getString(localCursor1.getColumnIndex("tile_id"));
          str2 = str3;
          localCursor2.close();
          if (TextUtils.isEmpty(str2)) {
            continue;
          }
          a(paramContext, paramSQLiteDatabase, str1, str2);
          continue;
        }
        finally
        {
          Cursor localCursor2;
          localCursor2.close();
        }
        localObject1 = finally;
        localCursor1.close();
      }
      localCursor1.close();
      return;
      label185:
      String str2 = null;
    }
  }
  
  private static void a(Context paramContext, SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    Cursor localCursor = paramSQLiteDatabase.query("all_tiles", new String[] { "image_url", "image_width", "image_height" }, "tile_id = ? AND media_attr & 512 == 0", new String[] { paramString2 }, null, null, null);
    for (;;)
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          localContentValues = new ContentValues(3);
          localContentValues.put("image_url", localCursor.getString(0));
          localContentValues.put("image_width", localCursor.getString(1));
          localContentValues.put("image_height", localCursor.getString(2));
          localCursor.close();
          if (localContentValues != null)
          {
            paramSQLiteDatabase.update("all_tiles", localContentValues, "tile_id = ?", new String[] { paramString1 });
            ContentResolver localContentResolver = paramContext.getContentResolver();
            localContentResolver.notifyChange(a, null);
            localContentResolver.notifyChange(b.buildUpon().appendEncodedPath(paramString1).build(), null);
          }
          return;
        }
      }
      finally
      {
        localCursor.close();
      }
      ContentValues localContentValues = null;
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, ContentValues paramContentValues, boolean paramBoolean1, boolean paramBoolean2)
  {
    long l;
    if (paramBoolean2) {
      if (paramBoolean1) {
        l = b(paramSQLiteDatabase, paramString1, paramString2);
      }
    }
    while (l == -1L)
    {
      paramSQLiteDatabase.insert("all_tiles", null, paramContentValues);
      return;
      l = a(paramSQLiteDatabase, paramString1, paramString2);
      continue;
      l = -1L;
    }
    paramContentValues.remove("view_order");
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Long.toString(l);
    paramSQLiteDatabase.update("all_tiles", paramContentValues, "_id = ? ", arrayOfString);
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString, ArrayList<?> paramArrayList)
  {
    paramStringBuilder.append(paramString).append(" IN (");
    for (int k = -1 + paramArrayList.size(); k >= 0; k--)
    {
      Object localObject = paramArrayList.get(k);
      paramStringBuilder.append('\'').append(localObject).append('\'');
      if (k > 0) {
        paramStringBuilder.append(',');
      }
    }
    paramStringBuilder.append(')');
  }
  
  public static void a(okn paramokn, Context paramContext, int paramInt)
  {
    okm localokm = (okm)paramokn.b(okm.a);
    if ((localokm == null) || (localokm.b == null)) {}
    for (oix[] arrayOfoix = null;; arrayOfoix = localokm.b.n)
    {
      jqx.a(paramContext, paramInt, paramokn.a, null, arrayOfoix, false);
      a(paramContext, paramInt, paramokn, 1);
      if ((localokm != null) && (localokm.b != null)) {
        jqx.a(paramContext, paramInt, new okn[] { paramokn }, new pre[0], localokm.b.g, true);
      }
      return;
    }
  }
  
  private static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString, Long paramLong, okn paramokn)
  {
    oif localoif = ((okl)paramokn.b(okl.a)).b;
    try
    {
      String[] arrayOfString = new String[3];
      arrayOfString[0] = paramString;
      arrayOfString[1] = Integer.toString(2);
      arrayOfString[2] = Long.toString(paramLong.longValue());
      String str2 = DatabaseUtils.stringForQuery(paramSQLiteDatabase, "SELECT cluster_id FROM all_tiles WHERE view_id = ?  AND type = ?  AND view_order < ?  ORDER BY view_order DESC  LIMIT 1", arrayOfString);
      str1 = str2;
    }
    catch (SQLiteDoneException localSQLiteDoneException)
    {
      for (;;)
      {
        String str1 = null;
      }
    }
    return TextUtils.equals(str1, a(3, new String[] { a(localoif.a, localoif.e, localoif.b, localoif.c) }));
  }
  
  public static byte[] a(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    String[] arrayOfString1 = { "data" };
    Object localObject1;
    String[] arrayOfString2;
    if (paramString2 != null)
    {
      localObject1 = "view_id = ? AND tile_id = ?  AND media_attr & 512 == 0";
      arrayOfString2 = new String[2];
      arrayOfString2[0] = paramString2;
      arrayOfString2[1] = paramString1;
    }
    for (;;)
    {
      String str1;
      String str3;
      label94:
      Cursor localCursor;
      if (paramBoolean)
      {
        str1 = String.valueOf(localObject1);
        String str2 = String.valueOf(" AND media_attr & 512 == 0");
        if (str2.length() != 0)
        {
          str3 = str1.concat(str2);
          localObject1 = str3;
        }
      }
      else
      {
        localCursor = localSQLiteDatabase.query("all_tiles", arrayOfString1, (String)localObject1, arrayOfString2, null, null, null);
      }
      try
      {
        if (localCursor.moveToFirst())
        {
          byte[] arrayOfByte = localCursor.getBlob(0);
          return arrayOfByte;
          localObject1 = "tile_id = ?";
          arrayOfString2 = new String[] { paramString1 };
          continue;
          str3 = new String(str1);
          break label94;
        }
        return null;
      }
      finally
      {
        localCursor.close();
      }
    }
  }
  
  private static String[] a(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = paramSQLiteDatabase.query("all_tiles", null, null, null, null, null, null);
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
  
  /* Error */
  private static long b(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 269
    //   4: getstatic 42	jrf:d	[Ljava/lang/String;
    //   7: ldc_w 1268
    //   10: iconst_2
    //   11: anewarray 38	java/lang/String
    //   14: dup
    //   15: iconst_0
    //   16: aload_1
    //   17: aastore
    //   18: dup
    //   19: iconst_1
    //   20: aload_2
    //   21: aastore
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: invokevirtual 485	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_3
    //   29: aload_3
    //   30: invokeinterface 490 1 0
    //   35: ifeq +25 -> 60
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 494 2 0
    //   45: lstore 7
    //   47: lload 7
    //   49: lstore 5
    //   51: aload_3
    //   52: invokeinterface 497 1 0
    //   57: lload 5
    //   59: lreturn
    //   60: ldc2_w 266
    //   63: lstore 5
    //   65: goto -14 -> 51
    //   68: astore 4
    //   70: aload_3
    //   71: invokeinterface 497 1 0
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	79	1	paramString1	String
    //   0	79	2	paramString2	String
    //   28	43	3	localCursor	Cursor
    //   68	9	4	localObject	Object
    //   49	15	5	l1	long
    //   45	3	7	l2	long
    // Exception table:
    //   from	to	target	type
    //   29	47	68	finally
  }
  
  public static String b()
  {
    return k("~");
  }
  
  public static String b(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Cluster ID must not be null");
    }
    int k = paramString.indexOf(':');
    if (k < 0) {
      return null;
    }
    return paramString.substring(k + 1);
  }
  
  private static HashSet<String> b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    String[] arrayOfString = { paramString };
    int k = (int)DatabaseUtils.longForQuery(paramSQLiteDatabase, "SELECT count(*) FROM all_tiles WHERE view_id = ? AND media_attr & 512 != 0 AND tile_id LIKE '~post:%'", arrayOfString);
    HashSet localHashSet = null;
    Cursor localCursor;
    if (k > 0)
    {
      localCursor = paramSQLiteDatabase.query("all_tiles", new String[] { "tile_id" }, "view_id = ? AND media_attr & 512 != 0 AND tile_id LIKE '~post:%'", arrayOfString, null, null, null);
      try
      {
        localHashSet = new HashSet(k);
        while (localCursor.moveToNext()) {
          localHashSet.add(localCursor.getString(0));
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    return localHashSet;
  }
  
  public static List<Long> b(Context paramContext, int paramInt, String paramString)
  {
    ArrayList localArrayList1 = new ArrayList();
    localArrayList1.add(paramString);
    List localList = a(paramContext, paramInt, localArrayList1);
    ArrayList localArrayList2 = new ArrayList();
    for (int k = -1 + localList.size(); k >= 0; k--) {
      localArrayList2.add(Long.valueOf(((ipn)localList.get(k)).a));
    }
    return localArrayList2;
  }
  
  public static List<ipf> b(Context paramContext, int paramInt, List<ipf> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("tile_id IN (");
    Iterator localIterator1 = paramList.iterator();
    int k = 0;
    int i1;
    if (localIterator1.hasNext())
    {
      ipf localipf2 = (ipf)localIterator1.next();
      if (localipf2.a()) {
        break label500;
      }
      if (localipf2.a != null)
      {
        i1 = 1;
        label68:
        if (i1 == 0) {
          break label500;
        }
        DatabaseUtils.appendEscapedSQLString(localStringBuilder, localipf2.a);
        localStringBuilder.append(',');
      }
    }
    label334:
    label484:
    label500:
    for (int n = 1;; n = k)
    {
      k = n;
      break;
      i1 = 0;
      break label68;
      if (k == 0) {
        return paramList;
      }
      localStringBuilder.setLength(-1 + localStringBuilder.length());
      localStringBuilder.append(')');
      Cursor localCursor = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase().query(true, "all_tiles", new String[] { "tile_id", "owner_id", "photo_id" }, localStringBuilder.toString(), null, null, null, null, null);
      HashMap localHashMap = new HashMap();
      try
      {
        while (localCursor.moveToNext()) {
          localHashMap.put(localCursor.getString(0), new Pair(localCursor.getString(1), Long.valueOf(localCursor.getLong(2))));
        }
        localArrayList = new ArrayList();
      }
      finally
      {
        localCursor.close();
      }
      ArrayList localArrayList;
      Iterator localIterator2 = paramList.iterator();
      while (localIterator2.hasNext())
      {
        ipf localipf1 = (ipf)localIterator2.next();
        String str1 = localipf1.a;
        if (!localipf1.a())
        {
          int m;
          Pair localPair;
          String str2;
          if (localipf1.a != null)
          {
            m = 1;
            if (m == 0) {
              break label484;
            }
            localPair = (Pair)localHashMap.get(str1);
            if (localPair != null) {
              break label435;
            }
            if (Log.isLoggable("EsTileData", 6))
            {
              str2 = String.valueOf(str1);
              if (str2.length() == 0) {
                break label420;
              }
            }
          }
          for (String str3 = "No photo ID found for tile ID: ".concat(str2);; str3 = new String("No photo ID found for tile ID: "))
          {
            Log.e("EsTileData", str3);
            localArrayList.add(localipf1);
            break;
            m = 0;
            break label334;
          }
          localArrayList.add(ipf.a(paramContext, (String)localPair.first, ((Long)localPair.second).longValue(), localipf1.c, localipf1.d, localipf1.e));
          continue;
        }
        localArrayList.add(localipf1);
      }
      return localArrayList;
    }
  }
  
  @Deprecated
  private static void b(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase, okn paramokn, HashSet<Uri> paramHashSet, long paramLong)
  {
    String str1 = a(paramokn);
    ContentValues localContentValues = new ContentValues();
    a(paramContext, paramInt, paramokn, localContentValues);
    if (paramLong != -1L) {
      localContentValues.put("last_refresh_time", Long.valueOf(paramLong));
    }
    localContentValues.put("media_attr", Long.valueOf(0x2000 | 0x200 | localContentValues.getAsLong("media_attr").longValue()));
    String str2 = localContentValues.getAsString("tile_id");
    int k;
    String str3;
    if ((!TextUtils.isEmpty(str2)) && (!TextUtils.equals(str2, str1)))
    {
      k = 1;
      if (k == 0) {
        break label248;
      }
      str3 = "(tile_id = ? OR tile_id = ?) AND media_attr & 512 != 0";
      label112:
      if (k == 0) {
        break label256;
      }
    }
    Cursor localCursor;
    label256:
    for (String[] arrayOfString = { str1, str2 };; arrayOfString = new String[] { str1 })
    {
      for (;;)
      {
        paramSQLiteDatabase.update("all_tiles", localContentValues, str3, arrayOfString);
        hxi.a(paramSQLiteDatabase, paramokn, paramHashSet);
        localCursor = paramSQLiteDatabase.query("all_tiles", new String[] { "view_id" }, "tile_id = ? AND media_attr & 512 != 0", new String[] { str2 }, null, null, null);
        try
        {
          while (localCursor.moveToNext())
          {
            String str4 = localCursor.getString(0);
            paramHashSet.add(a.buildUpon().appendEncodedPath(str4).build());
          }
        }
        finally
        {
          localCursor.close();
        }
      }
      label248:
      str3 = "tile_id = ? AND media_attr & 512 != 0";
      break label112;
    }
    localCursor.close();
    paramHashSet.add(b.buildUpon().appendEncodedPath(str1).build());
  }
  
  public static void b(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    String[] arrayOfString = { paramString1 };
    ContentValues localContentValues = new ContentValues(3);
    localContentValues.put("view_id", paramString1);
    if (TextUtils.isEmpty(paramString2)) {
      localContentValues.putNull("resume_token");
    }
    for (;;)
    {
      if (paramBoolean) {
        localContentValues.put("last_refresh_time", Long.valueOf(System.currentTimeMillis()));
      }
      if (DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT count(*) FROM tile_requests WHERE view_id = ?", arrayOfString) != 0L) {
        break;
      }
      localSQLiteDatabase.insert("tile_requests", null, localContentValues);
      return;
      localContentValues.put("resume_token", paramString2);
    }
    localSQLiteDatabase.update("tile_requests", localContentValues, "view_id = ?", arrayOfString);
  }
  
  public static Pair<String, Long> c(Context paramContext, int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getWritableDatabase();
    String[] arrayOfString = { paramString };
    Cursor localCursor = localSQLiteDatabase.query("tile_requests", g, "view_id = ?", arrayOfString, null, null, null);
    try
    {
      if (localCursor.moveToFirst())
      {
        Pair localPair = new Pair(localCursor.getString(0), Long.valueOf(localCursor.getLong(1)));
        return localPair;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static String c(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Cluster ID must not be null");
    }
    String[] arrayOfString = TextUtils.split(paramString, ":");
    String str;
    if (("album".equals(arrayOfString[0])) && (arrayOfString.length >= 2))
    {
      int m = arrayOfString.length;
      str = null;
      if (m == 5) {
        str = arrayOfString[1];
      }
    }
    int k;
    do
    {
      boolean bool;
      do
      {
        return str;
        bool = "albums".equals(arrayOfString[0]);
        str = null;
      } while (!bool);
      k = arrayOfString.length;
      str = null;
    } while (k != 2);
    return arrayOfString[1];
  }
  
  @Deprecated
  private static void c(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase, okn paramokn, HashSet<Uri> paramHashSet, long paramLong)
  {
    String str1 = a(paramokn);
    ContentValues localContentValues = new ContentValues();
    a(paramContext, paramInt, paramokn, localContentValues);
    if (paramLong != -1L) {
      localContentValues.put("last_refresh_time", Long.valueOf(paramLong));
    }
    localContentValues.put("media_attr", Long.valueOf(0x2000 | localContentValues.getAsLong("media_attr").longValue()));
    if (paramSQLiteDatabase.update("all_tiles", localContentValues, "view_id LIKE 'notification:%' AND tile_id = ? AND media_attr & 512 == 0", new String[] { str1 }) > 0)
    {
      String str2 = localContentValues.getAsString("tile_id");
      Cursor localCursor = paramSQLiteDatabase.query("all_tiles", new String[] { "view_id" }, "view_id LIKE 'notification:%' AND tile_id = ? AND media_attr & 512 == 0", new String[] { str2 }, null, null, null);
      try
      {
        while (localCursor.moveToNext())
        {
          String str3 = localCursor.getString(0);
          paramHashSet.add(a.buildUpon().appendEncodedPath(str3).build());
        }
        paramHashSet.add(b.buildUpon().appendEncodedPath(str1).build());
      }
      finally
      {
        localCursor.close();
      }
    }
  }
  
  public static String d(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Cluster ID must not be null");
    }
    String[] arrayOfString = TextUtils.split(paramString, ":");
    if (("album".equals(arrayOfString[0])) && (arrayOfString.length >= 2))
    {
      if (arrayOfString.length == 5) {
        return arrayOfString[2];
      }
      return arrayOfString[1];
    }
    return null;
  }
  
  public static Set<String> d(Context paramContext, int paramInt, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    localHashSet = new HashSet();
    SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(paramContext, hrz.class)).b(paramContext, paramInt).getReadableDatabase();
    String[] arrayOfString = { "photo_id" };
    String str1 = String.valueOf("view_id='");
    Cursor localCursor = localSQLiteDatabase.query("all_tiles", arrayOfString, 1 + String.valueOf(str1).length() + String.valueOf(paramString).length() + str1 + paramString + "'", null, null, null, null);
    try
    {
      while (localCursor.moveToNext())
      {
        String str2 = localCursor.getString(0);
        if (!TextUtils.isEmpty(str2)) {
          localHashSet.add(str2);
        }
      }
      return localHashSet;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static String e(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Cluster ID must not be null");
    }
    String[] arrayOfString = TextUtils.split(paramString, ":");
    if (("album".equals(arrayOfString[0])) && (arrayOfString.length == 5)) {
      return arrayOfString[3];
    }
    return null;
  }
  
  public static int f(String paramString)
  {
    String str = g(paramString);
    int k;
    if ("PLUS_EVENT".equals(str)) {
      k = 1;
    }
    boolean bool;
    do
    {
      return k;
      if ("PHOTO_COLLECTION".equals(str)) {
        return 2;
      }
      if ("ALBUM".equals(str)) {
        return 3;
      }
      bool = "AD_HOC".equals(str);
      k = 0;
    } while (!bool);
    return 4;
  }
  
  @Deprecated
  public static String g(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Cluster ID must not be null");
    }
    String[] arrayOfString = TextUtils.split(paramString, ":");
    if (("album".equals(arrayOfString[0])) && (arrayOfString.length == 5)) {
      return arrayOfString[4];
    }
    return null;
  }
  
  public static String h(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("album ID must not be null");
    }
    String[] arrayOfString = TextUtils.split(paramString, "@");
    if ((arrayOfString.length == 2) && ("~folder".equals(arrayOfString[0]))) {
      return arrayOfString[1];
    }
    return null;
  }
  
  public static boolean i(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {}
    for (String str = g(paramString);; str = null) {
      return "PLUS_EVENT".equals(str);
    }
  }
  
  public static String j(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("cluster ID must not be null");
    }
    String str = d(paramString);
    if (str != null) {
      return h(str);
    }
    return null;
  }
  
  public static String k(String paramString)
  {
    String[] arrayOfString = new String[1];
    String str1 = String.valueOf("~folder@");
    if (TextUtils.isEmpty(paramString)) {
      paramString = "";
    }
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      arrayOfString[0] = a(null, null, str3, "ALBUM");
      return a(3, arrayOfString);
    }
  }
  
  public static boolean l(String paramString)
  {
    String str = d(paramString);
    return (m(paramString)) && (TextUtils.isEmpty(h(str)));
  }
  
  public static boolean m(String paramString)
  {
    String str = d(paramString);
    if (str == null) {}
    while ((str.lastIndexOf('@') != 7) || (!str.startsWith("~folder"))) {
      return false;
    }
    return true;
  }
  
  @Deprecated
  public static boolean n(String paramString)
  {
    return (TextUtils.equals(d(paramString), "~pending_photos_of_user")) || (TextUtils.equals(d(paramString), "~approved_photos_of_user"));
  }
  
  @Deprecated
  public static String o(String paramString)
  {
    return a(3, new String[] { a(null, paramString, "~photos_of_user_home", "ALBUM") });
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jrf
 * JD-Core Version:    0.7.0.1
 */