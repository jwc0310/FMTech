import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class hmd
  implements hhh
{
  private final Context a;
  private final giz b;
  
  public hmd(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((giz)mbb.a(paramContext, giz.class));
  }
  
  private final Cursor a(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    hlk.a(this.a, null, false, paramInt, paramString1, paramString2);
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("ufcxnsview");
    String str;
    String[] arrayOfString;
    if (paramBoolean)
    {
      str = "follower_gaia_id=? AND follow_state=?";
      arrayOfString = new String[2];
      arrayOfString[0] = paramString1;
      arrayOfString[1] = "4";
    }
    for (;;)
    {
      return localSQLiteQueryBuilder.query(localSQLiteDatabase, hoi.a, str, arrayOfString, null, null, null, paramString3);
      str = "follower_gaia_id=?";
      arrayOfString = new String[] { paramString1 };
    }
  }
  
  private final long m(int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("cxns");
    Cursor localCursor = localSQLiteQueryBuilder.query(localSQLiteDatabase, new String[] { "sync_timestamp" }, "cxn_id = ? ", new String[] { paramString }, null, null, null);
    for (;;)
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          long l2 = localCursor.getLong(localCursor.getColumnIndex("sync_timestamp"));
          l1 = l2;
          return l1;
        }
      }
      finally
      {
        localCursor.close();
      }
      long l1 = 0L;
    }
  }
  
  public final Cursor a(int paramInt)
  {
    return a(paramInt, null, false, new hhg().a().a);
  }
  
  public final Cursor a(int paramInt, String paramString)
  {
    long l = m(paramInt, paramString);
    if (System.currentTimeMillis() - l > 900000L)
    {
      if (Log.isLoggable("CollexionsDataService", 3)) {
        new StringBuilder(52 + String.valueOf(paramString).length()).append("Collexion ").append(paramString).append(" is stale. Last Sync: ").append(l);
      }
      hlf.a(this.a, null, paramInt, paramString);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("cxns");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, hoi.a, "cxn_id = ? ", new String[] { paramString }, null, null, null);
  }
  
  public final Cursor a(int paramInt, String paramString1, String paramString2)
  {
    hld.a(this.a, paramInt, null, paramString1, false, null);
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("cxns_followers");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, hof.a, "cxn_id = ? ", new String[] { paramString1 }, null, null, "_id");
  }
  
  public final Cursor a(int paramInt, String paramString, boolean paramBoolean, Bundle paramBundle)
  {
    int i = 1;
    gjb localgjb = this.b.a(paramInt);
    String str1 = localgjb.b("gaia_id");
    long l1 = efj.b(this.a, paramInt, str1, i);
    long l2 = System.currentTimeMillis() - l1;
    if ((localgjb.c("is_google_plus")) && (l2 > 900000L))
    {
      if (Log.isLoggable("CollexionsDataService", 3)) {
        new StringBuilder(57).append("Collexions list is stale. Last Sync: ").append(l1);
      }
      hlj.a(this.a, null, paramInt);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("cxns");
    StringBuilder localStringBuilder = new StringBuilder("owner_gaia_id = ? ");
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(str1);
    if (!TextUtils.isEmpty(paramString))
    {
      localStringBuilder.append(" AND (cxn_name").append(" LIKE ?");
      localArrayList.add(String.valueOf(paramString).concat("%"));
      localStringBuilder.append(" OR cxn_name").append(" LIKE ?)");
      localArrayList.add(3 + String.valueOf(paramString).length() + "% " + paramString + "%");
    }
    if (paramBoolean)
    {
      localStringBuilder.append(" AND sharing_target_group_type").append(" = ? ");
      localArrayList.add("2");
    }
    localStringBuilder.append(" AND (");
    if (paramBundle.getBoolean("allowPublic", false))
    {
      localStringBuilder.append("visibility_type = ? ");
      localArrayList.add("1");
    }
    for (int j = i;; j = 0)
    {
      String str3;
      if (paramBundle.getBoolean("allowDomain", false)) {
        if (j != 0)
        {
          str3 = " OR ";
          localStringBuilder.append(str3);
          localStringBuilder.append("visibility_type = ? ");
          localArrayList.add("4");
        }
      }
      for (;;)
      {
        if (paramBundle.getBoolean("allowPrivate", false)) {
          if (i == 0) {
            break label503;
          }
        }
        label503:
        for (String str2 = " OR ";; str2 = "")
        {
          localStringBuilder.append(str2);
          localStringBuilder.append("visibility_type = ? ");
          localArrayList.add("2");
          localStringBuilder.append(" OR visibility_type").append(" = ?");
          localArrayList.add("3");
          localStringBuilder.append(" )");
          String[] arrayOfString = new String[localArrayList.size()];
          localArrayList.toArray(arrayOfString);
          return localSQLiteQueryBuilder.query(localSQLiteDatabase, hoi.a, localStringBuilder.toString(), arrayOfString, null, null, "last_used_timestamp desc");
          str3 = "";
          break;
        }
        i = j;
      }
    }
  }
  
  public final Cursor a(int paramInt, String paramString1, boolean paramBoolean, String paramString2)
  {
    return a(paramInt, paramString1, null, paramString2, paramBoolean);
  }
  
  public final fp a(Context paramContext, int paramInt)
  {
    return new hmi(paramContext, paramInt, hmk.a);
  }
  
  public final fp a(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    return new hmp(paramContext, paramInt, paramString, paramBoolean);
  }
  
  public final fp a(Context paramContext, int paramInt, String paramString1, boolean paramBoolean, String paramString2)
  {
    return new hmr(paramContext, paramInt, paramString1, paramBoolean, hmm.c, paramString2);
  }
  
  public final fp a(Context paramContext, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new hmh(paramContext, paramInt, null, paramBoolean1, paramBoolean2);
  }
  
  public final fu<hhf> a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    return new hmc(paramContext, paramInt, paramString1, paramString2);
  }
  
  public final gzf a(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    return new hlq(paramInt1, paramString1, paramString2, paramInt2);
  }
  
  public final gzf a(int paramInt1, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, int[] paramArrayOfInt)
  {
    return new hlb(paramInt1, null, paramString2, null, false, true, paramInt2, paramArrayOfInt);
  }
  
  public final gzf a(int paramInt, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    return new hlg(paramInt, paramString1, paramString2, paramArrayOfString);
  }
  
  public final String a()
  {
    return "SetCollexionPostPinnedStateTask";
  }
  
  /* Error */
  public final boolean a(int paramInt, qpk paramqpk)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnull +13 -> 14
    //   4: aload_2
    //   5: getfield 344	qpk:a	Ljava/lang/String;
    //   8: invokestatic 212	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   11: ifeq +5 -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_0
    //   17: getfield 17	hmd:a	Landroid/content/Context;
    //   20: iload_1
    //   21: invokestatic 346	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   24: astore_3
    //   25: getstatic 57	hoi:a	[Ljava/lang/String;
    //   28: astore 6
    //   30: iconst_1
    //   31: anewarray 50	java/lang/String
    //   34: astore 7
    //   36: aload 7
    //   38: iconst_0
    //   39: aload_2
    //   40: getfield 344	qpk:a	Ljava/lang/String;
    //   43: aastore
    //   44: aload_3
    //   45: ldc 67
    //   47: aload 6
    //   49: ldc 71
    //   51: aload 7
    //   53: aconst_null
    //   54: aconst_null
    //   55: aconst_null
    //   56: invokevirtual 351	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   59: astore 8
    //   61: aload 8
    //   63: astore 5
    //   65: aload 5
    //   67: invokeinterface 80 1 0
    //   72: istore 9
    //   74: aload 5
    //   76: ifnull +10 -> 86
    //   79: aload 5
    //   81: invokeinterface 91 1 0
    //   86: new 353	android/content/ContentValues
    //   89: dup
    //   90: invokespecial 354	android/content/ContentValues:<init>	()V
    //   93: astore 10
    //   95: aload 10
    //   97: ldc_w 356
    //   100: aload_2
    //   101: getfield 344	qpk:a	Ljava/lang/String;
    //   104: invokevirtual 360	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   107: aload 10
    //   109: ldc_w 362
    //   112: aload_2
    //   113: getfield 364	qpk:b	Ljava/lang/String;
    //   116: invokevirtual 360	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   119: aload 10
    //   121: ldc_w 366
    //   124: aload_2
    //   125: getfield 368	qpk:c	Ljava/lang/String;
    //   128: invokevirtual 360	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   131: aload_2
    //   132: getfield 372	qpk:d	Lqpo;
    //   135: ifnull +84 -> 219
    //   138: aload_2
    //   139: getfield 372	qpk:d	Lqpo;
    //   142: getfield 377	qpo:a	[Lqpn;
    //   145: ifnull +74 -> 219
    //   148: aload_2
    //   149: getfield 372	qpk:d	Lqpo;
    //   152: getfield 377	qpo:a	[Lqpn;
    //   155: arraylength
    //   156: ifle +63 -> 219
    //   159: aload 10
    //   161: ldc_w 379
    //   164: aload_2
    //   165: getfield 372	qpk:d	Lqpo;
    //   168: getfield 377	qpo:a	[Lqpn;
    //   171: iconst_0
    //   172: aaload
    //   173: getfield 382	qpn:b	Ljava/lang/String;
    //   176: invokevirtual 360	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   179: aload 10
    //   181: ldc_w 384
    //   184: aload_2
    //   185: getfield 372	qpk:d	Lqpo;
    //   188: getfield 377	qpo:a	[Lqpn;
    //   191: iconst_0
    //   192: aaload
    //   193: getfield 385	qpn:a	Ljava/lang/String;
    //   196: invokevirtual 360	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   199: aload 10
    //   201: ldc_w 387
    //   204: aload_2
    //   205: getfield 372	qpk:d	Lqpo;
    //   208: getfield 377	qpo:a	[Lqpn;
    //   211: iconst_0
    //   212: aaload
    //   213: getfield 388	qpn:c	Ljava/lang/String;
    //   216: invokevirtual 360	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   219: aload 10
    //   221: ldc_w 390
    //   224: aload_2
    //   225: getfield 393	qpk:e	I
    //   228: invokestatic 398	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   231: invokevirtual 401	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   234: aload_2
    //   235: getfield 405	qpk:f	Lqpl;
    //   238: ifnull +47 -> 285
    //   241: aload 10
    //   243: ldc_w 407
    //   246: aload_2
    //   247: getfield 405	qpk:f	Lqpl;
    //   250: getfield 412	qpl:a	Ljava/lang/Integer;
    //   253: invokevirtual 415	java/lang/Integer:intValue	()I
    //   256: aload_2
    //   257: getfield 405	qpk:f	Lqpl;
    //   260: getfield 417	qpl:b	Ljava/lang/Integer;
    //   263: invokevirtual 415	java/lang/Integer:intValue	()I
    //   266: aload_2
    //   267: getfield 405	qpk:f	Lqpl;
    //   270: getfield 419	qpl:c	Ljava/lang/Integer;
    //   273: invokevirtual 415	java/lang/Integer:intValue	()I
    //   276: invokestatic 425	android/graphics/Color:rgb	(III)I
    //   279: invokestatic 398	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   282: invokevirtual 401	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   285: aload_2
    //   286: getfield 429	qpk:g	Lqpm;
    //   289: ifnull +36 -> 325
    //   292: aload 10
    //   294: ldc_w 431
    //   297: aload_2
    //   298: getfield 429	qpk:g	Lqpm;
    //   301: getfield 434	qpm:a	I
    //   304: invokestatic 398	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   307: invokevirtual 401	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   310: aload 10
    //   312: ldc_w 436
    //   315: aload_2
    //   316: getfield 429	qpk:g	Lqpm;
    //   319: getfield 437	qpm:b	Ljava/lang/String;
    //   322: invokevirtual 360	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   325: iload 9
    //   327: ifeq +53 -> 380
    //   330: iconst_1
    //   331: anewarray 50	java/lang/String
    //   334: astore 13
    //   336: aload 13
    //   338: iconst_0
    //   339: aload_2
    //   340: getfield 344	qpk:a	Ljava/lang/String;
    //   343: aastore
    //   344: aload_3
    //   345: ldc 67
    //   347: aload 10
    //   349: ldc_w 439
    //   352: aload 13
    //   354: invokevirtual 443	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   357: pop
    //   358: iconst_1
    //   359: ireturn
    //   360: astore 4
    //   362: aconst_null
    //   363: astore 5
    //   365: aload 5
    //   367: ifnull +10 -> 377
    //   370: aload 5
    //   372: invokeinterface 91 1 0
    //   377: aload 4
    //   379: athrow
    //   380: aload_3
    //   381: ldc 67
    //   383: aconst_null
    //   384: aload 10
    //   386: iconst_5
    //   387: invokevirtual 447	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   390: pop2
    //   391: goto -33 -> 358
    //   394: astore 4
    //   396: goto -31 -> 365
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	399	0	this	hmd
    //   0	399	1	paramInt	int
    //   0	399	2	paramqpk	qpk
    //   24	357	3	localSQLiteDatabase	SQLiteDatabase
    //   360	18	4	localObject1	Object
    //   394	1	4	localObject2	Object
    //   63	308	5	localCursor1	Cursor
    //   28	20	6	arrayOfString1	String[]
    //   34	18	7	arrayOfString2	String[]
    //   59	3	8	localCursor2	Cursor
    //   72	254	9	bool	boolean
    //   93	292	10	localContentValues	ContentValues
    //   334	19	13	arrayOfString3	String[]
    // Exception table:
    //   from	to	target	type
    //   25	61	360	finally
    //   65	74	394	finally
  }
  
  public final boolean a(String paramString)
  {
    return TextUtils.equals("collexions", paramString);
  }
  
  public final Cursor b(int paramInt, String paramString)
  {
    long l = efj.b(this.a, paramInt, paramString, 1);
    if (System.currentTimeMillis() - l > 900000L)
    {
      if (Log.isLoggable("CollexionsDataService", 3)) {
        new StringBuilder(57).append("Collexions list is stale. Last Sync: ").append(l);
      }
      hll.a(this.a, null, paramInt, paramString);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("cxns");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, hoi.a, "owner_gaia_id = ? ", new String[] { paramString }, null, null, null, null);
  }
  
  public final Cursor b(int paramInt, String paramString1, String paramString2)
  {
    return a(paramInt, paramString1, null, null, false);
  }
  
  public final Parcelable b(int paramInt)
  {
    hot localhot = (hot)mbb.a(this.a, hot.class);
    gnb localgnb = localhot.a(paramInt);
    long l = localhot.a.a(paramInt).a("default_collexion_acl_sync_time", 0L);
    if ((this.b.a(paramInt).c("is_google_plus")) && ((localgnb == null) || (System.currentTimeMillis() - l > 21600000L)))
    {
      Context localContext = this.a;
      if (((hhn)mbb.a(localContext, hhn.class)).a(((hho)mbb.a(localContext, hho.class)).g(), 1)) {
        gzj.a(localContext, new hla(paramInt));
      }
    }
    return localgnb;
  }
  
  public final Cursor c(int paramInt, String paramString)
  {
    hli.a(this.a, null, paramInt, false, null);
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("fcxnsview");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, hok.a, null, null, null, null, null);
  }
  
  public final Cursor c(int paramInt, String paramString1, String paramString2)
  {
    if (this.b.a(paramInt).c("is_google_plus")) {
      hlh.a(this.a, null, paramInt, paramString1, false, null);
    }
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("cxnsfromcirclesview");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, hoi.a, "circles_owner_gaia_id = ? ", new String[] { paramString1 }, null, null, null);
  }
  
  public final nfn c(int paramInt)
  {
    hot localhot = (hot)mbb.a(this.a, hot.class);
    long l = localhot.a.a(paramInt).a("spaces_header_data_timestamp", 0L);
    nfn localnfn = localhot.e(paramInt);
    if ((localnfn == null) || (System.currentTimeMillis() - l > 86400000L))
    {
      Context localContext = this.a;
      if (((hhn)mbb.a(localContext, hhn.class)).a(((hho)mbb.a(localContext, hho.class)).f(), 1)) {
        gzj.a(localContext, new hle(paramInt));
      }
    }
    return localnfn;
  }
  
  public final Cursor d(int paramInt, String paramString)
  {
    return efj.c(this.a, paramInt, paramString, 1);
  }
  
  public final String d(int paramInt)
  {
    return efj.d(this.a, paramInt, this.b.a(paramInt).b("gaia_id"), 2);
  }
  
  public final boolean d(int paramInt, String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      return false;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, paramInt);
    ContentValues localContentValues = new ContentValues(2);
    localContentValues.put("gaia_id", paramString1);
    localContentValues.put("cxn_id", paramString2);
    localSQLiteDatabase.insertWithOnConflict("uvcxns", null, localContentValues, 5);
    return false;
  }
  
  public final Cursor e(int paramInt)
  {
    return efj.c(this.a, paramInt, this.b.a(paramInt).b("gaia_id"), 3);
  }
  
  public final Cursor e(int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("cxns");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, hoi.b, "cxn_id =?", new String[] { paramString }, null, null, null);
  }
  
  public final boolean e(int paramInt, String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      return false;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, paramInt);
    ContentValues localContentValues = new ContentValues(2);
    localContentValues.put("gaia_id", paramString1);
    localContentValues.put("cxn_id", paramString2);
    localSQLiteDatabase.insertWithOnConflict("uvcxns_hp", null, localContentValues, 5);
    return false;
  }
  
  public final Cursor f(int paramInt, String paramString)
  {
    return efj.c(this.a, paramInt, paramString, 4);
  }
  
  public final boolean f(int paramInt)
  {
    return ((hyi)mbb.a(this.a, hyi.class)).b(hhi.c, paramInt);
  }
  
  public final boolean g(int paramInt)
  {
    return ((hyi)mbb.a(this.a, hyi.class)).b(hhi.d, paramInt);
  }
  
  public final boolean g(int paramInt, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, paramInt);
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("cxn_id", paramString);
    localSQLiteDatabase.insertWithOnConflict("mvcxns", null, localContentValues, 5);
    return true;
  }
  
  public final boolean h(int paramInt)
  {
    return ((hyi)mbb.a(this.a, hyi.class)).b(hhi.e, paramInt);
  }
  
  public final boolean h(int paramInt, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, paramInt);
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("cxn_id", paramString);
    localSQLiteDatabase.insertWithOnConflict("mvcxns_hp", null, localContentValues, 5);
    return true;
  }
  
  public final void i(int paramInt)
  {
    hsb.a(this.a, paramInt).delete("mvcxns", null, null);
  }
  
  public final void i(int paramInt, String paramString)
  {
    hsb.a(this.a, paramInt).delete("uvcxns", "gaia_id = ? ", new String[] { paramString });
  }
  
  public final void j(int paramInt)
  {
    hsb.a(this.a, paramInt).delete("mvcxns_hp", null, null);
  }
  
  public final void j(int paramInt, String paramString)
  {
    hsb.a(this.a, paramInt).delete("uvcxns_hp", "gaia_id = ? ", new String[] { paramString });
  }
  
  public final Cursor k(int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("mvcxns_hp_view");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, hoi.a, null, null, null, null, null);
  }
  
  public final Cursor k(int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("uvcxns_hp_view");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, hoi.a, "gaia_id = ? ", new String[] { paramString }, null, null, null);
  }
  
  public final Cursor l(int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("mvcxns_view");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, hoi.a, null, null, null, null, null);
  }
  
  public final Cursor l(int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("uvcxns_view");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, hoi.a, "gaia_id = ? ", new String[] { paramString }, null, null, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmd
 * JD-Core Version:    0.7.0.1
 */