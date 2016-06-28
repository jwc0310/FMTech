import java.nio.ByteBuffer;

public final class oas
  extends qan<oas>
{
  public Boolean a = null;
  private oav b = null;
  private oau c = null;
  private oat d = null;
  private obl e = null;
  
  public oas()
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
      oav localoav = this.b;
      int i3 = qal.d(16);
      int i4 = localoav.a();
      localoav.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      oat localoat = this.d;
      int i1 = qal.d(24);
      int i2 = localoat.a();
      localoat.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      oau localoau = this.c;
      int m = qal.d(32);
      int n = localoau.a();
      localoau.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      obl localobl = this.e;
      int j = qal.d(40);
      int k = localobl.a();
      localobl.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      boolean bool = this.a.booleanValue();
      paramqal.c(8);
      if (bool) {}
      byte b1;
      for (int i = 1;; i = 0)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.b != null)
    {
      oav localoav = this.b;
      paramqal.c(18);
      if (localoav.ak < 0) {
        localoav.ak = localoav.a();
      }
      paramqal.c(localoav.ak);
      localoav.a(paramqal);
    }
    if (this.d != null)
    {
      oat localoat = this.d;
      paramqal.c(26);
      if (localoat.ak < 0) {
        localoat.ak = localoat.a();
      }
      paramqal.c(localoat.ak);
      localoat.a(paramqal);
    }
    if (this.c != null)
    {
      oau localoau = this.c;
      paramqal.c(34);
      if (localoau.ak < 0) {
        localoau.ak = localoau.a();
      }
      paramqal.c(localoau.ak);
      localoau.a(paramqal);
    }
    if (this.e != null)
    {
      obl localobl = this.e;
      paramqal.c(42);
      if (localobl.ak < 0) {
        localobl.ak = localobl.a();
      }
      paramqal.c(localobl.ak);
      localobl.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oas
 * JD-Core Version:    0.7.0.1
 */