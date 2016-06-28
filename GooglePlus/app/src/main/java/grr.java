public final class grr
  extends pye<grr, pyg>
  implements pzf
{
  public static final grr d = new grr(pyr.c, pxz.b);
  private static volatile pzg e = null;
  private static volatile pzh<grr> f;
  private static final long serialVersionUID;
  public int a;
  public String b;
  public qro c;
  
  /* Error */
  private grr(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 48	pye:<init>	()V
    //   4: aload_0
    //   5: ldc 50
    //   7: putfield 52	grr:b	Ljava/lang/String;
    //   10: iconst_0
    //   11: istore_3
    //   12: iload_3
    //   13: ifne +229 -> 242
    //   16: aload_1
    //   17: invokevirtual 57	pxw:a	()I
    //   20: istore 8
    //   22: iload 8
    //   24: lookupswitch	default:+36->60, 0:+229->253, 10:+51->75, 18:+103->127
    //   61: iload 8
    //   63: aload_1
    //   64: invokevirtual 60	grr:a	(ILpxw;)Z
    //   67: ifne -55 -> 12
    //   70: iconst_1
    //   71: istore_3
    //   72: goto -60 -> 12
    //   75: aload_1
    //   76: invokevirtual 63	pxw:b	()Ljava/lang/String;
    //   79: astore 11
    //   81: aload_0
    //   82: iconst_1
    //   83: aload_0
    //   84: getfield 65	grr:a	I
    //   87: ior
    //   88: putfield 65	grr:a	I
    //   91: aload_0
    //   92: aload 11
    //   94: putfield 52	grr:b	Ljava/lang/String;
    //   97: goto -85 -> 12
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
    //   121: invokevirtual 76	grr:i	()V
    //   124: aload 6
    //   126: athrow
    //   127: iconst_2
    //   128: aload_0
    //   129: getfield 65	grr:a	I
    //   132: iand
    //   133: iconst_2
    //   134: if_icmpne +113 -> 247
    //   137: aload_0
    //   138: getfield 78	grr:c	Lqro;
    //   141: invokevirtual 82	pye:l	()Lpze;
    //   144: checkcast 84	pyg
    //   147: checkcast 84	pyg
    //   150: astore 9
    //   152: aload_0
    //   153: aload_1
    //   154: getstatic 88	qro:a	Lqro;
    //   157: aload_2
    //   158: invokevirtual 91	pxw:a	(Lpye;Lpxz;)Lpye;
    //   161: checkcast 86	qro
    //   164: putfield 78	grr:c	Lqro;
    //   167: aload 9
    //   169: ifnull +28 -> 197
    //   172: aload 9
    //   174: aload_0
    //   175: getfield 78	grr:c	Lqro;
    //   178: invokevirtual 94	pyg:a	(Lpye;)Lpyg;
    //   181: pop
    //   182: aload_0
    //   183: aload 9
    //   185: invokevirtual 97	pyg:e	()Lpzd;
    //   188: checkcast 5	pye
    //   191: checkcast 86	qro
    //   194: putfield 78	grr:c	Lqro;
    //   197: aload_0
    //   198: iconst_2
    //   199: aload_0
    //   200: getfield 65	grr:a	I
    //   203: ior
    //   204: putfield 65	grr:a	I
    //   207: goto -195 -> 12
    //   210: astore 4
    //   212: new 44	pyw
    //   215: dup
    //   216: aload 4
    //   218: invokevirtual 100	java/io/IOException:getMessage	()Ljava/lang/String;
    //   221: invokespecial 103	pyw:<init>	(Ljava/lang/String;)V
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
    //   243: invokevirtual 76	grr:i	()V
    //   246: return
    //   247: aconst_null
    //   248: astore 9
    //   250: goto -98 -> 152
    //   253: iconst_1
    //   254: istore_3
    //   255: goto -243 -> 12
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	258	0	this	grr
    //   0	258	1	parampxw	pxw
    //   0	258	2	parampxz	pxz
    //   11	244	3	i	int
    //   210	7	4	localIOException	java.io.IOException
    //   224	13	5	localpyw1	pyw
    //   118	7	6	localObject	Object
    //   100	13	7	localpyw2	pyw
    //   20	42	8	j	int
    //   150	99	9	localpyg	pyg
    //   79	14	11	str	String
    // Exception table:
    //   from	to	target	type
    //   16	22	100	pyw
    //   60	70	100	pyw
    //   75	97	100	pyw
    //   127	152	100	pyw
    //   152	167	100	pyw
    //   172	197	100	pyw
    //   197	207	100	pyw
    //   16	22	118	finally
    //   60	70	118	finally
    //   75	97	118	finally
    //   102	118	118	finally
    //   127	152	118	finally
    //   152	167	118	finally
    //   172	197	118	finally
    //   197	207	118	finally
    //   212	242	118	finally
    //   16	22	210	java/io/IOException
    //   60	70	210	java/io/IOException
    //   75	97	210	java/io/IOException
    //   127	152	210	java/io/IOException
    //   152	167	210	java/io/IOException
    //   172	197	210	java/io/IOException
    //   197	207	210	java/io/IOException
  }
  
  private qro b()
  {
    if (this.c == null) {
      return qro.a;
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
      k = 0 + pxx.b(1, this.b);
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
    int i = 1;
    switch (grs.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new grr((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new grr(pyr.c, pxz.b);
        return d;
        return null;
        return new pyg();
      } while (paramObject1 == d);
      grr localgrr = (grr)paramObject1;
      int j;
      qro localqro1;
      qro localqro2;
      if ((0x1 & localgrr.a) == i)
      {
        j = i;
        if (j != 0)
        {
          this.a = (0x1 | this.a);
          this.b = localgrr.b;
        }
        if ((0x2 & localgrr.a) != 2) {
          break label285;
        }
        if (i != 0)
        {
          localqro1 = localgrr.b();
          if ((this.c == null) || (this.c == qro.a)) {
            break label291;
          }
          localqro2 = this.c;
        }
      }
      label285:
      label291:
      for (this.c = ((qro)((pyg)((pyg)((pyg)qro.a.l()).a(localqro2)).a(localqro1)).e());; this.c = localqro1)
      {
        this.a = (0x2 | this.a);
        pzs localpzs = localgrr.h;
        this.h = pzs.a(this.h, localpzs);
        return this;
        j = 0;
        break;
        i = 0;
        break label174;
      }
    case 7: 
      label174:
      return d;
    }
    if (f == null) {}
    try
    {
      if (f == null) {
        f = new pxp(d);
      }
      return f;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    if ((0x1 & this.a) == 1)
    {
      String str = this.b;
      parampxx.g(10);
      parampxx.a(str);
    }
    if ((0x2 & this.a) == 2)
    {
      qro localqro = b();
      parampxx.g(18);
      parampxx.a(localqro);
    }
    this.h.a(parampxx);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     grr
 * JD-Core Version:    0.7.0.1
 */