public final class okv
  extends qan<okv>
{
  public oky a = null;
  public Integer b = null;
  
  public okv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oky localoky = this.a;
      int n = qal.d(8);
      int i1 = localoky.a();
      localoky.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.b != null)
    {
      j = this.b.intValue();
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
    if (this.a != null)
    {
      oky localoky = this.a;
      paramqal.c(10);
      if (localoky.ak < 0) {
        localoky.ak = localoky.a();
      }
      paramqal.c(localoky.ak);
      localoky.a(paramqal);
    }
    if (this.b != null)
    {
      int i = this.b.intValue();
      paramqal.c(16);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     okv
 * JD-Core Version:    0.7.0.1
 */