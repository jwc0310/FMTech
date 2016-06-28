import java.nio.ByteBuffer;

public final class oku
  extends qan<oku>
{
  private static volatile oku[] c;
  public int a = -2147483648;
  public int[] b = qay.a;
  private Boolean d = null;
  private Boolean e = null;
  private Boolean f = null;
  
  public oku()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oku[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new oku[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = 0;
    int k = super.a();
    int i2;
    if ((this.b != null) && (this.b.length > 0))
    {
      i2 = 0;
      if (j < this.b.length)
      {
        int i3 = this.b[j];
        if (i3 >= 0) {}
        for (int i4 = qal.d(i3);; i4 = i)
        {
          i2 += i4;
          j++;
          break;
        }
      }
    }
    for (int m = k + i2 + 1 * this.b.length;; m = k)
    {
      if (this.d != null)
      {
        this.d.booleanValue();
        m += 1 + qal.d(16);
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        m += 1 + qal.d(24);
      }
      if (this.a != -2147483648)
      {
        int n = this.a;
        int i1 = qal.d(32);
        if (n >= 0) {
          i = qal.d(n);
        }
        m += i1 + i;
      }
      if (this.f != null)
      {
        this.f.booleanValue();
        m += 1 + qal.d(40);
      }
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if ((this.b != null) && (this.b.length > 0)) {
      for (int n = 0; n < this.b.length; n++)
      {
        int i1 = this.b[n];
        paramqal.c(8);
        paramqal.a(i1);
      }
    }
    if (this.d != null)
    {
      boolean bool3 = this.d.booleanValue();
      paramqal.c(16);
      if (bool3) {}
      byte b3;
      for (int m = i;; m = 0)
      {
        b3 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.e != null)
    {
      boolean bool2 = this.e.booleanValue();
      paramqal.c(24);
      if (bool2) {}
      byte b2;
      for (int k = i;; k = 0)
      {
        b2 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.a != -2147483648)
    {
      int j = this.a;
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.f != null)
    {
      boolean bool1 = this.f.booleanValue();
      paramqal.c(40);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oku
 * JD-Core Version:    0.7.0.1
 */