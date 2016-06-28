public final class mjt
  extends qan<mjt>
{
  public mjm a = null;
  public mjp b = null;
  public mlf c = null;
  public mke d = null;
  private String e = null;
  
  public mjt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mjm localmjm = this.a;
      int i5 = qal.d(8);
      int i6 = localmjm.a();
      localmjm.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      mjp localmjp = this.b;
      int i3 = qal.d(16);
      int i4 = localmjp.a();
      localmjp.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      mlf localmlf = this.c;
      int i1 = qal.d(32);
      int i2 = localmlf.a();
      localmlf.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.e != null)
    {
      String str = this.e;
      int m = qal.d(40);
      int n = qal.a(str);
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      mke localmke = this.d;
      int j = qal.d(48);
      int k = localmke.a();
      localmke.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mjm localmjm = this.a;
      paramqal.c(10);
      if (localmjm.ak < 0) {
        localmjm.ak = localmjm.a();
      }
      paramqal.c(localmjm.ak);
      localmjm.a(paramqal);
    }
    if (this.b != null)
    {
      mjp localmjp = this.b;
      paramqal.c(18);
      if (localmjp.ak < 0) {
        localmjp.ak = localmjp.a();
      }
      paramqal.c(localmjp.ak);
      localmjp.a(paramqal);
    }
    if (this.c != null)
    {
      mlf localmlf = this.c;
      paramqal.c(34);
      if (localmlf.ak < 0) {
        localmlf.ak = localmlf.a();
      }
      paramqal.c(localmlf.ak);
      localmlf.a(paramqal);
    }
    if (this.e != null)
    {
      String str = this.e;
      paramqal.c(42);
      paramqal.a(str);
    }
    if (this.d != null)
    {
      mke localmke = this.d;
      paramqal.c(50);
      if (localmke.ak < 0) {
        localmke.ak = localmke.a();
      }
      paramqal.c(localmke.ak);
      localmke.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mjt
 * JD-Core Version:    0.7.0.1
 */