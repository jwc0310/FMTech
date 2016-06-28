public final class mlu
  extends qan<mlu>
{
  private static volatile mlu[] g;
  public mmm a = null;
  public mln b = null;
  public mmo c = null;
  public mlq d = null;
  public mmp e = null;
  public mlk f = null;
  private mmu h = null;
  private mlo i = null;
  private mlz j = null;
  private mll k = null;
  private mmt l = null;
  
  public mlu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mlu[] b()
  {
    if (g == null) {}
    synchronized (qar.a)
    {
      if (g == null) {
        g = new mlu[0];
      }
      return g;
    }
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.a != null)
    {
      mmm localmmm = this.a;
      int i20 = qal.d(8);
      int i21 = localmmm.a();
      localmmm.ak = i21;
      m += i20 + (i21 + qal.d(i21));
    }
    if (this.h != null)
    {
      mmu localmmu = this.h;
      int i18 = qal.d(16);
      int i19 = localmmu.a();
      localmmu.ak = i19;
      m += i18 + (i19 + qal.d(i19));
    }
    if (this.b != null)
    {
      mln localmln = this.b;
      int i16 = qal.d(24);
      int i17 = localmln.a();
      localmln.ak = i17;
      m += i16 + (i17 + qal.d(i17));
    }
    if (this.i != null)
    {
      mlo localmlo = this.i;
      int i14 = qal.d(32);
      int i15 = localmlo.a();
      localmlo.ak = i15;
      m += i14 + (i15 + qal.d(i15));
    }
    if (this.c != null)
    {
      mmo localmmo = this.c;
      int i12 = qal.d(40);
      int i13 = localmmo.a();
      localmmo.ak = i13;
      m += i12 + (i13 + qal.d(i13));
    }
    if (this.d != null)
    {
      mlq localmlq = this.d;
      int i10 = qal.d(48);
      int i11 = localmlq.a();
      localmlq.ak = i11;
      m += i10 + (i11 + qal.d(i11));
    }
    if (this.e != null)
    {
      mmp localmmp = this.e;
      int i8 = qal.d(56);
      int i9 = localmmp.a();
      localmmp.ak = i9;
      m += i8 + (i9 + qal.d(i9));
    }
    if (this.j != null)
    {
      mlz localmlz = this.j;
      int i6 = qal.d(64);
      int i7 = localmlz.a();
      localmlz.ak = i7;
      m += i6 + (i7 + qal.d(i7));
    }
    if (this.f != null)
    {
      mlk localmlk = this.f;
      int i4 = qal.d(72);
      int i5 = localmlk.a();
      localmlk.ak = i5;
      m += i4 + (i5 + qal.d(i5));
    }
    if (this.k != null)
    {
      mll localmll = this.k;
      int i2 = qal.d(80);
      int i3 = localmll.a();
      localmll.ak = i3;
      m += i2 + (i3 + qal.d(i3));
    }
    if (this.l != null)
    {
      mmt localmmt = this.l;
      int n = qal.d(88);
      int i1 = localmmt.a();
      localmmt.ak = i1;
      m += n + (i1 + qal.d(i1));
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mmm localmmm = this.a;
      paramqal.c(10);
      if (localmmm.ak < 0) {
        localmmm.ak = localmmm.a();
      }
      paramqal.c(localmmm.ak);
      localmmm.a(paramqal);
    }
    if (this.h != null)
    {
      mmu localmmu = this.h;
      paramqal.c(18);
      if (localmmu.ak < 0) {
        localmmu.ak = localmmu.a();
      }
      paramqal.c(localmmu.ak);
      localmmu.a(paramqal);
    }
    if (this.b != null)
    {
      mln localmln = this.b;
      paramqal.c(26);
      if (localmln.ak < 0) {
        localmln.ak = localmln.a();
      }
      paramqal.c(localmln.ak);
      localmln.a(paramqal);
    }
    if (this.i != null)
    {
      mlo localmlo = this.i;
      paramqal.c(34);
      if (localmlo.ak < 0) {
        localmlo.ak = localmlo.a();
      }
      paramqal.c(localmlo.ak);
      localmlo.a(paramqal);
    }
    if (this.c != null)
    {
      mmo localmmo = this.c;
      paramqal.c(42);
      if (localmmo.ak < 0) {
        localmmo.ak = localmmo.a();
      }
      paramqal.c(localmmo.ak);
      localmmo.a(paramqal);
    }
    if (this.d != null)
    {
      mlq localmlq = this.d;
      paramqal.c(50);
      if (localmlq.ak < 0) {
        localmlq.ak = localmlq.a();
      }
      paramqal.c(localmlq.ak);
      localmlq.a(paramqal);
    }
    if (this.e != null)
    {
      mmp localmmp = this.e;
      paramqal.c(58);
      if (localmmp.ak < 0) {
        localmmp.ak = localmmp.a();
      }
      paramqal.c(localmmp.ak);
      localmmp.a(paramqal);
    }
    if (this.j != null)
    {
      mlz localmlz = this.j;
      paramqal.c(66);
      if (localmlz.ak < 0) {
        localmlz.ak = localmlz.a();
      }
      paramqal.c(localmlz.ak);
      localmlz.a(paramqal);
    }
    if (this.f != null)
    {
      mlk localmlk = this.f;
      paramqal.c(74);
      if (localmlk.ak < 0) {
        localmlk.ak = localmlk.a();
      }
      paramqal.c(localmlk.ak);
      localmlk.a(paramqal);
    }
    if (this.k != null)
    {
      mll localmll = this.k;
      paramqal.c(82);
      if (localmll.ak < 0) {
        localmll.ak = localmll.a();
      }
      paramqal.c(localmll.ak);
      localmll.a(paramqal);
    }
    if (this.l != null)
    {
      mmt localmmt = this.l;
      paramqal.c(90);
      if (localmmt.ak < 0) {
        localmmt.ak = localmmt.a();
      }
      paramqal.c(localmmt.ak);
      localmmt.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlu
 * JD-Core Version:    0.7.0.1
 */