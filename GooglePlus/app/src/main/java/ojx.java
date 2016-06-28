import java.nio.ByteBuffer;

public final class ojx
  extends qan<ojx>
{
  public String a = null;
  public int b = -2147483648;
  public ojy[] c = ojy.b();
  public Long d = null;
  public String e = null;
  public int f = -2147483648;
  private ojr g = null;
  private Boolean h = null;
  private ojy i = null;
  private ojy[] j = ojy.b();
  private int[] k = qay.a;
  
  public ojx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = 0;
    int n = super.a();
    if (this.a != null)
    {
      String str2 = this.a;
      int i24 = qal.d(8);
      int i25 = qal.a(str2);
      n += i24 + (i25 + qal.d(i25));
    }
    int i21;
    int i22;
    if (this.b != -2147483648)
    {
      i21 = this.b;
      i22 = qal.d(16);
      if (i21 < 0) {
        break label178;
      }
    }
    int i17;
    label178:
    for (int i23 = qal.d(i21);; i23 = 10)
    {
      n += i23 + i22;
      if ((this.c == null) || (this.c.length <= 0)) {
        break label188;
      }
      i17 = n;
      for (int i18 = 0; i18 < this.c.length; i18++)
      {
        ojy localojy3 = this.c[i18];
        if (localojy3 != null)
        {
          int i19 = qal.d(24);
          int i20 = localojy3.a();
          localojy3.ak = i20;
          i17 += i19 + (i20 + qal.d(i20));
        }
      }
    }
    n = i17;
    label188:
    if (this.d != null)
    {
      long l = this.d.longValue();
      n += qal.d(32) + qal.b(l);
    }
    if (this.g != null)
    {
      ojr localojr = this.g;
      int i15 = qal.d(40);
      int i16 = localojr.a();
      localojr.ak = i16;
      n += i15 + (i16 + qal.d(i16));
    }
    if (this.e != null)
    {
      String str1 = this.e;
      int i13 = qal.d(48);
      int i14 = qal.a(str1);
      n += i13 + (i14 + qal.d(i14));
    }
    if (this.h != null)
    {
      this.h.booleanValue();
      n += 1 + qal.d(56);
    }
    if (this.i != null)
    {
      ojy localojy2 = this.i;
      int i11 = qal.d(64);
      int i12 = localojy2.a();
      localojy2.ak = i12;
      n += i11 + (i12 + qal.d(i12));
    }
    int i8;
    int i9;
    if (this.f != -2147483648)
    {
      i8 = this.f;
      i9 = qal.d(72);
      if (i8 < 0) {
        break label510;
      }
    }
    int i4;
    label510:
    for (int i10 = qal.d(i8);; i10 = 10)
    {
      n += i10 + i9;
      if ((this.j == null) || (this.j.length <= 0)) {
        break label520;
      }
      i4 = n;
      for (int i5 = 0; i5 < this.j.length; i5++)
      {
        ojy localojy1 = this.j[i5];
        if (localojy1 != null)
        {
          int i6 = qal.d(80);
          int i7 = localojy1.a();
          localojy1.ak = i7;
          i4 += i6 + (i7 + qal.d(i7));
        }
      }
    }
    n = i4;
    label520:
    if ((this.k != null) && (this.k.length > 0))
    {
      int i1 = 0;
      if (m < this.k.length)
      {
        int i2 = this.k[m];
        if (i2 >= 0) {}
        for (int i3 = qal.d(i2);; i3 = 10)
        {
          i1 += i3;
          m++;
          break;
        }
      }
      n = n + i1 + 1 * this.k.length;
    }
    return n;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.b != -2147483648)
    {
      int i6 = this.b;
      paramqal.c(16);
      paramqal.a(i6);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i5 = 0; i5 < this.c.length; i5++)
      {
        ojy localojy3 = this.c[i5];
        if (localojy3 != null)
        {
          paramqal.c(26);
          if (localojy3.ak < 0) {
            localojy3.ak = localojy3.a();
          }
          paramqal.c(localojy3.ak);
          localojy3.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      long l = this.d.longValue();
      paramqal.c(32);
      paramqal.a(l);
    }
    if (this.g != null)
    {
      ojr localojr = this.g;
      paramqal.c(42);
      if (localojr.ak < 0) {
        localojr.ak = localojr.a();
      }
      paramqal.c(localojr.ak);
      localojr.a(paramqal);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(50);
      paramqal.a(str1);
    }
    if (this.h != null)
    {
      boolean bool = this.h.booleanValue();
      paramqal.c(56);
      if (bool) {}
      byte b1;
      for (int i4 = 1;; i4 = 0)
      {
        b1 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.i != null)
    {
      ojy localojy2 = this.i;
      paramqal.c(66);
      if (localojy2.ak < 0) {
        localojy2.ak = localojy2.a();
      }
      paramqal.c(localojy2.ak);
      localojy2.a(paramqal);
    }
    if (this.f != -2147483648)
    {
      int i3 = this.f;
      paramqal.c(72);
      paramqal.a(i3);
    }
    if ((this.j != null) && (this.j.length > 0)) {
      for (int i2 = 0; i2 < this.j.length; i2++)
      {
        ojy localojy1 = this.j[i2];
        if (localojy1 != null)
        {
          paramqal.c(82);
          if (localojy1.ak < 0) {
            localojy1.ak = localojy1.a();
          }
          paramqal.c(localojy1.ak);
          localojy1.a(paramqal);
        }
      }
    }
    if (this.k != null)
    {
      int m = this.k.length;
      int n = 0;
      if (m > 0) {
        while (n < this.k.length)
        {
          int i1 = this.k[n];
          paramqal.c(88);
          paramqal.a(i1);
          n++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ojx
 * JD-Core Version:    0.7.0.1
 */