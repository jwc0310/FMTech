import java.nio.ByteBuffer;

public final class npm
  extends qan<npm>
{
  public npe a = null;
  public int[] b = qay.a;
  public npb c = null;
  public npj d = null;
  public npq e = null;
  public npr f = null;
  public Boolean g = null;
  public npo h = null;
  private nos i = null;
  private npc j = null;
  private npd k = null;
  private npi[] l = npi.b();
  private npk[] m = npk.b();
  private npl n = null;
  private not o = null;
  private npp p = null;
  
  public npm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.a != null)
    {
      npe localnpe = this.a;
      int i36 = qal.d(8);
      int i37 = localnpe.a();
      localnpe.ak = i37;
      i1 += i36 + (i37 + qal.d(i37));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i32 = 0;
      int i33 = 0;
      if (i32 < this.b.length)
      {
        int i34 = this.b[i32];
        if (i34 >= 0) {}
        for (int i35 = qal.d(i34);; i35 = 10)
        {
          i33 += i35;
          i32++;
          break;
        }
      }
      i1 = i1 + i33 + 1 * this.b.length;
    }
    if (this.i != null)
    {
      nos localnos = this.i;
      int i30 = qal.d(24);
      int i31 = localnos.a();
      localnos.ak = i31;
      i1 += i30 + (i31 + qal.d(i31));
    }
    if (this.j != null)
    {
      npc localnpc = this.j;
      int i28 = qal.d(32);
      int i29 = localnpc.a();
      localnpc.ak = i29;
      i1 += i28 + (i29 + qal.d(i29));
    }
    if (this.k != null)
    {
      npd localnpd = this.k;
      int i26 = qal.d(40);
      int i27 = localnpd.a();
      localnpd.ak = i27;
      i1 += i26 + (i27 + qal.d(i27));
    }
    if ((this.l != null) && (this.l.length > 0))
    {
      int i22 = i1;
      for (int i23 = 0; i23 < this.l.length; i23++)
      {
        npi localnpi = this.l[i23];
        if (localnpi != null)
        {
          int i24 = qal.d(56);
          int i25 = localnpi.a();
          localnpi.ak = i25;
          i22 += i24 + (i25 + qal.d(i25));
        }
      }
      i1 = i22;
    }
    if (this.d != null)
    {
      npj localnpj = this.d;
      int i20 = qal.d(64);
      int i21 = localnpj.a();
      localnpj.ak = i21;
      i1 += i20 + (i21 + qal.d(i21));
    }
    if (this.m != null)
    {
      int i16 = this.m.length;
      int i17 = 0;
      if (i16 > 0) {
        while (i17 < this.m.length)
        {
          npk localnpk = this.m[i17];
          if (localnpk != null)
          {
            int i18 = qal.d(72);
            int i19 = localnpk.a();
            localnpk.ak = i19;
            i1 += i18 + (i19 + qal.d(i19));
          }
          i17++;
        }
      }
    }
    if (this.n != null)
    {
      npl localnpl = this.n;
      int i14 = qal.d(80);
      int i15 = localnpl.a();
      localnpl.ak = i15;
      i1 += i14 + (i15 + qal.d(i15));
    }
    if (this.e != null)
    {
      npq localnpq = this.e;
      int i12 = qal.d(88);
      int i13 = localnpq.a();
      localnpq.ak = i13;
      i1 += i12 + (i13 + qal.d(i13));
    }
    if (this.f != null)
    {
      npr localnpr = this.f;
      int i10 = qal.d(96);
      int i11 = localnpr.a();
      localnpr.ak = i11;
      i1 += i10 + (i11 + qal.d(i11));
    }
    if (this.c != null)
    {
      npb localnpb = this.c;
      int i8 = qal.d(104);
      int i9 = localnpb.a();
      localnpb.ak = i9;
      i1 += i8 + (i9 + qal.d(i9));
    }
    if (this.h != null)
    {
      npo localnpo = this.h;
      int i6 = qal.d(112);
      int i7 = localnpo.a();
      localnpo.ak = i7;
      i1 += i6 + (i7 + qal.d(i7));
    }
    if (this.o != null)
    {
      not localnot = this.o;
      int i4 = qal.d(120);
      int i5 = localnot.a();
      localnot.ak = i5;
      i1 += i4 + (i5 + qal.d(i5));
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      i1 += 1 + qal.d(128);
    }
    if (this.p != null)
    {
      npp localnpp = this.p;
      int i2 = qal.d(136);
      int i3 = localnpp.a();
      localnpp.ak = i3;
      i1 += i2 + (i3 + qal.d(i3));
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      npe localnpe = this.a;
      paramqal.c(10);
      if (localnpe.ak < 0) {
        localnpe.ak = localnpe.a();
      }
      paramqal.c(localnpe.ak);
      localnpe.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i4 = 0; i4 < this.b.length; i4++)
      {
        int i5 = this.b[i4];
        paramqal.c(16);
        paramqal.a(i5);
      }
    }
    if (this.i != null)
    {
      nos localnos = this.i;
      paramqal.c(26);
      if (localnos.ak < 0) {
        localnos.ak = localnos.a();
      }
      paramqal.c(localnos.ak);
      localnos.a(paramqal);
    }
    if (this.j != null)
    {
      npc localnpc = this.j;
      paramqal.c(34);
      if (localnpc.ak < 0) {
        localnpc.ak = localnpc.a();
      }
      paramqal.c(localnpc.ak);
      localnpc.a(paramqal);
    }
    if (this.k != null)
    {
      npd localnpd = this.k;
      paramqal.c(42);
      if (localnpd.ak < 0) {
        localnpd.ak = localnpd.a();
      }
      paramqal.c(localnpd.ak);
      localnpd.a(paramqal);
    }
    if ((this.l != null) && (this.l.length > 0)) {
      for (int i3 = 0; i3 < this.l.length; i3++)
      {
        npi localnpi = this.l[i3];
        if (localnpi != null)
        {
          paramqal.c(58);
          if (localnpi.ak < 0) {
            localnpi.ak = localnpi.a();
          }
          paramqal.c(localnpi.ak);
          localnpi.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      npj localnpj = this.d;
      paramqal.c(66);
      if (localnpj.ak < 0) {
        localnpj.ak = localnpj.a();
      }
      paramqal.c(localnpj.ak);
      localnpj.a(paramqal);
    }
    if ((this.m != null) && (this.m.length > 0)) {
      for (int i2 = 0; i2 < this.m.length; i2++)
      {
        npk localnpk = this.m[i2];
        if (localnpk != null)
        {
          paramqal.c(74);
          if (localnpk.ak < 0) {
            localnpk.ak = localnpk.a();
          }
          paramqal.c(localnpk.ak);
          localnpk.a(paramqal);
        }
      }
    }
    if (this.n != null)
    {
      npl localnpl = this.n;
      paramqal.c(82);
      if (localnpl.ak < 0) {
        localnpl.ak = localnpl.a();
      }
      paramqal.c(localnpl.ak);
      localnpl.a(paramqal);
    }
    if (this.e != null)
    {
      npq localnpq = this.e;
      paramqal.c(90);
      if (localnpq.ak < 0) {
        localnpq.ak = localnpq.a();
      }
      paramqal.c(localnpq.ak);
      localnpq.a(paramqal);
    }
    if (this.f != null)
    {
      npr localnpr = this.f;
      paramqal.c(98);
      if (localnpr.ak < 0) {
        localnpr.ak = localnpr.a();
      }
      paramqal.c(localnpr.ak);
      localnpr.a(paramqal);
    }
    if (this.c != null)
    {
      npb localnpb = this.c;
      paramqal.c(106);
      if (localnpb.ak < 0) {
        localnpb.ak = localnpb.a();
      }
      paramqal.c(localnpb.ak);
      localnpb.a(paramqal);
    }
    if (this.h != null)
    {
      npo localnpo = this.h;
      paramqal.c(114);
      if (localnpo.ak < 0) {
        localnpo.ak = localnpo.a();
      }
      paramqal.c(localnpo.ak);
      localnpo.a(paramqal);
    }
    if (this.o != null)
    {
      not localnot = this.o;
      paramqal.c(122);
      if (localnot.ak < 0) {
        localnot.ak = localnot.a();
      }
      paramqal.c(localnot.ak);
      localnot.a(paramqal);
    }
    if (this.g != null)
    {
      boolean bool = this.g.booleanValue();
      paramqal.c(128);
      int i1 = 0;
      if (bool) {
        i1 = 1;
      }
      byte b1 = (byte)i1;
      if (!paramqal.a.hasRemaining()) {
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.p != null)
    {
      npp localnpp = this.p;
      paramqal.c(138);
      if (localnpp.ak < 0) {
        localnpp.ak = localnpp.a();
      }
      paramqal.c(localnpp.ak);
      localnpp.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npm
 * JD-Core Version:    0.7.0.1
 */