public final class odl
  extends qan<odl>
{
  private static volatile odl[] e;
  public int a = -2147483648;
  public Integer b = null;
  public String c = null;
  public odu[] d = odu.b();
  
  public odl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static odl[] b()
  {
    if (e == null) {}
    synchronized (qar.a)
    {
      if (e == null) {
        e = new odl[0];
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i8;
    int i9;
    if (this.a != -2147483648)
    {
      int i7 = this.a;
      i8 = qal.d(8);
      if (i7 >= 0) {
        i9 = qal.d(i7);
      }
    }
    for (int k = j + (i9 + i8);; k = j)
    {
      if (this.b != null)
      {
        int i5 = this.b.intValue();
        int i6 = qal.d(16);
        if (i5 >= 0) {
          i = qal.d(i5);
        }
        k += i + i6;
      }
      if (this.c != null)
      {
        String str = this.c;
        int i3 = qal.d(24);
        int i4 = qal.a(str);
        k += i3 + (i4 + qal.d(i4));
      }
      if ((this.d != null) && (this.d.length > 0))
      {
        int m = k;
        int n = 0;
        for (;;)
        {
          if (n < this.d.length)
          {
            odu localodu = this.d[n];
            if (localodu != null)
            {
              int i1 = qal.d(32);
              int i2 = localodu.a();
              localodu.ak = i2;
              m += i1 + (i2 + qal.d(i2));
            }
            n++;
            continue;
            i9 = i;
            break;
          }
        }
        k = m;
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int k = this.a;
      paramqal.c(8);
      paramqal.a(k);
    }
    if (this.b != null)
    {
      int j = this.b.intValue();
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(26);
      paramqal.a(str);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i = 0; i < this.d.length; i++)
      {
        odu localodu = this.d[i];
        if (localodu != null)
        {
          paramqal.c(34);
          if (localodu.ak < 0) {
            localodu.ak = localodu.a();
          }
          paramqal.c(localodu.ak);
          localodu.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odl
 * JD-Core Version:    0.7.0.1
 */