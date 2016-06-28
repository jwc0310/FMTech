public final class ofu
  extends qan<ofu>
{
  public int[] a = qay.a;
  public ofz b = null;
  private opp c = null;
  private oft d = null;
  
  public ofu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i5;
    if ((this.a != null) && (this.a.length > 0))
    {
      i5 = 0;
      if (i < this.a.length)
      {
        int i6 = this.a[i];
        if (i6 >= 0) {}
        for (int i7 = qal.d(i6);; i7 = 10)
        {
          i5 += i7;
          i++;
          break;
        }
      }
    }
    for (int k = j + i5 + 1 * this.a.length;; k = j)
    {
      if (this.c != null)
      {
        opp localopp = this.c;
        int i3 = qal.d(16);
        int i4 = localopp.a();
        localopp.ak = i4;
        k += i3 + (i4 + qal.d(i4));
      }
      if (this.b != null)
      {
        ofz localofz = this.b;
        int i1 = qal.d(24);
        int i2 = localofz.a();
        localofz.ak = i2;
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.d != null)
      {
        oft localoft = this.d;
        int m = qal.d(32);
        int n = localoft.a();
        localoft.ak = n;
        k += m + (n + qal.d(n));
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        int j = this.a[i];
        paramqal.c(8);
        paramqal.a(j);
      }
    }
    if (this.c != null)
    {
      opp localopp = this.c;
      paramqal.c(18);
      if (localopp.ak < 0) {
        localopp.ak = localopp.a();
      }
      paramqal.c(localopp.ak);
      localopp.a(paramqal);
    }
    if (this.b != null)
    {
      ofz localofz = this.b;
      paramqal.c(26);
      if (localofz.ak < 0) {
        localofz.ak = localofz.a();
      }
      paramqal.c(localofz.ak);
      localofz.a(paramqal);
    }
    if (this.d != null)
    {
      oft localoft = this.d;
      paramqal.c(34);
      if (localoft.ak < 0) {
        localoft.ak = localoft.a();
      }
      paramqal.c(localoft.ak);
      localoft.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ofu
 * JD-Core Version:    0.7.0.1
 */