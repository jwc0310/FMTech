public final class nkp
  extends qan<nkp>
{
  private Integer a = null;
  private nkr b = null;
  private nkc c = null;
  private nkq d = null;
  private nkb e = null;
  private nks f = null;
  
  public nkp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i9;
    int i10;
    if (this.a != null)
    {
      int i8 = this.a.intValue();
      i9 = qal.d(8);
      if (i8 >= 0) {
        i10 = qal.d(i8);
      }
    }
    for (int j = i + (i10 + i9);; j = i)
    {
      if (this.b != null)
      {
        nkr localnkr = this.b;
        int i6 = qal.d(16);
        int i7 = localnkr.a();
        localnkr.ak = i7;
        j += i6 + (i7 + qal.d(i7));
      }
      if (this.c != null)
      {
        nkc localnkc = this.c;
        int i4 = qal.d(24);
        int i5 = localnkc.a();
        localnkc.ak = i5;
        j += i4 + (i5 + qal.d(i5));
      }
      if (this.d != null)
      {
        nkq localnkq = this.d;
        int i2 = qal.d(32);
        int i3 = localnkq.a();
        localnkq.ak = i3;
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.e != null)
      {
        nkb localnkb = this.e;
        int n = qal.d(40);
        int i1 = localnkb.a();
        localnkb.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.f != null)
      {
        nks localnks = this.f;
        int k = qal.d(48);
        int m = localnks.a();
        localnks.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i10 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int i = this.a.intValue();
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      nkr localnkr = this.b;
      paramqal.c(18);
      if (localnkr.ak < 0) {
        localnkr.ak = localnkr.a();
      }
      paramqal.c(localnkr.ak);
      localnkr.a(paramqal);
    }
    if (this.c != null)
    {
      nkc localnkc = this.c;
      paramqal.c(26);
      if (localnkc.ak < 0) {
        localnkc.ak = localnkc.a();
      }
      paramqal.c(localnkc.ak);
      localnkc.a(paramqal);
    }
    if (this.d != null)
    {
      nkq localnkq = this.d;
      paramqal.c(34);
      if (localnkq.ak < 0) {
        localnkq.ak = localnkq.a();
      }
      paramqal.c(localnkq.ak);
      localnkq.a(paramqal);
    }
    if (this.e != null)
    {
      nkb localnkb = this.e;
      paramqal.c(42);
      if (localnkb.ak < 0) {
        localnkb.ak = localnkb.a();
      }
      paramqal.c(localnkb.ak);
      localnkb.a(paramqal);
    }
    if (this.f != null)
    {
      nks localnks = this.f;
      paramqal.c(50);
      if (localnks.ak < 0) {
        localnks.ak = localnks.a();
      }
      paramqal.c(localnks.ak);
      localnks.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nkp
 * JD-Core Version:    0.7.0.1
 */