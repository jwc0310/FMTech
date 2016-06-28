public final class oht
  extends qan<oht>
{
  public ohu a = null;
  public ohu b = null;
  public ohu[] c = ohu.b();
  
  public oht()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ohu localohu3 = this.a;
      int i3 = qal.d(8);
      int i4 = localohu3.a();
      localohu3.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      ohu localohu2 = this.b;
      int i1 = qal.d(16);
      int i2 = localohu2.a();
      localohu2.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.c.length; k++)
      {
        ohu localohu1 = this.c[k];
        if (localohu1 != null)
        {
          int m = qal.d(24);
          int n = localohu1.a();
          localohu1.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ohu localohu3 = this.a;
      paramqal.c(10);
      if (localohu3.ak < 0) {
        localohu3.ak = localohu3.a();
      }
      paramqal.c(localohu3.ak);
      localohu3.a(paramqal);
    }
    if (this.b != null)
    {
      ohu localohu2 = this.b;
      paramqal.c(18);
      if (localohu2.ak < 0) {
        localohu2.ak = localohu2.a();
      }
      paramqal.c(localohu2.ak);
      localohu2.a(paramqal);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        ohu localohu1 = this.c[i];
        if (localohu1 != null)
        {
          paramqal.c(26);
          if (localohu1.ak < 0) {
            localohu1.ak = localohu1.a();
          }
          paramqal.c(localohu1.ak);
          localohu1.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oht
 * JD-Core Version:    0.7.0.1
 */