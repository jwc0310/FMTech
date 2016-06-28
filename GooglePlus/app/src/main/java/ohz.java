import java.nio.ByteBuffer;

public final class ohz
  extends qan<ohz>
{
  private Long a = null;
  private Long b = null;
  private Boolean c = null;
  private int d = -2147483648;
  private Long e = null;
  private Long f = null;
  private Integer g = null;
  private long[] h = qay.b;
  
  public ohz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = 0;
    int k = super.a();
    if (this.a != null)
    {
      long l4 = this.a.longValue();
      k += qal.d(8) + qal.b(l4);
    }
    if (this.b != null)
    {
      long l3 = this.b.longValue();
      k += qal.d(16) + qal.b(l3);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      k += 1 + qal.d(24);
    }
    int i2;
    int i3;
    if (this.d != -2147483648)
    {
      i2 = this.d;
      i3 = qal.d(32);
      if (i2 < 0) {
        break label285;
      }
    }
    label285:
    for (int i4 = qal.d(i2);; i4 = i)
    {
      k += i4 + i3;
      if (this.e != null)
      {
        long l2 = this.e.longValue();
        k += qal.d(40) + qal.b(l2);
      }
      if (this.f != null)
      {
        long l1 = this.f.longValue();
        k += qal.d(48) + qal.b(l1);
      }
      if (this.g != null)
      {
        int n = this.g.intValue();
        int i1 = qal.d(56);
        if (n >= 0) {
          i = qal.d(n);
        }
        k += i1 + i;
      }
      if ((this.h == null) || (this.h.length <= 0)) {
        return k;
      }
      for (int m = 0; m < this.h.length; m++) {
        j += qal.b(this.h[m]);
      }
    }
    k = k + j + 1 * this.h.length;
    return k;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      long l5 = this.a.longValue();
      paramqal.c(8);
      paramqal.a(l5);
    }
    if (this.b != null)
    {
      long l4 = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l4);
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
      paramqal.c(24);
      if (bool) {}
      byte b1;
      for (int n = 1;; n = 0)
      {
        b1 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.d != -2147483648)
    {
      int m = this.d;
      paramqal.c(32);
      paramqal.a(m);
    }
    if (this.e != null)
    {
      long l3 = this.e.longValue();
      paramqal.c(40);
      paramqal.a(l3);
    }
    if (this.f != null)
    {
      long l2 = this.f.longValue();
      paramqal.c(48);
      paramqal.a(l2);
    }
    if (this.g != null)
    {
      int k = this.g.intValue();
      paramqal.c(56);
      paramqal.a(k);
    }
    if (this.h != null)
    {
      int i = this.h.length;
      int j = 0;
      if (i > 0) {
        while (j < this.h.length)
        {
          long l1 = this.h[j];
          paramqal.c(64);
          paramqal.a(l1);
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohz
 * JD-Core Version:    0.7.0.1
 */