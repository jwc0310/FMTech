public final class ngb
  extends qan<ngb>
{
  public nei a = null;
  
  static
  {
    new qao(11, ngb.class, (int)414376562L, false);
  }
  
  public ngb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nei localnei = this.a;
      int j = qal.d(8);
      int k = localnei.a();
      localnei.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nei localnei = this.a;
      paramqal.c(10);
      if (localnei.ak < 0) {
        localnei.ak = localnei.a();
      }
      paramqal.c(localnei.ak);
      localnei.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ngb
 * JD-Core Version:    0.7.0.1
 */