public final class mou
  extends qan<mou>
{
  private static volatile mou[] a;
  private mos b = null;
  private String c = null;
  private String d = null;
  private String e = null;
  private String f = null;
  private String g = null;
  private mpo h = null;
  
  public mou()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mou[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mou[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      mos localmos = this.b;
      int i9 = qal.d(8);
      int i10 = localmos.a();
      localmos.ak = i10;
      i += i9 + (i10 + qal.d(i10));
    }
    if (this.c != null)
    {
      String str5 = this.c;
      int i7 = qal.d(16);
      int i8 = qal.a(str5);
      i += i7 + (i8 + qal.d(i8));
    }
    if (this.d != null)
    {
      String str4 = this.d;
      int i5 = qal.d(24);
      int i6 = qal.a(str4);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.f != null)
    {
      String str3 = this.f;
      int i3 = qal.d(32);
      int i4 = qal.a(str3);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.e != null)
    {
      String str2 = this.e;
      int i1 = qal.d(40);
      int i2 = qal.a(str2);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.h != null)
    {
      mpo localmpo = this.h;
      int m = qal.d(48);
      int n = localmpo.a();
      localmpo.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.g != null)
    {
      String str1 = this.g;
      int j = qal.d(56);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      mos localmos = this.b;
      paramqal.c(10);
      if (localmos.ak < 0) {
        localmos.ak = localmos.a();
      }
      paramqal.c(localmos.ak);
      localmos.a(paramqal);
    }
    if (this.c != null)
    {
      String str5 = this.c;
      paramqal.c(18);
      paramqal.a(str5);
    }
    if (this.d != null)
    {
      String str4 = this.d;
      paramqal.c(26);
      paramqal.a(str4);
    }
    if (this.f != null)
    {
      String str3 = this.f;
      paramqal.c(34);
      paramqal.a(str3);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.h != null)
    {
      mpo localmpo = this.h;
      paramqal.c(50);
      if (localmpo.ak < 0) {
        localmpo.ak = localmpo.a();
      }
      paramqal.c(localmpo.ak);
      localmpo.a(paramqal);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(58);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mou
 * JD-Core Version:    0.7.0.1
 */