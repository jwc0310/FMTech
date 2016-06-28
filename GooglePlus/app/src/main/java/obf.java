import java.nio.ByteBuffer;

public final class obf
  extends qan<obf>
{
  public obg[] a = obg.b();
  public String b = null;
  public obi[] c = obi.b();
  private obg[] d = obg.b();
  private String e = null;
  private obg[] f = obg.b();
  private String g = null;
  private Boolean h = null;
  private Boolean i = null;
  private obh[] j = obh.b();
  private Boolean k = null;
  private int l = -2147483648;
  private Boolean m = null;
  
  public obf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int n = super.a();
    if ((this.d != null) && (this.d.length > 0))
    {
      int i26 = n;
      for (int i27 = 0; i27 < this.d.length; i27++)
      {
        obg localobg3 = this.d[i27];
        if (localobg3 != null)
        {
          int i28 = qal.d(8);
          int i29 = localobg3.a();
          localobg3.ak = i29;
          i26 += i28 + (i29 + qal.d(i29));
        }
      }
      n = i26;
    }
    if (this.e != null)
    {
      String str3 = this.e;
      int i24 = qal.d(16);
      int i25 = qal.a(str3);
      n += i24 + (i25 + qal.d(i25));
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int i20 = n;
      for (int i21 = 0; i21 < this.f.length; i21++)
      {
        obg localobg2 = this.f[i21];
        if (localobg2 != null)
        {
          int i22 = qal.d(24);
          int i23 = localobg2.a();
          localobg2.ak = i23;
          i20 += i22 + (i23 + qal.d(i23));
        }
      }
      n = i20;
    }
    if (this.g != null)
    {
      String str2 = this.g;
      int i18 = qal.d(32);
      int i19 = qal.a(str2);
      n += i18 + (i19 + qal.d(i19));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int i16 = qal.d(40);
      int i17 = qal.a(str1);
      n += i16 + (i17 + qal.d(i17));
    }
    if (this.h != null)
    {
      this.h.booleanValue();
      n += 1 + qal.d(48);
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      n += 1 + qal.d(56);
    }
    if ((this.j != null) && (this.j.length > 0))
    {
      int i12 = n;
      for (int i13 = 0; i13 < this.j.length; i13++)
      {
        obh localobh = this.j[i13];
        if (localobh != null)
        {
          int i14 = qal.d(72);
          int i15 = localobh.a();
          localobh.ak = i15;
          i12 += i14 + (i15 + qal.d(i15));
        }
      }
      n = i12;
    }
    if (this.k != null)
    {
      this.k.booleanValue();
      n += 1 + qal.d(80);
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i8 = n;
      for (int i9 = 0; i9 < this.c.length; i9++)
      {
        obi localobi = this.c[i9];
        if (localobi != null)
        {
          int i10 = qal.d(88);
          int i11 = localobi.a();
          localobi.ak = i11;
          i8 += i10 + (i11 + qal.d(i11));
        }
      }
      n = i8;
    }
    if (this.a != null)
    {
      int i4 = this.a.length;
      int i5 = 0;
      if (i4 > 0) {
        while (i5 < this.a.length)
        {
          obg localobg1 = this.a[i5];
          if (localobg1 != null)
          {
            int i6 = qal.d(96);
            int i7 = localobg1.a();
            localobg1.ak = i7;
            n += i6 + (i7 + qal.d(i7));
          }
          i5++;
        }
      }
    }
    int i1;
    int i2;
    if (this.l != -2147483648)
    {
      i1 = this.l;
      i2 = qal.d(104);
      if (i1 < 0) {
        break label720;
      }
    }
    label720:
    for (int i3 = qal.d(i1);; i3 = 10)
    {
      n += i3 + i2;
      if (this.m != null)
      {
        this.m.booleanValue();
        n += 1 + qal.d(112);
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    int n = 1;
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i9 = 0; i9 < this.d.length; i9++)
      {
        obg localobg3 = this.d[i9];
        if (localobg3 != null)
        {
          paramqal.c(10);
          if (localobg3.ak < 0) {
            localobg3.ak = localobg3.a();
          }
          paramqal.c(localobg3.ak);
          localobg3.a(paramqal);
        }
      }
    }
    if (this.e != null)
    {
      String str3 = this.e;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i8 = 0; i8 < this.f.length; i8++)
      {
        obg localobg2 = this.f[i8];
        if (localobg2 != null)
        {
          paramqal.c(26);
          if (localobg2.ak < 0) {
            localobg2.ak = localobg2.a();
          }
          paramqal.c(localobg2.ak);
          localobg2.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      String str2 = this.g;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      String str1 = this.b;
      paramqal.c(42);
      paramqal.a(str1);
    }
    if (this.h != null)
    {
      boolean bool4 = this.h.booleanValue();
      paramqal.c(48);
      if (bool4) {}
      byte b4;
      for (int i7 = n;; i7 = 0)
      {
        b4 = (byte)i7;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.i != null)
    {
      boolean bool3 = this.i.booleanValue();
      paramqal.c(56);
      if (bool3) {}
      byte b3;
      for (int i6 = n;; i6 = 0)
      {
        b3 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if ((this.j != null) && (this.j.length > 0)) {
      for (int i5 = 0; i5 < this.j.length; i5++)
      {
        obh localobh = this.j[i5];
        if (localobh != null)
        {
          paramqal.c(74);
          if (localobh.ak < 0) {
            localobh.ak = localobh.a();
          }
          paramqal.c(localobh.ak);
          localobh.a(paramqal);
        }
      }
    }
    if (this.k != null)
    {
      boolean bool2 = this.k.booleanValue();
      paramqal.c(80);
      if (bool2) {}
      byte b2;
      for (int i4 = n;; i4 = 0)
      {
        b2 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i3 = 0; i3 < this.c.length; i3++)
      {
        obi localobi = this.c[i3];
        if (localobi != null)
        {
          paramqal.c(90);
          if (localobi.ak < 0) {
            localobi.ak = localobi.a();
          }
          paramqal.c(localobi.ak);
          localobi.a(paramqal);
        }
      }
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i2 = 0; i2 < this.a.length; i2++)
      {
        obg localobg1 = this.a[i2];
        if (localobg1 != null)
        {
          paramqal.c(98);
          if (localobg1.ak < 0) {
            localobg1.ak = localobg1.a();
          }
          paramqal.c(localobg1.ak);
          localobg1.a(paramqal);
        }
      }
    }
    if (this.l != -2147483648)
    {
      int i1 = this.l;
      paramqal.c(104);
      paramqal.a(i1);
    }
    if (this.m != null)
    {
      boolean bool1 = this.m.booleanValue();
      paramqal.c(112);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        n = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     obf
 * JD-Core Version:    0.7.0.1
 */