public final class okk
  extends qan<okk>
{
  public static final qao<okn, okk> a = new qao(11, okk.class, (int)337890090L, false);
  public oir b = null;
  private oif c = null;
  private ojv[] d = ojv.b();
  
  public okk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      oir localoir = this.b;
      int i3 = qal.d(8);
      int i4 = localoir.a();
      localoir.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      oif localoif = this.c;
      int i1 = qal.d(16);
      int i2 = localoif.a();
      localoif.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.d.length; k++)
      {
        ojv localojv = this.d[k];
        if (localojv != null)
        {
          int m = qal.d(24);
          int n = localojv.a();
          localojv.ak = n;
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
      oir localoir = this.b;
      paramqal.c(10);
      if (localoir.ak < 0) {
        localoir.ak = localoir.a();
      }
      paramqal.c(localoir.ak);
      localoir.a(paramqal);
    }
    if (this.c != null)
    {
      oif localoif = this.c;
      paramqal.c(18);
      if (localoif.ak < 0) {
        localoif.ak = localoif.a();
      }
      paramqal.c(localoif.ak);
      localoif.a(paramqal);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i = 0; i < this.d.length; i++)
      {
        ojv localojv = this.d[i];
        if (localojv != null)
        {
          paramqal.c(26);
          if (localojv.ak < 0) {
            localojv.ak = localojv.a();
          }
          paramqal.c(localojv.ak);
          localojv.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     okk
 * JD-Core Version:    0.7.0.1
 */