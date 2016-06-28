public final class mgj
  extends qan<mgj>
{
  public Integer a = null;
  public String b = null;
  public mgk[] c = mgk.b();
  
  public mgj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i5;
    int i6;
    if (this.a != null)
    {
      int i4 = this.a.intValue();
      i5 = qal.d(8);
      if (i4 >= 0) {
        i6 = qal.d(i4);
      }
    }
    for (int j = i + (i6 + i5);; j = i)
    {
      if (this.b != null)
      {
        String str = this.b;
        int i2 = qal.d(16);
        int i3 = qal.a(str);
        j += i2 + (i3 + qal.d(i3));
      }
      if ((this.c != null) && (this.c.length > 0))
      {
        int k = j;
        int m = 0;
        for (;;)
        {
          if (m < this.c.length)
          {
            mgk localmgk = this.c[m];
            if (localmgk != null)
            {
              int n = qal.d(24);
              int i1 = localmgk.a();
              localmgk.ak = i1;
              k += n + (i1 + qal.d(i1));
            }
            m++;
            continue;
            i6 = 10;
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
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        mgk localmgk = this.c[i];
        if (localmgk != null)
        {
          paramqal.c(26);
          if (localmgk.ak < 0) {
            localmgk.ak = localmgk.a();
          }
          paramqal.c(localmgk.ak);
          localmgk.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mgj
 * JD-Core Version:    0.7.0.1
 */