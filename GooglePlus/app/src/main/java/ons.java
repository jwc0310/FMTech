public final class ons
  extends qan<ons>
{
  private int a = -2147483648;
  private onq b = null;
  
  public ons()
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
        onq localonq = this.b;
        int k = qal.d(16);
        int m = localonq.a();
        localonq.ak = m;
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
      onq localonq = this.b;
      paramqal.c(18);
      if (localonq.ak < 0) {
        localonq.ak = localonq.a();
      }
      paramqal.c(localonq.ak);
      localonq.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ons
 * JD-Core Version:    0.7.0.1
 */