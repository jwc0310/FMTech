import java.nio.ByteBuffer;

public final class ojl
  extends qan<ojl>
{
  private Boolean A = null;
  private Boolean B = null;
  private Boolean C = null;
  private Boolean D = null;
  private Boolean E = null;
  public Boolean a = null;
  public Boolean b = null;
  public Boolean c = null;
  public Boolean d = null;
  public Boolean e = null;
  public Boolean f = null;
  public Boolean g = null;
  public Boolean h = null;
  public Boolean i = null;
  public Boolean j = null;
  public Boolean k = null;
  public Boolean l = null;
  private Boolean m = null;
  private Boolean n = null;
  private Boolean o = null;
  private Boolean p = null;
  private Boolean q = null;
  private Boolean r = null;
  private Boolean s = null;
  private Boolean t = null;
  private Boolean u = null;
  private Boolean v = null;
  private Boolean w = null;
  private Boolean x = null;
  private Boolean y = null;
  private Boolean z = null;
  
  public ojl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.m != null)
    {
      this.m.booleanValue();
      i1 += 1 + qal.d(8);
    }
    if (this.n != null)
    {
      this.n.booleanValue();
      i1 += 1 + qal.d(16);
    }
    if (this.a != null)
    {
      this.a.booleanValue();
      i1 += 1 + qal.d(24);
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i1 += 1 + qal.d(32);
    }
    if (this.q != null)
    {
      this.q.booleanValue();
      i1 += 1 + qal.d(40);
    }
    if (this.r != null)
    {
      this.r.booleanValue();
      i1 += 1 + qal.d(48);
    }
    if (this.s != null)
    {
      this.s.booleanValue();
      i1 += 1 + qal.d(56);
    }
    if (this.t != null)
    {
      this.t.booleanValue();
      i1 += 1 + qal.d(64);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i1 += 1 + qal.d(72);
    }
    if (this.u != null)
    {
      this.u.booleanValue();
      i1 += 1 + qal.d(80);
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i1 += 1 + qal.d(88);
    }
    if (this.w != null)
    {
      this.w.booleanValue();
      i1 += 1 + qal.d(96);
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i1 += 1 + qal.d(104);
    }
    if (this.z != null)
    {
      this.z.booleanValue();
      i1 += 1 + qal.d(112);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      i1 += 1 + qal.d(120);
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      i1 += 1 + qal.d(128);
    }
    if (this.A != null)
    {
      this.A.booleanValue();
      i1 += 1 + qal.d(136);
    }
    if (this.h != null)
    {
      this.h.booleanValue();
      i1 += 1 + qal.d(144);
    }
    if (this.x != null)
    {
      this.x.booleanValue();
      i1 += 1 + qal.d(152);
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      i1 += 1 + qal.d(160);
    }
    if (this.j != null)
    {
      this.j.booleanValue();
      i1 += 1 + qal.d(168);
    }
    if (this.B != null)
    {
      this.B.booleanValue();
      i1 += 1 + qal.d(176);
    }
    if (this.k != null)
    {
      this.k.booleanValue();
      i1 += 1 + qal.d(184);
    }
    if (this.C != null)
    {
      this.C.booleanValue();
      i1 += 1 + qal.d(192);
    }
    if (this.y != null)
    {
      this.y.booleanValue();
      i1 += 1 + qal.d(200);
    }
    if (this.l != null)
    {
      this.l.booleanValue();
      i1 += 1 + qal.d(216);
    }
    if (this.o != null)
    {
      this.o.booleanValue();
      i1 += 1 + qal.d(224);
    }
    if (this.p != null)
    {
      this.p.booleanValue();
      i1 += 1 + qal.d(232);
    }
    if (this.v != null)
    {
      this.v.booleanValue();
      i1 += 1 + qal.d(240);
    }
    if (this.D != null)
    {
      this.D.booleanValue();
      i1 += 1 + qal.d(248);
    }
    if (this.E != null)
    {
      this.E.booleanValue();
      i1 += 1 + qal.d(256);
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.m != null)
    {
      boolean bool31 = this.m.booleanValue();
      paramqal.c(8);
      if (bool31) {}
      byte b31;
      for (int i31 = i1;; i31 = 0)
      {
        b31 = (byte)i31;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b31);
    }
    if (this.n != null)
    {
      boolean bool30 = this.n.booleanValue();
      paramqal.c(16);
      if (bool30) {}
      byte b30;
      for (int i30 = i1;; i30 = 0)
      {
        b30 = (byte)i30;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b30);
    }
    if (this.a != null)
    {
      boolean bool29 = this.a.booleanValue();
      paramqal.c(24);
      if (bool29) {}
      byte b29;
      for (int i29 = i1;; i29 = 0)
      {
        b29 = (byte)i29;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b29);
    }
    if (this.b != null)
    {
      boolean bool28 = this.b.booleanValue();
      paramqal.c(32);
      if (bool28) {}
      byte b28;
      for (int i28 = i1;; i28 = 0)
      {
        b28 = (byte)i28;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b28);
    }
    if (this.q != null)
    {
      boolean bool27 = this.q.booleanValue();
      paramqal.c(40);
      if (bool27) {}
      byte b27;
      for (int i27 = i1;; i27 = 0)
      {
        b27 = (byte)i27;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b27);
    }
    if (this.r != null)
    {
      boolean bool26 = this.r.booleanValue();
      paramqal.c(48);
      if (bool26) {}
      byte b26;
      for (int i26 = i1;; i26 = 0)
      {
        b26 = (byte)i26;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b26);
    }
    if (this.s != null)
    {
      boolean bool25 = this.s.booleanValue();
      paramqal.c(56);
      if (bool25) {}
      byte b25;
      for (int i25 = i1;; i25 = 0)
      {
        b25 = (byte)i25;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b25);
    }
    if (this.t != null)
    {
      boolean bool24 = this.t.booleanValue();
      paramqal.c(64);
      if (bool24) {}
      byte b24;
      for (int i24 = i1;; i24 = 0)
      {
        b24 = (byte)i24;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b24);
    }
    if (this.c != null)
    {
      boolean bool23 = this.c.booleanValue();
      paramqal.c(72);
      if (bool23) {}
      byte b23;
      for (int i23 = i1;; i23 = 0)
      {
        b23 = (byte)i23;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b23);
    }
    if (this.u != null)
    {
      boolean bool22 = this.u.booleanValue();
      paramqal.c(80);
      if (bool22) {}
      byte b22;
      for (int i22 = i1;; i22 = 0)
      {
        b22 = (byte)i22;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b22);
    }
    if (this.d != null)
    {
      boolean bool21 = this.d.booleanValue();
      paramqal.c(88);
      if (bool21) {}
      byte b21;
      for (int i21 = i1;; i21 = 0)
      {
        b21 = (byte)i21;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b21);
    }
    if (this.w != null)
    {
      boolean bool20 = this.w.booleanValue();
      paramqal.c(96);
      if (bool20) {}
      byte b20;
      for (int i20 = i1;; i20 = 0)
      {
        b20 = (byte)i20;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b20);
    }
    if (this.e != null)
    {
      boolean bool19 = this.e.booleanValue();
      paramqal.c(104);
      if (bool19) {}
      byte b19;
      for (int i19 = i1;; i19 = 0)
      {
        b19 = (byte)i19;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b19);
    }
    if (this.z != null)
    {
      boolean bool18 = this.z.booleanValue();
      paramqal.c(112);
      if (bool18) {}
      byte b18;
      for (int i18 = i1;; i18 = 0)
      {
        b18 = (byte)i18;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b18);
    }
    if (this.f != null)
    {
      boolean bool17 = this.f.booleanValue();
      paramqal.c(120);
      if (bool17) {}
      byte b17;
      for (int i17 = i1;; i17 = 0)
      {
        b17 = (byte)i17;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b17);
    }
    if (this.g != null)
    {
      boolean bool16 = this.g.booleanValue();
      paramqal.c(128);
      if (bool16) {}
      byte b16;
      for (int i16 = i1;; i16 = 0)
      {
        b16 = (byte)i16;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b16);
    }
    if (this.A != null)
    {
      boolean bool15 = this.A.booleanValue();
      paramqal.c(136);
      if (bool15) {}
      byte b15;
      for (int i15 = i1;; i15 = 0)
      {
        b15 = (byte)i15;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b15);
    }
    if (this.h != null)
    {
      boolean bool14 = this.h.booleanValue();
      paramqal.c(144);
      if (bool14) {}
      byte b14;
      for (int i14 = i1;; i14 = 0)
      {
        b14 = (byte)i14;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b14);
    }
    if (this.x != null)
    {
      boolean bool13 = this.x.booleanValue();
      paramqal.c(152);
      if (bool13) {}
      byte b13;
      for (int i13 = i1;; i13 = 0)
      {
        b13 = (byte)i13;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b13);
    }
    if (this.i != null)
    {
      boolean bool12 = this.i.booleanValue();
      paramqal.c(160);
      if (bool12) {}
      byte b12;
      for (int i12 = i1;; i12 = 0)
      {
        b12 = (byte)i12;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b12);
    }
    if (this.j != null)
    {
      boolean bool11 = this.j.booleanValue();
      paramqal.c(168);
      if (bool11) {}
      byte b11;
      for (int i11 = i1;; i11 = 0)
      {
        b11 = (byte)i11;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b11);
    }
    if (this.B != null)
    {
      boolean bool10 = this.B.booleanValue();
      paramqal.c(176);
      if (bool10) {}
      byte b10;
      for (int i10 = i1;; i10 = 0)
      {
        b10 = (byte)i10;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b10);
    }
    if (this.k != null)
    {
      boolean bool9 = this.k.booleanValue();
      paramqal.c(184);
      if (bool9) {}
      byte b9;
      for (int i9 = i1;; i9 = 0)
      {
        b9 = (byte)i9;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b9);
    }
    if (this.C != null)
    {
      boolean bool8 = this.C.booleanValue();
      paramqal.c(192);
      if (bool8) {}
      byte b8;
      for (int i8 = i1;; i8 = 0)
      {
        b8 = (byte)i8;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b8);
    }
    if (this.y != null)
    {
      boolean bool7 = this.y.booleanValue();
      paramqal.c(200);
      if (bool7) {}
      byte b7;
      for (int i7 = i1;; i7 = 0)
      {
        b7 = (byte)i7;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b7);
    }
    if (this.l != null)
    {
      boolean bool6 = this.l.booleanValue();
      paramqal.c(216);
      if (bool6) {}
      byte b6;
      for (int i6 = i1;; i6 = 0)
      {
        b6 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b6);
    }
    if (this.o != null)
    {
      boolean bool5 = this.o.booleanValue();
      paramqal.c(224);
      if (bool5) {}
      byte b5;
      for (int i5 = i1;; i5 = 0)
      {
        b5 = (byte)i5;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if (this.p != null)
    {
      boolean bool4 = this.p.booleanValue();
      paramqal.c(232);
      if (bool4) {}
      byte b4;
      for (int i4 = i1;; i4 = 0)
      {
        b4 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.v != null)
    {
      boolean bool3 = this.v.booleanValue();
      paramqal.c(240);
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
    if (this.D != null)
    {
      boolean bool2 = this.D.booleanValue();
      paramqal.c(248);
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
    if (this.E != null)
    {
      boolean bool1 = this.E.booleanValue();
      paramqal.c(256);
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
 * Qualified Name:     ojl
 * JD-Core Version:    0.7.0.1
 */