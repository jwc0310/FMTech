public final class nde
  extends qan<nde>
{
  public miv a = null;
  public omk b = null;
  private String c = null;
  private miy[] d = miy.b();
  
  public nde()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      miv localmiv = this.a;
      int i5 = qal.d(40);
      int i6 = localmiv.a();
      localmiv.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      String str = this.c;
      int i3 = qal.d(48);
      int i4 = qal.a(str);
      i += i3 + (i4 + qal.d(i4));
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int m = i;
      for (int n = 0; n < this.d.length; n++)
      {
        miy localmiy = this.d[n];
        if (localmiy != null)
        {
          int i1 = qal.d(56);
          int i2 = localmiy.a();
          localmiy.ak = i2;
          m += i1 + (i2 + qal.d(i2));
        }
      }
      i = m;
    }
    if (this.b != null)
    {
      omk localomk = this.b;
      int j = qal.d(64);
      int k = localomk.a();
      localomk.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      miv localmiv = this.a;
      paramqal.c(42);
      if (localmiv.ak < 0) {
        localmiv.ak = localmiv.a();
      }
      paramqal.c(localmiv.ak);
      localmiv.a(paramqal);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(50);
      paramqal.a(str);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i = 0; i < this.d.length; i++)
      {
        miy localmiy = this.d[i];
        if (localmiy != null)
        {
          paramqal.c(58);
          if (localmiy.ak < 0) {
            localmiy.ak = localmiy.a();
          }
          paramqal.c(localmiy.ak);
          localmiy.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      omk localomk = this.b;
      paramqal.c(66);
      if (localomk.ak < 0) {
        localomk.ak = localomk.a();
      }
      paramqal.c(localomk.ak);
      localomk.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nde
 * JD-Core Version:    0.7.0.1
 */