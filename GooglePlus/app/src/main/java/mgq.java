public final class mgq
  extends pye<mgq, pyg>
  implements pzf
{
  public static final mgq b = new mgq(pyr.c, pxz.b);
  private static volatile pzg e = null;
  private static volatile pzh<mgq> g;
  private static final long serialVersionUID;
  public pyv<mhg> a;
  private int c;
  private mgy d;
  private byte f;
  
  /* Error */
  private mgq(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 51	pye:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 53	mgq:f	B
    //   9: aload_0
    //   10: getstatic 58	pzi:b	Lpzi;
    //   13: putfield 60	mgq:a	Lpyv;
    //   16: iconst_0
    //   17: istore_3
    //   18: iload_3
    //   19: ifne +267 -> 286
    //   22: aload_1
    //   23: invokevirtual 65	pxw:a	()I
    //   26: istore 8
    //   28: iload 8
    //   30: lookupswitch	default:+34->64, 0:+288->318, 10:+49->79, 18:+141->171
    //   65: iload 8
    //   67: aload_1
    //   68: invokevirtual 68	mgq:a	(ILpxw;)Z
    //   71: ifne -53 -> 18
    //   74: iconst_1
    //   75: istore_3
    //   76: goto -58 -> 18
    //   79: aload_0
    //   80: getfield 60	mgq:a	Lpyv;
    //   83: invokeinterface 73 1 0
    //   88: ifne +14 -> 102
    //   91: aload_0
    //   92: new 55	pzi
    //   95: dup
    //   96: invokespecial 74	pzi:<init>	()V
    //   99: putfield 60	mgq:a	Lpyv;
    //   102: aload_0
    //   103: getfield 60	mgq:a	Lpyv;
    //   106: aload_1
    //   107: getstatic 79	mhg:b	Lmhg;
    //   110: aload_2
    //   111: invokevirtual 82	pxw:a	(Lpye;Lpxz;)Lpye;
    //   114: invokeinterface 86 2 0
    //   119: pop
    //   120: goto -102 -> 18
    //   123: astore 7
    //   125: aload 7
    //   127: aload_0
    //   128: putfield 89	pyw:a	Lpzd;
    //   131: new 91	java/lang/RuntimeException
    //   134: dup
    //   135: aload 7
    //   137: invokespecial 94	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   140: athrow
    //   141: astore 6
    //   143: aload_0
    //   144: getfield 60	mgq:a	Lpyv;
    //   147: invokeinterface 73 1 0
    //   152: ifeq +12 -> 164
    //   155: aload_0
    //   156: getfield 60	mgq:a	Lpyv;
    //   159: invokeinterface 96 1 0
    //   164: aload_0
    //   165: invokevirtual 99	mgq:i	()V
    //   168: aload 6
    //   170: athrow
    //   171: iconst_1
    //   172: aload_0
    //   173: getfield 101	mgq:c	I
    //   176: iand
    //   177: iconst_1
    //   178: if_icmpne +134 -> 312
    //   181: aload_0
    //   182: getfield 103	mgq:d	Lmgy;
    //   185: invokevirtual 107	pye:l	()Lpze;
    //   188: checkcast 109	pyg
    //   191: checkcast 109	pyg
    //   194: astore 9
    //   196: aload_0
    //   197: aload_1
    //   198: getstatic 113	mgy:a	Lmgy;
    //   201: aload_2
    //   202: invokevirtual 82	pxw:a	(Lpye;Lpxz;)Lpye;
    //   205: checkcast 111	mgy
    //   208: putfield 103	mgq:d	Lmgy;
    //   211: aload 9
    //   213: ifnull +28 -> 241
    //   216: aload 9
    //   218: aload_0
    //   219: getfield 103	mgq:d	Lmgy;
    //   222: invokevirtual 116	pyg:a	(Lpye;)Lpyg;
    //   225: pop
    //   226: aload_0
    //   227: aload 9
    //   229: invokevirtual 119	pyg:e	()Lpzd;
    //   232: checkcast 5	pye
    //   235: checkcast 111	mgy
    //   238: putfield 103	mgq:d	Lmgy;
    //   241: aload_0
    //   242: iconst_1
    //   243: aload_0
    //   244: getfield 101	mgq:c	I
    //   247: ior
    //   248: putfield 101	mgq:c	I
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
    //   273: putfield 89	pyw:a	Lpzd;
    //   276: new 91	java/lang/RuntimeException
    //   279: dup
    //   280: aload 5
    //   282: invokespecial 94	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   285: athrow
    //   286: aload_0
    //   287: getfield 60	mgq:a	Lpyv;
    //   290: invokeinterface 73 1 0
    //   295: ifeq +12 -> 307
    //   298: aload_0
    //   299: getfield 60	mgq:a	Lpyv;
    //   302: invokeinterface 96 1 0
    //   307: aload_0
    //   308: invokevirtual 99	mgq:i	()V
    //   311: return
    //   312: aconst_null
    //   313: astore 9
    //   315: goto -119 -> 196
    //   318: iconst_1
    //   319: istore_3
    //   320: goto -302 -> 18
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	323	0	this	mgq
    //   0	323	1	parampxw	pxw
    //   0	323	2	parampxz	pxz
    //   17	303	3	i	int
    //   254	7	4	localIOException	java.io.IOException
    //   268	13	5	localpyw1	pyw
    //   141	28	6	localObject	Object
    //   123	13	7	localpyw2	pyw
    //   26	40	8	j	int
    //   194	120	9	localpyg	pyg
    // Exception table:
    //   from	to	target	type
    //   22	28	123	pyw
    //   64	74	123	pyw
    //   79	102	123	pyw
    //   102	120	123	pyw
    //   171	196	123	pyw
    //   196	211	123	pyw
    //   216	241	123	pyw
    //   241	251	123	pyw
    //   22	28	141	finally
    //   64	74	141	finally
    //   79	102	141	finally
    //   102	120	141	finally
    //   125	141	141	finally
    //   171	196	141	finally
    //   196	211	141	finally
    //   216	241	141	finally
    //   241	251	141	finally
    //   256	286	141	finally
    //   22	28	254	java/io/IOException
    //   64	74	254	java/io/IOException
    //   79	102	254	java/io/IOException
    //   102	120	254	java/io/IOException
    //   171	196	254	java/io/IOException
    //   196	211	254	java/io/IOException
    //   216	241	254	java/io/IOException
    //   241	251	254	java/io/IOException
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {
      return i;
    }
    int j = 0;
    int k = 0;
    while (j < this.a.size())
    {
      k += pxx.d(1, (pzd)this.a.get(j));
      j++;
    }
    if ((0x1 & this.c) == 1) {
      k += pxx.d(2, b());
    }
    int m = k + this.h.a();
    this.i = m;
    return m;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (mgr.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new mgq((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new mgq(pyr.c, pxz.b);
        int k = this.f;
        if (k == 1) {
          return b;
        }
        if (k == 0) {
          return null;
        }
        boolean bool = ((Boolean)paramObject1).booleanValue();
        for (int m = 0; m < this.a.size(); m++) {
          if (!((mhg)this.a.get(m)).ao_())
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
        return b;
        this.a.b();
        return null;
        return new pyg(null);
      } while (paramObject1 == b);
      mgq localmgq = (mgq)paramObject1;
      mgy localmgy;
      if (!localmgq.a.isEmpty())
      {
        if (this.a.isEmpty()) {
          this.a = localmgq.a;
        }
      }
      else
      {
        int i = 0x1 & localmgq.c;
        int j = 0;
        if (i == 1) {
          j = 1;
        }
        if (j != 0)
        {
          localmgy = localmgq.b();
          if ((this.d == null) || (this.d == mgy.a)) {
            break label415;
          }
        }
      }
      for (this.d = ((mgy)((pyg)mgy.a(this.d).a(localmgy)).e());; this.d = localmgy)
      {
        this.c = (0x1 | this.c);
        pzs localpzs = localmgq.h;
        this.h = pzs.a(this.h, localpzs);
        return this;
        if (!this.a.a()) {
          this.a = new pzi(this.a);
        }
        this.a.addAll(localmgq.a);
        break;
      }
    case 7: 
      label415:
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
    for (int i = 0; i < this.a.size(); i++)
    {
      pzd localpzd = (pzd)this.a.get(i);
      parampxx.g(10);
      parampxx.a(localpzd);
    }
    if ((0x1 & this.c) == 1)
    {
      mgy localmgy = b();
      parampxx.g(18);
      parampxx.a(localmgy);
    }
    this.h.a(parampxx);
  }
  
  public final mgy b()
  {
    if (this.d == null) {
      return mgy.a;
    }
    return this.d;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mgq
 * JD-Core Version:    0.7.0.1
 */