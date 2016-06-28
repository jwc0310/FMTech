public final class okj
  extends qan<okj>
{
  public int[] a = qay.a;
  public String[] b = qay.f;
  
  public okj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i3;
    if ((this.a != null) && (this.a.length > 0))
    {
      int i2 = 0;
      i3 = 0;
      if (i2 < this.a.length)
      {
        int i4 = this.a[i2];
        if (i4 >= 0) {}
        for (int i5 = qal.d(i4);; i5 = 10)
        {
          i3 += i5;
          i2++;
          break;
        }
      }
    }
    for (int k = j + i3 + 1 * this.a.length;; k = j)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int m = 0;
        int n = 0;
        while (i < this.b.length)
        {
          String str = this.b[i];
          if (str != null)
          {
            n++;
            int i1 = qal.a(str);
            m += i1 + qal.d(i1);
          }
          i++;
        }
        k = k + m + n * 1;
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int k = 0; k < this.a.length; k++)
      {
        int m = this.a[k];
        paramqal.c(8);
        paramqal.a(m);
      }
    }
    if (this.b != null)
    {
      int i = this.b.length;
      int j = 0;
      if (i > 0) {
        while (j < this.b.length)
        {
          String str = this.b[j];
          if (str != null)
          {
            paramqal.c(18);
            paramqal.a(str);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     okj
 * JD-Core Version:    0.7.0.1
 */