public final class nnp
  extends qan<nnp>
{
  public int[] a = qay.a;
  public int[] b = qay.a;
  public String c = null;
  private String[] d = qay.f;
  private Integer e = null;
  
  public nnp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i10;
    int i11;
    if ((this.d != null) && (this.d.length > 0))
    {
      int i9 = 0;
      i10 = 0;
      i11 = 0;
      while (i9 < this.d.length)
      {
        String str2 = this.d[i9];
        if (str2 != null)
        {
          i11++;
          int i12 = qal.a(str2);
          i10 += i12 + qal.d(i12);
        }
        i9++;
      }
    }
    for (int k = j + i10 + i11 * 1;; k = j)
    {
      if ((this.a != null) && (this.a.length > 0))
      {
        int i5 = 0;
        int i6 = 0;
        if (i5 < this.a.length)
        {
          int i7 = this.a[i5];
          if (i7 >= 0) {}
          for (int i8 = qal.d(i7);; i8 = 10)
          {
            i6 += i8;
            i5++;
            break;
          }
        }
        k = k + i6 + 1 * this.a.length;
      }
      if ((this.b != null) && (this.b.length > 0))
      {
        int i2 = 0;
        if (i < this.b.length)
        {
          int i3 = this.b[i];
          if (i3 >= 0) {}
          for (int i4 = qal.d(i3);; i4 = 10)
          {
            i2 += i4;
            i++;
            break;
          }
        }
        k = k + i2 + 1 * this.b.length;
      }
      if (this.e != null)
      {
        int i1 = this.e.intValue();
        k += qal.d(32) + qal.d(i1);
      }
      if (this.c != null)
      {
        String str1 = this.c;
        int m = qal.d(40);
        int n = qal.a(str1);
        k += m + (n + qal.d(n));
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i2 = 0; i2 < this.d.length; i2++)
      {
        String str2 = this.d[i2];
        if (str2 != null)
        {
          paramqal.c(10);
          paramqal.a(str2);
        }
      }
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int n = 0; n < this.a.length; n++)
      {
        int i1 = this.a[n];
        paramqal.c(16);
        paramqal.a(i1);
      }
    }
    if (this.b != null)
    {
      int j = this.b.length;
      int k = 0;
      if (j > 0) {
        while (k < this.b.length)
        {
          int m = this.b[k];
          paramqal.c(24);
          paramqal.a(m);
          k++;
        }
      }
    }
    if (this.e != null)
    {
      int i = this.e.intValue();
      paramqal.c(32);
      paramqal.c(i);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nnp
 * JD-Core Version:    0.7.0.1
 */