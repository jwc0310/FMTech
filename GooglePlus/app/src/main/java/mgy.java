public final class mgy
  extends pye<mgy, pyg>
  implements pzf
{
  public static final mgy a = new mgy(pyr.c, pxz.b);
  private static volatile pzg d = null;
  private static volatile pzh<mgy> e;
  private static final long serialVersionUID;
  private int b;
  private mgl c;
  
  /* Error */
  private mgy(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 46	pye:<init>	()V
    //   4: iconst_0
    //   5: istore_3
    //   6: iload_3
    //   7: ifne +162 -> 169
    //   10: aload_1
    //   11: invokevirtual 51	pxw:a	()I
    //   14: istore 8
    //   16: iload 8
    //   18: lookupswitch	default:+26->44, 0:+194->212, 10:+41->59
    //   45: iload 8
    //   47: aload_1
    //   48: invokevirtual 54	mgy:a	(ILpxw;)Z
    //   51: ifne -45 -> 6
    //   54: iconst_1
    //   55: istore_3
    //   56: goto -50 -> 6
    //   59: iconst_1
    //   60: aload_0
    //   61: getfield 56	mgy:b	I
    //   64: iand
    //   65: iconst_1
    //   66: if_icmpne +140 -> 206
    //   69: aload_0
    //   70: getfield 58	mgy:c	Lmgl;
    //   73: invokevirtual 62	pye:l	()Lpze;
    //   76: checkcast 64	pyg
    //   79: checkcast 64	pyg
    //   82: astore 9
    //   84: aload_0
    //   85: aload_1
    //   86: getstatic 68	mgl:a	Lmgl;
    //   89: aload_2
    //   90: invokevirtual 71	pxw:a	(Lpye;Lpxz;)Lpye;
    //   93: checkcast 66	mgl
    //   96: putfield 58	mgy:c	Lmgl;
    //   99: aload 9
    //   101: ifnull +28 -> 129
    //   104: aload 9
    //   106: aload_0
    //   107: getfield 58	mgy:c	Lmgl;
    //   110: invokevirtual 74	pyg:a	(Lpye;)Lpyg;
    //   113: pop
    //   114: aload_0
    //   115: aload 9
    //   117: invokevirtual 77	pyg:e	()Lpzd;
    //   120: checkcast 5	pye
    //   123: checkcast 66	mgl
    //   126: putfield 58	mgy:c	Lmgl;
    //   129: aload_0
    //   130: iconst_1
    //   131: aload_0
    //   132: getfield 56	mgy:b	I
    //   135: ior
    //   136: putfield 56	mgy:b	I
    //   139: goto -133 -> 6
    //   142: astore 7
    //   144: aload 7
    //   146: aload_0
    //   147: putfield 80	pyw:a	Lpzd;
    //   150: new 82	java/lang/RuntimeException
    //   153: dup
    //   154: aload 7
    //   156: invokespecial 85	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   159: athrow
    //   160: astore 6
    //   162: aload_0
    //   163: invokevirtual 88	mgy:i	()V
    //   166: aload 6
    //   168: athrow
    //   169: aload_0
    //   170: invokevirtual 88	mgy:i	()V
    //   173: return
    //   174: astore 4
    //   176: new 42	pyw
    //   179: dup
    //   180: aload 4
    //   182: invokevirtual 92	java/io/IOException:getMessage	()Ljava/lang/String;
    //   185: invokespecial 95	pyw:<init>	(Ljava/lang/String;)V
    //   188: astore 5
    //   190: aload 5
    //   192: aload_0
    //   193: putfield 80	pyw:a	Lpzd;
    //   196: new 82	java/lang/RuntimeException
    //   199: dup
    //   200: aload 5
    //   202: invokespecial 85	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   205: athrow
    //   206: aconst_null
    //   207: astore 9
    //   209: goto -125 -> 84
    //   212: iconst_1
    //   213: istore_3
    //   214: goto -208 -> 6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	217	0	this	mgy
    //   0	217	1	parampxw	pxw
    //   0	217	2	parampxz	pxz
    //   5	209	3	i	int
    //   174	7	4	localIOException	java.io.IOException
    //   188	13	5	localpyw1	pyw
    //   160	7	6	localObject	Object
    //   142	13	7	localpyw2	pyw
    //   14	32	8	j	int
    //   82	126	9	localpyg	pyg
    // Exception table:
    //   from	to	target	type
    //   10	16	142	pyw
    //   44	54	142	pyw
    //   59	84	142	pyw
    //   84	99	142	pyw
    //   104	129	142	pyw
    //   129	139	142	pyw
    //   10	16	160	finally
    //   44	54	160	finally
    //   59	84	160	finally
    //   84	99	160	finally
    //   104	129	160	finally
    //   129	139	160	finally
    //   144	160	160	finally
    //   176	206	160	finally
    //   10	16	174	java/io/IOException
    //   44	54	174	java/io/IOException
    //   59	84	174	java/io/IOException
    //   84	99	174	java/io/IOException
    //   104	129	174	java/io/IOException
    //   129	139	174	java/io/IOException
  }
  
  public static pyg a(mgy parammgy)
  {
    return (pyg)((pyg)a.l()).a(parammgy);
  }
  
  private mgl b()
  {
    if (this.c == null) {
      return mgl.a;
    }
    return this.c;
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {
      return i;
    }
    int j = 0x1 & this.b;
    int k = 0;
    if (j == 1) {
      k = 0 + pxx.d(1, b());
    }
    int m = k + this.h.a();
    this.i = m;
    return m;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (mgz.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new mgy((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new mgy(pyr.c, pxz.b);
        return a;
        return null;
        return new pyg(null);
      } while (paramObject1 == a);
      mgy localmgy = (mgy)paramObject1;
      int i;
      mgl localmgl1;
      mgl localmgl2;
      if ((0x1 & localmgy.b) == 1)
      {
        i = 1;
        if (i != 0)
        {
          localmgl1 = localmgy.b();
          if ((this.c == null) || (this.c == mgl.a)) {
            break label245;
          }
          localmgl2 = this.c;
        }
      }
      for (this.c = ((mgl)((pyg)((pyg)((pyg)mgl.a.l()).a(localmgl2)).a(localmgl1)).e());; this.c = localmgl1)
      {
        this.b = (0x1 | this.b);
        pzs localpzs = localmgy.h;
        this.h = pzs.a(this.h, localpzs);
        return this;
        i = 0;
        break;
      }
    case 7: 
      label245:
      return a;
    }
    if (e == null) {}
    try
    {
      if (e == null) {
        e = new pxp(a);
      }
      return e;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    if ((0x1 & this.b) == 1)
    {
      mgl localmgl = b();
      parampxx.g(10);
      parampxx.a(localmgl);
    }
    this.h.a(parampxx);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mgy
 * JD-Core Version:    0.7.0.1
 */