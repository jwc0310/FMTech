public final class nkh
  extends qan<nkh>
{
  private Integer a = null;
  private nkk b = null;
  private nkj[] c = nkj.b();
  private Long d = null;
  
  public nkh()
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
        nkk localnkk = this.b;
        int i2 = qal.d(16);
        int i3 = localnkk.a();
        localnkk.ak = i3;
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
            nkj localnkj = this.c[m];
            if (localnkj != null)
            {
              int n = qal.d(24);
              int i1 = localnkj.a();
              localnkj.ak = i1;
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
      if (this.d != null)
      {
        long l = this.d.longValue();
        j += qal.d(32) + qal.b(l);
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
      nkk localnkk = this.b;
      paramqal.c(18);
      if (localnkk.ak < 0) {
        localnkk.ak = localnkk.a();
      }
      paramqal.c(localnkk.ak);
      localnkk.a(paramqal);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        nkj localnkj = this.c[i];
        if (localnkj != null)
        {
          paramqal.c(26);
          if (localnkj.ak < 0) {
            localnkj.ak = localnkj.a();
          }
          paramqal.c(localnkj.ak);
          localnkj.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      long l = this.d.longValue();
      paramqal.c(32);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nkh
 * JD-Core Version:    0.7.0.1
 */