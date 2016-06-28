public final class mly
  extends qan<mly>
{
  private String[] a = qay.f;
  private String b = null;
  
  public mly()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i1;
    int i2;
    if ((this.a != null) && (this.a.length > 0))
    {
      i1 = 0;
      i2 = 0;
      while (i < this.a.length)
      {
        String str2 = this.a[i];
        if (str2 != null)
        {
          i2++;
          int i3 = qal.a(str2);
          i1 += i3 + qal.d(i3);
        }
        i++;
      }
    }
    for (int k = j + i1 + i2 * 1;; k = j)
    {
      if (this.b != null)
      {
        String str1 = this.b;
        int m = qal.d(16);
        int n = qal.a(str1);
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
        String str2 = this.a[i];
        if (str2 != null)
        {
          paramqal.c(10);
          paramqal.a(str2);
        }
      }
    }
    if (this.b != null)
    {
      String str1 = this.b;
      paramqal.c(18);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mly
 * JD-Core Version:    0.7.0.1
 */