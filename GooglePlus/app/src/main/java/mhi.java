import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class mhi
  extends pyi<mhi, pyh>
  implements pzf
{
  public static final mhi a = new mhi(pyr.c, pxz.b);
  private static volatile pzg c = null;
  private static volatile pzh<mhi> e;
  private static final long serialVersionUID;
  private byte d;
  
  /* Error */
  private mhi(pxw parampxw, pxz parampxz)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 45	pyi:<init>	()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield 47	mhi:d	B
    //   9: iconst_0
    //   10: istore_3
    //   11: iload_3
    //   12: ifne +64 -> 76
    //   15: aload_1
    //   16: invokevirtual 52	pxw:a	()I
    //   19: istore 8
    //   21: iload 8
    //   23: tableswitch	default:+17 -> 40, 0:+48->71
    //   41: aload_0
    //   42: invokevirtual 58	pye:n	()Lpzd;
    //   45: checkcast 54	pye
    //   48: aload_1
    //   49: aload_2
    //   50: iload 8
    //   52: invokevirtual 61	mhi:a	(Lpzd;Lpxw;Lpxz;I)Z
    //   55: istore 9
    //   57: iload 9
    //   59: ifne +81 -> 140
    //   62: iconst_1
    //   63: istore 10
    //   65: iload 10
    //   67: istore_3
    //   68: goto -57 -> 11
    //   71: iconst_1
    //   72: istore_3
    //   73: goto -62 -> 11
    //   76: aload_0
    //   77: invokevirtual 64	mhi:i	()V
    //   80: return
    //   81: astore 7
    //   83: aload 7
    //   85: aload_0
    //   86: putfield 67	pyw:a	Lpzd;
    //   89: new 69	java/lang/RuntimeException
    //   92: dup
    //   93: aload 7
    //   95: invokespecial 72	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   98: athrow
    //   99: astore 6
    //   101: aload_0
    //   102: invokevirtual 64	mhi:i	()V
    //   105: aload 6
    //   107: athrow
    //   108: astore 4
    //   110: new 41	pyw
    //   113: dup
    //   114: aload 4
    //   116: invokevirtual 76	java/io/IOException:getMessage	()Ljava/lang/String;
    //   119: invokespecial 79	pyw:<init>	(Ljava/lang/String;)V
    //   122: astore 5
    //   124: aload 5
    //   126: aload_0
    //   127: putfield 67	pyw:a	Lpzd;
    //   130: new 69	java/lang/RuntimeException
    //   133: dup
    //   134: aload 5
    //   136: invokespecial 72	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   139: athrow
    //   140: iload_3
    //   141: istore 10
    //   143: goto -78 -> 65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	146	0	this	mhi
    //   0	146	1	parampxw	pxw
    //   0	146	2	parampxz	pxz
    //   10	131	3	i	int
    //   108	7	4	localIOException	java.io.IOException
    //   122	13	5	localpyw1	pyw
    //   99	7	6	localObject	Object
    //   81	13	7	localpyw2	pyw
    //   19	32	8	j	int
    //   55	3	9	bool	boolean
    //   63	79	10	k	int
    // Exception table:
    //   from	to	target	type
    //   15	21	81	pyw
    //   40	57	81	pyw
    //   15	21	99	finally
    //   40	57	99	finally
    //   83	99	99	finally
    //   110	140	99	finally
    //   15	21	108	java/io/IOException
    //   40	57	108	java/io/IOException
  }
  
  public final int a()
  {
    int i = this.i;
    if (i != -1) {
      return i;
    }
    pyb localpyb = this.b;
    int j = 0;
    int n;
    for (int k = 0; j < localpyb.a.a.size(); k = n)
    {
      Map.Entry localEntry2 = (Map.Entry)localpyb.a.a.get(j);
      n = k + pyb.c((pyd)localEntry2.getKey(), localEntry2.getValue());
      j++;
    }
    Iterator localIterator = localpyb.a.b().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator.next();
      k += pyb.c((pyd)localEntry1.getKey(), localEntry1.getValue());
    }
    int m = k + 0 + this.h.a();
    this.i = m;
    return m;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (mhj.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      this = new mhi((pxw)paramObject1, (pxz)paramObject2);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      do
      {
        return this;
        return new mhi(pyr.c, pxz.b);
        int i = this.d;
        if (i == 1) {
          return a;
        }
        if (i == 0) {
          return null;
        }
        boolean bool = ((Boolean)paramObject1).booleanValue();
        pyb localpyb = this.b;
        int j = 0;
        int k;
        if (j < localpyb.a.a.size()) {
          if (!pyb.a((Map.Entry)localpyb.a.a.get(j))) {
            k = 0;
          }
        }
        for (;;)
        {
          if (k != 0) {
            break label254;
          }
          if (bool) {
            this.d = 0;
          }
          return null;
          j++;
          break;
          Iterator localIterator = localpyb.a.b().iterator();
          for (;;)
          {
            if (localIterator.hasNext()) {
              if (!pyb.a((Map.Entry)localIterator.next()))
              {
                k = 0;
                break;
              }
            }
          }
          k = 1;
        }
        if (bool) {
          this.d = 1;
        }
        return a;
        return null;
        return new pyh((short)0);
      } while (paramObject1 == a);
      mhi localmhi = (mhi)paramObject1;
      a(localmhi);
      pzs localpzs = localmhi.h;
      this.h = pzs.a(this.h, localpzs);
      return this;
    case 7: 
      label254:
      return a;
    }
    if (e == null) {}
    try
    {
      if (e == null) {
        e = new pxp(a);
      }
      return e;
    }
    finally {}
  }
  
  public final void a(pxx parampxx)
  {
    new pyj(this, false).a(536870912, parampxx);
    this.h.a(parampxx);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mhi
 * JD-Core Version:    0.7.0.1
 */