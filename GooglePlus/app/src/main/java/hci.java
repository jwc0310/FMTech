import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.libraries.social.autobackup.MediaRecordEntry;

public class hci
  extends SQLiteOpenHelper
{
  final Context a;
  private final hcj b;
  
  protected hci(Context paramContext)
  {
    super(paramContext, "iu.upload.db", null, 34);
    this.a = paramContext;
    this.b = new hcj(paramContext);
  }
  
  public SQLiteDatabase getReadableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase2 = super.getReadableDatabase();
      localObject2 = localSQLiteDatabase2;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        this.a.deleteDatabase("iu.upload.db");
        SQLiteDatabase localSQLiteDatabase1 = super.getReadableDatabase();
        Object localObject2 = localSQLiteDatabase1;
      }
    }
    finally {}
    return localObject2;
  }
  
  public SQLiteDatabase getWritableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase2 = super.getWritableDatabase();
      localObject2 = localSQLiteDatabase2;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        this.a.deleteDatabase("iu.upload.db");
        SQLiteDatabase localSQLiteDatabase1 = super.getWritableDatabase();
        Object localObject2 = localSQLiteDatabase1;
      }
    }
    finally {}
    return localObject2;
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    MediaRecordEntry.a.a(paramSQLiteDatabase);
    paramSQLiteDatabase.execSQL("CREATE TABLE server_fingerprints (_id INTEGER PRIMARY KEY, fingerprint TEXT NOT NULL, image_url TEXT, photo_id INT NOT NULL DEFAULT(0), owner_id TEXT NOT NULL, UNIQUE (owner_id, image_url), UNIQUE (owner_id, photo_id));");
    paramSQLiteDatabase.execSQL("CREATE INDEX server_fingerprints_image_url ON server_fingerprints(image_url)");
    hco.a(paramSQLiteDatabase);
    hbo.a(paramSQLiteDatabase);
  }
  
  /* Error */
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc 73
    //   2: iconst_4
    //   3: invokestatic 79	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   6: ifeq +31 -> 37
    //   9: new 81	java/lang/StringBuilder
    //   12: dup
    //   13: bipush 45
    //   15: invokespecial 84	java/lang/StringBuilder:<init>	(I)V
    //   18: ldc 86
    //   20: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: iload_2
    //   24: invokevirtual 93	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   27: ldc 95
    //   29: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: iload_3
    //   33: invokevirtual 93	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload_0
    //   38: getfield 23	hci:b	Lhcj;
    //   41: astore 4
    //   43: iload_2
    //   44: bipush 6
    //   46: if_icmpge +15 -> 61
    //   49: aload_1
    //   50: ldc 97
    //   52: invokevirtual 57	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   55: aload_1
    //   56: ldc 99
    //   58: invokevirtual 57	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   61: iload_2
    //   62: bipush 7
    //   64: if_icmpge +50 -> 114
    //   67: aload 4
    //   69: getfield 100	hcj:a	Landroid/content/Context;
    //   72: invokestatic 106	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   75: invokeinterface 112 1 0
    //   80: ldc 114
    //   82: invokeinterface 120 2 0
    //   87: ldc 122
    //   89: invokeinterface 120 2 0
    //   94: ldc 124
    //   96: invokeinterface 120 2 0
    //   101: ldc 126
    //   103: invokeinterface 120 2 0
    //   108: invokeinterface 130 1 0
    //   113: pop
    //   114: iload_2
    //   115: bipush 13
    //   117: if_icmpge +672 -> 789
    //   120: aload_1
    //   121: ldc 132
    //   123: invokevirtual 57	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   126: aload 4
    //   128: getfield 100	hcj:a	Landroid/content/Context;
    //   131: invokestatic 106	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   134: astore 8
    //   136: aload 8
    //   138: ldc 114
    //   140: lconst_0
    //   141: invokeinterface 136 4 0
    //   146: lstore 9
    //   148: aload 8
    //   150: ldc 122
    //   152: lconst_0
    //   153: invokeinterface 136 4 0
    //   158: lstore 11
    //   160: aload 8
    //   162: ldc 124
    //   164: lconst_0
    //   165: invokeinterface 136 4 0
    //   170: lstore 13
    //   172: aload 8
    //   174: ldc 126
    //   176: lconst_0
    //   177: invokeinterface 136 4 0
    //   182: lstore 15
    //   184: new 138	android/content/ContentValues
    //   187: dup
    //   188: iconst_5
    //   189: invokespecial 139	android/content/ContentValues:<init>	(I)V
    //   192: astore 17
    //   194: aload 17
    //   196: ldc 141
    //   198: invokevirtual 144	android/content/ContentValues:putNull	(Ljava/lang/String;)V
    //   201: aload 17
    //   203: ldc 146
    //   205: invokevirtual 144	android/content/ContentValues:putNull	(Ljava/lang/String;)V
    //   208: aload 17
    //   210: ldc 148
    //   212: lload 9
    //   214: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   217: invokevirtual 158	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   220: aload 17
    //   222: ldc 160
    //   224: ldc 162
    //   226: invokevirtual 165	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   229: aload 17
    //   231: ldc 167
    //   233: ldc 169
    //   235: invokevirtual 165	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   238: aload_1
    //   239: ldc 171
    //   241: aconst_null
    //   242: aload 17
    //   244: invokevirtual 175	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   247: pop2
    //   248: aload 17
    //   250: ldc 148
    //   252: lload 11
    //   254: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   257: invokevirtual 158	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   260: aload 17
    //   262: ldc 160
    //   264: ldc 177
    //   266: invokevirtual 165	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   269: aload 17
    //   271: ldc 167
    //   273: ldc 169
    //   275: invokevirtual 165	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   278: aload_1
    //   279: ldc 171
    //   281: aconst_null
    //   282: aload 17
    //   284: invokevirtual 175	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   287: pop2
    //   288: aload 17
    //   290: ldc 148
    //   292: lload 13
    //   294: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   297: invokevirtual 158	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   300: aload 17
    //   302: ldc 160
    //   304: ldc 162
    //   306: invokevirtual 165	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   309: aload 17
    //   311: ldc 167
    //   313: ldc 179
    //   315: invokevirtual 165	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   318: aload_1
    //   319: ldc 171
    //   321: aconst_null
    //   322: aload 17
    //   324: invokevirtual 175	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   327: pop2
    //   328: aload 17
    //   330: ldc 148
    //   332: lload 15
    //   334: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   337: invokevirtual 158	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   340: aload 17
    //   342: ldc 160
    //   344: ldc 177
    //   346: invokevirtual 165	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   349: aload 17
    //   351: ldc 167
    //   353: ldc 179
    //   355: invokevirtual 165	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   358: aload_1
    //   359: ldc 171
    //   361: aconst_null
    //   362: aload 17
    //   364: invokevirtual 175	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   367: pop2
    //   368: aload 8
    //   370: invokeinterface 112 1 0
    //   375: ldc 114
    //   377: invokeinterface 120 2 0
    //   382: ldc 122
    //   384: invokeinterface 120 2 0
    //   389: ldc 124
    //   391: invokeinterface 120 2 0
    //   396: ldc 126
    //   398: invokeinterface 120 2 0
    //   403: invokeinterface 130 1 0
    //   408: pop
    //   409: bipush 13
    //   411: istore 6
    //   413: iload 6
    //   415: bipush 14
    //   417: if_icmpge +378 -> 795
    //   420: aload_1
    //   421: invokestatic 180	hcj:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   424: bipush 14
    //   426: istore 6
    //   428: goto +367 -> 795
    //   431: iload 6
    //   433: bipush 16
    //   435: if_icmpge +15 -> 450
    //   438: aload 4
    //   440: getfield 100	hcj:a	Landroid/content/Context;
    //   443: invokestatic 184	com/google/android/libraries/social/autobackup/AutoBackupProvider:a	(Landroid/content/Context;)V
    //   446: bipush 16
    //   448: istore 6
    //   450: iload 6
    //   452: bipush 17
    //   454: if_icmpge +11 -> 465
    //   457: aload_1
    //   458: invokestatic 186	hcj:b	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   461: bipush 17
    //   463: istore 6
    //   465: iload 6
    //   467: bipush 18
    //   469: if_icmpge +18 -> 487
    //   472: aload 4
    //   474: getfield 100	hcj:a	Landroid/content/Context;
    //   477: ldc 188
    //   479: invokevirtual 35	android/content/Context:deleteDatabase	(Ljava/lang/String;)Z
    //   482: pop
    //   483: bipush 18
    //   485: istore 6
    //   487: iload 6
    //   489: bipush 19
    //   491: if_icmpge +11 -> 502
    //   494: aload_1
    //   495: invokestatic 191	hcj:c	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   498: bipush 19
    //   500: istore 6
    //   502: iload 6
    //   504: bipush 20
    //   506: if_icmpge +11 -> 517
    //   509: aload_1
    //   510: invokestatic 194	hcj:d	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   513: bipush 20
    //   515: istore 6
    //   517: iload 6
    //   519: bipush 21
    //   521: if_icmpge +288 -> 809
    //   524: aload_1
    //   525: invokestatic 197	hcj:e	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   528: bipush 21
    //   530: istore 6
    //   532: goto +277 -> 809
    //   535: iload 6
    //   537: bipush 23
    //   539: if_icmpge +11 -> 550
    //   542: aload_1
    //   543: invokestatic 200	hcj:f	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   546: bipush 23
    //   548: istore 6
    //   550: iload 6
    //   552: bipush 24
    //   554: if_icmpge +11 -> 565
    //   557: aload_1
    //   558: invokestatic 203	hcj:g	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   561: bipush 24
    //   563: istore 6
    //   565: iload 6
    //   567: bipush 25
    //   569: if_icmpge +11 -> 580
    //   572: aload_1
    //   573: invokestatic 206	hcj:h	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   576: bipush 25
    //   578: istore 6
    //   580: iload 6
    //   582: bipush 26
    //   584: if_icmpge +13 -> 597
    //   587: aload 4
    //   589: aload_1
    //   590: invokevirtual 209	hcj:i	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   593: bipush 26
    //   595: istore 6
    //   597: iload 6
    //   599: bipush 27
    //   601: if_icmpge +11 -> 612
    //   604: aload_1
    //   605: invokestatic 212	hcj:j	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   608: bipush 27
    //   610: istore 6
    //   612: iload 6
    //   614: bipush 28
    //   616: if_icmpge +11 -> 627
    //   619: aload_1
    //   620: invokestatic 215	hcj:k	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   623: bipush 28
    //   625: istore 6
    //   627: iload 6
    //   629: bipush 29
    //   631: if_icmpge +192 -> 823
    //   634: aload_1
    //   635: invokestatic 218	hcj:l	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   638: bipush 29
    //   640: istore 6
    //   642: goto +181 -> 823
    //   645: iload 6
    //   647: bipush 31
    //   649: if_icmpge +11 -> 660
    //   652: aload_1
    //   653: invokestatic 221	hcj:m	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   656: bipush 31
    //   658: istore 6
    //   660: iload 6
    //   662: bipush 32
    //   664: if_icmpge +13 -> 677
    //   667: aload 4
    //   669: aload_1
    //   670: invokevirtual 224	hcj:n	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   673: bipush 32
    //   675: istore 6
    //   677: iload 6
    //   679: bipush 33
    //   681: if_icmpge +9 -> 690
    //   684: aload 4
    //   686: aload_1
    //   687: invokevirtual 227	hcj:o	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   690: return
    //   691: astore 5
    //   693: iload_2
    //   694: istore 6
    //   696: aload 4
    //   698: getfield 230	hcj:b	Lhan;
    //   701: aload 4
    //   703: getfield 100	hcj:a	Landroid/content/Context;
    //   706: aload 5
    //   708: aconst_null
    //   709: ldc 12
    //   711: iload_2
    //   712: iload_3
    //   713: iload 6
    //   715: invokeinterface 235 8 0
    //   720: ldc 237
    //   722: bipush 6
    //   724: invokestatic 79	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   727: ifeq +42 -> 769
    //   730: ldc 237
    //   732: new 81	java/lang/StringBuilder
    //   735: dup
    //   736: bipush 55
    //   738: invokespecial 84	java/lang/StringBuilder:<init>	(I)V
    //   741: ldc 239
    //   743: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   746: iload 6
    //   748: invokevirtual 93	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   751: ldc 95
    //   753: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   756: iload_3
    //   757: invokevirtual 93	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   760: invokevirtual 243	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   763: aload 5
    //   765: invokestatic 246	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   768: pop
    //   769: new 248	java/lang/RuntimeException
    //   772: dup
    //   773: aload 5
    //   775: invokespecial 251	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   778: athrow
    //   779: astore 5
    //   781: goto -85 -> 696
    //   784: astore 29
    //   786: goto -725 -> 61
    //   789: iload_2
    //   790: istore 6
    //   792: goto -379 -> 413
    //   795: iload 6
    //   797: bipush 15
    //   799: if_icmpge -368 -> 431
    //   802: bipush 15
    //   804: istore 6
    //   806: goto -375 -> 431
    //   809: iload 6
    //   811: bipush 22
    //   813: if_icmpge -278 -> 535
    //   816: bipush 22
    //   818: istore 6
    //   820: goto -285 -> 535
    //   823: iload 6
    //   825: bipush 30
    //   827: if_icmpge -182 -> 645
    //   830: bipush 30
    //   832: istore 6
    //   834: goto -189 -> 645
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	837	0	this	hci
    //   0	837	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	837	2	paramInt1	int
    //   0	837	3	paramInt2	int
    //   41	661	4	localhcj	hcj
    //   691	83	5	localException1	java.lang.Exception
    //   779	1	5	localException2	java.lang.Exception
    //   411	422	6	i	int
    //   134	235	8	localSharedPreferences	android.content.SharedPreferences
    //   146	67	9	l1	long
    //   158	95	11	l2	long
    //   170	123	13	l3	long
    //   182	151	15	l4	long
    //   192	171	17	localContentValues	android.content.ContentValues
    //   784	1	29	localSQLiteException	android.database.sqlite.SQLiteException
    // Exception table:
    //   from	to	target	type
    //   49	61	691	java/lang/Exception
    //   67	114	691	java/lang/Exception
    //   120	409	691	java/lang/Exception
    //   420	424	779	java/lang/Exception
    //   438	446	779	java/lang/Exception
    //   457	461	779	java/lang/Exception
    //   472	483	779	java/lang/Exception
    //   494	498	779	java/lang/Exception
    //   509	513	779	java/lang/Exception
    //   524	528	779	java/lang/Exception
    //   542	546	779	java/lang/Exception
    //   557	561	779	java/lang/Exception
    //   572	576	779	java/lang/Exception
    //   587	593	779	java/lang/Exception
    //   604	608	779	java/lang/Exception
    //   619	623	779	java/lang/Exception
    //   634	638	779	java/lang/Exception
    //   652	656	779	java/lang/Exception
    //   667	673	779	java/lang/Exception
    //   684	690	779	java/lang/Exception
    //   49	61	784	android/database/sqlite/SQLiteException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hci
 * JD-Core Version:    0.7.0.1
 */