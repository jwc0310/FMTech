public final class ooz
  extends qan<ooz>
{
  private String a = null;
  private opa[] b = opa.b();
  
  public ooz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i1 = qal.d(8);
      int i2 = qal.a(str);
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        opa localopa = this.b[k];
        if (localopa != null)
        {
          int m = qal.d(16);
          int n = localopa.a();
          localopa.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        opa localopa = this.b[i];
        if (localopa != null)
        {
          paramqal.c(18);
          if (localopa.ak < 0) {
            localopa.ak = localopa.a();
          }
          paramqal.c(localopa.ak);
          localopa.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ooz
 * JD-Core Version:    0.7.0.1
 */