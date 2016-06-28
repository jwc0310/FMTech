import java.nio.ByteBuffer;

public final class nif
  extends qan<nif>
{
  public String a = null;
  public int b = -2147483648;
  public String c = null;
  public Integer d = null;
  private Boolean e = null;
  private Boolean f = null;
  private Boolean g = null;
  private Integer h = null;
  private Integer i = null;
  private Integer j = null;
  private int k = -2147483648;
  private Integer l = null;
  private int m = -2147483648;
  private Integer n = null;
  private Integer o = null;
  private Integer p = null;
  private int q = -2147483648;
  private Integer r = null;
  
  public nif()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if (this.e != null)
    {
      this.e.booleanValue();
      i2 += 1 + qal.d(8);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      i2 += 1 + qal.d(16);
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      i2 += 1 + qal.d(24);
    }
    int i44;
    int i41;
    label161:
    int i38;
    label204:
    int i35;
    label246:
    int i30;
    label330:
    int i27;
    label372:
    int i24;
    label414:
    int i21;
    label457:
    int i18;
    label500:
    int i13;
    label584:
    int i10;
    label628:
    int i5;
    int i6;
    if (this.h != null)
    {
      int i42 = this.h.intValue();
      int i43 = qal.d(32);
      if (i42 >= 0)
      {
        i44 = qal.d(i42);
        i2 += i44 + i43;
      }
    }
    else
    {
      if (this.i != null)
      {
        int i39 = this.i.intValue();
        int i40 = qal.d(40);
        if (i39 < 0) {
          break label726;
        }
        i41 = qal.d(i39);
        i2 += i41 + i40;
      }
      if (this.j != null)
      {
        int i36 = this.j.intValue();
        int i37 = qal.d(48);
        if (i36 < 0) {
          break label732;
        }
        i38 = qal.d(i36);
        i2 += i38 + i37;
      }
      if (this.k != -2147483648)
      {
        int i33 = this.k;
        int i34 = qal.d(56);
        if (i33 < 0) {
          break label738;
        }
        i35 = qal.d(i33);
        i2 += i35 + i34;
      }
      if (this.a != null)
      {
        String str2 = this.a;
        int i31 = qal.d(64);
        int i32 = qal.a(str2);
        i2 += i31 + (i32 + qal.d(i32));
      }
      if (this.l != null)
      {
        int i28 = this.l.intValue();
        int i29 = qal.d(72);
        if (i28 < 0) {
          break label744;
        }
        i30 = qal.d(i28);
        i2 += i30 + i29;
      }
      if (this.b != -2147483648)
      {
        int i25 = this.b;
        int i26 = qal.d(80);
        if (i25 < 0) {
          break label750;
        }
        i27 = qal.d(i25);
        i2 += i27 + i26;
      }
      if (this.m != -2147483648)
      {
        int i22 = this.m;
        int i23 = qal.d(88);
        if (i22 < 0) {
          break label756;
        }
        i24 = qal.d(i22);
        i2 += i24 + i23;
      }
      if (this.n != null)
      {
        int i19 = this.n.intValue();
        int i20 = qal.d(96);
        if (i19 < 0) {
          break label762;
        }
        i21 = qal.d(i19);
        i2 += i21 + i20;
      }
      if (this.o != null)
      {
        int i16 = this.o.intValue();
        int i17 = qal.d(104);
        if (i16 < 0) {
          break label768;
        }
        i18 = qal.d(i16);
        i2 += i18 + i17;
      }
      if (this.c != null)
      {
        String str1 = this.c;
        int i14 = qal.d(112);
        int i15 = qal.a(str1);
        i2 += i14 + (i15 + qal.d(i15));
      }
      if (this.d != null)
      {
        int i11 = this.d.intValue();
        int i12 = qal.d(120);
        if (i11 < 0) {
          break label774;
        }
        i13 = qal.d(i11);
        i2 += i13 + i12;
      }
      if (this.p != null)
      {
        int i8 = this.p.intValue();
        int i9 = qal.d(128);
        if (i8 < 0) {
          break label780;
        }
        i10 = qal.d(i8);
        i2 += i10 + i9;
      }
      if (this.q != -2147483648)
      {
        i5 = this.q;
        i6 = qal.d(136);
        if (i5 < 0) {
          break label786;
        }
      }
    }
    label768:
    label774:
    label780:
    label786:
    for (int i7 = qal.d(i5);; i7 = i1)
    {
      i2 += i7 + i6;
      if (this.r != null)
      {
        int i3 = this.r.intValue();
        int i4 = qal.d(144);
        if (i3 >= 0) {
          i1 = qal.d(i3);
        }
        i2 += i4 + i1;
      }
      return i2;
      i44 = i1;
      break;
      label726:
      i41 = i1;
      break label161;
      label732:
      i38 = i1;
      break label204;
      label738:
      i35 = i1;
      break label246;
      label744:
      i30 = i1;
      break label330;
      label750:
      i27 = i1;
      break label372;
      label756:
      i24 = i1;
      break label414;
      label762:
      i21 = i1;
      break label457;
      i18 = i1;
      break label500;
      i13 = i1;
      break label584;
      i10 = i1;
      break label628;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.e != null)
    {
      boolean bool3 = this.e.booleanValue();
      paramqal.c(8);
      if (bool3) {}
      byte b3;
      for (int i16 = i1;; i16 = 0)
      {
        b3 = (byte)i16;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.f != null)
    {
      boolean bool2 = this.f.booleanValue();
      paramqal.c(16);
      if (bool2) {}
      byte b2;
      for (int i15 = i1;; i15 = 0)
      {
        b2 = (byte)i15;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.g != null)
    {
      boolean bool1 = this.g.booleanValue();
      paramqal.c(24);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i1 = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.h != null)
    {
      int i14 = this.h.intValue();
      paramqal.c(32);
      paramqal.a(i14);
    }
    if (this.i != null)
    {
      int i13 = this.i.intValue();
      paramqal.c(40);
      paramqal.a(i13);
    }
    if (this.j != null)
    {
      int i12 = this.j.intValue();
      paramqal.c(48);
      paramqal.a(i12);
    }
    if (this.k != -2147483648)
    {
      int i11 = this.k;
      paramqal.c(56);
      paramqal.a(i11);
    }
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(66);
      paramqal.a(str2);
    }
    if (this.l != null)
    {
      int i10 = this.l.intValue();
      paramqal.c(72);
      paramqal.a(i10);
    }
    if (this.b != -2147483648)
    {
      int i9 = this.b;
      paramqal.c(80);
      paramqal.a(i9);
    }
    if (this.m != -2147483648)
    {
      int i8 = this.m;
      paramqal.c(88);
      paramqal.a(i8);
    }
    if (this.n != null)
    {
      int i7 = this.n.intValue();
      paramqal.c(96);
      paramqal.a(i7);
    }
    if (this.o != null)
    {
      int i6 = this.o.intValue();
      paramqal.c(104);
      paramqal.a(i6);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(114);
      paramqal.a(str1);
    }
    if (this.d != null)
    {
      int i5 = this.d.intValue();
      paramqal.c(120);
      paramqal.a(i5);
    }
    if (this.p != null)
    {
      int i4 = this.p.intValue();
      paramqal.c(128);
      paramqal.a(i4);
    }
    if (this.q != -2147483648)
    {
      int i3 = this.q;
      paramqal.c(136);
      paramqal.a(i3);
    }
    if (this.r != null)
    {
      int i2 = this.r.intValue();
      paramqal.c(144);
      paramqal.a(i2);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nif
 * JD-Core Version:    0.7.0.1
 */