public final class nmv
  extends qan<nmv>
{
  public nly a = null;
  public nig b = null;
  public njl c = null;
  
  public nmv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nly localnly = this.a;
      int i1 = qal.d(8);
      int i2 = localnly.a();
      localnly.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      nig localnig = this.b;
      int m = qal.d(16);
      int n = localnig.a();
      localnig.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      njl localnjl = this.c;
      int j = qal.d(24);
      int k = localnjl.a();
      localnjl.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nly localnly = this.a;
      paramqal.c(10);
      if (localnly.ak < 0) {
        localnly.ak = localnly.a();
      }
      paramqal.c(localnly.ak);
      localnly.a(paramqal);
    }
    if (this.b != null)
    {
      nig localnig = this.b;
      paramqal.c(18);
      if (localnig.ak < 0) {
        localnig.ak = localnig.a();
      }
      paramqal.c(localnig.ak);
      localnig.a(paramqal);
    }
    if (this.c != null)
    {
      njl localnjl = this.c;
      paramqal.c(26);
      if (localnjl.ak < 0) {
        localnjl.ak = localnjl.a();
      }
      paramqal.c(localnjl.ak);
      localnjl.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmv
 * JD-Core Version:    0.7.0.1
 */