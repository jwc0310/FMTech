public final class ntk
  extends qan<ntk>
{
  public String[] a = qay.f;
  private String[] b = qay.f;
  private ntl[] c = ntl.b();
  
  public ntk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i7;
    int i8;
    if ((this.a != null) && (this.a.length > 0))
    {
      int i6 = 0;
      i7 = 0;
      i8 = 0;
      while (i6 < this.a.length)
      {
        String str2 = this.a[i6];
        if (str2 != null)
        {
          i8++;
          int i9 = qal.a(str2);
          i7 += i9 + qal.d(i9);
        }
        i6++;
      }
    }
    for (int j = i + i7 + i8 * 1;; j = i)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < this.b.length)
        {
          String str1 = this.b[i2];
          if (str1 != null)
          {
            i4++;
            int i5 = qal.a(str1);
            i3 += i5 + qal.d(i5);
          }
          i2++;
        }
        j = j + i3 + i4 * 1;
      }
      if (this.c != null)
      {
        int k = this.c.length;
        int m = 0;
        if (k > 0) {
          while (m < this.c.length)
          {
            ntl localntl = this.c[m];
            if (localntl != null)
            {
              int n = qal.d(24);
              int i1 = localntl.a();
              localntl.ak = i1;
              j += n + (i1 + qal.d(i1));
            }
            m++;
          }
        }
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int m = 0; m < this.a.length; m++)
      {
        String str2 = this.a[m];
        if (str2 != null)
        {
          paramqal.c(10);
          paramqal.a(str2);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        String str1 = this.b[k];
        if (str1 != null)
        {
          paramqal.c(18);
          paramqal.a(str1);
        }
      }
    }
    if (this.c != null)
    {
      int i = this.c.length;
      int j = 0;
      if (i > 0) {
        while (j < this.c.length)
        {
          ntl localntl = this.c[j];
          if (localntl != null)
          {
            paramqal.c(26);
            if (localntl.ak < 0) {
              localntl.ak = localntl.a();
            }
            paramqal.c(localntl.ak);
            localntl.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ntk
 * JD-Core Version:    0.7.0.1
 */