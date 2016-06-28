import java.nio.ByteBuffer;

public final class njr
  extends qan<njr>
{
  private Boolean a = null;
  private Boolean b = null;
  private Boolean c = null;
  private int d = -2147483648;
  private Boolean e = null;
  private Boolean f = null;
  
  public njr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      this.a.booleanValue();
      i += 1 + qal.d(8);
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
    }
    int j;
    int k;
    if (this.d != -2147483648)
    {
      j = this.d;
      k = qal.d(32);
      if (j < 0) {
        break label174;
      }
    }
    label174:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      if (this.e != null)
      {
        this.e.booleanValue();
        i += 1 + qal.d(40);
      }
      if (this.f != null)
      {
        this.f.booleanValue();
        i += 1 + qal.d(48);
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      boolean bool5 = this.a.booleanValue();
      paramqal.c(8);
      if (bool5) {}
      byte b5;
      for (int i1 = i;; i1 = 0)
      {
        b5 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if (this.b != null)
    {
      boolean bool4 = this.b.booleanValue();
      paramqal.c(16);
      if (bool4) {}
      byte b4;
      for (int n = i;; n = 0)
      {
        b4 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.c != null)
    {
      boolean bool3 = this.c.booleanValue();
      paramqal.c(24);
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
    if (this.d != -2147483648)
    {
      int k = this.d;
      paramqal.c(32);
      paramqal.a(k);
    }
    if (this.e != null)
    {
      boolean bool2 = this.e.booleanValue();
      paramqal.c(40);
      if (bool2) {}
      byte b2;
      for (int j = i;; j = 0)
      {
        b2 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.f != null)
    {
      boolean bool1 = this.f.booleanValue();
      paramqal.c(48);
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
 * Qualified Name:     njr
 * JD-Core Version:    0.7.0.1
 */