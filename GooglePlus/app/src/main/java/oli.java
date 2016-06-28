public final class oli
  extends qan<oli>
{
  private static volatile oli[] a;
  private String[] b = qay.f;
  private olj[] c = olj.b();
  
  public oli()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oli[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new oli[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int i3;
    int i4;
    if ((this.b != null) && (this.b.length > 0))
    {
      int i2 = 0;
      i3 = 0;
      i4 = 0;
      while (i2 < this.b.length)
      {
        String str = this.b[i2];
        if (str != null)
        {
          i4++;
          int i5 = qal.a(str);
          i3 += i5 + qal.d(i5);
        }
        i2++;
      }
    }
    for (int j = i + i3 + i4 * 1;; j = i)
    {
      if (this.c != null)
      {
        int k = this.c.length;
        int m = 0;
        if (k > 0) {
          while (m < this.c.length)
          {
            olj localolj = this.c[m];
            if (localolj != null)
            {
              int n = qal.d(16);
              int i1 = localolj.a();
              localolj.ak = i1;
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
      for (int k = 0; k < this.b.length; k++)
      {
        String str = this.b[k];
        if (str != null)
        {
          paramqal.c(10);
          paramqal.a(str);
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
          olj localolj = this.c[j];
          if (localolj != null)
          {
            paramqal.c(18);
            if (localolj.ak < 0) {
              localolj.ak = localolj.a();
            }
            paramqal.c(localolj.ak);
            localolj.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oli
 * JD-Core Version:    0.7.0.1
 */