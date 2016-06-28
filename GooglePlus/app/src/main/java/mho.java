public final class mho
  extends pye<mho, pyg>
  implements pzf
{
  public static final mho d = new mho(pyr.c, pxz.b);
  private static volatile pzg e = null;
  private static volatile pzh<mho> g;
  private static final long serialVersionUID;
  public int a;
  public int b;
  public mhi c;
  private byte f;
  
  /* Error */
  private mho(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 49	pye:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 51	mho:f	B
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield 53	mho:b	I
    //   14: iconst_0
    //   15: istore_3
    //   16: iload_3
    //   17: ifne +225 -> 242
    //   20: aload_1
    //   21: invokevirtual 58	pxw:a	()I
    //   24: istore 8
    //   26: iload 8
    //   28: lookupswitch	default:+36->64, 0:+225->253, 8:+51->79, 18:+99->127
    //   65: iload 8
    //   67: aload_1
    //   68: invokevirtual 61	mho:a	(ILpxw;)Z
    //   71: ifne -55 -> 16
    //   74: iconst_1
    //   75: istore_3
    //   76: goto -60 -> 16
    //   79: aload_0
    //   80: iconst_1
    //   81: aload_0
    //   82: getfield 63	mho:a	I
    //   85: ior
    //   86: putfield 63	mho:a	I
    //   89: aload_0
    //   90: aload_1
    //   91: invokevirtual 65	pxw:d	()I
    //   94: putfield 53	mho:b	I
    //   97: goto -81 -> 16
    //   100: astore 7
    //   102: aload 7
    //   104: aload_0
    //   105: putfield 68	pyw:a	Lpzd;
    //   108: new 70	java/lang/RuntimeException
    //   111: dup
    //   112: aload 7
    //   114: invokespecial 73	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   117: athrow
    //   118: astore 6
    //   120: aload_0
    //   121: invokevirtual 76	mho:i	()V
    //   124: aload 6
    //   126: athrow
    //   127: iconst_2
    //   128: aload_0
    //   129: getfield 63	mho:a	I
    //   132: iand
    //   133: iconst_2
    //   134: if_icmpne +113 -> 247
    //   137: aload_0
    //   138: getfield 78	mho:c	Lmhi;
    //   141: invokevirtual 82	pye:l	()Lpze;
    //   144: checkcast 84	pyg
    //   147: checkcast 86	pyh
    //   150: astore 9
    //   152: aload_0
    //   153: aload_1
    //   154: getstatic 90	mhi:a	Lmhi;
    //   157: aload_2
    //   158: invokevirtual 93	pxw:a	(Lpye;Lpxz;)Lpye;
    //   161: checkcast 88	mhi
    //   164: putfield 78	mho:c	Lmhi;
    //   167: aload 9
    //   169: ifnull +28 -> 197
    //   172: aload 9
    //   174: aload_0
    //   175: getfield 78	mho:c	Lmhi;
    //   178: invokevirtual 96	pyh:a	(Lpye;)Lpyg;
    //   181: pop
    //   182: aload_0
    //   183: aload 9
    //   185: invokevirtual 99	pyh:i	()Lpyi;
    //   188: checkcast 101	pyi
    //   191: checkcast 88	mhi
    //   194: putfield 78	mho:c	Lmhi;
    //   197: aload_0
    //   198: iconst_2
    //   199: aload_0
    //   200: getfield 63	mho:a	I
    //   203: ior
    //   204: putfield 63	mho:a	I
    //   207: goto -191 -> 16
    //   210: astore 4
    //   212: new 45	pyw
    //   215: dup
    //   216: aload 4
    //   218: invokevirtual 105	java/io/IOException:getMessage	()Ljava/lang/String;
    //   221: invokespecial 108	pyw:<init>	(Ljava/lang/String;)V
    //   224: astore 5
    //   226: aload 5
    //   228: aload_0
    //   229: putfield 68	pyw:a	Lpzd;
    //   232: new 70	java/lang/RuntimeException
    //   235: dup
    //   236: aload 5
    //   238: invokespecial 73	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   241: athrow
    //   242: aload_0
    //   243: invokevirtual 76	mho:i	()V
    //   246: return
    //   247: aconst_null
    //   248: astore 9
    //   250: goto -98 -> 152
    //   253: iconst_1
    //   254: istore_3
    //   255: goto -239 -> 16
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	258	0	this	mho
    //   0	258	1	parampxw	pxw
    //   0	258	2	parampxz	pxz
    //   15	240	3	i	int
    //   210	7	4	localIOException	java.io.IOException
    //   224	13	5	localpyw1	pyw
    //   118	7	6	localObject	Object
    //   100	13	7	localpyw2	pyw
    //   24	42	8	j	int
    //   150	99	9	localpyh	pyh
    // Exception table:
    //   from	to	target	type
    //   20	26	100	pyw
    //   64	74	100	pyw
    //   79	97	100	pyw
    //   127	152	100	pyw
    //   152	167	100	pyw
    //   172	197	100	pyw
    //   197	207	100	pyw
    //   20	26	118	finally
    //   64	74	118	finally
    //   79	97	118	finally
    //   102	118	118	finally
    //   127	152	118	finally
    //   152	167	118	finally
    //   172	197	118	finally
    //   197	207	118	finally
    //   212	242	118	finally
    //   20	26	210	java/io/IOException
    //   64	74	210	java/io/IOException
    //   79	97	210	java/io/IOException
    //   127	152	210	java/io/IOException
    //   152	167	210	java/io/IOException
    //   172	197	210	java/io/IOException
    //   197	207	210	java/io/IOException
  }
  
  private mhi b()
  {
    if (this.c == null) {
      return mhi.a;
    }
    return this.c;
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {
      return i;
    }
    int j = 0x1 & this.a;
    int k = 0;
    if (j == 1) {
      k = 0 + pxx.e(1, this.b);
    }
    if ((0x2 & this.a) == 2) {
      k += pxx.d(2, b());
    }
    int m = k + this.h.a();
    this.i = m;
    return m;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (mhp.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new mho((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new mho(pyr.c, pxz.b);
        int m = this.f;
        if (m == 1) {
          return d;
        }
        if (m == 0) {
          return null;
        }
        boolean bool = ((Boolean)paramObject1).booleanValue();
        if ((0x2 & this.a) == 2) {}
        for (int n = 1; (n != 0) && (!b().ao_()); n = 0)
        {
          if (bool) {
            this.f = 0;
          }
          return null;
        }
        if (bool) {
          this.f = 1;
        }
        return d;
        return null;
        return new pyg(null);
      } while (paramObject1 == d);
      mho localmho = (mho)paramObject1;
      int i;
      int j;
      mhi localmhi1;
      mhi localmhi2;
      if ((0x1 & localmho.a) == 1)
      {
        i = 1;
        if (i != 0)
        {
          int k = localmho.b;
          this.a = (0x1 | this.a);
          this.b = k;
        }
        if ((0x2 & localmho.a) != 2) {
          break label378;
        }
        j = 1;
        if (j != 0)
        {
          localmhi1 = localmho.b();
          if ((this.c == null) || (this.c == mhi.a)) {
            break label384;
          }
          localmhi2 = this.c;
        }
      }
      label384:
      for (this.c = ((mhi)((pyh)((pyh)((pyh)mhi.a.l()).a(localmhi2)).a(localmhi1)).i());; this.c = localmhi1)
      {
        this.a = (0x2 | this.a);
        pzs localpzs = localmho.h;
        this.h = pzs.a(this.h, localpzs);
        return this;
        i = 0;
        break;
        j = 0;
        break label264;
      }
    case 7: 
      label264:
      label378:
      return d;
    }
    if (g == null) {}
    try
    {
      if (g == null) {
        g = new pxp(d);
      }
      return g;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    if ((0x1 & this.a) == 1)
    {
      int i = this.b;
      parampxx.g(8);
      parampxx.a(i);
    }
    if ((0x2 & this.a) == 2)
    {
      mhi localmhi = b();
      parampxx.g(18);
      parampxx.a(localmhi);
    }
    this.h.a(parampxx);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mho
 * JD-Core Version:    0.7.0.1
 */