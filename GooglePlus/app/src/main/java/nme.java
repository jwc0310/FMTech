public final class nme
  extends qan<nme>
{
  public Integer a = null;
  public Integer b = null;
  public Long c = null;
  public Integer d = null;
  public Integer e = null;
  public Integer f = null;
  public Integer g = null;
  public Integer h = null;
  public Integer i = null;
  public Integer j = null;
  public Integer k = null;
  private Integer l = null;
  
  public nme()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = 10;
    int n = super.a();
    int i32;
    int i33;
    if (this.a != null)
    {
      int i31 = this.a.intValue();
      i32 = qal.d(8);
      if (i31 >= 0) {
        i33 = qal.d(i31);
      }
    }
    for (int i1 = n + (i33 + i32);; i1 = n)
    {
      int i30;
      label86:
      int i27;
      label159:
      int i24;
      label202:
      int i21;
      label245:
      int i18;
      label288:
      int i15;
      label331:
      int i12;
      label374:
      int i9;
      label417:
      int i4;
      int i5;
      if (this.b != null)
      {
        int i28 = this.b.intValue();
        int i29 = qal.d(16);
        if (i28 >= 0)
        {
          i30 = qal.d(i28);
          i1 += i30 + i29;
        }
      }
      else
      {
        if (this.c != null)
        {
          long l1 = this.c.longValue();
          i1 += qal.d(24) + qal.b(l1);
        }
        if (this.d != null)
        {
          int i25 = this.d.intValue();
          int i26 = qal.d(32);
          if (i25 < 0) {
            break label523;
          }
          i27 = qal.d(i25);
          i1 += i27 + i26;
        }
        if (this.e != null)
        {
          int i22 = this.e.intValue();
          int i23 = qal.d(40);
          if (i22 < 0) {
            break label529;
          }
          i24 = qal.d(i22);
          i1 += i24 + i23;
        }
        if (this.f != null)
        {
          int i19 = this.f.intValue();
          int i20 = qal.d(48);
          if (i19 < 0) {
            break label535;
          }
          i21 = qal.d(i19);
          i1 += i21 + i20;
        }
        if (this.g != null)
        {
          int i16 = this.g.intValue();
          int i17 = qal.d(56);
          if (i16 < 0) {
            break label541;
          }
          i18 = qal.d(i16);
          i1 += i18 + i17;
        }
        if (this.h != null)
        {
          int i13 = this.h.intValue();
          int i14 = qal.d(64);
          if (i13 < 0) {
            break label547;
          }
          i15 = qal.d(i13);
          i1 += i15 + i14;
        }
        if (this.i != null)
        {
          int i10 = this.i.intValue();
          int i11 = qal.d(72);
          if (i10 < 0) {
            break label553;
          }
          i12 = qal.d(i10);
          i1 += i12 + i11;
        }
        if (this.j != null)
        {
          int i7 = this.j.intValue();
          int i8 = qal.d(80);
          if (i7 < 0) {
            break label559;
          }
          i9 = qal.d(i7);
          i1 += i9 + i8;
        }
        if (this.k != null)
        {
          i4 = this.k.intValue();
          i5 = qal.d(88);
          if (i4 < 0) {
            break label565;
          }
        }
      }
      label523:
      label529:
      label535:
      label541:
      label547:
      label553:
      label559:
      label565:
      for (int i6 = qal.d(i4);; i6 = m)
      {
        i1 += i6 + i5;
        if (this.l != null)
        {
          int i2 = this.l.intValue();
          int i3 = qal.d(96);
          if (i2 >= 0) {
            m = qal.d(i2);
          }
          i1 += m + i3;
        }
        return i1;
        i33 = m;
        break;
        i30 = m;
        break label86;
        i27 = m;
        break label159;
        i24 = m;
        break label202;
        i21 = m;
        break label245;
        i18 = m;
        break label288;
        i15 = m;
        break label331;
        i12 = m;
        break label374;
        i9 = m;
        break label417;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int i9 = this.a.intValue();
      paramqal.c(8);
      paramqal.a(i9);
    }
    if (this.b != null)
    {
      int i8 = this.b.intValue();
      paramqal.c(16);
      paramqal.a(i8);
    }
    if (this.c != null)
    {
      long l1 = this.c.longValue();
      paramqal.c(24);
      paramqal.a(l1);
    }
    if (this.d != null)
    {
      int i7 = this.d.intValue();
      paramqal.c(32);
      paramqal.a(i7);
    }
    if (this.e != null)
    {
      int i6 = this.e.intValue();
      paramqal.c(40);
      paramqal.a(i6);
    }
    if (this.f != null)
    {
      int i5 = this.f.intValue();
      paramqal.c(48);
      paramqal.a(i5);
    }
    if (this.g != null)
    {
      int i4 = this.g.intValue();
      paramqal.c(56);
      paramqal.a(i4);
    }
    if (this.h != null)
    {
      int i3 = this.h.intValue();
      paramqal.c(64);
      paramqal.a(i3);
    }
    if (this.i != null)
    {
      int i2 = this.i.intValue();
      paramqal.c(72);
      paramqal.a(i2);
    }
    if (this.j != null)
    {
      int i1 = this.j.intValue();
      paramqal.c(80);
      paramqal.a(i1);
    }
    if (this.k != null)
    {
      int n = this.k.intValue();
      paramqal.c(88);
      paramqal.a(n);
    }
    if (this.l != null)
    {
      int m = this.l.intValue();
      paramqal.c(96);
      paramqal.a(m);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nme
 * JD-Core Version:    0.7.0.1
 */