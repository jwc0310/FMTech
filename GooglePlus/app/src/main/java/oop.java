public final class oop
  extends qan<oop>
{
  private opm[] a = opm.b();
  
  public oop()
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
        opm localopm = this.a[j];
        if (localopm != null)
        {
          int k = qal.d(8);
          int m = localopm.a();
          localopm.ak = m;
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
        opm localopm = this.a[i];
        if (localopm != null)
        {
          paramqal.c(10);
          if (localopm.ak < 0) {
            localopm.ak = localopm.a();
          }
          paramqal.c(localopm.ak);
          localopm.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oop
 * JD-Core Version:    0.7.0.1
 */