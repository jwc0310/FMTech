public final class nec
  extends qan<nec>
{
  public ome a = null;
  
  static
  {
    new qao(11, nec.class, (int)458533490L, false);
  }
  
  public nec()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ome localome = this.a;
      int j = qal.d(8);
      int k = localome.a();
      localome.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ome localome = this.a;
      paramqal.c(10);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nec
 * JD-Core Version:    0.7.0.1
 */