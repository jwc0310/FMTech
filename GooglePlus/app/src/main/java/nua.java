import java.nio.ByteBuffer;

public final class nua
  extends qan<nua>
{
  public String a = null;
  public int b = -2147483648;
  public Boolean c = null;
  public Boolean d = null;
  public opr e = null;
  
  public nua()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i2 = qal.d(8);
      int i3 = qal.a(str);
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.b != -2147483648)
    {
      m = this.b;
      n = qal.d(16);
      if (m < 0) {
        break label183;
      }
    }
    label183:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.c != null)
      {
        this.c.booleanValue();
        i += 1 + qal.d(24);
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        i += 1 + qal.d(32);
      }
      if (this.e != null)
      {
        opr localopr = this.e;
        int j = qal.d(40);
        int k = localopr.a();
        localopr.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != -2147483648)
    {
      int k = this.b;
      paramqal.c(16);
      paramqal.a(k);
    }
    if (this.c != null)
    {
      boolean bool2 = this.c.booleanValue();
      paramqal.c(24);
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
    if (this.d != null)
    {
      boolean bool1 = this.d.booleanValue();
      paramqal.c(32);
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
    if (this.e != null)
    {
      opr localopr = this.e;
      paramqal.c(42);
      if (localopr.ak < 0) {
        localopr.ak = localopr.a();
      }
      paramqal.c(localopr.ak);
      localopr.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nua
 * JD-Core Version:    0.7.0.1
 */