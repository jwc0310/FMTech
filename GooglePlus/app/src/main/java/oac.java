public final class oac
  extends qan<oac>
{
  public static final qao<rcy, oac> a = new qao(11, oac.class, (int)336946074L, false);
  public oab[] b = oab.b();
  
  public oac()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.b != null) && (this.b.length > 0)) {
      for (int j = 0; j < this.b.length; j++)
      {
        oab localoab = this.b[j];
        if (localoab != null)
        {
          int k = qal.d(8);
          int m = localoab.a();
          localoab.ak = m;
          i += k + (m + qal.d(m));
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        oab localoab = this.b[i];
        if (localoab != null)
        {
          paramqal.c(10);
          if (localoab.ak < 0) {
            localoab.ak = localoab.a();
          }
          paramqal.c(localoab.ak);
          localoab.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oac
 * JD-Core Version:    0.7.0.1
 */