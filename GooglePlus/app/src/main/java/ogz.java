public final class ogz
  extends qan<ogz>
{
  public String[] a = qay.f;
  public int b = -2147483648;
  public int c = -2147483648;
  public omi d = null;
  
  public ogz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = 0;
    int k = super.a();
    int i7;
    int i8;
    if ((this.a != null) && (this.a.length > 0))
    {
      i7 = 0;
      i8 = 0;
      while (j < this.a.length)
      {
        String str = this.a[j];
        if (str != null)
        {
          i8++;
          int i9 = qal.a(str);
          i7 += i9 + qal.d(i9);
        }
        j++;
      }
    }
    for (int m = k + i7 + i8 * 1;; m = k)
    {
      int i4;
      int i5;
      if (this.b != -2147483648)
      {
        i4 = this.b;
        i5 = qal.d(16);
        if (i4 < 0) {
          break label232;
        }
      }
      label232:
      for (int i6 = qal.d(i4);; i6 = i)
      {
        m += i6 + i5;
        if (this.c != -2147483648)
        {
          int i2 = this.c;
          int i3 = qal.d(24);
          if (i2 >= 0) {
            i = qal.d(i2);
          }
          m += i3 + i;
        }
        if (this.d != null)
        {
          omi localomi = this.d;
          int n = qal.d(32);
          int i1 = localomi.a();
          localomi.ak = i1;
          m += n + (i1 + qal.d(i1));
        }
        return m;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int k = 0; k < this.a.length; k++)
      {
        String str = this.a[k];
        if (str != null)
        {
          paramqal.c(10);
          paramqal.a(str);
        }
      }
    }
    if (this.b != -2147483648)
    {
      int j = this.b;
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.c != -2147483648)
    {
      int i = this.c;
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.d != null)
    {
      omi localomi = this.d;
      paramqal.c(34);
      if (localomi.ak < 0) {
        localomi.ak = localomi.a();
      }
      paramqal.c(localomi.ak);
      localomi.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogz
 * JD-Core Version:    0.7.0.1
 */