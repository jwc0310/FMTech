public final class ogy
  extends qan<ogy>
{
  public omr[] a = omr.b();
  private int[] b = qay.a;
  private omr[] c = omr.b();
  
  public ogy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i7;
    if ((this.b != null) && (this.b.length > 0))
    {
      int i6 = 0;
      i7 = 0;
      if (i6 < this.b.length)
      {
        int i8 = this.b[i6];
        if (i8 >= 0) {}
        for (int i9 = qal.d(i8);; i9 = 10)
        {
          i7 += i9;
          i6++;
          break;
        }
      }
    }
    for (int j = i + i7 + 1 * this.b.length;; j = i)
    {
      if ((this.c != null) && (this.c.length > 0))
      {
        int i2 = j;
        for (int i3 = 0; i3 < this.c.length; i3++)
        {
          omr localomr2 = this.c[i3];
          if (localomr2 != null)
          {
            int i4 = qal.d(16);
            int i5 = localomr2.a();
            localomr2.ak = i5;
            i2 += i4 + (i5 + qal.d(i5));
          }
        }
        j = i2;
      }
      if (this.a != null)
      {
        int k = this.a.length;
        int m = 0;
        if (k > 0) {
          while (m < this.a.length)
          {
            omr localomr1 = this.a[m];
            if (localomr1 != null)
            {
              int n = qal.d(24);
              int i1 = localomr1.a();
              localomr1.ak = i1;
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
    if ((this.b != null) && (this.b.length > 0)) {
      for (int m = 0; m < this.b.length; m++)
      {
        int n = this.b[m];
        paramqal.c(8);
        paramqal.a(n);
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        omr localomr2 = this.c[k];
        if (localomr2 != null)
        {
          paramqal.c(18);
          if (localomr2.ak < 0) {
            localomr2.ak = localomr2.a();
          }
          paramqal.c(localomr2.ak);
          localomr2.a(paramqal);
        }
      }
    }
    if (this.a != null)
    {
      int i = this.a.length;
      int j = 0;
      if (i > 0) {
        while (j < this.a.length)
        {
          omr localomr1 = this.a[j];
          if (localomr1 != null)
          {
            paramqal.c(26);
            if (localomr1.ak < 0) {
              localomr1.ak = localomr1.a();
            }
            paramqal.c(localomr1.ak);
            localomr1.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogy
 * JD-Core Version:    0.7.0.1
 */