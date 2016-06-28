import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class lsl
  extends Thread
{
  public boolean a;
  public boolean b;
  public boolean c;
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  public boolean h = true;
  public boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private int n = 0;
  private int o = 0;
  private int p = 1;
  private ArrayList<Runnable> q = new ArrayList();
  private boolean r = true;
  private lsk s;
  private WeakReference<lsg> t;
  
  public lsl(WeakReference<lsg> paramWeakReference)
  {
    this.t = paramWeakReference;
  }
  
  private final void f()
  {
    if (this.m)
    {
      this.m = false;
      this.s.a();
    }
  }
  
  private final void g()
  {
    if (this.l)
    {
      this.s.b();
      this.l = false;
      lsg.a.b(this);
    }
  }
  
  /* Error */
  private final void h()
  {
    // Byte code:
    //   0: aload_0
    //   1: new 59	lsk
    //   4: dup
    //   5: aload_0
    //   6: getfield 53	lsl:t	Ljava/lang/ref/WeakReference;
    //   9: invokespecial 79	lsk:<init>	(Ljava/lang/ref/WeakReference;)V
    //   12: putfield 57	lsl:s	Llsk;
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield 63	lsl:l	Z
    //   20: aload_0
    //   21: iconst_0
    //   22: putfield 55	lsl:m	Z
    //   25: iconst_0
    //   26: istore_1
    //   27: iconst_0
    //   28: istore_2
    //   29: iconst_0
    //   30: istore_3
    //   31: iconst_0
    //   32: istore 4
    //   34: iconst_0
    //   35: istore 5
    //   37: iconst_0
    //   38: istore 6
    //   40: aconst_null
    //   41: astore 7
    //   43: iconst_0
    //   44: istore 8
    //   46: iconst_0
    //   47: istore 9
    //   49: iconst_0
    //   50: istore 10
    //   52: iconst_0
    //   53: istore 11
    //   55: getstatic 70	lsg:a	Llsm;
    //   58: astore 15
    //   60: aload 15
    //   62: monitorenter
    //   63: aload_0
    //   64: getfield 81	lsl:j	Z
    //   67: ifeq +34 -> 101
    //   70: aload 15
    //   72: monitorexit
    //   73: getstatic 70	lsg:a	Llsm;
    //   76: astore 80
    //   78: aload 80
    //   80: monitorenter
    //   81: aload_0
    //   82: invokespecial 83	lsl:f	()V
    //   85: aload_0
    //   86: invokespecial 85	lsl:g	()V
    //   89: aload 80
    //   91: monitorexit
    //   92: return
    //   93: astore 81
    //   95: aload 80
    //   97: monitorexit
    //   98: aload 81
    //   100: athrow
    //   101: aload_0
    //   102: getfield 41	lsl:q	Ljava/util/ArrayList;
    //   105: invokevirtual 89	java/util/ArrayList:isEmpty	()Z
    //   108: ifne +123 -> 231
    //   111: aload_0
    //   112: getfield 41	lsl:q	Ljava/util/ArrayList;
    //   115: iconst_0
    //   116: invokevirtual 93	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   119: checkcast 95	java/lang/Runnable
    //   122: astore 78
    //   124: iload_2
    //   125: istore 35
    //   127: iload 5
    //   129: istore 38
    //   131: aload 78
    //   133: astore 44
    //   135: iload 4
    //   137: istore 79
    //   139: iload_3
    //   140: istore 36
    //   142: iload 6
    //   144: istore 34
    //   146: iload_1
    //   147: istore 42
    //   149: iload 9
    //   151: istore 37
    //   153: iload 8
    //   155: istore 39
    //   157: iload 11
    //   159: istore 40
    //   161: iload 10
    //   163: istore 41
    //   165: iload 79
    //   167: istore 43
    //   169: aload 15
    //   171: monitorexit
    //   172: aload 44
    //   174: ifnull +862 -> 1036
    //   177: aload 44
    //   179: invokeinterface 98 1 0
    //   184: iload 38
    //   186: istore 5
    //   188: iload 35
    //   190: istore_2
    //   191: iload 43
    //   193: istore 70
    //   195: iload 41
    //   197: istore 10
    //   199: iload 40
    //   201: istore 11
    //   203: iload 39
    //   205: istore 8
    //   207: iload 37
    //   209: istore 9
    //   211: iload 42
    //   213: istore_1
    //   214: iload 34
    //   216: istore 6
    //   218: iload 36
    //   220: istore_3
    //   221: iload 70
    //   223: istore 4
    //   225: aconst_null
    //   226: astore 7
    //   228: goto -173 -> 55
    //   231: aload_0
    //   232: getfield 100	lsl:c	Z
    //   235: aload_0
    //   236: getfield 102	lsl:b	Z
    //   239: if_icmpeq +1555 -> 1794
    //   242: aload_0
    //   243: getfield 102	lsl:b	Z
    //   246: istore 77
    //   248: aload_0
    //   249: aload_0
    //   250: getfield 102	lsl:b	Z
    //   253: putfield 100	lsl:c	Z
    //   256: getstatic 70	lsg:a	Llsm;
    //   259: invokevirtual 107	java/lang/Object:notifyAll	()V
    //   262: iload 77
    //   264: istore 17
    //   266: aload_0
    //   267: getfield 109	lsl:g	Z
    //   270: ifeq +19 -> 289
    //   273: aload_0
    //   274: invokespecial 83	lsl:f	()V
    //   277: aload_0
    //   278: invokespecial 85	lsl:g	()V
    //   281: aload_0
    //   282: iconst_0
    //   283: putfield 109	lsl:g	Z
    //   286: iconst_1
    //   287: istore 4
    //   289: iload 10
    //   291: ifeq +14 -> 305
    //   294: aload_0
    //   295: invokespecial 83	lsl:f	()V
    //   298: aload_0
    //   299: invokespecial 85	lsl:g	()V
    //   302: iconst_0
    //   303: istore 10
    //   305: iload 17
    //   307: ifeq +14 -> 321
    //   310: aload_0
    //   311: getfield 55	lsl:m	Z
    //   314: ifeq +7 -> 321
    //   317: aload_0
    //   318: invokespecial 83	lsl:f	()V
    //   321: iload 17
    //   323: ifeq +40 -> 363
    //   326: aload_0
    //   327: getfield 63	lsl:l	Z
    //   330: ifeq +33 -> 363
    //   333: aload_0
    //   334: getfield 53	lsl:t	Ljava/lang/ref/WeakReference;
    //   337: invokevirtual 115	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   340: checkcast 67	lsg
    //   343: ifnonnull +1457 -> 1800
    //   346: iconst_0
    //   347: ifeq +12 -> 359
    //   350: getstatic 70	lsg:a	Llsm;
    //   353: invokevirtual 117	lsm:a	()Z
    //   356: ifeq +7 -> 363
    //   359: aload_0
    //   360: invokespecial 85	lsl:g	()V
    //   363: iload 17
    //   365: ifeq +19 -> 384
    //   368: getstatic 70	lsg:a	Llsm;
    //   371: invokevirtual 119	lsm:b	()Z
    //   374: ifeq +10 -> 384
    //   377: aload_0
    //   378: getfield 57	lsl:s	Llsk;
    //   381: invokevirtual 65	lsk:b	()V
    //   384: aload_0
    //   385: getfield 121	lsl:d	Z
    //   388: ifne +37 -> 425
    //   391: aload_0
    //   392: getfield 123	lsl:e	Z
    //   395: ifne +30 -> 425
    //   398: aload_0
    //   399: getfield 55	lsl:m	Z
    //   402: ifeq +7 -> 409
    //   405: aload_0
    //   406: invokespecial 83	lsl:f	()V
    //   409: aload_0
    //   410: iconst_1
    //   411: putfield 123	lsl:e	Z
    //   414: aload_0
    //   415: iconst_0
    //   416: putfield 125	lsl:k	Z
    //   419: getstatic 70	lsg:a	Llsm;
    //   422: invokevirtual 107	java/lang/Object:notifyAll	()V
    //   425: aload_0
    //   426: getfield 121	lsl:d	Z
    //   429: ifeq +21 -> 450
    //   432: aload_0
    //   433: getfield 123	lsl:e	Z
    //   436: ifeq +14 -> 450
    //   439: aload_0
    //   440: iconst_0
    //   441: putfield 123	lsl:e	Z
    //   444: getstatic 70	lsg:a	Llsm;
    //   447: invokevirtual 107	java/lang/Object:notifyAll	()V
    //   450: iload_3
    //   451: ifeq +1330 -> 1781
    //   454: iconst_0
    //   455: istore 19
    //   457: aload_0
    //   458: iconst_1
    //   459: putfield 127	lsl:i	Z
    //   462: getstatic 70	lsg:a	Llsm;
    //   465: invokevirtual 107	java/lang/Object:notifyAll	()V
    //   468: iconst_0
    //   469: istore 20
    //   471: aload_0
    //   472: invokespecial 129	lsl:i	()Z
    //   475: ifeq +1284 -> 1759
    //   478: aload_0
    //   479: getfield 63	lsl:l	Z
    //   482: ifne +1321 -> 1803
    //   485: iload 4
    //   487: ifeq +132 -> 619
    //   490: iconst_0
    //   491: istore 21
    //   493: aload_0
    //   494: getfield 63	lsl:l	Z
    //   497: ifeq +1248 -> 1745
    //   500: aload_0
    //   501: getfield 55	lsl:m	Z
    //   504: ifne +1241 -> 1745
    //   507: aload_0
    //   508: iconst_1
    //   509: putfield 55	lsl:m	Z
    //   512: iconst_1
    //   513: istore 22
    //   515: iconst_1
    //   516: istore 23
    //   518: iconst_1
    //   519: istore 24
    //   521: aload_0
    //   522: getfield 55	lsl:m	Z
    //   525: ifeq +1285 -> 1810
    //   528: aload_0
    //   529: getfield 43	lsl:r	Z
    //   532: ifeq +1182 -> 1714
    //   535: iconst_1
    //   536: istore 29
    //   538: aload_0
    //   539: getfield 45	lsl:n	I
    //   542: istore 30
    //   544: aload_0
    //   545: getfield 47	lsl:o	I
    //   548: istore 31
    //   550: iconst_1
    //   551: istore 32
    //   553: iconst_1
    //   554: istore 33
    //   556: aload_0
    //   557: iconst_0
    //   558: putfield 43	lsl:r	Z
    //   561: aload_0
    //   562: iconst_0
    //   563: putfield 49	lsl:h	Z
    //   566: getstatic 70	lsg:a	Llsm;
    //   569: invokevirtual 107	java/lang/Object:notifyAll	()V
    //   572: iload 31
    //   574: istore 34
    //   576: iload 32
    //   578: istore 35
    //   580: iload 20
    //   582: istore 36
    //   584: iload 9
    //   586: istore 37
    //   588: iload 30
    //   590: istore 38
    //   592: iload 23
    //   594: istore 39
    //   596: iload 29
    //   598: istore 40
    //   600: iload 10
    //   602: istore 41
    //   604: iload 33
    //   606: istore 42
    //   608: iload 21
    //   610: istore 43
    //   612: aload 7
    //   614: astore 44
    //   616: goto -447 -> 169
    //   619: getstatic 70	lsg:a	Llsm;
    //   622: astore 27
    //   624: aload 27
    //   626: getfield 132	lsm:b	Llsl;
    //   629: aload_0
    //   630: if_acmpeq +11 -> 641
    //   633: aload 27
    //   635: getfield 132	lsm:b	Llsl;
    //   638: ifnonnull +122 -> 760
    //   641: aload 27
    //   643: aload_0
    //   644: putfield 132	lsm:b	Llsl;
    //   647: aload 27
    //   649: invokevirtual 107	java/lang/Object:notifyAll	()V
    //   652: iconst_1
    //   653: istore 28
    //   655: iload 28
    //   657: ifeq +1146 -> 1803
    //   660: aload_0
    //   661: getfield 57	lsl:s	Llsk;
    //   664: astore 74
    //   666: aload 74
    //   668: invokestatic 138	javax/microedition/khronos/egl/EGLContext:getEGL	()Ljavax/microedition/khronos/egl/EGL;
    //   671: checkcast 140	javax/microedition/khronos/egl/EGL10
    //   674: putfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   677: aload 74
    //   679: aload 74
    //   681: getfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   684: getstatic 147	javax/microedition/khronos/egl/EGL10:EGL_DEFAULT_DISPLAY	Ljava/lang/Object;
    //   687: invokeinterface 151 2 0
    //   692: putfield 154	lsk:c	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   695: aload 74
    //   697: getfield 154	lsk:c	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   700: getstatic 157	javax/microedition/khronos/egl/EGL10:EGL_NO_DISPLAY	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   703: if_acmpne +105 -> 808
    //   706: new 77	java/lang/RuntimeException
    //   709: dup
    //   710: ldc 159
    //   712: invokespecial 162	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   715: athrow
    //   716: astore 73
    //   718: getstatic 70	lsg:a	Llsm;
    //   721: aload_0
    //   722: invokevirtual 75	lsm:b	(Llsl;)V
    //   725: aload 73
    //   727: athrow
    //   728: astore 16
    //   730: aload 15
    //   732: monitorexit
    //   733: aload 16
    //   735: athrow
    //   736: astore 12
    //   738: getstatic 70	lsg:a	Llsm;
    //   741: astore 13
    //   743: aload 13
    //   745: monitorenter
    //   746: aload_0
    //   747: invokespecial 83	lsl:f	()V
    //   750: aload_0
    //   751: invokespecial 85	lsl:g	()V
    //   754: aload 13
    //   756: monitorexit
    //   757: aload 12
    //   759: athrow
    //   760: aload 27
    //   762: invokevirtual 164	lsm:c	()V
    //   765: aload 27
    //   767: getfield 166	lsm:a	Z
    //   770: ifeq +9 -> 779
    //   773: iconst_1
    //   774: istore 28
    //   776: goto -121 -> 655
    //   779: aload 27
    //   781: getfield 132	lsm:b	Llsl;
    //   784: ifnull +18 -> 802
    //   787: aload 27
    //   789: getfield 132	lsm:b	Llsl;
    //   792: iconst_1
    //   793: putfield 109	lsl:g	Z
    //   796: getstatic 70	lsg:a	Llsm;
    //   799: invokevirtual 107	java/lang/Object:notifyAll	()V
    //   802: iconst_0
    //   803: istore 28
    //   805: goto -150 -> 655
    //   808: iconst_2
    //   809: newarray int
    //   811: astore 75
    //   813: aload 74
    //   815: getfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   818: aload 74
    //   820: getfield 154	lsk:c	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   823: aload 75
    //   825: invokeinterface 170 3 0
    //   830: ifne +13 -> 843
    //   833: new 77	java/lang/RuntimeException
    //   836: dup
    //   837: ldc 172
    //   839: invokespecial 162	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   842: athrow
    //   843: aload 74
    //   845: getfield 174	lsk:a	Ljava/lang/ref/WeakReference;
    //   848: invokevirtual 115	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   851: checkcast 67	lsg
    //   854: astore 76
    //   856: aload 76
    //   858: ifnonnull +63 -> 921
    //   861: aload 74
    //   863: aconst_null
    //   864: putfield 177	lsk:e	Ljavax/microedition/khronos/egl/EGLConfig;
    //   867: aload 74
    //   869: aconst_null
    //   870: putfield 180	lsk:f	Ljavax/microedition/khronos/egl/EGLContext;
    //   873: aload 74
    //   875: getfield 180	lsk:f	Ljavax/microedition/khronos/egl/EGLContext;
    //   878: ifnull +14 -> 892
    //   881: aload 74
    //   883: getfield 180	lsk:f	Ljavax/microedition/khronos/egl/EGLContext;
    //   886: getstatic 183	javax/microedition/khronos/egl/EGL10:EGL_NO_CONTEXT	Ljavax/microedition/khronos/egl/EGLContext;
    //   889: if_acmpne +86 -> 975
    //   892: aload 74
    //   894: aconst_null
    //   895: putfield 180	lsk:f	Ljavax/microedition/khronos/egl/EGLContext;
    //   898: new 77	java/lang/RuntimeException
    //   901: dup
    //   902: ldc 185
    //   904: aload 74
    //   906: getfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   909: invokeinterface 189 1 0
    //   914: invokestatic 192	lsk:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   917: invokespecial 162	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   920: athrow
    //   921: aload 74
    //   923: aload 76
    //   925: getfield 195	lsg:e	Llsh;
    //   928: aload 74
    //   930: getfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   933: aload 74
    //   935: getfield 154	lsk:c	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   938: invokevirtual 200	lsh:a	(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;)Ljavax/microedition/khronos/egl/EGLConfig;
    //   941: putfield 177	lsk:e	Ljavax/microedition/khronos/egl/EGLConfig;
    //   944: aload 74
    //   946: aload 76
    //   948: getfield 203	lsg:f	Llsi;
    //   951: aload 74
    //   953: getfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   956: aload 74
    //   958: getfield 154	lsk:c	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   961: aload 74
    //   963: getfield 177	lsk:e	Ljavax/microedition/khronos/egl/EGLConfig;
    //   966: invokevirtual 208	lsi:a	(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLContext;
    //   969: putfield 180	lsk:f	Ljavax/microedition/khronos/egl/EGLContext;
    //   972: goto -99 -> 873
    //   975: aload 74
    //   977: aconst_null
    //   978: putfield 211	lsk:d	Ljavax/microedition/khronos/egl/EGLSurface;
    //   981: aload_0
    //   982: iconst_1
    //   983: putfield 63	lsl:l	Z
    //   986: iconst_1
    //   987: istore 9
    //   989: getstatic 70	lsg:a	Llsm;
    //   992: invokevirtual 107	java/lang/Object:notifyAll	()V
    //   995: goto +808 -> 1803
    //   998: getstatic 70	lsg:a	Llsm;
    //   1001: invokevirtual 214	java/lang/Object:wait	()V
    //   1004: iload 25
    //   1006: istore 9
    //   1008: iload 24
    //   1010: istore_1
    //   1011: iload 23
    //   1013: istore 8
    //   1015: iload 22
    //   1017: istore 11
    //   1019: iload 21
    //   1021: istore 4
    //   1023: iload 20
    //   1025: istore 26
    //   1027: iload 19
    //   1029: istore_2
    //   1030: iload 26
    //   1032: istore_3
    //   1033: goto -970 -> 63
    //   1036: iload 42
    //   1038: ifeq +195 -> 1233
    //   1041: aload_0
    //   1042: getfield 57	lsl:s	Llsk;
    //   1045: astore 60
    //   1047: aload 60
    //   1049: getfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   1052: ifnonnull +13 -> 1065
    //   1055: new 77	java/lang/RuntimeException
    //   1058: dup
    //   1059: ldc 216
    //   1061: invokespecial 162	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   1064: athrow
    //   1065: aload 60
    //   1067: getfield 154	lsk:c	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   1070: ifnonnull +13 -> 1083
    //   1073: new 77	java/lang/RuntimeException
    //   1076: dup
    //   1077: ldc 218
    //   1079: invokespecial 162	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   1082: athrow
    //   1083: aload 60
    //   1085: getfield 177	lsk:e	Ljavax/microedition/khronos/egl/EGLConfig;
    //   1088: ifnonnull +13 -> 1101
    //   1091: new 77	java/lang/RuntimeException
    //   1094: dup
    //   1095: ldc 220
    //   1097: invokespecial 162	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   1100: athrow
    //   1101: aload 60
    //   1103: invokevirtual 61	lsk:a	()V
    //   1106: aload 60
    //   1108: getfield 174	lsk:a	Ljava/lang/ref/WeakReference;
    //   1111: invokevirtual 115	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1114: checkcast 67	lsg
    //   1117: astore 61
    //   1119: aload 61
    //   1121: ifnull +387 -> 1508
    //   1124: aload 60
    //   1126: aload 61
    //   1128: getfield 223	lsg:g	Llsj;
    //   1131: aload 60
    //   1133: getfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   1136: aload 60
    //   1138: getfield 154	lsk:c	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   1141: aload 60
    //   1143: getfield 177	lsk:e	Ljavax/microedition/khronos/egl/EGLConfig;
    //   1146: aload 61
    //   1148: invokevirtual 227	lsg:getSurfaceTexture	()Landroid/graphics/SurfaceTexture;
    //   1151: invokevirtual 232	lsj:a	(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljava/lang/Object;)Ljavax/microedition/khronos/egl/EGLSurface;
    //   1154: putfield 211	lsk:d	Ljavax/microedition/khronos/egl/EGLSurface;
    //   1157: aload 60
    //   1159: getfield 211	lsk:d	Ljavax/microedition/khronos/egl/EGLSurface;
    //   1162: ifnull +14 -> 1176
    //   1165: aload 60
    //   1167: getfield 211	lsk:d	Ljavax/microedition/khronos/egl/EGLSurface;
    //   1170: getstatic 235	javax/microedition/khronos/egl/EGL10:EGL_NO_SURFACE	Ljavax/microedition/khronos/egl/EGLSurface;
    //   1173: if_acmpne +344 -> 1517
    //   1176: aload 60
    //   1178: getfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   1181: invokeinterface 189 1 0
    //   1186: sipush 12299
    //   1189: if_icmpne +628 -> 1817
    //   1192: ldc 237
    //   1194: ldc 239
    //   1196: invokestatic 244	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1199: pop
    //   1200: goto +617 -> 1817
    //   1203: iload 62
    //   1205: ifeq +382 -> 1587
    //   1208: getstatic 70	lsg:a	Llsm;
    //   1211: astore 63
    //   1213: aload 63
    //   1215: monitorenter
    //   1216: aload_0
    //   1217: iconst_1
    //   1218: putfield 246	lsl:f	Z
    //   1221: getstatic 70	lsg:a	Llsm;
    //   1224: invokevirtual 107	java/lang/Object:notifyAll	()V
    //   1227: aload 63
    //   1229: monitorexit
    //   1230: iconst_0
    //   1231: istore 42
    //   1233: iload 39
    //   1235: ifeq +75 -> 1310
    //   1238: aload_0
    //   1239: getfield 57	lsl:s	Llsk;
    //   1242: astore 55
    //   1244: aload 55
    //   1246: getfield 180	lsk:f	Ljavax/microedition/khronos/egl/EGLContext;
    //   1249: invokevirtual 250	javax/microedition/khronos/egl/EGLContext:getGL	()Ljavax/microedition/khronos/opengles/GL;
    //   1252: astore 56
    //   1254: aload 55
    //   1256: getfield 174	lsk:a	Ljava/lang/ref/WeakReference;
    //   1259: invokevirtual 115	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1262: checkcast 67	lsg
    //   1265: astore 57
    //   1267: aload 57
    //   1269: ifnull +438 -> 1707
    //   1272: aload 57
    //   1274: invokestatic 253	lsg:a	(Llsg;)Lx;
    //   1277: ifnull +430 -> 1707
    //   1280: aload 57
    //   1282: invokestatic 253	lsg:a	(Llsg;)Lx;
    //   1285: invokeinterface 257 1 0
    //   1290: astore 58
    //   1292: aload 58
    //   1294: checkcast 259	javax/microedition/khronos/opengles/GL10
    //   1297: astore 59
    //   1299: getstatic 70	lsg:a	Llsm;
    //   1302: aload 59
    //   1304: invokevirtual 262	lsm:a	(Ljavax/microedition/khronos/opengles/GL10;)V
    //   1307: iconst_0
    //   1308: istore 39
    //   1310: iload 37
    //   1312: ifeq +31 -> 1343
    //   1315: aload_0
    //   1316: getfield 53	lsl:t	Ljava/lang/ref/WeakReference;
    //   1319: invokevirtual 115	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1322: checkcast 67	lsg
    //   1325: astore 45
    //   1327: aload 45
    //   1329: ifnull +494 -> 1823
    //   1332: aload 45
    //   1334: getfield 265	lsg:d	Llso;
    //   1337: invokevirtual 268	lso:a	()V
    //   1340: goto +483 -> 1823
    //   1343: iload 40
    //   1345: ifeq +35 -> 1380
    //   1348: aload_0
    //   1349: getfield 53	lsl:t	Ljava/lang/ref/WeakReference;
    //   1352: invokevirtual 115	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1355: checkcast 67	lsg
    //   1358: astore 46
    //   1360: aload 46
    //   1362: ifnull +467 -> 1829
    //   1365: aload 46
    //   1367: getfield 265	lsg:d	Llso;
    //   1370: iload 38
    //   1372: iload 34
    //   1374: invokevirtual 271	lso:a	(II)V
    //   1377: goto +452 -> 1829
    //   1380: aload_0
    //   1381: getfield 53	lsl:t	Ljava/lang/ref/WeakReference;
    //   1384: invokevirtual 115	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1387: checkcast 67	lsg
    //   1390: astore 47
    //   1392: aload 47
    //   1394: ifnull +11 -> 1405
    //   1397: aload 47
    //   1399: getfield 265	lsg:d	Llso;
    //   1402: invokevirtual 272	lso:b	()V
    //   1405: aload_0
    //   1406: getfield 57	lsl:s	Llsk;
    //   1409: astore 48
    //   1411: aload 48
    //   1413: getfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   1416: aload 48
    //   1418: getfield 154	lsk:c	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   1421: aload 48
    //   1423: getfield 211	lsk:d	Ljavax/microedition/khronos/egl/EGLSurface;
    //   1426: invokeinterface 276 3 0
    //   1431: ifne +239 -> 1670
    //   1434: aload 48
    //   1436: getfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   1439: invokeinterface 189 1 0
    //   1444: istore 49
    //   1446: goto +389 -> 1835
    //   1449: ldc_w 277
    //   1452: iload 49
    //   1454: invokestatic 192	lsk:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   1457: pop
    //   1458: getstatic 70	lsg:a	Llsm;
    //   1461: astore 53
    //   1463: aload 53
    //   1465: monitorenter
    //   1466: aload_0
    //   1467: iconst_1
    //   1468: putfield 125	lsl:k	Z
    //   1471: getstatic 70	lsg:a	Llsm;
    //   1474: invokevirtual 107	java/lang/Object:notifyAll	()V
    //   1477: aload 53
    //   1479: monitorexit
    //   1480: aload_0
    //   1481: getfield 53	lsl:t	Ljava/lang/ref/WeakReference;
    //   1484: invokevirtual 115	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   1487: checkcast 67	lsg
    //   1490: astore 50
    //   1492: aload 50
    //   1494: ifnull +370 -> 1864
    //   1497: aload 50
    //   1499: getfield 265	lsg:d	Llso;
    //   1502: invokevirtual 278	lso:c	()V
    //   1505: goto +359 -> 1864
    //   1508: aload 60
    //   1510: aconst_null
    //   1511: putfield 211	lsk:d	Ljavax/microedition/khronos/egl/EGLSurface;
    //   1514: goto -357 -> 1157
    //   1517: aload 60
    //   1519: getfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   1522: aload 60
    //   1524: getfield 154	lsk:c	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   1527: aload 60
    //   1529: getfield 211	lsk:d	Ljavax/microedition/khronos/egl/EGLSurface;
    //   1532: aload 60
    //   1534: getfield 211	lsk:d	Ljavax/microedition/khronos/egl/EGLSurface;
    //   1537: aload 60
    //   1539: getfield 180	lsk:f	Ljavax/microedition/khronos/egl/EGLContext;
    //   1542: invokeinterface 282 5 0
    //   1547: ifne +26 -> 1573
    //   1550: ldc_w 283
    //   1553: aload 60
    //   1555: getfield 143	lsk:b	Ljavax/microedition/khronos/egl/EGL10;
    //   1558: invokeinterface 189 1 0
    //   1563: invokestatic 192	lsk:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   1566: pop
    //   1567: iconst_0
    //   1568: istore 62
    //   1570: goto -367 -> 1203
    //   1573: iconst_1
    //   1574: istore 62
    //   1576: goto -373 -> 1203
    //   1579: astore 64
    //   1581: aload 63
    //   1583: monitorexit
    //   1584: aload 64
    //   1586: athrow
    //   1587: getstatic 70	lsg:a	Llsm;
    //   1590: astore 65
    //   1592: aload 65
    //   1594: monitorenter
    //   1595: aload_0
    //   1596: iconst_1
    //   1597: putfield 246	lsl:f	Z
    //   1600: aload_0
    //   1601: iconst_1
    //   1602: putfield 125	lsl:k	Z
    //   1605: getstatic 70	lsg:a	Llsm;
    //   1608: invokevirtual 107	java/lang/Object:notifyAll	()V
    //   1611: aload 65
    //   1613: monitorexit
    //   1614: aload 44
    //   1616: astore 7
    //   1618: iload 38
    //   1620: istore 5
    //   1622: iload 35
    //   1624: istore_2
    //   1625: iload 43
    //   1627: istore 67
    //   1629: iload 41
    //   1631: istore 10
    //   1633: iload 40
    //   1635: istore 11
    //   1637: iload 39
    //   1639: istore 8
    //   1641: iload 37
    //   1643: istore 9
    //   1645: iload 42
    //   1647: istore_1
    //   1648: iload 34
    //   1650: istore 6
    //   1652: iload 36
    //   1654: istore_3
    //   1655: iload 67
    //   1657: istore 4
    //   1659: goto -1604 -> 55
    //   1662: astore 66
    //   1664: aload 65
    //   1666: monitorexit
    //   1667: aload 66
    //   1669: athrow
    //   1670: sipush 12288
    //   1673: istore 49
    //   1675: goto +160 -> 1835
    //   1678: iconst_1
    //   1679: istore 41
    //   1681: goto -201 -> 1480
    //   1684: astore 54
    //   1686: aload 53
    //   1688: monitorexit
    //   1689: aload 54
    //   1691: athrow
    //   1692: astore 14
    //   1694: aload 13
    //   1696: monitorexit
    //   1697: aload 14
    //   1699: athrow
    //   1700: iload 36
    //   1702: istore 51
    //   1704: goto +168 -> 1872
    //   1707: aload 56
    //   1709: astore 58
    //   1711: goto -419 -> 1292
    //   1714: iload 19
    //   1716: istore 32
    //   1718: iload 5
    //   1720: istore 71
    //   1722: iload 24
    //   1724: istore 33
    //   1726: iload 71
    //   1728: istore 30
    //   1730: iload 22
    //   1732: istore 72
    //   1734: iload 6
    //   1736: istore 31
    //   1738: iload 72
    //   1740: istore 29
    //   1742: goto -1181 -> 561
    //   1745: iload 11
    //   1747: istore 22
    //   1749: iload 8
    //   1751: istore 23
    //   1753: iload_1
    //   1754: istore 24
    //   1756: goto -1235 -> 521
    //   1759: iload 4
    //   1761: istore 21
    //   1763: iload 11
    //   1765: istore 22
    //   1767: iload 8
    //   1769: istore 23
    //   1771: iload_1
    //   1772: istore 24
    //   1774: iload 9
    //   1776: istore 25
    //   1778: goto -780 -> 998
    //   1781: iload_3
    //   1782: istore 18
    //   1784: iload_2
    //   1785: istore 19
    //   1787: iload 18
    //   1789: istore 20
    //   1791: goto -1320 -> 471
    //   1794: iconst_0
    //   1795: istore 17
    //   1797: goto -1531 -> 266
    //   1800: goto -1454 -> 346
    //   1803: iload 4
    //   1805: istore 21
    //   1807: goto -1314 -> 493
    //   1810: iload 9
    //   1812: istore 25
    //   1814: goto -816 -> 998
    //   1817: iconst_0
    //   1818: istore 62
    //   1820: goto -617 -> 1203
    //   1823: iconst_0
    //   1824: istore 37
    //   1826: goto -483 -> 1343
    //   1829: iconst_0
    //   1830: istore 40
    //   1832: goto -452 -> 1380
    //   1835: iload 49
    //   1837: lookupswitch	default:+-388->1449, 12288:+-357->1480, 12302:+-159->1678
    //   1865: fload_1
    //   1866: ifeq -166 -> 1700
    //   1869: iconst_1
    //   1870: istore 51
    //   1872: aload 44
    //   1874: astore 7
    //   1876: iload 43
    //   1878: istore 4
    //   1880: iload 38
    //   1882: istore 5
    //   1884: iload 41
    //   1886: istore 10
    //   1888: iload 35
    //   1890: istore_2
    //   1891: iload 40
    //   1893: istore 11
    //   1895: iload 39
    //   1897: istore 8
    //   1899: iload 37
    //   1901: istore 9
    //   1903: iload 42
    //   1905: istore_1
    //   1906: iload 34
    //   1908: istore 6
    //   1910: iload 51
    //   1912: istore_3
    //   1913: goto -1858 -> 55
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1916	0	this	lsl
    //   26	1880	1	i1	int
    //   28	1863	2	i2	int
    //   30	1883	3	i3	int
    //   32	1847	4	i4	int
    //   35	1848	5	i5	int
    //   38	1871	6	i6	int
    //   41	1834	7	localObject1	Object
    //   44	1854	8	i7	int
    //   47	1855	9	i8	int
    //   50	1837	10	i9	int
    //   53	1841	11	i10	int
    //   736	22	12	localObject2	Object
    //   741	954	13	locallsm1	lsm
    //   1692	6	14	localObject3	Object
    //   58	673	15	locallsm2	lsm
    //   728	6	16	localObject4	Object
    //   264	1532	17	bool1	boolean
    //   1782	6	18	i11	int
    //   455	1331	19	i12	int
    //   469	1321	20	i13	int
    //   491	1315	21	i14	int
    //   513	1253	22	i15	int
    //   516	1254	23	i16	int
    //   519	1254	24	i17	int
    //   1004	809	25	i18	int
    //   1025	6	26	i19	int
    //   622	166	27	locallsm3	lsm
    //   653	151	28	i20	int
    //   536	1205	29	i21	int
    //   542	1187	30	i22	int
    //   548	1189	31	i23	int
    //   551	1166	32	i24	int
    //   554	1171	33	i25	int
    //   144	1763	34	i26	int
    //   125	1764	35	i27	int
    //   140	1561	36	i28	int
    //   151	1749	37	i29	int
    //   129	1752	38	i30	int
    //   155	1741	39	i31	int
    //   159	1733	40	i32	int
    //   163	1722	41	i33	int
    //   147	1757	42	i34	int
    //   167	1710	43	i35	int
    //   133	1740	44	localObject5	Object
    //   1325	8	45	locallsg1	lsg
    //   1358	8	46	locallsg2	lsg
    //   1390	8	47	locallsg3	lsg
    //   1409	26	48	locallsk1	lsk
    //   1444	392	49	i36	int
    //   1490	8	50	locallsg4	lsg
    //   1702	209	51	i37	int
    //   1684	6	54	localObject6	Object
    //   1242	13	55	locallsk2	lsk
    //   1252	456	56	localGL1	javax.microedition.khronos.opengles.GL
    //   1265	16	57	locallsg5	lsg
    //   1290	420	58	localGL2	javax.microedition.khronos.opengles.GL
    //   1297	6	59	localGL10	javax.microedition.khronos.opengles.GL10
    //   1045	509	60	locallsk3	lsk
    //   1117	30	61	locallsg6	lsg
    //   1203	616	62	i38	int
    //   1579	6	64	localObject7	Object
    //   1662	6	66	localObject8	Object
    //   1627	29	67	i39	int
    //   193	29	70	i40	int
    //   1720	7	71	i41	int
    //   1732	7	72	i42	int
    //   716	10	73	localRuntimeException	java.lang.RuntimeException
    //   664	312	74	locallsk4	lsk
    //   811	13	75	arrayOfInt	int[]
    //   854	93	76	locallsg7	lsg
    //   246	17	77	bool2	boolean
    //   122	10	78	localRunnable	Runnable
    //   137	29	79	i43	int
    //   76	20	80	locallsm7	lsm
    //   93	6	81	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   81	92	93	finally
    //   95	98	93	finally
    //   660	716	716	java/lang/RuntimeException
    //   808	843	716	java/lang/RuntimeException
    //   843	856	716	java/lang/RuntimeException
    //   861	873	716	java/lang/RuntimeException
    //   873	892	716	java/lang/RuntimeException
    //   892	921	716	java/lang/RuntimeException
    //   921	972	716	java/lang/RuntimeException
    //   975	981	716	java/lang/RuntimeException
    //   63	73	728	finally
    //   101	124	728	finally
    //   169	172	728	finally
    //   231	262	728	finally
    //   266	286	728	finally
    //   294	302	728	finally
    //   310	321	728	finally
    //   326	346	728	finally
    //   350	359	728	finally
    //   359	363	728	finally
    //   368	384	728	finally
    //   384	409	728	finally
    //   409	425	728	finally
    //   425	450	728	finally
    //   457	468	728	finally
    //   471	485	728	finally
    //   493	512	728	finally
    //   521	535	728	finally
    //   538	550	728	finally
    //   556	561	728	finally
    //   561	572	728	finally
    //   619	641	728	finally
    //   641	652	728	finally
    //   660	716	728	finally
    //   718	728	728	finally
    //   730	733	728	finally
    //   760	773	728	finally
    //   779	802	728	finally
    //   808	843	728	finally
    //   843	856	728	finally
    //   861	873	728	finally
    //   873	892	728	finally
    //   892	921	728	finally
    //   921	972	728	finally
    //   975	981	728	finally
    //   981	986	728	finally
    //   989	995	728	finally
    //   998	1004	728	finally
    //   55	63	736	finally
    //   177	184	736	finally
    //   733	736	736	finally
    //   1041	1065	736	finally
    //   1065	1083	736	finally
    //   1083	1101	736	finally
    //   1101	1119	736	finally
    //   1124	1157	736	finally
    //   1157	1176	736	finally
    //   1176	1200	736	finally
    //   1208	1216	736	finally
    //   1238	1267	736	finally
    //   1272	1292	736	finally
    //   1292	1307	736	finally
    //   1315	1327	736	finally
    //   1332	1340	736	finally
    //   1348	1360	736	finally
    //   1365	1377	736	finally
    //   1380	1392	736	finally
    //   1397	1405	736	finally
    //   1405	1446	736	finally
    //   1449	1466	736	finally
    //   1480	1492	736	finally
    //   1497	1505	736	finally
    //   1508	1514	736	finally
    //   1517	1567	736	finally
    //   1584	1587	736	finally
    //   1587	1595	736	finally
    //   1667	1670	736	finally
    //   1689	1692	736	finally
    //   1216	1230	1579	finally
    //   1581	1584	1579	finally
    //   1595	1614	1662	finally
    //   1664	1667	1662	finally
    //   1466	1480	1684	finally
    //   1686	1689	1684	finally
    //   746	757	1692	finally
    //   1694	1697	1692	finally
  }
  
  private final boolean i()
  {
    return (!this.c) && (this.d) && (!this.k) && (this.n > 0) && (this.o > 0) && ((this.h) || (this.p == 1));
  }
  
  public final int a()
  {
    synchronized (lsg.a)
    {
      int i1 = this.p;
      return i1;
    }
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 1)) {
      throw new IllegalArgumentException("renderMode");
    }
    synchronized (lsg.a)
    {
      this.p = paramInt;
      lsg.a.notifyAll();
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    for (;;)
    {
      synchronized (lsg.a)
      {
        this.n = paramInt1;
        this.o = paramInt2;
        this.r = true;
        this.h = true;
        this.i = false;
        lsg.a.notifyAll();
        if ((this.a) || (this.c) || (this.i)) {
          break;
        }
        if ((this.l) && (this.m))
        {
          boolean bool = i();
          if (bool)
          {
            i1 = 1;
            if (i1 == 0) {
              break;
            }
            try
            {
              lsg.a.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
          }
        }
      }
      int i1 = 0;
    }
  }
  
  public final void b()
  {
    synchronized (lsg.a)
    {
      this.h = true;
      lsg.a.notifyAll();
      return;
    }
  }
  
  public final void c()
  {
    synchronized (lsg.a)
    {
      this.b = true;
      lsg.a.notifyAll();
      for (;;)
      {
        if (!this.a)
        {
          boolean bool = this.c;
          if (!bool) {
            try
            {
              lsg.a.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
          }
        }
      }
    }
  }
  
  public final void d()
  {
    synchronized (lsg.a)
    {
      this.b = false;
      this.h = true;
      this.i = false;
      lsg.a.notifyAll();
      for (;;)
      {
        if ((!this.a) && (this.c))
        {
          boolean bool = this.i;
          if (!bool) {
            try
            {
              lsg.a.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
          }
        }
      }
    }
  }
  
  public final void e()
  {
    synchronized (lsg.a)
    {
      this.j = true;
      lsg.a.notifyAll();
      for (;;)
      {
        boolean bool = this.a;
        if (!bool) {
          try
          {
            lsg.a.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
          }
        }
      }
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 303	lsl:getId	()J
    //   4: lstore_1
    //   5: aload_0
    //   6: new 305	java/lang/StringBuilder
    //   9: dup
    //   10: bipush 29
    //   12: invokespecial 307	java/lang/StringBuilder:<init>	(I)V
    //   15: ldc_w 309
    //   18: invokevirtual 313	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: lload_1
    //   22: invokevirtual 316	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   25: invokevirtual 320	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: invokevirtual 323	lsl:setName	(Ljava/lang/String;)V
    //   31: aload_0
    //   32: invokespecial 325	lsl:h	()V
    //   35: getstatic 70	lsg:a	Llsm;
    //   38: aload_0
    //   39: invokevirtual 327	lsm:a	(Llsl;)V
    //   42: return
    //   43: astore 4
    //   45: getstatic 70	lsg:a	Llsm;
    //   48: aload_0
    //   49: invokevirtual 327	lsm:a	(Llsl;)V
    //   52: return
    //   53: astore_3
    //   54: getstatic 70	lsg:a	Llsm;
    //   57: aload_0
    //   58: invokevirtual 327	lsm:a	(Llsl;)V
    //   61: aload_3
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	lsl
    //   4	18	1	l1	long
    //   53	9	3	localObject	Object
    //   43	1	4	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   31	35	43	java/lang/InterruptedException
    //   31	35	53	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsl
 * JD-Core Version:    0.7.0.1
 */