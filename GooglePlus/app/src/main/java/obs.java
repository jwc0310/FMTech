public final class obs
  extends qan<obs>
{
  public obj a = null;
  public obo b = null;
  private obb c = null;
  
  public obs()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      obj localobj = this.a;
      int i1 = qal.d(8);
      int i2 = localobj.a();
      localobj.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      obo localobo = this.b;
      int m = qal.d(16);
      int n = localobo.a();
      localobo.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      obb localobb = this.c;
      int j = qal.d(24);
      int k = localobb.a();
      localobb.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      obj localobj = this.a;
      paramqal.c(10);
      if (localobj.ak < 0) {
        localobj.ak = localobj.a();
      }
      paramqal.c(localobj.ak);
      localobj.a(paramqal);
    }
    if (this.b != null)
    {
      obo localobo = this.b;
      paramqal.c(18);
      if (localobo.ak < 0) {
        localobo.ak = localobo.a();
      }
      paramqal.c(localobo.ak);
      localobo.a(paramqal);
    }
    if (this.c != null)
    {
      obb localobb = this.c;
      paramqal.c(26);
      if (localobb.ak < 0) {
        localobb.ak = localobb.a();
      }
      paramqal.c(localobb.ak);
      localobb.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     obs
 * JD-Core Version:    0.7.0.1
 */