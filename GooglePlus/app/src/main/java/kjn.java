import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Html;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class kjn
  extends gzf
{
  private final khx a;
  private final kjm b;
  
  public kjn(khx paramkhx, kjm paramkjm)
  {
    super("CreatePostTask");
    this.a = paramkhx;
    this.b = paramkjm;
  }
  
  /* Error */
  private static ooe a(Context paramContext, android.content.ContentResolver paramContentResolver, ipf paramipf, oih paramoih, boolean paramBoolean, java.util.Set<java.lang.Long> paramSet, java.util.Set<String> paramSet1)
  {
    // Byte code:
    //   0: new 30	ooe
    //   3: dup
    //   4: invokespecial 33	ooe:<init>	()V
    //   7: astore 7
    //   9: getstatic 38	ipm:b	Lipm;
    //   12: aload_2
    //   13: getfield 43	ipf:e	Lipm;
    //   16: invokevirtual 47	ipm:equals	(Ljava/lang/Object;)Z
    //   19: ifeq +102 -> 121
    //   22: iconst_2
    //   23: istore 9
    //   25: aload 7
    //   27: iload 9
    //   29: putfield 50	ooe:b	I
    //   32: aload_2
    //   33: getfield 54	ipf:d	Landroid/net/Uri;
    //   36: astore 10
    //   38: aload_2
    //   39: invokevirtual 57	ipf:a	()Z
    //   42: ifeq +96 -> 138
    //   45: aconst_null
    //   46: astore 12
    //   48: aload_2
    //   49: invokevirtual 57	ipf:a	()Z
    //   52: ifeq +211 -> 263
    //   55: aload 5
    //   57: aload_2
    //   58: getfield 60	ipf:b	Lipn;
    //   61: getfield 65	ipn:a	J
    //   64: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   67: invokeinterface 76 2 0
    //   72: ifeq +191 -> 263
    //   75: ldc 12
    //   77: iconst_3
    //   78: invokestatic 82	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   81: ifeq +38 -> 119
    //   84: aload_2
    //   85: invokestatic 87	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   88: astore 63
    //   90: new 89	java/lang/StringBuilder
    //   93: dup
    //   94: bipush 34
    //   96: aload 63
    //   98: invokestatic 87	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   101: invokevirtual 93	java/lang/String:length	()I
    //   104: iadd
    //   105: invokespecial 96	java/lang/StringBuilder:<init>	(I)V
    //   108: ldc 98
    //   110: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: aload 63
    //   115: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aconst_null
    //   120: areturn
    //   121: getstatic 105	ipm:c	Lipm;
    //   124: aload_2
    //   125: getfield 43	ipf:e	Lipm;
    //   128: invokevirtual 47	ipm:equals	(Ljava/lang/Object;)Z
    //   131: pop
    //   132: iconst_1
    //   133: istore 9
    //   135: goto -110 -> 25
    //   138: aload 10
    //   140: ifnull +86 -> 226
    //   143: new 107	kpz
    //   146: dup
    //   147: bipush 11
    //   149: invokestatic 113	android/os/SystemClock:elapsedRealtime	()J
    //   152: invokespecial 116	kpz:<init>	(IJ)V
    //   155: astore 11
    //   157: aload_0
    //   158: invokestatic 121	hco:a	(Landroid/content/Context;)Lhco;
    //   161: aload 10
    //   163: invokevirtual 127	android/net/Uri:toString	()Ljava/lang/String;
    //   166: iconst_1
    //   167: invokevirtual 130	hco:a	(Ljava/lang/String;Z)Ljava/lang/String;
    //   170: astore 12
    //   172: aload 11
    //   174: invokevirtual 132	kpz:a	()V
    //   177: aload 11
    //   179: aload_0
    //   180: invokevirtual 135	kpz:b	(Landroid/content/Context;)V
    //   183: aload 12
    //   185: ifnonnull -137 -> 48
    //   188: aload 10
    //   190: invokestatic 87	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   193: astore 13
    //   195: new 89	java/lang/StringBuilder
    //   198: dup
    //   199: bipush 43
    //   201: aload 13
    //   203: invokestatic 87	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   206: invokevirtual 93	java/lang/String:length	()I
    //   209: iadd
    //   210: invokespecial 96	java/lang/StringBuilder:<init>	(I)V
    //   213: ldc 137
    //   215: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: aload 13
    //   220: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: aconst_null
    //   225: areturn
    //   226: aload_2
    //   227: invokestatic 87	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   230: astore 65
    //   232: new 89	java/lang/StringBuilder
    //   235: dup
    //   236: bipush 41
    //   238: aload 65
    //   240: invokestatic 87	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   243: invokevirtual 93	java/lang/String:length	()I
    //   246: iadd
    //   247: invokespecial 96	java/lang/StringBuilder:<init>	(I)V
    //   250: ldc 139
    //   252: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: aload 65
    //   257: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: pop
    //   261: aconst_null
    //   262: areturn
    //   263: aload 12
    //   265: ifnull +61 -> 326
    //   268: aload 6
    //   270: aload 12
    //   272: invokeinterface 76 2 0
    //   277: ifeq +49 -> 326
    //   280: ldc 12
    //   282: iconst_3
    //   283: invokestatic 82	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   286: ifeq +38 -> 324
    //   289: aload_2
    //   290: invokestatic 87	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   293: astore 61
    //   295: new 89	java/lang/StringBuilder
    //   298: dup
    //   299: bipush 22
    //   301: aload 61
    //   303: invokestatic 87	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   306: invokevirtual 93	java/lang/String:length	()I
    //   309: iadd
    //   310: invokespecial 96	java/lang/StringBuilder:<init>	(I)V
    //   313: ldc 141
    //   315: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: aload 61
    //   320: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: pop
    //   324: aconst_null
    //   325: areturn
    //   326: aload_2
    //   327: invokevirtual 57	ipf:a	()Z
    //   330: ifne +660 -> 990
    //   333: aload 12
    //   335: ifnull +23 -> 358
    //   338: aload 7
    //   340: aload 12
    //   342: invokestatic 146	irc:a	(Ljava/lang/String;)Ljava/lang/String;
    //   345: putfield 149	ooe:e	Ljava/lang/String;
    //   348: aload 6
    //   350: aload 12
    //   352: invokeinterface 152 2 0
    //   357: pop
    //   358: iload 4
    //   360: ifeq +810 -> 1170
    //   363: aload_1
    //   364: aload_2
    //   365: getfield 54	ipf:d	Landroid/net/Uri;
    //   368: invokestatic 157	mfq:b	(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;
    //   371: astore 59
    //   373: aload 59
    //   375: invokestatic 163	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   378: ifne +792 -> 1170
    //   381: aload 59
    //   383: invokestatic 166	mfq:a	(Ljava/lang/String;)Z
    //   386: ifne +11 -> 397
    //   389: aload 59
    //   391: invokestatic 168	mfq:c	(Ljava/lang/String;)Z
    //   394: ifeq +233 -> 627
    //   397: getstatic 174	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   400: astore 23
    //   402: aload 23
    //   404: ifnull +570 -> 974
    //   407: new 107	kpz
    //   410: dup
    //   411: bipush 12
    //   413: invokestatic 113	android/os/SystemClock:elapsedRealtime	()J
    //   416: invokespecial 116	kpz:<init>	(IJ)V
    //   419: astore 25
    //   421: aload_0
    //   422: aconst_null
    //   423: aconst_null
    //   424: aload_2
    //   425: getfield 54	ipf:d	Landroid/net/Uri;
    //   428: aload_2
    //   429: getfield 43	ipf:e	Lipm;
    //   432: aload 12
    //   434: invokestatic 177	ipf:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lipm;Ljava/lang/String;)Lipf;
    //   437: astore 55
    //   439: aload_0
    //   440: ldc 179
    //   442: invokestatic 184	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   445: checkcast 179	ipb
    //   448: aload 55
    //   450: iconst_0
    //   451: sipush 320
    //   454: sipush 320
    //   457: sipush 256
    //   460: invokevirtual 187	ipb:a	(Lipf;IIII)Ljava/lang/Object;
    //   463: checkcast 189	android/graphics/Bitmap
    //   466: astore 56
    //   468: aload 25
    //   470: invokevirtual 132	kpz:a	()V
    //   473: aload 25
    //   475: aload_0
    //   476: invokevirtual 135	kpz:b	(Landroid/content/Context;)V
    //   479: aload 56
    //   481: astore 28
    //   483: aload 28
    //   485: ifnonnull +193 -> 678
    //   488: aload_2
    //   489: getfield 54	ipf:d	Landroid/net/Uri;
    //   492: invokestatic 87	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   495: astore 53
    //   497: ldc 12
    //   499: new 89	java/lang/StringBuilder
    //   502: dup
    //   503: bipush 27
    //   505: aload 53
    //   507: invokestatic 87	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   510: invokevirtual 93	java/lang/String:length	()I
    //   513: iadd
    //   514: invokespecial 96	java/lang/StringBuilder:<init>	(I)V
    //   517: ldc 191
    //   519: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   522: aload 53
    //   524: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   527: invokevirtual 192	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   530: invokestatic 195	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   533: pop
    //   534: new 197	opl
    //   537: dup
    //   538: invokespecial 198	opl:<init>	()V
    //   541: astore 24
    //   543: aload 24
    //   545: aload_1
    //   546: aload 10
    //   548: invokestatic 203	efj:a	(Landroid/content/ContentResolver;Landroid/net/Uri;)J
    //   551: l2d
    //   552: invokestatic 208	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   555: putfield 211	opl:a	Ljava/lang/Double;
    //   558: aload 7
    //   560: aload 24
    //   562: putfield 215	ooe:g	Lopl;
    //   565: aload_3
    //   566: ifnull +58 -> 624
    //   569: new 217	oih
    //   572: dup
    //   573: invokespecial 218	oih:<init>	()V
    //   576: astore 17
    //   578: aload_3
    //   579: invokestatic 221	oih:a	(Lqat;)[B
    //   582: astore 22
    //   584: aload 17
    //   586: aload 22
    //   588: iconst_0
    //   589: aload 22
    //   591: arraylength
    //   592: invokestatic 226	qat:b	(Lqat;[BII)Lqat;
    //   595: checkcast 217	oih
    //   598: astore 20
    //   600: aload 20
    //   602: getfield 229	oih:a	Lqmg;
    //   605: ifnull +12 -> 617
    //   608: aload 20
    //   610: getfield 229	oih:a	Lqmg;
    //   613: aconst_null
    //   614: putfield 234	qmg:b	Ljava/lang/Long;
    //   617: aload 7
    //   619: aload 20
    //   621: putfield 238	ooe:f	Loih;
    //   624: aload 7
    //   626: areturn
    //   627: aload 59
    //   629: invokestatic 239	kjn:a	(Ljava/lang/String;)Z
    //   632: ifeq +11 -> 643
    //   635: getstatic 174	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   638: astore 23
    //   640: goto -238 -> 402
    //   643: aload 59
    //   645: ldc 241
    //   647: invokestatic 244	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   650: ifeq +520 -> 1170
    //   653: getstatic 247	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   656: astore 23
    //   658: goto -256 -> 402
    //   661: astore 26
    //   663: aconst_null
    //   664: astore 27
    //   666: aload 26
    //   668: invokevirtual 252	java/lang/Exception:printStackTrace	()V
    //   671: aload 27
    //   673: astore 28
    //   675: goto -192 -> 483
    //   678: aconst_null
    //   679: astore 29
    //   681: aload_1
    //   682: aload 10
    //   684: invokestatic 157	mfq:b	(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;
    //   687: invokestatic 239	kjn:a	(Ljava/lang/String;)Z
    //   690: ifeq +468 -> 1158
    //   693: aload_0
    //   694: invokevirtual 258	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   697: aload_2
    //   698: getfield 54	ipf:d	Landroid/net/Uri;
    //   701: invokevirtual 264	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   704: astore 44
    //   706: aload 44
    //   708: astore 31
    //   710: new 266	hxp
    //   713: dup
    //   714: invokespecial 267	hxp:<init>	()V
    //   717: astore 45
    //   719: aload 45
    //   721: aload 31
    //   723: invokevirtual 270	hxp:a	(Ljava/io/InputStream;)V
    //   726: aload 45
    //   728: getstatic 272	hxp:a	I
    //   731: aload 28
    //   733: invokevirtual 275	android/graphics/Bitmap:getWidth	()I
    //   736: invokestatic 280	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   739: invokevirtual 283	hxp:a	(ILjava/lang/Object;)Z
    //   742: pop
    //   743: aload 45
    //   745: getstatic 284	hxp:b	I
    //   748: aload 28
    //   750: invokevirtual 287	android/graphics/Bitmap:getHeight	()I
    //   753: invokestatic 280	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   756: invokevirtual 283	hxp:a	(ILjava/lang/Object;)Z
    //   759: pop
    //   760: aload 45
    //   762: getstatic 289	hxp:f	I
    //   765: iconst_1
    //   766: invokestatic 294	java/lang/Short:valueOf	(S)Ljava/lang/Short;
    //   769: invokevirtual 283	hxp:a	(ILjava/lang/Object;)Z
    //   772: pop
    //   773: new 296	java/io/ByteArrayOutputStream
    //   776: dup
    //   777: invokespecial 297	java/io/ByteArrayOutputStream:<init>	()V
    //   780: astore 37
    //   782: aload 45
    //   784: aload 28
    //   786: aload 37
    //   788: invokevirtual 300	hxp:a	(Landroid/graphics/Bitmap;Ljava/io/OutputStream;)V
    //   791: aload 37
    //   793: invokevirtual 304	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   796: astore 52
    //   798: aload 37
    //   800: astore 41
    //   802: aload 52
    //   804: astore 40
    //   806: aload 31
    //   808: ifnull +8 -> 816
    //   811: aload 31
    //   813: invokevirtual 309	java/io/InputStream:close	()V
    //   816: aload 41
    //   818: ifnull +8 -> 826
    //   821: aload 41
    //   823: invokevirtual 310	java/io/ByteArrayOutputStream:close	()V
    //   826: aload 40
    //   828: ifnonnull +15 -> 843
    //   831: aload 28
    //   833: aload 23
    //   835: bipush 85
    //   837: iconst_1
    //   838: invokestatic 315	mfo:a	(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;IZ)[B
    //   841: astore 40
    //   843: aload 7
    //   845: aload 40
    //   847: iconst_0
    //   848: invokestatic 321	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   851: putfield 323	ooe:c	Ljava/lang/String;
    //   854: aload 7
    //   856: iconst_1
    //   857: putfield 325	ooe:d	I
    //   860: goto -326 -> 534
    //   863: astore 42
    //   865: ldc 12
    //   867: ldc_w 327
    //   870: invokestatic 195	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   873: pop
    //   874: goto -48 -> 826
    //   877: astore 35
    //   879: aconst_null
    //   880: astore 36
    //   882: aconst_null
    //   883: astore 37
    //   885: aload 36
    //   887: ifnull +8 -> 895
    //   890: aload 36
    //   892: invokevirtual 309	java/io/InputStream:close	()V
    //   895: aload 37
    //   897: ifnull +8 -> 905
    //   900: aload 37
    //   902: invokevirtual 310	java/io/ByteArrayOutputStream:close	()V
    //   905: aconst_null
    //   906: astore 40
    //   908: goto -82 -> 826
    //   911: astore 38
    //   913: ldc 12
    //   915: ldc_w 327
    //   918: invokestatic 195	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   921: pop
    //   922: aconst_null
    //   923: astore 40
    //   925: goto -99 -> 826
    //   928: astore 30
    //   930: aconst_null
    //   931: astore 31
    //   933: aload 30
    //   935: astore 32
    //   937: aload 31
    //   939: ifnull +8 -> 947
    //   942: aload 31
    //   944: invokevirtual 309	java/io/InputStream:close	()V
    //   947: aload 29
    //   949: ifnull +8 -> 957
    //   952: aload 29
    //   954: invokevirtual 310	java/io/ByteArrayOutputStream:close	()V
    //   957: aload 32
    //   959: athrow
    //   960: astore 33
    //   962: ldc 12
    //   964: ldc_w 327
    //   967: invokestatic 195	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   970: pop
    //   971: goto -14 -> 957
    //   974: aload 12
    //   976: ifnonnull +5 -> 981
    //   979: aconst_null
    //   980: areturn
    //   981: aload 7
    //   983: iconst_2
    //   984: putfield 325	ooe:d	I
    //   987: goto -453 -> 534
    //   990: new 329	oof
    //   993: dup
    //   994: invokespecial 330	oof:<init>	()V
    //   997: astore 15
    //   999: aload 15
    //   1001: aload_2
    //   1002: getfield 60	ipf:b	Lipn;
    //   1005: getfield 332	ipn:b	Ljava/lang/String;
    //   1008: putfield 334	oof:a	Ljava/lang/String;
    //   1011: aload 15
    //   1013: aload_2
    //   1014: getfield 60	ipf:b	Lipn;
    //   1017: getfield 65	ipn:a	J
    //   1020: invokestatic 337	java/lang/Long:toString	(J)Ljava/lang/String;
    //   1023: putfield 338	oof:b	Ljava/lang/String;
    //   1026: aload 7
    //   1028: aload 15
    //   1030: putfield 341	ooe:a	Loof;
    //   1033: aload 5
    //   1035: aload_2
    //   1036: getfield 60	ipf:b	Lipn;
    //   1039: getfield 65	ipn:a	J
    //   1042: invokestatic 71	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1045: invokeinterface 152 2 0
    //   1050: pop
    //   1051: goto -486 -> 565
    //   1054: astore 18
    //   1056: aload 18
    //   1058: astore 19
    //   1060: aload_3
    //   1061: astore 20
    //   1063: ldc 12
    //   1065: ldc_w 343
    //   1068: aload 19
    //   1070: invokestatic 346	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1073: pop
    //   1074: goto -457 -> 617
    //   1077: astore 19
    //   1079: goto -16 -> 1063
    //   1082: astore 32
    //   1084: aconst_null
    //   1085: astore 29
    //   1087: goto -150 -> 937
    //   1090: astore 51
    //   1092: aload 37
    //   1094: astore 29
    //   1096: aload 51
    //   1098: astore 32
    //   1100: goto -163 -> 937
    //   1103: astore 46
    //   1105: aload 31
    //   1107: astore 36
    //   1109: aconst_null
    //   1110: astore 37
    //   1112: goto -227 -> 885
    //   1115: astore 50
    //   1117: aload 31
    //   1119: astore 36
    //   1121: goto -236 -> 885
    //   1124: astore 58
    //   1126: aload 56
    //   1128: astore 27
    //   1130: aload 58
    //   1132: astore 26
    //   1134: goto -468 -> 666
    //   1137: astore 26
    //   1139: aconst_null
    //   1140: astore 27
    //   1142: goto -476 -> 666
    //   1145: astore 57
    //   1147: aload 56
    //   1149: astore 27
    //   1151: aload 57
    //   1153: astore 26
    //   1155: goto -489 -> 666
    //   1158: aconst_null
    //   1159: astore 40
    //   1161: aconst_null
    //   1162: astore 41
    //   1164: aconst_null
    //   1165: astore 31
    //   1167: goto -361 -> 806
    //   1170: aconst_null
    //   1171: astore 23
    //   1173: goto -771 -> 402
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1176	0	paramContext	Context
    //   0	1176	1	paramContentResolver	android.content.ContentResolver
    //   0	1176	2	paramipf	ipf
    //   0	1176	3	paramoih	oih
    //   0	1176	4	paramBoolean	boolean
    //   0	1176	5	paramSet	java.util.Set<java.lang.Long>
    //   0	1176	6	paramSet1	java.util.Set<String>
    //   7	1020	7	localooe	ooe
    //   23	111	9	i	int
    //   36	647	10	localUri	android.net.Uri
    //   155	23	11	localkpz1	kpz
    //   46	929	12	str1	String
    //   193	26	13	str2	String
    //   997	32	15	localoof	oof
    //   576	9	17	localoih1	oih
    //   1054	3	18	localqas1	qas
    //   1058	11	19	localqas2	qas
    //   1077	1	19	localqas3	qas
    //   598	464	20	localoih2	oih
    //   582	8	22	arrayOfByte1	byte[]
    //   400	772	23	localCompressFormat	android.graphics.Bitmap.CompressFormat
    //   541	20	24	localopl	opl
    //   419	55	25	localkpz2	kpz
    //   661	6	26	localkbc1	kbc
    //   1132	1	26	localObject1	Object
    //   1137	1	26	localkbm1	kbm
    //   1153	1	26	localObject2	Object
    //   664	486	27	localBitmap1	android.graphics.Bitmap
    //   481	351	28	localObject3	Object
    //   679	416	29	localObject4	Object
    //   928	6	30	localObject5	Object
    //   708	458	31	localInputStream1	java.io.InputStream
    //   935	23	32	localObject6	Object
    //   1082	1	32	localObject7	Object
    //   1098	1	32	localObject8	Object
    //   960	1	33	localIOException1	java.io.IOException
    //   877	1	35	localIOException2	java.io.IOException
    //   880	240	36	localInputStream2	java.io.InputStream
    //   780	331	37	localByteArrayOutputStream1	java.io.ByteArrayOutputStream
    //   911	1	38	localIOException3	java.io.IOException
    //   804	356	40	arrayOfByte2	byte[]
    //   800	363	41	localByteArrayOutputStream2	java.io.ByteArrayOutputStream
    //   863	1	42	localIOException4	java.io.IOException
    //   704	3	44	localInputStream3	java.io.InputStream
    //   717	66	45	localhxp	hxp
    //   1103	1	46	localIOException5	java.io.IOException
    //   1115	1	50	localIOException6	java.io.IOException
    //   1090	7	51	localObject9	Object
    //   796	7	52	arrayOfByte3	byte[]
    //   495	28	53	str3	String
    //   437	12	55	localipf	ipf
    //   466	682	56	localBitmap2	android.graphics.Bitmap
    //   1145	7	57	localkbm2	kbm
    //   1124	7	58	localkbc2	kbc
    //   371	273	59	str4	String
    //   293	26	61	str5	String
    //   88	26	63	str6	String
    //   230	26	65	str7	String
    // Exception table:
    //   from	to	target	type
    //   407	468	661	kbc
    //   811	816	863	java/io/IOException
    //   821	826	863	java/io/IOException
    //   681	706	877	java/io/IOException
    //   890	895	911	java/io/IOException
    //   900	905	911	java/io/IOException
    //   681	706	928	finally
    //   942	947	960	java/io/IOException
    //   952	957	960	java/io/IOException
    //   569	600	1054	qas
    //   600	617	1077	qas
    //   710	782	1082	finally
    //   782	798	1090	finally
    //   710	782	1103	java/io/IOException
    //   782	798	1115	java/io/IOException
    //   468	479	1124	kbc
    //   407	468	1137	kbm
    //   468	479	1145	kbm
  }
  
  /* Error */
  private static oog a(Context paramContext, List<ipf> paramList1, List<oih> paramList, List<ipf> paramList2, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 351 1 0
    //   6: ifeq +5 -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new 353	java/util/ArrayList
    //   14: dup
    //   15: invokespecial 354	java/util/ArrayList:<init>	()V
    //   18: astore 5
    //   20: new 356	fpi
    //   23: dup
    //   24: aload_1
    //   25: invokeinterface 359 1 0
    //   30: invokespecial 360	fpi:<init>	(I)V
    //   33: astore 6
    //   35: new 356	fpi
    //   38: dup
    //   39: aload_1
    //   40: invokeinterface 359 1 0
    //   45: invokespecial 360	fpi:<init>	(I)V
    //   48: astore 7
    //   50: aload_0
    //   51: invokevirtual 258	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   54: astore 8
    //   56: iconst_0
    //   57: istore 9
    //   59: iconst_0
    //   60: istore 10
    //   62: iload 9
    //   64: aload_1
    //   65: invokeinterface 359 1 0
    //   70: if_icmpge +608 -> 678
    //   73: aload_1
    //   74: iload 9
    //   76: invokeinterface 364 2 0
    //   81: checkcast 40	ipf
    //   84: astore 12
    //   86: aload_2
    //   87: iload 9
    //   89: invokeinterface 364 2 0
    //   94: checkcast 217	oih
    //   97: astore 13
    //   99: iload 10
    //   101: iconst_4
    //   102: if_icmpge +428 -> 530
    //   105: aload_3
    //   106: invokeinterface 359 1 0
    //   111: iconst_4
    //   112: if_icmpge +418 -> 530
    //   115: iconst_1
    //   116: istore 14
    //   118: aload 12
    //   120: getfield 54	ipf:d	Landroid/net/Uri;
    //   123: astore 15
    //   125: aload 15
    //   127: ifnull +544 -> 671
    //   130: aload 15
    //   132: invokevirtual 367	android/net/Uri:getScheme	()Ljava/lang/String;
    //   135: ldc_w 369
    //   138: invokevirtual 370	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   141: ifeq +530 -> 671
    //   144: getstatic 375	android/os/Build$VERSION:SDK_INT	I
    //   147: bipush 15
    //   149: if_icmple +522 -> 671
    //   152: aload 15
    //   154: invokevirtual 378	android/net/Uri:getAuthority	()Ljava/lang/String;
    //   157: ldc_w 380
    //   160: invokestatic 244	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   163: ifeq +665 -> 828
    //   166: aload_0
    //   167: invokevirtual 258	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   170: aload 15
    //   172: aconst_null
    //   173: aconst_null
    //   174: aconst_null
    //   175: aconst_null
    //   176: invokevirtual 384	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   179: astore 38
    //   181: aload 38
    //   183: astore 35
    //   185: aload 35
    //   187: ifnull +627 -> 814
    //   190: aload 35
    //   192: invokeinterface 389 1 0
    //   197: pop
    //   198: aload 35
    //   200: ldc_w 391
    //   203: invokeinterface 395 2 0
    //   208: istore 41
    //   210: aload 35
    //   212: ldc_w 397
    //   215: invokeinterface 395 2 0
    //   220: istore 42
    //   222: iload 41
    //   224: iflt +590 -> 814
    //   227: iload 42
    //   229: iflt +585 -> 814
    //   232: aload 35
    //   234: iload 41
    //   236: invokeinterface 401 2 0
    //   241: lstore 43
    //   243: lload 43
    //   245: lstore 21
    //   247: aload 35
    //   249: iload 42
    //   251: invokeinterface 405 2 0
    //   256: astore 45
    //   258: aload 45
    //   260: ifnull +545 -> 805
    //   263: new 407	java/io/File
    //   266: dup
    //   267: aload 45
    //   269: invokespecial 408	java/io/File:<init>	(Ljava/lang/String;)V
    //   272: astore 46
    //   274: aload 46
    //   276: invokevirtual 411	java/io/File:canRead	()Z
    //   279: istore 47
    //   281: iload 47
    //   283: istore 23
    //   285: iload 23
    //   287: ifeq +512 -> 799
    //   290: aload_0
    //   291: aload 46
    //   293: invokestatic 415	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
    //   296: aload 12
    //   298: getfield 43	ipf:e	Lipm;
    //   301: invokestatic 418	ipf:a	(Landroid/content/Context;Landroid/net/Uri;Lipm;)Lipf;
    //   304: astore 48
    //   306: aload 48
    //   308: astore 39
    //   310: aload 35
    //   312: ifnull +480 -> 792
    //   315: aload 35
    //   317: invokeinterface 419 1 0
    //   322: aload 39
    //   324: astore 16
    //   326: iload 23
    //   328: ifne +131 -> 459
    //   331: aload_0
    //   332: invokevirtual 423	android/content/Context:getCacheDir	()Ljava/io/File;
    //   335: astore 26
    //   337: aconst_null
    //   338: astore 27
    //   340: aload 26
    //   342: ifnull +438 -> 780
    //   345: aload 26
    //   347: invokevirtual 426	java/io/File:getFreeSpace	()J
    //   350: lload 21
    //   352: lcmp
    //   353: istore 28
    //   355: aconst_null
    //   356: astore 27
    //   358: iload 28
    //   360: ifle +420 -> 780
    //   363: aload_0
    //   364: invokevirtual 258	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   367: aload 15
    //   369: invokestatic 157	mfq:b	(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;
    //   372: astore 29
    //   374: aload 29
    //   376: invokestatic 239	kjn:a	(Ljava/lang/String;)Z
    //   379: ifne +463 -> 842
    //   382: aload 29
    //   384: ldc_w 428
    //   387: invokestatic 244	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   390: ifeq +208 -> 598
    //   393: goto +449 -> 842
    //   396: ldc_w 430
    //   399: aload 30
    //   401: aload 26
    //   403: invokestatic 434	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   406: astore 27
    //   408: aload 27
    //   410: ifnull +370 -> 780
    //   413: aload_0
    //   414: aload 15
    //   416: aload 27
    //   418: invokestatic 437	efj:a	(Landroid/content/Context;Landroid/net/Uri;Ljava/io/File;)Z
    //   421: istore 31
    //   423: iload 31
    //   425: ifne +223 -> 648
    //   428: ldc 12
    //   430: ldc_w 439
    //   433: invokestatic 195	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   436: pop
    //   437: new 28	java/io/IOException
    //   440: dup
    //   441: ldc_w 441
    //   444: invokespecial 442	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   447: athrow
    //   448: astore 24
    //   450: ldc 12
    //   452: ldc_w 444
    //   455: invokestatic 195	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   458: pop
    //   459: aload 16
    //   461: ifnull +312 -> 773
    //   464: aload_0
    //   465: aload 8
    //   467: aload 16
    //   469: aload 13
    //   471: iload 14
    //   473: aload 6
    //   475: aload 7
    //   477: invokestatic 446	kjn:a	(Landroid/content/Context;Landroid/content/ContentResolver;Lipf;Loih;ZLjava/util/Set;Ljava/util/Set;)Looe;
    //   480: astore 18
    //   482: aload 18
    //   484: ifnull +289 -> 773
    //   487: aload 5
    //   489: aload 18
    //   491: invokeinterface 447 2 0
    //   496: pop
    //   497: aload_3
    //   498: aload 16
    //   500: invokeinterface 447 2 0
    //   505: pop
    //   506: aload 18
    //   508: getfield 323	ooe:c	Ljava/lang/String;
    //   511: ifnull +262 -> 773
    //   514: iload 10
    //   516: iconst_1
    //   517: iadd
    //   518: istore 17
    //   520: iinc 9 1
    //   523: iload 17
    //   525: istore 10
    //   527: goto -465 -> 62
    //   530: iconst_0
    //   531: istore 14
    //   533: goto -415 -> 118
    //   536: astore 36
    //   538: aconst_null
    //   539: astore 35
    //   541: ldc2_w 448
    //   544: lstore 21
    //   546: iconst_0
    //   547: istore 23
    //   549: ldc 12
    //   551: ldc_w 451
    //   554: aload 36
    //   556: invokestatic 346	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   559: pop
    //   560: aload 35
    //   562: ifnull +224 -> 786
    //   565: aload 35
    //   567: invokeinterface 419 1 0
    //   572: aconst_null
    //   573: astore 16
    //   575: goto -249 -> 326
    //   578: astore 34
    //   580: aconst_null
    //   581: astore 35
    //   583: aload 35
    //   585: ifnull +10 -> 595
    //   588: aload 35
    //   590: invokeinterface 419 1 0
    //   595: aload 34
    //   597: athrow
    //   598: aload 29
    //   600: ldc 241
    //   602: invokestatic 244	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   605: ifeq +11 -> 616
    //   608: ldc_w 453
    //   611: astore 30
    //   613: goto -217 -> 396
    //   616: aload 29
    //   618: invokestatic 168	mfq:c	(Ljava/lang/String;)Z
    //   621: ifeq +11 -> 632
    //   624: ldc_w 455
    //   627: astore 30
    //   629: goto -233 -> 396
    //   632: aload 29
    //   634: invokestatic 166	mfq:a	(Ljava/lang/String;)Z
    //   637: ifeq +213 -> 850
    //   640: ldc_w 457
    //   643: astore 30
    //   645: goto -249 -> 396
    //   648: aload_0
    //   649: aload 27
    //   651: invokestatic 415	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
    //   654: aload 12
    //   656: getfield 43	ipf:e	Lipm;
    //   659: invokestatic 418	ipf:a	(Landroid/content/Context;Landroid/net/Uri;Lipm;)Lipf;
    //   662: astore 33
    //   664: aload 33
    //   666: astore 16
    //   668: goto -209 -> 459
    //   671: aload 12
    //   673: astore 16
    //   675: goto -216 -> 459
    //   678: aload 5
    //   680: invokeinterface 351 1 0
    //   685: ifeq +5 -> 690
    //   688: aconst_null
    //   689: areturn
    //   690: new 459	oog
    //   693: dup
    //   694: invokespecial 460	oog:<init>	()V
    //   697: astore 11
    //   699: aload 11
    //   701: aload 5
    //   703: aload 5
    //   705: invokeinterface 359 1 0
    //   710: anewarray 30	ooe
    //   713: invokeinterface 464 2 0
    //   718: checkcast 466	[Looe;
    //   721: putfield 468	oog:b	[Looe;
    //   724: aload 4
    //   726: invokestatic 163	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   729: ifne +10 -> 739
    //   732: aload 11
    //   734: aload 4
    //   736: putfield 470	oog:d	Ljava/lang/String;
    //   739: aload 11
    //   741: areturn
    //   742: astore 34
    //   744: goto -161 -> 583
    //   747: astore 36
    //   749: ldc2_w 448
    //   752: lstore 21
    //   754: iconst_0
    //   755: istore 23
    //   757: goto -208 -> 549
    //   760: astore 36
    //   762: iconst_0
    //   763: istore 23
    //   765: goto -216 -> 549
    //   768: astore 36
    //   770: goto -221 -> 549
    //   773: iload 10
    //   775: istore 17
    //   777: goto -257 -> 520
    //   780: iconst_0
    //   781: istore 31
    //   783: goto -360 -> 423
    //   786: aconst_null
    //   787: astore 16
    //   789: goto -463 -> 326
    //   792: aload 39
    //   794: astore 16
    //   796: goto -470 -> 326
    //   799: aconst_null
    //   800: astore 39
    //   802: goto -492 -> 310
    //   805: aconst_null
    //   806: astore 39
    //   808: iconst_0
    //   809: istore 23
    //   811: goto -501 -> 310
    //   814: ldc2_w 448
    //   817: lstore 21
    //   819: aconst_null
    //   820: astore 39
    //   822: iconst_0
    //   823: istore 23
    //   825: goto -515 -> 310
    //   828: ldc2_w 448
    //   831: lstore 21
    //   833: aconst_null
    //   834: astore 16
    //   836: iconst_0
    //   837: istore 23
    //   839: goto -513 -> 326
    //   842: ldc_w 472
    //   845: astore 30
    //   847: goto -451 -> 396
    //   850: aconst_null
    //   851: astore 27
    //   853: goto -445 -> 408
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	856	0	paramContext	Context
    //   0	856	1	paramList1	List<ipf>
    //   0	856	2	paramList	List<oih>
    //   0	856	3	paramList2	List<ipf>
    //   0	856	4	paramString	String
    //   18	686	5	localArrayList	ArrayList
    //   33	441	6	localfpi1	fpi
    //   48	428	7	localfpi2	fpi
    //   54	412	8	localContentResolver	android.content.ContentResolver
    //   57	464	9	i	int
    //   60	714	10	j	int
    //   697	43	11	localoog	oog
    //   84	588	12	localipf1	ipf
    //   97	373	13	localoih	oih
    //   116	416	14	bool1	boolean
    //   123	292	15	localUri	android.net.Uri
    //   324	511	16	localObject1	Object
    //   518	258	17	k	int
    //   480	27	18	localooe	ooe
    //   245	587	21	l1	long
    //   283	555	23	bool2	boolean
    //   448	1	24	localIOException	java.io.IOException
    //   335	67	26	localFile1	java.io.File
    //   338	514	27	localFile2	java.io.File
    //   353	6	28	bool3	boolean
    //   372	261	29	str1	String
    //   399	447	30	str2	String
    //   421	361	31	bool4	boolean
    //   662	3	33	localipf2	ipf
    //   578	18	34	localObject2	Object
    //   742	1	34	localObject3	Object
    //   183	406	35	localCursor1	android.database.Cursor
    //   536	19	36	localException1	java.lang.Exception
    //   747	1	36	localException2	java.lang.Exception
    //   760	1	36	localException3	java.lang.Exception
    //   768	1	36	localException4	java.lang.Exception
    //   179	3	38	localCursor2	android.database.Cursor
    //   308	513	39	localipf3	ipf
    //   208	27	41	m	int
    //   220	30	42	n	int
    //   241	3	43	l2	long
    //   256	12	45	str3	String
    //   272	20	46	localFile3	java.io.File
    //   279	3	47	bool5	boolean
    //   304	3	48	localipf4	ipf
    // Exception table:
    //   from	to	target	type
    //   331	337	448	java/io/IOException
    //   345	355	448	java/io/IOException
    //   363	393	448	java/io/IOException
    //   396	408	448	java/io/IOException
    //   413	423	448	java/io/IOException
    //   428	448	448	java/io/IOException
    //   598	608	448	java/io/IOException
    //   616	624	448	java/io/IOException
    //   632	640	448	java/io/IOException
    //   648	664	448	java/io/IOException
    //   166	181	536	java/lang/Exception
    //   166	181	578	finally
    //   190	222	742	finally
    //   232	243	742	finally
    //   247	258	742	finally
    //   263	281	742	finally
    //   290	306	742	finally
    //   549	560	742	finally
    //   190	222	747	java/lang/Exception
    //   232	243	747	java/lang/Exception
    //   247	258	760	java/lang/Exception
    //   263	281	760	java/lang/Exception
    //   290	306	768	java/lang/Exception
  }
  
  private static boolean a(String paramString)
  {
    return (TextUtils.equals(paramString, "image/jpg")) || (TextUtils.equals(paramString, "image/jpeg"));
  }
  
  protected final hae a(Context paramContext)
  {
    int i = 0;
    gdy localgdy = gdp.a("CreatePostInBackground");
    kpz localkpz = new kpz(17, SystemClock.elapsedRealtime());
    oqq localoqq = new oqq();
    localoqq.b = new qoh();
    localoqq.b.a = new qoi();
    localoqq.b.a.a = Boolean.valueOf(true);
    localoqq.b.b = new qoj();
    localoqq.b.b.a = Boolean.valueOf(true);
    String str6;
    Object localObject;
    if ((this.a.c != null) && (this.a.c.f != null))
    {
      str6 = this.a.c.f.c;
      if (!TextUtils.isEmpty(str6))
      {
        localObject = "Mobile";
        if ("com.google.android.apps.social".equals(str6)) {}
      }
    }
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      String str7 = Html.fromHtml(localPackageManager.getApplicationLabel(localPackageManager.getApplicationInfo(str6, 0)).toString()).toString();
      localObject = str7;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      label202:
      oqr localoqr;
      kii localkii;
      lhp[] arrayOflhp;
      oqv[] arrayOfoqv;
      int m;
      gnb localgnb;
      ArrayList localArrayList5;
      jgs[] arrayOfjgs;
      int j;
      int k;
      jgs localjgs;
      String str4;
      String str5;
      ArrayList localArrayList1;
      ArrayList localArrayList2;
      ArrayList localArrayList3;
      ArrayList localArrayList4;
      Iterator localIterator;
      ipa localipa;
      ipf localipf;
      oih localoih;
      List localList2;
      kjo localkjo;
      hae localhae;
      break label202;
    }
    localoqr = new oqr();
    localoqr.a = ((String)localObject);
    localoqq.p = localoqr;
    localoqq.j = efj.a(this.a.f, this.a.g);
    localoqq.k = Boolean.valueOf(this.a.n);
    localoqq.c = this.a.h;
    localoqq.a = this.a.j;
    localkii = this.a.w;
    if ((localkii != null) && (!localkii.a(paramContext, this.a, localoqq))) {
      return new hae(false);
    }
    if (this.a.f.d.length > 0)
    {
      arrayOflhp = this.a.f.d;
      arrayOfoqv = new oqv[arrayOflhp.length];
      for (m = 0; m < arrayOflhp.length; m++)
      {
        oqv localoqv = new oqv();
        localoqv.a = arrayOflhp[m].a;
        localoqv.b = arrayOflhp[m].c;
        arrayOfoqv[m] = localoqv;
      }
      localoqq.m = arrayOfoqv;
    }
    if (this.a.m != null) {
      localoqq.i = this.a.m.a();
    }
    if ((this.a.d != null) && (this.a.e != null))
    {
      localoqq.h = this.a.d;
      localoqq.q = this.a.e;
    }
    localoqq.e = Boolean.valueOf(this.a.t);
    localoqq.f = Boolean.valueOf(this.a.u);
    if (this.a.v)
    {
      localgnb = this.a.f;
      if (localoqq.l.length > 0) {
        throw new IllegalArgumentException("EmailDeliveryIndicators.length > 0");
      }
      localArrayList5 = new ArrayList();
      arrayOfjgs = localgnb.c;
      j = arrayOfjgs.length;
      k = 0;
      if (k < j)
      {
        localjgs = arrayOfjgs[k];
        str4 = localjgs.a;
        if (str4.startsWith("f.")) {}
        for (str5 = str4.substring(2);; str5 = null)
        {
          if ((localjgs.c == 1) && (str5 != null))
          {
            oni localoni = new oni();
            localoni.a = str5;
            localArrayList5.add(localoni);
          }
          k++;
          break;
        }
      }
      if (!localArrayList5.isEmpty())
      {
        localoqq.l = new oni[localArrayList5.size()];
        localArrayList5.toArray(localoqq.l);
      }
    }
    if (this.a.o != null)
    {
      localoqq.s = new oqs();
      if (this.a.o.d)
      {
        localoqq.s.a = new olb();
        localoqq.s.a.a = this.a.o.a;
        localoqq.f = Boolean.valueOf(true);
      }
    }
    else
    {
      localArrayList1 = this.a.l;
      localArrayList2 = new ArrayList();
      if ((localArrayList1 == null) || (localArrayList1.isEmpty())) {
        break label1150;
      }
      localArrayList3 = new ArrayList();
      localArrayList4 = new ArrayList();
      localIterator = localArrayList1.iterator();
      label850:
      if (!localIterator.hasNext()) {
        break label969;
      }
      localipa = (ipa)localIterator.next();
      localipf = localipa.e();
      if (!(localipa instanceof jpx)) {
        break label963;
      }
    }
    label963:
    for (localoih = ((jpx)localipa).h();; localoih = null)
    {
      localArrayList3.add(localipf);
      localArrayList4.add(localoih);
      break label850;
      localoqq.s.b = new ola();
      localoqq.s.b.a = this.a.o.a;
      break;
    }
    label969:
    localList2 = jrf.b(paramContext, this.a.a, localArrayList3);
    for (;;)
    {
      try
      {
        oog localoog2 = a(paramContext, localList2, localArrayList4, localArrayList2, this.a.q);
        localoog1 = localoog2;
        if (localoog1 != null) {
          localoqq.g = localoog1;
        }
        List localList1 = mbb.c(paramContext, khw.class);
        if (i >= localList1.size()) {
          break;
        }
        ((khw)localList1.get(i)).a(paramContext, this.a, localoqq);
        i++;
        continue;
        if (this.a.r != null) {
          break label1177;
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        if ((this.a.b != null) && (this.a.a != -1))
        {
          this.a.b.c = gxz.cV;
          ((gxx)mbb.a(paramContext, gxx.class)).a(this.a.b);
        }
        return new hae(0, localIllegalStateException, paramContext.getString(et.r));
      }
      label1150:
      String str3 = this.a.s;
      oog localoog1 = null;
      if (str3 != null)
      {
        label1177:
        String str1 = this.a.r;
        String str2 = this.a.s;
        ooh localooh = new ooh();
        localooh.b = str1;
        localooh.a = str2;
        localoog1 = new oog();
        localoog1.a = localooh;
        localoog1.c = Boolean.valueOf(true);
      }
    }
    if ((localArrayList1 != null) && (localArrayList2.size() != localArrayList1.size()))
    {
      localkjo = new kjo(this, paramContext);
      efj.m().post(localkjo);
    }
    localhae = this.b.a(paramContext, localoqq, localArrayList2, this.a);
    localkpz.a();
    localkpz.b(paramContext);
    gdp.a(localgdy);
    return localhae;
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(et.s);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kjn
 * JD-Core Version:    0.7.0.1
 */