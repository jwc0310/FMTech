public final class oiw
  extends qan<oiw>
{
  private static volatile oiw[] a;
  private String b = null;
  private ojm[] c = ojm.b();
  private ojv[] d = ojv.b();
  private oki[] e = oki.b();
  
  public oiw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oiw[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new oiw[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str = this.b;
      int i9 = qal.d(8);
      int i10 = qal.a(str);
      i += i9 + (i10 + qal.d(i10));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.c.length; i6++)
      {
        ojm localojm = this.c[i6];
        if (localojm != null)
        {
          int i7 = qal.d(16);
          int i8 = localojm.a();
          localojm.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.d.length; i2++)
      {
        ojv localojv = this.d[i2];
        if (localojv != null)
        {
          int i3 = qal.d(24);
          int i4 = localojv.a();
          localojv.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      i = i1;
    }
    if (this.e != null)
    {
      int j = this.e.length;
      int k = 0;
      if (j > 0) {
        while (k < this.e.length)
        {
          oki localoki = this.e[k];
          if (localoki != null)
          {
            int m = qal.d(32);
            int n = localoki.a();
            localoki.ak = n;
            i += m + (n + qal.d(n));
          }
          k++;
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(10);
      paramqal.a(str);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int m = 0; m < this.c.length; m++)
      {
        ojm localojm = this.c[m];
        if (localojm != null)
        {
          paramqal.c(18);
          if (localojm.ak < 0) {
            localojm.ak = localojm.a();
          }
          paramqal.c(localojm.ak);
          localojm.a(paramqal);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int k = 0; k < this.d.length; k++)
      {
        ojv localojv = this.d[k];
        if (localojv != null)
        {
          paramqal.c(26);
          if (localojv.ak < 0) {
            localojv.ak = localojv.a();
          }
          paramqal.c(localojv.ak);
          localojv.a(paramqal);
        }
      }
    }
    if (this.e != null)
    {
      int i = this.e.length;
      int j = 0;
      if (i > 0) {
        while (j < this.e.length)
        {
          oki localoki = this.e[j];
          if (localoki != null)
          {
            paramqal.c(34);
            if (localoki.ak < 0) {
              localoki.ak = localoki.a();
            }
            paramqal.c(localoki.ak);
            localoki.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oiw
 * JD-Core Version:    0.7.0.1
 */