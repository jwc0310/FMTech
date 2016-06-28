public final class mpw
  extends qan<mpw>
{
  public qfg a = null;
  public String b = null;
  public mgn c = null;
  public mie d = null;
  private qeu e = null;
  private rjs f = null;
  
  public mpw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.e != null)
    {
      qeu localqeu = this.e;
      int i7 = qal.d(8);
      int i8 = localqeu.a();
      localqeu.ak = i8;
      i += i7 + (i8 + qal.d(i8));
    }
    if (this.a != null)
    {
      qfg localqfg = this.a;
      int i5 = qal.d(16);
      int i6 = localqfg.a();
      localqfg.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      String str = this.b;
      int i3 = qal.d(24);
      int i4 = qal.a(str);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.f != null)
    {
      rjs localrjs = this.f;
      int i1 = qal.d(32);
      int i2 = localrjs.a();
      localrjs.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      mgn localmgn = this.c;
      int m = qal.d(40);
      int n = localmgn.a();
      localmgn.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      mie localmie = this.d;
      int j = qal.d(48);
      int k = localmie.a();
      localmie.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.e != null)
    {
      qeu localqeu = this.e;
      paramqal.c(10);
      if (localqeu.ak < 0) {
        localqeu.ak = localqeu.a();
      }
      paramqal.c(localqeu.ak);
      localqeu.a(paramqal);
    }
    if (this.a != null)
    {
      qfg localqfg = this.a;
      paramqal.c(18);
      if (localqfg.ak < 0) {
        localqfg.ak = localqfg.a();
      }
      paramqal.c(localqfg.ak);
      localqfg.a(paramqal);
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(26);
      paramqal.a(str);
    }
    if (this.f != null)
    {
      rjs localrjs = this.f;
      paramqal.c(34);
      if (localrjs.ak < 0) {
        localrjs.ak = localrjs.a();
      }
      paramqal.c(localrjs.ak);
      localrjs.a(paramqal);
    }
    if (this.c != null)
    {
      mgn localmgn = this.c;
      paramqal.c(42);
      if (localmgn.ak < 0) {
        localmgn.ak = localmgn.a();
      }
      paramqal.c(localmgn.ak);
      localmgn.a(paramqal);
    }
    if (this.d != null)
    {
      mie localmie = this.d;
      paramqal.c(50);
      if (localmie.ak < 0) {
        localmie.ak = localmie.a();
      }
      paramqal.c(localmie.ak);
      localmie.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpw
 * JD-Core Version:    0.7.0.1
 */