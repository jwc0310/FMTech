public final class oes
  extends qan<oes>
{
  public int[] a = qay.a;
  public String b = null;
  
  public oes()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i1;
    if ((this.a != null) && (this.a.length > 0))
    {
      i1 = 0;
      if (i < this.a.length)
      {
        int i2 = this.a[i];
        if (i2 >= 0) {}
        for (int i3 = qal.d(i2);; i3 = 10)
        {
          i1 += i3;
          i++;
          break;
        }
      }
    }
    for (int k = j + i1 + 1 * this.a.length;; k = j)
    {
      if (this.b != null)
      {
        String str = this.b;
        int m = qal.d(16);
        int n = qal.a(str);
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
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oes
 * JD-Core Version:    0.7.0.1
 */