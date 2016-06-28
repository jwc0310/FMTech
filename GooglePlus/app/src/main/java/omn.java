public final class omn
  extends qan<omn>
{
  private static volatile omn[] g;
  public orm a = null;
  public String b = null;
  public int c = -2147483648;
  public omo d = null;
  public ole e = null;
  public omw f = null;
  private olf h = null;
  
  public omn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static omn[] b()
  {
    if (g == null) {}
    synchronized (qar.a)
    {
      if (g == null) {
        g = new omn[0];
      }
      return g;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      orm localorm = this.a;
      int i10 = qal.d(8);
      int i11 = localorm.a();
      localorm.ak = i11;
      i += i10 + (i11 + qal.d(i11));
    }
    if (this.b != null)
    {
      String str = this.b;
      int i8 = qal.d(16);
      int i9 = qal.a(str);
      i += i8 + (i9 + qal.d(i9));
    }
    int i5;
    int i6;
    if (this.c != -2147483648)
    {
      i5 = this.c;
      i6 = qal.d(24);
      if (i5 < 0) {
        break label325;
      }
    }
    label325:
    for (int i7 = qal.d(i5);; i7 = 10)
    {
      i += i7 + i6;
      if (this.d != null)
      {
        omo localomo = this.d;
        int i3 = qal.d(32);
        int i4 = localomo.a();
        localomo.ak = i4;
        i += i3 + (i4 + qal.d(i4));
      }
      if (this.e != null)
      {
        ole localole = this.e;
        int i1 = qal.d(40);
        int i2 = localole.a();
        localole.ak = i2;
        i += i1 + (i2 + qal.d(i2));
      }
      if (this.f != null)
      {
        omw localomw = this.f;
        int m = qal.d(48);
        int n = localomw.a();
        localomw.ak = n;
        i += m + (n + qal.d(n));
      }
      if (this.h != null)
      {
        olf localolf = this.h;
        int j = qal.d(56);
        int k = localolf.a();
        localolf.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      orm localorm = this.a;
      paramqal.c(10);
      if (localorm.ak < 0) {
        localorm.ak = localorm.a();
      }
      paramqal.c(localorm.ak);
      localorm.a(paramqal);
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.c != -2147483648)
    {
      int i = this.c;
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.d != null)
    {
      omo localomo = this.d;
      paramqal.c(34);
      if (localomo.ak < 0) {
        localomo.ak = localomo.a();
      }
      paramqal.c(localomo.ak);
      localomo.a(paramqal);
    }
    if (this.e != null)
    {
      ole localole = this.e;
      paramqal.c(42);
      if (localole.ak < 0) {
        localole.ak = localole.a();
      }
      paramqal.c(localole.ak);
      localole.a(paramqal);
    }
    if (this.f != null)
    {
      omw localomw = this.f;
      paramqal.c(50);
      if (localomw.ak < 0) {
        localomw.ak = localomw.a();
      }
      paramqal.c(localomw.ak);
      localomw.a(paramqal);
    }
    if (this.h != null)
    {
      olf localolf = this.h;
      paramqal.c(58);
      if (localolf.ak < 0) {
        localolf.ak = localolf.a();
      }
      paramqal.c(localolf.ak);
      localolf.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omn
 * JD-Core Version:    0.7.0.1
 */