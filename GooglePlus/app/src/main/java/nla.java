import java.nio.ByteBuffer;

public final class nla
  extends qan<nla>
{
  private static volatile nla[] a;
  private Integer b = null;
  private Integer c = null;
  private Boolean d = null;
  private int e = -2147483648;
  
  public nla()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nla[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nla[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i5;
    int i6;
    if (this.b != null)
    {
      int i4 = this.b.intValue();
      i5 = qal.d(8);
      if (i4 >= 0) {
        i6 = qal.d(i4);
      }
    }
    for (int k = j + (i6 + i5);; k = j)
    {
      int i1;
      int i2;
      if (this.c != null)
      {
        i1 = this.c.intValue();
        i2 = qal.d(16);
        if (i1 < 0) {
          break label167;
        }
      }
      label167:
      for (int i3 = qal.d(i1);; i3 = i)
      {
        k += i3 + i2;
        if (this.d != null)
        {
          this.d.booleanValue();
          k += 1 + qal.d(24);
        }
        if (this.e != -2147483648)
        {
          int m = this.e;
          int n = qal.d(32);
          if (m >= 0) {
            i = qal.d(m);
          }
          k += i + n;
        }
        return k;
        i6 = i;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      int m = this.b.intValue();
      paramqal.c(8);
      paramqal.a(m);
    }
    if (this.c != null)
    {
      int k = this.c.intValue();
      paramqal.c(16);
      paramqal.a(k);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(24);
      if (bool) {}
      byte b1;
      for (int j = 1;; j = 0)
      {
        b1 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.e != -2147483648)
    {
      int i = this.e;
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nla
 * JD-Core Version:    0.7.0.1
 */