public final class mgl
  extends pye<mgl, pyg>
  implements pzf
{
  public static final mgl a;
  private static volatile pzg e = null;
  private static volatile pzh<mgl> f;
  private static final long serialVersionUID;
  private int b;
  private String c;
  private int d;
  
  static
  {
    pxw localpxw = pyr.c;
    a = new mgl(localpxw);
  }
  
  /* Error */
  private mgl(pxw parampxw)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: invokespecial 47	pye:<init>	()V
    //   6: aload_0
    //   7: ldc 49
    //   9: putfield 51	mgl:c	Ljava/lang/String;
    //   12: aload_0
    //   13: iconst_0
    //   14: putfield 53	mgl:d	I
    //   17: iload_2
    //   18: ifne +164 -> 182
    //   21: aload_1
    //   22: invokevirtual 58	pxw:a	()I
    //   25: istore 7
    //   27: iload 7
    //   29: lookupswitch	default:+35->64, 0:+158->187, 10:+50->79, 16:+102->131
    //   65: iload 7
    //   67: aload_1
    //   68: invokevirtual 61	mgl:a	(ILpxw;)Z
    //   71: ifne -54 -> 17
    //   74: iconst_1
    //   75: istore_2
    //   76: goto -59 -> 17
    //   79: aload_1
    //   80: invokevirtual 64	pxw:b	()Ljava/lang/String;
    //   83: astore 8
    //   85: aload_0
    //   86: iconst_1
    //   87: aload_0
    //   88: getfield 66	mgl:b	I
    //   91: ior
    //   92: putfield 66	mgl:b	I
    //   95: aload_0
    //   96: aload 8
    //   98: putfield 51	mgl:c	Ljava/lang/String;
    //   101: goto -84 -> 17
    //   104: astore 6
    //   106: aload 6
    //   108: aload_0
    //   109: putfield 69	pyw:a	Lpzd;
    //   112: new 71	java/lang/RuntimeException
    //   115: dup
    //   116: aload 6
    //   118: invokespecial 74	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   121: athrow
    //   122: astore 5
    //   124: aload_0
    //   125: invokevirtual 77	mgl:i	()V
    //   128: aload 5
    //   130: athrow
    //   131: aload_0
    //   132: iconst_2
    //   133: aload_0
    //   134: getfield 66	mgl:b	I
    //   137: ior
    //   138: putfield 66	mgl:b	I
    //   141: aload_0
    //   142: aload_1
    //   143: invokevirtual 79	pxw:d	()I
    //   146: putfield 53	mgl:d	I
    //   149: goto -132 -> 17
    //   152: astore_3
    //   153: new 43	pyw
    //   156: dup
    //   157: aload_3
    //   158: invokevirtual 82	java/io/IOException:getMessage	()Ljava/lang/String;
    //   161: invokespecial 85	pyw:<init>	(Ljava/lang/String;)V
    //   164: astore 4
    //   166: aload 4
    //   168: aload_0
    //   169: putfield 69	pyw:a	Lpzd;
    //   172: new 71	java/lang/RuntimeException
    //   175: dup
    //   176: aload 4
    //   178: invokespecial 74	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   181: athrow
    //   182: aload_0
    //   183: invokevirtual 77	mgl:i	()V
    //   186: return
    //   187: iconst_1
    //   188: istore_2
    //   189: goto -172 -> 17
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	192	0	this	mgl
    //   0	192	1	parampxw	pxw
    //   1	188	2	i	int
    //   152	6	3	localIOException	java.io.IOException
    //   164	13	4	localpyw1	pyw
    //   122	7	5	localObject	Object
    //   104	13	6	localpyw2	pyw
    //   25	41	7	j	int
    //   83	14	8	str	String
    // Exception table:
    //   from	to	target	type
    //   21	27	104	pyw
    //   64	74	104	pyw
    //   79	101	104	pyw
    //   131	149	104	pyw
    //   21	27	122	finally
    //   64	74	122	finally
    //   79	101	122	finally
    //   106	122	122	finally
    //   131	149	122	finally
    //   153	182	122	finally
    //   21	27	152	java/io/IOException
    //   64	74	152	java/io/IOException
    //   79	101	152	java/io/IOException
    //   131	149	152	java/io/IOException
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
      k = 0 + pxx.b(1, this.c);
    }
    if ((0x2 & this.b) == 2) {
      k += pxx.e(2, this.d);
    }
    int m = k + this.h.a();
    this.i = m;
    return m;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    int i = 1;
    switch (mgm.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new mgl((pxw)paramObject1);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        pxw localpxw = pyr.c;
        return new mgl(localpxw);
        return a;
        return null;
        return new pyg(0);
      } while (paramObject1 == a);
      mgl localmgl = (mgl)paramObject1;
      int j;
      if ((0x1 & localmgl.b) == i)
      {
        j = i;
        if (j != 0)
        {
          this.b = (0x1 | this.b);
          this.c = localmgl.c;
        }
        if ((0x2 & localmgl.b) != 2) {
          break label232;
        }
      }
      for (;;)
      {
        if (i != 0)
        {
          int k = localmgl.d;
          this.b = (0x2 | this.b);
          this.d = k;
        }
        pzs localpzs = localmgl.h;
        this.h = pzs.a(this.h, localpzs);
        return this;
        j = 0;
        break;
        i = 0;
      }
    case 7: 
      label232:
      return a;
    }
    if (f == null) {}
    try
    {
      if (f == null) {
        f = new pxp(a);
      }
      return f;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    if ((0x1 & this.b) == 1)
    {
      String str = this.c;
      parampxx.g(10);
      parampxx.a(str);
    }
    if ((0x2 & this.b) == 2)
    {
      int i = this.d;
      parampxx.g(16);
      parampxx.a(i);
    }
    this.h.a(parampxx);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mgl
 * JD-Core Version:    0.7.0.1
 */