public final class nyx
  extends qan<nyx>
{
  public nvs a = null;
  public ntr b = null;
  
  public nyx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nvs localnvs = this.a;
      int m = qal.d(8);
      int n = localnvs.a();
      localnvs.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      ntr localntr = this.b;
      int j = qal.d(16);
      int k = localntr.a();
      localntr.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nvs localnvs = this.a;
      paramqal.c(10);
      if (localnvs.ak < 0) {
        localnvs.ak = localnvs.a();
      }
      paramqal.c(localnvs.ak);
      localnvs.a(paramqal);
    }
    if (this.b != null)
    {
      ntr localntr = this.b;
      paramqal.c(18);
      if (localntr.ak < 0) {
        localntr.ak = localntr.a();
      }
      paramqal.c(localntr.ak);
      localntr.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nyx
 * JD-Core Version:    0.7.0.1
 */