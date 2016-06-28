public final class nqe
  extends qan<nqe>
{
  public ojm a = null;
  private int b = -2147483648;
  
  public nqe()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ojm localojm = this.a;
      int n = qal.d(8);
      int i1 = localojm.a();
      localojm.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.b != -2147483648)
    {
      j = this.b;
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
    if (this.a != null)
    {
      ojm localojm = this.a;
      paramqal.c(10);
      if (localojm.ak < 0) {
        localojm.ak = localojm.a();
      }
      paramqal.c(localojm.ak);
      localojm.a(paramqal);
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(16);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqe
 * JD-Core Version:    0.7.0.1
 */