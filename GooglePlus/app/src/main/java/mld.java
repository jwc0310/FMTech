public final class mld
  extends qan<mld>
{
  public String a = null;
  public mjd[] b = mjd.b();
  public mlc c = null;
  
  public mld()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i3 = qal.d(8);
      int i4 = qal.a(str);
      i += i3 + (i4 + qal.d(i4));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int m = i;
      for (int n = 0; n < this.b.length; n++)
      {
        mjd localmjd = this.b[n];
        if (localmjd != null)
        {
          int i1 = qal.d(24);
          int i2 = localmjd.a();
          localmjd.ak = i2;
          m += i1 + (i2 + qal.d(i2));
        }
      }
      i = m;
    }
    if (this.c != null)
    {
      mlc localmlc = this.c;
      int j = qal.d(32);
      int k = localmlc.a();
      localmlc.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        mjd localmjd = this.b[i];
        if (localmjd != null)
        {
          paramqal.c(26);
          if (localmjd.ak < 0) {
            localmjd.ak = localmjd.a();
          }
          paramqal.c(localmjd.ak);
          localmjd.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      mlc localmlc = this.c;
      paramqal.c(34);
      if (localmlc.ak < 0) {
        localmlc.ak = localmlc.a();
      }
      paramqal.c(localmlc.ak);
      localmlc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mld
 * JD-Core Version:    0.7.0.1
 */