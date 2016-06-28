public final class oed
  extends qan<oed>
{
  public static final oed[] a = new oed[0];
  public odo b = null;
  public oeh c = null;
  public oeg d = null;
  public oef e = null;
  public int f = -2147483648;
  public int g = -2147483648;
  public oee h = null;
  public odv i = null;
  private int j = -2147483648;
  private Integer k = null;
  private odu[] l = odu.b();
  private oei m = null;
  
  static
  {
    new qao(11, oed.class, (int)353204114L, false);
  }
  
  public oed()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int n = 10;
    int i1 = super.a();
    if (this.b != null)
    {
      odo localodo = this.b;
      int i29 = qal.d(8);
      int i30 = localodo.a();
      localodo.ak = i30;
      i1 += i29 + (i30 + qal.d(i30));
    }
    if (this.c != null)
    {
      oeh localoeh = this.c;
      int i27 = qal.d(24);
      int i28 = localoeh.a();
      localoeh.ak = i28;
      i1 += i27 + (i28 + qal.d(i28));
    }
    if (this.d != null)
    {
      oeg localoeg = this.d;
      int i25 = qal.d(32);
      int i26 = localoeg.a();
      localoeg.ak = i26;
      i1 += i25 + (i26 + qal.d(i26));
    }
    if (this.e != null)
    {
      oef localoef = this.e;
      int i23 = qal.d(40);
      int i24 = localoef.a();
      localoef.ak = i24;
      i1 += i23 + (i24 + qal.d(i24));
    }
    int i22;
    int i19;
    label276:
    int i12;
    int i13;
    if (this.f != -2147483648)
    {
      int i20 = this.f;
      int i21 = qal.d(48);
      if (i20 >= 0)
      {
        i22 = qal.d(i20);
        i1 += i22 + i21;
      }
    }
    else
    {
      if (this.g != -2147483648)
      {
        int i17 = this.g;
        int i18 = qal.d(56);
        if (i17 < 0) {
          break label469;
        }
        i19 = qal.d(i17);
        i1 += i19 + i18;
      }
      if (this.h != null)
      {
        oee localoee = this.h;
        int i15 = qal.d(64);
        int i16 = localoee.a();
        localoee.ak = i16;
        i1 += i15 + (i16 + qal.d(i16));
      }
      if (this.k != null)
      {
        i12 = this.k.intValue();
        i13 = qal.d(72);
        if (i12 < 0) {
          break label475;
        }
      }
    }
    int i8;
    label469:
    label475:
    for (int i14 = qal.d(i12);; i14 = n)
    {
      i1 += i14 + i13;
      if ((this.l == null) || (this.l.length <= 0)) {
        break label484;
      }
      i8 = i1;
      for (int i9 = 0; i9 < this.l.length; i9++)
      {
        odu localodu = this.l[i9];
        if (localodu != null)
        {
          int i10 = qal.d(80);
          int i11 = localodu.a();
          localodu.ak = i11;
          i8 += i10 + (i11 + qal.d(i11));
        }
      }
      i22 = n;
      break;
      i19 = n;
      break label276;
    }
    i1 = i8;
    label484:
    if (this.i != null)
    {
      odv localodv = this.i;
      int i6 = qal.d(88);
      int i7 = localodv.a();
      localodv.ak = i7;
      i1 += i6 + (i7 + qal.d(i7));
    }
    if (this.j != -2147483648)
    {
      int i4 = this.j;
      int i5 = qal.d(96);
      if (i4 >= 0) {
        n = qal.d(i4);
      }
      i1 += i5 + n;
    }
    if (this.m != null)
    {
      oei localoei = this.m;
      int i2 = qal.d(104);
      int i3 = localoei.a();
      localoei.ak = i3;
      i1 += i2 + (i3 + qal.d(i3));
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      odo localodo = this.b;
      paramqal.c(10);
      if (localodo.ak < 0) {
        localodo.ak = localodo.a();
      }
      paramqal.c(localodo.ak);
      localodo.a(paramqal);
    }
    if (this.c != null)
    {
      oeh localoeh = this.c;
      paramqal.c(26);
      if (localoeh.ak < 0) {
        localoeh.ak = localoeh.a();
      }
      paramqal.c(localoeh.ak);
      localoeh.a(paramqal);
    }
    if (this.d != null)
    {
      oeg localoeg = this.d;
      paramqal.c(34);
      if (localoeg.ak < 0) {
        localoeg.ak = localoeg.a();
      }
      paramqal.c(localoeg.ak);
      localoeg.a(paramqal);
    }
    if (this.e != null)
    {
      oef localoef = this.e;
      paramqal.c(42);
      if (localoef.ak < 0) {
        localoef.ak = localoef.a();
      }
      paramqal.c(localoef.ak);
      localoef.a(paramqal);
    }
    if (this.f != -2147483648)
    {
      int i4 = this.f;
      paramqal.c(48);
      paramqal.a(i4);
    }
    if (this.g != -2147483648)
    {
      int i3 = this.g;
      paramqal.c(56);
      paramqal.a(i3);
    }
    if (this.h != null)
    {
      oee localoee = this.h;
      paramqal.c(66);
      if (localoee.ak < 0) {
        localoee.ak = localoee.a();
      }
      paramqal.c(localoee.ak);
      localoee.a(paramqal);
    }
    if (this.k != null)
    {
      int i2 = this.k.intValue();
      paramqal.c(72);
      paramqal.a(i2);
    }
    if ((this.l != null) && (this.l.length > 0)) {
      for (int i1 = 0; i1 < this.l.length; i1++)
      {
        odu localodu = this.l[i1];
        if (localodu != null)
        {
          paramqal.c(82);
          if (localodu.ak < 0) {
            localodu.ak = localodu.a();
          }
          paramqal.c(localodu.ak);
          localodu.a(paramqal);
        }
      }
    }
    if (this.i != null)
    {
      odv localodv = this.i;
      paramqal.c(90);
      if (localodv.ak < 0) {
        localodv.ak = localodv.a();
      }
      paramqal.c(localodv.ak);
      localodv.a(paramqal);
    }
    if (this.j != -2147483648)
    {
      int n = this.j;
      paramqal.c(96);
      paramqal.a(n);
    }
    if (this.m != null)
    {
      oei localoei = this.m;
      paramqal.c(106);
      if (localoei.ak < 0) {
        localoei.ak = localoei.a();
      }
      paramqal.c(localoei.ak);
      localoei.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oed
 * JD-Core Version:    0.7.0.1
 */