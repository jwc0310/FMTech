public final class odh
  extends qan<odh>
{
  public static final qao<rcy, odh> a = new qao(11, odh.class, (int)357741202L, false);
  public oec[] b = oec.b();
  private String c = null;
  
  public odh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.b != null) && (this.b.length > 0)) {
      for (int m = 0; m < this.b.length; m++)
      {
        oec localoec = this.b[m];
        if (localoec != null)
        {
          int n = qal.d(8);
          int i1 = localoec.a();
          localoec.ak = i1;
          i += n + (i1 + qal.d(i1));
        }
      }
    }
    if (this.c != null)
    {
      String str = this.c;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        oec localoec = this.b[i];
        if (localoec != null)
        {
          paramqal.c(10);
          if (localoec.ak < 0) {
            localoec.ak = localoec.a();
          }
          paramqal.c(localoec.ak);
          localoec.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odh
 * JD-Core Version:    0.7.0.1
 */