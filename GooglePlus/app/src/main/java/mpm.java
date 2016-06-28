import java.nio.ByteBuffer;

public final class mpm
  extends qan<mpm>
{
  private Boolean a = null;
  private Boolean b = null;
  private Boolean c = null;
  private int d = -2147483648;
  private int e = -2147483648;
  
  public mpm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.a != null)
    {
      this.a.booleanValue();
      j += 1 + qal.d(8);
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      j += 1 + qal.d(16);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      j += 1 + qal.d(24);
    }
    int n;
    int i1;
    if (this.d != -2147483648)
    {
      n = this.d;
      i1 = qal.d(40);
      if (n < 0) {
        break label164;
      }
    }
    label164:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.e != -2147483648)
      {
        int k = this.e;
        int m = qal.d(48);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      boolean bool3 = this.a.booleanValue();
      paramqal.c(8);
      if (bool3) {}
      byte b3;
      for (int n = i;; n = 0)
      {
        b3 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.b != null)
    {
      boolean bool2 = this.b.booleanValue();
      paramqal.c(16);
      if (bool2) {}
      byte b2;
      for (int m = i;; m = 0)
      {
        b2 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.c != null)
    {
      boolean bool1 = this.c.booleanValue();
      paramqal.c(24);
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
    if (this.d != -2147483648)
    {
      int k = this.d;
      paramqal.c(40);
      paramqal.a(k);
    }
    if (this.e != -2147483648)
    {
      int j = this.e;
      paramqal.c(48);
      paramqal.a(j);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpm
 * JD-Core Version:    0.7.0.1
 */