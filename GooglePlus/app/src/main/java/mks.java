public final class mks
  extends qan<mks>
{
  public mkf a = null;
  public mkl b = null;
  public mkg c = null;
  public mke d = null;
  private mlf e = null;
  private String f = null;
  
  public mks()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mkf localmkf = this.a;
      int i7 = qal.d(8);
      int i8 = localmkf.a();
      localmkf.ak = i8;
      i += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      mkl localmkl = this.b;
      int i5 = qal.d(16);
      int i6 = localmkl.a();
      localmkl.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      mkg localmkg = this.c;
      int i3 = qal.d(24);
      int i4 = localmkg.a();
      localmkg.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.e != null)
    {
      mlf localmlf = this.e;
      int i1 = qal.d(32);
      int i2 = localmlf.a();
      localmlf.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.f != null)
    {
      String str = this.f;
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
      mkf localmkf = this.a;
      paramqal.c(10);
      if (localmkf.ak < 0) {
        localmkf.ak = localmkf.a();
      }
      paramqal.c(localmkf.ak);
      localmkf.a(paramqal);
    }
    if (this.b != null)
    {
      mkl localmkl = this.b;
      paramqal.c(18);
      if (localmkl.ak < 0) {
        localmkl.ak = localmkl.a();
      }
      paramqal.c(localmkl.ak);
      localmkl.a(paramqal);
    }
    if (this.c != null)
    {
      mkg localmkg = this.c;
      paramqal.c(26);
      if (localmkg.ak < 0) {
        localmkg.ak = localmkg.a();
      }
      paramqal.c(localmkg.ak);
      localmkg.a(paramqal);
    }
    if (this.e != null)
    {
      mlf localmlf = this.e;
      paramqal.c(34);
      if (localmlf.ak < 0) {
        localmlf.ak = localmlf.a();
      }
      paramqal.c(localmlf.ak);
      localmlf.a(paramqal);
    }
    if (this.f != null)
    {
      String str = this.f;
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
 * Qualified Name:     mks
 * JD-Core Version:    0.7.0.1
 */