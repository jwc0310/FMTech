public final class mgw
  extends pye<mgw, pyg>
  implements pzf
{
  public static final mgw c;
  private static volatile pzg f = null;
  private static volatile pzh<mgw> g;
  private static final long serialVersionUID;
  public int a;
  public String b;
  private String d;
  private int e;
  
  static
  {
    pxw localpxw = pyr.c;
    c = new mgw(localpxw);
  }
  
  /* Error */
  private mgw(pxw parampxw)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 48	pye:<init>	()V
    //   4: aload_0
    //   5: ldc 50
    //   7: putfield 52	mgw:b	Ljava/lang/String;
    //   10: aload_0
    //   11: ldc 50
    //   13: putfield 54	mgw:d	Ljava/lang/String;
    //   16: aload_0
    //   17: iconst_3
    //   18: putfield 56	mgw:e	I
    //   21: iconst_0
    //   22: istore_2
    //   23: iload_2
    //   24: ifne +263 -> 287
    //   27: aload_1
    //   28: invokevirtual 61	pxw:a	()I
    //   31: istore 7
    //   33: iload 7
    //   35: lookupswitch	default:+41->76, 0:+257->292, 10:+56->91, 18:+108->143, 24:+163->198
    //   77: iload 7
    //   79: aload_1
    //   80: invokevirtual 64	mgw:a	(ILpxw;)Z
    //   83: ifne -60 -> 23
    //   86: iconst_1
    //   87: istore_2
    //   88: goto -65 -> 23
    //   91: aload_1
    //   92: invokevirtual 67	pxw:b	()Ljava/lang/String;
    //   95: astore 11
    //   97: aload_0
    //   98: iconst_1
    //   99: aload_0
    //   100: getfield 69	mgw:a	I
    //   103: ior
    //   104: putfield 69	mgw:a	I
    //   107: aload_0
    //   108: aload 11
    //   110: putfield 52	mgw:b	Ljava/lang/String;
    //   113: goto -90 -> 23
    //   116: astore 6
    //   118: aload 6
    //   120: aload_0
    //   121: putfield 72	pyw:a	Lpzd;
    //   124: new 74	java/lang/RuntimeException
    //   127: dup
    //   128: aload 6
    //   130: invokespecial 77	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   133: athrow
    //   134: astore 5
    //   136: aload_0
    //   137: invokevirtual 80	mgw:i	()V
    //   140: aload 5
    //   142: athrow
    //   143: aload_1
    //   144: invokevirtual 67	pxw:b	()Ljava/lang/String;
    //   147: astore 10
    //   149: aload_0
    //   150: iconst_2
    //   151: aload_0
    //   152: getfield 69	mgw:a	I
    //   155: ior
    //   156: putfield 69	mgw:a	I
    //   159: aload_0
    //   160: aload 10
    //   162: putfield 54	mgw:d	Ljava/lang/String;
    //   165: goto -142 -> 23
    //   168: astore_3
    //   169: new 44	pyw
    //   172: dup
    //   173: aload_3
    //   174: invokevirtual 83	java/io/IOException:getMessage	()Ljava/lang/String;
    //   177: invokespecial 86	pyw:<init>	(Ljava/lang/String;)V
    //   180: astore 4
    //   182: aload 4
    //   184: aload_0
    //   185: putfield 72	pyw:a	Lpzd;
    //   188: new 74	java/lang/RuntimeException
    //   191: dup
    //   192: aload 4
    //   194: invokespecial 77	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   197: athrow
    //   198: aload_1
    //   199: invokevirtual 88	pxw:d	()I
    //   202: istore 8
    //   204: iload 8
    //   206: invokestatic 93	pkm:a	(I)Lpkm;
    //   209: ifnonnull +59 -> 268
    //   212: aload_0
    //   213: getfield 97	pye:h	Lpzs;
    //   216: ifnonnull +14 -> 230
    //   219: aload_0
    //   220: new 99	pzs
    //   223: dup
    //   224: invokespecial 100	pzs:<init>	()V
    //   227: putfield 97	pye:h	Lpzs;
    //   230: aload_0
    //   231: getfield 97	pye:h	Lpzs;
    //   234: astore 9
    //   236: aload 9
    //   238: getfield 103	pzs:b	Z
    //   241: ifne +11 -> 252
    //   244: new 105	java/lang/UnsupportedOperationException
    //   247: dup
    //   248: invokespecial 106	java/lang/UnsupportedOperationException:<init>	()V
    //   251: athrow
    //   252: aload 9
    //   254: bipush 24
    //   256: iload 8
    //   258: i2l
    //   259: invokestatic 112	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   262: invokevirtual 115	pzs:a	(ILjava/lang/Object;)V
    //   265: goto -242 -> 23
    //   268: aload_0
    //   269: iconst_4
    //   270: aload_0
    //   271: getfield 69	mgw:a	I
    //   274: ior
    //   275: putfield 69	mgw:a	I
    //   278: aload_0
    //   279: iload 8
    //   281: putfield 56	mgw:e	I
    //   284: goto -261 -> 23
    //   287: aload_0
    //   288: invokevirtual 80	mgw:i	()V
    //   291: return
    //   292: iconst_1
    //   293: istore_2
    //   294: goto -271 -> 23
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	297	0	this	mgw
    //   0	297	1	parampxw	pxw
    //   22	272	2	i	int
    //   168	6	3	localIOException	java.io.IOException
    //   180	13	4	localpyw1	pyw
    //   134	7	5	localObject	Object
    //   116	13	6	localpyw2	pyw
    //   31	47	7	j	int
    //   202	78	8	k	int
    //   234	19	9	localpzs	pzs
    //   147	14	10	str1	String
    //   95	14	11	str2	String
    // Exception table:
    //   from	to	target	type
    //   27	33	116	pyw
    //   76	86	116	pyw
    //   91	113	116	pyw
    //   143	165	116	pyw
    //   198	230	116	pyw
    //   230	252	116	pyw
    //   252	265	116	pyw
    //   268	284	116	pyw
    //   27	33	134	finally
    //   76	86	134	finally
    //   91	113	134	finally
    //   118	134	134	finally
    //   143	165	134	finally
    //   169	198	134	finally
    //   198	230	134	finally
    //   230	252	134	finally
    //   252	265	134	finally
    //   268	284	134	finally
    //   27	33	168	java/io/IOException
    //   76	86	168	java/io/IOException
    //   91	113	168	java/io/IOException
    //   143	165	168	java/io/IOException
    //   198	230	168	java/io/IOException
    //   230	252	168	java/io/IOException
    //   252	265	168	java/io/IOException
    //   268	284	168	java/io/IOException
  }
  
  public static pyg a(mgw parammgw)
  {
    return (pyg)((pyg)c.l()).a(parammgw);
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
      k = 0 + pxx.b(1, this.b);
    }
    if ((0x2 & this.a) == 2) {
      k += pxx.b(2, this.d);
    }
    if ((0x4 & this.a) == 4) {
      k += pxx.h(3, this.e);
    }
    int m = k + this.h.a();
    this.i = m;
    return m;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (mgx.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new mgw((pxw)paramObject1);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        pxw localpxw = pyr.c;
        return new mgw(localpxw);
        return c;
        return null;
        return new pyg(null);
      } while (paramObject1 == c);
      mgw localmgw = (mgw)paramObject1;
      int i;
      int j;
      int k;
      if ((0x1 & localmgw.a) == 1)
      {
        i = 1;
        if (i != 0)
        {
          this.a = (0x1 | this.a);
          this.b = localmgw.b;
        }
        if ((0x2 & localmgw.a) != 2) {
          break label255;
        }
        j = 1;
        if (j != 0)
        {
          this.a = (0x2 | this.a);
          this.d = localmgw.d;
        }
        if ((0x4 & localmgw.a) != 4) {
          break label261;
        }
        k = 1;
      }
      for (;;)
      {
        if (k != 0)
        {
          pkm localpkm = pkm.a(localmgw.e);
          if (localpkm == null) {
            localpkm = pkm.a;
          }
          if (localpkm == null)
          {
            throw new NullPointerException();
            i = 0;
            break;
            j = 0;
            break label173;
            label261:
            k = 0;
            continue;
          }
          this.a = (0x4 | this.a);
          this.e = localpkm.d;
        }
      }
      pzs localpzs = localmgw.h;
      this.h = pzs.a(this.h, localpzs);
      return this;
    case 7: 
      label173:
      label255:
      return c;
    }
    if (g == null) {}
    try
    {
      if (g == null) {
        g = new pxp(c);
      }
      return g;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    if ((0x1 & this.a) == 1)
    {
      String str2 = this.b;
      parampxx.g(10);
      parampxx.a(str2);
    }
    if ((0x2 & this.a) == 2)
    {
      String str1 = this.d;
      parampxx.g(18);
      parampxx.a(str1);
    }
    if ((0x4 & this.a) == 4)
    {
      int i = this.e;
      parampxx.g(24);
      parampxx.a(i);
    }
    this.h.a(parampxx);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mgw
 * JD-Core Version:    0.7.0.1
 */