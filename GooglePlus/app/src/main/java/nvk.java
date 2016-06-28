public final class nvk
  extends qan<nvk>
{
  private nwm a = null;
  private nvj[] b = nvj.b();
  
  public nvk()
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
      int i1 = qal.d(8);
      int i2 = localnwm.a();
      localnwm.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        nvj localnvj = this.b[k];
        if (localnvj != null)
        {
          int m = qal.d(16);
          int n = localnvj.a();
          localnvj.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
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
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        nvj localnvj = this.b[i];
        if (localnvj != null)
        {
          paramqal.c(18);
          if (localnvj.ak < 0) {
            localnvj.ak = localnvj.a();
          }
          paramqal.c(localnvj.ak);
          localnvj.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nvk
 * JD-Core Version:    0.7.0.1
 */