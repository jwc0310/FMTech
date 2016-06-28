import android.content.Context;

public final class jzj
  extends gzf
{
  private final int a;
  private final String b;
  private final boolean c;
  private final int d;
  
  private jzj(int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    super("GetMixedFlairItemsTask");
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramBoolean;
    this.d = paramInt2;
  }
  
  public static void a(Context paramContext, gzj paramgzj, int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    gzj.a(paramContext, new jzj(paramInt1, paramString, paramBoolean, paramInt2));
  }
  
  /* Error */
  protected final hae a(Context paramContext)
  {
    // Byte code:
    //   0: new 39	jzi
    //   3: dup
    //   4: aload_1
    //   5: new 41	kch
    //   8: dup
    //   9: invokespecial 44	kch:<init>	()V
    //   12: aload_1
    //   13: aload_0
    //   14: getfield 20	jzj:a	I
    //   17: invokevirtual 47	kch:a	(Landroid/content/Context;I)Lkch;
    //   20: invokevirtual 50	kch:a	()Lkcg;
    //   23: aload_0
    //   24: getfield 22	jzj:b	Ljava/lang/String;
    //   27: aload_0
    //   28: getfield 26	jzj:d	I
    //   31: invokespecial 53	jzi:<init>	(Landroid/content/Context;Lkcg;Ljava/lang/String;I)V
    //   34: astore_2
    //   35: aload_2
    //   36: getfield 56	jzi:b	Lkcx;
    //   39: invokevirtual 61	kcx:i	()V
    //   42: aload_2
    //   43: getfield 56	jzi:b	Lkcx;
    //   46: ldc 63
    //   48: invokevirtual 65	kcx:c	(Ljava/lang/String;)V
    //   51: aload_2
    //   52: getfield 56	jzi:b	Lkcx;
    //   55: invokevirtual 69	kcx:n	()Z
    //   58: ifeq +26 -> 84
    //   61: new 71	hae
    //   64: dup
    //   65: aload_2
    //   66: getfield 56	jzi:b	Lkcx;
    //   69: getfield 76	kbw:o	I
    //   72: aload_2
    //   73: getfield 56	jzi:b	Lkcx;
    //   76: getfield 80	kbw:q	Ljava/lang/Exception;
    //   79: aconst_null
    //   80: invokespecial 83	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   83: areturn
    //   84: new 71	hae
    //   87: dup
    //   88: iconst_1
    //   89: invokespecial 86	hae:<init>	(Z)V
    //   92: astore_3
    //   93: aload_2
    //   94: getfield 56	jzi:b	Lkcx;
    //   97: invokevirtual 69	kcx:n	()Z
    //   100: ifne +542 -> 642
    //   103: iconst_1
    //   104: istore 5
    //   106: iload 5
    //   108: ldc 88
    //   110: invokestatic 93	efj:d	(ZLjava/lang/Object;)V
    //   113: aload_2
    //   114: getfield 56	jzi:b	Lkcx;
    //   117: aload_2
    //   118: getfield 56	jzi:b	Lkcx;
    //   121: getstatic 94	jzi:a	I
    //   124: invokevirtual 97	kcx:a	(I)I
    //   127: getstatic 102	qtr:a	Lqao;
    //   130: invokevirtual 105	kcx:a	(ILqao;)Lqat;
    //   133: checkcast 99	qtr
    //   136: astore 6
    //   138: aload 6
    //   140: getfield 108	qtr:b	[Lqun;
    //   143: astore 7
    //   145: aload 7
    //   147: ifnull +487 -> 634
    //   150: aload 6
    //   152: getfield 111	qtr:c	Ljava/lang/Boolean;
    //   155: invokestatic 114	efj:b	(Ljava/lang/Boolean;)Z
    //   158: istore 8
    //   160: aload_1
    //   161: aload_0
    //   162: getfield 20	jzj:a	I
    //   165: invokestatic 119	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   168: astore 9
    //   170: aload 9
    //   172: invokevirtual 124	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   175: aload_1
    //   176: ldc 126
    //   178: invokestatic 131	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   181: checkcast 126	hhh
    //   184: astore 11
    //   186: aload_1
    //   187: ldc 133
    //   189: invokestatic 131	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   192: checkcast 133	kyn
    //   195: astore 12
    //   197: aload_0
    //   198: getfield 24	jzj:c	Z
    //   201: ifeq +129 -> 330
    //   204: aload 11
    //   206: aload_0
    //   207: getfield 20	jzj:a	I
    //   210: invokeinterface 137 2 0
    //   215: aload 12
    //   217: aload_0
    //   218: getfield 20	jzj:a	I
    //   221: invokeinterface 139 2 0
    //   226: aload 7
    //   228: arraylength
    //   229: istore 13
    //   231: iconst_0
    //   232: istore 14
    //   234: iload 14
    //   236: iload 13
    //   238: if_icmpge +301 -> 539
    //   241: aload 7
    //   243: iload 14
    //   245: aaload
    //   246: astore 15
    //   248: aload 15
    //   250: getstatic 142	qum:a	Lqao;
    //   253: invokevirtual 147	qun:a	(Lqao;)Z
    //   256: ifeq +158 -> 414
    //   259: aload 15
    //   261: getstatic 142	qum:a	Lqao;
    //   264: invokevirtual 150	qun:b	(Lqao;)Ljava/lang/Object;
    //   267: checkcast 141	qum
    //   270: astore 20
    //   272: aload 11
    //   274: aload_0
    //   275: getfield 20	jzj:a	I
    //   278: aload 20
    //   280: getfield 153	qum:b	Lqpk;
    //   283: invokeinterface 156 3 0
    //   288: pop
    //   289: aload_0
    //   290: getfield 24	jzj:c	Z
    //   293: ifeq +94 -> 387
    //   296: aload 15
    //   298: getfield 158	qun:a	Ljava/lang/Boolean;
    //   301: invokestatic 114	efj:b	(Ljava/lang/Boolean;)Z
    //   304: ifeq +83 -> 387
    //   307: aload 11
    //   309: aload_0
    //   310: getfield 20	jzj:a	I
    //   313: aload 20
    //   315: getfield 153	qum:b	Lqpk;
    //   318: getfield 162	qpk:a	Ljava/lang/String;
    //   321: invokeinterface 166 3 0
    //   326: pop
    //   327: goto +309 -> 636
    //   330: aload 11
    //   332: aload_0
    //   333: getfield 20	jzj:a	I
    //   336: aload_0
    //   337: getfield 22	jzj:b	Ljava/lang/String;
    //   340: invokeinterface 169 3 0
    //   345: aload 12
    //   347: aload_0
    //   348: getfield 20	jzj:a	I
    //   351: aload_0
    //   352: getfield 22	jzj:b	Ljava/lang/String;
    //   355: invokeinterface 171 3 0
    //   360: goto -134 -> 226
    //   363: astore 10
    //   365: aload 9
    //   367: invokevirtual 174	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   370: aload 10
    //   372: athrow
    //   373: astore 4
    //   375: new 71	hae
    //   378: dup
    //   379: iconst_0
    //   380: aload 4
    //   382: aconst_null
    //   383: invokespecial 83	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   386: areturn
    //   387: aload 11
    //   389: aload_0
    //   390: getfield 20	jzj:a	I
    //   393: aload_0
    //   394: getfield 22	jzj:b	Ljava/lang/String;
    //   397: aload 20
    //   399: getfield 153	qum:b	Lqpk;
    //   402: getfield 162	qpk:a	Ljava/lang/String;
    //   405: invokeinterface 178 4 0
    //   410: pop
    //   411: goto +225 -> 636
    //   414: aload 15
    //   416: getstatic 181	qur:a	Lqao;
    //   419: invokevirtual 147	qun:a	(Lqao;)Z
    //   422: ifeq +214 -> 636
    //   425: aload 15
    //   427: getstatic 181	qur:a	Lqao;
    //   430: invokevirtual 150	qun:b	(Lqao;)Ljava/lang/Object;
    //   433: checkcast 180	qur
    //   436: astore 16
    //   438: aload 12
    //   440: aload_0
    //   441: getfield 20	jzj:a	I
    //   444: new 183	kyf
    //   447: dup
    //   448: aload 16
    //   450: getfield 186	qur:b	Lqxw;
    //   453: getfield 191	qxw:a	Lqxg;
    //   456: invokespecial 194	kyf:<init>	(Lqxg;)V
    //   459: invokeinterface 197 3 0
    //   464: pop
    //   465: aload_0
    //   466: getfield 24	jzj:c	Z
    //   469: ifeq +40 -> 509
    //   472: aload 15
    //   474: getfield 158	qun:a	Ljava/lang/Boolean;
    //   477: invokestatic 114	efj:b	(Ljava/lang/Boolean;)Z
    //   480: ifeq +29 -> 509
    //   483: aload 12
    //   485: aload_0
    //   486: getfield 20	jzj:a	I
    //   489: aload 16
    //   491: getfield 186	qur:b	Lqxw;
    //   494: getfield 191	qxw:a	Lqxg;
    //   497: getfield 200	qxg:a	Ljava/lang/String;
    //   500: invokeinterface 203 3 0
    //   505: pop
    //   506: goto +130 -> 636
    //   509: aload 12
    //   511: aload_0
    //   512: getfield 20	jzj:a	I
    //   515: aload_0
    //   516: getfield 22	jzj:b	Ljava/lang/String;
    //   519: aload 16
    //   521: getfield 186	qur:b	Lqxw;
    //   524: getfield 191	qxw:a	Lqxg;
    //   527: getfield 200	qxg:a	Ljava/lang/String;
    //   530: invokeinterface 205 4 0
    //   535: pop
    //   536: goto +100 -> 636
    //   539: aload_0
    //   540: getfield 22	jzj:b	Ljava/lang/String;
    //   543: astore 24
    //   545: new 207	android/content/ContentValues
    //   548: dup
    //   549: iconst_2
    //   550: invokespecial 209	android/content/ContentValues:<init>	(I)V
    //   553: astore 25
    //   555: aload 25
    //   557: ldc 211
    //   559: aload 24
    //   561: invokevirtual 215	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   564: aload 25
    //   566: ldc 217
    //   568: iload 8
    //   570: invokestatic 223	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   573: invokevirtual 226	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Boolean;)V
    //   576: aload 25
    //   578: ldc 228
    //   580: invokestatic 234	java/lang/System:currentTimeMillis	()J
    //   583: invokestatic 239	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   586: invokevirtual 242	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   589: aload 9
    //   591: ldc 244
    //   593: aconst_null
    //   594: aload 25
    //   596: iconst_5
    //   597: invokevirtual 248	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   600: pop2
    //   601: aload 9
    //   603: invokevirtual 251	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   606: aload 9
    //   608: invokevirtual 174	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   611: aload_1
    //   612: invokevirtual 257	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   615: aload_1
    //   616: ldc_w 259
    //   619: invokestatic 131	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   622: checkcast 259	jyv
    //   625: invokeinterface 262 1 0
    //   630: aconst_null
    //   631: invokevirtual 268	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   634: aload_3
    //   635: areturn
    //   636: iinc 14 1
    //   639: goto -405 -> 234
    //   642: iconst_0
    //   643: istore 5
    //   645: goto -539 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	648	0	this	jzj
    //   0	648	1	paramContext	Context
    //   34	84	2	localjzi	jzi
    //   92	543	3	localhae	hae
    //   373	8	4	localIOException	java.io.IOException
    //   104	540	5	bool1	boolean
    //   136	15	6	localqtr	qtr
    //   143	99	7	arrayOfqun	qun[]
    //   158	411	8	bool2	boolean
    //   168	439	9	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   363	8	10	localObject	java.lang.Object
    //   184	204	11	localhhh	hhh
    //   195	315	12	localkyn	kyn
    //   229	10	13	i	int
    //   232	405	14	j	int
    //   246	227	15	localqun	qun
    //   436	84	16	localqur	qur
    //   270	128	20	localqum	qum
    //   543	17	24	str	String
    //   553	42	25	localContentValues	android.content.ContentValues
    // Exception table:
    //   from	to	target	type
    //   175	226	363	finally
    //   226	231	363	finally
    //   241	327	363	finally
    //   330	360	363	finally
    //   387	411	363	finally
    //   414	506	363	finally
    //   509	536	363	finally
    //   539	606	363	finally
    //   93	103	373	java/io/IOException
    //   106	145	373	java/io/IOException
    //   150	175	373	java/io/IOException
    //   365	373	373	java/io/IOException
    //   606	634	373	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzj
 * JD-Core Version:    0.7.0.1
 */