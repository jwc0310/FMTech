public final class hlb
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final boolean d;
  private final boolean l;
  private final int m;
  private final int[] n;
  private final String o;
  
  public hlb(int paramInt1, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, int[] paramArrayOfInt)
  {
    super("GetCollexionActivityStreamTask");
    this.a = paramInt1;
    this.b = paramString1;
    this.l = paramBoolean1;
    this.d = paramBoolean2;
    this.c = paramString3;
    this.m = paramInt2;
    this.n = paramArrayOfInt;
    this.o = paramString2;
  }
  
  /* Error */
  protected final hae a(android.content.Context paramContext)
  {
    // Byte code:
    //   0: new 44	kck
    //   3: dup
    //   4: invokespecial 47	kck:<init>	()V
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: getfield 29	hlb:l	Z
    //   13: putfield 49	kck:n	Z
    //   16: aload_0
    //   17: getfield 39	hlb:o	Ljava/lang/String;
    //   20: invokestatic 55	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   23: astore_3
    //   24: aload_3
    //   25: invokevirtual 59	java/lang/String:length	()I
    //   28: ifeq +143 -> 171
    //   31: ldc 61
    //   33: aload_3
    //   34: invokevirtual 65	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   37: astore 4
    //   39: aload_2
    //   40: aload 4
    //   42: invokevirtual 67	kck:a	(Ljava/lang/String;)V
    //   45: aload_2
    //   46: ldc 69
    //   48: invokevirtual 71	kck:b	(Ljava/lang/String;)V
    //   51: new 73	kch
    //   54: dup
    //   55: invokespecial 74	kch:<init>	()V
    //   58: aload_1
    //   59: aload_0
    //   60: getfield 25	hlb:a	I
    //   63: invokevirtual 77	kch:a	(Landroid/content/Context;I)Lkch;
    //   66: astore 8
    //   68: aload 8
    //   70: aload_2
    //   71: invokestatic 80	kck:a	(Lkck;)Z
    //   74: putfield 83	kch:e	Z
    //   77: aload_2
    //   78: ifnull +107 -> 185
    //   81: aload_2
    //   82: getfield 86	kck:m	Lkbx;
    //   85: astore 9
    //   87: aload 8
    //   89: aload 9
    //   91: putfield 89	kch:f	Lkbx;
    //   94: new 91	hkd
    //   97: dup
    //   98: aload_1
    //   99: aload 8
    //   101: invokevirtual 94	kch:a	()Lkcg;
    //   104: aload_0
    //   105: getfield 39	hlb:o	Ljava/lang/String;
    //   108: aload_0
    //   109: getfield 33	hlb:c	Ljava/lang/String;
    //   112: aload_0
    //   113: getfield 35	hlb:m	I
    //   116: aconst_null
    //   117: aconst_null
    //   118: aload_0
    //   119: getfield 37	hlb:n	[I
    //   122: invokespecial 97	hkd:<init>	(Landroid/content/Context;Lkcg;Ljava/lang/String;Ljava/lang/String;I[I[I[I)V
    //   125: astore 10
    //   127: aload 10
    //   129: invokevirtual 100	hkd:i	()V
    //   132: aload 10
    //   134: invokevirtual 103	hkd:n	()Z
    //   137: ifeq +54 -> 191
    //   140: new 105	hae
    //   143: dup
    //   144: aload 10
    //   146: getfield 109	kbw:o	I
    //   149: aload 10
    //   151: getfield 113	kbw:q	Ljava/lang/Exception;
    //   154: aconst_null
    //   155: invokespecial 116	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   158: astore 11
    //   160: aload_2
    //   161: invokevirtual 118	kck:d	()V
    //   164: aload_2
    //   165: invokevirtual 120	kck:e	()V
    //   168: aload 11
    //   170: areturn
    //   171: new 51	java/lang/String
    //   174: dup
    //   175: ldc 61
    //   177: invokespecial 121	java/lang/String:<init>	(Ljava/lang/String;)V
    //   180: astore 4
    //   182: goto -143 -> 39
    //   185: aconst_null
    //   186: astore 9
    //   188: goto -101 -> 87
    //   191: aload 10
    //   193: getfield 126	kct:x	Z
    //   196: ifeq +93 -> 289
    //   199: aload 10
    //   201: getfield 130	kct:w	Lqat;
    //   204: astore 12
    //   206: aload 12
    //   208: ifnull +58 -> 266
    //   211: aload 10
    //   213: getfield 126	kct:x	Z
    //   216: ifeq +79 -> 295
    //   219: aload 10
    //   221: getfield 130	kct:w	Lqat;
    //   224: astore 13
    //   226: aload 13
    //   228: checkcast 132	mqi
    //   231: getfield 135	mqi:a	Lofs;
    //   234: ifnull +32 -> 266
    //   237: aload 10
    //   239: getfield 126	kct:x	Z
    //   242: ifeq +59 -> 301
    //   245: aload 10
    //   247: getfield 130	kct:w	Lqat;
    //   250: astore 15
    //   252: aload 15
    //   254: checkcast 132	mqi
    //   257: getfield 135	mqi:a	Lofs;
    //   260: getfield 140	ofs:a	Lope;
    //   263: ifnonnull +44 -> 307
    //   266: new 105	hae
    //   269: dup
    //   270: iconst_0
    //   271: aconst_null
    //   272: aconst_null
    //   273: invokespecial 116	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   276: astore 14
    //   278: aload_2
    //   279: invokevirtual 118	kck:d	()V
    //   282: aload_2
    //   283: invokevirtual 120	kck:e	()V
    //   286: aload 14
    //   288: areturn
    //   289: aconst_null
    //   290: astore 12
    //   292: goto -86 -> 206
    //   295: aconst_null
    //   296: astore 13
    //   298: goto -72 -> 226
    //   301: aconst_null
    //   302: astore 15
    //   304: goto -52 -> 252
    //   307: aload 10
    //   309: getfield 126	kct:x	Z
    //   312: ifeq +133 -> 445
    //   315: aload 10
    //   317: getfield 130	kct:w	Lqat;
    //   320: astore 16
    //   322: aload 16
    //   324: checkcast 132	mqi
    //   327: getfield 135	mqi:a	Lofs;
    //   330: astore 17
    //   332: aload_0
    //   333: getfield 27	hlb:b	Ljava/lang/String;
    //   336: aconst_null
    //   337: aload_0
    //   338: getfield 29	hlb:l	Z
    //   341: aconst_null
    //   342: aconst_null
    //   343: iconst_5
    //   344: aload_0
    //   345: getfield 39	hlb:o	Ljava/lang/String;
    //   348: invokestatic 145	efj:a	(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   351: astore 18
    //   353: aload_1
    //   354: ldc 147
    //   356: invokestatic 152	mbb:a	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   359: checkcast 147	llk
    //   362: aload_1
    //   363: aload_0
    //   364: getfield 25	hlb:a	I
    //   367: aload 18
    //   369: invokestatic 158	java/lang/System:currentTimeMillis	()J
    //   372: aload 17
    //   374: getfield 140	ofs:a	Lope;
    //   377: getfield 163	ope:b	[Loqw;
    //   380: iconst_3
    //   381: aload_0
    //   382: getfield 33	hlb:c	Ljava/lang/String;
    //   385: aload 17
    //   387: getfield 140	ofs:a	Lope;
    //   390: getfield 164	ope:c	Ljava/lang/String;
    //   393: aconst_null
    //   394: aload_2
    //   395: aload_0
    //   396: getfield 31	hlb:d	Z
    //   399: aconst_null
    //   400: aload_0
    //   401: getfield 39	hlb:o	Ljava/lang/String;
    //   404: invokeinterface 167 15 0
    //   409: new 105	hae
    //   412: dup
    //   413: iconst_1
    //   414: invokespecial 170	hae:<init>	(Z)V
    //   417: astore 19
    //   419: aload 19
    //   421: invokevirtual 173	hae:a	()Landroid/os/Bundle;
    //   424: ldc 175
    //   426: aload 10
    //   428: getfield 178	hjw:c	Ljava/lang/String;
    //   431: invokevirtual 184	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   434: aload_2
    //   435: invokevirtual 118	kck:d	()V
    //   438: aload_2
    //   439: invokevirtual 120	kck:e	()V
    //   442: aload 19
    //   444: areturn
    //   445: aconst_null
    //   446: astore 16
    //   448: goto -126 -> 322
    //   451: astore 6
    //   453: new 105	hae
    //   456: dup
    //   457: iconst_0
    //   458: aload 6
    //   460: aconst_null
    //   461: invokespecial 116	hae:<init>	(ILjava/lang/Exception;Ljava/lang/String;)V
    //   464: astore 7
    //   466: aload_2
    //   467: invokevirtual 118	kck:d	()V
    //   470: aload_2
    //   471: invokevirtual 120	kck:e	()V
    //   474: aload 7
    //   476: areturn
    //   477: astore 5
    //   479: aload_2
    //   480: invokevirtual 118	kck:d	()V
    //   483: aload_2
    //   484: invokevirtual 120	kck:e	()V
    //   487: aload 5
    //   489: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	490	0	this	hlb
    //   0	490	1	paramContext	android.content.Context
    //   7	477	2	localkck	kck
    //   23	11	3	str1	String
    //   37	144	4	str2	String
    //   477	11	5	localObject	java.lang.Object
    //   451	8	6	localIOException	java.io.IOException
    //   464	11	7	localhae1	hae
    //   66	34	8	localkch	kch
    //   85	102	9	localkbx	kbx
    //   125	302	10	localhkd	hkd
    //   158	11	11	localhae2	hae
    //   204	87	12	localqat1	qat
    //   224	73	13	localqat2	qat
    //   276	11	14	localhae3	hae
    //   250	53	15	localqat3	qat
    //   320	127	16	localqat4	qat
    //   330	56	17	localofs	ofs
    //   351	17	18	str3	String
    //   417	26	19	localhae4	hae
    // Exception table:
    //   from	to	target	type
    //   51	77	451	java/io/IOException
    //   81	87	451	java/io/IOException
    //   87	160	451	java/io/IOException
    //   191	206	451	java/io/IOException
    //   211	226	451	java/io/IOException
    //   226	252	451	java/io/IOException
    //   252	266	451	java/io/IOException
    //   266	278	451	java/io/IOException
    //   307	322	451	java/io/IOException
    //   322	434	451	java/io/IOException
    //   51	77	477	finally
    //   81	87	477	finally
    //   87	160	477	finally
    //   191	206	477	finally
    //   211	226	477	finally
    //   226	252	477	finally
    //   252	266	477	finally
    //   266	278	477	finally
    //   307	322	477	finally
    //   322	434	477	finally
    //   453	466	477	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlb
 * JD-Core Version:    0.7.0.1
 */