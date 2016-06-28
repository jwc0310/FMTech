import android.content.Context;

public final class jzh
  extends gzf
{
  private final int a;
  private final String b;
  private final boolean c;
  
  public jzh(int paramInt, String paramString, boolean paramBoolean)
  {
    super("GetFlairItemsTask");
    this.a = paramInt;
    this.b = paramString;
    this.c = paramBoolean;
  }
  
  public static void a(Context paramContext, gzj paramgzj, int paramInt, String paramString, boolean paramBoolean)
  {
    gzj.a(paramContext, new jzh(paramInt, paramString, paramBoolean));
  }
  
  /* Error */
  protected final hae a(Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: new 36	jzg
    //   5: dup
    //   6: aload_1
    //   7: new 38	kch
    //   10: dup
    //   11: invokespecial 41	kch:<init>	()V
    //   14: aload_1
    //   15: aload_0
    //   16: getfield 19	jzh:a	I
    //   19: invokevirtual 44	kch:a	(Landroid/content/Context;I)Lkch;
    //   22: invokevirtual 47	kch:a	()Lkcg;
    //   25: aload_0
    //   26: getfield 21	jzh:b	Ljava/lang/String;
    //   29: invokespecial 50	jzg:<init>	(Landroid/content/Context;Lkcg;Ljava/lang/String;)V
    //   32: astore_3
    //   33: aload_3
    //   34: getfield 53	jzg:b	Lkcx;
    //   37: invokevirtual 58	kcx:i	()V
    //   40: aload_3
    //   41: getfield 53	jzg:b	Lkcx;
    //   44: ldc 60
    //   46: invokevirtual 62	kcx:c	(Ljava/lang/String;)V
    //   49: aload_3
    //   50: getfield 53	jzg:b	Lkcx;
    //   53: invokevirtual 66	kcx:n	()Z
    //   56: ifeq +26 -> 82
    //   59: new 68	hae
    //   62: dup
    //   63: aload_3
    //   64: getfield 53	jzg:b	Lkcx;
    //   67: getfield 73	kbw:o	I
    //   70: aload_3
    //   71: getfield 53	jzg:b	Lkcx;
    //   74: getfield 77	kbw:q	Ljava/lang/Exception;
    //   77: aconst_null
    //   78: invokespecial 80	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   81: areturn
    //   82: new 68	hae
    //   85: dup
    //   86: iload_2
    //   87: invokespecial 83	hae:<init>	(Z)V
    //   90: astore 4
    //   92: aload_3
    //   93: getfield 53	jzg:b	Lkcx;
    //   96: invokevirtual 66	kcx:n	()Z
    //   99: ifne +832 -> 931
    //   102: iload_2
    //   103: ldc 85
    //   105: invokestatic 91	efj:d	(ZLjava/lang/Object;)V
    //   108: aload_3
    //   109: getfield 53	jzg:b	Lkcx;
    //   112: aload_3
    //   113: getfield 53	jzg:b	Lkcx;
    //   116: getstatic 92	jzg:a	I
    //   119: invokevirtual 95	kcx:a	(I)I
    //   122: getstatic 100	qtp:a	Lqao;
    //   125: invokevirtual 103	kcx:a	(ILqao;)Lqat;
    //   128: checkcast 97	qtp
    //   131: getfield 106	qtp:b	Lqup;
    //   134: astore 6
    //   136: aload 6
    //   138: ifnull +810 -> 948
    //   141: aload_1
    //   142: aload_0
    //   143: getfield 19	jzh:a	I
    //   146: invokestatic 111	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   149: astore 7
    //   151: aload 7
    //   153: invokevirtual 116	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   156: aload_1
    //   157: ldc 118
    //   159: invokestatic 123	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   162: checkcast 118	hhh
    //   165: astore 9
    //   167: aload_1
    //   168: ldc 125
    //   170: invokestatic 123	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   173: checkcast 125	kyn
    //   176: astore 10
    //   178: aload_0
    //   179: getfield 23	jzh:c	Z
    //   182: ifeq +133 -> 315
    //   185: aload 9
    //   187: aload_0
    //   188: getfield 19	jzh:a	I
    //   191: invokeinterface 128 2 0
    //   196: aload 10
    //   198: aload_0
    //   199: getfield 19	jzh:a	I
    //   202: invokeinterface 130 2 0
    //   207: aload 6
    //   209: getfield 135	qup:a	[Lqun;
    //   212: ifnull +187 -> 399
    //   215: aload 6
    //   217: getfield 135	qup:a	[Lqun;
    //   220: astore 40
    //   222: aload 40
    //   224: arraylength
    //   225: istore 41
    //   227: iconst_0
    //   228: istore 42
    //   230: iload 42
    //   232: iload 41
    //   234: if_icmpge +165 -> 399
    //   237: aload 40
    //   239: iload 42
    //   241: aaload
    //   242: astore 43
    //   244: aload 43
    //   246: getstatic 138	qum:a	Lqao;
    //   249: invokevirtual 143	qun:b	(Lqao;)Ljava/lang/Object;
    //   252: checkcast 137	qum
    //   255: astore 44
    //   257: aload 9
    //   259: aload_0
    //   260: getfield 19	jzh:a	I
    //   263: aload 44
    //   265: getfield 146	qum:b	Lqpk;
    //   268: invokeinterface 149 3 0
    //   273: pop
    //   274: aload_0
    //   275: getfield 23	jzh:c	Z
    //   278: ifeq +94 -> 372
    //   281: aload 43
    //   283: getfield 152	qun:a	Ljava/lang/Boolean;
    //   286: invokestatic 155	efj:b	(Ljava/lang/Boolean;)Z
    //   289: ifeq +83 -> 372
    //   292: aload 9
    //   294: aload_0
    //   295: getfield 19	jzh:a	I
    //   298: aload 44
    //   300: getfield 146	qum:b	Lqpk;
    //   303: getfield 159	qpk:a	Ljava/lang/String;
    //   306: invokeinterface 163 3 0
    //   311: pop
    //   312: goto +613 -> 925
    //   315: aload 9
    //   317: aload_0
    //   318: getfield 19	jzh:a	I
    //   321: aload_0
    //   322: getfield 21	jzh:b	Ljava/lang/String;
    //   325: invokeinterface 166 3 0
    //   330: aload 10
    //   332: aload_0
    //   333: getfield 19	jzh:a	I
    //   336: aload_0
    //   337: getfield 21	jzh:b	Ljava/lang/String;
    //   340: invokeinterface 168 3 0
    //   345: goto -138 -> 207
    //   348: astore 8
    //   350: aload 7
    //   352: invokevirtual 171	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   355: aload 8
    //   357: athrow
    //   358: astore 5
    //   360: new 68	hae
    //   363: dup
    //   364: iconst_0
    //   365: aload 5
    //   367: aconst_null
    //   368: invokespecial 80	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   371: areturn
    //   372: aload 9
    //   374: aload_0
    //   375: getfield 19	jzh:a	I
    //   378: aload_0
    //   379: getfield 21	jzh:b	Ljava/lang/String;
    //   382: aload 44
    //   384: getfield 146	qum:b	Lqpk;
    //   387: getfield 159	qpk:a	Ljava/lang/String;
    //   390: invokeinterface 174 4 0
    //   395: pop
    //   396: goto +529 -> 925
    //   399: aload 6
    //   401: getfield 176	qup:b	[Lqun;
    //   404: ifnull +130 -> 534
    //   407: aload 6
    //   409: getfield 176	qup:b	[Lqun;
    //   412: astore 32
    //   414: aload 32
    //   416: arraylength
    //   417: istore 33
    //   419: iconst_0
    //   420: istore 34
    //   422: iload 34
    //   424: iload 33
    //   426: if_icmpge +108 -> 534
    //   429: aload 32
    //   431: iload 34
    //   433: aaload
    //   434: astore 35
    //   436: aload 35
    //   438: getstatic 138	qum:a	Lqao;
    //   441: invokevirtual 143	qun:b	(Lqao;)Ljava/lang/Object;
    //   444: checkcast 137	qum
    //   447: astore 36
    //   449: aload 9
    //   451: aload_0
    //   452: getfield 19	jzh:a	I
    //   455: aload 36
    //   457: getfield 146	qum:b	Lqpk;
    //   460: invokeinterface 149 3 0
    //   465: pop
    //   466: aload_0
    //   467: getfield 23	jzh:c	Z
    //   470: ifeq +37 -> 507
    //   473: aload 35
    //   475: getfield 152	qun:a	Ljava/lang/Boolean;
    //   478: invokestatic 155	efj:b	(Ljava/lang/Boolean;)Z
    //   481: ifeq +26 -> 507
    //   484: aload 9
    //   486: aload_0
    //   487: getfield 19	jzh:a	I
    //   490: aload 36
    //   492: getfield 146	qum:b	Lqpk;
    //   495: getfield 159	qpk:a	Ljava/lang/String;
    //   498: invokeinterface 163 3 0
    //   503: pop
    //   504: goto +432 -> 936
    //   507: aload 9
    //   509: aload_0
    //   510: getfield 19	jzh:a	I
    //   513: aload_0
    //   514: getfield 21	jzh:b	Ljava/lang/String;
    //   517: aload 36
    //   519: getfield 146	qum:b	Lqpk;
    //   522: getfield 159	qpk:a	Ljava/lang/String;
    //   525: invokeinterface 174 4 0
    //   530: pop
    //   531: goto +405 -> 936
    //   534: aload 6
    //   536: getfield 178	qup:c	[Lqun;
    //   539: ifnull +146 -> 685
    //   542: aload 6
    //   544: getfield 178	qup:c	[Lqun;
    //   547: astore 24
    //   549: aload 24
    //   551: arraylength
    //   552: istore 25
    //   554: iconst_0
    //   555: istore 26
    //   557: iload 26
    //   559: iload 25
    //   561: if_icmpge +124 -> 685
    //   564: aload 24
    //   566: iload 26
    //   568: aaload
    //   569: astore 27
    //   571: aload 27
    //   573: getstatic 181	qur:a	Lqao;
    //   576: invokevirtual 143	qun:b	(Lqao;)Ljava/lang/Object;
    //   579: checkcast 180	qur
    //   582: astore 28
    //   584: aload 10
    //   586: aload_0
    //   587: getfield 19	jzh:a	I
    //   590: new 183	kyf
    //   593: dup
    //   594: aload 28
    //   596: getfield 186	qur:b	Lqxw;
    //   599: getfield 191	qxw:a	Lqxg;
    //   602: invokespecial 194	kyf:<init>	(Lqxg;)V
    //   605: invokeinterface 197 3 0
    //   610: pop
    //   611: aload_0
    //   612: getfield 23	jzh:c	Z
    //   615: ifeq +40 -> 655
    //   618: aload 27
    //   620: getfield 152	qun:a	Ljava/lang/Boolean;
    //   623: invokestatic 155	efj:b	(Ljava/lang/Boolean;)Z
    //   626: ifeq +29 -> 655
    //   629: aload 10
    //   631: aload_0
    //   632: getfield 19	jzh:a	I
    //   635: aload 28
    //   637: getfield 186	qur:b	Lqxw;
    //   640: getfield 191	qxw:a	Lqxg;
    //   643: getfield 200	qxg:a	Ljava/lang/String;
    //   646: invokeinterface 203 3 0
    //   651: pop
    //   652: goto +290 -> 942
    //   655: aload 10
    //   657: aload_0
    //   658: getfield 19	jzh:a	I
    //   661: aload_0
    //   662: getfield 21	jzh:b	Ljava/lang/String;
    //   665: aload 28
    //   667: getfield 186	qur:b	Lqxw;
    //   670: getfield 191	qxw:a	Lqxg;
    //   673: getfield 200	qxg:a	Ljava/lang/String;
    //   676: invokeinterface 205 4 0
    //   681: pop
    //   682: goto +260 -> 942
    //   685: aload_0
    //   686: getfield 21	jzh:b	Ljava/lang/String;
    //   689: astore 11
    //   691: new 207	android/content/ContentValues
    //   694: dup
    //   695: iconst_2
    //   696: invokespecial 209	android/content/ContentValues:<init>	(I)V
    //   699: astore 12
    //   701: aload 12
    //   703: ldc 211
    //   705: aload 11
    //   707: invokevirtual 215	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   710: aload 12
    //   712: ldc 217
    //   714: invokestatic 223	java/lang/System:currentTimeMillis	()J
    //   717: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   720: invokevirtual 232	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   723: aload 7
    //   725: ldc 234
    //   727: aconst_null
    //   728: aload 12
    //   730: iconst_5
    //   731: invokevirtual 238	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   734: pop2
    //   735: aload_0
    //   736: getfield 23	jzh:c	Z
    //   739: ifeq +73 -> 812
    //   742: aload 6
    //   744: getfield 240	qup:e	I
    //   747: istore 18
    //   749: aload 6
    //   751: getfield 242	qup:d	I
    //   754: istore 19
    //   756: aload 7
    //   758: ldc 244
    //   760: aconst_null
    //   761: aconst_null
    //   762: invokevirtual 248	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   765: pop
    //   766: new 207	android/content/ContentValues
    //   769: dup
    //   770: iconst_2
    //   771: invokespecial 209	android/content/ContentValues:<init>	(I)V
    //   774: astore 21
    //   776: aload 21
    //   778: ldc 250
    //   780: iload 19
    //   782: invokestatic 255	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   785: invokevirtual 258	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   788: aload 21
    //   790: ldc_w 260
    //   793: iload 18
    //   795: invokestatic 255	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   798: invokevirtual 258	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   801: aload 7
    //   803: ldc 244
    //   805: aconst_null
    //   806: aload 21
    //   808: invokevirtual 264	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   811: pop2
    //   812: aload 7
    //   814: invokevirtual 267	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   817: aload 7
    //   819: invokevirtual 171	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   822: aload_1
    //   823: invokevirtual 273	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   826: astore 15
    //   828: aload_1
    //   829: ldc_w 275
    //   832: invokestatic 123	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   835: checkcast 275	hho
    //   838: astore 16
    //   840: aload_1
    //   841: ldc_w 277
    //   844: invokestatic 123	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   847: checkcast 277	kyx
    //   850: astore 17
    //   852: aload_0
    //   853: getfield 23	jzh:c	Z
    //   856: ifeq +32 -> 888
    //   859: aload 15
    //   861: aload 16
    //   863: invokeinterface 280 1 0
    //   868: aconst_null
    //   869: invokevirtual 286	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   872: aload 15
    //   874: aload 17
    //   876: invokeinterface 288 1 0
    //   881: aconst_null
    //   882: invokevirtual 286	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   885: goto +63 -> 948
    //   888: aload 15
    //   890: aload 16
    //   892: aload_0
    //   893: getfield 21	jzh:b	Ljava/lang/String;
    //   896: invokeinterface 291 2 0
    //   901: aconst_null
    //   902: invokevirtual 286	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   905: aload 15
    //   907: aload 16
    //   909: aload_0
    //   910: getfield 21	jzh:b	Ljava/lang/String;
    //   913: invokeinterface 291 2 0
    //   918: aconst_null
    //   919: invokevirtual 286	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   922: goto +26 -> 948
    //   925: iinc 42 1
    //   928: goto -698 -> 230
    //   931: iconst_0
    //   932: istore_2
    //   933: goto -831 -> 102
    //   936: iinc 34 1
    //   939: goto -517 -> 422
    //   942: iinc 26 1
    //   945: goto -388 -> 557
    //   948: aload 4
    //   950: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	951	0	this	jzh
    //   0	951	1	paramContext	Context
    //   1	932	2	bool	boolean
    //   32	81	3	localjzg	jzg
    //   90	859	4	localhae	hae
    //   358	8	5	localIOException	java.io.IOException
    //   134	616	6	localqup	qup
    //   149	669	7	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   348	8	8	localObject	java.lang.Object
    //   165	343	9	localhhh	hhh
    //   176	480	10	localkyn	kyn
    //   689	17	11	str	String
    //   699	30	12	localContentValues1	android.content.ContentValues
    //   826	80	15	localContentResolver	android.content.ContentResolver
    //   838	70	16	localhho	hho
    //   850	25	17	localkyx	kyx
    //   747	47	18	i	int
    //   754	27	19	j	int
    //   774	33	21	localContentValues2	android.content.ContentValues
    //   547	18	24	arrayOfqun1	qun[]
    //   552	10	25	k	int
    //   555	388	26	m	int
    //   569	50	27	localqun1	qun
    //   582	84	28	localqur	qur
    //   412	18	32	arrayOfqun2	qun[]
    //   417	10	33	n	int
    //   420	517	34	i1	int
    //   434	40	35	localqun2	qun
    //   447	71	36	localqum1	qum
    //   220	18	40	arrayOfqun3	qun[]
    //   225	10	41	i2	int
    //   228	698	42	i3	int
    //   242	40	43	localqun3	qun
    //   255	128	44	localqum2	qum
    // Exception table:
    //   from	to	target	type
    //   156	207	348	finally
    //   207	227	348	finally
    //   237	312	348	finally
    //   315	345	348	finally
    //   372	396	348	finally
    //   399	419	348	finally
    //   429	504	348	finally
    //   507	531	348	finally
    //   534	554	348	finally
    //   564	652	348	finally
    //   655	682	348	finally
    //   685	812	348	finally
    //   812	817	348	finally
    //   92	102	358	java/io/IOException
    //   102	136	358	java/io/IOException
    //   141	156	358	java/io/IOException
    //   350	358	358	java/io/IOException
    //   817	885	358	java/io/IOException
    //   888	922	358	java/io/IOException
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(efj.Uc);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzh
 * JD-Core Version:    0.7.0.1
 */