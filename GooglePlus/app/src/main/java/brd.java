import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.apps.plus.content.EsProvider;

public final class brd
{
  private static final Object a = new Object();
  
  static void a() {}
  
  public static void a(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    try
    {
      localSQLiteDatabase.delete("network_data_transactions", null, null);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      paramContext.getContentResolver().notifyChange(EsProvider.a(EsProvider.h(paramContext), paramInt), null);
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  /* Error */
  public static void a(Context paramContext, int paramInt, kbx paramkbx, java.lang.Exception paramException)
  {
    // Byte code:
    //   0: invokestatic 70	dun:b	()Z
    //   3: ifeq +15 -> 18
    //   6: aload_2
    //   7: ifnonnull +12 -> 19
    //   10: new 72	java/lang/Throwable
    //   13: dup
    //   14: invokespecial 73	java/lang/Throwable:<init>	()V
    //   17: pop
    //   18: return
    //   19: aload_3
    //   20: ifnonnull +365 -> 385
    //   23: aload_2
    //   24: ldc 75
    //   26: ldc 77
    //   28: invokevirtual 82	kbx:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   31: iload_1
    //   32: iconst_m1
    //   33: if_icmpeq -15 -> 18
    //   36: aload_0
    //   37: iload_1
    //   38: invokestatic 19	bqj:a	(Landroid/content/Context;I)Lbqj;
    //   41: invokevirtual 23	bqj:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   44: astore 10
    //   46: aload 10
    //   48: invokevirtual 28	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   51: new 84	android/content/ContentValues
    //   54: dup
    //   55: invokespecial 85	android/content/ContentValues:<init>	()V
    //   58: astore 11
    //   60: aload 11
    //   62: ldc 87
    //   64: aload_2
    //   65: invokevirtual 90	kbx:b	()Ljava/lang/String;
    //   68: invokevirtual 93	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   71: aload 11
    //   73: ldc 95
    //   75: invokestatic 101	java/lang/System:currentTimeMillis	()J
    //   78: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   81: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   84: aload 11
    //   86: ldc 112
    //   88: aload_2
    //   89: invokevirtual 115	kbx:c	()J
    //   92: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   95: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   98: aload 11
    //   100: ldc 117
    //   102: aload_2
    //   103: invokevirtual 120	kbx:d	()J
    //   106: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   109: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   112: aload 11
    //   114: ldc 122
    //   116: aload_2
    //   117: invokevirtual 125	kbx:g	()J
    //   120: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   123: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   126: aload 11
    //   128: ldc 127
    //   130: aload_2
    //   131: invokevirtual 130	kbx:f	()J
    //   134: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   137: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   140: aload 11
    //   142: ldc 132
    //   144: aload_2
    //   145: invokevirtual 135	kbx:e	()J
    //   148: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   151: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   154: aload 11
    //   156: ldc 137
    //   158: aload_2
    //   159: getfield 140	kbx:a	Lkby;
    //   162: getfield 146	kby:i	Ljava/lang/String;
    //   165: invokevirtual 93	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   168: aload 11
    //   170: ldc 148
    //   172: aload_2
    //   173: getfield 140	kbx:a	Lkby;
    //   176: getfield 151	kby:g	J
    //   179: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   182: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   185: aload_3
    //   186: ifnull +87 -> 273
    //   189: aload_3
    //   190: invokevirtual 156	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   193: ifnull +276 -> 469
    //   196: aload_3
    //   197: invokevirtual 160	java/lang/Object:getClass	()Ljava/lang/Class;
    //   200: invokevirtual 165	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   203: invokestatic 170	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   206: astore 24
    //   208: aload_3
    //   209: invokevirtual 156	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   212: invokestatic 170	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   215: astore 25
    //   217: aload 11
    //   219: ldc 172
    //   221: new 174	java/lang/StringBuilder
    //   224: dup
    //   225: iconst_2
    //   226: aload 24
    //   228: invokestatic 170	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   231: invokevirtual 178	java/lang/String:length	()I
    //   234: iadd
    //   235: aload 25
    //   237: invokestatic 170	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   240: invokevirtual 178	java/lang/String:length	()I
    //   243: iadd
    //   244: invokespecial 181	java/lang/StringBuilder:<init>	(I)V
    //   247: aload 24
    //   249: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: ldc 187
    //   254: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: aload 25
    //   259: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: ldc 189
    //   264: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: invokevirtual 192	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   270: invokevirtual 93	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   273: aload 10
    //   275: ldc 30
    //   277: ldc 194
    //   279: aload 11
    //   281: invokevirtual 198	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   284: pop2
    //   285: aload 10
    //   287: invokestatic 201	brd:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   290: aload_3
    //   291: ifnonnull +51 -> 342
    //   294: iconst_1
    //   295: anewarray 167	java/lang/String
    //   298: dup
    //   299: iconst_0
    //   300: aload_2
    //   301: invokevirtual 90	kbx:b	()Ljava/lang/String;
    //   304: aastore
    //   305: astore 15
    //   307: getstatic 13	brd:a	Ljava/lang/Object;
    //   310: astore 16
    //   312: aload 16
    //   314: monitorenter
    //   315: aload 10
    //   317: ldc 203
    //   319: getstatic 208	bre:a	[Ljava/lang/String;
    //   322: ldc 210
    //   324: aload 15
    //   326: aconst_null
    //   327: aconst_null
    //   328: aconst_null
    //   329: invokevirtual 214	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   332: astore 18
    //   334: aload 18
    //   336: ifnonnull +160 -> 496
    //   339: aload 16
    //   341: monitorexit
    //   342: aload 10
    //   344: invokevirtual 37	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   347: aload 10
    //   349: invokevirtual 40	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   352: aload_0
    //   353: invokevirtual 46	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   356: aload_0
    //   357: invokestatic 52	com/google/android/apps/plus/content/EsProvider:h	(Landroid/content/Context;)Landroid/net/Uri;
    //   360: iload_1
    //   361: invokestatic 55	com/google/android/apps/plus/content/EsProvider:a	(Landroid/net/Uri;I)Landroid/net/Uri;
    //   364: aconst_null
    //   365: invokevirtual 61	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   368: aload_0
    //   369: invokevirtual 46	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   372: aload_0
    //   373: invokestatic 216	com/google/android/apps/plus/content/EsProvider:i	(Landroid/content/Context;)Landroid/net/Uri;
    //   376: iload_1
    //   377: invokestatic 55	com/google/android/apps/plus/content/EsProvider:a	(Landroid/net/Uri;I)Landroid/net/Uri;
    //   380: aconst_null
    //   381: invokevirtual 61	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   384: return
    //   385: aload_3
    //   386: invokestatic 170	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   389: astore 5
    //   391: aload_2
    //   392: ldc 75
    //   394: new 174	java/lang/StringBuilder
    //   397: dup
    //   398: iconst_3
    //   399: aload 5
    //   401: invokestatic 170	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   404: invokevirtual 178	java/lang/String:length	()I
    //   407: iadd
    //   408: invokespecial 181	java/lang/StringBuilder:<init>	(I)V
    //   411: ldc 77
    //   413: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   416: aload 5
    //   418: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   421: invokevirtual 192	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   424: invokevirtual 82	kbx:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   427: goto -396 -> 31
    //   430: astore 6
    //   432: aload_2
    //   433: invokevirtual 90	kbx:b	()Ljava/lang/String;
    //   436: invokestatic 170	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   439: astore 7
    //   441: aload 7
    //   443: invokevirtual 178	java/lang/String:length	()I
    //   446: ifeq +12 -> 458
    //   449: ldc 218
    //   451: aload 7
    //   453: invokevirtual 222	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   456: pop
    //   457: return
    //   458: new 167	java/lang/String
    //   461: dup
    //   462: ldc 218
    //   464: invokespecial 225	java/lang/String:<init>	(Ljava/lang/String;)V
    //   467: pop
    //   468: return
    //   469: aload 11
    //   471: ldc 172
    //   473: aload_3
    //   474: invokevirtual 160	java/lang/Object:getClass	()Ljava/lang/Class;
    //   477: invokevirtual 165	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   480: invokevirtual 93	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   483: goto -210 -> 273
    //   486: astore 12
    //   488: aload 10
    //   490: invokevirtual 40	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   493: aload 12
    //   495: athrow
    //   496: new 84	android/content/ContentValues
    //   499: dup
    //   500: invokespecial 85	android/content/ContentValues:<init>	()V
    //   503: astore 19
    //   505: aload 18
    //   507: invokeinterface 230 1 0
    //   512: ifeq +166 -> 678
    //   515: aload 19
    //   517: ldc 232
    //   519: invokestatic 101	java/lang/System:currentTimeMillis	()J
    //   522: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   525: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   528: aload 19
    //   530: ldc 112
    //   532: aload_2
    //   533: invokevirtual 115	kbx:c	()J
    //   536: aload 18
    //   538: iconst_0
    //   539: invokeinterface 236 2 0
    //   544: ladd
    //   545: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   548: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   551: aload 19
    //   553: ldc 117
    //   555: aload_2
    //   556: invokevirtual 120	kbx:d	()J
    //   559: aload 18
    //   561: iconst_1
    //   562: invokeinterface 236 2 0
    //   567: ladd
    //   568: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   571: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   574: aload 19
    //   576: ldc 122
    //   578: aload_2
    //   579: invokevirtual 125	kbx:g	()J
    //   582: aload 18
    //   584: iconst_2
    //   585: invokeinterface 236 2 0
    //   590: ladd
    //   591: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   594: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   597: aload 19
    //   599: ldc 127
    //   601: aload_2
    //   602: invokevirtual 130	kbx:f	()J
    //   605: aload 18
    //   607: iconst_3
    //   608: invokeinterface 236 2 0
    //   613: ladd
    //   614: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   617: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   620: aload 19
    //   622: ldc 132
    //   624: aload 18
    //   626: iconst_4
    //   627: invokeinterface 236 2 0
    //   632: aload_2
    //   633: invokevirtual 135	kbx:e	()J
    //   636: ladd
    //   637: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   640: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   643: aload 10
    //   645: ldc 203
    //   647: aload 19
    //   649: ldc 210
    //   651: aload 15
    //   653: invokevirtual 240	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   656: pop
    //   657: aload 18
    //   659: invokeinterface 243 1 0
    //   664: aload 16
    //   666: monitorexit
    //   667: goto -325 -> 342
    //   670: astore 17
    //   672: aload 16
    //   674: monitorexit
    //   675: aload 17
    //   677: athrow
    //   678: aload 19
    //   680: ldc 87
    //   682: aload_2
    //   683: invokevirtual 90	kbx:b	()Ljava/lang/String;
    //   686: invokevirtual 93	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   689: aload 19
    //   691: ldc 245
    //   693: invokestatic 101	java/lang/System:currentTimeMillis	()J
    //   696: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   699: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   702: aload 19
    //   704: ldc 232
    //   706: invokestatic 101	java/lang/System:currentTimeMillis	()J
    //   709: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   712: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   715: aload 19
    //   717: ldc 112
    //   719: aload_2
    //   720: invokevirtual 115	kbx:c	()J
    //   723: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   726: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   729: aload 19
    //   731: ldc 117
    //   733: aload_2
    //   734: invokevirtual 120	kbx:d	()J
    //   737: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   740: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   743: aload 19
    //   745: ldc 122
    //   747: aload_2
    //   748: invokevirtual 125	kbx:g	()J
    //   751: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   754: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   757: aload 19
    //   759: ldc 127
    //   761: aload_2
    //   762: invokevirtual 130	kbx:f	()J
    //   765: invokestatic 107	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   768: invokevirtual 110	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   771: aload 19
    //   773: ldc 132
    //   775: iconst_1
    //   776: invokestatic 250	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   779: invokevirtual 253	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   782: aload 10
    //   784: ldc 203
    //   786: ldc 194
    //   788: aload 19
    //   790: invokevirtual 198	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   793: pop2
    //   794: goto -137 -> 657
    //   797: astore 20
    //   799: aload 18
    //   801: invokeinterface 243 1 0
    //   806: aload 20
    //   808: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	809	0	paramContext	Context
    //   0	809	1	paramInt	int
    //   0	809	2	paramkbx	kbx
    //   0	809	3	paramException	java.lang.Exception
    //   389	28	5	str1	java.lang.String
    //   430	1	6	localIllegalArgumentException	java.lang.IllegalArgumentException
    //   439	13	7	str2	java.lang.String
    //   44	739	10	localSQLiteDatabase	SQLiteDatabase
    //   58	412	11	localContentValues1	android.content.ContentValues
    //   486	8	12	localObject1	Object
    //   305	347	15	arrayOfString	java.lang.String[]
    //   310	363	16	localObject2	Object
    //   670	6	17	localObject3	Object
    //   332	468	18	localCursor	Cursor
    //   503	286	19	localContentValues2	android.content.ContentValues
    //   797	10	20	localObject4	Object
    //   206	42	24	str3	java.lang.String
    //   215	43	25	str4	java.lang.String
    // Exception table:
    //   from	to	target	type
    //   36	46	430	java/lang/IllegalArgumentException
    //   51	185	486	finally
    //   189	273	486	finally
    //   273	290	486	finally
    //   294	315	486	finally
    //   342	347	486	finally
    //   469	483	486	finally
    //   675	678	486	finally
    //   315	334	670	finally
    //   339	342	670	finally
    //   657	667	670	finally
    //   672	675	670	finally
    //   799	809	670	finally
    //   496	657	797	finally
    //   678	794	797	finally
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    long l = bqj.a(paramSQLiteDatabase, "network_data_transactions", null, null);
    if (Log.isLoggable("EsNetworkData", 3)) {
      new StringBuilder(49).append("deleteOldTransactions count: ").append(l);
    }
    if (l - 100L <= 0L) {}
    Cursor localCursor;
    do
    {
      return;
      localCursor = paramSQLiteDatabase.query("network_data_transactions", brf.a, null, null, null, null, "time ASC", Long.toString(l - 100L));
    } while (localCursor == null);
    StringBuffer localStringBuffer = new StringBuffer(256);
    for (;;)
    {
      try
      {
        localStringBuffer.append("_id IN(");
        int i = 1;
        if (!localCursor.moveToNext()) {
          break;
        }
        if (i != 0)
        {
          i = 0;
          localStringBuffer.append('\'');
          localStringBuffer.append(localCursor.getString(0));
          localStringBuffer.append('\'');
        }
        else
        {
          localStringBuffer.append(',');
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    localStringBuffer.append(')');
    localCursor.close();
    paramSQLiteDatabase.delete("network_data_transactions", localStringBuffer.toString(), null);
  }
  
  public static void b(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    try
    {
      localSQLiteDatabase.delete("network_data_stats", null, null);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      paramContext.getContentResolver().notifyChange(EsProvider.a(EsProvider.i(paramContext), paramInt), null);
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     brd
 * JD-Core Version:    0.7.0.1
 */