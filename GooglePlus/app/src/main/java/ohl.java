public final class ohl
  extends qan<ohl>
{
  public ona a = null;
  
  public ohl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ona localona = this.a;
      int j = qal.d(8);
      int k = localona.a();
      localona.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ona localona = this.a;
      paramqal.c(10);
      if (localona.ak < 0) {
        localona.ak = localona.a();
      }
      paramqal.c(localona.ak);
      localona.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohl
 * JD-Core Version:    0.7.0.1
 */