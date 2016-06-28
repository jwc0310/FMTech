public final class nng
  extends qan<nng>
{
  private static volatile nng[] d;
  public String a = null;
  public int b = -2147483648;
  public nnh c = null;
  
  public nng()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nng[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new nng[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i2 = qal.d(8);
      int i3 = qal.a(str);
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.b != -2147483648)
    {
      m = this.b;
      n = qal.d(16);
      if (m < 0) {
        break label133;
      }
    }
    label133:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.c != null)
      {
        nnh localnnh = this.c;
        int j = qal.d(24);
        int k = localnnh.a();
        localnnh.ak = k;
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
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      nnh localnnh = this.c;
      paramqal.c(26);
      if (localnnh.ak < 0) {
        localnnh.ak = localnnh.a();
      }
      paramqal.c(localnnh.ak);
      localnnh.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nng
 * JD-Core Version:    0.7.0.1
 */