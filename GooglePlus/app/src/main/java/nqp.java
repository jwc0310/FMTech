public final class nqp
  extends qan<nqp>
{
  public int a = -2147483648;
  public nrj b = null;
  public String c = null;
  
  public nqp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i3;
    int i4;
    if (this.a != -2147483648)
    {
      int i2 = this.a;
      i3 = qal.d(8);
      if (i2 >= 0) {
        i4 = qal.d(i2);
      }
    }
    for (int j = i + (i4 + i3);; j = i)
    {
      if (this.b != null)
      {
        nrj localnrj = this.b;
        int n = qal.d(24);
        int i1 = localnrj.a();
        localnrj.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.c != null)
      {
        String str = this.c;
        int k = qal.d(32);
        int m = qal.a(str);
        j += k + (m + qal.d(m));
      }
      return j;
      i4 = 10;
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
      String str = this.c;
      paramqal.c(34);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqp
 * JD-Core Version:    0.7.0.1
 */