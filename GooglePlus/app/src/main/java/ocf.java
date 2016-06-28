public final class ocf
  extends qan<ocf>
{
  public obz[] a = obz.b();
  public String b = null;
  public String c = null;
  private obx d = null;
  private obw[] e = obw.b();
  
  public ocf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.d != null)
    {
      obx localobx = this.d;
      int i9 = qal.d(8);
      int i10 = localobx.a();
      localobx.ak = i10;
      i += i9 + (i10 + qal.d(i10));
    }
    if ((this.a != null) && (this.a.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.a.length; i6++)
      {
        obz localobz = this.a[i6];
        if (localobz != null)
        {
          int i7 = qal.d(16);
          int i8 = localobz.a();
          localobz.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if (this.e != null)
    {
      int i1 = this.e.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.e.length)
        {
          obw localobw = this.e[i2];
          if (localobw != null)
          {
            int i3 = qal.d(24);
            int i4 = localobw.a();
            localobw.ak = i4;
            i += i3 + (i4 + qal.d(i4));
          }
          i2++;
        }
      }
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int m = qal.d(32);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int j = qal.d(40);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.d != null)
    {
      obx localobx = this.d;
      paramqal.c(10);
      if (localobx.ak < 0) {
        localobx.ak = localobx.a();
      }
      paramqal.c(localobx.ak);
      localobx.a(paramqal);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int k = 0; k < this.a.length; k++)
      {
        obz localobz = this.a[k];
        if (localobz != null)
        {
          paramqal.c(18);
          if (localobz.ak < 0) {
            localobz.ak = localobz.a();
          }
          paramqal.c(localobz.ak);
          localobz.a(paramqal);
        }
      }
    }
    if (this.e != null)
    {
      int i = this.e.length;
      int j = 0;
      if (i > 0) {
        while (j < this.e.length)
        {
          obw localobw = this.e[j];
          if (localobw != null)
          {
            paramqal.c(26);
            if (localobw.ak < 0) {
              localobw.ak = localobw.a();
            }
            paramqal.c(localobw.ak);
            localobw.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ocf
 * JD-Core Version:    0.7.0.1
 */