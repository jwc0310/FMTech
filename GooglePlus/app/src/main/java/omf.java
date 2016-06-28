public final class omf
  extends qan<omf>
{
  private static volatile omf[] c;
  public omj a = null;
  public omk b = null;
  private omg[] d = omg.b();
  private omh[] e = omh.b();
  
  public omf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static omf[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new omf[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      omj localomj = this.a;
      int i7 = qal.d(8);
      int i8 = localomj.a();
      localomj.ak = i8;
      i += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      omk localomk = this.b;
      int i5 = qal.d(16);
      int i6 = localomk.a();
      localomk.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.d.length; i2++)
      {
        omg localomg = this.d[i2];
        if (localomg != null)
        {
          int i3 = qal.d(24);
          int i4 = localomg.a();
          localomg.ak = i4;
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
          omh localomh = this.e[k];
          if (localomh != null)
          {
            int m = qal.d(32);
            int n = localomh.a();
            localomh.ak = n;
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
    if (this.a != null)
    {
      omj localomj = this.a;
      paramqal.c(10);
      if (localomj.ak < 0) {
        localomj.ak = localomj.a();
      }
      paramqal.c(localomj.ak);
      localomj.a(paramqal);
    }
    if (this.b != null)
    {
      omk localomk = this.b;
      paramqal.c(18);
      if (localomk.ak < 0) {
        localomk.ak = localomk.a();
      }
      paramqal.c(localomk.ak);
      localomk.a(paramqal);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int k = 0; k < this.d.length; k++)
      {
        omg localomg = this.d[k];
        if (localomg != null)
        {
          paramqal.c(26);
          if (localomg.ak < 0) {
            localomg.ak = localomg.a();
          }
          paramqal.c(localomg.ak);
          localomg.a(paramqal);
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
          omh localomh = this.e[j];
          if (localomh != null)
          {
            paramqal.c(34);
            if (localomh.ak < 0) {
              localomh.ak = localomh.a();
            }
            paramqal.c(localomh.ak);
            localomh.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omf
 * JD-Core Version:    0.7.0.1
 */