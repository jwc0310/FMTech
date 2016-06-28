public final class rlb
  extends qan<rlb>
{
  public rlc[] a = rlc.b();
  private Integer b = null;
  private String[] c = qay.f;
  private String[] d = qay.f;
  
  public rlb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null) {
      i += qal.e(1, this.b.intValue());
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i3 = 0;
      int i4 = 0;
      int i5 = 0;
      while (i3 < this.c.length)
      {
        String str2 = this.c[i3];
        if (str2 != null)
        {
          i5++;
          int i6 = qal.a(str2);
          i4 += i6 + qal.d(i6);
        }
        i3++;
      }
      i = i + i4 + i5 * 1;
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int m = 0;
      int n = 0;
      int i1 = 0;
      while (m < this.d.length)
      {
        String str1 = this.d[m];
        if (str1 != null)
        {
          i1++;
          int i2 = qal.a(str1);
          n += i2 + qal.d(i2);
        }
        m++;
      }
      i = i + n + i1 * 1;
    }
    if (this.a != null)
    {
      int j = this.a.length;
      int k = 0;
      if (j > 0) {
        while (k < this.a.length)
        {
          rlc localrlc = this.a[k];
          if (localrlc != null) {
            i += qal.c(4, localrlc);
          }
          k++;
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null) {
      paramqal.a(1, this.b.intValue());
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int m = 0; m < this.c.length; m++)
      {
        String str2 = this.c[m];
        if (str2 != null) {
          paramqal.a(2, str2);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int k = 0; k < this.d.length; k++)
      {
        String str1 = this.d[k];
        if (str1 != null) {
          paramqal.a(3, str1);
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
          rlc localrlc = this.a[j];
          if (localrlc != null) {
            paramqal.a(4, localrlc);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rlb
 * JD-Core Version:    0.7.0.1
 */