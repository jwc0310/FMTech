public final class odj
  extends qan<odj>
{
  public static final qao<rcy, odj> a = new qao(11, odj.class, (int)358920186L, false);
  public odi[] b = odi.b();
  private oed[] c = oed.a;
  
  public odj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.c != null) && (this.c.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.c.length; i2++)
      {
        oed localoed = this.c[i2];
        if (localoed != null)
        {
          int i3 = qal.d(8);
          int i4 = localoed.a();
          localoed.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      i = i1;
    }
    if (this.b != null)
    {
      int j = this.b.length;
      int k = 0;
      if (j > 0) {
        while (k < this.b.length)
        {
          odi localodi = this.b[k];
          if (localodi != null)
          {
            int m = qal.d(16);
            int n = localodi.a();
            localodi.ak = n;
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
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        oed localoed = this.c[k];
        if (localoed != null)
        {
          paramqal.c(10);
          if (localoed.ak < 0) {
            localoed.ak = localoed.a();
          }
          paramqal.c(localoed.ak);
          localoed.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      int i = this.b.length;
      int j = 0;
      if (i > 0) {
        while (j < this.b.length)
        {
          odi localodi = this.b[j];
          if (localodi != null)
          {
            paramqal.c(18);
            if (localodi.ak < 0) {
              localodi.ak = localodi.a();
            }
            paramqal.c(localodi.ak);
            localodi.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odj
 * JD-Core Version:    0.7.0.1
 */