public final class mid
  extends qan<mid>
{
  public Integer a = null;
  public mia b = null;
  
  public mid()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i1;
    int i2;
    if (this.a != null)
    {
      int n = this.a.intValue();
      i1 = qal.d(8);
      if (n >= 0) {
        i2 = qal.d(n);
      }
    }
    for (int j = i + (i2 + i1);; j = i)
    {
      if (this.b != null)
      {
        mia localmia = this.b;
        int k = qal.d(16);
        int m = localmia.a();
        localmia.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i2 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int i = this.a.intValue();
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      mia localmia = this.b;
      paramqal.c(18);
      if (localmia.ak < 0) {
        localmia.ak = localmia.a();
      }
      paramqal.c(localmia.ak);
      localmia.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mid
 * JD-Core Version:    0.7.0.1
 */