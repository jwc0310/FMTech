public final class neb
  extends qan<neb>
{
  private Double a = null;
  private Double b = null;
  private Double c = null;
  private Double d = null;
  
  public neb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      this.a.doubleValue();
      i += 8 + qal.d(8);
    }
    if (this.b != null)
    {
      this.b.doubleValue();
      i += 8 + qal.d(16);
    }
    if (this.c != null)
    {
      this.c.doubleValue();
      i += 8 + qal.d(24);
    }
    if (this.d != null)
    {
      this.d.doubleValue();
      i += 8 + qal.d(32);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      double d4 = this.a.doubleValue();
      paramqal.c(9);
      paramqal.c(Double.doubleToLongBits(d4));
    }
    if (this.b != null)
    {
      double d3 = this.b.doubleValue();
      paramqal.c(17);
      paramqal.c(Double.doubleToLongBits(d3));
    }
    if (this.c != null)
    {
      double d2 = this.c.doubleValue();
      paramqal.c(25);
      paramqal.c(Double.doubleToLongBits(d2));
    }
    if (this.d != null)
    {
      double d1 = this.d.doubleValue();
      paramqal.c(33);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     neb
 * JD-Core Version:    0.7.0.1
 */