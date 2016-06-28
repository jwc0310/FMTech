import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class mhe
  extends pyi<mhe, pyh>
  implements pzf
{
  public static final mhe a = new mhe(pyr.c, pxz.b);
  private static volatile pzg e = null;
  private static volatile pzh<mhe> g;
  private static final long serialVersionUID;
  private int c;
  private int d;
  private byte f;
  
  /* Error */
  private mhe(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 48	pyi:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 50	mhe:f	B
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield 52	mhe:d	I
    //   14: iconst_0
    //   15: istore_3
    //   16: iload_3
    //   17: ifne +110 -> 127
    //   20: aload_1
    //   21: invokevirtual 57	pxw:a	()I
    //   24: istore 8
    //   26: iload 8
    //   28: lookupswitch	default:+28->56, 0:+136->164, 8:+51->79
    //   57: aload_0
    //   58: invokevirtual 63	pye:n	()Lpzd;
    //   61: checkcast 59	pye
    //   64: aload_1
    //   65: aload_2
    //   66: iload 8
    //   68: invokevirtual 66	mhe:a	(Lpzd;Lpxw;Lpxz;I)Z
    //   71: ifne -55 -> 16
    //   74: iconst_1
    //   75: istore_3
    //   76: goto -60 -> 16
    //   79: aload_0
    //   80: iconst_1
    //   81: aload_0
    //   82: getfield 68	mhe:c	I
    //   85: ior
    //   86: putfield 68	mhe:c	I
    //   89: aload_0
    //   90: aload_1
    //   91: invokevirtual 70	pxw:d	()I
    //   94: putfield 52	mhe:d	I
    //   97: goto -81 -> 16
    //   100: astore 7
    //   102: aload 7
    //   104: aload_0
    //   105: putfield 73	pyw:a	Lpzd;
    //   108: new 75	java/lang/RuntimeException
    //   111: dup
    //   112: aload 7
    //   114: invokespecial 78	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   117: athrow
    //   118: astore 6
    //   120: aload_0
    //   121: invokevirtual 81	mhe:i	()V
    //   124: aload 6
    //   126: athrow
    //   127: aload_0
    //   128: invokevirtual 81	mhe:i	()V
    //   131: return
    //   132: astore 4
    //   134: new 44	pyw
    //   137: dup
    //   138: aload 4
    //   140: invokevirtual 85	java/io/IOException:getMessage	()Ljava/lang/String;
    //   143: invokespecial 88	pyw:<init>	(Ljava/lang/String;)V
    //   146: astore 5
    //   148: aload 5
    //   150: aload_0
    //   151: putfield 73	pyw:a	Lpzd;
    //   154: new 75	java/lang/RuntimeException
    //   157: dup
    //   158: aload 5
    //   160: invokespecial 78	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   163: athrow
    //   164: iconst_1
    //   165: istore_3
    //   166: goto -150 -> 16
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	this	mhe
    //   0	169	1	parampxw	pxw
    //   0	169	2	parampxz	pxz
    //   15	151	3	i	int
    //   132	7	4	localIOException	java.io.IOException
    //   146	13	5	localpyw1	pyw
    //   118	7	6	localObject	Object
    //   100	13	7	localpyw2	pyw
    //   24	43	8	j	int
    // Exception table:
    //   from	to	target	type
    //   20	26	100	pyw
    //   56	74	100	pyw
    //   79	97	100	pyw
    //   20	26	118	finally
    //   56	74	118	finally
    //   79	97	118	finally
    //   102	118	118	finally
    //   134	164	118	finally
    //   20	26	132	java/io/IOException
    //   56	74	132	java/io/IOException
    //   79	97	132	java/io/IOException
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {
      return i;
    }
    if ((0x1 & this.c) == 1) {}
    for (int j = 0 + pxx.e(1, this.d);; j = 0)
    {
      pyb localpyb = this.b;
      int k = 0;
      int i1;
      for (int m = 0; k < localpyb.a.a.size(); m = i1)
      {
        Map.Entry localEntry2 = (Map.Entry)localpyb.a.a.get(k);
        i1 = m + pyb.c((pyd)localEntry2.getKey(), localEntry2.getValue());
        k++;
      }
      Iterator localIterator = localpyb.a.b().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry1 = (Map.Entry)localIterator.next();
        m += pyb.c((pyd)localEntry1.getKey(), localEntry1.getValue());
      }
      int n = j + m + this.h.a();
      this.i = n;
      return n;
    }
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (mhf.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new mhe((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new mhe(pyr.c, pxz.b);
        int m = this.f;
        if (m == 1) {
          return a;
        }
        if (m == 0) {
          return null;
        }
        boolean bool = ((Boolean)paramObject1).booleanValue();
        pyb localpyb = this.b;
        int n = 0;
        int i1;
        if (n < localpyb.a.a.size()) {
          if (!pyb.a((Map.Entry)localpyb.a.a.get(n))) {
            i1 = 0;
          }
        }
        for (;;)
        {
          if (i1 != 0) {
            break label254;
          }
          if (bool) {
            this.f = 0;
          }
          return null;
          n++;
          break;
          Iterator localIterator = localpyb.a.b().iterator();
          for (;;)
          {
            if (localIterator.hasNext()) {
              if (!pyb.a((Map.Entry)localIterator.next()))
              {
                i1 = 0;
                break;
              }
            }
          }
          i1 = 1;
        }
        if (bool) {
          this.f = 1;
        }
        return a;
        return null;
        return new pyh('\000');
      } while (paramObject1 == a);
      mhe localmhe = (mhe)paramObject1;
      int i = 0x1 & localmhe.c;
      int j = 0;
      if (i == 1) {
        j = 1;
      }
      if (j != 0)
      {
        int k = localmhe.d;
        this.c = (0x1 | this.c);
        this.d = k;
      }
      a(localmhe);
      pzs localpzs = localmhe.h;
      this.h = pzs.a(this.h, localpzs);
      return this;
    case 7: 
      label254:
      return a;
    }
    if (g == null) {}
    try
    {
      if (g == null) {
        g = new pxp(a);
      }
      return g;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    pyj localpyj = new pyj(this, false);
    if ((0x1 & this.c) == 1)
    {
      int i = this.d;
      parampxx.g(8);
      parampxx.a(i);
    }
    localpyj.a(536870912, parampxx);
    this.h.a(parampxx);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mhe
 * JD-Core Version:    0.7.0.1
 */