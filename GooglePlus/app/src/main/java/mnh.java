public final class mnh
  extends qan<mnh>
{
  private static volatile mnh[] b;
  public String a = null;
  private mos c = null;
  private String d = null;
  private String e = null;
  private String f = null;
  private mnk[] g = mnk.b();
  private mni[] h = mni.b();
  
  public mnh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mnh[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new mnh[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.c != null)
    {
      mos localmos = this.c;
      int i13 = qal.d(8);
      int i14 = localmos.a();
      localmos.ak = i14;
      i += i13 + (i14 + qal.d(i14));
    }
    if (this.a != null)
    {
      String str4 = this.a;
      int i11 = qal.d(16);
      int i12 = qal.a(str4);
      i += i11 + (i12 + qal.d(i12));
    }
    if (this.d != null)
    {
      String str3 = this.d;
      int i9 = qal.d(24);
      int i10 = qal.a(str3);
      i += i9 + (i10 + qal.d(i10));
    }
    if (this.e != null)
    {
      String str2 = this.e;
      int i7 = qal.d(32);
      int i8 = qal.a(str2);
      i += i7 + (i8 + qal.d(i8));
    }
    if ((this.g != null) && (this.g.length > 0))
    {
      int i3 = i;
      for (int i4 = 0; i4 < this.g.length; i4++)
      {
        mnk localmnk = this.g[i4];
        if (localmnk != null)
        {
          int i5 = qal.d(40);
          int i6 = localmnk.a();
          localmnk.ak = i6;
          i3 += i5 + (i6 + qal.d(i6));
        }
      }
      i = i3;
    }
    if (this.f != null)
    {
      String str1 = this.f;
      int i1 = qal.d(48);
      int i2 = qal.a(str1);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.h != null)
    {
      int j = this.h.length;
      int k = 0;
      if (j > 0) {
        while (k < this.h.length)
        {
          mni localmni = this.h[k];
          if (localmni != null)
          {
            int m = qal.d(56);
            int n = localmni.a();
            localmni.ak = n;
            i += m + (n + qal.d(n));
          }
          k++;
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      mos localmos = this.c;
      paramqal.c(10);
      if (localmos.ak < 0) {
        localmos.ak = localmos.a();
      }
      paramqal.c(localmos.ak);
      localmos.a(paramqal);
    }
    if (this.a != null)
    {
      String str4 = this.a;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if (this.d != null)
    {
      String str3 = this.d;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int k = 0; k < this.g.length; k++)
      {
        mnk localmnk = this.g[k];
        if (localmnk != null)
        {
          paramqal.c(42);
          if (localmnk.ak < 0) {
            localmnk.ak = localmnk.a();
          }
          paramqal.c(localmnk.ak);
          localmnk.a(paramqal);
        }
      }
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(50);
      paramqal.a(str1);
    }
    if (this.h != null)
    {
      int i = this.h.length;
      int j = 0;
      if (i > 0) {
        while (j < this.h.length)
        {
          mni localmni = this.h[j];
          if (localmni != null)
          {
            paramqal.c(58);
            if (localmni.ak < 0) {
              localmni.ak = localmni.a();
            }
            paramqal.c(localmni.ak);
            localmni.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mnh
 * JD-Core Version:    0.7.0.1
 */