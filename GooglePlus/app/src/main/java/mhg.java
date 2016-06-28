public final class mhg
  extends pye<mhg, pyg>
  implements pzf
{
  public static final mhg b = new mhg(pyr.c, pxz.b);
  private static volatile pzg e = null;
  private static volatile pzh<mhg> g;
  private static final long serialVersionUID;
  public int a;
  private mhe c;
  private pks d;
  private byte f;
  
  /* Error */
  private mhg(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 50	pye:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 52	mhg:f	B
    //   9: iconst_0
    //   10: istore_3
    //   11: iload_3
    //   12: ifne +284 -> 296
    //   15: aload_1
    //   16: invokevirtual 57	pxw:a	()I
    //   19: istore 8
    //   21: iload 8
    //   23: lookupswitch	default:+33->56, 0:+290->313, 10:+48->71, 18:+158->181
    //   57: iload 8
    //   59: aload_1
    //   60: invokevirtual 60	mhg:a	(ILpxw;)Z
    //   63: ifne -52 -> 11
    //   66: iconst_1
    //   67: istore_3
    //   68: goto -57 -> 11
    //   71: iconst_1
    //   72: aload_0
    //   73: getfield 62	mhg:a	I
    //   76: iand
    //   77: iconst_1
    //   78: if_icmpne +229 -> 307
    //   81: aload_0
    //   82: getfield 64	mhg:c	Lmhe;
    //   85: invokevirtual 68	pye:l	()Lpze;
    //   88: checkcast 70	pyg
    //   91: checkcast 72	pyh
    //   94: astore 11
    //   96: aload_0
    //   97: aload_1
    //   98: getstatic 76	mhe:a	Lmhe;
    //   101: aload_2
    //   102: invokevirtual 79	pxw:a	(Lpye;Lpxz;)Lpye;
    //   105: checkcast 74	mhe
    //   108: putfield 64	mhg:c	Lmhe;
    //   111: aload 11
    //   113: ifnull +28 -> 141
    //   116: aload 11
    //   118: aload_0
    //   119: getfield 64	mhg:c	Lmhe;
    //   122: invokevirtual 82	pyh:a	(Lpye;)Lpyg;
    //   125: pop
    //   126: aload_0
    //   127: aload 11
    //   129: invokevirtual 86	pyh:i	()Lpyi;
    //   132: checkcast 88	pyi
    //   135: checkcast 74	mhe
    //   138: putfield 64	mhg:c	Lmhe;
    //   141: aload_0
    //   142: iconst_1
    //   143: aload_0
    //   144: getfield 62	mhg:a	I
    //   147: ior
    //   148: putfield 62	mhg:a	I
    //   151: goto -140 -> 11
    //   154: astore 7
    //   156: aload 7
    //   158: aload_0
    //   159: putfield 91	pyw:a	Lpzd;
    //   162: new 93	java/lang/RuntimeException
    //   165: dup
    //   166: aload 7
    //   168: invokespecial 96	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   171: athrow
    //   172: astore 6
    //   174: aload_0
    //   175: invokevirtual 98	mhg:i	()V
    //   178: aload 6
    //   180: athrow
    //   181: iconst_2
    //   182: aload_0
    //   183: getfield 62	mhg:a	I
    //   186: iand
    //   187: iconst_2
    //   188: if_icmpne +113 -> 301
    //   191: aload_0
    //   192: getfield 100	mhg:d	Lpks;
    //   195: invokevirtual 68	pye:l	()Lpze;
    //   198: checkcast 70	pyg
    //   201: checkcast 70	pyg
    //   204: astore 9
    //   206: aload_0
    //   207: aload_1
    //   208: getstatic 104	pks:c	Lpks;
    //   211: aload_2
    //   212: invokevirtual 79	pxw:a	(Lpye;Lpxz;)Lpye;
    //   215: checkcast 102	pks
    //   218: putfield 100	mhg:d	Lpks;
    //   221: aload 9
    //   223: ifnull +28 -> 251
    //   226: aload 9
    //   228: aload_0
    //   229: getfield 100	mhg:d	Lpks;
    //   232: invokevirtual 105	pyg:a	(Lpye;)Lpyg;
    //   235: pop
    //   236: aload_0
    //   237: aload 9
    //   239: invokevirtual 108	pyg:e	()Lpzd;
    //   242: checkcast 5	pye
    //   245: checkcast 102	pks
    //   248: putfield 100	mhg:d	Lpks;
    //   251: aload_0
    //   252: iconst_2
    //   253: aload_0
    //   254: getfield 62	mhg:a	I
    //   257: ior
    //   258: putfield 62	mhg:a	I
    //   261: goto -250 -> 11
    //   264: astore 4
    //   266: new 46	pyw
    //   269: dup
    //   270: aload 4
    //   272: invokevirtual 112	java/io/IOException:getMessage	()Ljava/lang/String;
    //   275: invokespecial 115	pyw:<init>	(Ljava/lang/String;)V
    //   278: astore 5
    //   280: aload 5
    //   282: aload_0
    //   283: putfield 91	pyw:a	Lpzd;
    //   286: new 93	java/lang/RuntimeException
    //   289: dup
    //   290: aload 5
    //   292: invokespecial 96	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   295: athrow
    //   296: aload_0
    //   297: invokevirtual 98	mhg:i	()V
    //   300: return
    //   301: aconst_null
    //   302: astore 9
    //   304: goto -98 -> 206
    //   307: aconst_null
    //   308: astore 11
    //   310: goto -214 -> 96
    //   313: iconst_1
    //   314: istore_3
    //   315: goto -304 -> 11
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	318	0	this	mhg
    //   0	318	1	parampxw	pxw
    //   0	318	2	parampxz	pxz
    //   10	305	3	i	int
    //   264	7	4	localIOException	java.io.IOException
    //   278	13	5	localpyw1	pyw
    //   172	7	6	localObject	Object
    //   154	13	7	localpyw2	pyw
    //   19	39	8	j	int
    //   204	99	9	localpyg	pyg
    //   94	215	11	localpyh	pyh
    // Exception table:
    //   from	to	target	type
    //   15	21	154	pyw
    //   56	66	154	pyw
    //   71	96	154	pyw
    //   96	111	154	pyw
    //   116	141	154	pyw
    //   141	151	154	pyw
    //   181	206	154	pyw
    //   206	221	154	pyw
    //   226	251	154	pyw
    //   251	261	154	pyw
    //   15	21	172	finally
    //   56	66	172	finally
    //   71	96	172	finally
    //   96	111	172	finally
    //   116	141	172	finally
    //   141	151	172	finally
    //   156	172	172	finally
    //   181	206	172	finally
    //   206	221	172	finally
    //   226	251	172	finally
    //   251	261	172	finally
    //   266	296	172	finally
    //   15	21	264	java/io/IOException
    //   56	66	264	java/io/IOException
    //   71	96	264	java/io/IOException
    //   96	111	264	java/io/IOException
    //   116	141	264	java/io/IOException
    //   141	151	264	java/io/IOException
    //   181	206	264	java/io/IOException
    //   206	221	264	java/io/IOException
    //   226	251	264	java/io/IOException
    //   251	261	264	java/io/IOException
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
      k = 0 + pxx.d(1, b());
    }
    if ((0x2 & this.a) == 2) {
      k += pxx.d(2, c());
    }
    int m = k + this.h.a();
    this.i = m;
    return m;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (mhh.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new mhg((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new mhg(pyr.c, pxz.b);
        int k = this.f;
        if (k == 1) {
          return b;
        }
        if (k == 0) {
          return null;
        }
        boolean bool = ((Boolean)paramObject1).booleanValue();
        if ((0x1 & this.a) == 1) {}
        for (int m = 1; (m != 0) && (!b().ao_()); m = 0)
        {
          if (bool) {
            this.f = 0;
          }
          return null;
        }
        if ((0x2 & this.a) == 2) {}
        for (int n = 1; (n != 0) && (!c().ao_()); n = 0)
        {
          if (bool) {
            this.f = 0;
          }
          return null;
        }
        if (bool) {
          this.f = 1;
        }
        return b;
        return null;
        return new pyg(null);
      } while (paramObject1 == b);
      mhg localmhg = (mhg)paramObject1;
      int i;
      mhe localmhe1;
      int j;
      pks localpks;
      if ((0x1 & localmhg.a) == 1)
      {
        i = 1;
        if (i != 0)
        {
          localmhe1 = localmhg.b();
          if ((this.c == null) || (this.c == mhe.a)) {
            break label463;
          }
          mhe localmhe2 = this.c;
          this.c = ((mhe)((pyh)((pyh)((pyh)mhe.a.l()).a(localmhe2)).a(localmhe1)).i());
          this.a = (0x1 | this.a);
        }
        if ((0x2 & localmhg.a) != 2) {
          break label472;
        }
        j = 1;
        if (j != 0)
        {
          localpks = localmhg.c();
          if ((this.d == null) || (this.d == pks.c)) {
            break label478;
          }
        }
      }
      label463:
      label472:
      label478:
      for (this.d = ((pks)((pyg)pks.a(this.d).a(localpks)).e());; this.d = localpks)
      {
        this.a = (0x2 | this.a);
        pzs localpzs = localmhg.h;
        this.h = pzs.a(this.h, localpzs);
        return this;
        i = 0;
        break;
        this.c = localmhe1;
        break label344;
        j = 0;
        break label368;
      }
    case 7: 
      label344:
      label368:
      return b;
    }
    if (g == null) {}
    try
    {
      if (g == null) {
        g = new pxp(b);
      }
      return g;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    if ((0x1 & this.a) == 1)
    {
      mhe localmhe = b();
      parampxx.g(10);
      parampxx.a(localmhe);
    }
    if ((0x2 & this.a) == 2)
    {
      pks localpks = c();
      parampxx.g(18);
      parampxx.a(localpks);
    }
    this.h.a(parampxx);
  }
  
  public final mhe b()
  {
    if (this.c == null) {
      return mhe.a;
    }
    return this.c;
  }
  
  public final pks c()
  {
    if (this.d == null) {
      return pks.c;
    }
    return this.d;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mhg
 * JD-Core Version:    0.7.0.1
 */