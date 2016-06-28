public final class nzc
  extends qan<nzc>
{
  public static final qao<rcy, nzc> a = new qao(11, nzc.class, (int)347657602L, false);
  public nzd[] b = nzd.b();
  
  public nzc()
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
        nzd localnzd = this.b[j];
        if (localnzd != null)
        {
          int k = qal.d(8);
          int m = localnzd.a();
          localnzd.ak = m;
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
        nzd localnzd = this.b[i];
        if (localnzd != null)
        {
          paramqal.c(10);
          if (localnzd.ak < 0) {
            localnzd.ak = localnzd.a();
          }
          paramqal.c(localnzd.ak);
          localnzd.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzc
 * JD-Core Version:    0.7.0.1
 */