public final class nxy
  extends qan<nxy>
{
  private nvh a = null;
  private nvh b = null;
  
  public nxy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nvh localnvh2 = this.a;
      int m = qal.d(8);
      int n = localnvh2.a();
      localnvh2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      nvh localnvh1 = this.b;
      int j = qal.d(16);
      int k = localnvh1.a();
      localnvh1.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nvh localnvh2 = this.a;
      paramqal.c(10);
      if (localnvh2.ak < 0) {
        localnvh2.ak = localnvh2.a();
      }
      paramqal.c(localnvh2.ak);
      localnvh2.a(paramqal);
    }
    if (this.b != null)
    {
      nvh localnvh1 = this.b;
      paramqal.c(18);
      if (localnvh1.ak < 0) {
        localnvh1.ak = localnvh1.a();
      }
      paramqal.c(localnvh1.ak);
      localnvh1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxy
 * JD-Core Version:    0.7.0.1
 */