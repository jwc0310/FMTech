import java.nio.ByteBuffer;

public final class obj
  extends qan<obj>
{
  public Boolean a = null;
  public Boolean b = null;
  public Boolean c = null;
  public Boolean d = null;
  public int[] e = qay.a;
  private int f = -2147483648;
  private Boolean g = null;
  
  public obj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
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
    if (this.d != null)
    {
      this.d.booleanValue();
      j += 1 + qal.d(32);
    }
    int i3;
    int k;
    label167:
    int m;
    if (this.f != -2147483648)
    {
      int i1 = this.f;
      int i2 = qal.d(40);
      if (i1 >= 0)
      {
        i3 = qal.d(i1);
        j += i3 + i2;
      }
    }
    else
    {
      if ((this.e == null) || (this.e.length <= 0)) {
        break label235;
      }
      k = 0;
      if (k >= this.e.length) {
        break label223;
      }
      m = this.e[k];
      if (m < 0) {
        break label216;
      }
    }
    label216:
    for (int n = qal.d(m);; n = 10)
    {
      i += n;
      k++;
      break label167;
      i3 = 10;
      break;
    }
    label223:
    j = j + i + 1 * this.e.length;
    label235:
    if (this.g != null)
    {
      this.g.booleanValue();
      j += 1 + qal.d(56);
    }
    return j;
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
      for (int i3 = i;; i3 = 0)
      {
        b5 = (byte)i3;
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
    if (this.c != null)
    {
      boolean bool3 = this.c.booleanValue();
      paramqal.c(24);
      if (bool3) {}
      byte b3;
      for (int i1 = i;; i1 = 0)
      {
        b3 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.d != null)
    {
      boolean bool2 = this.d.booleanValue();
      paramqal.c(32);
      if (bool2) {}
      byte b2;
      for (int n = i;; n = 0)
      {
        b2 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.f != -2147483648)
    {
      int m = this.f;
      paramqal.c(40);
      paramqal.a(m);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int j = 0; j < this.e.length; j++)
      {
        int k = this.e[j];
        paramqal.c(48);
        paramqal.a(k);
      }
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
 * Qualified Name:     obj
 * JD-Core Version:    0.7.0.1
 */