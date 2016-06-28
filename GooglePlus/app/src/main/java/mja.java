public final class mja
  extends qan<mja>
{
  public qof a = null;
  public rkj b = null;
  public rns c = null;
  private int[] d = qay.a;
  private int e = -2147483648;
  private mjb f = null;
  private Long g = null;
  private miz h = null;
  private int i = -2147483648;
  private int j = -2147483648;
  private int k = -2147483648;
  
  public mja()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = 0;
    int n = 10;
    int i1 = super.a();
    int i25;
    int i26;
    if (this.i != -2147483648)
    {
      int i24 = this.i;
      i25 = qal.d(8);
      if (i24 >= 0) {
        i26 = qal.d(i24);
      }
    }
    for (int i2 = i1 + (i26 + i25);; i2 = i1)
    {
      int i23;
      label87:
      int i20;
      label131:
      int i9;
      label309:
      int i10;
      if (this.j != -2147483648)
      {
        int i21 = this.j;
        int i22 = qal.d(16);
        if (i21 >= 0)
        {
          i23 = qal.d(i21);
          i2 += i23 + i22;
        }
      }
      else
      {
        if (this.k != -2147483648)
        {
          int i18 = this.k;
          int i19 = qal.d(24);
          if (i18 < 0) {
            break label363;
          }
          i20 = qal.d(i18);
          i2 += i20 + i19;
        }
        if (this.a != null)
        {
          qof localqof = this.a;
          int i16 = qal.d(32);
          int i17 = localqof.a();
          localqof.ak = i17;
          i2 += i16 + (i17 + qal.d(i17));
        }
        if (this.b != null)
        {
          rkj localrkj = this.b;
          int i14 = qal.d(40);
          int i15 = localrkj.a();
          localrkj.ak = i15;
          i2 += i14 + (i15 + qal.d(i15));
        }
        if (this.c != null)
        {
          rns localrns = this.c;
          int i12 = qal.d(48);
          int i13 = localrns.a();
          localrns.ak = i13;
          i2 += i12 + (i13 + qal.d(i13));
        }
        if ((this.d == null) || (this.d.length <= 0)) {
          break label389;
        }
        i9 = 0;
        if (i9 >= this.d.length) {
          break label375;
        }
        i10 = this.d[i9];
        if (i10 < 0) {
          break label369;
        }
      }
      label363:
      label369:
      for (int i11 = qal.d(i10);; i11 = n)
      {
        m += i11;
        i9++;
        break label309;
        i26 = n;
        break;
        i23 = n;
        break label87;
        i20 = n;
        break label131;
      }
      label375:
      i2 = i2 + m + 1 * this.d.length;
      label389:
      if (this.e != -2147483648)
      {
        int i7 = this.e;
        int i8 = qal.d(64);
        if (i7 >= 0) {
          n = qal.d(i7);
        }
        i2 += n + i8;
      }
      if (this.f != null)
      {
        mjb localmjb = this.f;
        int i5 = qal.d(72);
        int i6 = localmjb.a();
        localmjb.ak = i6;
        i2 += i5 + (i6 + qal.d(i6));
      }
      if (this.g != null)
      {
        this.g.longValue();
        i2 += 8 + qal.d(80);
      }
      if (this.h != null)
      {
        miz localmiz = this.h;
        int i3 = qal.d(88);
        int i4 = localmiz.a();
        localmiz.ak = i4;
        i2 += i3 + (i4 + qal.d(i4));
      }
      return i2;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.i != -2147483648)
    {
      int i4 = this.i;
      paramqal.c(8);
      paramqal.a(i4);
    }
    if (this.j != -2147483648)
    {
      int i3 = this.j;
      paramqal.c(16);
      paramqal.a(i3);
    }
    if (this.k != -2147483648)
    {
      int i2 = this.k;
      paramqal.c(24);
      paramqal.a(i2);
    }
    if (this.a != null)
    {
      qof localqof = this.a;
      paramqal.c(34);
      if (localqof.ak < 0) {
        localqof.ak = localqof.a();
      }
      paramqal.c(localqof.ak);
      localqof.a(paramqal);
    }
    if (this.b != null)
    {
      rkj localrkj = this.b;
      paramqal.c(42);
      if (localrkj.ak < 0) {
        localrkj.ak = localrkj.a();
      }
      paramqal.c(localrkj.ak);
      localrkj.a(paramqal);
    }
    if (this.c != null)
    {
      rns localrns = this.c;
      paramqal.c(50);
      if (localrns.ak < 0) {
        localrns.ak = localrns.a();
      }
      paramqal.c(localrns.ak);
      localrns.a(paramqal);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int n = 0; n < this.d.length; n++)
      {
        int i1 = this.d[n];
        paramqal.c(56);
        paramqal.a(i1);
      }
    }
    if (this.e != -2147483648)
    {
      int m = this.e;
      paramqal.c(64);
      paramqal.a(m);
    }
    if (this.f != null)
    {
      mjb localmjb = this.f;
      paramqal.c(74);
      if (localmjb.ak < 0) {
        localmjb.ak = localmjb.a();
      }
      paramqal.c(localmjb.ak);
      localmjb.a(paramqal);
    }
    if (this.g != null)
    {
      long l = this.g.longValue();
      paramqal.c(81);
      paramqal.c(l);
    }
    if (this.h != null)
    {
      miz localmiz = this.h;
      paramqal.c(90);
      if (localmiz.ak < 0) {
        localmiz.ak = localmiz.a();
      }
      paramqal.c(localmiz.ak);
      localmiz.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mja
 * JD-Core Version:    0.7.0.1
 */