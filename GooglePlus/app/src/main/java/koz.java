public final class koz
  extends pye<koz, pyg>
  implements pzf
{
  public static final koz g;
  private static volatile pzg n = null;
  private static volatile pzh<koz> o;
  private static final long serialVersionUID;
  public int a;
  public int b;
  public String c;
  public String d;
  public String e;
  public boolean f;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  
  static
  {
    pxw localpxw = pyr.c;
    g = new koz(localpxw);
  }
  
  /* Error */
  private koz(pxw parampxw)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 55	pye:<init>	()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield 57	koz:b	I
    //   9: aload_0
    //   10: ldc 59
    //   12: putfield 61	koz:c	Ljava/lang/String;
    //   15: aload_0
    //   16: ldc 59
    //   18: putfield 63	koz:d	Ljava/lang/String;
    //   21: aload_0
    //   22: ldc 59
    //   24: putfield 65	koz:e	Ljava/lang/String;
    //   27: aload_0
    //   28: iconst_0
    //   29: putfield 67	koz:j	Z
    //   32: aload_0
    //   33: iconst_0
    //   34: putfield 69	koz:k	Z
    //   37: aload_0
    //   38: iconst_0
    //   39: putfield 71	koz:l	Z
    //   42: aload_0
    //   43: iconst_0
    //   44: putfield 73	koz:m	Z
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield 75	koz:f	Z
    //   52: iconst_0
    //   53: istore_2
    //   54: iload_2
    //   55: ifne +438 -> 493
    //   58: aload_1
    //   59: invokevirtual 80	pxw:a	()I
    //   62: istore 7
    //   64: iload 7
    //   66: lookupswitch	default:+90->156, 0:+432->498, 8:+105->171, 18:+153->219, 26:+208->274, 34:+233->299, 40:+259->325, 48:+291->357, 56:+323->389, 64:+355->421, 72:+388->454
    //   157: iload 7
    //   159: aload_1
    //   160: invokevirtual 83	koz:a	(ILpxw;)Z
    //   163: ifne -109 -> 54
    //   166: iconst_1
    //   167: istore_2
    //   168: goto -114 -> 54
    //   171: aload_0
    //   172: iconst_1
    //   173: aload_0
    //   174: getfield 85	koz:a	I
    //   177: ior
    //   178: putfield 85	koz:a	I
    //   181: aload_0
    //   182: aload_1
    //   183: invokevirtual 87	pxw:d	()I
    //   186: putfield 57	koz:b	I
    //   189: goto -135 -> 54
    //   192: astore 6
    //   194: aload 6
    //   196: aload_0
    //   197: putfield 90	pyw:a	Lpzd;
    //   200: new 92	java/lang/RuntimeException
    //   203: dup
    //   204: aload 6
    //   206: invokespecial 95	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   209: athrow
    //   210: astore 5
    //   212: aload_0
    //   213: invokevirtual 98	koz:i	()V
    //   216: aload 5
    //   218: athrow
    //   219: aload_1
    //   220: invokevirtual 101	pxw:b	()Ljava/lang/String;
    //   223: astore 15
    //   225: aload_0
    //   226: iconst_2
    //   227: aload_0
    //   228: getfield 85	koz:a	I
    //   231: ior
    //   232: putfield 85	koz:a	I
    //   235: aload_0
    //   236: aload 15
    //   238: putfield 61	koz:c	Ljava/lang/String;
    //   241: goto -187 -> 54
    //   244: astore_3
    //   245: new 51	pyw
    //   248: dup
    //   249: aload_3
    //   250: invokevirtual 104	java/io/IOException:getMessage	()Ljava/lang/String;
    //   253: invokespecial 107	pyw:<init>	(Ljava/lang/String;)V
    //   256: astore 4
    //   258: aload 4
    //   260: aload_0
    //   261: putfield 90	pyw:a	Lpzd;
    //   264: new 92	java/lang/RuntimeException
    //   267: dup
    //   268: aload 4
    //   270: invokespecial 95	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   273: athrow
    //   274: aload_1
    //   275: invokevirtual 101	pxw:b	()Ljava/lang/String;
    //   278: astore 14
    //   280: aload_0
    //   281: iconst_4
    //   282: aload_0
    //   283: getfield 85	koz:a	I
    //   286: ior
    //   287: putfield 85	koz:a	I
    //   290: aload_0
    //   291: aload 14
    //   293: putfield 63	koz:d	Ljava/lang/String;
    //   296: goto -242 -> 54
    //   299: aload_1
    //   300: invokevirtual 101	pxw:b	()Ljava/lang/String;
    //   303: astore 13
    //   305: aload_0
    //   306: bipush 8
    //   308: aload_0
    //   309: getfield 85	koz:a	I
    //   312: ior
    //   313: putfield 85	koz:a	I
    //   316: aload_0
    //   317: aload 13
    //   319: putfield 65	koz:e	Ljava/lang/String;
    //   322: goto -268 -> 54
    //   325: aload_0
    //   326: bipush 16
    //   328: aload_0
    //   329: getfield 85	koz:a	I
    //   332: ior
    //   333: putfield 85	koz:a	I
    //   336: aload_1
    //   337: invokevirtual 110	pxw:e	()J
    //   340: lconst_0
    //   341: lcmp
    //   342: ifeq +161 -> 503
    //   345: iconst_1
    //   346: istore 12
    //   348: aload_0
    //   349: iload 12
    //   351: putfield 67	koz:j	Z
    //   354: goto -300 -> 54
    //   357: aload_0
    //   358: bipush 32
    //   360: aload_0
    //   361: getfield 85	koz:a	I
    //   364: ior
    //   365: putfield 85	koz:a	I
    //   368: aload_1
    //   369: invokevirtual 110	pxw:e	()J
    //   372: lconst_0
    //   373: lcmp
    //   374: ifeq +135 -> 509
    //   377: iconst_1
    //   378: istore 11
    //   380: aload_0
    //   381: iload 11
    //   383: putfield 69	koz:k	Z
    //   386: goto -332 -> 54
    //   389: aload_0
    //   390: bipush 64
    //   392: aload_0
    //   393: getfield 85	koz:a	I
    //   396: ior
    //   397: putfield 85	koz:a	I
    //   400: aload_1
    //   401: invokevirtual 110	pxw:e	()J
    //   404: lconst_0
    //   405: lcmp
    //   406: ifeq +109 -> 515
    //   409: iconst_1
    //   410: istore 10
    //   412: aload_0
    //   413: iload 10
    //   415: putfield 71	koz:l	Z
    //   418: goto -364 -> 54
    //   421: aload_0
    //   422: sipush 128
    //   425: aload_0
    //   426: getfield 85	koz:a	I
    //   429: ior
    //   430: putfield 85	koz:a	I
    //   433: aload_1
    //   434: invokevirtual 110	pxw:e	()J
    //   437: lconst_0
    //   438: lcmp
    //   439: ifeq +82 -> 521
    //   442: iconst_1
    //   443: istore 9
    //   445: aload_0
    //   446: iload 9
    //   448: putfield 73	koz:m	Z
    //   451: goto -397 -> 54
    //   454: aload_0
    //   455: sipush 256
    //   458: aload_0
    //   459: getfield 85	koz:a	I
    //   462: ior
    //   463: putfield 85	koz:a	I
    //   466: aload_1
    //   467: invokevirtual 110	pxw:e	()J
    //   470: lconst_0
    //   471: lcmp
    //   472: ifeq +15 -> 487
    //   475: iconst_1
    //   476: istore 8
    //   478: aload_0
    //   479: iload 8
    //   481: putfield 75	koz:f	Z
    //   484: goto -430 -> 54
    //   487: iconst_0
    //   488: istore 8
    //   490: goto -12 -> 478
    //   493: aload_0
    //   494: invokevirtual 98	koz:i	()V
    //   497: return
    //   498: iconst_1
    //   499: istore_2
    //   500: goto -446 -> 54
    //   503: iconst_0
    //   504: istore 12
    //   506: goto -158 -> 348
    //   509: iconst_0
    //   510: istore 11
    //   512: goto -132 -> 380
    //   515: iconst_0
    //   516: istore 10
    //   518: goto -106 -> 412
    //   521: iconst_0
    //   522: istore 9
    //   524: goto -79 -> 445
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	527	0	this	koz
    //   0	527	1	parampxw	pxw
    //   53	447	2	i	int
    //   244	6	3	localIOException	java.io.IOException
    //   256	13	4	localpyw1	pyw
    //   210	7	5	localObject	Object
    //   192	13	6	localpyw2	pyw
    //   62	96	7	i1	int
    //   476	13	8	bool1	boolean
    //   443	80	9	bool2	boolean
    //   410	107	10	bool3	boolean
    //   378	133	11	bool4	boolean
    //   346	159	12	bool5	boolean
    //   303	15	13	str1	String
    //   278	14	14	str2	String
    //   223	14	15	str3	String
    // Exception table:
    //   from	to	target	type
    //   58	64	192	pyw
    //   156	166	192	pyw
    //   171	189	192	pyw
    //   219	241	192	pyw
    //   274	296	192	pyw
    //   299	322	192	pyw
    //   325	345	192	pyw
    //   348	354	192	pyw
    //   357	377	192	pyw
    //   380	386	192	pyw
    //   389	409	192	pyw
    //   412	418	192	pyw
    //   421	442	192	pyw
    //   445	451	192	pyw
    //   454	475	192	pyw
    //   478	484	192	pyw
    //   58	64	210	finally
    //   156	166	210	finally
    //   171	189	210	finally
    //   194	210	210	finally
    //   219	241	210	finally
    //   245	274	210	finally
    //   274	296	210	finally
    //   299	322	210	finally
    //   325	345	210	finally
    //   348	354	210	finally
    //   357	377	210	finally
    //   380	386	210	finally
    //   389	409	210	finally
    //   412	418	210	finally
    //   421	442	210	finally
    //   445	451	210	finally
    //   454	475	210	finally
    //   478	484	210	finally
    //   58	64	244	java/io/IOException
    //   156	166	244	java/io/IOException
    //   171	189	244	java/io/IOException
    //   219	241	244	java/io/IOException
    //   274	296	244	java/io/IOException
    //   299	322	244	java/io/IOException
    //   325	345	244	java/io/IOException
    //   348	354	244	java/io/IOException
    //   357	377	244	java/io/IOException
    //   380	386	244	java/io/IOException
    //   389	409	244	java/io/IOException
    //   412	418	244	java/io/IOException
    //   421	442	244	java/io/IOException
    //   445	451	244	java/io/IOException
    //   454	475	244	java/io/IOException
    //   478	484	244	java/io/IOException
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {
      return i;
    }
    int i1 = 0x1 & this.a;
    int i2 = 0;
    if (i1 == 1) {
      i2 = 0 + pxx.e(1, this.b);
    }
    if ((0x2 & this.a) == 2) {
      i2 += pxx.b(2, this.c);
    }
    if ((0x4 & this.a) == 4) {
      i2 += pxx.b(3, this.d);
    }
    if ((0x8 & this.a) == 8) {
      i2 += pxx.b(4, this.e);
    }
    if ((0x10 & this.a) == 16) {
      i2 += pxx.b(5, this.j);
    }
    if ((0x20 & this.a) == 32) {
      i2 += pxx.b(6, this.k);
    }
    if ((0x40 & this.a) == 64) {
      i2 += pxx.b(7, this.l);
    }
    if ((0x80 & this.a) == 128) {
      i2 += pxx.b(8, this.m);
    }
    if ((0x100 & this.a) == 256) {
      i2 += pxx.b(9, this.f);
    }
    int i3 = i2 + this.h.a();
    this.i = i3;
    return i3;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    int i = 1;
    switch (kpa.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new koz((pxw)paramObject1);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        pxw localpxw = pyr.c;
        return new koz(localpxw);
        return g;
        return null;
        return new pyg((short)0);
      } while (paramObject1 == g);
      koz localkoz = (koz)paramObject1;
      int i1;
      int i2;
      int i3;
      int i4;
      label264:
      int i5;
      label306:
      int i6;
      label337:
      int i7;
      int i8;
      if ((0x1 & localkoz.a) == i)
      {
        i1 = i;
        if (i1 != 0)
        {
          int i9 = localkoz.b;
          this.a = (0x1 | this.a);
          this.b = i9;
        }
        if ((0x2 & localkoz.a) != 2) {
          break label488;
        }
        i2 = i;
        if (i2 != 0)
        {
          this.a = (0x2 | this.a);
          this.c = localkoz.c;
        }
        if ((0x4 & localkoz.a) != 4) {
          break label494;
        }
        i3 = i;
        if (i3 != 0)
        {
          this.a = (0x4 | this.a);
          this.d = localkoz.d;
        }
        if ((0x8 & localkoz.a) != 8) {
          break label500;
        }
        i4 = i;
        if (i4 != 0)
        {
          this.a = (0x8 | this.a);
          this.e = localkoz.e;
        }
        if ((0x10 & localkoz.a) != 16) {
          break label506;
        }
        i5 = i;
        if (i5 != 0) {
          a(localkoz.j);
        }
        if ((0x20 & localkoz.a) != 32) {
          break label512;
        }
        i6 = i;
        if (i6 != 0) {
          b(localkoz.k);
        }
        if ((0x40 & localkoz.a) != 64) {
          break label518;
        }
        i7 = i;
        if (i7 != 0) {
          c(localkoz.l);
        }
        if ((0x80 & localkoz.a) != 128) {
          break label524;
        }
        i8 = i;
        label401:
        if (i8 != 0)
        {
          boolean bool = localkoz.m;
          this.a = (0x80 | this.a);
          this.m = bool;
        }
        if ((0x100 & localkoz.a) != 256) {
          break label530;
        }
      }
      for (;;)
      {
        if (i != 0) {
          d(localkoz.f);
        }
        pzs localpzs = localkoz.h;
        this.h = pzs.a(this.h, localpzs);
        return this;
        i1 = 0;
        break;
        label488:
        i2 = 0;
        break label184;
        label494:
        i3 = 0;
        break label223;
        i4 = 0;
        break label264;
        i5 = 0;
        break label306;
        label512:
        i6 = 0;
        break label337;
        label518:
        i7 = 0;
        break label368;
        label524:
        i8 = 0;
        break label401;
        label530:
        i = 0;
      }
    case 7: 
      label184:
      label223:
      label368:
      label500:
      label506:
      return g;
    }
    if (o == null) {}
    try
    {
      if (o == null) {
        o = new pxp(g);
      }
      return o;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    int i = 1;
    if ((0x1 & this.a) == i)
    {
      int i15 = this.b;
      parampxx.g(8);
      parampxx.a(i15);
    }
    if ((0x2 & this.a) == 2)
    {
      String str3 = this.c;
      parampxx.g(18);
      parampxx.a(str3);
    }
    if ((0x4 & this.a) == 4)
    {
      String str2 = this.d;
      parampxx.g(26);
      parampxx.a(str2);
    }
    if ((0x8 & this.a) == 8)
    {
      String str1 = this.e;
      parampxx.g(34);
      parampxx.a(str1);
    }
    if ((0x10 & this.a) == 16)
    {
      boolean bool5 = this.j;
      parampxx.g(40);
      if (bool5) {}
      int i13;
      for (int i12 = i;; i12 = 0)
      {
        i13 = (byte)i12;
        if (parampxx.c != parampxx.b) {
          break;
        }
        throw new eye();
      }
      byte[] arrayOfByte5 = parampxx.a;
      int i14 = parampxx.c;
      parampxx.c = (i14 + 1);
      arrayOfByte5[i14] = i13;
      parampxx.d = (1 + parampxx.d);
    }
    if ((0x20 & this.a) == 32)
    {
      boolean bool4 = this.k;
      parampxx.g(48);
      if (bool4) {}
      int i10;
      for (int i9 = i;; i9 = 0)
      {
        i10 = (byte)i9;
        if (parampxx.c != parampxx.b) {
          break;
        }
        throw new eye();
      }
      byte[] arrayOfByte4 = parampxx.a;
      int i11 = parampxx.c;
      parampxx.c = (i11 + 1);
      arrayOfByte4[i11] = i10;
      parampxx.d = (1 + parampxx.d);
    }
    if ((0x40 & this.a) == 64)
    {
      boolean bool3 = this.l;
      parampxx.g(56);
      if (bool3) {}
      int i7;
      for (int i6 = i;; i6 = 0)
      {
        i7 = (byte)i6;
        if (parampxx.c != parampxx.b) {
          break;
        }
        throw new eye();
      }
      byte[] arrayOfByte3 = parampxx.a;
      int i8 = parampxx.c;
      parampxx.c = (i8 + 1);
      arrayOfByte3[i8] = i7;
      parampxx.d = (1 + parampxx.d);
    }
    if ((0x80 & this.a) == 128)
    {
      boolean bool2 = this.m;
      parampxx.g(64);
      if (bool2) {}
      int i4;
      for (int i3 = i;; i3 = 0)
      {
        i4 = (byte)i3;
        if (parampxx.c != parampxx.b) {
          break;
        }
        throw new eye();
      }
      byte[] arrayOfByte2 = parampxx.a;
      int i5 = parampxx.c;
      parampxx.c = (i5 + 1);
      arrayOfByte2[i5] = i4;
      parampxx.d = (1 + parampxx.d);
    }
    if ((0x100 & this.a) == 256)
    {
      boolean bool1 = this.f;
      parampxx.g(72);
      if (bool1) {}
      int i1;
      for (;;)
      {
        i1 = (byte)i;
        if (parampxx.c != parampxx.b) {
          break;
        }
        throw new eye();
        i = 0;
      }
      byte[] arrayOfByte1 = parampxx.a;
      int i2 = parampxx.c;
      parampxx.c = (i2 + 1);
      arrayOfByte1[i2] = i1;
      parampxx.d = (1 + parampxx.d);
    }
    this.h.a(parampxx);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.a = (0x10 | this.a);
    this.j = paramBoolean;
  }
  
  public final void b(boolean paramBoolean)
  {
    this.a = (0x20 | this.a);
    this.k = paramBoolean;
  }
  
  public final void c(boolean paramBoolean)
  {
    this.a = (0x40 | this.a);
    this.l = paramBoolean;
  }
  
  public final void d(boolean paramBoolean)
  {
    this.a = (0x100 | this.a);
    this.f = paramBoolean;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     koz
 * JD-Core Version:    0.7.0.1
 */