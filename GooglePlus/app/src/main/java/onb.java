public final class onb
  extends qan<onb>
{
  private Integer a = null;
  private String[] b = qay.f;
  private Long c = null;
  private Long d = null;
  
  public onb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
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
    for (int k = j + (i4 + i3);; k = j)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int m = 0;
        int n = 0;
        for (;;)
        {
          if (m < this.b.length)
          {
            String str = this.b[m];
            if (str != null)
            {
              n++;
              int i1 = qal.a(str);
              i += i1 + qal.d(i1);
            }
            m++;
            continue;
            i4 = 10;
            break;
          }
        }
        k = k + i + n * 1;
      }
      if (this.c != null)
      {
        long l2 = this.c.longValue();
        k += qal.d(24) + qal.b(l2);
      }
      if (this.d != null)
      {
        long l1 = this.d.longValue();
        k += qal.d(32) + qal.b(l1);
      }
      return k;
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
        String str = this.b[i];
        if (str != null)
        {
          paramqal.c(18);
          paramqal.a(str);
        }
      }
    }
    if (this.c != null)
    {
      long l2 = this.c.longValue();
      paramqal.c(24);
      paramqal.a(l2);
    }
    if (this.d != null)
    {
      long l1 = this.d.longValue();
      paramqal.c(32);
      paramqal.a(l1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     onb
 * JD-Core Version:    0.7.0.1
 */