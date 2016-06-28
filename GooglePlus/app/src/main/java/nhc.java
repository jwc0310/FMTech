public final class nhc
  extends qan<nhc>
{
  private static volatile nhc[] b;
  public ojf[] a = ojf.b();
  private okn[] c = okn.b();
  private int d = -2147483648;
  private qbu e = null;
  
  public nhc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nhc[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new nhc[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i6 = i;
      for (int i7 = 0; i7 < this.a.length; i7++)
      {
        ojf localojf = this.a[i7];
        if (localojf != null)
        {
          int i8 = qal.d(8);
          int i9 = localojf.a();
          localojf.ak = i9;
          i6 += i8 + (i9 + qal.d(i9));
        }
      }
      i = i6;
    }
    int i3;
    int i4;
    if (this.d != -2147483648)
    {
      i3 = this.d;
      i4 = qal.d(16);
      if (i3 < 0) {
        break label268;
      }
    }
    label268:
    for (int i5 = qal.d(i3);; i5 = 10)
    {
      i += i5 + i4;
      if (this.e != null)
      {
        qbu localqbu = this.e;
        int i1 = qal.d(24);
        int i2 = localqbu.a();
        localqbu.ak = i2;
        i += i1 + (i2 + qal.d(i2));
      }
      if (this.c == null) {
        break;
      }
      int j = this.c.length;
      int k = 0;
      if (j <= 0) {
        break;
      }
      while (k < this.c.length)
      {
        okn localokn = this.c[k];
        if (localokn != null)
        {
          int m = qal.d(32);
          int n = localokn.a();
          localokn.ak = n;
          i += m + (n + qal.d(n));
        }
        k++;
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int m = 0; m < this.a.length; m++)
      {
        ojf localojf = this.a[m];
        if (localojf != null)
        {
          paramqal.c(10);
          if (localojf.ak < 0) {
            localojf.ak = localojf.a();
          }
          paramqal.c(localojf.ak);
          localojf.a(paramqal);
        }
      }
    }
    if (this.d != -2147483648)
    {
      int k = this.d;
      paramqal.c(16);
      paramqal.a(k);
    }
    if (this.e != null)
    {
      qbu localqbu = this.e;
      paramqal.c(26);
      if (localqbu.ak < 0) {
        localqbu.ak = localqbu.a();
      }
      paramqal.c(localqbu.ak);
      localqbu.a(paramqal);
    }
    if (this.c != null)
    {
      int i = this.c.length;
      int j = 0;
      if (i > 0) {
        while (j < this.c.length)
        {
          okn localokn = this.c[j];
          if (localokn != null)
          {
            paramqal.c(34);
            if (localokn.ak < 0) {
              localokn.ak = localokn.a();
            }
            paramqal.c(localokn.ak);
            localokn.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nhc
 * JD-Core Version:    0.7.0.1
 */