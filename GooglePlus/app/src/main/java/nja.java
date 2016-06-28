public final class nja
  extends qan<nja>
{
  private Integer a = null;
  private int b = -2147483648;
  private njb c = null;
  private njb d = null;
  
  public nja()
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
    if (this.a != null)
    {
      int i5 = this.a.intValue();
      i6 = qal.d(8);
      if (i5 >= 0) {
        i7 = qal.d(i5);
      }
    }
    for (int k = j + (i7 + i6);; k = j)
    {
      if (this.b != -2147483648)
      {
        int i3 = this.b;
        int i4 = qal.d(16);
        if (i3 >= 0) {
          i = qal.d(i3);
        }
        k += i + i4;
      }
      if (this.c != null)
      {
        njb localnjb2 = this.c;
        int i1 = qal.d(24);
        int i2 = localnjb2.a();
        localnjb2.ak = i2;
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.d != null)
      {
        njb localnjb1 = this.d;
        int m = qal.d(32);
        int n = localnjb1.a();
        localnjb1.ak = n;
        k += m + (n + qal.d(n));
      }
      return k;
      i7 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int j = this.a.intValue();
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      njb localnjb2 = this.c;
      paramqal.c(26);
      if (localnjb2.ak < 0) {
        localnjb2.ak = localnjb2.a();
      }
      paramqal.c(localnjb2.ak);
      localnjb2.a(paramqal);
    }
    if (this.d != null)
    {
      njb localnjb1 = this.d;
      paramqal.c(34);
      if (localnjb1.ak < 0) {
        localnjb1.ak = localnjb1.a();
      }
      paramqal.c(localnjb1.ak);
      localnjb1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nja
 * JD-Core Version:    0.7.0.1
 */