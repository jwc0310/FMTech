public final class ofk
  extends qan<ofk>
{
  public oed[] a = oed.a;
  
  public ofk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        oed localoed = this.a[j];
        if (localoed != null)
        {
          int k = qal.d(8);
          int m = localoed.a();
          localoed.ak = m;
          i += k + (m + qal.d(m));
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        oed localoed = this.a[i];
        if (localoed != null)
        {
          paramqal.c(10);
          if (localoed.ak < 0) {
            localoed.ak = localoed.a();
          }
          paramqal.c(localoed.ak);
          localoed.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ofk
 * JD-Core Version:    0.7.0.1
 */