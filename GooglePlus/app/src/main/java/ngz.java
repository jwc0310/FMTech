public final class ngz
  extends qan<ngz>
{
  public qbe a = null;
  public opo b = null;
  public String c = null;
  public nhc[] d = nhc.b();
  public old[] e = old.b();
  public ona[] f = ona.b();
  public String g = null;
  public String h = null;
  public int i = -2147483648;
  private qbv j = null;
  private ope k = null;
  private int l = -2147483648;
  private int m = -2147483648;
  private nha[] n = nha.b();
  private nhb o = null;
  
  public ngz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if (this.j != null)
    {
      qbv localqbv = this.j;
      int i41 = qal.d(8);
      int i42 = localqbv.a();
      localqbv.ak = i42;
      i2 += i41 + (i42 + qal.d(i42));
    }
    if (this.b != null)
    {
      opo localopo = this.b;
      int i39 = qal.d(16);
      int i40 = localopo.a();
      localopo.ak = i40;
      i2 += i39 + (i40 + qal.d(i40));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i37 = qal.d(24);
      int i38 = qal.a(str3);
      i2 += i37 + (i38 + qal.d(i38));
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i33 = i2;
      for (int i34 = 0; i34 < this.d.length; i34++)
      {
        nhc localnhc = this.d[i34];
        if (localnhc != null)
        {
          int i35 = qal.d(32);
          int i36 = localnhc.a();
          localnhc.ak = i36;
          i33 += i35 + (i36 + qal.d(i36));
        }
      }
      i2 = i33;
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i29 = i2;
      for (int i30 = 0; i30 < this.e.length; i30++)
      {
        old localold = this.e[i30];
        if (localold != null)
        {
          int i31 = qal.d(40);
          int i32 = localold.a();
          localold.ak = i32;
          i29 += i31 + (i32 + qal.d(i32));
        }
      }
      i2 = i29;
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int i25 = i2;
      for (int i26 = 0; i26 < this.f.length; i26++)
      {
        ona localona = this.f[i26];
        if (localona != null)
        {
          int i27 = qal.d(48);
          int i28 = localona.a();
          localona.ak = i28;
          i25 += i27 + (i28 + qal.d(i28));
        }
      }
      i2 = i25;
    }
    if (this.k != null)
    {
      ope localope = this.k;
      int i23 = qal.d(56);
      int i24 = localope.a();
      localope.ak = i24;
      i2 += i23 + (i24 + qal.d(i24));
    }
    if (this.g != null)
    {
      String str2 = this.g;
      int i21 = qal.d(64);
      int i22 = qal.a(str2);
      i2 += i21 + (i22 + qal.d(i22));
    }
    if (this.h != null)
    {
      String str1 = this.h;
      int i19 = qal.d(72);
      int i20 = qal.a(str1);
      i2 += i19 + (i20 + qal.d(i20));
    }
    int i18;
    int i13;
    int i14;
    if (this.l != -2147483648)
    {
      int i16 = this.l;
      int i17 = qal.d(80);
      if (i16 >= 0)
      {
        i18 = qal.d(i16);
        i2 += i18 + i17;
      }
    }
    else if (this.m != -2147483648)
    {
      i13 = this.m;
      i14 = qal.d(88);
      if (i13 < 0) {
        break label765;
      }
    }
    label765:
    for (int i15 = qal.d(i13);; i15 = i1)
    {
      i2 += i15 + i14;
      if (this.i != -2147483648)
      {
        int i11 = this.i;
        int i12 = qal.d(96);
        if (i11 >= 0) {
          i1 = qal.d(i11);
        }
        i2 += i12 + i1;
      }
      if (this.n == null) {
        break label771;
      }
      int i7 = this.n.length;
      int i8 = 0;
      if (i7 <= 0) {
        break label771;
      }
      while (i8 < this.n.length)
      {
        nha localnha = this.n[i8];
        if (localnha != null)
        {
          int i9 = qal.d(104);
          int i10 = localnha.a();
          localnha.ak = i10;
          i2 += i9 + (i10 + qal.d(i10));
        }
        i8++;
      }
      i18 = i1;
      break;
    }
    label771:
    if (this.a != null)
    {
      qbe localqbe = this.a;
      int i5 = qal.d(112);
      int i6 = localqbe.a();
      localqbe.ak = i6;
      i2 += i5 + (i6 + qal.d(i6));
    }
    if (this.o != null)
    {
      nhb localnhb = this.o;
      int i3 = qal.d(120);
      int i4 = localnhb.a();
      localnhb.ak = i4;
      i2 += i3 + (i4 + qal.d(i4));
    }
    return i2;
  }
  
  public final void a(qal paramqal)
  {
    if (this.j != null)
    {
      qbv localqbv = this.j;
      paramqal.c(10);
      if (localqbv.ak < 0) {
        localqbv.ak = localqbv.a();
      }
      paramqal.c(localqbv.ak);
      localqbv.a(paramqal);
    }
    if (this.b != null)
    {
      opo localopo = this.b;
      paramqal.c(18);
      if (localopo.ak < 0) {
        localopo.ak = localopo.a();
      }
      paramqal.c(localopo.ak);
      localopo.a(paramqal);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i8 = 0; i8 < this.d.length; i8++)
      {
        nhc localnhc = this.d[i8];
        if (localnhc != null)
        {
          paramqal.c(34);
          if (localnhc.ak < 0) {
            localnhc.ak = localnhc.a();
          }
          paramqal.c(localnhc.ak);
          localnhc.a(paramqal);
        }
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i7 = 0; i7 < this.e.length; i7++)
      {
        old localold = this.e[i7];
        if (localold != null)
        {
          paramqal.c(42);
          if (localold.ak < 0) {
            localold.ak = localold.a();
          }
          paramqal.c(localold.ak);
          localold.a(paramqal);
        }
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i6 = 0; i6 < this.f.length; i6++)
      {
        ona localona = this.f[i6];
        if (localona != null)
        {
          paramqal.c(50);
          if (localona.ak < 0) {
            localona.ak = localona.a();
          }
          paramqal.c(localona.ak);
          localona.a(paramqal);
        }
      }
    }
    if (this.k != null)
    {
      ope localope = this.k;
      paramqal.c(58);
      if (localope.ak < 0) {
        localope.ak = localope.a();
      }
      paramqal.c(localope.ak);
      localope.a(paramqal);
    }
    if (this.g != null)
    {
      String str2 = this.g;
      paramqal.c(66);
      paramqal.a(str2);
    }
    if (this.h != null)
    {
      String str1 = this.h;
      paramqal.c(74);
      paramqal.a(str1);
    }
    if (this.l != -2147483648)
    {
      int i5 = this.l;
      paramqal.c(80);
      paramqal.a(i5);
    }
    if (this.m != -2147483648)
    {
      int i4 = this.m;
      paramqal.c(88);
      paramqal.a(i4);
    }
    if (this.i != -2147483648)
    {
      int i3 = this.i;
      paramqal.c(96);
      paramqal.a(i3);
    }
    if (this.n != null)
    {
      int i1 = this.n.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.n.length)
        {
          nha localnha = this.n[i2];
          if (localnha != null)
          {
            paramqal.c(106);
            if (localnha.ak < 0) {
              localnha.ak = localnha.a();
            }
            paramqal.c(localnha.ak);
            localnha.a(paramqal);
          }
          i2++;
        }
      }
    }
    if (this.a != null)
    {
      qbe localqbe = this.a;
      paramqal.c(114);
      if (localqbe.ak < 0) {
        localqbe.ak = localqbe.a();
      }
      paramqal.c(localqbe.ak);
      localqbe.a(paramqal);
    }
    if (this.o != null)
    {
      nhb localnhb = this.o;
      paramqal.c(122);
      if (localnhb.ak < 0) {
        localnhb.ak = localnhb.a();
      }
      paramqal.c(localnhb.ak);
      localnhb.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ngz
 * JD-Core Version:    0.7.0.1
 */