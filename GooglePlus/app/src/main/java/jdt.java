public final class jdt
  extends qan<jdt>
{
  private static volatile jdt[] f;
  public String a = null;
  public mke b = null;
  public mkf c = null;
  public int d = -2147483648;
  public mjc e = null;
  
  public jdt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static jdt[] b()
  {
    if (f == null) {}
    synchronized (qar.a)
    {
      if (f == null) {
        f = new jdt[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i6 = qal.d(8);
      int i7 = qal.a(str);
      i += i6 + (i7 + qal.d(i7));
    }
    if (this.b != null)
    {
      mke localmke = this.b;
      int i4 = qal.d(16);
      int i5 = localmke.a();
      localmke.ak = i5;
      i += i4 + (i5 + qal.d(i5));
    }
    if (this.c != null)
    {
      mkf localmkf = this.c;
      int i2 = qal.d(24);
      int i3 = localmkf.a();
      localmkf.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.d != -2147483648)
    {
      m = this.d;
      n = qal.d(32);
      if (m < 0) {
        break label229;
      }
    }
    label229:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.e != null)
      {
        mjc localmjc = this.e;
        int j = qal.d(40);
        int k = localmjc.a();
        localmjc.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      mke localmke = this.b;
      paramqal.c(18);
      if (localmke.ak < 0) {
        localmke.ak = localmke.a();
      }
      paramqal.c(localmke.ak);
      localmke.a(paramqal);
    }
    if (this.c != null)
    {
      mkf localmkf = this.c;
      paramqal.c(26);
      if (localmkf.ak < 0) {
        localmkf.ak = localmkf.a();
      }
      paramqal.c(localmkf.ak);
      localmkf.a(paramqal);
    }
    if (this.d != -2147483648)
    {
      int i = this.d;
      paramqal.c(32);
      paramqal.a(i);
    }
    if (this.e != null)
    {
      mjc localmjc = this.e;
      paramqal.c(42);
      if (localmjc.ak < 0) {
        localmjc.ak = localmjc.a();
      }
      paramqal.c(localmjc.ak);
      localmjc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdt
 * JD-Core Version:    0.7.0.1
 */