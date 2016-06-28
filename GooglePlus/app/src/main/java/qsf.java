public final class qsf
  extends pye<qsf, pyg>
  implements pzf
{
  public static final qsf d = new qsf(pyr.c, pxz.b);
  public static final pyl<mhc, qsf> e = pye.a(mhc.a, d, d, null, 96372017, pzw.k, qsf.class);
  private static volatile pzg k = null;
  private static volatile pzh<qsf> l;
  private static final long serialVersionUID;
  public int a;
  public String b;
  public rae c;
  private int f;
  private qsx g;
  private qpx j;
  
  /* Error */
  private qsf(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 72	pye:<init>	()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield 74	qsf:f	I
    //   9: aload_0
    //   10: ldc 76
    //   12: putfield 78	qsf:b	Ljava/lang/String;
    //   15: iconst_0
    //   16: istore_3
    //   17: iload_3
    //   18: ifne +467 -> 485
    //   21: aload_1
    //   22: invokevirtual 83	pxw:a	()I
    //   25: istore 8
    //   27: iload 8
    //   29: lookupswitch	default:+59->88, 0:+479->508, 10:+74->103, 18:+126->155, 24:+241->270, 34:+284->313, 42:+370->399
    //   89: iload 8
    //   91: aload_1
    //   92: invokevirtual 86	qsf:a	(ILpxw;)Z
    //   95: ifne -78 -> 17
    //   98: iconst_1
    //   99: istore_3
    //   100: goto -83 -> 17
    //   103: aload_1
    //   104: invokevirtual 89	pxw:b	()Ljava/lang/String;
    //   107: astore 16
    //   109: aload_0
    //   110: iconst_2
    //   111: aload_0
    //   112: getfield 91	qsf:a	I
    //   115: ior
    //   116: putfield 91	qsf:a	I
    //   119: aload_0
    //   120: aload 16
    //   122: putfield 78	qsf:b	Ljava/lang/String;
    //   125: goto -108 -> 17
    //   128: astore 7
    //   130: aload 7
    //   132: aload_0
    //   133: putfield 94	pyw:a	Lpzd;
    //   136: new 96	java/lang/RuntimeException
    //   139: dup
    //   140: aload 7
    //   142: invokespecial 99	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   145: athrow
    //   146: astore 6
    //   148: aload_0
    //   149: invokevirtual 102	qsf:i	()V
    //   152: aload 6
    //   154: athrow
    //   155: iconst_4
    //   156: aload_0
    //   157: getfield 91	qsf:a	I
    //   160: iand
    //   161: iconst_4
    //   162: if_icmpne +340 -> 502
    //   165: aload_0
    //   166: getfield 104	qsf:g	Lqsx;
    //   169: invokevirtual 107	pye:l	()Lpze;
    //   172: checkcast 109	pyg
    //   175: checkcast 109	pyg
    //   178: astore 14
    //   180: aload_0
    //   181: aload_1
    //   182: getstatic 113	qsx:a	Lqsx;
    //   185: aload_2
    //   186: invokevirtual 116	pxw:a	(Lpye;Lpxz;)Lpye;
    //   189: checkcast 111	qsx
    //   192: putfield 104	qsf:g	Lqsx;
    //   195: aload 14
    //   197: ifnull +28 -> 225
    //   200: aload 14
    //   202: aload_0
    //   203: getfield 104	qsf:g	Lqsx;
    //   206: invokevirtual 119	pyg:a	(Lpye;)Lpyg;
    //   209: pop
    //   210: aload_0
    //   211: aload 14
    //   213: invokevirtual 122	pyg:e	()Lpzd;
    //   216: checkcast 5	pye
    //   219: checkcast 111	qsx
    //   222: putfield 104	qsf:g	Lqsx;
    //   225: aload_0
    //   226: iconst_4
    //   227: aload_0
    //   228: getfield 91	qsf:a	I
    //   231: ior
    //   232: putfield 91	qsf:a	I
    //   235: goto -218 -> 17
    //   238: astore 4
    //   240: new 68	pyw
    //   243: dup
    //   244: aload 4
    //   246: invokevirtual 125	java/io/IOException:getMessage	()Ljava/lang/String;
    //   249: invokespecial 128	pyw:<init>	(Ljava/lang/String;)V
    //   252: astore 5
    //   254: aload 5
    //   256: aload_0
    //   257: putfield 94	pyw:a	Lpzd;
    //   260: new 96	java/lang/RuntimeException
    //   263: dup
    //   264: aload 5
    //   266: invokespecial 99	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   269: athrow
    //   270: aload_1
    //   271: invokevirtual 130	pxw:d	()I
    //   274: istore 13
    //   276: iload 13
    //   278: invokestatic 135	qsz:a	(I)Lqsz;
    //   281: ifnonnull +13 -> 294
    //   284: aload_0
    //   285: iconst_3
    //   286: iload 13
    //   288: invokespecial 138	pye:a	(II)V
    //   291: goto -274 -> 17
    //   294: aload_0
    //   295: iconst_1
    //   296: aload_0
    //   297: getfield 91	qsf:a	I
    //   300: ior
    //   301: putfield 91	qsf:a	I
    //   304: aload_0
    //   305: iload 13
    //   307: putfield 74	qsf:f	I
    //   310: goto -293 -> 17
    //   313: bipush 8
    //   315: aload_0
    //   316: getfield 91	qsf:a	I
    //   319: iand
    //   320: bipush 8
    //   322: if_icmpne +174 -> 496
    //   325: aload_0
    //   326: getfield 140	qsf:j	Lqpx;
    //   329: invokevirtual 107	pye:l	()Lpze;
    //   332: checkcast 109	pyg
    //   335: checkcast 109	pyg
    //   338: astore 11
    //   340: aload_0
    //   341: aload_1
    //   342: getstatic 144	qpx:d	Lqpx;
    //   345: aload_2
    //   346: invokevirtual 116	pxw:a	(Lpye;Lpxz;)Lpye;
    //   349: checkcast 142	qpx
    //   352: putfield 140	qsf:j	Lqpx;
    //   355: aload 11
    //   357: ifnull +28 -> 385
    //   360: aload 11
    //   362: aload_0
    //   363: getfield 140	qsf:j	Lqpx;
    //   366: invokevirtual 119	pyg:a	(Lpye;)Lpyg;
    //   369: pop
    //   370: aload_0
    //   371: aload 11
    //   373: invokevirtual 122	pyg:e	()Lpzd;
    //   376: checkcast 5	pye
    //   379: checkcast 142	qpx
    //   382: putfield 140	qsf:j	Lqpx;
    //   385: aload_0
    //   386: bipush 8
    //   388: aload_0
    //   389: getfield 91	qsf:a	I
    //   392: ior
    //   393: putfield 91	qsf:a	I
    //   396: goto -379 -> 17
    //   399: bipush 16
    //   401: aload_0
    //   402: getfield 91	qsf:a	I
    //   405: iand
    //   406: bipush 16
    //   408: if_icmpne +82 -> 490
    //   411: aload_0
    //   412: getfield 146	qsf:c	Lrae;
    //   415: invokevirtual 107	pye:l	()Lpze;
    //   418: checkcast 109	pyg
    //   421: checkcast 109	pyg
    //   424: astore 9
    //   426: aload_0
    //   427: aload_1
    //   428: getstatic 149	rae:c	Lrae;
    //   431: aload_2
    //   432: invokevirtual 116	pxw:a	(Lpye;Lpxz;)Lpye;
    //   435: checkcast 148	rae
    //   438: putfield 146	qsf:c	Lrae;
    //   441: aload 9
    //   443: ifnull +28 -> 471
    //   446: aload 9
    //   448: aload_0
    //   449: getfield 146	qsf:c	Lrae;
    //   452: invokevirtual 119	pyg:a	(Lpye;)Lpyg;
    //   455: pop
    //   456: aload_0
    //   457: aload 9
    //   459: invokevirtual 122	pyg:e	()Lpzd;
    //   462: checkcast 5	pye
    //   465: checkcast 148	rae
    //   468: putfield 146	qsf:c	Lrae;
    //   471: aload_0
    //   472: bipush 16
    //   474: aload_0
    //   475: getfield 91	qsf:a	I
    //   478: ior
    //   479: putfield 91	qsf:a	I
    //   482: goto -465 -> 17
    //   485: aload_0
    //   486: invokevirtual 102	qsf:i	()V
    //   489: return
    //   490: aconst_null
    //   491: astore 9
    //   493: goto -67 -> 426
    //   496: aconst_null
    //   497: astore 11
    //   499: goto -159 -> 340
    //   502: aconst_null
    //   503: astore 14
    //   505: goto -325 -> 180
    //   508: iconst_1
    //   509: istore_3
    //   510: goto -493 -> 17
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	513	0	this	qsf
    //   0	513	1	parampxw	pxw
    //   0	513	2	parampxz	pxz
    //   16	494	3	i	int
    //   238	7	4	localIOException	java.io.IOException
    //   252	13	5	localpyw1	pyw
    //   146	7	6	localObject	Object
    //   128	13	7	localpyw2	pyw
    //   25	65	8	m	int
    //   424	68	9	localpyg1	pyg
    //   338	160	11	localpyg2	pyg
    //   274	32	13	n	int
    //   178	326	14	localpyg3	pyg
    //   107	14	16	str	String
    // Exception table:
    //   from	to	target	type
    //   21	27	128	pyw
    //   88	98	128	pyw
    //   103	125	128	pyw
    //   155	180	128	pyw
    //   180	195	128	pyw
    //   200	225	128	pyw
    //   225	235	128	pyw
    //   270	291	128	pyw
    //   294	310	128	pyw
    //   313	340	128	pyw
    //   340	355	128	pyw
    //   360	385	128	pyw
    //   385	396	128	pyw
    //   399	426	128	pyw
    //   426	441	128	pyw
    //   446	471	128	pyw
    //   471	482	128	pyw
    //   21	27	146	finally
    //   88	98	146	finally
    //   103	125	146	finally
    //   130	146	146	finally
    //   155	180	146	finally
    //   180	195	146	finally
    //   200	225	146	finally
    //   225	235	146	finally
    //   240	270	146	finally
    //   270	291	146	finally
    //   294	310	146	finally
    //   313	340	146	finally
    //   340	355	146	finally
    //   360	385	146	finally
    //   385	396	146	finally
    //   399	426	146	finally
    //   426	441	146	finally
    //   446	471	146	finally
    //   471	482	146	finally
    //   21	27	238	java/io/IOException
    //   88	98	238	java/io/IOException
    //   103	125	238	java/io/IOException
    //   155	180	238	java/io/IOException
    //   180	195	238	java/io/IOException
    //   200	225	238	java/io/IOException
    //   225	235	238	java/io/IOException
    //   270	291	238	java/io/IOException
    //   294	310	238	java/io/IOException
    //   313	340	238	java/io/IOException
    //   340	355	238	java/io/IOException
    //   360	385	238	java/io/IOException
    //   385	396	238	java/io/IOException
    //   399	426	238	java/io/IOException
    //   426	441	238	java/io/IOException
    //   446	471	238	java/io/IOException
    //   471	482	238	java/io/IOException
  }
  
  @Deprecated
  private qsx b()
  {
    if (this.g == null) {
      return qsx.a;
    }
    return this.g;
  }
  
  private qpx c()
  {
    if (this.j == null) {
      return qpx.d;
    }
    return this.j;
  }
  
  private rae d()
  {
    if (this.c == null) {
      return rae.c;
    }
    return this.c;
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {
      return i;
    }
    int m = 0x2 & this.a;
    int n = 0;
    if (m == 2) {
      n = 0 + pxx.b(1, this.b);
    }
    if ((0x4 & this.a) == 4) {
      n += pxx.d(2, b());
    }
    if ((0x1 & this.a) == 1) {
      n += pxx.h(3, this.f);
    }
    if ((0x8 & this.a) == 8) {
      n += pxx.d(4, c());
    }
    if ((0x10 & this.a) == 16) {
      n += pxx.d(5, d());
    }
    int i1 = n + this.h.a();
    this.i = i1;
    return i1;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (qsg.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new qsf((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new qsf(pyr.c, pxz.b);
        return d;
        return null;
        return new pyg(null);
      } while (paramObject1 == d);
      qsf localqsf = (qsf)paramObject1;
      int i;
      int m;
      int n;
      qsx localqsx;
      label274:
      int i1;
      label300:
      qpx localqpx1;
      int i2;
      label400:
      rae localrae;
      if ((0x1 & localqsf.a) == 1)
      {
        i = 1;
        if (i != 0)
        {
          qsz localqsz = qsz.a(localqsf.f);
          if (localqsz == null) {
            localqsz = qsz.a;
          }
          a(localqsz);
        }
        if ((0x2 & localqsf.a) != 2) {
          break label496;
        }
        m = 1;
        if (m != 0)
        {
          this.a = (0x2 | this.a);
          this.b = localqsf.b;
        }
        if ((0x4 & localqsf.a) != 4) {
          break label502;
        }
        n = 1;
        if (n != 0)
        {
          localqsx = localqsf.b();
          if ((this.g == null) || (this.g == qsx.a)) {
            break label508;
          }
          this.g = ((qsx)((pyg)qsx.a(this.g).a(localqsx)).e());
          this.a = (0x4 | this.a);
        }
        if ((0x8 & localqsf.a) != 8) {
          break label517;
        }
        i1 = 1;
        if (i1 != 0)
        {
          localqpx1 = localqsf.c();
          if ((this.j == null) || (this.j == qpx.d)) {
            break label523;
          }
          qpx localqpx2 = this.j;
          this.j = ((qpx)((pyg)((pyg)((pyg)qpx.d.l()).a(localqpx2)).a(localqpx1)).e());
          this.a = (0x8 | this.a);
        }
        if ((0x10 & localqsf.a) != 16) {
          break label532;
        }
        i2 = 1;
        if (i2 != 0)
        {
          localrae = localqsf.d();
          if ((this.c == null) || (this.c == rae.c)) {
            break label538;
          }
        }
      }
      label517:
      label523:
      label532:
      label538:
      for (this.c = ((rae)((pyg)rae.a(this.c).a(localrae)).e());; this.c = localrae)
      {
        this.a = (0x10 | this.a);
        pzs localpzs = localqsf.h;
        this.h = pzs.a(this.h, localpzs);
        return this;
        i = 0;
        break;
        label496:
        m = 0;
        break label179;
        n = 0;
        break label217;
        this.g = localqsx;
        break label274;
        i1 = 0;
        break label300;
        this.j = localqpx1;
        break label373;
        i2 = 0;
        break label400;
      }
    case 7: 
      label179:
      label217:
      label373:
      label502:
      label508:
      return d;
    }
    if (l == null) {}
    try
    {
      if (l == null) {
        l = new pxp(d);
      }
      return l;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    if ((0x2 & this.a) == 2) {
      parampxx.a(1, this.b);
    }
    if ((0x4 & this.a) == 4) {
      parampxx.b(2, b());
    }
    if ((0x1 & this.a) == 1) {
      parampxx.d(3, this.f);
    }
    if ((0x8 & this.a) == 8) {
      parampxx.b(4, c());
    }
    if ((0x10 & this.a) == 16) {
      parampxx.b(5, d());
    }
    this.h.a(parampxx);
  }
  
  public final void a(qsz paramqsz)
  {
    if (paramqsz == null) {
      throw new NullPointerException();
    }
    this.a = (0x1 | this.a);
    this.f = paramqsz.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qsf
 * JD-Core Version:    0.7.0.1
 */