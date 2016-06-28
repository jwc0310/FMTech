public final class nrs
  extends qan<nrs>
{
  public ply a = null;
  private int b = -2147483648;
  
  public nrs()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ply localply = this.a;
      int n = qal.d(8);
      int i1 = localply.a();
      localply.ak = i1;
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
      ply localply = this.a;
      paramqal.c(10);
      if (localply.ak < 0) {
        localply.ak = localply.a();
      }
      paramqal.c(localply.ak);
      localply.a(paramqal);
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
 * Qualified Name:     nrs
 * JD-Core Version:    0.7.0.1
 */