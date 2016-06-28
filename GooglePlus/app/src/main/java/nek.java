public final class nek
  extends qan<nek>
{
  public ndt a = null;
  
  static
  {
    new qao(11, nek.class, (int)467779146L, false);
  }
  
  public nek()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ndt localndt = this.a;
      int j = qal.d(8);
      int k = localndt.a();
      localndt.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ndt localndt = this.a;
      paramqal.c(10);
      if (localndt.ak < 0) {
        localndt.ak = localndt.a();
      }
      paramqal.c(localndt.ak);
      localndt.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nek
 * JD-Core Version:    0.7.0.1
 */