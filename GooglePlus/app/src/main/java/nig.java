import java.nio.ByteBuffer;

public final class nig
  extends qan<nig>
{
  public Boolean a = null;
  public int b = -2147483648;
  public int c = -2147483648;
  public int d = -2147483648;
  public Boolean e = null;
  public Boolean f = null;
  private Boolean g = null;
  
  public nig()
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
    int i5;
    int n;
    int i1;
    if (this.b != -2147483648)
    {
      int i3 = this.b;
      int i4 = qal.d(16);
      if (i3 >= 0)
      {
        i5 = qal.d(i3);
        j += i5 + i4;
      }
    }
    else if (this.c != -2147483648)
    {
      n = this.c;
      i1 = qal.d(24);
      if (n < 0) {
        break label240;
      }
    }
    label240:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.d != -2147483648)
      {
        int k = this.d;
        int m = qal.d(32);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        j += 1 + qal.d(40);
      }
      if (this.f != null)
      {
        this.f.booleanValue();
        j += 1 + qal.d(48);
      }
      if (this.g != null)
      {
        this.g.booleanValue();
        j += 1 + qal.d(56);
      }
      return j;
      i5 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      boolean bool4 = this.a.booleanValue();
      paramqal.c(8);
      if (bool4) {}
      byte b4;
      for (int i2 = i;; i2 = 0)
      {
        b4 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.b != -2147483648)
    {
      int i1 = this.b;
      paramqal.c(16);
      paramqal.a(i1);
    }
    if (this.c != -2147483648)
    {
      int n = this.c;
      paramqal.c(24);
      paramqal.a(n);
    }
    if (this.d != -2147483648)
    {
      int m = this.d;
      paramqal.c(32);
      paramqal.a(m);
    }
    if (this.e != null)
    {
      boolean bool3 = this.e.booleanValue();
      paramqal.c(40);
      if (bool3) {}
      byte b3;
      for (int k = i;; k = 0)
      {
        b3 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.f != null)
    {
      boolean bool2 = this.f.booleanValue();
      paramqal.c(48);
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
    if (this.g != null)
    {
      boolean bool1 = this.g.booleanValue();
      paramqal.c(56);
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
 * Qualified Name:     nig
 * JD-Core Version:    0.7.0.1
 */