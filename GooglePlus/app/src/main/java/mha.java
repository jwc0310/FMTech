public final class mha
  extends pye<mha, pyg>
  implements pzf
{
  public static final mha e = new mha(pyr.c, pxz.b);
  private static volatile pzg f = null;
  private static volatile pzh<mha> j;
  private static final long serialVersionUID;
  public int a;
  public int b;
  public mhc c;
  public int d;
  private byte g;
  
  /* Error */
  private mha(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 50	pye:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 52	mha:g	B
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield 54	mha:b	I
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield 56	mha:d	I
    //   19: iconst_0
    //   20: istore_3
    //   21: iload_3
    //   22: ifne +253 -> 275
    //   25: aload_1
    //   26: invokevirtual 61	pxw:a	()I
    //   29: istore 8
    //   31: iload 8
    //   33: lookupswitch	default:+43->76, 0:+253->286, 8:+58->91, 18:+106->139, 40:+221->254
    //   77: iload 8
    //   79: aload_1
    //   80: invokevirtual 64	mha:a	(ILpxw;)Z
    //   83: ifne -62 -> 21
    //   86: iconst_1
    //   87: istore_3
    //   88: goto -67 -> 21
    //   91: aload_0
    //   92: iconst_1
    //   93: aload_0
    //   94: getfield 66	mha:a	I
    //   97: ior
    //   98: putfield 66	mha:a	I
    //   101: aload_0
    //   102: aload_1
    //   103: invokevirtual 68	pxw:d	()I
    //   106: putfield 54	mha:b	I
    //   109: goto -88 -> 21
    //   112: astore 7
    //   114: aload 7
    //   116: aload_0
    //   117: putfield 71	pyw:a	Lpzd;
    //   120: new 73	java/lang/RuntimeException
    //   123: dup
    //   124: aload 7
    //   126: invokespecial 76	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   129: athrow
    //   130: astore 6
    //   132: aload_0
    //   133: invokevirtual 79	mha:i	()V
    //   136: aload 6
    //   138: athrow
    //   139: iconst_2
    //   140: aload_0
    //   141: getfield 66	mha:a	I
    //   144: iand
    //   145: iconst_2
    //   146: if_icmpne +134 -> 280
    //   149: aload_0
    //   150: getfield 81	mha:c	Lmhc;
    //   153: invokevirtual 85	pye:l	()Lpze;
    //   156: checkcast 87	pyg
    //   159: checkcast 89	pyh
    //   162: astore 9
    //   164: aload_0
    //   165: aload_1
    //   166: getstatic 93	mhc:a	Lmhc;
    //   169: aload_2
    //   170: invokevirtual 96	pxw:a	(Lpye;Lpxz;)Lpye;
    //   173: checkcast 91	mhc
    //   176: putfield 81	mha:c	Lmhc;
    //   179: aload 9
    //   181: ifnull +28 -> 209
    //   184: aload 9
    //   186: aload_0
    //   187: getfield 81	mha:c	Lmhc;
    //   190: invokevirtual 99	pyh:a	(Lpye;)Lpyg;
    //   193: pop
    //   194: aload_0
    //   195: aload 9
    //   197: invokevirtual 102	pyh:i	()Lpyi;
    //   200: checkcast 104	pyi
    //   203: checkcast 91	mhc
    //   206: putfield 81	mha:c	Lmhc;
    //   209: aload_0
    //   210: iconst_2
    //   211: aload_0
    //   212: getfield 66	mha:a	I
    //   215: ior
    //   216: putfield 66	mha:a	I
    //   219: goto -198 -> 21
    //   222: astore 4
    //   224: new 46	pyw
    //   227: dup
    //   228: aload 4
    //   230: invokevirtual 108	java/io/IOException:getMessage	()Ljava/lang/String;
    //   233: invokespecial 111	pyw:<init>	(Ljava/lang/String;)V
    //   236: astore 5
    //   238: aload 5
    //   240: aload_0
    //   241: putfield 71	pyw:a	Lpzd;
    //   244: new 73	java/lang/RuntimeException
    //   247: dup
    //   248: aload 5
    //   250: invokespecial 76	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   253: athrow
    //   254: aload_0
    //   255: iconst_4
    //   256: aload_0
    //   257: getfield 66	mha:a	I
    //   260: ior
    //   261: putfield 66	mha:a	I
    //   264: aload_0
    //   265: aload_1
    //   266: invokevirtual 68	pxw:d	()I
    //   269: putfield 56	mha:d	I
    //   272: goto -251 -> 21
    //   275: aload_0
    //   276: invokevirtual 79	mha:i	()V
    //   279: return
    //   280: aconst_null
    //   281: astore 9
    //   283: goto -119 -> 164
    //   286: iconst_1
    //   287: istore_3
    //   288: goto -267 -> 21
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	291	0	this	mha
    //   0	291	1	parampxw	pxw
    //   0	291	2	parampxz	pxz
    //   20	268	3	i	int
    //   222	7	4	localIOException	java.io.IOException
    //   236	13	5	localpyw1	pyw
    //   130	7	6	localObject	Object
    //   112	13	7	localpyw2	pyw
    //   29	49	8	k	int
    //   162	120	9	localpyh	pyh
    // Exception table:
    //   from	to	target	type
    //   25	31	112	pyw
    //   76	86	112	pyw
    //   91	109	112	pyw
    //   139	164	112	pyw
    //   164	179	112	pyw
    //   184	209	112	pyw
    //   209	219	112	pyw
    //   254	272	112	pyw
    //   25	31	130	finally
    //   76	86	130	finally
    //   91	109	130	finally
    //   114	130	130	finally
    //   139	164	130	finally
    //   164	179	130	finally
    //   184	209	130	finally
    //   209	219	130	finally
    //   224	254	130	finally
    //   254	272	130	finally
    //   25	31	222	java/io/IOException
    //   76	86	222	java/io/IOException
    //   91	109	222	java/io/IOException
    //   139	164	222	java/io/IOException
    //   164	179	222	java/io/IOException
    //   184	209	222	java/io/IOException
    //   209	219	222	java/io/IOException
    //   254	272	222	java/io/IOException
  }
  
  private mhc b()
  {
    if (this.c == null) {
      return mhc.a;
    }
    return this.c;
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {
      return i;
    }
    int k = 0x1 & this.a;
    int m = 0;
    if (k == 1) {
      m = 0 + pxx.e(1, this.b);
    }
    if ((0x2 & this.a) == 2) {
      m += pxx.d(2, b());
    }
    if ((0x4 & this.a) == 4) {
      m += pxx.e(5, this.d);
    }
    int n = m + this.h.a();
    this.i = n;
    return n;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (mhb.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new mha((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new mha(pyr.c, pxz.b);
        int i2 = this.g;
        if (i2 == 1) {
          return e;
        }
        if (i2 == 0) {
          return null;
        }
        boolean bool = ((Boolean)paramObject1).booleanValue();
        if ((0x2 & this.a) == 2) {}
        for (int i3 = 1; (i3 != 0) && (!b().ao_()); i3 = 0)
        {
          if (bool) {
            this.g = 0;
          }
          return null;
        }
        if (bool) {
          this.g = 1;
        }
        return e;
        return null;
        return new pyg(null);
      } while (paramObject1 == e);
      mha localmha = (mha)paramObject1;
      int i;
      int k;
      mhc localmhc1;
      if ((0x1 & localmha.a) == 1)
      {
        i = 1;
        if (i != 0)
        {
          int i1 = localmha.b;
          this.a = (0x1 | this.a);
          this.b = i1;
        }
        if ((0x2 & localmha.a) != 2) {
          break label420;
        }
        k = 1;
        if (k != 0)
        {
          localmhc1 = localmha.b();
          if ((this.c == null) || (this.c == mhc.a)) {
            break label426;
          }
          mhc localmhc2 = this.c;
          this.c = ((mhc)((pyh)((pyh)((pyh)mhc.a.l()).a(localmhc2)).a(localmhc1)).i());
          this.a = (0x2 | this.a);
        }
        if ((0x4 & localmha.a) != 4) {
          break label435;
        }
      }
      label420:
      label426:
      label435:
      for (int m = 1;; m = 0)
      {
        if (m != 0)
        {
          int n = localmha.d;
          this.a = (0x4 | this.a);
          this.d = n;
        }
        pzs localpzs = localmha.h;
        this.h = pzs.a(this.h, localpzs);
        return this;
        i = 0;
        break;
        k = 0;
        break label264;
        this.c = localmhc1;
        break label340;
      }
    case 7: 
      label264:
      label340:
      return e;
    }
    if (j == null) {}
    try
    {
      if (j == null) {
        j = new pxp(e);
      }
      return j;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    if ((0x1 & this.a) == 1)
    {
      int k = this.b;
      parampxx.g(8);
      parampxx.a(k);
    }
    if ((0x2 & this.a) == 2)
    {
      mhc localmhc = b();
      parampxx.g(18);
      parampxx.a(localmhc);
    }
    if ((0x4 & this.a) == 4)
    {
      int i = this.d;
      parampxx.g(40);
      parampxx.a(i);
    }
    this.h.a(parampxx);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mha
 * JD-Core Version:    0.7.0.1
 */