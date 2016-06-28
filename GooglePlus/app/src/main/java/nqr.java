public final class nqr
  extends qan<nqr>
{
  public int a = -2147483648;
  public nrj b = null;
  private nrx c = null;
  private String d = null;
  private prq e = null;
  
  public nqr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i7;
    int i8;
    if (this.a != -2147483648)
    {
      int i6 = this.a;
      i7 = qal.d(8);
      if (i6 >= 0) {
        i8 = qal.d(i6);
      }
    }
    for (int j = i + (i8 + i7);; j = i)
    {
      if (this.b != null)
      {
        nrj localnrj = this.b;
        int i4 = qal.d(24);
        int i5 = localnrj.a();
        localnrj.ak = i5;
        j += i4 + (i5 + qal.d(i5));
      }
      if (this.c != null)
      {
        nrx localnrx = this.c;
        int i2 = qal.d(32);
        int i3 = localnrx.a();
        localnrx.ak = i3;
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.d != null)
      {
        String str = this.d;
        int n = qal.d(40);
        int i1 = qal.a(str);
        j += n + (i1 + qal.d(i1));
      }
      if (this.e != null)
      {
        prq localprq = this.e;
        int k = qal.d(48);
        int m = localprq.a();
        localprq.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i8 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int i = this.a;
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      nrj localnrj = this.b;
      paramqal.c(26);
      if (localnrj.ak < 0) {
        localnrj.ak = localnrj.a();
      }
      paramqal.c(localnrj.ak);
      localnrj.a(paramqal);
    }
    if (this.c != null)
    {
      nrx localnrx = this.c;
      paramqal.c(34);
      if (localnrx.ak < 0) {
        localnrx.ak = localnrx.a();
      }
      paramqal.c(localnrx.ak);
      localnrx.a(paramqal);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(42);
      paramqal.a(str);
    }
    if (this.e != null)
    {
      prq localprq = this.e;
      paramqal.c(50);
      if (localprq.ak < 0) {
        localprq.ak = localprq.a();
      }
      paramqal.c(localprq.ak);
      localprq.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqr
 * JD-Core Version:    0.7.0.1
 */