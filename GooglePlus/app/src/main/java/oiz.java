import java.nio.ByteBuffer;

public final class oiz
  extends qan<oiz>
{
  public Double a = null;
  public Double b = null;
  private Double c = null;
  private Double d = null;
  private Double e = null;
  private Boolean f = null;
  
  public oiz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    this.a.doubleValue();
    int j = i + (8 + qal.d(8));
    this.b.doubleValue();
    int k = j + (8 + qal.d(16));
    if (this.c != null)
    {
      this.c.doubleValue();
      k += 8 + qal.d(24);
    }
    if (this.d != null)
    {
      this.d.doubleValue();
      k += 8 + qal.d(32);
    }
    if (this.e != null)
    {
      this.e.doubleValue();
      k += 8 + qal.d(40);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      k += 1 + qal.d(48);
    }
    return k;
  }
  
  public final void a(qal paramqal)
  {
    double d1 = this.a.doubleValue();
    paramqal.c(9);
    paramqal.c(Double.doubleToLongBits(d1));
    double d2 = this.b.doubleValue();
    paramqal.c(17);
    paramqal.c(Double.doubleToLongBits(d2));
    if (this.c != null)
    {
      double d5 = this.c.doubleValue();
      paramqal.c(25);
      paramqal.c(Double.doubleToLongBits(d5));
    }
    if (this.d != null)
    {
      double d4 = this.d.doubleValue();
      paramqal.c(33);
      paramqal.c(Double.doubleToLongBits(d4));
    }
    if (this.e != null)
    {
      double d3 = this.e.doubleValue();
      paramqal.c(41);
      paramqal.c(Double.doubleToLongBits(d3));
    }
    if (this.f != null)
    {
      boolean bool = this.f.booleanValue();
      paramqal.c(48);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oiz
 * JD-Core Version:    0.7.0.1
 */