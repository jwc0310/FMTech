public final class fxw
{
  public final double a;
  public final double b;
  
  public fxw(double paramDouble1, double paramDouble2)
  {
    this.a = paramDouble1;
    this.b = paramDouble2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    fxw localfxw;
    do
    {
      return true;
      if (!(paramObject instanceof fxw)) {
        return false;
      }
      localfxw = (fxw)paramObject;
    } while ((Double.doubleToLongBits(this.a) == Double.doubleToLongBits(localfxw.a)) && (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(localfxw.b)));
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fxw
 * JD-Core Version:    0.7.0.1
 */