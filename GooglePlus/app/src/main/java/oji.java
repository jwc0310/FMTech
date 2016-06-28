public final class oji
  extends qan<oji>
{
  public Double a = null;
  public Double b = null;
  public Double c = null;
  public Double d = null;
  
  public oji()
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
    this.c.doubleValue();
    int m = k + (8 + qal.d(24));
    this.d.doubleValue();
    return m + (8 + qal.d(32));
  }
  
  public final void a(qal paramqal)
  {
    double d1 = this.a.doubleValue();
    paramqal.c(9);
    paramqal.c(Double.doubleToLongBits(d1));
    double d2 = this.b.doubleValue();
    paramqal.c(17);
    paramqal.c(Double.doubleToLongBits(d2));
    double d3 = this.c.doubleValue();
    paramqal.c(25);
    paramqal.c(Double.doubleToLongBits(d3));
    double d4 = this.d.doubleValue();
    paramqal.c(33);
    paramqal.c(Double.doubleToLongBits(d4));
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oji
 * JD-Core Version:    0.7.0.1
 */