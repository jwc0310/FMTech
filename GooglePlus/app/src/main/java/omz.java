public final class omz
  extends qan<omz>
{
  public Integer a = null;
  public omy[] b = omy.b();
  
  public omz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i3;
    int i4;
    if (this.a != null)
    {
      int i2 = this.a.intValue();
      i3 = qal.d(8);
      if (i2 >= 0) {
        i4 = qal.d(i2);
      }
    }
    for (int j = i + (i4 + i3);; j = i)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int k = j;
        int m = 0;
        for (;;)
        {
          if (m < this.b.length)
          {
            omy localomy = this.b[m];
            if (localomy != null)
            {
              int n = qal.d(16);
              int i1 = localomy.a();
              localomy.ak = i1;
              k += n + (i1 + qal.d(i1));
            }
            m++;
            continue;
            i4 = 10;
            break;
          }
        }
        j = k;
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int j = this.a.intValue();
      paramqal.c(8);
      paramqal.a(j);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        omy localomy = this.b[i];
        if (localomy != null)
        {
          paramqal.c(18);
          if (localomy.ak < 0) {
            localomy.ak = localomy.a();
          }
          paramqal.c(localomy.ak);
          localomy.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omz
 * JD-Core Version:    0.7.0.1
 */