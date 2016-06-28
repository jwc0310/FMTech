import java.nio.ByteBuffer;

public final class ntb
  extends qan<ntb>
{
  public String a = null;
  public String b = null;
  private String c = null;
  private int d = -2147483648;
  private String e = null;
  private Boolean f = null;
  private Boolean g = null;
  private Boolean h = null;
  private String i = null;
  private String[] j = qay.f;
  private String[] k = qay.f;
  
  public ntb()
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
      String str7 = this.a;
      int i19 = qal.d(8);
      int i20 = qal.a(str7);
      n += i19 + (i20 + qal.d(i20));
    }
    if (this.c != null)
    {
      String str6 = this.c;
      int i17 = qal.d(16);
      int i18 = qal.a(str6);
      n += i17 + (i18 + qal.d(i18));
    }
    int i14;
    int i15;
    if (this.d != -2147483648)
    {
      i14 = this.d;
      i15 = qal.d(24);
      if (i14 < 0) {
        break label406;
      }
    }
    int i5;
    int i6;
    label406:
    for (int i16 = qal.d(i14);; i16 = 10)
    {
      n += i16 + i15;
      if (this.f != null)
      {
        this.f.booleanValue();
        n += 1 + qal.d(32);
      }
      if (this.e != null)
      {
        String str5 = this.e;
        int i12 = qal.d(40);
        int i13 = qal.a(str5);
        n += i12 + (i13 + qal.d(i13));
      }
      if (this.g != null)
      {
        this.g.booleanValue();
        n += 1 + qal.d(48);
      }
      if (this.h != null)
      {
        this.h.booleanValue();
        n += 1 + qal.d(56);
      }
      if (this.i != null)
      {
        String str4 = this.i;
        int i10 = qal.d(64);
        int i11 = qal.a(str4);
        n += i10 + (i11 + qal.d(i11));
      }
      if (this.b != null)
      {
        String str3 = this.b;
        int i8 = qal.d(72);
        int i9 = qal.a(str3);
        n += i8 + (i9 + qal.d(i9));
      }
      if ((this.j == null) || (this.j.length <= 0)) {
        break label423;
      }
      int i4 = 0;
      i5 = 0;
      i6 = 0;
      while (i4 < this.j.length)
      {
        String str2 = this.j[i4];
        if (str2 != null)
        {
          i6++;
          int i7 = qal.a(str2);
          i5 += i7 + qal.d(i7);
        }
        i4++;
      }
    }
    n = n + i5 + i6 * 1;
    label423:
    if ((this.k != null) && (this.k.length > 0))
    {
      int i1 = 0;
      int i2 = 0;
      while (m < this.k.length)
      {
        String str1 = this.k[m];
        if (str1 != null)
        {
          i2++;
          int i3 = qal.a(str1);
          i1 += i3 + qal.d(i3);
        }
        m++;
      }
      n = n + i1 + i2 * 1;
    }
    return n;
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
    if (this.a != null)
    {
      String str7 = this.a;
      paramqal.c(10);
      paramqal.a(str7);
    }
    if (this.c != null)
    {
      String str6 = this.c;
      paramqal.c(18);
      paramqal.a(str6);
    }
    if (this.d != -2147483648)
    {
      int i5 = this.d;
      paramqal.c(24);
      paramqal.a(i5);
    }
    if (this.f != null)
    {
      boolean bool3 = this.f.booleanValue();
      paramqal.c(32);
      if (bool3) {}
      byte b3;
      for (int i4 = m;; i4 = 0)
      {
        b3 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.e != null)
    {
      String str5 = this.e;
      paramqal.c(42);
      paramqal.a(str5);
    }
    if (this.g != null)
    {
      boolean bool2 = this.g.booleanValue();
      paramqal.c(48);
      if (bool2) {}
      byte b2;
      for (int i3 = m;; i3 = 0)
      {
        b2 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.h != null)
    {
      boolean bool1 = this.h.booleanValue();
      paramqal.c(56);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        m = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.i != null)
    {
      String str4 = this.i;
      paramqal.c(66);
      paramqal.a(str4);
    }
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(74);
      paramqal.a(str3);
    }
    if ((this.j != null) && (this.j.length > 0)) {
      for (int i2 = 0; i2 < this.j.length; i2++)
      {
        String str2 = this.j[i2];
        if (str2 != null)
        {
          paramqal.c(82);
          paramqal.a(str2);
        }
      }
    }
    if (this.k != null)
    {
      int n = this.k.length;
      int i1 = 0;
      if (n > 0) {
        while (i1 < this.k.length)
        {
          String str1 = this.k[i1];
          if (str1 != null)
          {
            paramqal.c(90);
            paramqal.a(str1);
          }
          i1++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ntb
 * JD-Core Version:    0.7.0.1
 */