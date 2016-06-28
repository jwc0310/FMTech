public final class odd
  extends qan<odd>
{
  public Long a = null;
  public ode[] b = ode.b();
  private Integer c = null;
  
  public odd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i3;
    int i4;
    if (this.c != null)
    {
      int i2 = this.c.intValue();
      i3 = qal.d(8);
      if (i2 >= 0) {
        i4 = qal.d(i2);
      }
    }
    for (int j = i + (i4 + i3);; j = i)
    {
      if (this.a != null)
      {
        long l = this.a.longValue();
        j += qal.d(16) + qal.b(l);
      }
      if ((this.b != null) && (this.b.length > 0))
      {
        int k = j;
        int m = 0;
        for (;;)
        {
          if (m < this.b.length)
          {
            ode localode = this.b[m];
            if (localode != null)
            {
              int n = qal.d(24);
              int i1 = localode.a();
              localode.ak = i1;
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
    if (this.c != null)
    {
      int j = this.c.intValue();
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.a != null)
    {
      long l = this.a.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        ode localode = this.b[i];
        if (localode != null)
        {
          paramqal.c(26);
          if (localode.ak < 0) {
            localode.ak = localode.a();
          }
          paramqal.c(localode.ak);
          localode.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odd
 * JD-Core Version:    0.7.0.1
 */