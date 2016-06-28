import android.content.Context;
import android.os.SystemClock;
import android.util.Log;

public final class gyy
  implements gyx
{
  private final Context a;
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e;
  private boolean f;
  private int g;
  private int h;
  private long i;
  private long j;
  private long k;
  private kpz l;
  private kpz m;
  private kpz n;
  private kpz o;
  private kpz p;
  
  public gyy(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private void a(boolean paramBoolean)
  {
    try
    {
      if (this.c)
      {
        int i1 = -1 + this.g;
        this.g = i1;
        if (i1 == 0)
        {
          this.l.a();
          if (Log.isLoggable("AppLaunch", 3))
          {
            kpz localkpz = this.l;
            long l1 = localkpz.c - localkpz.b;
            new StringBuilder(77).append("stopAppCreatePeriod() appCreateStartEvent duration (ms): ").append(l1);
          }
        }
      }
      return;
    }
    finally {}
  }
  
  public final void a()
  {
    try
    {
      a(false);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(long paramLong)
  {
    try
    {
      this.g = (1 + this.g);
      if (!this.c)
      {
        this.l = new kpz(2, paramLong);
        this.c = true;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      if (e())
      {
        if (paramString != null)
        {
          kpz localkpz = this.l;
          localkpz.d = paramString;
          localkpz.b(this.a);
          new kpu(10).b(this.a);
        }
        this.n = null;
        this.k = 0L;
        this.i = 0L;
        this.l = null;
        this.m = null;
        this.d = true;
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public final void a(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 100	gyy:d	Z
    //   8: ifne +437 -> 445
    //   11: aload_0
    //   12: getfield 103	gyy:b	Z
    //   15: ifeq +430 -> 445
    //   18: iconst_m1
    //   19: aload_0
    //   20: getfield 105	gyy:h	I
    //   23: iadd
    //   24: istore 5
    //   26: aload_0
    //   27: iload 5
    //   29: putfield 105	gyy:h	I
    //   32: iload 5
    //   34: ifne +411 -> 445
    //   37: iload_2
    //   38: ifeq +410 -> 448
    //   41: bipush 12
    //   43: istore 6
    //   45: new 88	kpu
    //   48: dup
    //   49: iload 6
    //   51: invokespecial 89	kpu:<init>	(I)V
    //   54: aload_0
    //   55: getfield 34	gyy:a	Landroid/content/Context;
    //   58: invokevirtual 90	kpu:b	(Landroid/content/Context;)V
    //   61: iload_2
    //   62: ifeq +393 -> 455
    //   65: bipush 118
    //   67: istore 7
    //   69: new 107	kqf
    //   72: dup
    //   73: iload 7
    //   75: invokespecial 108	kqf:<init>	(I)V
    //   78: aload_0
    //   79: getfield 34	gyy:a	Landroid/content/Context;
    //   82: invokevirtual 109	kqf:b	(Landroid/content/Context;)V
    //   85: iload_2
    //   86: ifeq +5 -> 91
    //   89: iconst_2
    //   90: istore_3
    //   91: new 111	kqg
    //   94: dup
    //   95: iload_3
    //   96: invokespecial 112	kqg:<init>	(I)V
    //   99: aload_0
    //   100: getfield 34	gyy:a	Landroid/content/Context;
    //   103: invokevirtual 113	kqg:b	(Landroid/content/Context;)V
    //   106: iload_2
    //   107: ifeq +355 -> 462
    //   110: new 43	kpz
    //   113: dup
    //   114: bipush 13
    //   116: aload_0
    //   117: getfield 96	gyy:i	J
    //   120: invokespecial 77	kpz:<init>	(IJ)V
    //   123: astore 8
    //   125: aload 8
    //   127: invokevirtual 45	kpz:a	()V
    //   130: aload 8
    //   132: aload_1
    //   133: putfield 84	kpz:d	Ljava/lang/String;
    //   136: aload 8
    //   138: aload_0
    //   139: getfield 34	gyy:a	Landroid/content/Context;
    //   142: invokevirtual 86	kpz:b	(Landroid/content/Context;)V
    //   145: aload_0
    //   146: getfield 115	gyy:f	Z
    //   149: ifne +24 -> 173
    //   152: aload_0
    //   153: getfield 41	gyy:l	Lkpz;
    //   156: astore 28
    //   158: aload 28
    //   160: aload_1
    //   161: putfield 84	kpz:d	Ljava/lang/String;
    //   164: aload 28
    //   166: aload_0
    //   167: getfield 34	gyy:a	Landroid/content/Context;
    //   170: invokevirtual 86	kpz:b	(Landroid/content/Context;)V
    //   173: aload_0
    //   174: getfield 92	gyy:n	Lkpz;
    //   177: ifnull +38 -> 215
    //   180: aload_0
    //   181: getfield 94	gyy:k	J
    //   184: lconst_0
    //   185: lcmp
    //   186: ifle +29 -> 215
    //   189: aload_0
    //   190: getfield 92	gyy:n	Lkpz;
    //   193: astore 27
    //   195: aload 27
    //   197: aload_1
    //   198: putfield 84	kpz:d	Ljava/lang/String;
    //   201: aload 27
    //   203: aload_0
    //   204: getfield 34	gyy:a	Landroid/content/Context;
    //   207: invokevirtual 86	kpz:b	(Landroid/content/Context;)V
    //   210: aload_0
    //   211: aconst_null
    //   212: putfield 92	gyy:n	Lkpz;
    //   215: aload_0
    //   216: getfield 98	gyy:m	Lkpz;
    //   219: astore 9
    //   221: aload 9
    //   223: aload_1
    //   224: putfield 84	kpz:d	Ljava/lang/String;
    //   227: aload 9
    //   229: aload_0
    //   230: getfield 34	gyy:a	Landroid/content/Context;
    //   233: invokevirtual 86	kpz:b	(Landroid/content/Context;)V
    //   236: invokestatic 121	android/os/SystemClock:elapsedRealtime	()J
    //   239: lstore 10
    //   241: aload_0
    //   242: getfield 98	gyy:m	Lkpz;
    //   245: astore 12
    //   247: lload 10
    //   249: aload 12
    //   251: getfield 55	kpz:c	J
    //   254: aload 12
    //   256: getfield 57	kpz:b	J
    //   259: lsub
    //   260: lsub
    //   261: lstore 13
    //   263: aload_0
    //   264: getfield 41	gyy:l	Lkpz;
    //   267: astore 15
    //   269: new 43	kpz
    //   272: dup
    //   273: iconst_1
    //   274: lload 13
    //   276: aload 15
    //   278: getfield 55	kpz:c	J
    //   281: aload 15
    //   283: getfield 57	kpz:b	J
    //   286: lsub
    //   287: lsub
    //   288: invokespecial 77	kpz:<init>	(IJ)V
    //   291: astore 16
    //   293: aload 16
    //   295: invokevirtual 45	kpz:a	()V
    //   298: aload 16
    //   300: aload_1
    //   301: putfield 84	kpz:d	Ljava/lang/String;
    //   304: aload 16
    //   306: aload_0
    //   307: getfield 34	gyy:a	Landroid/content/Context;
    //   310: invokevirtual 86	kpz:b	(Landroid/content/Context;)V
    //   313: ldc 47
    //   315: iconst_3
    //   316: invokestatic 53	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   319: ifeq +111 -> 430
    //   322: ldc 123
    //   324: invokestatic 129	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   327: astore 17
    //   329: aload_0
    //   330: getfield 41	gyy:l	Lkpz;
    //   333: astore 18
    //   335: aload 18
    //   337: getfield 55	kpz:c	J
    //   340: aload 18
    //   342: getfield 57	kpz:b	J
    //   345: lsub
    //   346: lstore 19
    //   348: aload_0
    //   349: getfield 98	gyy:m	Lkpz;
    //   352: astore 21
    //   354: aload 21
    //   356: getfield 55	kpz:c	J
    //   359: aload 21
    //   361: getfield 57	kpz:b	J
    //   364: lsub
    //   365: lstore 22
    //   367: aload 16
    //   369: getfield 55	kpz:c	J
    //   372: aload 16
    //   374: getfield 57	kpz:b	J
    //   377: lsub
    //   378: lstore 24
    //   380: new 59	java/lang/StringBuilder
    //   383: dup
    //   384: sipush 141
    //   387: aload 17
    //   389: invokestatic 129	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   392: invokevirtual 133	java/lang/String:length	()I
    //   395: iadd
    //   396: invokespecial 62	java/lang/StringBuilder:<init>	(I)V
    //   399: aload 17
    //   401: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   404: lload 19
    //   406: invokevirtual 71	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   409: ldc 135
    //   411: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   414: lload 22
    //   416: invokevirtual 71	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   419: ldc 137
    //   421: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: lload 24
    //   426: invokevirtual 71	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   429: pop
    //   430: aload_0
    //   431: aconst_null
    //   432: putfield 41	gyy:l	Lkpz;
    //   435: aload_0
    //   436: aconst_null
    //   437: putfield 98	gyy:m	Lkpz;
    //   440: aload_0
    //   441: iconst_1
    //   442: putfield 100	gyy:d	Z
    //   445: aload_0
    //   446: monitorexit
    //   447: return
    //   448: bipush 11
    //   450: istore 6
    //   452: goto -407 -> 45
    //   455: bipush 117
    //   457: istore 7
    //   459: goto -390 -> 69
    //   462: aload_0
    //   463: getfield 139	gyy:o	Lkpz;
    //   466: ifnull -321 -> 145
    //   469: aload_0
    //   470: getfield 139	gyy:o	Lkpz;
    //   473: astore 29
    //   475: aload 29
    //   477: aload_1
    //   478: putfield 84	kpz:d	Ljava/lang/String;
    //   481: aload 29
    //   483: aload_0
    //   484: getfield 34	gyy:a	Landroid/content/Context;
    //   487: invokevirtual 86	kpz:b	(Landroid/content/Context;)V
    //   490: aload_0
    //   491: aconst_null
    //   492: putfield 139	gyy:o	Lkpz;
    //   495: aload_0
    //   496: getfield 141	gyy:p	Lkpz;
    //   499: ifnull +29 -> 528
    //   502: aload_0
    //   503: getfield 141	gyy:p	Lkpz;
    //   506: astore 31
    //   508: aload 31
    //   510: aload_1
    //   511: putfield 84	kpz:d	Ljava/lang/String;
    //   514: aload 31
    //   516: aload_0
    //   517: getfield 34	gyy:a	Landroid/content/Context;
    //   520: invokevirtual 86	kpz:b	(Landroid/content/Context;)V
    //   523: aload_0
    //   524: aconst_null
    //   525: putfield 141	gyy:p	Lkpz;
    //   528: aload_0
    //   529: getfield 94	gyy:k	J
    //   532: lconst_0
    //   533: lcmp
    //   534: ifle -389 -> 145
    //   537: new 43	kpz
    //   540: dup
    //   541: bipush 16
    //   543: aload_0
    //   544: getfield 94	gyy:k	J
    //   547: invokespecial 77	kpz:<init>	(IJ)V
    //   550: astore 30
    //   552: aload 30
    //   554: invokevirtual 45	kpz:a	()V
    //   557: aload 30
    //   559: aload_1
    //   560: putfield 84	kpz:d	Ljava/lang/String;
    //   563: aload 30
    //   565: aload_0
    //   566: getfield 34	gyy:a	Landroid/content/Context;
    //   569: invokevirtual 86	kpz:b	(Landroid/content/Context;)V
    //   572: goto -427 -> 145
    //   575: astore 4
    //   577: aload_0
    //   578: monitorexit
    //   579: aload 4
    //   581: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	582	0	this	gyy
    //   0	582	1	paramString	String
    //   0	582	2	paramBoolean	boolean
    //   1	95	3	i1	int
    //   575	5	4	localObject	Object
    //   24	9	5	i2	int
    //   43	408	6	i3	int
    //   67	391	7	i4	int
    //   123	14	8	localkpz1	kpz
    //   219	9	9	localkpz2	kpz
    //   239	9	10	l1	long
    //   245	10	12	localkpz3	kpz
    //   261	14	13	l2	long
    //   267	15	15	localkpz4	kpz
    //   291	82	16	localkpz5	kpz
    //   327	73	17	str	String
    //   333	8	18	localkpz6	kpz
    //   346	59	19	l3	long
    //   352	8	21	localkpz7	kpz
    //   365	50	22	l4	long
    //   378	47	24	l5	long
    //   193	9	27	localkpz8	kpz
    //   156	9	28	localkpz9	kpz
    //   473	9	29	localkpz10	kpz
    //   550	14	30	localkpz11	kpz
    //   506	9	31	localkpz12	kpz
    // Exception table:
    //   from	to	target	type
    //   4	32	575	finally
    //   45	61	575	finally
    //   69	85	575	finally
    //   91	106	575	finally
    //   110	145	575	finally
    //   145	173	575	finally
    //   173	215	575	finally
    //   215	430	575	finally
    //   430	445	575	finally
    //   462	528	575	finally
    //   528	572	575	finally
  }
  
  public final void b()
  {
    try
    {
      if (!this.e)
      {
        if (this.o != null)
        {
          kpz localkpz = new kpz(15, this.j);
          localkpz.a();
          this.p = localkpz;
        }
        this.n = new kpz(9, SystemClock.elapsedRealtime());
      }
      return;
    }
    finally {}
  }
  
  public final void b(long paramLong)
  {
    try
    {
      this.h = (1 + this.h);
      if ((!this.b) && (this.c))
      {
        this.m = new kpz(3, paramLong);
        this.i = paramLong;
        new kqf(113).b(this.a);
        this.b = true;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void c()
  {
    try
    {
      if (this.n != null)
      {
        this.e = true;
        this.n.b(this.a);
        this.n = null;
        this.k = SystemClock.elapsedRealtime();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void d()
  {
    this.j = SystemClock.elapsedRealtime();
    kpz localkpz = new kpz(14, this.i);
    localkpz.a();
    this.o = localkpz;
  }
  
  public final boolean e()
  {
    return (!this.d) && (this.b) && (-1 + this.h == 0);
  }
  
  public final long f()
  {
    return this.i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyy
 * JD-Core Version:    0.7.0.1
 */