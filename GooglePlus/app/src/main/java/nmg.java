public final class nmg
  extends qan<nmg>
{
  private int a = -2147483648;
  private int b = -2147483648;
  private int c = -2147483648;
  private int[] d = qay.a;
  private int[] e = qay.a;
  private nmh[] f = nmh.b();
  private int g = -2147483648;
  private int[] h = qay.a;
  private int i = -2147483648;
  private int j = -2147483648;
  private int k = -2147483648;
  private int l = -2147483648;
  private int m = -2147483648;
  
  public nmg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int n = 0;
    int i1 = 10;
    int i2 = super.a();
    int i43;
    int i44;
    if (this.a != -2147483648)
    {
      int i42 = this.a;
      i43 = qal.d(8);
      if (i42 >= 0) {
        i44 = qal.d(i42);
      }
    }
    for (int i3 = i2 + (i44 + i43);; i3 = i2)
    {
      int i41;
      label87:
      int i38;
      label131:
      int i32;
      int i33;
      label162:
      int i34;
      if (this.b != -2147483648)
      {
        int i39 = this.b;
        int i40 = qal.d(16);
        if (i39 >= 0)
        {
          i41 = qal.d(i39);
          i3 += i41 + i40;
        }
      }
      else
      {
        if (this.c != -2147483648)
        {
          int i36 = this.c;
          int i37 = qal.d(24);
          if (i36 < 0) {
            break label218;
          }
          i38 = qal.d(i36);
          i3 += i38 + i37;
        }
        if ((this.d == null) || (this.d.length <= 0)) {
          break label245;
        }
        i32 = 0;
        i33 = 0;
        if (i32 >= this.d.length) {
          break label230;
        }
        i34 = this.d[i32];
        if (i34 < 0) {
          break label224;
        }
      }
      label218:
      label224:
      for (int i35 = qal.d(i34);; i35 = i1)
      {
        i33 += i35;
        i32++;
        break label162;
        i44 = i1;
        break;
        i41 = i1;
        break label87;
        i38 = i1;
        break label131;
      }
      label230:
      i3 = i3 + i33 + 1 * this.d.length;
      label245:
      if ((this.e != null) && (this.e.length > 0))
      {
        int i28 = 0;
        int i29 = 0;
        if (i28 < this.e.length)
        {
          int i30 = this.e[i28];
          if (i30 >= 0) {}
          for (int i31 = qal.d(i30);; i31 = i1)
          {
            i29 += i31;
            i28++;
            break;
          }
        }
        i3 = i3 + i29 + 1 * this.e.length;
      }
      if ((this.f != null) && (this.f.length > 0))
      {
        int i24 = i3;
        for (int i25 = 0; i25 < this.f.length; i25++)
        {
          nmh localnmh = this.f[i25];
          if (localnmh != null)
          {
            int i26 = qal.d(48);
            int i27 = localnmh.a();
            localnmh.ak = i27;
            i24 += i26 + (i27 + qal.d(i27));
          }
        }
        i3 = i24;
      }
      int i23;
      int i18;
      label486:
      int i19;
      if (this.g != -2147483648)
      {
        int i21 = this.g;
        int i22 = qal.d(56);
        if (i21 >= 0)
        {
          i23 = qal.d(i21);
          i3 += i23 + i22;
        }
      }
      else
      {
        if ((this.h == null) || (this.h.length <= 0)) {
          break label555;
        }
        i18 = 0;
        if (n >= this.h.length) {
          break label540;
        }
        i19 = this.h[n];
        if (i19 < 0) {
          break label534;
        }
      }
      label534:
      for (int i20 = qal.d(i19);; i20 = i1)
      {
        i18 += i20;
        n++;
        break label486;
        i23 = i1;
        break;
      }
      label540:
      i3 = i3 + i18 + 1 * this.h.length;
      label555:
      int i17;
      int i14;
      label633:
      int i11;
      label677:
      int i6;
      int i7;
      if (this.i != -2147483648)
      {
        int i15 = this.i;
        int i16 = qal.d(72);
        if (i15 >= 0)
        {
          i17 = qal.d(i15);
          i3 += i17 + i16;
        }
      }
      else
      {
        if (this.j != -2147483648)
        {
          int i12 = this.j;
          int i13 = qal.d(80);
          if (i12 < 0) {
            break label782;
          }
          i14 = qal.d(i12);
          i3 += i14 + i13;
        }
        if (this.k != -2147483648)
        {
          int i9 = this.k;
          int i10 = qal.d(88);
          if (i9 < 0) {
            break label788;
          }
          i11 = qal.d(i9);
          i3 += i11 + i10;
        }
        if (this.l != -2147483648)
        {
          i6 = this.l;
          i7 = qal.d(96);
          if (i6 < 0) {
            break label794;
          }
        }
      }
      label782:
      label788:
      label794:
      for (int i8 = qal.d(i6);; i8 = i1)
      {
        i3 += i8 + i7;
        if (this.m != -2147483648)
        {
          int i4 = this.m;
          int i5 = qal.d(104);
          if (i4 >= 0) {
            i1 = qal.d(i4);
          }
          i3 += i1 + i5;
        }
        return i3;
        i17 = i1;
        break;
        i14 = i1;
        break label633;
        i11 = i1;
        break label677;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int i16 = this.a;
      paramqal.c(8);
      paramqal.a(i16);
    }
    if (this.b != -2147483648)
    {
      int i15 = this.b;
      paramqal.c(16);
      paramqal.a(i15);
    }
    if (this.c != -2147483648)
    {
      int i14 = this.c;
      paramqal.c(24);
      paramqal.a(i14);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i12 = 0; i12 < this.d.length; i12++)
      {
        int i13 = this.d[i12];
        paramqal.c(32);
        paramqal.a(i13);
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i10 = 0; i10 < this.e.length; i10++)
      {
        int i11 = this.e[i10];
        paramqal.c(40);
        paramqal.a(i11);
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i9 = 0; i9 < this.f.length; i9++)
      {
        nmh localnmh = this.f[i9];
        if (localnmh != null)
        {
          paramqal.c(50);
          if (localnmh.ak < 0) {
            localnmh.ak = localnmh.a();
          }
          paramqal.c(localnmh.ak);
          localnmh.a(paramqal);
        }
      }
    }
    if (this.g != -2147483648)
    {
      int i8 = this.g;
      paramqal.c(56);
      paramqal.a(i8);
    }
    if (this.h != null)
    {
      int i5 = this.h.length;
      int i6 = 0;
      if (i5 > 0) {
        while (i6 < this.h.length)
        {
          int i7 = this.h[i6];
          paramqal.c(64);
          paramqal.a(i7);
          i6++;
        }
      }
    }
    if (this.i != -2147483648)
    {
      int i4 = this.i;
      paramqal.c(72);
      paramqal.a(i4);
    }
    if (this.j != -2147483648)
    {
      int i3 = this.j;
      paramqal.c(80);
      paramqal.a(i3);
    }
    if (this.k != -2147483648)
    {
      int i2 = this.k;
      paramqal.c(88);
      paramqal.a(i2);
    }
    if (this.l != -2147483648)
    {
      int i1 = this.l;
      paramqal.c(96);
      paramqal.a(i1);
    }
    if (this.m != -2147483648)
    {
      int n = this.m;
      paramqal.c(104);
      paramqal.a(n);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmg
 * JD-Core Version:    0.7.0.1
 */