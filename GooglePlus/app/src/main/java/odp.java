import java.nio.ByteBuffer;

public final class odp
  extends qan<odp>
{
  public String a = null;
  public String b = null;
  public String c = null;
  public qek d = null;
  public String e = null;
  public odr f = null;
  public String g = null;
  private String h = null;
  private int i = -2147483648;
  private int j = -2147483648;
  private String k = null;
  private Boolean l = null;
  private int m = -2147483648;
  private odr n = null;
  
  public odp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if (this.a != null)
    {
      String str7 = this.a;
      int i29 = qal.d(8);
      int i30 = qal.a(str7);
      i2 += i29 + (i30 + qal.d(i30));
    }
    if (this.b != null)
    {
      String str6 = this.b;
      int i27 = qal.d(16);
      int i28 = qal.a(str6);
      i2 += i27 + (i28 + qal.d(i28));
    }
    if (this.h != null)
    {
      String str5 = this.h;
      int i25 = qal.d(24);
      int i26 = qal.a(str5);
      i2 += i25 + (i26 + qal.d(i26));
    }
    if (this.c != null)
    {
      String str4 = this.c;
      int i23 = qal.d(32);
      int i24 = qal.a(str4);
      i2 += i23 + (i24 + qal.d(i24));
    }
    if (this.d != null)
    {
      qek localqek = this.d;
      int i21 = qal.d(40);
      int i22 = localqek.a();
      localqek.ak = i22;
      i2 += i21 + (i22 + qal.d(i22));
    }
    int i20;
    int i15;
    int i16;
    if (this.i != -2147483648)
    {
      int i18 = this.i;
      int i19 = qal.d(56);
      if (i18 >= 0)
      {
        i20 = qal.d(i18);
        i2 += i20 + i19;
      }
    }
    else if (this.j != -2147483648)
    {
      i15 = this.j;
      i16 = qal.d(64);
      if (i15 < 0) {
        break label594;
      }
    }
    label594:
    for (int i17 = qal.d(i15);; i17 = i1)
    {
      i2 += i17 + i16;
      if (this.e != null)
      {
        String str3 = this.e;
        int i13 = qal.d(72);
        int i14 = qal.a(str3);
        i2 += i13 + (i14 + qal.d(i14));
      }
      if (this.l != null)
      {
        this.l.booleanValue();
        i2 += 1 + qal.d(80);
      }
      if (this.m != -2147483648)
      {
        int i11 = this.m;
        int i12 = qal.d(88);
        if (i11 >= 0) {
          i1 = qal.d(i11);
        }
        i2 += i12 + i1;
      }
      if (this.n != null)
      {
        odr localodr2 = this.n;
        int i9 = qal.d(96);
        int i10 = localodr2.a();
        localodr2.ak = i10;
        i2 += i9 + (i10 + qal.d(i10));
      }
      if (this.f != null)
      {
        odr localodr1 = this.f;
        int i7 = qal.d(104);
        int i8 = localodr1.a();
        localodr1.ak = i8;
        i2 += i7 + (i8 + qal.d(i8));
      }
      if (this.g != null)
      {
        String str2 = this.g;
        int i5 = qal.d(112);
        int i6 = qal.a(str2);
        i2 += i5 + (i6 + qal.d(i6));
      }
      if (this.k != null)
      {
        String str1 = this.k;
        int i3 = qal.d(120);
        int i4 = qal.a(str1);
        i2 += i3 + (i4 + qal.d(i4));
      }
      return i2;
      i20 = i1;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str7 = this.a;
      paramqal.c(10);
      paramqal.a(str7);
    }
    if (this.b != null)
    {
      String str6 = this.b;
      paramqal.c(18);
      paramqal.a(str6);
    }
    if (this.h != null)
    {
      String str5 = this.h;
      paramqal.c(26);
      paramqal.a(str5);
    }
    if (this.c != null)
    {
      String str4 = this.c;
      paramqal.c(34);
      paramqal.a(str4);
    }
    if (this.d != null)
    {
      qek localqek = this.d;
      paramqal.c(42);
      if (localqek.ak < 0) {
        localqek.ak = localqek.a();
      }
      paramqal.c(localqek.ak);
      localqek.a(paramqal);
    }
    if (this.i != -2147483648)
    {
      int i4 = this.i;
      paramqal.c(56);
      paramqal.a(i4);
    }
    if (this.j != -2147483648)
    {
      int i3 = this.j;
      paramqal.c(64);
      paramqal.a(i3);
    }
    if (this.e != null)
    {
      String str3 = this.e;
      paramqal.c(74);
      paramqal.a(str3);
    }
    if (this.l != null)
    {
      boolean bool = this.l.booleanValue();
      paramqal.c(80);
      if (bool) {}
      byte b1;
      for (int i2 = 1;; i2 = 0)
      {
        b1 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.m != -2147483648)
    {
      int i1 = this.m;
      paramqal.c(88);
      paramqal.a(i1);
    }
    if (this.n != null)
    {
      odr localodr2 = this.n;
      paramqal.c(98);
      if (localodr2.ak < 0) {
        localodr2.ak = localodr2.a();
      }
      paramqal.c(localodr2.ak);
      localodr2.a(paramqal);
    }
    if (this.f != null)
    {
      odr localodr1 = this.f;
      paramqal.c(106);
      if (localodr1.ak < 0) {
        localodr1.ak = localodr1.a();
      }
      paramqal.c(localodr1.ak);
      localodr1.a(paramqal);
    }
    if (this.g != null)
    {
      String str2 = this.g;
      paramqal.c(114);
      paramqal.a(str2);
    }
    if (this.k != null)
    {
      String str1 = this.k;
      paramqal.c(122);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odp
 * JD-Core Version:    0.7.0.1
 */