import java.nio.ByteBuffer;

public final class ogu
  extends qan<ogu>
{
  public opg a = null;
  public String b = null;
  public Boolean c = null;
  public qbd d = null;
  public Boolean e = null;
  public olm f = null;
  public byte[] g = null;
  public ogz h = null;
  public ohd i = null;
  public ohb j = null;
  public ogj k = null;
  private String l = null;
  private String m = null;
  private Boolean n = null;
  private Boolean o = null;
  private Boolean p = null;
  private ohc[] q = ohc.b();
  private qzk r = null;
  
  public ogu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.a != null)
    {
      opg localopg = this.a;
      int i26 = qal.d(8);
      int i27 = localopg.a();
      localopg.ak = i27;
      i1 += i26 + (i27 + qal.d(i27));
    }
    if (this.b != null)
    {
      String str3 = this.b;
      int i24 = qal.d(16);
      int i25 = qal.a(str3);
      i1 += i24 + (i25 + qal.d(i25));
    }
    if (this.l != null)
    {
      String str2 = this.l;
      int i22 = qal.d(24);
      int i23 = qal.a(str2);
      i1 += i22 + (i23 + qal.d(i23));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i1 += 1 + qal.d(32);
    }
    if (this.m != null)
    {
      String str1 = this.m;
      int i20 = qal.d(40);
      int i21 = qal.a(str1);
      i1 += i20 + (i21 + qal.d(i21));
    }
    if (this.d != null)
    {
      qbd localqbd = this.d;
      int i18 = qal.d(48);
      int i19 = localqbd.a();
      localqbd.ak = i19;
      i1 += i18 + (i19 + qal.d(i19));
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i1 += 1 + qal.d(56);
    }
    if (this.n != null)
    {
      this.n.booleanValue();
      i1 += 1 + qal.d(64);
    }
    if (this.f != null)
    {
      olm localolm = this.f;
      int i16 = qal.d(72);
      int i17 = localolm.a();
      localolm.ak = i17;
      i1 += i16 + (i17 + qal.d(i17));
    }
    if (this.o != null)
    {
      this.o.booleanValue();
      i1 += 1 + qal.d(80);
    }
    if (this.p != null)
    {
      this.p.booleanValue();
      i1 += 1 + qal.d(88);
    }
    if (this.g != null)
    {
      byte[] arrayOfByte = this.g;
      i1 += qal.d(96) + (qal.d(arrayOfByte.length) + arrayOfByte.length);
    }
    if (this.h != null)
    {
      ogz localogz = this.h;
      int i14 = qal.d(104);
      int i15 = localogz.a();
      localogz.ak = i15;
      i1 += i14 + (i15 + qal.d(i15));
    }
    if ((this.q != null) && (this.q.length > 0))
    {
      int i10 = i1;
      for (int i11 = 0; i11 < this.q.length; i11++)
      {
        ohc localohc = this.q[i11];
        if (localohc != null)
        {
          int i12 = qal.d(112);
          int i13 = localohc.a();
          localohc.ak = i13;
          i10 += i12 + (i13 + qal.d(i13));
        }
      }
      i1 = i10;
    }
    if (this.i != null)
    {
      ohd localohd = this.i;
      int i8 = qal.d(120);
      int i9 = localohd.a();
      localohd.ak = i9;
      i1 += i8 + (i9 + qal.d(i9));
    }
    if (this.j != null)
    {
      ohb localohb = this.j;
      int i6 = qal.d(128);
      int i7 = localohb.a();
      localohb.ak = i7;
      i1 += i6 + (i7 + qal.d(i7));
    }
    if (this.r != null)
    {
      qzk localqzk = this.r;
      int i4 = qal.d(136);
      int i5 = localqzk.a();
      localqzk.ak = i5;
      i1 += i4 + (i5 + qal.d(i5));
    }
    if (this.k != null)
    {
      ogj localogj = this.k;
      int i2 = qal.d(144);
      int i3 = localogj.a();
      localogj.ak = i3;
      i1 += i2 + (i3 + qal.d(i3));
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.a != null)
    {
      opg localopg = this.a;
      paramqal.c(10);
      if (localopg.ak < 0) {
        localopg.ak = localopg.a();
      }
      paramqal.c(localopg.ak);
      localopg.a(paramqal);
    }
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.l != null)
    {
      String str2 = this.l;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      boolean bool5 = this.c.booleanValue();
      paramqal.c(32);
      if (bool5) {}
      byte b5;
      for (int i8 = i1;; i8 = 0)
      {
        b5 = (byte)i8;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if (this.m != null)
    {
      String str1 = this.m;
      paramqal.c(42);
      paramqal.a(str1);
    }
    if (this.d != null)
    {
      qbd localqbd = this.d;
      paramqal.c(50);
      if (localqbd.ak < 0) {
        localqbd.ak = localqbd.a();
      }
      paramqal.c(localqbd.ak);
      localqbd.a(paramqal);
    }
    if (this.e != null)
    {
      boolean bool4 = this.e.booleanValue();
      paramqal.c(56);
      if (bool4) {}
      byte b4;
      for (int i7 = i1;; i7 = 0)
      {
        b4 = (byte)i7;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.n != null)
    {
      boolean bool3 = this.n.booleanValue();
      paramqal.c(64);
      if (bool3) {}
      byte b3;
      for (int i6 = i1;; i6 = 0)
      {
        b3 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.f != null)
    {
      olm localolm = this.f;
      paramqal.c(74);
      if (localolm.ak < 0) {
        localolm.ak = localolm.a();
      }
      paramqal.c(localolm.ak);
      localolm.a(paramqal);
    }
    if (this.o != null)
    {
      boolean bool2 = this.o.booleanValue();
      paramqal.c(80);
      if (bool2) {}
      byte b2;
      for (int i5 = i1;; i5 = 0)
      {
        b2 = (byte)i5;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.p != null)
    {
      boolean bool1 = this.p.booleanValue();
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
    if (this.g != null)
    {
      byte[] arrayOfByte = this.g;
      paramqal.c(98);
      paramqal.c(arrayOfByte.length);
      int i4 = arrayOfByte.length;
      if (paramqal.a.remaining() >= i4) {
        paramqal.a.put(arrayOfByte, 0, i4);
      }
    }
    else
    {
      if (this.h != null)
      {
        ogz localogz = this.h;
        paramqal.c(106);
        if (localogz.ak < 0) {
          localogz.ak = localogz.a();
        }
        paramqal.c(localogz.ak);
        localogz.a(paramqal);
      }
      if (this.q == null) {
        break label864;
      }
      int i2 = this.q.length;
      int i3 = 0;
      if (i2 <= 0) {
        break label864;
      }
      while (i3 < this.q.length)
      {
        ohc localohc = this.q[i3];
        if (localohc != null)
        {
          paramqal.c(114);
          if (localohc.ak < 0) {
            localohc.ak = localohc.a();
          }
          paramqal.c(localohc.ak);
          localohc.a(paramqal);
        }
        i3++;
      }
    }
    throw new qam(paramqal.a.position(), paramqal.a.limit());
    label864:
    if (this.i != null)
    {
      ohd localohd = this.i;
      paramqal.c(122);
      if (localohd.ak < 0) {
        localohd.ak = localohd.a();
      }
      paramqal.c(localohd.ak);
      localohd.a(paramqal);
    }
    if (this.j != null)
    {
      ohb localohb = this.j;
      paramqal.c(130);
      if (localohb.ak < 0) {
        localohb.ak = localohb.a();
      }
      paramqal.c(localohb.ak);
      localohb.a(paramqal);
    }
    if (this.r != null)
    {
      qzk localqzk = this.r;
      paramqal.c(138);
      if (localqzk.ak < 0) {
        localqzk.ak = localqzk.a();
      }
      paramqal.c(localqzk.ak);
      localqzk.a(paramqal);
    }
    if (this.k != null)
    {
      ogj localogj = this.k;
      paramqal.c(146);
      if (localogj.ak < 0) {
        localogj.ak = localogj.a();
      }
      paramqal.c(localogj.ak);
      localogj.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogu
 * JD-Core Version:    0.7.0.1
 */