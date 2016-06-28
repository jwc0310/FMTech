import java.nio.ByteBuffer;

public final class niy
  extends qan<niy>
{
  private static volatile niy[] b;
  public int a = -2147483648;
  private Integer c = null;
  private Integer d = null;
  private Boolean e = null;
  
  public niy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static niy[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new niy[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i5;
    int i6;
    if (this.c != null)
    {
      int i4 = this.c.intValue();
      i5 = qal.d(8);
      if (i4 >= 0) {
        i6 = qal.d(i4);
      }
    }
    for (int k = j + (i6 + i5);; k = j)
    {
      int i1;
      int i2;
      if (this.d != null)
      {
        i1 = this.d.intValue();
        i2 = qal.d(16);
        if (i1 < 0) {
          break label167;
        }
      }
      label167:
      for (int i3 = qal.d(i1);; i3 = i)
      {
        k += i3 + i2;
        if (this.e != null)
        {
          this.e.booleanValue();
          k += 1 + qal.d(24);
        }
        if (this.a != -2147483648)
        {
          int m = this.a;
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
    if (this.c != null)
    {
      int m = this.c.intValue();
      paramqal.c(8);
      paramqal.a(m);
    }
    if (this.d != null)
    {
      int k = this.d.intValue();
      paramqal.c(16);
      paramqal.a(k);
    }
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
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
    if (this.a != -2147483648)
    {
      int i = this.a;
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     niy
 * JD-Core Version:    0.7.0.1
 */