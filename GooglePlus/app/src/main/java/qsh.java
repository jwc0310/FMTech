public final class qsh
  extends pye<qsh, pyg>
  implements pzf
{
  public static final qsh a = new qsh(pyr.c, pxz.b);
  public static final pyl<mhe, qsh> b = pye.a(mhe.a, a, a, null, 96372017, pzw.k, qsh.class);
  private static volatile pzg j = null;
  private static volatile pzh<qsh> l;
  private static final long serialVersionUID;
  private int c;
  private qsr d;
  private qqd e;
  private rbr f;
  private String g;
  private byte k;
  
  /* Error */
  private qsh(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 73	pye:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 75	qsh:k	B
    //   9: aload_0
    //   10: ldc 77
    //   12: putfield 79	qsh:g	Ljava/lang/String;
    //   15: iconst_0
    //   16: istore_3
    //   17: iload_3
    //   18: ifne +411 -> 429
    //   21: aload_1
    //   22: invokevirtual 84	pxw:a	()I
    //   25: istore 8
    //   27: iload 8
    //   29: lookupswitch	default:+51->80, 0:+423->452, 10:+66->95, 18:+176->205, 26:+234->263, 34:+317->346
    //   81: iload 8
    //   83: aload_1
    //   84: invokevirtual 87	qsh:a	(ILpxw;)Z
    //   87: ifne -70 -> 17
    //   90: iconst_1
    //   91: istore_3
    //   92: goto -75 -> 17
    //   95: iconst_1
    //   96: aload_0
    //   97: getfield 89	qsh:c	I
    //   100: iand
    //   101: iconst_1
    //   102: if_icmpne +344 -> 446
    //   105: aload_0
    //   106: getfield 91	qsh:d	Lqsr;
    //   109: invokevirtual 94	pye:l	()Lpze;
    //   112: checkcast 96	pyg
    //   115: checkcast 96	pyg
    //   118: astore 14
    //   120: aload_0
    //   121: aload_1
    //   122: getstatic 100	qsr:a	Lqsr;
    //   125: aload_2
    //   126: invokevirtual 103	pxw:a	(Lpye;Lpxz;)Lpye;
    //   129: checkcast 98	qsr
    //   132: putfield 91	qsh:d	Lqsr;
    //   135: aload 14
    //   137: ifnull +28 -> 165
    //   140: aload 14
    //   142: aload_0
    //   143: getfield 91	qsh:d	Lqsr;
    //   146: invokevirtual 106	pyg:a	(Lpye;)Lpyg;
    //   149: pop
    //   150: aload_0
    //   151: aload 14
    //   153: invokevirtual 109	pyg:e	()Lpzd;
    //   156: checkcast 5	pye
    //   159: checkcast 98	qsr
    //   162: putfield 91	qsh:d	Lqsr;
    //   165: aload_0
    //   166: iconst_1
    //   167: aload_0
    //   168: getfield 89	qsh:c	I
    //   171: ior
    //   172: putfield 89	qsh:c	I
    //   175: goto -158 -> 17
    //   178: astore 7
    //   180: aload 7
    //   182: aload_0
    //   183: putfield 112	pyw:a	Lpzd;
    //   186: new 114	java/lang/RuntimeException
    //   189: dup
    //   190: aload 7
    //   192: invokespecial 117	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   195: athrow
    //   196: astore 6
    //   198: aload_0
    //   199: invokevirtual 120	qsh:i	()V
    //   202: aload 6
    //   204: athrow
    //   205: aload_1
    //   206: invokevirtual 123	pxw:b	()Ljava/lang/String;
    //   209: astore 13
    //   211: aload_0
    //   212: bipush 8
    //   214: aload_0
    //   215: getfield 89	qsh:c	I
    //   218: ior
    //   219: putfield 89	qsh:c	I
    //   222: aload_0
    //   223: aload 13
    //   225: putfield 79	qsh:g	Ljava/lang/String;
    //   228: goto -211 -> 17
    //   231: astore 4
    //   233: new 69	pyw
    //   236: dup
    //   237: aload 4
    //   239: invokevirtual 126	java/io/IOException:getMessage	()Ljava/lang/String;
    //   242: invokespecial 129	pyw:<init>	(Ljava/lang/String;)V
    //   245: astore 5
    //   247: aload 5
    //   249: aload_0
    //   250: putfield 112	pyw:a	Lpzd;
    //   253: new 114	java/lang/RuntimeException
    //   256: dup
    //   257: aload 5
    //   259: invokespecial 117	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   262: athrow
    //   263: iconst_4
    //   264: aload_0
    //   265: getfield 89	qsh:c	I
    //   268: iand
    //   269: iconst_4
    //   270: if_icmpne +170 -> 440
    //   273: aload_0
    //   274: getfield 131	qsh:f	Lrbr;
    //   277: invokevirtual 94	pye:l	()Lpze;
    //   280: checkcast 96	pyg
    //   283: checkcast 96	pyg
    //   286: astore 11
    //   288: aload_0
    //   289: aload_1
    //   290: getstatic 135	rbr:b	Lrbr;
    //   293: aload_2
    //   294: invokevirtual 103	pxw:a	(Lpye;Lpxz;)Lpye;
    //   297: checkcast 133	rbr
    //   300: putfield 131	qsh:f	Lrbr;
    //   303: aload 11
    //   305: ifnull +28 -> 333
    //   308: aload 11
    //   310: aload_0
    //   311: getfield 131	qsh:f	Lrbr;
    //   314: invokevirtual 106	pyg:a	(Lpye;)Lpyg;
    //   317: pop
    //   318: aload_0
    //   319: aload 11
    //   321: invokevirtual 109	pyg:e	()Lpzd;
    //   324: checkcast 5	pye
    //   327: checkcast 133	rbr
    //   330: putfield 131	qsh:f	Lrbr;
    //   333: aload_0
    //   334: iconst_4
    //   335: aload_0
    //   336: getfield 89	qsh:c	I
    //   339: ior
    //   340: putfield 89	qsh:c	I
    //   343: goto -326 -> 17
    //   346: iconst_2
    //   347: aload_0
    //   348: getfield 89	qsh:c	I
    //   351: iand
    //   352: iconst_2
    //   353: if_icmpne +81 -> 434
    //   356: aload_0
    //   357: getfield 137	qsh:e	Lqqd;
    //   360: invokevirtual 94	pye:l	()Lpze;
    //   363: checkcast 96	pyg
    //   366: checkcast 96	pyg
    //   369: astore 9
    //   371: aload_0
    //   372: aload_1
    //   373: getstatic 141	qqd:b	Lqqd;
    //   376: aload_2
    //   377: invokevirtual 103	pxw:a	(Lpye;Lpxz;)Lpye;
    //   380: checkcast 139	qqd
    //   383: putfield 137	qsh:e	Lqqd;
    //   386: aload 9
    //   388: ifnull +28 -> 416
    //   391: aload 9
    //   393: aload_0
    //   394: getfield 137	qsh:e	Lqqd;
    //   397: invokevirtual 106	pyg:a	(Lpye;)Lpyg;
    //   400: pop
    //   401: aload_0
    //   402: aload 9
    //   404: invokevirtual 109	pyg:e	()Lpzd;
    //   407: checkcast 5	pye
    //   410: checkcast 139	qqd
    //   413: putfield 137	qsh:e	Lqqd;
    //   416: aload_0
    //   417: iconst_2
    //   418: aload_0
    //   419: getfield 89	qsh:c	I
    //   422: ior
    //   423: putfield 89	qsh:c	I
    //   426: goto -409 -> 17
    //   429: aload_0
    //   430: invokevirtual 120	qsh:i	()V
    //   433: return
    //   434: aconst_null
    //   435: astore 9
    //   437: goto -66 -> 371
    //   440: aconst_null
    //   441: astore 11
    //   443: goto -155 -> 288
    //   446: aconst_null
    //   447: astore 14
    //   449: goto -329 -> 120
    //   452: iconst_1
    //   453: istore_3
    //   454: goto -437 -> 17
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	457	0	this	qsh
    //   0	457	1	parampxw	pxw
    //   0	457	2	parampxz	pxz
    //   16	438	3	i	int
    //   231	7	4	localIOException	java.io.IOException
    //   245	13	5	localpyw1	pyw
    //   196	7	6	localObject	Object
    //   178	13	7	localpyw2	pyw
    //   25	57	8	m	int
    //   369	67	9	localpyg1	pyg
    //   286	156	11	localpyg2	pyg
    //   209	15	13	str	String
    //   118	330	14	localpyg3	pyg
    // Exception table:
    //   from	to	target	type
    //   21	27	178	pyw
    //   80	90	178	pyw
    //   95	120	178	pyw
    //   120	135	178	pyw
    //   140	165	178	pyw
    //   165	175	178	pyw
    //   205	228	178	pyw
    //   263	288	178	pyw
    //   288	303	178	pyw
    //   308	333	178	pyw
    //   333	343	178	pyw
    //   346	371	178	pyw
    //   371	386	178	pyw
    //   391	416	178	pyw
    //   416	426	178	pyw
    //   21	27	196	finally
    //   80	90	196	finally
    //   95	120	196	finally
    //   120	135	196	finally
    //   140	165	196	finally
    //   165	175	196	finally
    //   180	196	196	finally
    //   205	228	196	finally
    //   233	263	196	finally
    //   263	288	196	finally
    //   288	303	196	finally
    //   308	333	196	finally
    //   333	343	196	finally
    //   346	371	196	finally
    //   371	386	196	finally
    //   391	416	196	finally
    //   416	426	196	finally
    //   21	27	231	java/io/IOException
    //   80	90	231	java/io/IOException
    //   95	120	231	java/io/IOException
    //   120	135	231	java/io/IOException
    //   140	165	231	java/io/IOException
    //   165	175	231	java/io/IOException
    //   205	228	231	java/io/IOException
    //   263	288	231	java/io/IOException
    //   288	303	231	java/io/IOException
    //   308	333	231	java/io/IOException
    //   333	343	231	java/io/IOException
    //   346	371	231	java/io/IOException
    //   371	386	231	java/io/IOException
    //   391	416	231	java/io/IOException
    //   416	426	231	java/io/IOException
  }
  
  @Deprecated
  private qsr c()
  {
    if (this.d == null) {
      return qsr.a;
    }
    return this.d;
  }
  
  private rbr d()
  {
    if (this.f == null) {
      return rbr.b;
    }
    return this.f;
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {
      return i;
    }
    int m = 0x1 & this.c;
    int n = 0;
    if (m == 1) {
      n = 0 + pxx.d(1, c());
    }
    if ((0x8 & this.c) == 8) {
      n += pxx.b(2, this.g);
    }
    if ((0x4 & this.c) == 4) {
      n += pxx.d(3, d());
    }
    if ((0x2 & this.c) == 2) {
      n += pxx.d(4, b());
    }
    int i1 = n + this.h.a();
    this.i = i1;
    return i1;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (qsi.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new qsh((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new qsh(pyr.c, pxz.b);
        int i2 = this.k;
        if (i2 == 1) {
          return a;
        }
        if (i2 == 0) {
          return null;
        }
        boolean bool = ((Boolean)paramObject1).booleanValue();
        if ((0x1 & this.c) == 1) {}
        for (int i3 = 1; (i3 != 0) && (!c().ao_()); i3 = 0)
        {
          if (bool) {
            this.k = 0;
          }
          return null;
        }
        if ((0x2 & this.c) == 2) {}
        for (int i4 = 1; (i4 != 0) && (!b().ao_()); i4 = 0)
        {
          if (bool) {
            this.k = 0;
          }
          return null;
        }
        if ((0x4 & this.c) == 4) {}
        for (int i5 = 1; (i5 != 0) && (!d().ao_()); i5 = 0)
        {
          if (bool) {
            this.k = 0;
          }
          return null;
        }
        if (bool) {
          this.k = 1;
        }
        return a;
        return null;
        return new pyg(null);
      } while (paramObject1 == a);
      qsh localqsh = (qsh)paramObject1;
      int i;
      qsr localqsr1;
      int m;
      qqd localqqd1;
      int n;
      rbr localrbr;
      if ((0x1 & localqsh.c) == 1)
      {
        i = 1;
        if (i != 0)
        {
          localqsr1 = localqsh.c();
          if ((this.d == null) || (this.d == qsr.a)) {
            break label644;
          }
          qsr localqsr2 = this.d;
          this.d = ((qsr)((pyg)((pyg)((pyg)qsr.a.l()).a(localqsr2)).a(localqsr1)).e());
          this.c = (0x1 | this.c);
        }
        if ((0x2 & localqsh.c) != 2) {
          break label653;
        }
        m = 1;
        if (m != 0)
        {
          localqqd1 = localqsh.b();
          if ((this.e == null) || (this.e == qqd.b)) {
            break label659;
          }
          qqd localqqd2 = this.e;
          this.e = ((qqd)((pyg)((pyg)((pyg)qqd.b.l()).a(localqqd2)).a(localqqd1)).e());
          this.c = (0x2 | this.c);
        }
        if ((0x4 & localqsh.c) != 4) {
          break label668;
        }
        n = 1;
        if (n != 0)
        {
          localrbr = localqsh.d();
          if ((this.f == null) || (this.f == rbr.b)) {
            break label674;
          }
          this.f = ((rbr)((pyg)rbr.a(this.f).a(localrbr)).e());
          label565:
          this.c = (0x4 | this.c);
        }
        if ((0x8 & localqsh.c) != 8) {
          break label683;
        }
      }
      label644:
      label653:
      label659:
      label668:
      label674:
      label683:
      for (int i1 = 1;; i1 = 0)
      {
        if (i1 != 0)
        {
          this.c = (0x8 | this.c);
          this.g = localqsh.g;
        }
        pzs localpzs = localqsh.h;
        this.h = pzs.a(this.h, localpzs);
        return this;
        i = 0;
        break;
        this.d = localqsr1;
        break label387;
        m = 0;
        break label411;
        this.e = localqqd1;
        break label484;
        n = 0;
        break label508;
        this.f = localrbr;
        break label565;
      }
    case 7: 
      label387:
      label411:
      label484:
      label508:
      return a;
    }
    if (l == null) {}
    try
    {
      if (l == null) {
        l = new pxp(a);
      }
      return l;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    if ((0x1 & this.c) == 1) {
      parampxx.b(1, c());
    }
    if ((0x8 & this.c) == 8) {
      parampxx.a(2, this.g);
    }
    if ((0x4 & this.c) == 4) {
      parampxx.b(3, d());
    }
    if ((0x2 & this.c) == 2) {
      parampxx.b(4, b());
    }
    this.h.a(parampxx);
  }
  
  public final qqd b()
  {
    if (this.e == null) {
      return qqd.b;
    }
    return this.e;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qsh
 * JD-Core Version:    0.7.0.1
 */