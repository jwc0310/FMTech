public final class mgo
  extends pye<mgo, pyg>
  implements pzf
{
  public static final mgo d = new mgo(pyr.c, pxz.b);
  private static volatile pzg e = null;
  private static volatile pzh<mgo> g;
  private static final long serialVersionUID;
  public int a;
  public mgw b;
  public pyv<mha> c;
  private byte f;
  
  /* Error */
  private mgo(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 51	pye:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 53	mgo:f	B
    //   9: aload_0
    //   10: getstatic 58	pzi:b	Lpzi;
    //   13: putfield 60	mgo:c	Lpyv;
    //   16: iconst_0
    //   17: istore_3
    //   18: iload_3
    //   19: ifne +267 -> 286
    //   22: aload_1
    //   23: invokevirtual 65	pxw:a	()I
    //   26: istore 8
    //   28: iload 8
    //   30: lookupswitch	default:+34->64, 0:+288->318, 10:+49->79, 18:+180->210
    //   65: iload 8
    //   67: aload_1
    //   68: invokevirtual 68	mgo:a	(ILpxw;)Z
    //   71: ifne -53 -> 18
    //   74: iconst_1
    //   75: istore_3
    //   76: goto -58 -> 18
    //   79: iconst_1
    //   80: aload_0
    //   81: getfield 70	mgo:a	I
    //   84: iand
    //   85: iconst_1
    //   86: if_icmpne +226 -> 312
    //   89: aload_0
    //   90: getfield 72	mgo:b	Lmgw;
    //   93: invokevirtual 76	pye:l	()Lpze;
    //   96: checkcast 78	pyg
    //   99: checkcast 78	pyg
    //   102: astore 10
    //   104: aload_0
    //   105: aload_1
    //   106: getstatic 82	mgw:c	Lmgw;
    //   109: aload_2
    //   110: invokevirtual 85	pxw:a	(Lpye;Lpxz;)Lpye;
    //   113: checkcast 80	mgw
    //   116: putfield 72	mgo:b	Lmgw;
    //   119: aload 10
    //   121: ifnull +28 -> 149
    //   124: aload 10
    //   126: aload_0
    //   127: getfield 72	mgo:b	Lmgw;
    //   130: invokevirtual 88	pyg:a	(Lpye;)Lpyg;
    //   133: pop
    //   134: aload_0
    //   135: aload 10
    //   137: invokevirtual 91	pyg:e	()Lpzd;
    //   140: checkcast 5	pye
    //   143: checkcast 80	mgw
    //   146: putfield 72	mgo:b	Lmgw;
    //   149: aload_0
    //   150: iconst_1
    //   151: aload_0
    //   152: getfield 70	mgo:a	I
    //   155: ior
    //   156: putfield 70	mgo:a	I
    //   159: goto -141 -> 18
    //   162: astore 7
    //   164: aload 7
    //   166: aload_0
    //   167: putfield 94	pyw:a	Lpzd;
    //   170: new 96	java/lang/RuntimeException
    //   173: dup
    //   174: aload 7
    //   176: invokespecial 99	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   179: athrow
    //   180: astore 6
    //   182: aload_0
    //   183: getfield 60	mgo:c	Lpyv;
    //   186: invokeinterface 104 1 0
    //   191: ifeq +12 -> 203
    //   194: aload_0
    //   195: getfield 60	mgo:c	Lpyv;
    //   198: invokeinterface 106 1 0
    //   203: aload_0
    //   204: invokevirtual 109	mgo:i	()V
    //   207: aload 6
    //   209: athrow
    //   210: aload_0
    //   211: getfield 60	mgo:c	Lpyv;
    //   214: invokeinterface 104 1 0
    //   219: ifne +14 -> 233
    //   222: aload_0
    //   223: new 55	pzi
    //   226: dup
    //   227: invokespecial 110	pzi:<init>	()V
    //   230: putfield 60	mgo:c	Lpyv;
    //   233: aload_0
    //   234: getfield 60	mgo:c	Lpyv;
    //   237: aload_1
    //   238: getstatic 115	mha:e	Lmha;
    //   241: aload_2
    //   242: invokevirtual 85	pxw:a	(Lpye;Lpxz;)Lpye;
    //   245: invokeinterface 119 2 0
    //   250: pop
    //   251: goto -233 -> 18
    //   254: astore 4
    //   256: new 47	pyw
    //   259: dup
    //   260: aload 4
    //   262: invokevirtual 123	java/io/IOException:getMessage	()Ljava/lang/String;
    //   265: invokespecial 126	pyw:<init>	(Ljava/lang/String;)V
    //   268: astore 5
    //   270: aload 5
    //   272: aload_0
    //   273: putfield 94	pyw:a	Lpzd;
    //   276: new 96	java/lang/RuntimeException
    //   279: dup
    //   280: aload 5
    //   282: invokespecial 99	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   285: athrow
    //   286: aload_0
    //   287: getfield 60	mgo:c	Lpyv;
    //   290: invokeinterface 104 1 0
    //   295: ifeq +12 -> 307
    //   298: aload_0
    //   299: getfield 60	mgo:c	Lpyv;
    //   302: invokeinterface 106 1 0
    //   307: aload_0
    //   308: invokevirtual 109	mgo:i	()V
    //   311: return
    //   312: aconst_null
    //   313: astore 10
    //   315: goto -211 -> 104
    //   318: iconst_1
    //   319: istore_3
    //   320: goto -302 -> 18
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	323	0	this	mgo
    //   0	323	1	parampxw	pxw
    //   0	323	2	parampxz	pxz
    //   17	303	3	i	int
    //   254	7	4	localIOException	java.io.IOException
    //   268	13	5	localpyw1	pyw
    //   180	28	6	localObject	Object
    //   162	13	7	localpyw2	pyw
    //   26	40	8	j	int
    //   102	212	10	localpyg	pyg
    // Exception table:
    //   from	to	target	type
    //   22	28	162	pyw
    //   64	74	162	pyw
    //   79	104	162	pyw
    //   104	119	162	pyw
    //   124	149	162	pyw
    //   149	159	162	pyw
    //   210	233	162	pyw
    //   233	251	162	pyw
    //   22	28	180	finally
    //   64	74	180	finally
    //   79	104	180	finally
    //   104	119	180	finally
    //   124	149	180	finally
    //   149	159	180	finally
    //   164	180	180	finally
    //   210	233	180	finally
    //   233	251	180	finally
    //   256	286	180	finally
    //   22	28	254	java/io/IOException
    //   64	74	254	java/io/IOException
    //   79	104	254	java/io/IOException
    //   104	119	254	java/io/IOException
    //   124	149	254	java/io/IOException
    //   149	159	254	java/io/IOException
    //   210	233	254	java/io/IOException
    //   233	251	254	java/io/IOException
  }
  
  private mgw c()
  {
    if (this.b == null) {
      return mgw.c;
    }
    return this.b;
  }
  
  public final int a()
  {
    int i = 0;
    int j = this.i;
    if (j != -1) {
      return j;
    }
    if ((0x1 & this.a) == 1) {}
    for (int k = 0 + pxx.d(1, c());; k = 0)
    {
      int i1;
      for (int m = k; i < this.c.size(); m = i1)
      {
        i1 = m + pxx.d(2, (pzd)this.c.get(i));
        i++;
      }
      int n = m + this.h.a();
      this.i = n;
      return n;
    }
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (mgp.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new mgo((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new mgo(pyr.c, pxz.b);
        int k = this.f;
        if (k == 1) {
          return d;
        }
        if (k == 0) {
          return null;
        }
        boolean bool = ((Boolean)paramObject1).booleanValue();
        for (int m = 0; m < this.c.size(); m++) {
          if (!((mha)this.c.get(m)).ao_())
          {
            if (bool) {
              this.f = 0;
            }
            return null;
          }
        }
        if (bool) {
          this.f = 1;
        }
        return d;
        this.c.b();
        return null;
        return new pyg(false);
      } while (paramObject1 == d);
      mgo localmgo = (mgo)paramObject1;
      int i = 0x1 & localmgo.a;
      int j = 0;
      if (i == 1) {
        j = 1;
      }
      mgw localmgw;
      if (j != 0)
      {
        localmgw = localmgo.c();
        if ((this.b != null) && (this.b != mgw.c))
        {
          this.b = ((mgw)((pyg)mgw.a(this.b).a(localmgw)).e());
          this.a = (0x1 | this.a);
        }
      }
      else if (!localmgo.c.isEmpty())
      {
        if (!this.c.isEmpty()) {
          break label379;
        }
        this.c = localmgo.c;
      }
      for (;;)
      {
        pzs localpzs = localmgo.h;
        this.h = pzs.a(this.h, localpzs);
        return this;
        this.b = localmgw;
        break;
        b();
        this.c.addAll(localmgo.c);
      }
    case 7: 
      label379:
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
      mgw localmgw = c();
      parampxx.g(10);
      parampxx.a(localmgw);
    }
    for (int i = 0; i < this.c.size(); i++)
    {
      pzd localpzd = (pzd)this.c.get(i);
      parampxx.g(18);
      parampxx.a(localpzd);
    }
    this.h.a(parampxx);
  }
  
  public final void b()
  {
    if (!this.c.a()) {
      this.c = new pzi(this.c);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mgo
 * JD-Core Version:    0.7.0.1
 */