public final class nqx
  extends qan<nqx>
{
  public int a = -2147483648;
  private nqy b = null;
  
  public nqx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      nqy localnqy = this.b;
      int n = qal.d(8);
      int i1 = localnqy.a();
      localnqy.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.a != -2147483648)
    {
      j = this.a;
      k = qal.d(16);
      if (j < 0) {
        break label92;
      }
    }
    label92:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      nqy localnqy = this.b;
      paramqal.c(10);
      if (localnqy.ak < 0) {
        localnqy.ak = localnqy.a();
      }
      paramqal.c(localnqy.ak);
      localnqy.a(paramqal);
    }
    if (this.a != -2147483648)
    {
      int i = this.a;
      paramqal.c(16);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqx
 * JD-Core Version:    0.7.0.1
 */