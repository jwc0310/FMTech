import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

public final class hlu
  extends gzf
{
  private static final String[] a = { "embed", "content_flags" };
  private static final String[] b = { "payload" };
  private final int c;
  private final String d;
  private final String l;
  private int m;
  
  public hlu(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    super("UpdateFollowStateInStreamTask");
    this.c = paramInt1;
    this.d = paramString1;
    this.l = paramString2;
    this.m = paramInt2;
  }
  
  public static int a(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    default: 
      throw new IllegalStateException(32 + "Invalid follow state " + paramInt);
    case 4: 
      return 1;
    }
    return 2;
  }
  
  /* Error */
  private final hae a(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 38	hlu:d	Ljava/lang/String;
    //   4: astore 4
    //   6: aload_1
    //   7: ldc 67
    //   9: getstatic 23	hlu:a	[Ljava/lang/String;
    //   12: ldc 69
    //   14: iconst_1
    //   15: anewarray 17	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: aload 4
    //   22: aastore
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: invokevirtual 75	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   29: astore 5
    //   31: aload 5
    //   33: astore_3
    //   34: aload_3
    //   35: invokeinterface 81 1 0
    //   40: ifne +77 -> 117
    //   43: aload_0
    //   44: getfield 38	hlu:d	Ljava/lang/String;
    //   47: invokestatic 85	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   50: astore 22
    //   52: aload 22
    //   54: invokevirtual 88	java/lang/String:length	()I
    //   57: ifeq +46 -> 103
    //   60: ldc 90
    //   62: aload 22
    //   64: invokevirtual 94	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   67: astore 23
    //   69: new 96	hae
    //   72: dup
    //   73: iconst_0
    //   74: new 45	java/lang/IllegalStateException
    //   77: dup
    //   78: aload 23
    //   80: invokespecial 64	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   83: aload 23
    //   85: invokespecial 99	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   88: astore 16
    //   90: aload_3
    //   91: ifnull +9 -> 100
    //   94: aload_3
    //   95: invokeinterface 102 1 0
    //   100: aload 16
    //   102: areturn
    //   103: new 17	java/lang/String
    //   106: dup
    //   107: ldc 90
    //   109: invokespecial 103	java/lang/String:<init>	(Ljava/lang/String;)V
    //   112: astore 23
    //   114: goto -45 -> 69
    //   117: aload_3
    //   118: invokeinterface 107 1 0
    //   123: istore 6
    //   125: aconst_null
    //   126: astore 7
    //   128: iload 6
    //   130: ifeq +82 -> 212
    //   133: aload_3
    //   134: aload_3
    //   135: ldc 21
    //   137: invokeinterface 111 2 0
    //   142: invokeinterface 115 2 0
    //   147: lstore 8
    //   149: aload_3
    //   150: ldc 19
    //   152: invokeinterface 111 2 0
    //   157: istore 10
    //   159: lload 8
    //   161: ldc2_w 116
    //   164: land
    //   165: lconst_0
    //   166: lcmp
    //   167: ifeq +117 -> 284
    //   170: iconst_1
    //   171: istore 11
    //   173: aconst_null
    //   174: astore 7
    //   176: iload 11
    //   178: ifeq +34 -> 212
    //   181: aload_3
    //   182: iload 10
    //   184: invokeinterface 121 2 0
    //   189: istore 12
    //   191: aconst_null
    //   192: astore 7
    //   194: iload 12
    //   196: ifne +16 -> 212
    //   199: aload_3
    //   200: iload 10
    //   202: invokeinterface 125 2 0
    //   207: invokestatic 130	hmw:a	([B)Lhmw;
    //   210: astore 7
    //   212: aload 7
    //   214: ifnonnull +90 -> 304
    //   217: ldc 132
    //   219: invokestatic 85	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   222: astore 13
    //   224: aload_0
    //   225: getfield 38	hlu:d	Ljava/lang/String;
    //   228: invokestatic 85	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   231: astore 14
    //   233: aload 14
    //   235: invokevirtual 88	java/lang/String:length	()I
    //   238: ifeq +52 -> 290
    //   241: aload 13
    //   243: aload 14
    //   245: invokevirtual 94	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   248: astore 15
    //   250: new 96	hae
    //   253: dup
    //   254: iconst_1
    //   255: new 45	java/lang/IllegalStateException
    //   258: dup
    //   259: aload 15
    //   261: invokespecial 64	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   264: aload 15
    //   266: invokespecial 99	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   269: astore 16
    //   271: aload_3
    //   272: ifnull -172 -> 100
    //   275: aload_3
    //   276: invokeinterface 102 1 0
    //   281: aload 16
    //   283: areturn
    //   284: iconst_0
    //   285: istore 11
    //   287: goto -114 -> 173
    //   290: new 17	java/lang/String
    //   293: dup
    //   294: aload 13
    //   296: invokespecial 103	java/lang/String:<init>	(Ljava/lang/String;)V
    //   299: astore 15
    //   301: goto -51 -> 250
    //   304: aload 7
    //   306: aload_0
    //   307: getfield 42	hlu:m	I
    //   310: putfield 135	hmw:h	I
    //   313: new 137	android/content/ContentValues
    //   316: dup
    //   317: iconst_1
    //   318: invokespecial 138	android/content/ContentValues:<init>	(I)V
    //   321: astore 17
    //   323: aload 17
    //   325: ldc 19
    //   327: aload 7
    //   329: invokestatic 141	hmw:a	(Lhmw;)[B
    //   332: invokevirtual 145	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   335: iconst_1
    //   336: anewarray 17	java/lang/String
    //   339: astore 18
    //   341: aload 18
    //   343: iconst_0
    //   344: aload_0
    //   345: getfield 38	hlu:d	Ljava/lang/String;
    //   348: aastore
    //   349: aload_1
    //   350: ldc 67
    //   352: aload 17
    //   354: ldc 69
    //   356: aload 18
    //   358: invokevirtual 149	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   361: istore 19
    //   363: iload 19
    //   365: iconst_1
    //   366: if_icmpeq +86 -> 452
    //   369: aload_0
    //   370: getfield 38	hlu:d	Ljava/lang/String;
    //   373: astore 20
    //   375: new 47	java/lang/StringBuilder
    //   378: dup
    //   379: bipush 82
    //   381: aload 20
    //   383: invokestatic 85	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   386: invokevirtual 88	java/lang/String:length	()I
    //   389: iadd
    //   390: invokespecial 50	java/lang/StringBuilder:<init>	(I)V
    //   393: ldc 151
    //   395: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: iload 19
    //   400: invokevirtual 59	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   403: ldc 153
    //   405: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   408: aload 20
    //   410: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   416: astore 21
    //   418: new 96	hae
    //   421: dup
    //   422: iconst_2
    //   423: new 45	java/lang/IllegalStateException
    //   426: dup
    //   427: aload 21
    //   429: invokespecial 64	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   432: aload 21
    //   434: invokespecial 99	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   437: astore 16
    //   439: aload_3
    //   440: ifnull -340 -> 100
    //   443: aload_3
    //   444: invokeinterface 102 1 0
    //   449: aload 16
    //   451: areturn
    //   452: new 96	hae
    //   455: dup
    //   456: iconst_1
    //   457: invokespecial 156	hae:<init>	(Z)V
    //   460: astore 16
    //   462: aload_3
    //   463: ifnull -363 -> 100
    //   466: aload_3
    //   467: invokeinterface 102 1 0
    //   472: aload 16
    //   474: areturn
    //   475: astore_2
    //   476: aconst_null
    //   477: astore_3
    //   478: aload_3
    //   479: ifnull +9 -> 488
    //   482: aload_3
    //   483: invokeinterface 102 1 0
    //   488: aload_2
    //   489: athrow
    //   490: astore_2
    //   491: goto -13 -> 478
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	494	0	this	hlu
    //   0	494	1	paramSQLiteDatabase	SQLiteDatabase
    //   475	14	2	localObject1	Object
    //   490	1	2	localObject2	Object
    //   33	450	3	localCursor1	Cursor
    //   4	17	4	str1	String
    //   29	3	5	localCursor2	Cursor
    //   123	6	6	bool1	boolean
    //   126	202	7	localhmw	hmw
    //   147	13	8	l1	long
    //   157	44	10	i	int
    //   171	115	11	j	int
    //   189	6	12	bool2	boolean
    //   222	73	13	str2	String
    //   231	13	14	str3	String
    //   248	52	15	str4	String
    //   88	385	16	localhae	hae
    //   321	32	17	localContentValues	ContentValues
    //   339	18	18	arrayOfString	String[]
    //   361	38	19	k	int
    //   373	36	20	str5	String
    //   416	17	21	str6	String
    //   50	13	22	str7	String
    //   67	46	23	str8	String
    // Exception table:
    //   from	to	target	type
    //   0	31	475	finally
    //   34	69	490	finally
    //   69	90	490	finally
    //   103	114	490	finally
    //   117	125	490	finally
    //   133	159	490	finally
    //   181	191	490	finally
    //   199	212	490	finally
    //   217	250	490	finally
    //   250	271	490	finally
    //   290	301	490	finally
    //   304	363	490	finally
    //   369	439	490	finally
    //   452	462	490	finally
  }
  
  private final hae b(SQLiteDatabase paramSQLiteDatabase)
  {
    do
    {
      for (;;)
      {
        try
        {
          String str1 = this.d;
          Cursor localCursor2 = paramSQLiteDatabase.query("activities", b, "activity_id=?", new String[] { str1 }, null, null, null);
          localCursor1 = localCursor2;
        }
        finally
        {
          hae localhae;
          boolean bool1;
          qpp localqpp1;
          int n;
          ContentValues localContentValues;
          String[] arrayOfString;
          int k;
          String str5;
          String str6;
          Cursor localCursor1 = null;
          if (localCursor1 != null) {
            localCursor1.close();
          }
        }
        try
        {
          if (localCursor1.getCount() == 0)
          {
            String str7 = String.valueOf(this.d);
            if (str7.length() != 0)
            {
              str8 = "Unable to find promo in ACTIVITIES_TABLE for activityId ".concat(str7);
              localhae = new hae(4, new IllegalStateException(str8), str8);
              if (localCursor1 != null) {
                localCursor1.close();
              }
              return localhae;
            }
            String str8 = new String("Unable to find promo in ACTIVITIES_TABLE for activityId ");
            continue;
          }
          bool1 = localCursor1.moveToFirst();
          localqpp1 = null;
          if (bool1)
          {
            int i = localCursor1.getColumnIndexOrThrow("payload");
            boolean bool2 = localCursor1.isNull(i);
            localqpp1 = null;
            if (!bool2)
            {
              qpp localqpp2 = new qpp();
              byte[] arrayOfByte = localCursor1.getBlob(i);
              localqpp1 = (qpp)qat.b(localqpp2, arrayOfByte, 0, arrayOfByte.length);
            }
          }
          if (localqpp1 == null)
          {
            String str2 = String.valueOf("Couldn't find FeaturedCollexions promo in ACTIVITIES_TABLE for activityId ");
            String str3 = String.valueOf(this.d);
            if (str3.length() != 0)
            {
              str4 = str2.concat(str3);
              localhae = new hae(5, new IllegalStateException(str4), str4);
              if (localCursor1 == null) {
                continue;
              }
              localCursor1.close();
              return localhae;
            }
            String str4 = new String(str2);
            continue;
          }
          if ((localqpp1.b == null) || (localqpp1.b.length <= 0)) {
            break label561;
          }
          n = 0;
          if (n >= localqpp1.b.length) {
            break label561;
          }
          if ((localqpp1.b[n] == null) || (!TextUtils.equals(localqpp1.b[n].a.a, this.l))) {
            continue;
          }
          localqpp1.b[n].a.e = this.m;
          j = 1;
        }
        finally
        {
          continue;
          j = 0;
          continue;
        }
        if (j == 0) {
          continue;
        }
        localContentValues = new ContentValues(1);
        localContentValues.put("payload", qat.a(localqpp1));
        arrayOfString = new String[1];
        arrayOfString[0] = this.d;
        k = paramSQLiteDatabase.update("activities", localContentValues, "activity_id=?", arrayOfString);
        if (k == 1) {
          continue;
        }
        str5 = this.d;
        str6 = 79 + String.valueOf(str5).length() + "The number of promo rows affected should be 1 found " + k + " for activityId " + str5;
        localhae = new hae(2, new IllegalStateException(str6), str6);
        if (localCursor1 != null)
        {
          localCursor1.close();
          return localhae;
          n++;
        }
      }
      localhae = new hae(true);
    } while (localCursor1 == null);
    localCursor1.close();
    return localhae;
  }
  
  /* Error */
  protected final hae a(Context paramContext)
  {
    // Byte code:
    //   0: new 200	hkt
    //   3: dup
    //   4: aload_1
    //   5: new 202	kch
    //   8: dup
    //   9: invokespecial 203	kch:<init>	()V
    //   12: aload_1
    //   13: aload_0
    //   14: getfield 36	hlu:c	I
    //   17: invokevirtual 206	kch:a	(Landroid/content/Context;I)Lkch;
    //   20: invokevirtual 209	kch:a	()Lkcg;
    //   23: aload_0
    //   24: getfield 40	hlu:l	Ljava/lang/String;
    //   27: aload_0
    //   28: getfield 42	hlu:m	I
    //   31: invokestatic 211	hlu:a	(I)I
    //   34: invokespecial 214	hkt:<init>	(Landroid/content/Context;Lkcg;Ljava/lang/String;I)V
    //   37: astore_2
    //   38: aload_2
    //   39: invokevirtual 217	hkt:i	()V
    //   42: aload_2
    //   43: invokevirtual 220	hkt:n	()Z
    //   46: ifeq +20 -> 66
    //   49: new 96	hae
    //   52: dup
    //   53: aload_2
    //   54: getfield 225	kbw:o	I
    //   57: aload_2
    //   58: getfield 229	kbw:q	Ljava/lang/Exception;
    //   61: aconst_null
    //   62: invokespecial 99	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   65: areturn
    //   66: aload_2
    //   67: getfield 235	kct:x	Z
    //   70: ifeq +47 -> 117
    //   73: aload_2
    //   74: getfield 239	kct:w	Lqat;
    //   77: astore_3
    //   78: aload_3
    //   79: ifnull +27 -> 106
    //   82: aload_2
    //   83: getfield 235	kct:x	Z
    //   86: ifeq +36 -> 122
    //   89: aload_2
    //   90: getfield 239	kct:w	Lqat;
    //   93: astore 4
    //   95: aload 4
    //   97: checkcast 241	nce
    //   100: getfield 244	nce:a	Lnga;
    //   103: ifnonnull +25 -> 128
    //   106: new 96	hae
    //   109: dup
    //   110: iconst_0
    //   111: aconst_null
    //   112: aconst_null
    //   113: invokespecial 99	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   116: areturn
    //   117: aconst_null
    //   118: astore_3
    //   119: goto -41 -> 78
    //   122: aconst_null
    //   123: astore 4
    //   125: goto -30 -> 95
    //   128: aload_2
    //   129: getfield 235	kct:x	Z
    //   132: ifeq +192 -> 324
    //   135: aload_2
    //   136: getfield 239	kct:w	Lqat;
    //   139: astore 5
    //   141: aload_0
    //   142: aload 5
    //   144: checkcast 241	nce
    //   147: getfield 244	nce:a	Lnga;
    //   150: getfield 248	nga:a	I
    //   153: putfield 42	hlu:m	I
    //   156: aload_1
    //   157: aload_0
    //   158: getfield 36	hlu:c	I
    //   161: invokestatic 253	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   164: astore 6
    //   166: aload 6
    //   168: invokevirtual 256	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   171: aload_0
    //   172: getfield 38	hlu:d	Ljava/lang/String;
    //   175: invokestatic 261	lod:a	(Ljava/lang/String;)Z
    //   178: ifeq +152 -> 330
    //   181: aload_0
    //   182: aload 6
    //   184: invokespecial 263	hlu:b	(Landroid/database/sqlite/SQLiteDatabase;)Lhae;
    //   187: astore 11
    //   189: new 137	android/content/ContentValues
    //   192: dup
    //   193: iconst_1
    //   194: invokespecial 138	android/content/ContentValues:<init>	(I)V
    //   197: astore 12
    //   199: aload 12
    //   201: ldc_w 265
    //   204: aload_0
    //   205: getfield 42	hlu:m	I
    //   208: invokestatic 270	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   211: invokevirtual 273	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   214: iconst_1
    //   215: anewarray 17	java/lang/String
    //   218: astore 13
    //   220: aload 13
    //   222: iconst_0
    //   223: aload_0
    //   224: getfield 40	hlu:l	Ljava/lang/String;
    //   227: aastore
    //   228: aload 6
    //   230: ldc_w 275
    //   233: aload 12
    //   235: ldc_w 277
    //   238: aload 13
    //   240: invokevirtual 149	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   243: istore 14
    //   245: aload_1
    //   246: invokevirtual 283	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   249: astore 15
    //   251: iload 14
    //   253: iconst_1
    //   254: if_icmpne +28 -> 282
    //   257: aload 15
    //   259: aload_1
    //   260: ldc_w 285
    //   263: invokestatic 290	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   266: checkcast 285	hho
    //   269: aload_0
    //   270: getfield 40	hlu:l	Ljava/lang/String;
    //   273: invokeinterface 293 2 0
    //   278: aconst_null
    //   279: invokevirtual 299	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   282: aload_0
    //   283: getfield 38	hlu:d	Ljava/lang/String;
    //   286: astore 16
    //   288: aload 15
    //   290: getstatic 304	lnf:b	Landroid/net/Uri;
    //   293: aload 16
    //   295: invokestatic 310	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   298: aconst_null
    //   299: invokevirtual 299	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   302: aload 15
    //   304: getstatic 312	lnf:a	Landroid/net/Uri;
    //   307: aconst_null
    //   308: invokevirtual 299	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   311: aload 6
    //   313: invokevirtual 315	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   316: aload 6
    //   318: invokevirtual 318	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   321: aload 11
    //   323: areturn
    //   324: aconst_null
    //   325: astore 5
    //   327: goto -186 -> 141
    //   330: aload_0
    //   331: aload 6
    //   333: invokespecial 320	hlu:a	(Landroid/database/sqlite/SQLiteDatabase;)Lhae;
    //   336: astore 10
    //   338: aload 10
    //   340: astore 11
    //   342: goto -153 -> 189
    //   345: astore 8
    //   347: new 96	hae
    //   350: dup
    //   351: iconst_3
    //   352: aload 8
    //   354: ldc_w 322
    //   357: invokespecial 99	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   360: astore 9
    //   362: aload 6
    //   364: invokevirtual 318	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   367: aload 9
    //   369: areturn
    //   370: astore 7
    //   372: aload 6
    //   374: invokevirtual 318	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   377: aload 7
    //   379: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	380	0	this	hlu
    //   0	380	1	paramContext	Context
    //   37	99	2	localhkt	hkt
    //   77	42	3	localqat1	qat
    //   93	31	4	localqat2	qat
    //   139	187	5	localqat3	qat
    //   164	209	6	localSQLiteDatabase	SQLiteDatabase
    //   370	8	7	localObject1	Object
    //   345	8	8	localIOException	java.io.IOException
    //   360	8	9	localhae1	hae
    //   336	3	10	localhae2	hae
    //   187	154	11	localObject2	Object
    //   197	37	12	localContentValues	ContentValues
    //   218	21	13	arrayOfString	String[]
    //   243	12	14	i	int
    //   249	54	15	localContentResolver	android.content.ContentResolver
    //   286	8	16	str	String
    // Exception table:
    //   from	to	target	type
    //   171	189	345	java/io/IOException
    //   189	251	345	java/io/IOException
    //   257	282	345	java/io/IOException
    //   282	316	345	java/io/IOException
    //   330	338	345	java/io/IOException
    //   171	189	370	finally
    //   189	251	370	finally
    //   257	282	370	finally
    //   282	316	370	finally
    //   330	338	370	finally
    //   347	362	370	finally
  }
  
  public final String b(Context paramContext)
  {
    switch (a(this.m))
    {
    default: 
      int i = this.m;
      throw new IllegalStateException(32 + "Invalid follow state " + i);
    case 1: 
      return paramContext.getString(efj.In);
    }
    return paramContext.getString(efj.Ir);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlu
 * JD-Core Version:    0.7.0.1
 */