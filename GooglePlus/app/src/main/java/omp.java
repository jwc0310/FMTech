public final class omp
  extends qan<omp>
{
  public int a = -2147483648;
  public olq b = null;
  private String c = null;
  private int d = -2147483648;
  
  static
  {
    new qao(11, omp.class, (int)158821898L, false);
  }
  
  public omp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i6;
    int i7;
    if (this.a != -2147483648)
    {
      int i5 = this.a;
      i6 = qal.d(8);
      if (i5 >= 0) {
        i7 = qal.d(i5);
      }
    }
    for (int k = j + (i7 + i6);; k = j)
    {
      if (this.c != null)
      {
        String str = this.c;
        int i3 = qal.d(16);
        int i4 = qal.a(str);
        k += i3 + (i4 + qal.d(i4));
      }
      if (this.b != null)
      {
        olq localolq = this.b;
        int i1 = qal.d(24);
        int i2 = localolq.a();
        localolq.ak = i2;
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.d != -2147483648)
      {
        int m = this.d;
        int n = qal.d(32);
        if (m >= 0) {
          i = qal.d(m);
        }
        k += i + n;
      }
      return k;
      i7 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int j = this.a;
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      olq localolq = this.b;
      paramqal.c(26);
      if (localolq.ak < 0) {
        localolq.ak = localolq.a();
      }
      paramqal.c(localolq.ak);
      localolq.a(paramqal);
    }
    if (this.d != -2147483648)
    {
      int i = this.d;
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omp
 * JD-Core Version:    0.7.0.1
 */