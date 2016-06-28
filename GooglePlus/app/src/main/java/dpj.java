import android.content.ContentResolver;
import android.content.Context;
import java.util.Map;

public final class dpj
  extends hqe<Map<String, Object>>
{
  Context d;
  doq e;
  private final fv f = new fv(this);
  private boolean h;
  
  public dpj(Context paramContext, boolean paramBoolean, doq paramdoq)
  {
    super(paramContext);
    this.d = paramContext;
    this.e = paramdoq;
    this.h = true;
  }
  
  /* Error */
  private Map<String, Object> r()
  {
    // Byte code:
    //   0: new 35	java/util/HashMap
    //   3: dup
    //   4: invokespecial 38	java/util/HashMap:<init>	()V
    //   7: astore_1
    //   8: aload_0
    //   9: getfield 43	fu:l	Landroid/content/Context;
    //   12: invokevirtual 49	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 27	dpj:d	Landroid/content/Context;
    //   20: ldc 51
    //   22: invokestatic 57	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   25: checkcast 51	hba
    //   28: invokevirtual 60	hba:e	()Ljava/util/List;
    //   31: astore_3
    //   32: iconst_m1
    //   33: istore 4
    //   35: aload_3
    //   36: invokeinterface 66 1 0
    //   41: ifne +18 -> 59
    //   44: aload_3
    //   45: iconst_0
    //   46: invokeinterface 70 2 0
    //   51: checkcast 72	java/lang/Integer
    //   54: invokevirtual 76	java/lang/Integer:intValue	()I
    //   57: istore 4
    //   59: aload_0
    //   60: getfield 27	dpj:d	Landroid/content/Context;
    //   63: invokestatic 82	hbu:b	(Landroid/content/Context;)Landroid/net/Uri;
    //   66: astore 5
    //   68: iload 4
    //   70: iconst_m1
    //   71: if_icmpeq +697 -> 768
    //   74: aload 5
    //   76: invokevirtual 88	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   79: ldc 90
    //   81: iload 4
    //   83: invokestatic 94	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   86: invokevirtual 100	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   89: invokevirtual 104	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   92: astore 6
    //   94: aload_2
    //   95: aload 6
    //   97: getstatic 109	doq:a	[Ljava/lang/String;
    //   100: aconst_null
    //   101: aconst_null
    //   102: aconst_null
    //   103: invokevirtual 115	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   106: astore 7
    //   108: aload 7
    //   110: ifnull +634 -> 744
    //   113: aload 7
    //   115: invokeinterface 120 1 0
    //   120: ifeq +600 -> 720
    //   123: aload 7
    //   125: iconst_0
    //   126: invokeinterface 124 2 0
    //   131: istore 49
    //   133: aload 7
    //   135: iconst_1
    //   136: invokeinterface 124 2 0
    //   141: istore 47
    //   143: aload 7
    //   145: iconst_2
    //   146: invokeinterface 124 2 0
    //   151: istore 46
    //   153: aload 7
    //   155: iconst_3
    //   156: invokeinterface 124 2 0
    //   161: istore 48
    //   163: aload 7
    //   165: iconst_4
    //   166: invokeinterface 124 2 0
    //   171: istore 44
    //   173: aload 7
    //   175: iconst_5
    //   176: invokeinterface 124 2 0
    //   181: istore 45
    //   183: aload 7
    //   185: bipush 6
    //   187: invokeinterface 124 2 0
    //   192: istore 50
    //   194: iload 50
    //   196: istore 43
    //   198: aload 7
    //   200: invokeinterface 127 1 0
    //   205: iload 44
    //   207: istore 11
    //   209: iload 48
    //   211: istore 13
    //   213: iload 45
    //   215: istore 10
    //   217: iload 46
    //   219: istore 9
    //   221: iload 49
    //   223: istore 14
    //   225: iload 47
    //   227: istore 8
    //   229: iload 43
    //   231: istore 12
    //   233: aload_0
    //   234: getfield 27	dpj:d	Landroid/content/Context;
    //   237: ldc 51
    //   239: invokestatic 57	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   242: checkcast 51	hba
    //   245: invokevirtual 129	hba:a	()Ljava/util/List;
    //   248: astore 15
    //   250: new 131	android/util/SparseArray
    //   253: dup
    //   254: invokespecial 132	android/util/SparseArray:<init>	()V
    //   257: astore 16
    //   259: aload 15
    //   261: invokeinterface 136 1 0
    //   266: astore 17
    //   268: aload 17
    //   270: invokeinterface 141 1 0
    //   275: ifeq +191 -> 466
    //   278: aload 17
    //   280: invokeinterface 145 1 0
    //   285: checkcast 72	java/lang/Integer
    //   288: astore 33
    //   290: aload_0
    //   291: getfield 43	fu:l	Landroid/content/Context;
    //   294: invokestatic 82	hbu:b	(Landroid/content/Context;)Landroid/net/Uri;
    //   297: invokevirtual 88	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   300: ldc 90
    //   302: aload 33
    //   304: invokevirtual 76	java/lang/Integer:intValue	()I
    //   307: invokestatic 94	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   310: invokevirtual 100	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   313: astore 34
    //   315: aload_0
    //   316: getfield 31	dpj:h	Z
    //   319: ifeq +13 -> 332
    //   322: aload 34
    //   324: ldc 147
    //   326: ldc 149
    //   328: invokevirtual 100	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   331: pop
    //   332: aload_2
    //   333: aload 34
    //   335: invokevirtual 104	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   338: getstatic 151	doq:b	[Ljava/lang/String;
    //   341: aconst_null
    //   342: aconst_null
    //   343: aconst_null
    //   344: invokevirtual 115	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   347: astore 35
    //   349: aload 35
    //   351: ifnull -83 -> 268
    //   354: aload 35
    //   356: invokeinterface 120 1 0
    //   361: ifeq +65 -> 426
    //   364: aload 33
    //   366: invokevirtual 76	java/lang/Integer:intValue	()I
    //   369: istore 37
    //   371: aload 35
    //   373: iconst_1
    //   374: invokeinterface 124 2 0
    //   379: istore 38
    //   381: aload 35
    //   383: iconst_0
    //   384: invokeinterface 124 2 0
    //   389: istore 39
    //   391: aload 35
    //   393: iconst_2
    //   394: invokeinterface 124 2 0
    //   399: iconst_1
    //   400: if_icmpne +48 -> 448
    //   403: iconst_1
    //   404: istore 40
    //   406: aload 16
    //   408: iload 37
    //   410: new 153	dpi
    //   413: dup
    //   414: iload 38
    //   416: iload 39
    //   418: iload 40
    //   420: invokespecial 156	dpi:<init>	(IIZ)V
    //   423: invokevirtual 160	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   426: aload 35
    //   428: invokeinterface 127 1 0
    //   433: goto -165 -> 268
    //   436: astore 42
    //   438: aload 7
    //   440: invokeinterface 127 1 0
    //   445: aload 42
    //   447: athrow
    //   448: iconst_0
    //   449: istore 40
    //   451: goto -45 -> 406
    //   454: astore 36
    //   456: aload 35
    //   458: invokeinterface 127 1 0
    //   463: aload 36
    //   465: athrow
    //   466: aload_1
    //   467: ldc 162
    //   469: aload 16
    //   471: invokeinterface 167 3 0
    //   476: pop
    //   477: aload_1
    //   478: ldc 169
    //   480: iload 14
    //   482: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   485: invokeinterface 167 3 0
    //   490: pop
    //   491: aload_1
    //   492: ldc 175
    //   494: iload 8
    //   496: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   499: invokeinterface 167 3 0
    //   504: pop
    //   505: aload_1
    //   506: ldc 177
    //   508: iload 9
    //   510: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   513: invokeinterface 167 3 0
    //   518: pop
    //   519: aload_1
    //   520: ldc 179
    //   522: iload 13
    //   524: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   527: invokeinterface 167 3 0
    //   532: pop
    //   533: aload_1
    //   534: ldc 181
    //   536: iload 11
    //   538: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   541: invokeinterface 167 3 0
    //   546: pop
    //   547: aload_1
    //   548: ldc 183
    //   550: iload 10
    //   552: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   555: invokeinterface 167 3 0
    //   560: pop
    //   561: aload_1
    //   562: ldc 185
    //   564: iload 12
    //   566: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   569: invokeinterface 167 3 0
    //   574: pop
    //   575: aload_2
    //   576: aload_0
    //   577: getfield 43	fu:l	Landroid/content/Context;
    //   580: invokestatic 187	hbu:d	(Landroid/content/Context;)Landroid/net/Uri;
    //   583: invokevirtual 88	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   586: ldc 90
    //   588: iload 8
    //   590: invokestatic 94	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   593: invokevirtual 100	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   596: invokevirtual 104	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   599: aconst_null
    //   600: aconst_null
    //   601: aconst_null
    //   602: aconst_null
    //   603: invokevirtual 115	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   606: astore 26
    //   608: aload 26
    //   610: invokeinterface 190 1 0
    //   615: ifeq +81 -> 696
    //   618: aload 26
    //   620: invokeinterface 120 1 0
    //   625: ifeq +71 -> 696
    //   628: aload 26
    //   630: iconst_1
    //   631: invokeinterface 124 2 0
    //   636: istore 28
    //   638: aload 26
    //   640: iconst_2
    //   641: invokeinterface 124 2 0
    //   646: istore 29
    //   648: aload 26
    //   650: iconst_3
    //   651: invokeinterface 124 2 0
    //   656: istore 32
    //   658: iload 32
    //   660: istore 30
    //   662: aload 26
    //   664: invokeinterface 127 1 0
    //   669: aload_0
    //   670: getfield 29	dpj:e	Ldoq;
    //   673: getfield 194	doq:aj	Landroid/os/Handler;
    //   676: new 196	dpk
    //   679: dup
    //   680: aload_0
    //   681: iload 30
    //   683: iload 29
    //   685: iload 28
    //   687: invokespecial 199	dpk:<init>	(Ldpj;III)V
    //   690: invokevirtual 205	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   693: pop
    //   694: aload_1
    //   695: areturn
    //   696: iconst_m1
    //   697: istore 28
    //   699: iconst_m1
    //   700: istore 29
    //   702: iconst_m1
    //   703: istore 30
    //   705: goto -43 -> 662
    //   708: astore 27
    //   710: aload 26
    //   712: invokeinterface 127 1 0
    //   717: aload 27
    //   719: athrow
    //   720: iconst_1
    //   721: istore 43
    //   723: iconst_1
    //   724: istore 44
    //   726: iconst_1
    //   727: istore 45
    //   729: iconst_1
    //   730: istore 46
    //   732: iconst_m1
    //   733: istore 47
    //   735: iconst_0
    //   736: istore 48
    //   738: iconst_0
    //   739: istore 49
    //   741: goto -543 -> 198
    //   744: iconst_m1
    //   745: istore 8
    //   747: iconst_1
    //   748: istore 9
    //   750: iconst_1
    //   751: istore 10
    //   753: iconst_1
    //   754: istore 11
    //   756: iconst_1
    //   757: istore 12
    //   759: iconst_0
    //   760: istore 13
    //   762: iconst_0
    //   763: istore 14
    //   765: goto -532 -> 233
    //   768: aload 5
    //   770: astore 6
    //   772: goto -678 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	775	0	this	dpj
    //   7	688	1	localHashMap	java.util.HashMap
    //   15	561	2	localContentResolver	ContentResolver
    //   31	14	3	localList1	java.util.List
    //   33	49	4	i	int
    //   66	703	5	localUri1	android.net.Uri
    //   92	679	6	localUri2	android.net.Uri
    //   106	333	7	localCursor1	android.database.Cursor
    //   227	519	8	j	int
    //   219	530	9	k	int
    //   215	537	10	m	int
    //   207	548	11	n	int
    //   231	527	12	i1	int
    //   211	550	13	i2	int
    //   223	541	14	i3	int
    //   248	12	15	localList2	java.util.List
    //   257	213	16	localSparseArray	android.util.SparseArray
    //   266	13	17	localIterator	java.util.Iterator
    //   606	105	26	localCursor2	android.database.Cursor
    //   708	10	27	localObject1	Object
    //   636	62	28	i4	int
    //   646	55	29	i5	int
    //   660	44	30	i6	int
    //   656	3	32	i7	int
    //   288	77	33	localInteger	java.lang.Integer
    //   313	21	34	localBuilder	android.net.Uri.Builder
    //   347	110	35	localCursor3	android.database.Cursor
    //   454	10	36	localObject2	Object
    //   369	40	37	i8	int
    //   379	36	38	i9	int
    //   389	28	39	i10	int
    //   404	46	40	bool	boolean
    //   436	10	42	localObject3	Object
    //   196	526	43	i11	int
    //   171	554	44	i12	int
    //   181	547	45	i13	int
    //   151	580	46	i14	int
    //   141	593	47	i15	int
    //   161	576	48	i16	int
    //   131	609	49	i17	int
    //   192	3	50	i18	int
    // Exception table:
    //   from	to	target	type
    //   113	194	436	finally
    //   354	403	454	finally
    //   406	426	454	finally
    //   608	658	708	finally
  }
  
  protected final boolean o()
  {
    this.l.getContentResolver().registerContentObserver(hbu.b(this.d), true, this.f);
    return true;
  }
  
  protected final boolean p()
  {
    this.l.getContentResolver().unregisterContentObserver(this.f);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dpj
 * JD-Core Version:    0.7.0.1
 */