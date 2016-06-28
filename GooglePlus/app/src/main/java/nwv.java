public final class nwv
  extends qan<nwv>
{
  private nwm a = null;
  private Float b = null;
  
  public nwv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nwm localnwm = this.a;
      int j = qal.d(8);
      int k = localnwm.a();
      localnwm.ak = k;
      i += j + (k + qal.d(k));
    }
    this.b.floatValue();
    return i + (4 + qal.d(16));
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nwm localnwm = this.a;
      paramqal.c(10);
      if (localnwm.ak < 0) {
        localnwm.ak = localnwm.a();
      }
      paramqal.c(localnwm.ak);
      localnwm.a(paramqal);
    }
    float f = this.b.floatValue();
    paramqal.c(21);
    paramqal.e(Float.floatToIntBits(f));
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwv
 * JD-Core Version:    0.7.0.1
 */