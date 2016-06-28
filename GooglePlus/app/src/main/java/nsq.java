public final class nsq
  extends qan<nsq>
{
  public Integer a = null;
  public String b = null;
  public nsu c = null;
  public nsl d = null;
  private nsk e = null;
  private pst f = null;
  private pws g = null;
  private pgj h = null;
  private nsz i = null;
  
  public nsq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    int i16;
    int i17;
    if (this.a != null)
    {
      int i15 = this.a.intValue();
      i16 = qal.d(8);
      if (i15 >= 0) {
        i17 = qal.d(i15);
      }
    }
    for (int k = j + (i17 + i16);; k = j)
    {
      if (this.b != null)
      {
        String str = this.b;
        int i13 = qal.d(16);
        int i14 = qal.a(str);
        k += i13 + (i14 + qal.d(i14));
      }
      if (this.e != null)
      {
        nsk localnsk = this.e;
        int i11 = qal.d(24);
        int i12 = localnsk.a();
        localnsk.ak = i12;
        k += i11 + (i12 + qal.d(i12));
      }
      if (this.c != null)
      {
        nsu localnsu = this.c;
        int i9 = qal.d(32);
        int i10 = localnsu.a();
        localnsu.ak = i10;
        k += i9 + (i10 + qal.d(i10));
      }
      if (this.d != null)
      {
        nsl localnsl = this.d;
        int i7 = qal.d(40);
        int i8 = localnsl.a();
        localnsl.ak = i8;
        k += i7 + (i8 + qal.d(i8));
      }
      if (this.f != null)
      {
        pst localpst = this.f;
        int i5 = qal.d(48);
        int i6 = localpst.a();
        localpst.ak = i6;
        k += i5 + (i6 + qal.d(i6));
      }
      if (this.g != null)
      {
        pws localpws = this.g;
        int i3 = qal.d(56);
        int i4 = localpws.a();
        localpws.ak = i4;
        k += i3 + (i4 + qal.d(i4));
      }
      if (this.h != null)
      {
        pgj localpgj = this.h;
        int i1 = qal.d(64);
        int i2 = localpgj.a();
        localpgj.ak = i2;
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.i != null)
      {
        nsz localnsz = this.i;
        int m = qal.d(72);
        int n = localnsz.a();
        localnsz.ak = n;
        k += m + (n + qal.d(n));
      }
      return k;
      i17 = 10;
      break;
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
    if (this.e != null)
    {
      nsk localnsk = this.e;
      paramqal.c(26);
      if (localnsk.ak < 0) {
        localnsk.ak = localnsk.a();
      }
      paramqal.c(localnsk.ak);
      localnsk.a(paramqal);
    }
    if (this.c != null)
    {
      nsu localnsu = this.c;
      paramqal.c(34);
      if (localnsu.ak < 0) {
        localnsu.ak = localnsu.a();
      }
      paramqal.c(localnsu.ak);
      localnsu.a(paramqal);
    }
    if (this.d != null)
    {
      nsl localnsl = this.d;
      paramqal.c(42);
      if (localnsl.ak < 0) {
        localnsl.ak = localnsl.a();
      }
      paramqal.c(localnsl.ak);
      localnsl.a(paramqal);
    }
    if (this.f != null)
    {
      pst localpst = this.f;
      paramqal.c(50);
      if (localpst.ak < 0) {
        localpst.ak = localpst.a();
      }
      paramqal.c(localpst.ak);
      localpst.a(paramqal);
    }
    if (this.g != null)
    {
      pws localpws = this.g;
      paramqal.c(58);
      if (localpws.ak < 0) {
        localpws.ak = localpws.a();
      }
      paramqal.c(localpws.ak);
      localpws.a(paramqal);
    }
    if (this.h != null)
    {
      pgj localpgj = this.h;
      paramqal.c(66);
      if (localpgj.ak < 0) {
        localpgj.ak = localpgj.a();
      }
      paramqal.c(localpgj.ak);
      localpgj.a(paramqal);
    }
    if (this.i != null)
    {
      nsz localnsz = this.i;
      paramqal.c(74);
      if (localnsz.ak < 0) {
        localnsz.ak = localnsz.a();
      }
      paramqal.c(localnsz.ak);
      localnsz.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsq
 * JD-Core Version:    0.7.0.1
 */