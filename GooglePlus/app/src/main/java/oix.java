public final class oix
  extends qan<oix>
{
  private static volatile oix[] h;
  public String a = null;
  public String b = null;
  public String c = null;
  public Long d = null;
  public Long e = null;
  public ojv f = null;
  public oks g = null;
  private String i = null;
  private opt j = null;
  private onh k = null;
  private qoq l = null;
  private int m = -2147483648;
  private int n = -2147483648;
  private String o = null;
  
  public oix()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oix[] b()
  {
    if (h == null) {}
    synchronized (qar.a)
    {
      if (h == null) {
        h = new oix[0];
      }
      return h;
    }
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    String str1 = this.a;
    int i3 = qal.d(8);
    int i4 = qal.a(str1);
    int i5 = i2 + (i3 + (i4 + qal.d(i4)));
    String str2 = this.b;
    int i6 = qal.d(16);
    int i7 = qal.a(str2);
    int i8 = i5 + (i6 + (i7 + qal.d(i7)));
    String str3 = this.c;
    int i9 = qal.d(24);
    int i10 = qal.a(str3);
    int i11 = i8 + (i9 + (i10 + qal.d(i10)));
    if (this.f != null)
    {
      ojv localojv = this.f;
      int i29 = qal.d(32);
      int i30 = localojv.a();
      localojv.ak = i30;
      i11 += i29 + (i30 + qal.d(i30));
    }
    int i26;
    int i27;
    if (this.m != -2147483648)
    {
      i26 = this.m;
      i27 = qal.d(40);
      if (i26 < 0) {
        break label602;
      }
    }
    label602:
    for (int i28 = qal.d(i26);; i28 = i1)
    {
      i11 += i28 + i27;
      if (this.n != -2147483648)
      {
        int i24 = this.n;
        int i25 = qal.d(48);
        if (i24 >= 0) {
          i1 = qal.d(i24);
        }
        i11 += i25 + i1;
      }
      if (this.o != null)
      {
        String str5 = this.o;
        int i22 = qal.d(56);
        int i23 = qal.a(str5);
        i11 += i22 + (i23 + qal.d(i23));
      }
      if (this.g != null)
      {
        oks localoks = this.g;
        int i20 = qal.d(64);
        int i21 = localoks.a();
        localoks.ak = i21;
        i11 += i20 + (i21 + qal.d(i21));
      }
      if (this.i != null)
      {
        String str4 = this.i;
        int i18 = qal.d(72);
        int i19 = qal.a(str4);
        i11 += i18 + (i19 + qal.d(i19));
      }
      if (this.d != null)
      {
        long l2 = this.d.longValue();
        i11 += qal.d(80) + qal.b(l2);
      }
      if (this.e != null)
      {
        long l1 = this.e.longValue();
        i11 += qal.d(88) + qal.b(l1);
      }
      if (this.j != null)
      {
        opt localopt = this.j;
        int i16 = qal.d(96);
        int i17 = localopt.a();
        localopt.ak = i17;
        i11 += i16 + (i17 + qal.d(i17));
      }
      if (this.k != null)
      {
        onh localonh = this.k;
        int i14 = qal.d(104);
        int i15 = localonh.a();
        localonh.ak = i15;
        i11 += i14 + (i15 + qal.d(i15));
      }
      if (this.l != null)
      {
        qoq localqoq = this.l;
        int i12 = qal.d(112);
        int i13 = localqoq.a();
        localqoq.ak = i13;
        i11 += i12 + (i13 + qal.d(i13));
      }
      return i11;
    }
  }
  
  public final void a(qal paramqal)
  {
    String str1 = this.a;
    paramqal.c(10);
    paramqal.a(str1);
    String str2 = this.b;
    paramqal.c(18);
    paramqal.a(str2);
    String str3 = this.c;
    paramqal.c(26);
    paramqal.a(str3);
    if (this.f != null)
    {
      ojv localojv = this.f;
      paramqal.c(34);
      if (localojv.ak < 0) {
        localojv.ak = localojv.a();
      }
      paramqal.c(localojv.ak);
      localojv.a(paramqal);
    }
    if (this.m != -2147483648)
    {
      int i2 = this.m;
      paramqal.c(40);
      paramqal.a(i2);
    }
    if (this.n != -2147483648)
    {
      int i1 = this.n;
      paramqal.c(48);
      paramqal.a(i1);
    }
    if (this.o != null)
    {
      String str5 = this.o;
      paramqal.c(58);
      paramqal.a(str5);
    }
    if (this.g != null)
    {
      oks localoks = this.g;
      paramqal.c(66);
      if (localoks.ak < 0) {
        localoks.ak = localoks.a();
      }
      paramqal.c(localoks.ak);
      localoks.a(paramqal);
    }
    if (this.i != null)
    {
      String str4 = this.i;
      paramqal.c(74);
      paramqal.a(str4);
    }
    if (this.d != null)
    {
      long l2 = this.d.longValue();
      paramqal.c(80);
      paramqal.a(l2);
    }
    if (this.e != null)
    {
      long l1 = this.e.longValue();
      paramqal.c(88);
      paramqal.a(l1);
    }
    if (this.j != null)
    {
      opt localopt = this.j;
      paramqal.c(98);
      if (localopt.ak < 0) {
        localopt.ak = localopt.a();
      }
      paramqal.c(localopt.ak);
      localopt.a(paramqal);
    }
    if (this.k != null)
    {
      onh localonh = this.k;
      paramqal.c(106);
      if (localonh.ak < 0) {
        localonh.ak = localonh.a();
      }
      paramqal.c(localonh.ak);
      localonh.a(paramqal);
    }
    if (this.l != null)
    {
      qoq localqoq = this.l;
      paramqal.c(114);
      if (localqoq.ak < 0) {
        localqoq.ak = localqoq.a();
      }
      paramqal.c(localqoq.ak);
      localqoq.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oix
 * JD-Core Version:    0.7.0.1
 */