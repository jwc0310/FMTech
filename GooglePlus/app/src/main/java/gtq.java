public final class gtq
  extends pye<gtq, pyg>
  implements pzf
{
  public static final gtq g = new gtq(pyr.c, pxz.b);
  private static volatile pzg k = null;
  private static volatile pzh<gtq> m;
  private static final long serialVersionUID;
  public int a;
  public int b;
  public Object c;
  public String d;
  public String e;
  public qrw f;
  private String j;
  private byte l;
  
  /* Error */
  private gtq(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 55	pye:<init>	()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield 57	gtq:b	I
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield 59	gtq:l	B
    //   14: aload_0
    //   15: ldc 61
    //   17: putfield 63	gtq:d	Ljava/lang/String;
    //   20: aload_0
    //   21: ldc 61
    //   23: putfield 65	gtq:e	Ljava/lang/String;
    //   26: aload_0
    //   27: ldc 61
    //   29: putfield 67	gtq:j	Ljava/lang/String;
    //   32: iconst_0
    //   33: istore_3
    //   34: iload_3
    //   35: ifne +413 -> 448
    //   38: aload_1
    //   39: invokevirtual 72	pxw:a	()I
    //   42: istore 8
    //   44: iload 8
    //   46: lookupswitch	default:+66->112, 0:+419->465, 82:+81->127, 162:+133->179, 170:+186->232, 242:+264->310, 322:+290->336, 402:+316->362
    //   113: iload 8
    //   115: aload_1
    //   116: invokevirtual 75	gtq:a	(ILpxw;)Z
    //   119: ifne -85 -> 34
    //   122: iconst_1
    //   123: istore_3
    //   124: goto -90 -> 34
    //   127: aload_1
    //   128: invokevirtual 78	pxw:b	()Ljava/lang/String;
    //   131: astore 16
    //   133: aload_0
    //   134: iconst_1
    //   135: aload_0
    //   136: getfield 80	gtq:a	I
    //   139: ior
    //   140: putfield 80	gtq:a	I
    //   143: aload_0
    //   144: aload 16
    //   146: putfield 63	gtq:d	Ljava/lang/String;
    //   149: goto -115 -> 34
    //   152: astore 7
    //   154: aload 7
    //   156: aload_0
    //   157: putfield 83	pyw:a	Lpzd;
    //   160: new 85	java/lang/RuntimeException
    //   163: dup
    //   164: aload 7
    //   166: invokespecial 88	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   169: athrow
    //   170: astore 6
    //   172: aload_0
    //   173: invokevirtual 91	gtq:i	()V
    //   176: aload 6
    //   178: athrow
    //   179: aload_1
    //   180: invokevirtual 78	pxw:b	()Ljava/lang/String;
    //   183: astore 15
    //   185: aload_0
    //   186: bipush 20
    //   188: putfield 57	gtq:b	I
    //   191: aload_0
    //   192: aload 15
    //   194: putfield 93	gtq:c	Ljava/lang/Object;
    //   197: goto -163 -> 34
    //   200: astore 4
    //   202: new 51	pyw
    //   205: dup
    //   206: aload 4
    //   208: invokevirtual 96	java/io/IOException:getMessage	()Ljava/lang/String;
    //   211: invokespecial 99	pyw:<init>	(Ljava/lang/String;)V
    //   214: astore 5
    //   216: aload 5
    //   218: aload_0
    //   219: putfield 83	pyw:a	Lpzd;
    //   222: new 85	java/lang/RuntimeException
    //   225: dup
    //   226: aload 5
    //   228: invokespecial 88	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   231: athrow
    //   232: aload_0
    //   233: getfield 57	gtq:b	I
    //   236: bipush 21
    //   238: if_icmpne +221 -> 459
    //   241: aload_0
    //   242: getfield 93	gtq:c	Ljava/lang/Object;
    //   245: checkcast 101	rbr
    //   248: invokevirtual 104	pye:l	()Lpze;
    //   251: checkcast 106	pyg
    //   254: checkcast 106	pyg
    //   257: astore 13
    //   259: aload_0
    //   260: aload_1
    //   261: getstatic 109	rbr:b	Lrbr;
    //   264: aload_2
    //   265: invokevirtual 112	pxw:a	(Lpye;Lpxz;)Lpye;
    //   268: putfield 93	gtq:c	Ljava/lang/Object;
    //   271: aload 13
    //   273: ifnull +28 -> 301
    //   276: aload 13
    //   278: aload_0
    //   279: getfield 93	gtq:c	Ljava/lang/Object;
    //   282: checkcast 101	rbr
    //   285: invokevirtual 115	pyg:a	(Lpye;)Lpyg;
    //   288: pop
    //   289: aload_0
    //   290: aload 13
    //   292: invokevirtual 118	pyg:e	()Lpzd;
    //   295: checkcast 5	pye
    //   298: putfield 93	gtq:c	Ljava/lang/Object;
    //   301: aload_0
    //   302: bipush 21
    //   304: putfield 57	gtq:b	I
    //   307: goto -273 -> 34
    //   310: aload_1
    //   311: invokevirtual 78	pxw:b	()Ljava/lang/String;
    //   314: astore 12
    //   316: aload_0
    //   317: bipush 8
    //   319: aload_0
    //   320: getfield 80	gtq:a	I
    //   323: ior
    //   324: putfield 80	gtq:a	I
    //   327: aload_0
    //   328: aload 12
    //   330: putfield 65	gtq:e	Ljava/lang/String;
    //   333: goto -299 -> 34
    //   336: aload_1
    //   337: invokevirtual 78	pxw:b	()Ljava/lang/String;
    //   340: astore 11
    //   342: aload_0
    //   343: bipush 16
    //   345: aload_0
    //   346: getfield 80	gtq:a	I
    //   349: ior
    //   350: putfield 80	gtq:a	I
    //   353: aload_0
    //   354: aload 11
    //   356: putfield 67	gtq:j	Ljava/lang/String;
    //   359: goto -325 -> 34
    //   362: bipush 32
    //   364: aload_0
    //   365: getfield 80	gtq:a	I
    //   368: iand
    //   369: bipush 32
    //   371: if_icmpne +82 -> 453
    //   374: aload_0
    //   375: getfield 120	gtq:f	Lqrw;
    //   378: invokevirtual 104	pye:l	()Lpze;
    //   381: checkcast 106	pyg
    //   384: checkcast 106	pyg
    //   387: astore 9
    //   389: aload_0
    //   390: aload_1
    //   391: getstatic 124	qrw:b	Lqrw;
    //   394: aload_2
    //   395: invokevirtual 112	pxw:a	(Lpye;Lpxz;)Lpye;
    //   398: checkcast 122	qrw
    //   401: putfield 120	gtq:f	Lqrw;
    //   404: aload 9
    //   406: ifnull +28 -> 434
    //   409: aload 9
    //   411: aload_0
    //   412: getfield 120	gtq:f	Lqrw;
    //   415: invokevirtual 115	pyg:a	(Lpye;)Lpyg;
    //   418: pop
    //   419: aload_0
    //   420: aload 9
    //   422: invokevirtual 118	pyg:e	()Lpzd;
    //   425: checkcast 5	pye
    //   428: checkcast 122	qrw
    //   431: putfield 120	gtq:f	Lqrw;
    //   434: aload_0
    //   435: bipush 32
    //   437: aload_0
    //   438: getfield 80	gtq:a	I
    //   441: ior
    //   442: putfield 80	gtq:a	I
    //   445: goto -411 -> 34
    //   448: aload_0
    //   449: invokevirtual 91	gtq:i	()V
    //   452: return
    //   453: aconst_null
    //   454: astore 9
    //   456: goto -67 -> 389
    //   459: aconst_null
    //   460: astore 13
    //   462: goto -203 -> 259
    //   465: iconst_1
    //   466: istore_3
    //   467: goto -433 -> 34
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	470	0	this	gtq
    //   0	470	1	parampxw	pxw
    //   0	470	2	parampxz	pxz
    //   33	434	3	i	int
    //   200	7	4	localIOException	java.io.IOException
    //   214	13	5	localpyw1	pyw
    //   170	7	6	localObject	Object
    //   152	13	7	localpyw2	pyw
    //   42	72	8	n	int
    //   387	68	9	localpyg1	pyg
    //   340	15	11	str1	String
    //   314	15	12	str2	String
    //   257	204	13	localpyg2	pyg
    //   183	10	15	str3	String
    //   131	14	16	str4	String
    // Exception table:
    //   from	to	target	type
    //   38	44	152	pyw
    //   112	122	152	pyw
    //   127	149	152	pyw
    //   179	197	152	pyw
    //   232	259	152	pyw
    //   259	271	152	pyw
    //   276	301	152	pyw
    //   301	307	152	pyw
    //   310	333	152	pyw
    //   336	359	152	pyw
    //   362	389	152	pyw
    //   389	404	152	pyw
    //   409	434	152	pyw
    //   434	445	152	pyw
    //   38	44	170	finally
    //   112	122	170	finally
    //   127	149	170	finally
    //   154	170	170	finally
    //   179	197	170	finally
    //   202	232	170	finally
    //   232	259	170	finally
    //   259	271	170	finally
    //   276	301	170	finally
    //   301	307	170	finally
    //   310	333	170	finally
    //   336	359	170	finally
    //   362	389	170	finally
    //   389	404	170	finally
    //   409	434	170	finally
    //   434	445	170	finally
    //   38	44	200	java/io/IOException
    //   112	122	200	java/io/IOException
    //   127	149	200	java/io/IOException
    //   179	197	200	java/io/IOException
    //   232	259	200	java/io/IOException
    //   259	271	200	java/io/IOException
    //   276	301	200	java/io/IOException
    //   301	307	200	java/io/IOException
    //   310	333	200	java/io/IOException
    //   336	359	200	java/io/IOException
    //   362	389	200	java/io/IOException
    //   389	404	200	java/io/IOException
    //   409	434	200	java/io/IOException
    //   434	445	200	java/io/IOException
  }
  
  private boolean o()
  {
    return (0x20 & this.a) == 32;
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {
      return i;
    }
    int n = 0x1 & this.a;
    int i1 = 0;
    if (n == 1) {
      i1 = 0 + pxx.b(10, this.d);
    }
    if (this.b == 20) {}
    for (int i2 = i1 + pxx.b(20, b());; i2 = i1)
    {
      if (this.b == 21) {
        i2 += pxx.d(21, (rbr)this.c);
      }
      if ((0x8 & this.a) == 8) {
        i2 += pxx.b(30, this.e);
      }
      if ((0x10 & this.a) == 16) {
        i2 += pxx.b(40, this.j);
      }
      if ((0x20 & this.a) == 32) {
        i2 += pxx.d(50, d());
      }
      int i3 = i2 + this.h.a();
      this.i = i3;
      return i3;
    }
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (gtr.b[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new gtq((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new gtq(pyr.c, pxz.b);
        int i2 = this.l;
        if (i2 == 1) {
          return g;
        }
        if (i2 == 0) {
          return null;
        }
        boolean bool = ((Boolean)paramObject1).booleanValue();
        if (this.b == 21) {}
        for (int i3 = 1; (i3 != 0) && (!c().ao_()); i3 = 0)
        {
          if (bool) {
            this.l = 0;
          }
          return null;
        }
        if ((o()) && (!d().ao_()))
        {
          if (bool) {
            this.l = 0;
          }
          return null;
        }
        if (bool) {
          this.l = 1;
        }
        return g;
        return null;
        return new pyg('\000');
      } while (paramObject1 == g);
      gtq localgtq = (gtq)paramObject1;
      int i;
      int n;
      int i1;
      qrw localqrw1;
      if ((0x1 & localgtq.a) == 1)
      {
        i = 1;
        if (i != 0)
        {
          this.a = (0x1 | this.a);
          this.d = localgtq.d;
        }
        if ((0x8 & localgtq.a) != 8) {
          break label508;
        }
        n = 1;
        if (n != 0)
        {
          this.a = (0x8 | this.a);
          this.e = localgtq.e;
        }
        if ((0x10 & localgtq.a) != 16) {
          break label514;
        }
        i1 = 1;
        if (i1 != 0)
        {
          this.a = (0x10 | this.a);
          this.j = localgtq.j;
        }
        if (localgtq.o())
        {
          localqrw1 = localgtq.d();
          if ((this.f == null) || (this.f == qrw.b)) {
            break label520;
          }
          qrw localqrw2 = this.f;
          this.f = ((qrw)((pyg)((pyg)((pyg)qrw.b.l()).a(localqrw2)).a(localqrw1)).e());
          label432:
          this.a = (0x20 | this.a);
        }
      }
      switch (gtr.a[gts.a(localgtq.b).ordinal()])
      {
      default: 
      case 1: 
        for (;;)
        {
          pzs localpzs = localgtq.h;
          this.h = pzs.a(this.h, localpzs);
          return this;
          i = 0;
          break;
          n = 0;
          break label290;
          label514:
          i1 = 0;
          break label331;
          label520:
          this.f = localqrw1;
          break label432;
          this.b = 20;
          this.c = localgtq.c;
        }
      }
      rbr localrbr = localgtq.c();
      if ((this.b == 21) && (this.c != rbr.b)) {}
      for (this.c = ((pye)((pyg)rbr.a((rbr)this.c).a(localrbr)).e());; this.c = localrbr)
      {
        this.b = 21;
        break;
      }
    case 7: 
      label290:
      label331:
      label508:
      return g;
    }
    if (m == null) {}
    try
    {
      if (m == null) {
        m = new pxp(g);
      }
      return m;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    if ((0x1 & this.a) == 1)
    {
      String str4 = this.d;
      parampxx.g(82);
      parampxx.a(str4);
    }
    if (this.b == 20)
    {
      String str3 = b();
      parampxx.g(162);
      parampxx.a(str3);
    }
    if (this.b == 21)
    {
      rbr localrbr = (rbr)this.c;
      parampxx.g(170);
      parampxx.a(localrbr);
    }
    if ((0x8 & this.a) == 8)
    {
      String str2 = this.e;
      parampxx.g(242);
      parampxx.a(str2);
    }
    if ((0x10 & this.a) == 16)
    {
      String str1 = this.j;
      parampxx.g(322);
      parampxx.a(str1);
    }
    if ((0x20 & this.a) == 32)
    {
      qrw localqrw = d();
      parampxx.g(402);
      parampxx.a(localqrw);
    }
    this.h.a(parampxx);
  }
  
  public final String b()
  {
    String str = "";
    if (this.b == 20) {
      str = (String)this.c;
    }
    return str;
  }
  
  public final rbr c()
  {
    if (this.b == 21) {
      return (rbr)this.c;
    }
    return rbr.b;
  }
  
  public final qrw d()
  {
    if (this.f == null) {
      return qrw.b;
    }
    return this.f;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gtq
 * JD-Core Version:    0.7.0.1
 */