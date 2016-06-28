public final class ohx
  extends qan<ohx>
{
  public static final qao<oqw, ohx> a = new qao(11, ohx.class, (int)629777914L, false);
  public int b = -2147483648;
  private ogi c = null;
  
  public ohx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i1;
    int i2;
    if (this.b != -2147483648)
    {
      int n = this.b;
      i1 = qal.d(8);
      if (n >= 0) {
        i2 = qal.d(n);
      }
    }
    for (int j = i + (i2 + i1);; j = i)
    {
      if (this.c != null)
      {
        ogi localogi = this.c;
        int k = qal.d(16);
        int m = localogi.a();
        localogi.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i2 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      ogi localogi = this.c;
      paramqal.c(18);
      if (localogi.ak < 0) {
        localogi.ak = localogi.a();
      }
      paramqal.c(localogi.ak);
      localogi.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohx
 * JD-Core Version:    0.7.0.1
 */