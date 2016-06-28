public final class mix
  extends qan<mix>
{
  private int a = -2147483648;
  private miy b = null;
  
  public mix()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i1;
    int i2;
    if (this.a != -2147483648)
    {
      int n = this.a;
      i1 = qal.d(8);
      if (n >= 0) {
        i2 = qal.d(n);
      }
    }
    for (int j = i + (i2 + i1);; j = i)
    {
      if (this.b != null)
      {
        miy localmiy = this.b;
        int k = qal.d(16);
        int m = localmiy.a();
        localmiy.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i2 = 10;
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
      miy localmiy = this.b;
      paramqal.c(18);
      if (localmiy.ak < 0) {
        localmiy.ak = localmiy.a();
      }
      paramqal.c(localmiy.ak);
      localmiy.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mix
 * JD-Core Version:    0.7.0.1
 */