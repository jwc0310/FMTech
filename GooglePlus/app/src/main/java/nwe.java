public final class nwe
  extends qan<nwe>
{
  public Integer a = null;
  private nwm b = null;
  
  public nwe()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      nwm localnwm = this.b;
      int n = qal.d(8);
      int i1 = localnwm.a();
      localnwm.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.a != null)
    {
      j = this.a.intValue();
      k = qal.d(16);
      if (j < 0) {
        break label93;
      }
    }
    label93:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      nwm localnwm = this.b;
      paramqal.c(10);
      if (localnwm.ak < 0) {
        localnwm.ak = localnwm.a();
      }
      paramqal.c(localnwm.ak);
      localnwm.a(paramqal);
    }
    if (this.a != null)
    {
      int i = this.a.intValue();
      paramqal.c(16);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwe
 * JD-Core Version:    0.7.0.1
 */