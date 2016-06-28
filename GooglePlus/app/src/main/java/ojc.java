public final class ojc
  extends qan<ojc>
{
  private int[] a = qay.a;
  private int[] b = qay.a;
  private int[] c = qay.a;
  
  public ojc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i7;
    if ((this.a != null) && (this.a.length > 0))
    {
      int i6 = 0;
      i7 = 0;
      if (i6 < this.a.length)
      {
        int i8 = this.a[i6];
        if (i8 >= 0) {}
        for (int i9 = qal.d(i8);; i9 = 10)
        {
          i7 += i9;
          i6++;
          break;
        }
      }
    }
    for (int k = j + i7 + 1 * this.a.length;; k = j)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int i2 = 0;
        int i3 = 0;
        if (i2 < this.b.length)
        {
          int i4 = this.b[i2];
          if (i4 >= 0) {}
          for (int i5 = qal.d(i4);; i5 = 10)
          {
            i3 += i5;
            i2++;
            break;
          }
        }
        k = k + i3 + 1 * this.b.length;
      }
      if ((this.c != null) && (this.c.length > 0))
      {
        int m = 0;
        if (i < this.c.length)
        {
          int n = this.c[i];
          if (n >= 0) {}
          for (int i1 = qal.d(n);; i1 = 10)
          {
            m += i1;
            i++;
            break;
          }
        }
        k = k + m + 1 * this.c.length;
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i1 = 0; i1 < this.a.length; i1++)
      {
        int i2 = this.a[i1];
        paramqal.c(8);
        paramqal.a(i2);
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int m = 0; m < this.b.length; m++)
      {
        int n = this.b[m];
        paramqal.c(16);
        paramqal.a(n);
      }
    }
    if (this.c != null)
    {
      int i = this.c.length;
      int j = 0;
      if (i > 0) {
        while (j < this.c.length)
        {
          int k = this.c[j];
          paramqal.c(24);
          paramqal.a(k);
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ojc
 * JD-Core Version:    0.7.0.1
 */