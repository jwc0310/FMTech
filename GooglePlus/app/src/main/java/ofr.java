public final class ofr
  extends qan<ofr>
{
  public ogb a = null;
  public ofq b = null;
  
  static
  {
    new qao(11, ofr.class, (int)525020514L, false);
  }
  
  public ofr()
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
      ofq localofq = this.b;
      int j = qal.d(16);
      int k = localofq.a();
      localofq.ak = k;
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
      ofq localofq = this.b;
      paramqal.c(18);
      if (localofq.ak < 0) {
        localofq.ak = localofq.a();
      }
      paramqal.c(localofq.ak);
      localofq.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ofr
 * JD-Core Version:    0.7.0.1
 */