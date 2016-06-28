public final class mpi
  extends qan<mpi>
{
  private static volatile mpi[] a;
  private mos b = null;
  private String c = null;
  private String d = null;
  private String e = null;
  private mpj[] f = mpj.b();
  
  public mpi()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mpi[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mpi[0];
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
      int i7 = qal.d(8);
      int i8 = localmos.a();
      localmos.ak = i8;
      i += i7 + (i8 + qal.d(i8));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i5 = qal.d(16);
      int i6 = qal.a(str3);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i3 = qal.d(24);
      int i4 = qal.a(str2);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.e != null)
    {
      String str1 = this.e;
      int i1 = qal.d(32);
      int i2 = qal.a(str1);
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.f.length; k++)
      {
        mpj localmpj = this.f[k];
        if (localmpj != null)
        {
          int m = qal.d(40);
          int n = localmpj.a();
          localmpj.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
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
      String str3 = this.c;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i = 0; i < this.f.length; i++)
      {
        mpj localmpj = this.f[i];
        if (localmpj != null)
        {
          paramqal.c(42);
          if (localmpj.ak < 0) {
            localmpj.ak = localmpj.a();
          }
          paramqal.c(localmpj.ak);
          localmpj.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpi
 * JD-Core Version:    0.7.0.1
 */