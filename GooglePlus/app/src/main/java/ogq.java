public final class ogq
  extends qan<ogq>
{
  public ogr[] a = ogr.b();
  public opu b = null;
  private String c = null;
  
  public ogq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i1 = 0; i1 < this.a.length; i1++)
      {
        ogr localogr = this.a[i1];
        if (localogr != null)
        {
          int i2 = qal.d(8);
          int i3 = localogr.a();
          localogr.ak = i3;
          i += i2 + (i3 + qal.d(i3));
        }
      }
    }
    if (this.c != null)
    {
      String str = this.c;
      int m = qal.d(16);
      int n = qal.a(str);
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      opu localopu = this.b;
      int j = qal.d(24);
      int k = localopu.a();
      localopu.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        ogr localogr = this.a[i];
        if (localogr != null)
        {
          paramqal.c(10);
          if (localogr.ak < 0) {
            localogr.ak = localogr.a();
          }
          paramqal.c(localogr.ak);
          localogr.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      opu localopu = this.b;
      paramqal.c(26);
      if (localopu.ak < 0) {
        localopu.ak = localopu.a();
      }
      paramqal.c(localopu.ak);
      localopu.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogq
 * JD-Core Version:    0.7.0.1
 */