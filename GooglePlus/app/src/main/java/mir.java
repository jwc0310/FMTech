public final class mir
  extends qan<mir>
{
  private String[] a = qay.f;
  private String[] b = qay.f;
  
  public mir()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i3;
    int i4;
    if ((this.a != null) && (this.a.length > 0))
    {
      int i2 = 0;
      i3 = 0;
      i4 = 0;
      while (i2 < this.a.length)
      {
        String str2 = this.a[i2];
        if (str2 != null)
        {
          i4++;
          int i5 = qal.a(str2);
          i3 += i5 + qal.d(i5);
        }
        i2++;
      }
    }
    for (int k = j + i3 + i4 * 1;; k = j)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int m = 0;
        int n = 0;
        while (i < this.b.length)
        {
          String str1 = this.b[i];
          if (str1 != null)
          {
            n++;
            int i1 = qal.a(str1);
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
        String str2 = this.a[k];
        if (str2 != null)
        {
          paramqal.c(10);
          paramqal.a(str2);
        }
      }
    }
    if (this.b != null)
    {
      int i = this.b.length;
      int j = 0;
      if (i > 0) {
        while (j < this.b.length)
        {
          String str1 = this.b[j];
          if (str1 != null)
          {
            paramqal.c(18);
            paramqal.a(str1);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mir
 * JD-Core Version:    0.7.0.1
 */