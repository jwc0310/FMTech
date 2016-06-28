public final class nid
  extends qan<nid>
{
  private int[] a = qay.a;
  private njx[] b = njx.b();
  private njy[] c = njy.b();
  private nlg[] d = nlg.b();
  private Integer e = null;
  private Float f = null;
  private Float g = null;
  private Float h = null;
  private Integer i = null;
  private Integer j = null;
  private Integer k = null;
  private Integer l = null;
  private Integer m = null;
  
  public nid()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int n = 10;
    int i1 = super.a();
    int i33;
    if ((this.a != null) && (this.a.length > 0))
    {
      int i32 = 0;
      i33 = 0;
      if (i32 < this.a.length)
      {
        int i34 = this.a[i32];
        if (i34 >= 0) {}
        for (int i35 = qal.d(i34);; i35 = n)
        {
          i33 += i35;
          i32++;
          break;
        }
      }
    }
    for (int i2 = i1 + i33 + 1 * this.a.length;; i2 = i1)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int i28 = i2;
        for (int i29 = 0; i29 < this.b.length; i29++)
        {
          njx localnjx = this.b[i29];
          if (localnjx != null)
          {
            int i30 = qal.d(16);
            int i31 = localnjx.a();
            localnjx.ak = i31;
            i28 += i30 + (i31 + qal.d(i31));
          }
        }
        i2 = i28;
      }
      if ((this.c != null) && (this.c.length > 0))
      {
        int i24 = i2;
        for (int i25 = 0; i25 < this.c.length; i25++)
        {
          njy localnjy = this.c[i25];
          if (localnjy != null)
          {
            int i26 = qal.d(24);
            int i27 = localnjy.a();
            localnjy.ak = i27;
            i24 += i26 + (i27 + qal.d(i27));
          }
        }
        i2 = i24;
      }
      if (this.d != null)
      {
        int i20 = this.d.length;
        int i21 = 0;
        if (i20 > 0) {
          while (i21 < this.d.length)
          {
            nlg localnlg = this.d[i21];
            if (localnlg != null)
            {
              int i22 = qal.d(32);
              int i23 = localnlg.a();
              localnlg.ak = i23;
              i2 += i22 + (i23 + qal.d(i23));
            }
            i21++;
          }
        }
      }
      int i19;
      int i16;
      label514:
      int i13;
      label557:
      int i10;
      label600:
      int i5;
      int i6;
      if (this.e != null)
      {
        int i17 = this.e.intValue();
        int i18 = qal.d(40);
        if (i17 >= 0)
        {
          i19 = qal.d(i17);
          i2 += i19 + i18;
        }
      }
      else
      {
        if (this.f != null)
        {
          this.f.floatValue();
          i2 += 4 + qal.d(48);
        }
        if (this.g != null)
        {
          this.g.floatValue();
          i2 += 4 + qal.d(56);
        }
        if (this.h != null)
        {
          this.h.floatValue();
          i2 += 4 + qal.d(64);
        }
        if (this.i != null)
        {
          int i14 = this.i.intValue();
          int i15 = qal.d(72);
          if (i14 < 0) {
            break label700;
          }
          i16 = qal.d(i14);
          i2 += i16 + i15;
        }
        if (this.j != null)
        {
          int i11 = this.j.intValue();
          int i12 = qal.d(80);
          if (i11 < 0) {
            break label706;
          }
          i13 = qal.d(i11);
          i2 += i13 + i12;
        }
        if (this.k != null)
        {
          int i8 = this.k.intValue();
          int i9 = qal.d(88);
          if (i8 < 0) {
            break label712;
          }
          i10 = qal.d(i8);
          i2 += i10 + i9;
        }
        if (this.l != null)
        {
          i5 = this.l.intValue();
          i6 = qal.d(96);
          if (i5 < 0) {
            break label718;
          }
        }
      }
      label700:
      label706:
      label712:
      label718:
      for (int i7 = qal.d(i5);; i7 = n)
      {
        i2 += i7 + i6;
        if (this.m != null)
        {
          int i3 = this.m.intValue();
          int i4 = qal.d(104);
          if (i3 >= 0) {
            n = qal.d(i3);
          }
          i2 += i4 + n;
        }
        return i2;
        i19 = n;
        break;
        i16 = n;
        break label514;
        i13 = n;
        break label557;
        i10 = n;
        break label600;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i10 = 0; i10 < this.a.length; i10++)
      {
        int i11 = this.a[i10];
        paramqal.c(8);
        paramqal.a(i11);
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i9 = 0; i9 < this.b.length; i9++)
      {
        njx localnjx = this.b[i9];
        if (localnjx != null)
        {
          paramqal.c(18);
          if (localnjx.ak < 0) {
            localnjx.ak = localnjx.a();
          }
          paramqal.c(localnjx.ak);
          localnjx.a(paramqal);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i8 = 0; i8 < this.c.length; i8++)
      {
        njy localnjy = this.c[i8];
        if (localnjy != null)
        {
          paramqal.c(26);
          if (localnjy.ak < 0) {
            localnjy.ak = localnjy.a();
          }
          paramqal.c(localnjy.ak);
          localnjy.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      int i6 = this.d.length;
      int i7 = 0;
      if (i6 > 0) {
        while (i7 < this.d.length)
        {
          nlg localnlg = this.d[i7];
          if (localnlg != null)
          {
            paramqal.c(34);
            if (localnlg.ak < 0) {
              localnlg.ak = localnlg.a();
            }
            paramqal.c(localnlg.ak);
            localnlg.a(paramqal);
          }
          i7++;
        }
      }
    }
    if (this.e != null)
    {
      int i5 = this.e.intValue();
      paramqal.c(40);
      paramqal.a(i5);
    }
    if (this.f != null)
    {
      float f3 = this.f.floatValue();
      paramqal.c(53);
      paramqal.e(Float.floatToIntBits(f3));
    }
    if (this.g != null)
    {
      float f2 = this.g.floatValue();
      paramqal.c(61);
      paramqal.e(Float.floatToIntBits(f2));
    }
    if (this.h != null)
    {
      float f1 = this.h.floatValue();
      paramqal.c(69);
      paramqal.e(Float.floatToIntBits(f1));
    }
    if (this.i != null)
    {
      int i4 = this.i.intValue();
      paramqal.c(72);
      paramqal.a(i4);
    }
    if (this.j != null)
    {
      int i3 = this.j.intValue();
      paramqal.c(80);
      paramqal.a(i3);
    }
    if (this.k != null)
    {
      int i2 = this.k.intValue();
      paramqal.c(88);
      paramqal.a(i2);
    }
    if (this.l != null)
    {
      int i1 = this.l.intValue();
      paramqal.c(96);
      paramqal.a(i1);
    }
    if (this.m != null)
    {
      int n = this.m.intValue();
      paramqal.c(104);
      paramqal.a(n);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nid
 * JD-Core Version:    0.7.0.1
 */