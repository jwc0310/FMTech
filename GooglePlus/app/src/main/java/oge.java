public final class oge
  extends qan<oge>
{
  public ogb a = null;
  public ogd b = null;
  
  public oge()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ogb localogb = this.a;
      int m = qal.d(8);
      int n = localogb.a();
      localogb.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      ogd localogd = this.b;
      int j = qal.d(16);
      int k = localogd.a();
      localogd.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ogb localogb = this.a;
      paramqal.c(10);
      if (localogb.ak < 0) {
        localogb.ak = localogb.a();
      }
      paramqal.c(localogb.ak);
      localogb.a(paramqal);
    }
    if (this.b != null)
    {
      ogd localogd = this.b;
      paramqal.c(18);
      if (localogd.ak < 0) {
        localogd.ak = localogd.a();
      }
      paramqal.c(localogd.ak);
      localogd.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oge
 * JD-Core Version:    0.7.0.1
 */