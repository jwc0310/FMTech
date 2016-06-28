import android.content.Context;

final class bqq
  extends gzf
{
  bqq(Context paramContext1, String paramString, Context paramContext2, int paramInt)
  {
    super(paramContext1, paramString);
  }
  
  /* Error */
  protected final hae a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	bqq:a	Landroid/content/Context;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield 14	bqq:b	I
    //   9: istore_2
    //   10: getstatic 29	bqo:b	Ljava/io/File;
    //   13: ifnonnull +19 -> 32
    //   16: new 31	java/io/File
    //   19: dup
    //   20: aload_1
    //   21: invokevirtual 37	android/content/Context:getCacheDir	()Ljava/io/File;
    //   24: ldc 39
    //   26: invokespecial 42	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   29: putstatic 29	bqo:b	Ljava/io/File;
    //   32: getstatic 29	bqo:b	Ljava/io/File;
    //   35: invokevirtual 46	java/io/File:exists	()Z
    //   38: ifne +16 -> 54
    //   41: getstatic 29	bqo:b	Ljava/io/File;
    //   44: invokevirtual 49	java/io/File:mkdir	()Z
    //   47: ifne +7 -> 54
    //   50: aconst_null
    //   51: putstatic 29	bqo:b	Ljava/io/File;
    //   54: getstatic 29	bqo:b	Ljava/io/File;
    //   57: astore_3
    //   58: aload_3
    //   59: ifnonnull +20 -> 79
    //   62: ldc 51
    //   64: ldc 53
    //   66: invokestatic 59	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   69: pop
    //   70: new 61	hae
    //   73: dup
    //   74: iconst_1
    //   75: invokespecial 64	hae:<init>	(Z)V
    //   78: areturn
    //   79: aload_1
    //   80: iload_2
    //   81: invokestatic 69	bqj:a	(Landroid/content/Context;I)Lbqj;
    //   84: invokevirtual 73	bqj:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   87: astore 4
    //   89: ldc 74
    //   91: aload_1
    //   92: invokestatic 80	efj:K	(Landroid/content/Context;)Landroid/util/DisplayMetrics;
    //   95: invokestatic 83	efj:a	(Landroid/util/DisplayMetrics;)F
    //   98: fmul
    //   99: invokestatic 89	java/lang/Math:round	(F)I
    //   102: istore 5
    //   104: iload 5
    //   106: i2f
    //   107: ldc 90
    //   109: fdiv
    //   110: invokestatic 89	java/lang/Math:round	(F)I
    //   113: istore 6
    //   115: aload_1
    //   116: ldc 92
    //   118: invokestatic 97	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   121: checkcast 92	ipb
    //   124: astore 7
    //   126: new 99	java/util/HashSet
    //   129: dup
    //   130: aload_3
    //   131: invokevirtual 103	java/io/File:listFiles	()[Ljava/io/File;
    //   134: invokestatic 109	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   137: invokespecial 112	java/util/HashSet:<init>	(Ljava/util/Collection;)V
    //   140: astore 8
    //   142: new 114	java/util/ArrayList
    //   145: dup
    //   146: invokespecial 117	java/util/ArrayList:<init>	()V
    //   149: astore 9
    //   151: ldc 118
    //   153: istore 10
    //   155: new 120	android/content/ContentValues
    //   158: dup
    //   159: invokespecial 121	android/content/ContentValues:<init>	()V
    //   162: astore 11
    //   164: aload 4
    //   166: ldc 39
    //   168: getstatic 126	bqx:a	[Ljava/lang/String;
    //   171: aconst_null
    //   172: aconst_null
    //   173: aconst_null
    //   174: aconst_null
    //   175: ldc 128
    //   177: invokevirtual 134	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   180: astore 14
    //   182: aload 14
    //   184: astore 13
    //   186: ldc 51
    //   188: iconst_2
    //   189: invokestatic 138	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   192: ifeq +32 -> 224
    //   195: aload 13
    //   197: invokeinterface 144 1 0
    //   202: istore 76
    //   204: new 146	java/lang/StringBuilder
    //   207: dup
    //   208: bipush 35
    //   210: invokespecial 149	java/lang/StringBuilder:<init>	(I)V
    //   213: ldc 151
    //   215: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: iload 76
    //   220: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: aload 13
    //   226: invokeinterface 161 1 0
    //   231: istore 15
    //   233: iconst_0
    //   234: istore 16
    //   236: iload 15
    //   238: ifeq +126 -> 364
    //   241: aload 13
    //   243: iconst_1
    //   244: invokeinterface 165 2 0
    //   249: astore 68
    //   251: new 31	java/io/File
    //   254: dup
    //   255: aload_3
    //   256: aload 68
    //   258: invokespecial 42	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   261: astore 69
    //   263: aload 69
    //   265: invokevirtual 46	java/io/File:exists	()Z
    //   268: ifeq +282 -> 550
    //   271: iload 10
    //   273: ldc 118
    //   275: if_icmpne +55 -> 330
    //   278: aload 69
    //   280: invokevirtual 169	java/io/File:length	()J
    //   283: lstore 70
    //   285: lload 70
    //   287: lconst_0
    //   288: lcmp
    //   289: ifle +41 -> 330
    //   292: ldc2_w 170
    //   295: lload 70
    //   297: ldiv
    //   298: l2i
    //   299: istore 10
    //   301: ldc 51
    //   303: iconst_2
    //   304: invokestatic 138	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   307: ifeq +23 -> 330
    //   310: new 146	java/lang/StringBuilder
    //   313: dup
    //   314: bipush 31
    //   316: invokespecial 149	java/lang/StringBuilder:<init>	(I)V
    //   319: ldc 173
    //   321: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: iload 10
    //   326: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   329: pop
    //   330: iinc 16 1
    //   333: iload 16
    //   335: iload 10
    //   337: if_icmpgt +13 -> 350
    //   340: aload 8
    //   342: aload 69
    //   344: invokeinterface 179 2 0
    //   349: pop
    //   350: aload 13
    //   352: invokeinterface 182 1 0
    //   357: istore 73
    //   359: iload 73
    //   361: ifne -120 -> 241
    //   364: aload 13
    //   366: ifnull +10 -> 376
    //   369: aload 13
    //   371: invokeinterface 185 1 0
    //   376: ldc 51
    //   378: iconst_2
    //   379: invokestatic 138	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   382: ifeq +37 -> 419
    //   385: aload 8
    //   387: invokeinterface 188 1 0
    //   392: istore 66
    //   394: new 146	java/lang/StringBuilder
    //   397: dup
    //   398: bipush 26
    //   400: invokespecial 149	java/lang/StringBuilder:<init>	(I)V
    //   403: ldc 190
    //   405: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   408: iload 66
    //   410: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   413: ldc 192
    //   415: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: pop
    //   419: aload 8
    //   421: invokeinterface 196 1 0
    //   426: astore 17
    //   428: aload 17
    //   430: invokeinterface 201 1 0
    //   435: ifeq +160 -> 595
    //   438: aload 17
    //   440: invokeinterface 205 1 0
    //   445: checkcast 31	java/io/File
    //   448: astore 61
    //   450: ldc 51
    //   452: iconst_2
    //   453: invokestatic 138	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   456: ifeq +39 -> 495
    //   459: aload 61
    //   461: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   464: astore 64
    //   466: new 146	java/lang/StringBuilder
    //   469: dup
    //   470: bipush 10
    //   472: aload 64
    //   474: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   477: invokevirtual 213	java/lang/String:length	()I
    //   480: iadd
    //   481: invokespecial 149	java/lang/StringBuilder:<init>	(I)V
    //   484: ldc 215
    //   486: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   489: aload 64
    //   491: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   494: pop
    //   495: aload 61
    //   497: invokevirtual 218	java/io/File:delete	()Z
    //   500: ifne -72 -> 428
    //   503: aload 61
    //   505: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   508: astore 62
    //   510: ldc 51
    //   512: new 146	java/lang/StringBuilder
    //   515: dup
    //   516: bipush 36
    //   518: aload 62
    //   520: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   523: invokevirtual 213	java/lang/String:length	()I
    //   526: iadd
    //   527: invokespecial 149	java/lang/StringBuilder:<init>	(I)V
    //   530: ldc 220
    //   532: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   535: aload 62
    //   537: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   540: invokevirtual 224	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   543: invokestatic 59	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   546: pop
    //   547: goto -119 -> 428
    //   550: aload 9
    //   552: new 226	android/util/Pair
    //   555: dup
    //   556: aload 68
    //   558: aload 13
    //   560: iconst_3
    //   561: invokeinterface 165 2 0
    //   566: invokespecial 229	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   569: invokeinterface 234 2 0
    //   574: pop
    //   575: goto -225 -> 350
    //   578: astore 12
    //   580: aload 13
    //   582: ifnull +10 -> 592
    //   585: aload 13
    //   587: invokeinterface 185 1 0
    //   592: aload 12
    //   594: athrow
    //   595: ldc 51
    //   597: iconst_2
    //   598: invokestatic 138	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   601: ifeq +37 -> 638
    //   604: aload 9
    //   606: invokeinterface 235 1 0
    //   611: istore 59
    //   613: new 146	java/lang/StringBuilder
    //   616: dup
    //   617: bipush 29
    //   619: invokespecial 149	java/lang/StringBuilder:<init>	(I)V
    //   622: ldc 237
    //   624: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   627: iload 59
    //   629: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   632: ldc 192
    //   634: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   637: pop
    //   638: aload 9
    //   640: invokeinterface 238 1 0
    //   645: astore 18
    //   647: aload 18
    //   649: invokeinterface 201 1 0
    //   654: ifeq -584 -> 70
    //   657: aload 18
    //   659: invokeinterface 205 1 0
    //   664: checkcast 226	android/util/Pair
    //   667: astore 19
    //   669: aload 19
    //   671: getfield 242	android/util/Pair:first	Ljava/lang/Object;
    //   674: checkcast 207	java/lang/String
    //   677: astore 20
    //   679: aload 19
    //   681: getfield 245	android/util/Pair:second	Ljava/lang/Object;
    //   684: checkcast 207	java/lang/String
    //   687: astore 21
    //   689: new 31	java/io/File
    //   692: dup
    //   693: aload_3
    //   694: aload 20
    //   696: invokespecial 42	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   699: astore 22
    //   701: iload 16
    //   703: iload 10
    //   705: if_icmpge +573 -> 1278
    //   708: ldc 51
    //   710: iconst_2
    //   711: invokestatic 138	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   714: ifeq +26 -> 740
    //   717: aload 21
    //   719: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   722: astore 56
    //   724: aload 56
    //   726: invokevirtual 213	java/lang/String:length	()I
    //   729: ifeq +299 -> 1028
    //   732: ldc 247
    //   734: aload 56
    //   736: invokevirtual 251	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   739: pop
    //   740: aload_1
    //   741: aload 21
    //   743: getstatic 256	ipm:a	Lipm;
    //   746: invokestatic 261	ipf:a	(Landroid/content/Context;Ljava/lang/String;Lipm;)Lipf;
    //   749: astore 30
    //   751: new 263	ipc
    //   754: dup
    //   755: aload 7
    //   757: aconst_null
    //   758: aload 30
    //   760: iconst_0
    //   761: iload 5
    //   763: iload 6
    //   765: bipush 8
    //   767: invokespecial 266	ipc:<init>	(Lipb;Lkbd;Lipf;IIII)V
    //   770: invokevirtual 268	ipc:a	()Ljava/lang/Object;
    //   773: checkcast 270	[B
    //   776: astore 55
    //   778: aload 55
    //   780: astore 34
    //   782: aload 34
    //   784: ifnull +602 -> 1386
    //   787: iload 10
    //   789: ldc 118
    //   791: if_icmpne +588 -> 1379
    //   794: aload 34
    //   796: arraylength
    //   797: i2l
    //   798: lstore 50
    //   800: lload 50
    //   802: lconst_0
    //   803: lcmp
    //   804: ifle +575 -> 1379
    //   807: ldc2_w 170
    //   810: lload 50
    //   812: ldiv
    //   813: l2i
    //   814: istore 35
    //   816: ldc 51
    //   818: iconst_2
    //   819: invokestatic 138	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   822: ifeq +23 -> 845
    //   825: new 146	java/lang/StringBuilder
    //   828: dup
    //   829: bipush 31
    //   831: invokespecial 149	java/lang/StringBuilder:<init>	(I)V
    //   834: ldc 173
    //   836: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   839: iload 35
    //   841: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   844: pop
    //   845: iconst_0
    //   846: istore 36
    //   848: new 272	java/io/FileOutputStream
    //   851: dup
    //   852: aload 22
    //   854: invokespecial 275	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   857: astore 37
    //   859: aload 37
    //   861: aload 34
    //   863: invokevirtual 279	java/io/FileOutputStream:write	([B)V
    //   866: aload 37
    //   868: invokevirtual 280	java/io/FileOutputStream:close	()V
    //   871: iload 36
    //   873: ifeq +63 -> 936
    //   876: aload 22
    //   878: invokevirtual 46	java/io/File:exists	()Z
    //   881: ifeq +55 -> 936
    //   884: aload 22
    //   886: invokevirtual 218	java/io/File:delete	()Z
    //   889: ifne +47 -> 936
    //   892: aload 22
    //   894: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   897: astore 44
    //   899: ldc 51
    //   901: new 146	java/lang/StringBuilder
    //   904: dup
    //   905: bipush 36
    //   907: aload 44
    //   909: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   912: invokevirtual 213	java/lang/String:length	()I
    //   915: iadd
    //   916: invokespecial 149	java/lang/StringBuilder:<init>	(I)V
    //   919: ldc 220
    //   921: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   924: aload 44
    //   926: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   929: invokevirtual 224	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   932: invokestatic 59	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   935: pop
    //   936: iload 35
    //   938: istore 10
    //   940: aload 22
    //   942: invokevirtual 46	java/io/File:exists	()Z
    //   945: ifeq +386 -> 1331
    //   948: iload 16
    //   950: iconst_1
    //   951: iadd
    //   952: istore 24
    //   954: aload 22
    //   956: invokevirtual 283	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   959: astore 25
    //   961: aload 11
    //   963: invokevirtual 286	android/content/ContentValues:clear	()V
    //   966: aload 11
    //   968: ldc_w 288
    //   971: aload 25
    //   973: invokevirtual 292	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   976: ldc_w 294
    //   979: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   982: astore 26
    //   984: aload 20
    //   986: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   989: astore 27
    //   991: aload 27
    //   993: invokevirtual 213	java/lang/String:length	()I
    //   996: ifeq +345 -> 1341
    //   999: aload 26
    //   1001: aload 27
    //   1003: invokevirtual 251	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1006: astore 28
    //   1008: aload 4
    //   1010: ldc 39
    //   1012: aload 11
    //   1014: aload 28
    //   1016: aconst_null
    //   1017: invokevirtual 298	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   1020: pop
    //   1021: iload 24
    //   1023: istore 16
    //   1025: goto -378 -> 647
    //   1028: new 207	java/lang/String
    //   1031: dup
    //   1032: ldc 247
    //   1034: invokespecial 301	java/lang/String:<init>	(Ljava/lang/String;)V
    //   1037: pop
    //   1038: goto -298 -> 740
    //   1041: astore 53
    //   1043: ldc 51
    //   1045: ldc_w 303
    //   1048: aload 53
    //   1050: invokestatic 306	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1053: pop
    //   1054: aconst_null
    //   1055: astore 34
    //   1057: goto -275 -> 782
    //   1060: astore 31
    //   1062: aload 30
    //   1064: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1067: astore 32
    //   1069: ldc 51
    //   1071: new 146	java/lang/StringBuilder
    //   1074: dup
    //   1075: bipush 9
    //   1077: aload 32
    //   1079: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1082: invokevirtual 213	java/lang/String:length	()I
    //   1085: iadd
    //   1086: invokespecial 149	java/lang/StringBuilder:<init>	(I)V
    //   1089: ldc_w 308
    //   1092: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1095: aload 32
    //   1097: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1100: invokevirtual 224	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1103: aload 31
    //   1105: invokestatic 306	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1108: pop
    //   1109: aconst_null
    //   1110: astore 34
    //   1112: goto -330 -> 782
    //   1115: astore 48
    //   1117: ldc 51
    //   1119: ldc_w 310
    //   1122: aload 48
    //   1124: invokestatic 306	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1127: pop
    //   1128: iconst_0
    //   1129: istore 36
    //   1131: goto -260 -> 871
    //   1134: astore 38
    //   1136: aconst_null
    //   1137: astore 37
    //   1139: aload 22
    //   1141: invokevirtual 313	java/io/File:getPath	()Ljava/lang/String;
    //   1144: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1147: astore 42
    //   1149: ldc 51
    //   1151: new 146	java/lang/StringBuilder
    //   1154: dup
    //   1155: bipush 43
    //   1157: aload 21
    //   1159: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1162: invokevirtual 213	java/lang/String:length	()I
    //   1165: iadd
    //   1166: aload 42
    //   1168: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1171: invokevirtual 213	java/lang/String:length	()I
    //   1174: iadd
    //   1175: invokespecial 149	java/lang/StringBuilder:<init>	(I)V
    //   1178: ldc_w 315
    //   1181: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1184: aload 21
    //   1186: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1189: ldc_w 317
    //   1192: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1195: aload 42
    //   1197: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1200: invokevirtual 224	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1203: aload 38
    //   1205: invokestatic 306	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1208: pop
    //   1209: aload 37
    //   1211: ifnull +162 -> 1373
    //   1214: aload 37
    //   1216: invokevirtual 280	java/io/FileOutputStream:close	()V
    //   1219: iconst_1
    //   1220: istore 36
    //   1222: goto -351 -> 871
    //   1225: astore 46
    //   1227: ldc 51
    //   1229: ldc_w 310
    //   1232: aload 46
    //   1234: invokestatic 306	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1237: pop
    //   1238: iconst_1
    //   1239: istore 36
    //   1241: goto -370 -> 871
    //   1244: astore 39
    //   1246: aconst_null
    //   1247: astore 37
    //   1249: aload 37
    //   1251: ifnull +8 -> 1259
    //   1254: aload 37
    //   1256: invokevirtual 280	java/io/FileOutputStream:close	()V
    //   1259: aload 39
    //   1261: athrow
    //   1262: astore 40
    //   1264: ldc 51
    //   1266: ldc_w 310
    //   1269: aload 40
    //   1271: invokestatic 306	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1274: pop
    //   1275: goto -16 -> 1259
    //   1278: ldc 51
    //   1280: iconst_2
    //   1281: invokestatic 138	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1284: ifeq -344 -> 940
    //   1287: new 146	java/lang/StringBuilder
    //   1290: dup
    //   1291: bipush 50
    //   1293: aload 20
    //   1295: invokestatic 211	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1298: invokevirtual 213	java/lang/String:length	()I
    //   1301: iadd
    //   1302: invokespecial 149	java/lang/StringBuilder:<init>	(I)V
    //   1305: ldc_w 319
    //   1308: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1311: aload 20
    //   1313: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1316: ldc_w 321
    //   1319: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1322: iload 10
    //   1324: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1327: pop
    //   1328: goto -388 -> 940
    //   1331: iload 16
    //   1333: istore 24
    //   1335: aconst_null
    //   1336: astore 25
    //   1338: goto -377 -> 961
    //   1341: new 207	java/lang/String
    //   1344: dup
    //   1345: aload 26
    //   1347: invokespecial 301	java/lang/String:<init>	(Ljava/lang/String;)V
    //   1350: astore 28
    //   1352: goto -344 -> 1008
    //   1355: astore 39
    //   1357: goto -108 -> 1249
    //   1360: astore 38
    //   1362: goto -223 -> 1139
    //   1365: astore 12
    //   1367: aconst_null
    //   1368: astore 13
    //   1370: goto -790 -> 580
    //   1373: iconst_1
    //   1374: istore 36
    //   1376: goto -505 -> 871
    //   1379: iload 10
    //   1381: istore 35
    //   1383: goto -538 -> 845
    //   1386: iload 10
    //   1388: istore 35
    //   1390: goto -454 -> 936
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1393	0	this	bqq
    //   4	737	1	localContext	Context
    //   9	72	2	i	int
    //   57	637	3	localFile1	java.io.File
    //   87	922	4	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   102	660	5	j	int
    //   113	651	6	k	int
    //   124	632	7	localipb	ipb
    //   140	280	8	localHashSet	java.util.HashSet
    //   149	490	9	localArrayList	java.util.ArrayList
    //   153	1234	10	m	int
    //   162	851	11	localContentValues	android.content.ContentValues
    //   578	15	12	localObject1	java.lang.Object
    //   1365	1	12	localObject2	java.lang.Object
    //   184	1185	13	localCursor1	android.database.Cursor
    //   180	3	14	localCursor2	android.database.Cursor
    //   231	6	15	bool1	boolean
    //   234	1098	16	n	int
    //   426	13	17	localIterator1	java.util.Iterator
    //   645	13	18	localIterator2	java.util.Iterator
    //   667	13	19	localPair	android.util.Pair
    //   677	635	20	str1	String
    //   687	498	21	str2	String
    //   699	441	22	localFile2	java.io.File
    //   952	382	24	i1	int
    //   959	378	25	str3	String
    //   982	364	26	str4	String
    //   989	13	27	str5	String
    //   1006	345	28	str6	String
    //   749	314	30	localipf	ipf
    //   1060	44	31	localkbc	kbc
    //   1067	29	32	str7	String
    //   780	331	34	arrayOfByte1	byte[]
    //   814	575	35	i2	int
    //   846	529	36	i3	int
    //   857	398	37	localFileOutputStream	java.io.FileOutputStream
    //   1134	70	38	localIOException1	java.io.IOException
    //   1360	1	38	localIOException2	java.io.IOException
    //   1244	16	39	localObject3	java.lang.Object
    //   1355	1	39	localObject4	java.lang.Object
    //   1262	8	40	localIOException3	java.io.IOException
    //   1147	49	42	str8	String
    //   897	28	44	str9	String
    //   1225	8	46	localIOException4	java.io.IOException
    //   1115	8	48	localIOException5	java.io.IOException
    //   798	13	50	l1	long
    //   1041	8	53	localkbm	kbm
    //   776	3	55	arrayOfByte2	byte[]
    //   722	13	56	str10	String
    //   611	17	59	i4	int
    //   448	56	61	localFile3	java.io.File
    //   508	28	62	str11	String
    //   464	26	64	str12	String
    //   392	17	66	i5	int
    //   249	308	68	str13	String
    //   261	82	69	localFile4	java.io.File
    //   283	13	70	l2	long
    //   357	3	73	bool2	boolean
    //   202	17	76	i6	int
    // Exception table:
    //   from	to	target	type
    //   186	224	578	finally
    //   224	233	578	finally
    //   241	271	578	finally
    //   278	285	578	finally
    //   292	330	578	finally
    //   340	350	578	finally
    //   350	359	578	finally
    //   550	575	578	finally
    //   751	778	1041	kbm
    //   751	778	1060	kbc
    //   866	871	1115	java/io/IOException
    //   848	859	1134	java/io/IOException
    //   1214	1219	1225	java/io/IOException
    //   848	859	1244	finally
    //   1254	1259	1262	java/io/IOException
    //   859	866	1355	finally
    //   1139	1209	1355	finally
    //   859	866	1360	java/io/IOException
    //   164	182	1365	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bqq
 * JD-Core Version:    0.7.0.1
 */