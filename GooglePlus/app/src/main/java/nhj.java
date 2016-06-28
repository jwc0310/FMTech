public final class nhj
  extends qan<nhj>
{
  public static final qao<rcy, nhj> a = new qao(11, nhj.class, (int)404211578L, false);
  public nhi[] b = nhi.b();
  
  public nhj()
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
        nhi localnhi = this.b[j];
        if (localnhi != null)
        {
          int k = qal.d(8);
          int m = localnhi.a();
          localnhi.ak = m;
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
        nhi localnhi = this.b[i];
        if (localnhi != null)
        {
          paramqal.c(10);
          if (localnhi.ak < 0) {
            localnhi.ak = localnhi.a();
          }
          paramqal.c(localnhi.ak);
          localnhi.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nhj
 * JD-Core Version:    0.7.0.1
 */