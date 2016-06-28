public final class mmf
  extends qan<mmf>
{
  private int a = -2147483648;
  private mmh b = null;
  private mmj c = null;
  
  public mmf()
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
        mmh localmmh = this.b;
        int n = qal.d(16);
        int i1 = localmmh.a();
        localmmh.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.c != null)
      {
        mmj localmmj = this.c;
        int k = qal.d(24);
        int m = localmmj.a();
        localmmj.ak = m;
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
      mmh localmmh = this.b;
      paramqal.c(18);
      if (localmmh.ak < 0) {
        localmmh.ak = localmmh.a();
      }
      paramqal.c(localmmh.ak);
      localmmh.a(paramqal);
    }
    if (this.c != null)
    {
      mmj localmmj = this.c;
      paramqal.c(26);
      if (localmmj.ak < 0) {
        localmmj.ak = localmmj.a();
      }
      paramqal.c(localmmj.ak);
      localmmj.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mmf
 * JD-Core Version:    0.7.0.1
 */