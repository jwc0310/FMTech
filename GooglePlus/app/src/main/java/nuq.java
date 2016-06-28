public final class nuq
  extends qan<nuq>
{
  public nuc a = null;
  
  static
  {
    new qao(11, nuq.class, (int)480851570L, false);
  }
  
  public nuq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nuc localnuc = this.a;
      int j = qal.d(8);
      int k = localnuc.a();
      localnuc.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nuc localnuc = this.a;
      paramqal.c(10);
      if (localnuc.ak < 0) {
        localnuc.ak = localnuc.a();
      }
      paramqal.c(localnuc.ak);
      localnuc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nuq
 * JD-Core Version:    0.7.0.1
 */