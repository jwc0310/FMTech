public final class pks
  extends pye<pks, pyg>
  implements pzf
{
  public static final pks c;
  private static volatile pzg k = null;
  private static volatile pzh<pks> m;
  private static final long serialVersionUID;
  public String a;
  public int b;
  private int d;
  private int e;
  private String f;
  private qnw g;
  private qnz j;
  private byte l;
  
  static
  {
    c = new pks(pyr.c, pxz.b);
    pye.a(qnz.a, c, c, null, 10071, pzw.k, pks.class);
  }
  
  /* Error */
  private pks(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 67	pye:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 69	pks:l	B
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield 71	pks:e	I
    //   14: aload_0
    //   15: ldc 73
    //   17: putfield 75	pks:f	Ljava/lang/String;
    //   20: aload_0
    //   21: ldc 73
    //   23: putfield 77	pks:a	Ljava/lang/String;
    //   26: aload_0
    //   27: iconst_0
    //   28: putfield 79	pks:b	I
    //   31: iconst_0
    //   32: istore_3
    //   33: iload_3
    //   34: ifne +417 -> 451
    //   37: aload_1
    //   38: invokevirtual 84	pxw:a	()I
    //   41: istore 8
    //   43: iload 8
    //   45: lookupswitch	default:+67->112, 0:+423->468, 8:+82->127, 18:+130->175, 26:+187->232, 34:+212->257, 42:+298->343, 48:+384->429
    //   113: iload 8
    //   115: aload_1
    //   116: invokevirtual 87	pks:a	(ILpxw;)Z
    //   119: ifne -86 -> 33
    //   122: iconst_1
    //   123: istore_3
    //   124: goto -91 -> 33
    //   127: aload_0
    //   128: iconst_1
    //   129: aload_0
    //   130: getfield 89	pks:d	I
    //   133: ior
    //   134: putfield 89	pks:d	I
    //   137: aload_0
    //   138: aload_1
    //   139: invokevirtual 91	pxw:d	()I
    //   142: putfield 71	pks:e	I
    //   145: goto -112 -> 33
    //   148: astore 7
    //   150: aload 7
    //   152: aload_0
    //   153: putfield 94	pyw:a	Lpzd;
    //   156: new 96	java/lang/RuntimeException
    //   159: dup
    //   160: aload 7
    //   162: invokespecial 99	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   165: athrow
    //   166: astore 6
    //   168: aload_0
    //   169: invokevirtual 102	pks:i	()V
    //   172: aload 6
    //   174: athrow
    //   175: aload_1
    //   176: invokevirtual 105	pxw:b	()Ljava/lang/String;
    //   179: astore 14
    //   181: aload_0
    //   182: iconst_2
    //   183: aload_0
    //   184: getfield 89	pks:d	I
    //   187: ior
    //   188: putfield 89	pks:d	I
    //   191: aload_0
    //   192: aload 14
    //   194: putfield 75	pks:f	Ljava/lang/String;
    //   197: goto -164 -> 33
    //   200: astore 4
    //   202: new 63	pyw
    //   205: dup
    //   206: aload 4
    //   208: invokevirtual 108	java/io/IOException:getMessage	()Ljava/lang/String;
    //   211: invokespecial 111	pyw:<init>	(Ljava/lang/String;)V
    //   214: astore 5
    //   216: aload 5
    //   218: aload_0
    //   219: putfield 94	pyw:a	Lpzd;
    //   222: new 96	java/lang/RuntimeException
    //   225: dup
    //   226: aload 5
    //   228: invokespecial 99	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   231: athrow
    //   232: aload_1
    //   233: invokevirtual 105	pxw:b	()Ljava/lang/String;
    //   236: astore 13
    //   238: aload_0
    //   239: iconst_4
    //   240: aload_0
    //   241: getfield 89	pks:d	I
    //   244: ior
    //   245: putfield 89	pks:d	I
    //   248: aload_0
    //   249: aload 13
    //   251: putfield 77	pks:a	Ljava/lang/String;
    //   254: goto -221 -> 33
    //   257: bipush 16
    //   259: aload_0
    //   260: getfield 89	pks:d	I
    //   263: iand
    //   264: bipush 16
    //   266: if_icmpne +196 -> 462
    //   269: aload_0
    //   270: getfield 113	pks:g	Lqnw;
    //   273: invokevirtual 116	pye:l	()Lpze;
    //   276: checkcast 118	pyg
    //   279: checkcast 118	pyg
    //   282: astore 11
    //   284: aload_0
    //   285: aload_1
    //   286: getstatic 122	qnw:a	Lqnw;
    //   289: aload_2
    //   290: invokevirtual 125	pxw:a	(Lpye;Lpxz;)Lpye;
    //   293: checkcast 120	qnw
    //   296: putfield 113	pks:g	Lqnw;
    //   299: aload 11
    //   301: ifnull +28 -> 329
    //   304: aload 11
    //   306: aload_0
    //   307: getfield 113	pks:g	Lqnw;
    //   310: invokevirtual 128	pyg:a	(Lpye;)Lpyg;
    //   313: pop
    //   314: aload_0
    //   315: aload 11
    //   317: invokevirtual 131	pyg:e	()Lpzd;
    //   320: checkcast 5	pye
    //   323: checkcast 120	qnw
    //   326: putfield 113	pks:g	Lqnw;
    //   329: aload_0
    //   330: bipush 16
    //   332: aload_0
    //   333: getfield 89	pks:d	I
    //   336: ior
    //   337: putfield 89	pks:d	I
    //   340: goto -307 -> 33
    //   343: bipush 32
    //   345: aload_0
    //   346: getfield 89	pks:d	I
    //   349: iand
    //   350: bipush 32
    //   352: if_icmpne +104 -> 456
    //   355: aload_0
    //   356: getfield 133	pks:j	Lqnz;
    //   359: invokevirtual 116	pye:l	()Lpze;
    //   362: checkcast 118	pyg
    //   365: checkcast 135	pyh
    //   368: astore 9
    //   370: aload_0
    //   371: aload_1
    //   372: getstatic 53	qnz:a	Lqnz;
    //   375: aload_2
    //   376: invokevirtual 125	pxw:a	(Lpye;Lpxz;)Lpye;
    //   379: checkcast 51	qnz
    //   382: putfield 133	pks:j	Lqnz;
    //   385: aload 9
    //   387: ifnull +28 -> 415
    //   390: aload 9
    //   392: aload_0
    //   393: getfield 133	pks:j	Lqnz;
    //   396: invokevirtual 136	pyh:a	(Lpye;)Lpyg;
    //   399: pop
    //   400: aload_0
    //   401: aload 9
    //   403: invokevirtual 139	pyh:i	()Lpyi;
    //   406: checkcast 141	pyi
    //   409: checkcast 51	qnz
    //   412: putfield 133	pks:j	Lqnz;
    //   415: aload_0
    //   416: bipush 32
    //   418: aload_0
    //   419: getfield 89	pks:d	I
    //   422: ior
    //   423: putfield 89	pks:d	I
    //   426: goto -393 -> 33
    //   429: aload_0
    //   430: bipush 8
    //   432: aload_0
    //   433: getfield 89	pks:d	I
    //   436: ior
    //   437: putfield 89	pks:d	I
    //   440: aload_0
    //   441: aload_1
    //   442: invokevirtual 91	pxw:d	()I
    //   445: putfield 79	pks:b	I
    //   448: goto -415 -> 33
    //   451: aload_0
    //   452: invokevirtual 102	pks:i	()V
    //   455: return
    //   456: aconst_null
    //   457: astore 9
    //   459: goto -89 -> 370
    //   462: aconst_null
    //   463: astore 11
    //   465: goto -181 -> 284
    //   468: iconst_1
    //   469: istore_3
    //   470: goto -437 -> 33
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	473	0	this	pks
    //   0	473	1	parampxw	pxw
    //   0	473	2	parampxz	pxz
    //   32	438	3	i	int
    //   200	7	4	localIOException	java.io.IOException
    //   214	13	5	localpyw1	pyw
    //   166	7	6	localObject	Object
    //   148	13	7	localpyw2	pyw
    //   41	73	8	n	int
    //   368	90	9	localpyh	pyh
    //   282	182	11	localpyg	pyg
    //   236	14	13	str1	String
    //   179	14	14	str2	String
    // Exception table:
    //   from	to	target	type
    //   37	43	148	pyw
    //   112	122	148	pyw
    //   127	145	148	pyw
    //   175	197	148	pyw
    //   232	254	148	pyw
    //   257	284	148	pyw
    //   284	299	148	pyw
    //   304	329	148	pyw
    //   329	340	148	pyw
    //   343	370	148	pyw
    //   370	385	148	pyw
    //   390	415	148	pyw
    //   415	426	148	pyw
    //   429	448	148	pyw
    //   37	43	166	finally
    //   112	122	166	finally
    //   127	145	166	finally
    //   150	166	166	finally
    //   175	197	166	finally
    //   202	232	166	finally
    //   232	254	166	finally
    //   257	284	166	finally
    //   284	299	166	finally
    //   304	329	166	finally
    //   329	340	166	finally
    //   343	370	166	finally
    //   370	385	166	finally
    //   390	415	166	finally
    //   415	426	166	finally
    //   429	448	166	finally
    //   37	43	200	java/io/IOException
    //   112	122	200	java/io/IOException
    //   127	145	200	java/io/IOException
    //   175	197	200	java/io/IOException
    //   232	254	200	java/io/IOException
    //   257	284	200	java/io/IOException
    //   284	299	200	java/io/IOException
    //   304	329	200	java/io/IOException
    //   329	340	200	java/io/IOException
    //   343	370	200	java/io/IOException
    //   370	385	200	java/io/IOException
    //   390	415	200	java/io/IOException
    //   415	426	200	java/io/IOException
    //   429	448	200	java/io/IOException
  }
  
  public static pyg a(pks parampks)
  {
    return (pyg)((pyg)c.l()).a(parampks);
  }
  
  @Deprecated
  private boolean c()
  {
    return (0x10 & this.d) == 16;
  }
  
  @Deprecated
  private qnw d()
  {
    if (this.g == null) {
      return qnw.a;
    }
    return this.g;
  }
  
  private boolean o()
  {
    return (0x20 & this.d) == 32;
  }
  
  private qnz p()
  {
    if (this.j == null) {
      return qnz.a;
    }
    return this.j;
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {
      return i;
    }
    int n = 0x1 & this.d;
    int i1 = 0;
    if (n == 1) {
      i1 = 0 + pxx.e(1, this.e);
    }
    if ((0x2 & this.d) == 2) {
      i1 += pxx.b(2, this.f);
    }
    if ((0x4 & this.d) == 4) {
      i1 += pxx.b(3, this.a);
    }
    if ((0x10 & this.d) == 16) {
      i1 += pxx.d(4, d());
    }
    if ((0x20 & this.d) == 32) {
      i1 += pxx.d(5, p());
    }
    if ((0x8 & this.d) == 8) {
      i1 += pxx.e(6, this.b);
    }
    int i2 = i1 + this.h.a();
    this.i = i2;
    return i2;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (pkr.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new pks((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new pks(pyr.c, pxz.b);
        int i4 = this.l;
        if (i4 == 1) {
          return c;
        }
        if (i4 == 0) {
          return null;
        }
        boolean bool = ((Boolean)paramObject1).booleanValue();
        if ((c()) && (!d().ao_()))
        {
          if (bool) {
            this.l = 0;
          }
          return null;
        }
        if ((o()) && (!p().ao_()))
        {
          if (bool) {
            this.l = 0;
          }
          return null;
        }
        if (bool) {
          this.l = 1;
        }
        return c;
        return null;
        return new pyg(null);
      } while (paramObject1 == c);
      pks localpks = (pks)paramObject1;
      int i;
      int n;
      int i1;
      qnw localqnw1;
      qnz localqnz;
      if ((0x1 & localpks.d) == 1)
      {
        i = 1;
        if (i != 0)
        {
          int i3 = localpks.e;
          this.d = (0x1 | this.d);
          this.e = i3;
        }
        if ((0x2 & localpks.d) != 2) {
          break label556;
        }
        n = 1;
        if (n != 0)
        {
          this.d = (0x2 | this.d);
          this.f = localpks.f;
        }
        if ((0x4 & localpks.d) != 4) {
          break label562;
        }
        i1 = 1;
        if (i1 != 0)
        {
          this.d = (0x4 | this.d);
          this.a = localpks.a;
        }
        if (localpks.b())
        {
          int i2 = localpks.b;
          this.d = (0x8 | this.d);
          this.b = i2;
        }
        if (localpks.c())
        {
          localqnw1 = localpks.d();
          if ((this.g == null) || (this.g == qnw.a)) {
            break label568;
          }
          qnw localqnw2 = this.g;
          this.g = ((qnw)((pyg)((pyg)((pyg)qnw.a.l()).a(localqnw2)).a(localqnw1)).e());
          this.d = (0x10 | this.d);
        }
        if (localpks.o())
        {
          localqnz = localpks.p();
          if ((this.j == null) || (this.j == qnz.a)) {
            break label577;
          }
        }
      }
      for (this.j = ((qnz)((pyh)qnz.a(this.j).a(localqnz)).i());; this.j = localqnz)
      {
        this.d = (0x20 | this.d);
        pzs localpzs = localpks.h;
        this.h = pzs.a(this.h, localpzs);
        return this;
        i = 0;
        break;
        label556:
        n = 0;
        break label276;
        label562:
        i1 = 0;
        break label314;
        label568:
        this.g = localqnw1;
        break label446;
      }
    case 7: 
      label276:
      label314:
      label446:
      label577:
      return c;
    }
    if (m == null) {}
    try
    {
      if (m == null) {
        m = new pxp(c);
      }
      return m;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    if ((0x1 & this.d) == 1)
    {
      int n = this.e;
      parampxx.g(8);
      parampxx.a(n);
    }
    if ((0x2 & this.d) == 2)
    {
      String str2 = this.f;
      parampxx.g(18);
      parampxx.a(str2);
    }
    if ((0x4 & this.d) == 4)
    {
      String str1 = this.a;
      parampxx.g(26);
      parampxx.a(str1);
    }
    if ((0x10 & this.d) == 16)
    {
      qnw localqnw = d();
      parampxx.g(34);
      parampxx.a(localqnw);
    }
    if ((0x20 & this.d) == 32)
    {
      qnz localqnz = p();
      parampxx.g(42);
      parampxx.a(localqnz);
    }
    if ((0x8 & this.d) == 8)
    {
      int i = this.b;
      parampxx.g(48);
      parampxx.a(i);
    }
    this.h.a(parampxx);
  }
  
  public final boolean b()
  {
    return (0x8 & this.d) == 8;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pks
 * JD-Core Version:    0.7.0.1
 */