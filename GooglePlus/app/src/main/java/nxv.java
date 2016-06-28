import java.nio.ByteBuffer;

public final class nxv
  extends qan<nxv>
{
  public nwn a = null;
  public nws b = null;
  public nwo c = null;
  public Boolean d = null;
  public nwb e = null;
  public nxn f = null;
  public nwa g = null;
  public nvy h = null;
  public nwl i = null;
  public nvg j = null;
  public nxn k = null;
  public nxd l = null;
  public nxc m = null;
  public nvw n = null;
  public nxn o = null;
  private Boolean p = null;
  private String q = null;
  private Boolean r = null;
  private nuv s = null;
  
  public nxv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.a != null)
    {
      nwn localnwn = this.a;
      int i32 = qal.d(8);
      int i33 = localnwn.a();
      localnwn.ak = i33;
      i1 += i32 + (i33 + qal.d(i33));
    }
    if (this.b != null)
    {
      nws localnws = this.b;
      int i30 = qal.d(16);
      int i31 = localnws.a();
      localnws.ak = i31;
      i1 += i30 + (i31 + qal.d(i31));
    }
    if (this.c != null)
    {
      nwo localnwo = this.c;
      int i28 = qal.d(24);
      int i29 = localnwo.a();
      localnwo.ak = i29;
      i1 += i28 + (i29 + qal.d(i29));
    }
    if (this.e != null)
    {
      nwb localnwb = this.e;
      int i26 = qal.d(32);
      int i27 = localnwb.a();
      localnwb.ak = i27;
      i1 += i26 + (i27 + qal.d(i27));
    }
    if (this.f != null)
    {
      nxn localnxn3 = this.f;
      int i24 = qal.d(40);
      int i25 = localnxn3.a();
      localnxn3.ak = i25;
      i1 += i24 + (i25 + qal.d(i25));
    }
    if (this.g != null)
    {
      nwa localnwa = this.g;
      int i22 = qal.d(48);
      int i23 = localnwa.a();
      localnwa.ak = i23;
      i1 += i22 + (i23 + qal.d(i23));
    }
    if (this.h != null)
    {
      nvy localnvy = this.h;
      int i20 = qal.d(56);
      int i21 = localnvy.a();
      localnvy.ak = i21;
      i1 += i20 + (i21 + qal.d(i21));
    }
    if (this.i != null)
    {
      nwl localnwl = this.i;
      int i18 = qal.d(64);
      int i19 = localnwl.a();
      localnwl.ak = i19;
      i1 += i18 + (i19 + qal.d(i19));
    }
    if (this.j != null)
    {
      nvg localnvg = this.j;
      int i16 = qal.d(72);
      int i17 = localnvg.a();
      localnvg.ak = i17;
      i1 += i16 + (i17 + qal.d(i17));
    }
    if (this.k != null)
    {
      nxn localnxn2 = this.k;
      int i14 = qal.d(80);
      int i15 = localnxn2.a();
      localnxn2.ak = i15;
      i1 += i14 + (i15 + qal.d(i15));
    }
    if (this.l != null)
    {
      nxd localnxd = this.l;
      int i12 = qal.d(88);
      int i13 = localnxd.a();
      localnxd.ak = i13;
      i1 += i12 + (i13 + qal.d(i13));
    }
    if (this.m != null)
    {
      nxc localnxc = this.m;
      int i10 = qal.d(96);
      int i11 = localnxc.a();
      localnxc.ak = i11;
      i1 += i10 + (i11 + qal.d(i11));
    }
    if (this.p != null)
    {
      this.p.booleanValue();
      i1 += 1 + qal.d(104);
    }
    if (this.q != null)
    {
      String str = this.q;
      int i8 = qal.d(112);
      int i9 = qal.a(str);
      i1 += i8 + (i9 + qal.d(i9));
    }
    if (this.r != null)
    {
      this.r.booleanValue();
      i1 += 1 + qal.d(128);
    }
    if (this.s != null)
    {
      nuv localnuv = this.s;
      int i6 = qal.d(136);
      int i7 = localnuv.a();
      localnuv.ak = i7;
      i1 += i6 + (i7 + qal.d(i7));
    }
    if (this.n != null)
    {
      nvw localnvw = this.n;
      int i4 = qal.d(144);
      int i5 = localnvw.a();
      localnvw.ak = i5;
      i1 += i4 + (i5 + qal.d(i5));
    }
    if (this.o != null)
    {
      nxn localnxn1 = this.o;
      int i2 = qal.d(152);
      int i3 = localnxn1.a();
      localnxn1.ak = i3;
      i1 += i2 + (i3 + qal.d(i3));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i1 += 1 + qal.d(160);
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.a != null)
    {
      nwn localnwn = this.a;
      paramqal.c(10);
      if (localnwn.ak < 0) {
        localnwn.ak = localnwn.a();
      }
      paramqal.c(localnwn.ak);
      localnwn.a(paramqal);
    }
    if (this.b != null)
    {
      nws localnws = this.b;
      paramqal.c(18);
      if (localnws.ak < 0) {
        localnws.ak = localnws.a();
      }
      paramqal.c(localnws.ak);
      localnws.a(paramqal);
    }
    if (this.c != null)
    {
      nwo localnwo = this.c;
      paramqal.c(26);
      if (localnwo.ak < 0) {
        localnwo.ak = localnwo.a();
      }
      paramqal.c(localnwo.ak);
      localnwo.a(paramqal);
    }
    if (this.e != null)
    {
      nwb localnwb = this.e;
      paramqal.c(34);
      if (localnwb.ak < 0) {
        localnwb.ak = localnwb.a();
      }
      paramqal.c(localnwb.ak);
      localnwb.a(paramqal);
    }
    if (this.f != null)
    {
      nxn localnxn3 = this.f;
      paramqal.c(42);
      if (localnxn3.ak < 0) {
        localnxn3.ak = localnxn3.a();
      }
      paramqal.c(localnxn3.ak);
      localnxn3.a(paramqal);
    }
    if (this.g != null)
    {
      nwa localnwa = this.g;
      paramqal.c(50);
      if (localnwa.ak < 0) {
        localnwa.ak = localnwa.a();
      }
      paramqal.c(localnwa.ak);
      localnwa.a(paramqal);
    }
    if (this.h != null)
    {
      nvy localnvy = this.h;
      paramqal.c(58);
      if (localnvy.ak < 0) {
        localnvy.ak = localnvy.a();
      }
      paramqal.c(localnvy.ak);
      localnvy.a(paramqal);
    }
    if (this.i != null)
    {
      nwl localnwl = this.i;
      paramqal.c(66);
      if (localnwl.ak < 0) {
        localnwl.ak = localnwl.a();
      }
      paramqal.c(localnwl.ak);
      localnwl.a(paramqal);
    }
    if (this.j != null)
    {
      nvg localnvg = this.j;
      paramqal.c(74);
      if (localnvg.ak < 0) {
        localnvg.ak = localnvg.a();
      }
      paramqal.c(localnvg.ak);
      localnvg.a(paramqal);
    }
    if (this.k != null)
    {
      nxn localnxn2 = this.k;
      paramqal.c(82);
      if (localnxn2.ak < 0) {
        localnxn2.ak = localnxn2.a();
      }
      paramqal.c(localnxn2.ak);
      localnxn2.a(paramqal);
    }
    if (this.l != null)
    {
      nxd localnxd = this.l;
      paramqal.c(90);
      if (localnxd.ak < 0) {
        localnxd.ak = localnxd.a();
      }
      paramqal.c(localnxd.ak);
      localnxd.a(paramqal);
    }
    if (this.m != null)
    {
      nxc localnxc = this.m;
      paramqal.c(98);
      if (localnxc.ak < 0) {
        localnxc.ak = localnxc.a();
      }
      paramqal.c(localnxc.ak);
      localnxc.a(paramqal);
    }
    if (this.p != null)
    {
      boolean bool3 = this.p.booleanValue();
      paramqal.c(104);
      if (bool3) {}
      byte b3;
      for (int i3 = i1;; i3 = 0)
      {
        b3 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.q != null)
    {
      String str = this.q;
      paramqal.c(114);
      paramqal.a(str);
    }
    if (this.r != null)
    {
      boolean bool2 = this.r.booleanValue();
      paramqal.c(128);
      if (bool2) {}
      byte b2;
      for (int i2 = i1;; i2 = 0)
      {
        b2 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.s != null)
    {
      nuv localnuv = this.s;
      paramqal.c(138);
      if (localnuv.ak < 0) {
        localnuv.ak = localnuv.a();
      }
      paramqal.c(localnuv.ak);
      localnuv.a(paramqal);
    }
    if (this.n != null)
    {
      nvw localnvw = this.n;
      paramqal.c(146);
      if (localnvw.ak < 0) {
        localnvw.ak = localnvw.a();
      }
      paramqal.c(localnvw.ak);
      localnvw.a(paramqal);
    }
    if (this.o != null)
    {
      nxn localnxn1 = this.o;
      paramqal.c(154);
      if (localnxn1.ak < 0) {
        localnxn1.ak = localnxn1.a();
      }
      paramqal.c(localnxn1.ak);
      localnxn1.a(paramqal);
    }
    if (this.d != null)
    {
      boolean bool1 = this.d.booleanValue();
      paramqal.c(160);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxv
 * JD-Core Version:    0.7.0.1
 */