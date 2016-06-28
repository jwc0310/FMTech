import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;

public final class clr
  extends hqj
{
  private final int r;
  private final String s;
  private final String t;
  private boolean u;
  private final fv v = new fv(this);
  
  public clr(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    super(paramContext, null);
    this.r = paramInt;
    this.s = paramString1;
    this.t = paramString2;
  }
  
  public final void g()
  {
    super.g();
    if (!this.u)
    {
      ContentResolver localContentResolver1 = this.l.getContentResolver();
      String str1 = this.t;
      localContentResolver1.registerContentObserver(jqx.a.buildUpon().appendEncodedPath(str1).build(), false, this.v);
      ContentResolver localContentResolver2 = this.l.getContentResolver();
      String str2 = this.t;
      localContentResolver2.registerContentObserver(jrf.b.buildUpon().appendEncodedPath(str2).build(), false, this.v);
      this.u = true;
    }
  }
  
  protected final void l()
  {
    if (this.u)
    {
      this.l.getContentResolver().unregisterContentObserver(this.v);
      this.u = false;
    }
  }
  
  /* Error */
  public final android.database.Cursor o()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 43	fu:l	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 27	clr:r	I
    //   8: invokestatic 95	bqj:a	(Landroid/content/Context;I)Lbqj;
    //   11: invokevirtual 99	bqj:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   14: astore_1
    //   15: iconst_2
    //   16: anewarray 101	java/lang/String
    //   19: astore_2
    //   20: aload_2
    //   21: iconst_0
    //   22: aload_0
    //   23: getfield 29	clr:s	Ljava/lang/String;
    //   26: aastore
    //   27: aload_2
    //   28: iconst_1
    //   29: aload_0
    //   30: getfield 31	clr:t	Ljava/lang/String;
    //   33: aastore
    //   34: aload_1
    //   35: ldc 103
    //   37: getstatic 108	clu:a	[Ljava/lang/String;
    //   40: ldc 110
    //   42: aload_2
    //   43: aconst_null
    //   44: aconst_null
    //   45: aconst_null
    //   46: invokevirtual 116	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   49: astore_3
    //   50: aload_3
    //   51: invokeinterface 122 1 0
    //   56: ifeq +1013 -> 1069
    //   59: new 124	ojf
    //   62: dup
    //   63: invokespecial 126	ojf:<init>	()V
    //   66: astore 56
    //   68: aload_3
    //   69: iconst_0
    //   70: invokeinterface 130 2 0
    //   75: astore 57
    //   77: aload 56
    //   79: aload 57
    //   81: iconst_0
    //   82: aload 57
    //   84: arraylength
    //   85: invokestatic 135	qat:b	(Lqat;[BII)Lqat;
    //   88: checkcast 124	ojf
    //   91: astore 58
    //   93: aload_3
    //   94: iconst_1
    //   95: invokeinterface 139 2 0
    //   100: lstore 59
    //   102: lload 59
    //   104: lstore 61
    //   106: aload_3
    //   107: invokeinterface 142 1 0
    //   112: lload 61
    //   114: lstore 7
    //   116: aload 58
    //   118: astore 9
    //   120: aload 9
    //   122: ifnonnull +112 -> 234
    //   125: aload_0
    //   126: getfield 31	clr:t	Ljava/lang/String;
    //   129: astore 54
    //   131: aload_0
    //   132: getfield 29	clr:s	Ljava/lang/String;
    //   135: astore 55
    //   137: bipush 6
    //   139: ldc 144
    //   141: new 146	java/lang/StringBuilder
    //   144: dup
    //   145: bipush 49
    //   147: aload 54
    //   149: invokestatic 150	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   152: invokevirtual 154	java/lang/String:length	()I
    //   155: iadd
    //   156: aload 55
    //   158: invokestatic 150	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   161: invokevirtual 154	java/lang/String:length	()I
    //   164: iadd
    //   165: invokespecial 157	java/lang/StringBuilder:<init>	(I)V
    //   168: ldc 159
    //   170: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: aload 54
    //   175: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: ldc 165
    //   180: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: aload 55
    //   185: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: invokestatic 174	efj:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   194: aconst_null
    //   195: areturn
    //   196: astore 5
    //   198: ldc 144
    //   200: ldc 176
    //   202: aload 5
    //   204: invokestatic 182	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   207: pop
    //   208: aload_3
    //   209: invokeinterface 142 1 0
    //   214: lconst_0
    //   215: lstore 7
    //   217: aconst_null
    //   218: astore 9
    //   220: goto -100 -> 120
    //   223: astore 4
    //   225: aload_3
    //   226: invokeinterface 142 1 0
    //   231: aload 4
    //   233: athrow
    //   234: iconst_1
    //   235: anewarray 101	java/lang/String
    //   238: astore 10
    //   240: aload 10
    //   242: iconst_0
    //   243: aload 9
    //   245: getfield 185	ojf:g	Lojv;
    //   248: getfield 189	ojv:b	Ljava/lang/String;
    //   251: aastore
    //   252: aload 9
    //   254: getfield 185	ojf:g	Lojv;
    //   257: getfield 192	ojv:d	Ljava/lang/String;
    //   260: astore 11
    //   262: aload 9
    //   264: getfield 185	ojf:g	Lojv;
    //   267: getfield 195	ojv:c	Ljava/lang/String;
    //   270: astore 12
    //   272: aload_1
    //   273: ldc 197
    //   275: iconst_2
    //   276: anewarray 101	java/lang/String
    //   279: dup
    //   280: iconst_0
    //   281: ldc 199
    //   283: aastore
    //   284: dup
    //   285: iconst_1
    //   286: ldc 201
    //   288: aastore
    //   289: ldc 203
    //   291: aload 10
    //   293: aconst_null
    //   294: aconst_null
    //   295: aconst_null
    //   296: invokevirtual 116	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   299: astore 13
    //   301: aload 13
    //   303: invokeinterface 122 1 0
    //   308: ifeq +750 -> 1058
    //   311: aload 13
    //   313: iconst_0
    //   314: invokeinterface 207 2 0
    //   319: invokestatic 212	hdo:b	(Ljava/lang/String;)Ljava/lang/String;
    //   322: astore 16
    //   324: aload 13
    //   326: iconst_1
    //   327: invokeinterface 207 2 0
    //   332: astore 53
    //   334: aload 53
    //   336: astore 15
    //   338: aload 13
    //   340: invokeinterface 142 1 0
    //   345: aload 9
    //   347: getfield 213	ojf:c	Ljava/lang/String;
    //   350: astore 17
    //   352: aload 9
    //   354: getfield 217	ojf:m	Ljava/lang/Double;
    //   357: astore 18
    //   359: aload 18
    //   361: ifnonnull +581 -> 942
    //   364: dconst_0
    //   365: dstore 19
    //   367: dload 19
    //   369: ldc2_w 218
    //   372: dmul
    //   373: d2l
    //   374: lstore 21
    //   376: aload 9
    //   378: getfield 223	ojf:q	Loks;
    //   381: astore 23
    //   383: ldc2_w 224
    //   386: lload 7
    //   388: land
    //   389: lconst_0
    //   390: lcmp
    //   391: ifeq +561 -> 952
    //   394: iconst_1
    //   395: istore 24
    //   397: lload 7
    //   399: ldc2_w 226
    //   402: land
    //   403: lconst_0
    //   404: lcmp
    //   405: ifeq +553 -> 958
    //   408: iconst_1
    //   409: istore 25
    //   411: getstatic 230	cls:a	[Ljava/lang/String;
    //   414: arraylength
    //   415: anewarray 232	java/lang/Object
    //   418: astore 26
    //   420: new 234	android/database/MatrixCursor
    //   423: dup
    //   424: getstatic 230	cls:a	[Ljava/lang/String;
    //   427: invokespecial 237	android/database/MatrixCursor:<init>	([Ljava/lang/String;)V
    //   430: astore 27
    //   432: aload 26
    //   434: iconst_0
    //   435: iconst_0
    //   436: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   439: aastore
    //   440: aload 26
    //   442: iconst_1
    //   443: iconst_0
    //   444: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   447: aastore
    //   448: aload 26
    //   450: iconst_2
    //   451: aload 9
    //   453: getfield 185	ojf:g	Lojv;
    //   456: getfield 189	ojv:b	Ljava/lang/String;
    //   459: aastore
    //   460: aload 26
    //   462: iconst_3
    //   463: aload 15
    //   465: aastore
    //   466: aload 26
    //   468: iconst_4
    //   469: aload 16
    //   471: aastore
    //   472: aload 26
    //   474: iconst_5
    //   475: aload 17
    //   477: aastore
    //   478: aload 26
    //   480: bipush 6
    //   482: lload 21
    //   484: invokestatic 247	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   487: aastore
    //   488: aload 27
    //   490: aload 26
    //   492: invokevirtual 251	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   495: new 234	android/database/MatrixCursor
    //   498: dup
    //   499: getstatic 254	clv:a	[Ljava/lang/String;
    //   502: invokespecial 237	android/database/MatrixCursor:<init>	([Ljava/lang/String;)V
    //   505: astore 28
    //   507: new 234	android/database/MatrixCursor
    //   510: dup
    //   511: getstatic 257	clt:a	[Ljava/lang/String;
    //   514: invokespecial 237	android/database/MatrixCursor:<init>	([Ljava/lang/String;)V
    //   517: astore 29
    //   519: iconst_1
    //   520: anewarray 101	java/lang/String
    //   523: astore 30
    //   525: aload 30
    //   527: iconst_0
    //   528: aload_0
    //   529: getfield 31	clr:t	Ljava/lang/String;
    //   532: aastore
    //   533: aload_1
    //   534: ldc_w 259
    //   537: getstatic 257	clt:a	[Ljava/lang/String;
    //   540: ldc_w 261
    //   543: aload 30
    //   545: aconst_null
    //   546: aconst_null
    //   547: ldc_w 263
    //   550: invokevirtual 116	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   553: astore 31
    //   555: aload 31
    //   557: invokeinterface 266 1 0
    //   562: istore 33
    //   564: getstatic 254	clv:a	[Ljava/lang/String;
    //   567: arraylength
    //   568: anewarray 232	java/lang/Object
    //   571: astore 34
    //   573: aload 34
    //   575: iconst_0
    //   576: iconst_1
    //   577: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   580: aastore
    //   581: aload 34
    //   583: iconst_1
    //   584: iconst_2
    //   585: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   588: aastore
    //   589: aload 34
    //   591: iconst_2
    //   592: iload 33
    //   594: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   597: aastore
    //   598: aload 23
    //   600: ifnull +364 -> 964
    //   603: aload 23
    //   605: getfield 270	oks:a	Ljava/lang/String;
    //   608: astore 35
    //   610: aload 34
    //   612: iconst_3
    //   613: aload 35
    //   615: aastore
    //   616: aload 23
    //   618: ifnull +477 -> 1095
    //   621: aload 23
    //   623: getfield 273	oks:c	Ljava/lang/Boolean;
    //   626: astore 36
    //   628: aload 36
    //   630: ifnonnull +340 -> 970
    //   633: iconst_0
    //   634: istore 37
    //   636: goto +442 -> 1078
    //   639: aload 34
    //   641: iconst_5
    //   642: iload 38
    //   644: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   647: aastore
    //   648: aload 23
    //   650: ifnull +344 -> 994
    //   653: aload 23
    //   655: getfield 276	oks:e	Ljava/lang/Integer;
    //   658: astore 39
    //   660: aload 39
    //   662: ifnonnull +318 -> 980
    //   665: iconst_0
    //   666: istore 41
    //   668: aload 34
    //   670: iconst_4
    //   671: iload 41
    //   673: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   676: aastore
    //   677: iload 24
    //   679: ifeq +321 -> 1000
    //   682: iconst_1
    //   683: istore 42
    //   685: aload 34
    //   687: bipush 6
    //   689: iload 42
    //   691: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   694: aastore
    //   695: iload 25
    //   697: ifeq +309 -> 1006
    //   700: iconst_1
    //   701: istore 43
    //   703: aload 34
    //   705: bipush 7
    //   707: iload 43
    //   709: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   712: aastore
    //   713: aload 28
    //   715: aload 34
    //   717: invokevirtual 251	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   720: iconst_2
    //   721: istore 44
    //   723: aload 31
    //   725: invokeinterface 279 1 0
    //   730: ifeq +282 -> 1012
    //   733: aload 31
    //   735: iconst_2
    //   736: invokeinterface 207 2 0
    //   741: astore 45
    //   743: aload 31
    //   745: iconst_3
    //   746: invokeinterface 207 2 0
    //   751: astore 46
    //   753: aload 31
    //   755: iconst_4
    //   756: invokeinterface 207 2 0
    //   761: astore 47
    //   763: aload 31
    //   765: iconst_5
    //   766: invokeinterface 207 2 0
    //   771: astore 48
    //   773: aload 31
    //   775: bipush 6
    //   777: invokeinterface 139 2 0
    //   782: invokestatic 247	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   785: astore 49
    //   787: aload 31
    //   789: bipush 7
    //   791: invokeinterface 207 2 0
    //   796: astore 50
    //   798: aload 31
    //   800: bipush 8
    //   802: invokeinterface 283 2 0
    //   807: istore 51
    //   809: getstatic 257	clt:a	[Ljava/lang/String;
    //   812: arraylength
    //   813: anewarray 232	java/lang/Object
    //   816: astore 52
    //   818: aload 52
    //   820: iconst_0
    //   821: iload 44
    //   823: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   826: aastore
    //   827: aload 52
    //   829: iconst_1
    //   830: iconst_1
    //   831: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   834: aastore
    //   835: aload 52
    //   837: iconst_2
    //   838: aload 45
    //   840: aastore
    //   841: aload 52
    //   843: iconst_3
    //   844: aload 46
    //   846: aastore
    //   847: aload 52
    //   849: iconst_4
    //   850: aload 47
    //   852: aastore
    //   853: aload 52
    //   855: iconst_5
    //   856: aload 48
    //   858: aastore
    //   859: aload 52
    //   861: bipush 6
    //   863: aload 49
    //   865: aastore
    //   866: aload 52
    //   868: bipush 7
    //   870: aload 50
    //   872: aastore
    //   873: aload 52
    //   875: bipush 8
    //   877: iload 51
    //   879: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   882: aastore
    //   883: aload 52
    //   885: bipush 9
    //   887: aload 31
    //   889: bipush 9
    //   891: invokeinterface 283 2 0
    //   896: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   899: aastore
    //   900: aload 52
    //   902: bipush 10
    //   904: aload 31
    //   906: bipush 10
    //   908: invokeinterface 283 2 0
    //   913: invokestatic 242	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   916: aastore
    //   917: aload 29
    //   919: aload 52
    //   921: invokevirtual 251	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   924: iinc 44 1
    //   927: goto -204 -> 723
    //   930: astore 14
    //   932: aload 13
    //   934: invokeinterface 142 1 0
    //   939: aload 14
    //   941: athrow
    //   942: aload 18
    //   944: invokevirtual 289	java/lang/Double:doubleValue	()D
    //   947: dstore 19
    //   949: goto -582 -> 367
    //   952: iconst_0
    //   953: istore 24
    //   955: goto -558 -> 397
    //   958: iconst_0
    //   959: istore 25
    //   961: goto -550 -> 411
    //   964: aconst_null
    //   965: astore 35
    //   967: goto -357 -> 610
    //   970: aload 36
    //   972: invokevirtual 294	java/lang/Boolean:booleanValue	()Z
    //   975: istore 37
    //   977: goto +101 -> 1078
    //   980: aload 39
    //   982: invokevirtual 297	java/lang/Integer:intValue	()I
    //   985: istore 40
    //   987: iload 40
    //   989: istore 41
    //   991: goto -323 -> 668
    //   994: iconst_0
    //   995: istore 41
    //   997: goto -329 -> 668
    //   1000: iconst_0
    //   1001: istore 42
    //   1003: goto -318 -> 685
    //   1006: iconst_0
    //   1007: istore 43
    //   1009: goto -306 -> 703
    //   1012: aload 31
    //   1014: invokeinterface 142 1 0
    //   1019: new 299	android/database/MergeCursor
    //   1022: dup
    //   1023: iconst_3
    //   1024: anewarray 118	android/database/Cursor
    //   1027: dup
    //   1028: iconst_0
    //   1029: aload 27
    //   1031: aastore
    //   1032: dup
    //   1033: iconst_1
    //   1034: aload 28
    //   1036: aastore
    //   1037: dup
    //   1038: iconst_2
    //   1039: aload 29
    //   1041: aastore
    //   1042: invokespecial 302	android/database/MergeCursor:<init>	([Landroid/database/Cursor;)V
    //   1045: areturn
    //   1046: astore 32
    //   1048: aload 31
    //   1050: invokeinterface 142 1 0
    //   1055: aload 32
    //   1057: athrow
    //   1058: aload 12
    //   1060: astore 15
    //   1062: aload 11
    //   1064: astore 16
    //   1066: goto -728 -> 338
    //   1069: lconst_0
    //   1070: lstore 61
    //   1072: aconst_null
    //   1073: astore 58
    //   1075: goto -969 -> 106
    //   1078: iload 37
    //   1080: ifeq +9 -> 1089
    //   1083: iconst_1
    //   1084: istore 38
    //   1086: goto -447 -> 639
    //   1089: iconst_0
    //   1090: istore 38
    //   1092: goto -453 -> 639
    //   1095: iconst_0
    //   1096: istore 38
    //   1098: goto -459 -> 639
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1101	0	this	clr
    //   14	520	1	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   19	24	2	arrayOfString1	String[]
    //   49	177	3	localCursor1	android.database.Cursor
    //   223	9	4	localObject1	java.lang.Object
    //   196	7	5	localqas	qas
    //   114	284	7	l1	long
    //   118	334	9	localojf1	ojf
    //   238	54	10	arrayOfString2	String[]
    //   260	803	11	str1	String
    //   270	789	12	str2	String
    //   299	634	13	localCursor2	android.database.Cursor
    //   930	10	14	localObject2	java.lang.Object
    //   336	725	15	str3	String
    //   322	743	16	str4	String
    //   350	126	17	str5	String
    //   357	586	18	localDouble	java.lang.Double
    //   365	583	19	d	double
    //   374	109	21	l2	long
    //   381	273	23	localoks	oks
    //   395	559	24	i	int
    //   409	551	25	j	int
    //   418	73	26	arrayOfObject1	java.lang.Object[]
    //   430	600	27	localMatrixCursor1	android.database.MatrixCursor
    //   505	530	28	localMatrixCursor2	android.database.MatrixCursor
    //   517	523	29	localMatrixCursor3	android.database.MatrixCursor
    //   523	21	30	arrayOfString3	String[]
    //   553	496	31	localCursor3	android.database.Cursor
    //   1046	10	32	localObject3	java.lang.Object
    //   562	31	33	k	int
    //   571	145	34	arrayOfObject2	java.lang.Object[]
    //   608	358	35	str6	String
    //   626	345	36	localBoolean	java.lang.Boolean
    //   634	445	37	bool	boolean
    //   642	455	38	m	int
    //   658	323	39	localInteger	java.lang.Integer
    //   985	3	40	n	int
    //   666	330	41	i1	int
    //   683	319	42	i2	int
    //   701	307	43	i3	int
    //   721	204	44	i4	int
    //   741	98	45	str7	String
    //   751	94	46	str8	String
    //   761	90	47	str9	String
    //   771	86	48	str10	String
    //   785	79	49	localLong	java.lang.Long
    //   796	75	50	str11	String
    //   807	71	51	i5	int
    //   816	104	52	arrayOfObject3	java.lang.Object[]
    //   332	3	53	str12	String
    //   129	45	54	str13	String
    //   135	49	55	str14	String
    //   66	12	56	localojf2	ojf
    //   75	8	57	arrayOfByte	byte[]
    //   91	983	58	localojf3	ojf
    //   100	3	59	l3	long
    //   104	967	61	l4	long
    // Exception table:
    //   from	to	target	type
    //   50	102	196	qas
    //   50	102	223	finally
    //   198	208	223	finally
    //   301	334	930	finally
    //   555	598	1046	finally
    //   603	610	1046	finally
    //   610	616	1046	finally
    //   621	628	1046	finally
    //   639	648	1046	finally
    //   653	660	1046	finally
    //   668	677	1046	finally
    //   685	695	1046	finally
    //   703	720	1046	finally
    //   723	924	1046	finally
    //   970	977	1046	finally
    //   980	987	1046	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     clr
 * JD-Core Version:    0.7.0.1
 */