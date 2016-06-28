import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import java.text.SimpleDateFormat;
import java.util.Locale;

final class awr
  extends hqe<awp>
{
  private static final SimpleDateFormat d = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss", Locale.getDefault());
  @SuppressLint({"InlinedApi"})
  private static final String[] e = { "_data", "datetaken", "orientation", "title", "_size", "latitude", "longitude", "null AS duration", "null AS width", "null AS height" };
  @SuppressLint({"InlinedApi"})
  private static final String[] f = { "_data", "datetaken", "orientation", "title", "_size", "latitude", "longitude", "null AS duration", "width", "height" };
  @SuppressLint({"InlinedApi"})
  private static final String[] h = { "_data", "datetaken", "null AS orientation", "title", "_size", "latitude", "longitude", "duration", "null AS width", "null AS height" };
  @SuppressLint({"InlinedApi"})
  private static final String[] r = { "_data", "datetaken", "null AS orientation", "title", "_size", "latitude", "longitude", "duration", "width", "height" };
  private final String[] s;
  private final Uri t;
  private final int u;
  
  public awr(Context paramContext, Uri paramUri, int paramInt)
  {
    super(paramContext);
    this.t = paramUri;
    this.u = paramInt;
    if (paramInt == 0)
    {
      if (Build.VERSION.SDK_INT >= 16)
      {
        this.s = f;
        return;
      }
      this.s = e;
      return;
    }
    if (paramInt == 1)
    {
      if (Build.VERSION.SDK_INT >= 16)
      {
        this.s = r;
        return;
      }
      this.s = h;
      return;
    }
    throw new IllegalArgumentException("You must specify a valid media type");
  }
  
  /* Error */
  private awp r()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 109	fu:l	Landroid/content/Context;
    //   4: invokevirtual 115	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   7: astore_1
    //   8: new 117	awp
    //   11: dup
    //   12: invokespecial 119	awp:<init>	()V
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 82	awr:t	Landroid/net/Uri;
    //   20: invokestatic 125	mfq:b	(Landroid/net/Uri;)Z
    //   23: istore_3
    //   24: aconst_null
    //   25: astore 4
    //   27: iload_3
    //   28: ifeq +20 -> 48
    //   31: aload_1
    //   32: aload_0
    //   33: getfield 82	awr:t	Landroid/net/Uri;
    //   36: aload_0
    //   37: getfield 91	awr:s	[Ljava/lang/String;
    //   40: aconst_null
    //   41: aconst_null
    //   42: aconst_null
    //   43: invokevirtual 131	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore 4
    //   48: aload 4
    //   50: ifnull +284 -> 334
    //   53: aload 4
    //   55: invokeinterface 137 1 0
    //   60: ifeq +267 -> 327
    //   63: aload 4
    //   65: iconst_0
    //   66: invokeinterface 141 2 0
    //   71: ifne +15 -> 86
    //   74: aload_2
    //   75: aload 4
    //   77: iconst_0
    //   78: invokeinterface 145 2 0
    //   83: putfield 148	awp:h	Ljava/lang/String;
    //   86: aload 4
    //   88: iconst_1
    //   89: invokeinterface 141 2 0
    //   94: ifne +18 -> 112
    //   97: aload_2
    //   98: aload 4
    //   100: iconst_1
    //   101: invokeinterface 152 2 0
    //   106: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   109: putfield 162	awp:c	Ljava/lang/Long;
    //   112: aload 4
    //   114: iconst_2
    //   115: invokeinterface 141 2 0
    //   120: ifne +18 -> 138
    //   123: aload_2
    //   124: aload 4
    //   126: iconst_2
    //   127: invokeinterface 166 2 0
    //   132: invokestatic 171	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   135: putfield 174	awp:f	Ljava/lang/Integer;
    //   138: aload 4
    //   140: iconst_3
    //   141: invokeinterface 141 2 0
    //   146: ifne +15 -> 161
    //   149: aload_2
    //   150: aload 4
    //   152: iconst_3
    //   153: invokeinterface 145 2 0
    //   158: putfield 177	awp:g	Ljava/lang/String;
    //   161: aload 4
    //   163: iconst_4
    //   164: invokeinterface 141 2 0
    //   169: ifne +18 -> 187
    //   172: aload_2
    //   173: aload 4
    //   175: iconst_4
    //   176: invokeinterface 152 2 0
    //   181: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   184: putfield 180	awp:i	Ljava/lang/Long;
    //   187: aload 4
    //   189: iconst_5
    //   190: invokeinterface 141 2 0
    //   195: ifne +18 -> 213
    //   198: aload_2
    //   199: aload 4
    //   201: iconst_5
    //   202: invokeinterface 184 2 0
    //   207: invokestatic 189	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   210: putfield 193	awp:a	Ljava/lang/Double;
    //   213: aload 4
    //   215: bipush 6
    //   217: invokeinterface 141 2 0
    //   222: ifne +19 -> 241
    //   225: aload_2
    //   226: aload 4
    //   228: bipush 6
    //   230: invokeinterface 184 2 0
    //   235: invokestatic 189	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   238: putfield 195	awp:b	Ljava/lang/Double;
    //   241: aload 4
    //   243: bipush 7
    //   245: invokeinterface 141 2 0
    //   250: ifne +19 -> 269
    //   253: aload_2
    //   254: aload 4
    //   256: bipush 7
    //   258: invokeinterface 152 2 0
    //   263: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   266: putfield 198	awp:q	Ljava/lang/Long;
    //   269: aload 4
    //   271: bipush 8
    //   273: invokeinterface 141 2 0
    //   278: ifne +20 -> 298
    //   281: aload_2
    //   282: aload 4
    //   284: bipush 8
    //   286: invokeinterface 166 2 0
    //   291: i2l
    //   292: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   295: putfield 200	awp:d	Ljava/lang/Long;
    //   298: aload 4
    //   300: bipush 9
    //   302: invokeinterface 141 2 0
    //   307: ifne +20 -> 327
    //   310: aload_2
    //   311: aload 4
    //   313: bipush 9
    //   315: invokeinterface 166 2 0
    //   320: i2l
    //   321: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   324: putfield 202	awp:e	Ljava/lang/Long;
    //   327: aload 4
    //   329: invokeinterface 205 1 0
    //   334: aload_0
    //   335: getfield 84	awr:u	I
    //   338: ifne +705 -> 1043
    //   341: new 207	hxp
    //   344: dup
    //   345: invokespecial 208	hxp:<init>	()V
    //   348: astore 5
    //   350: aload 5
    //   352: aload_1
    //   353: aload_0
    //   354: getfield 82	awr:t	Landroid/net/Uri;
    //   357: invokevirtual 212	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   360: invokevirtual 215	hxp:a	(Ljava/io/InputStream;)V
    //   363: aload_2
    //   364: getfield 162	awp:c	Ljava/lang/Long;
    //   367: astore 8
    //   369: aload 8
    //   371: ifnonnull +762 -> 1133
    //   374: lconst_0
    //   375: lstore 9
    //   377: lload 9
    //   379: lconst_0
    //   380: lcmp
    //   381: ifne +58 -> 439
    //   384: getstatic 217	hxp:i	I
    //   387: istore 61
    //   389: aload 5
    //   391: iload 61
    //   393: aload 5
    //   395: iload 61
    //   397: invokevirtual 219	hxp:d	(I)I
    //   400: invokevirtual 222	hxp:a	(II)Lhya;
    //   403: astore 62
    //   405: aload 62
    //   407: ifnonnull +736 -> 1143
    //   410: aconst_null
    //   411: astore 63
    //   413: aload 63
    //   415: invokestatic 228	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   418: ifne +21 -> 439
    //   421: aload_2
    //   422: getstatic 38	awr:d	Ljava/text/SimpleDateFormat;
    //   425: aload 63
    //   427: invokevirtual 232	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   430: invokevirtual 238	java/util/Date:getTime	()J
    //   433: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   436: putfield 162	awp:c	Ljava/lang/Long;
    //   439: aload_2
    //   440: getfield 200	awp:d	Ljava/lang/Long;
    //   443: astore 11
    //   445: aload 11
    //   447: ifnonnull +723 -> 1170
    //   450: lconst_0
    //   451: lstore 12
    //   453: lload 12
    //   455: lconst_0
    //   456: lcmp
    //   457: ifne +70 -> 527
    //   460: getstatic 240	hxp:a	I
    //   463: istore 57
    //   465: aload 5
    //   467: iload 57
    //   469: aload 5
    //   471: iload 57
    //   473: invokevirtual 219	hxp:d	(I)I
    //   476: invokevirtual 222	hxp:a	(II)Lhya;
    //   479: astore 58
    //   481: aload 58
    //   483: ifnull +697 -> 1180
    //   486: aload 58
    //   488: getfield 245	hya:g	Ljava/lang/Object;
    //   491: instanceof 247
    //   494: ifeq +686 -> 1180
    //   497: aload 58
    //   499: getfield 245	hya:g	Ljava/lang/Object;
    //   502: checkcast 247	[J
    //   505: astore 59
    //   507: aload 59
    //   509: ifnull +9 -> 518
    //   512: aload 59
    //   514: arraylength
    //   515: ifgt +671 -> 1186
    //   518: aconst_null
    //   519: astore 60
    //   521: aload_2
    //   522: aload 60
    //   524: putfield 200	awp:d	Ljava/lang/Long;
    //   527: aload_2
    //   528: getfield 202	awp:e	Ljava/lang/Long;
    //   531: astore 14
    //   533: aload 14
    //   535: ifnonnull +663 -> 1198
    //   538: lconst_0
    //   539: lstore 15
    //   541: lload 15
    //   543: lconst_0
    //   544: lcmp
    //   545: ifne +70 -> 615
    //   548: getstatic 249	hxp:b	I
    //   551: istore 53
    //   553: aload 5
    //   555: iload 53
    //   557: aload 5
    //   559: iload 53
    //   561: invokevirtual 219	hxp:d	(I)I
    //   564: invokevirtual 222	hxp:a	(II)Lhya;
    //   567: astore 54
    //   569: aload 54
    //   571: ifnull +637 -> 1208
    //   574: aload 54
    //   576: getfield 245	hya:g	Ljava/lang/Object;
    //   579: instanceof 247
    //   582: ifeq +626 -> 1208
    //   585: aload 54
    //   587: getfield 245	hya:g	Ljava/lang/Object;
    //   590: checkcast 247	[J
    //   593: astore 55
    //   595: aload 55
    //   597: ifnull +9 -> 606
    //   600: aload 55
    //   602: arraylength
    //   603: ifgt +611 -> 1214
    //   606: aconst_null
    //   607: astore 56
    //   609: aload_2
    //   610: aload 56
    //   612: putfield 202	awp:e	Ljava/lang/Long;
    //   615: aload_2
    //   616: getfield 174	awp:f	Ljava/lang/Integer;
    //   619: astore 17
    //   621: aload 17
    //   623: ifnonnull +603 -> 1226
    //   626: iconst_0
    //   627: istore 18
    //   629: iload 18
    //   631: ifne +78 -> 709
    //   634: getstatic 251	hxp:f	I
    //   637: istore 48
    //   639: aload 5
    //   641: iload 48
    //   643: aload 5
    //   645: iload 48
    //   647: invokevirtual 219	hxp:d	(I)I
    //   650: invokevirtual 222	hxp:a	(II)Lhya;
    //   653: astore 49
    //   655: aload 49
    //   657: ifnull +579 -> 1236
    //   660: aload 49
    //   662: getfield 245	hya:g	Ljava/lang/Object;
    //   665: instanceof 253
    //   668: ifeq +568 -> 1236
    //   671: aload 49
    //   673: getfield 245	hya:g	Ljava/lang/Object;
    //   676: checkcast 253	[B
    //   679: astore 50
    //   681: aload 50
    //   683: ifnull +9 -> 692
    //   686: aload 50
    //   688: arraylength
    //   689: ifgt +553 -> 1242
    //   692: aconst_null
    //   693: astore 51
    //   695: aload 51
    //   697: ifnonnull +561 -> 1258
    //   700: aconst_null
    //   701: astore 52
    //   703: aload_2
    //   704: aload 52
    //   706: putfield 174	awp:f	Ljava/lang/Integer;
    //   709: aload_2
    //   710: getfield 256	awp:p	Ljava/lang/Integer;
    //   713: astore 19
    //   715: aload 19
    //   717: ifnonnull +554 -> 1271
    //   720: iconst_0
    //   721: istore 20
    //   723: iload 20
    //   725: ifne +52 -> 777
    //   728: getstatic 258	hxp:r	I
    //   731: istore 44
    //   733: aload 5
    //   735: iload 44
    //   737: aload 5
    //   739: iload 44
    //   741: invokevirtual 219	hxp:d	(I)I
    //   744: invokevirtual 222	hxp:a	(II)Lhya;
    //   747: astore 45
    //   749: aload 45
    //   751: ifnonnull +530 -> 1281
    //   754: aconst_null
    //   755: astore 46
    //   757: aload 46
    //   759: ifnull +9 -> 768
    //   762: aload 46
    //   764: arraylength
    //   765: ifgt +526 -> 1291
    //   768: aconst_null
    //   769: astore 47
    //   771: aload_2
    //   772: aload 47
    //   774: putfield 256	awp:p	Ljava/lang/Integer;
    //   777: aload_2
    //   778: getfield 262	awp:j	Ljava/lang/Float;
    //   781: ifnonnull +52 -> 833
    //   784: getstatic 264	hxp:s	I
    //   787: istore 40
    //   789: aload 5
    //   791: iload 40
    //   793: aload 5
    //   795: iload 40
    //   797: invokevirtual 219	hxp:d	(I)I
    //   800: invokevirtual 267	hxp:b	(II)[Lhye;
    //   803: astore 41
    //   805: aload 41
    //   807: ifnull +9 -> 816
    //   810: aload 41
    //   812: arraylength
    //   813: ifne +490 -> 1303
    //   816: aconst_null
    //   817: astore 42
    //   819: aload 42
    //   821: ifnonnull +498 -> 1319
    //   824: aconst_null
    //   825: astore 43
    //   827: aload_2
    //   828: aload 43
    //   830: putfield 262	awp:j	Ljava/lang/Float;
    //   833: aload_2
    //   834: getfield 270	awp:k	Ljava/lang/Float;
    //   837: ifnonnull +52 -> 889
    //   840: getstatic 272	hxp:q	I
    //   843: istore 36
    //   845: aload 5
    //   847: iload 36
    //   849: aload 5
    //   851: iload 36
    //   853: invokevirtual 219	hxp:d	(I)I
    //   856: invokevirtual 267	hxp:b	(II)[Lhye;
    //   859: astore 37
    //   861: aload 37
    //   863: ifnull +9 -> 872
    //   866: aload 37
    //   868: arraylength
    //   869: ifne +472 -> 1341
    //   872: aconst_null
    //   873: astore 38
    //   875: aload 38
    //   877: ifnonnull +480 -> 1357
    //   880: aconst_null
    //   881: astore 39
    //   883: aload_2
    //   884: aload 39
    //   886: putfield 270	awp:k	Ljava/lang/Float;
    //   889: aload_2
    //   890: getfield 193	awp:a	Ljava/lang/Double;
    //   893: astore 21
    //   895: aload 21
    //   897: ifnonnull +482 -> 1379
    //   900: dconst_0
    //   901: dstore 22
    //   903: dload 22
    //   905: dconst_0
    //   906: dcmpl
    //   907: ifeq +24 -> 931
    //   910: aload_2
    //   911: getfield 195	awp:b	Ljava/lang/Double;
    //   914: astore 33
    //   916: aload 33
    //   918: ifnonnull +471 -> 1389
    //   921: dconst_0
    //   922: dstore 34
    //   924: dload 34
    //   926: dconst_0
    //   927: dcmpl
    //   928: ifne +37 -> 965
    //   931: aload 5
    //   933: invokevirtual 275	hxp:a	()[D
    //   936: astore 24
    //   938: aload 24
    //   940: ifnull +25 -> 965
    //   943: aload_2
    //   944: aload 24
    //   946: iconst_0
    //   947: daload
    //   948: invokestatic 189	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   951: putfield 193	awp:a	Ljava/lang/Double;
    //   954: aload_2
    //   955: aload 24
    //   957: iconst_1
    //   958: daload
    //   959: invokestatic 189	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   962: putfield 195	awp:b	Ljava/lang/Double;
    //   965: aload_2
    //   966: getfield 200	awp:d	Ljava/lang/Long;
    //   969: astore 25
    //   971: aload 25
    //   973: ifnonnull +426 -> 1399
    //   976: lconst_0
    //   977: lstore 26
    //   979: lload 26
    //   981: lconst_0
    //   982: lcmp
    //   983: ifeq +24 -> 1007
    //   986: aload_2
    //   987: getfield 202	awp:e	Ljava/lang/Long;
    //   990: astore 30
    //   992: aload 30
    //   994: ifnonnull +415 -> 1409
    //   997: lconst_0
    //   998: lstore 31
    //   1000: lload 31
    //   1002: lconst_0
    //   1003: lcmp
    //   1004: ifne +39 -> 1043
    //   1007: aload_1
    //   1008: aload_0
    //   1009: getfield 82	awr:t	Landroid/net/Uri;
    //   1012: invokestatic 280	efj:b	(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Point;
    //   1015: astore 29
    //   1017: aload_2
    //   1018: aload 29
    //   1020: getfield 285	android/graphics/Point:x	I
    //   1023: i2l
    //   1024: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1027: putfield 200	awp:d	Ljava/lang/Long;
    //   1030: aload_2
    //   1031: aload 29
    //   1033: getfield 288	android/graphics/Point:y	I
    //   1036: i2l
    //   1037: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1040: putfield 202	awp:e	Ljava/lang/Long;
    //   1043: aload_2
    //   1044: getfield 177	awp:g	Ljava/lang/String;
    //   1047: invokestatic 228	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1050: ifeq +31 -> 1081
    //   1053: aload_2
    //   1054: getfield 148	awp:h	Ljava/lang/String;
    //   1057: invokestatic 228	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1060: ifne +21 -> 1081
    //   1063: aload_2
    //   1064: new 290	java/io/File
    //   1067: dup
    //   1068: aload_2
    //   1069: getfield 148	awp:h	Ljava/lang/String;
    //   1072: invokespecial 291	java/io/File:<init>	(Ljava/lang/String;)V
    //   1075: invokevirtual 295	java/io/File:getName	()Ljava/lang/String;
    //   1078: putfield 177	awp:g	Ljava/lang/String;
    //   1081: aload_2
    //   1082: getfield 148	awp:h	Ljava/lang/String;
    //   1085: invokestatic 228	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1088: ifeq +14 -> 1102
    //   1091: aload_2
    //   1092: aload_0
    //   1093: getfield 82	awr:t	Landroid/net/Uri;
    //   1096: invokevirtual 300	android/net/Uri:toString	()Ljava/lang/String;
    //   1099: putfield 148	awp:h	Ljava/lang/String;
    //   1102: aload_2
    //   1103: areturn
    //   1104: astore 66
    //   1106: aload 4
    //   1108: invokeinterface 205 1 0
    //   1113: aload 66
    //   1115: athrow
    //   1116: astore 6
    //   1118: ldc_w 302
    //   1121: ldc_w 304
    //   1124: aload 6
    //   1126: invokestatic 309	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1129: pop
    //   1130: goto -767 -> 363
    //   1133: aload 8
    //   1135: invokevirtual 312	java/lang/Long:longValue	()J
    //   1138: lstore 9
    //   1140: goto -763 -> 377
    //   1143: aload 62
    //   1145: invokevirtual 314	hya:a	()Ljava/lang/String;
    //   1148: astore 63
    //   1150: goto -737 -> 413
    //   1153: astore 64
    //   1155: ldc_w 302
    //   1158: ldc_w 316
    //   1161: aload 64
    //   1163: invokestatic 309	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1166: pop
    //   1167: goto -728 -> 439
    //   1170: aload 11
    //   1172: invokevirtual 312	java/lang/Long:longValue	()J
    //   1175: lstore 12
    //   1177: goto -724 -> 453
    //   1180: aconst_null
    //   1181: astore 59
    //   1183: goto -676 -> 507
    //   1186: aload 59
    //   1188: iconst_0
    //   1189: laload
    //   1190: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1193: astore 60
    //   1195: goto -674 -> 521
    //   1198: aload 14
    //   1200: invokevirtual 312	java/lang/Long:longValue	()J
    //   1203: lstore 15
    //   1205: goto -664 -> 541
    //   1208: aconst_null
    //   1209: astore 55
    //   1211: goto -616 -> 595
    //   1214: aload 55
    //   1216: iconst_0
    //   1217: laload
    //   1218: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1221: astore 56
    //   1223: goto -614 -> 609
    //   1226: aload 17
    //   1228: invokevirtual 320	java/lang/Integer:intValue	()I
    //   1231: istore 18
    //   1233: goto -604 -> 629
    //   1236: aconst_null
    //   1237: astore 50
    //   1239: goto -558 -> 681
    //   1242: new 322	java/lang/Byte
    //   1245: dup
    //   1246: aload 50
    //   1248: iconst_0
    //   1249: baload
    //   1250: invokespecial 325	java/lang/Byte:<init>	(B)V
    //   1253: astore 51
    //   1255: goto -560 -> 695
    //   1258: aload 51
    //   1260: invokevirtual 329	java/lang/Byte:byteValue	()B
    //   1263: invokestatic 171	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1266: astore 52
    //   1268: goto -565 -> 703
    //   1271: aload 19
    //   1273: invokevirtual 320	java/lang/Integer:intValue	()I
    //   1276: istore 20
    //   1278: goto -555 -> 723
    //   1281: aload 45
    //   1283: invokevirtual 332	hya:b	()[I
    //   1286: astore 46
    //   1288: goto -531 -> 757
    //   1291: aload 46
    //   1293: iconst_0
    //   1294: iaload
    //   1295: invokestatic 171	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1298: astore 47
    //   1300: goto -529 -> 771
    //   1303: new 334	hye
    //   1306: dup
    //   1307: aload 41
    //   1309: iconst_0
    //   1310: aaload
    //   1311: invokespecial 337	hye:<init>	(Lhye;)V
    //   1314: astore 42
    //   1316: goto -497 -> 819
    //   1319: aload 42
    //   1321: getfield 340	hye:a	J
    //   1324: l2d
    //   1325: aload 42
    //   1327: getfield 342	hye:b	J
    //   1330: l2d
    //   1331: ddiv
    //   1332: d2f
    //   1333: invokestatic 347	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   1336: astore 43
    //   1338: goto -511 -> 827
    //   1341: new 334	hye
    //   1344: dup
    //   1345: aload 37
    //   1347: iconst_0
    //   1348: aaload
    //   1349: invokespecial 337	hye:<init>	(Lhye;)V
    //   1352: astore 38
    //   1354: goto -479 -> 875
    //   1357: aload 38
    //   1359: getfield 340	hye:a	J
    //   1362: l2d
    //   1363: aload 38
    //   1365: getfield 342	hye:b	J
    //   1368: l2d
    //   1369: ddiv
    //   1370: d2f
    //   1371: invokestatic 347	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   1374: astore 39
    //   1376: goto -493 -> 883
    //   1379: aload 21
    //   1381: invokevirtual 351	java/lang/Double:doubleValue	()D
    //   1384: dstore 22
    //   1386: goto -483 -> 903
    //   1389: aload 33
    //   1391: invokevirtual 351	java/lang/Double:doubleValue	()D
    //   1394: dstore 34
    //   1396: goto -472 -> 924
    //   1399: aload 25
    //   1401: invokevirtual 312	java/lang/Long:longValue	()J
    //   1404: lstore 26
    //   1406: goto -427 -> 979
    //   1409: aload 30
    //   1411: invokevirtual 312	java/lang/Long:longValue	()J
    //   1414: lstore 31
    //   1416: goto -416 -> 1000
    //   1419: astore 28
    //   1421: goto -378 -> 1043
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1424	0	this	awr
    //   7	1001	1	localContentResolver	android.content.ContentResolver
    //   15	1088	2	localawp	awp
    //   23	5	3	bool	boolean
    //   25	1082	4	localCursor	android.database.Cursor
    //   348	584	5	localhxp	hxp
    //   1116	9	6	localIOException1	java.io.IOException
    //   367	767	8	localLong1	java.lang.Long
    //   375	764	9	l1	long
    //   443	728	11	localLong2	java.lang.Long
    //   451	725	12	l2	long
    //   531	668	14	localLong3	java.lang.Long
    //   539	665	15	l3	long
    //   619	608	17	localInteger1	java.lang.Integer
    //   627	605	18	i	int
    //   713	559	19	localInteger2	java.lang.Integer
    //   721	556	20	j	int
    //   893	487	21	localDouble1	java.lang.Double
    //   901	484	22	d1	double
    //   936	20	24	arrayOfDouble	double[]
    //   969	431	25	localLong4	java.lang.Long
    //   977	428	26	l4	long
    //   1419	1	28	localIOException2	java.io.IOException
    //   1015	17	29	localPoint	android.graphics.Point
    //   990	420	30	localLong5	java.lang.Long
    //   998	417	31	l5	long
    //   914	476	33	localDouble2	java.lang.Double
    //   922	473	34	d2	double
    //   843	9	36	k	int
    //   859	487	37	arrayOfhye1	hye[]
    //   873	491	38	localhye1	hye
    //   881	494	39	localFloat1	java.lang.Float
    //   787	9	40	m	int
    //   803	505	41	arrayOfhye2	hye[]
    //   817	509	42	localhye2	hye
    //   825	512	43	localFloat2	java.lang.Float
    //   731	9	44	n	int
    //   747	535	45	localhya1	hya
    //   755	537	46	arrayOfInt	int[]
    //   769	530	47	localInteger3	java.lang.Integer
    //   637	9	48	i1	int
    //   653	19	49	localhya2	hya
    //   679	568	50	arrayOfByte	byte[]
    //   693	566	51	localByte	java.lang.Byte
    //   701	566	52	localInteger4	java.lang.Integer
    //   551	9	53	i2	int
    //   567	19	54	localhya3	hya
    //   593	622	55	arrayOfLong1	long[]
    //   607	615	56	localLong6	java.lang.Long
    //   463	9	57	i3	int
    //   479	19	58	localhya4	hya
    //   505	682	59	arrayOfLong2	long[]
    //   519	675	60	localLong7	java.lang.Long
    //   387	9	61	i4	int
    //   403	741	62	localhya5	hya
    //   411	738	63	localObject1	java.lang.Object
    //   1153	9	64	localParseException	java.text.ParseException
    //   1104	10	66	localObject2	java.lang.Object
    // Exception table:
    //   from	to	target	type
    //   53	86	1104	finally
    //   86	112	1104	finally
    //   112	138	1104	finally
    //   138	161	1104	finally
    //   161	187	1104	finally
    //   187	213	1104	finally
    //   213	241	1104	finally
    //   241	269	1104	finally
    //   269	298	1104	finally
    //   298	327	1104	finally
    //   350	363	1116	java/io/IOException
    //   421	439	1153	java/text/ParseException
    //   1007	1043	1419	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     awr
 * JD-Core Version:    0.7.0.1
 */