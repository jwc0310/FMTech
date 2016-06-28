import java.nio.ByteBuffer;

public final class nhp
  extends qan<nhp>
{
  private static volatile nhp[] a;
  private int b = -2147483648;
  private String c = null;
  private String d = null;
  private String e = null;
  private Boolean f = null;
  private nhp[] g = b();
  private String h = null;
  private String i = null;
  private Integer j = null;
  
  public nhp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nhp[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nhp[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int k = 10;
    int m = super.a();
    int i18;
    int i19;
    if (this.b != -2147483648)
    {
      int i17 = this.b;
      i18 = qal.d(8);
      if (i17 >= 0) {
        i19 = qal.d(i17);
      }
    }
    for (int n = m + (i19 + i18);; n = m)
    {
      if (this.c != null)
      {
        String str5 = this.c;
        int i15 = qal.d(16);
        int i16 = qal.a(str5);
        n += i15 + (i16 + qal.d(i16));
      }
      if (this.d != null)
      {
        String str4 = this.d;
        int i13 = qal.d(24);
        int i14 = qal.a(str4);
        n += i13 + (i14 + qal.d(i14));
      }
      if (this.e != null)
      {
        String str3 = this.e;
        int i11 = qal.d(32);
        int i12 = qal.a(str3);
        n += i11 + (i12 + qal.d(i12));
      }
      if (this.f != null)
      {
        this.f.booleanValue();
        n += 1 + qal.d(40);
      }
      if ((this.g != null) && (this.g.length > 0))
      {
        int i7 = n;
        int i8 = 0;
        for (;;)
        {
          if (i8 < this.g.length)
          {
            nhp localnhp = this.g[i8];
            if (localnhp != null)
            {
              int i9 = qal.d(48);
              int i10 = localnhp.a();
              localnhp.ak = i10;
              i7 += i9 + (i10 + qal.d(i10));
            }
            i8++;
            continue;
            i19 = k;
            break;
          }
        }
        n = i7;
      }
      if (this.h != null)
      {
        String str2 = this.h;
        int i5 = qal.d(56);
        int i6 = qal.a(str2);
        n += i5 + (i6 + qal.d(i6));
      }
      if (this.i != null)
      {
        String str1 = this.i;
        int i3 = qal.d(64);
        int i4 = qal.a(str1);
        n += i3 + (i4 + qal.d(i4));
      }
      if (this.j != null)
      {
        int i1 = this.j.intValue();
        int i2 = qal.d(72);
        if (i1 >= 0) {
          k = qal.d(i1);
        }
        n += k + i2;
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int i2 = this.b;
      paramqal.c(8);
      paramqal.a(i2);
    }
    if (this.c != null)
    {
      String str5 = this.c;
      paramqal.c(18);
      paramqal.a(str5);
    }
    if (this.d != null)
    {
      String str4 = this.d;
      paramqal.c(26);
      paramqal.a(str4);
    }
    if (this.e != null)
    {
      String str3 = this.e;
      paramqal.c(34);
      paramqal.a(str3);
    }
    if (this.f != null)
    {
      boolean bool = this.f.booleanValue();
      paramqal.c(40);
      if (bool) {}
      byte b1;
      for (int i1 = 1;; i1 = 0)
      {
        b1 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.g != null)
    {
      int m = this.g.length;
      int n = 0;
      if (m > 0) {
        while (n < this.g.length)
        {
          nhp localnhp = this.g[n];
          if (localnhp != null)
          {
            paramqal.c(50);
            if (localnhp.ak < 0) {
              localnhp.ak = localnhp.a();
            }
            paramqal.c(localnhp.ak);
            localnhp.a(paramqal);
          }
          n++;
        }
      }
    }
    if (this.h != null)
    {
      String str2 = this.h;
      paramqal.c(58);
      paramqal.a(str2);
    }
    if (this.i != null)
    {
      String str1 = this.i;
      paramqal.c(66);
      paramqal.a(str1);
    }
    if (this.j != null)
    {
      int k = this.j.intValue();
      paramqal.c(72);
      paramqal.a(k);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nhp
 * JD-Core Version:    0.7.0.1
 */