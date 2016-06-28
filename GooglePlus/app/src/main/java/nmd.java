import java.nio.ByteBuffer;

public final class nmd
  extends qan<nmd>
{
  public pge a = null;
  public nie b = null;
  public nlz c = null;
  public nlz d = null;
  public Boolean e = null;
  public nma f = null;
  private Long g = null;
  private njq h = null;
  private Boolean i = null;
  private Boolean j = null;
  private Integer k = null;
  private njr l = null;
  private nlo m = null;
  private String n = null;
  private String o = null;
  private nmx p = null;
  private nmc q = null;
  
  public nmd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.g != null)
    {
      long l1 = this.g.longValue();
      i1 += qal.d(8) + qal.b(l1);
    }
    if (this.a != null)
    {
      pge localpge = this.a;
      int i27 = qal.d(16);
      int i28 = localpge.a();
      localpge.ak = i28;
      i1 += i27 + (i28 + qal.d(i28));
    }
    if (this.b != null)
    {
      nie localnie = this.b;
      int i25 = qal.d(24);
      int i26 = localnie.a();
      localnie.ak = i26;
      i1 += i25 + (i26 + qal.d(i26));
    }
    if (this.h != null)
    {
      njq localnjq = this.h;
      int i23 = qal.d(32);
      int i24 = localnjq.a();
      localnjq.ak = i24;
      i1 += i23 + (i24 + qal.d(i24));
    }
    if (this.c != null)
    {
      nlz localnlz2 = this.c;
      int i21 = qal.d(40);
      int i22 = localnlz2.a();
      localnlz2.ak = i22;
      i1 += i21 + (i22 + qal.d(i22));
    }
    if (this.d != null)
    {
      nlz localnlz1 = this.d;
      int i19 = qal.d(48);
      int i20 = localnlz1.a();
      localnlz1.ak = i20;
      i1 += i19 + (i20 + qal.d(i20));
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      i1 += 1 + qal.d(56);
    }
    if (this.j != null)
    {
      this.j.booleanValue();
      i1 += 1 + qal.d(64);
    }
    int i16;
    int i17;
    if (this.k != null)
    {
      i16 = this.k.intValue();
      i17 = qal.d(72);
      if (i16 < 0) {
        break label714;
      }
    }
    label714:
    for (int i18 = qal.d(i16);; i18 = 10)
    {
      i1 += i18 + i17;
      if (this.l != null)
      {
        njr localnjr = this.l;
        int i14 = qal.d(80);
        int i15 = localnjr.a();
        localnjr.ak = i15;
        i1 += i14 + (i15 + qal.d(i15));
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        i1 += 1 + qal.d(88);
      }
      if (this.m != null)
      {
        nlo localnlo = this.m;
        int i12 = qal.d(96);
        int i13 = localnlo.a();
        localnlo.ak = i13;
        i1 += i12 + (i13 + qal.d(i13));
      }
      if (this.n != null)
      {
        String str2 = this.n;
        int i10 = qal.d(104);
        int i11 = qal.a(str2);
        i1 += i10 + (i11 + qal.d(i11));
      }
      if (this.o != null)
      {
        String str1 = this.o;
        int i8 = qal.d(112);
        int i9 = qal.a(str1);
        i1 += i8 + (i9 + qal.d(i9));
      }
      if (this.p != null)
      {
        nmx localnmx = this.p;
        int i6 = qal.d(120);
        int i7 = localnmx.a();
        localnmx.ak = i7;
        i1 += i6 + (i7 + qal.d(i7));
      }
      if (this.f != null)
      {
        nma localnma = this.f;
        int i4 = qal.d(128);
        int i5 = localnma.a();
        localnma.ak = i5;
        i1 += i4 + (i5 + qal.d(i5));
      }
      if (this.q != null)
      {
        nmc localnmc = this.q;
        int i2 = qal.d(136);
        int i3 = localnmc.a();
        localnmc.ak = i3;
        i1 += i2 + (i3 + qal.d(i3));
      }
      return i1;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.g != null)
    {
      long l1 = this.g.longValue();
      paramqal.c(8);
      paramqal.a(l1);
    }
    if (this.a != null)
    {
      pge localpge = this.a;
      paramqal.c(18);
      if (localpge.ak < 0) {
        localpge.ak = localpge.a();
      }
      paramqal.c(localpge.ak);
      localpge.a(paramqal);
    }
    if (this.b != null)
    {
      nie localnie = this.b;
      paramqal.c(26);
      if (localnie.ak < 0) {
        localnie.ak = localnie.a();
      }
      paramqal.c(localnie.ak);
      localnie.a(paramqal);
    }
    if (this.h != null)
    {
      njq localnjq = this.h;
      paramqal.c(34);
      if (localnjq.ak < 0) {
        localnjq.ak = localnjq.a();
      }
      paramqal.c(localnjq.ak);
      localnjq.a(paramqal);
    }
    if (this.c != null)
    {
      nlz localnlz2 = this.c;
      paramqal.c(42);
      if (localnlz2.ak < 0) {
        localnlz2.ak = localnlz2.a();
      }
      paramqal.c(localnlz2.ak);
      localnlz2.a(paramqal);
    }
    if (this.d != null)
    {
      nlz localnlz1 = this.d;
      paramqal.c(50);
      if (localnlz1.ak < 0) {
        localnlz1.ak = localnlz1.a();
      }
      paramqal.c(localnlz1.ak);
      localnlz1.a(paramqal);
    }
    if (this.i != null)
    {
      boolean bool3 = this.i.booleanValue();
      paramqal.c(56);
      if (bool3) {}
      byte b3;
      for (int i4 = i1;; i4 = 0)
      {
        b3 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.j != null)
    {
      boolean bool2 = this.j.booleanValue();
      paramqal.c(64);
      if (bool2) {}
      byte b2;
      for (int i3 = i1;; i3 = 0)
      {
        b2 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.k != null)
    {
      int i2 = this.k.intValue();
      paramqal.c(72);
      paramqal.a(i2);
    }
    if (this.l != null)
    {
      njr localnjr = this.l;
      paramqal.c(82);
      if (localnjr.ak < 0) {
        localnjr.ak = localnjr.a();
      }
      paramqal.c(localnjr.ak);
      localnjr.a(paramqal);
    }
    if (this.e != null)
    {
      boolean bool1 = this.e.booleanValue();
      paramqal.c(88);
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
    if (this.m != null)
    {
      nlo localnlo = this.m;
      paramqal.c(98);
      if (localnlo.ak < 0) {
        localnlo.ak = localnlo.a();
      }
      paramqal.c(localnlo.ak);
      localnlo.a(paramqal);
    }
    if (this.n != null)
    {
      String str2 = this.n;
      paramqal.c(106);
      paramqal.a(str2);
    }
    if (this.o != null)
    {
      String str1 = this.o;
      paramqal.c(114);
      paramqal.a(str1);
    }
    if (this.p != null)
    {
      nmx localnmx = this.p;
      paramqal.c(122);
      if (localnmx.ak < 0) {
        localnmx.ak = localnmx.a();
      }
      paramqal.c(localnmx.ak);
      localnmx.a(paramqal);
    }
    if (this.f != null)
    {
      nma localnma = this.f;
      paramqal.c(130);
      if (localnma.ak < 0) {
        localnma.ak = localnma.a();
      }
      paramqal.c(localnma.ak);
      localnma.a(paramqal);
    }
    if (this.q != null)
    {
      nmc localnmc = this.q;
      paramqal.c(138);
      if (localnmc.ak < 0) {
        localnmc.ak = localnmc.a();
      }
      paramqal.c(localnmc.ak);
      localnmc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmd
 * JD-Core Version:    0.7.0.1
 */