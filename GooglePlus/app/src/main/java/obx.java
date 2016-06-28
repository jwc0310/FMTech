public final class obx
  extends qan<obx>
{
  private obw[] a = obw.b();
  private String b = null;
  private String c = null;
  private oby d = null;
  
  public obx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i3 = 0; i3 < this.a.length; i3++)
      {
        obw localobw = this.a[i3];
        if (localobw != null)
        {
          int i4 = qal.d(8);
          int i5 = localobw.a();
          localobw.ak = i5;
          i += i4 + (i5 + qal.d(i5));
        }
      }
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i1 = qal.d(16);
      int i2 = qal.a(str2);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int m = qal.d(24);
      int n = qal.a(str1);
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      oby localoby = this.d;
      int j = qal.d(32);
      int k = localoby.a();
      localoby.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        obw localobw = this.a[i];
        if (localobw != null)
        {
          paramqal.c(10);
          if (localobw.ak < 0) {
            localobw.ak = localobw.a();
          }
          paramqal.c(localobw.ak);
          localobw.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(26);
      paramqal.a(str1);
    }
    if (this.d != null)
    {
      oby localoby = this.d;
      paramqal.c(34);
      if (localoby.ak < 0) {
        localoby.ak = localoby.a();
      }
      paramqal.c(localoby.ak);
      localoby.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     obx
 * JD-Core Version:    0.7.0.1
 */