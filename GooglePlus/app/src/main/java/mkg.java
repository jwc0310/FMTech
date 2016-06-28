public final class mkg
  extends qan<mkg>
{
  public mkc a = null;
  private mki b = null;
  private mko c = null;
  private mkv d = null;
  
  public mkg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      mki localmki = this.b;
      int i3 = qal.d(8);
      int i4 = localmki.a();
      localmki.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      mko localmko = this.c;
      int i1 = qal.d(16);
      int i2 = localmko.a();
      localmko.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      mkv localmkv = this.d;
      int m = qal.d(24);
      int n = localmkv.a();
      localmkv.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      mkc localmkc = this.a;
      int j = qal.d(32);
      int k = localmkc.a();
      localmkc.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      mki localmki = this.b;
      paramqal.c(10);
      if (localmki.ak < 0) {
        localmki.ak = localmki.a();
      }
      paramqal.c(localmki.ak);
      localmki.a(paramqal);
    }
    if (this.c != null)
    {
      mko localmko = this.c;
      paramqal.c(18);
      if (localmko.ak < 0) {
        localmko.ak = localmko.a();
      }
      paramqal.c(localmko.ak);
      localmko.a(paramqal);
    }
    if (this.d != null)
    {
      mkv localmkv = this.d;
      paramqal.c(26);
      if (localmkv.ak < 0) {
        localmkv.ak = localmkv.a();
      }
      paramqal.c(localmkv.ak);
      localmkv.a(paramqal);
    }
    if (this.a != null)
    {
      mkc localmkc = this.a;
      paramqal.c(34);
      if (localmkc.ak < 0) {
        localmkc.ak = localmkc.a();
      }
      paramqal.c(localmkc.ak);
      localmkc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mkg
 * JD-Core Version:    0.7.0.1
 */