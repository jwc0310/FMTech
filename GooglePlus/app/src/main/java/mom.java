import java.nio.ByteBuffer;

public final class mom
  extends qan<mom>
{
  private static volatile mom[] b;
  public String a = null;
  private mos c = null;
  private String d = null;
  private String e = null;
  private String f = null;
  private String g = null;
  private String h = null;
  private String i = null;
  private String j = null;
  private int k = -2147483648;
  private String l = null;
  private String m = null;
  private Long n = null;
  private Long o = null;
  private Boolean p = null;
  private Long q = null;
  private Long r = null;
  
  public mom()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mom[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new mom[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.c != null)
    {
      mos localmos = this.c;
      int i25 = qal.d(8);
      int i26 = localmos.a();
      localmos.ak = i26;
      i1 += i25 + (i26 + qal.d(i26));
    }
    if (this.a != null)
    {
      String str10 = this.a;
      int i23 = qal.d(16);
      int i24 = qal.a(str10);
      i1 += i23 + (i24 + qal.d(i24));
    }
    if (this.d != null)
    {
      String str9 = this.d;
      int i21 = qal.d(24);
      int i22 = qal.a(str9);
      i1 += i21 + (i22 + qal.d(i22));
    }
    if (this.e != null)
    {
      String str8 = this.e;
      int i19 = qal.d(32);
      int i20 = qal.a(str8);
      i1 += i19 + (i20 + qal.d(i20));
    }
    if (this.f != null)
    {
      String str7 = this.f;
      int i17 = qal.d(40);
      int i18 = qal.a(str7);
      i1 += i17 + (i18 + qal.d(i18));
    }
    if (this.g != null)
    {
      String str6 = this.g;
      int i15 = qal.d(48);
      int i16 = qal.a(str6);
      i1 += i15 + (i16 + qal.d(i16));
    }
    if (this.h != null)
    {
      String str5 = this.h;
      int i13 = qal.d(56);
      int i14 = qal.a(str5);
      i1 += i13 + (i14 + qal.d(i14));
    }
    if (this.i != null)
    {
      String str4 = this.i;
      int i11 = qal.d(64);
      int i12 = qal.a(str4);
      i1 += i11 + (i12 + qal.d(i12));
    }
    if (this.j != null)
    {
      String str3 = this.j;
      int i9 = qal.d(72);
      int i10 = qal.a(str3);
      i1 += i9 + (i10 + qal.d(i10));
    }
    int i6;
    int i7;
    if (this.k != -2147483648)
    {
      i6 = this.k;
      i7 = qal.d(80);
      if (i6 < 0) {
        break label650;
      }
    }
    label650:
    for (int i8 = qal.d(i6);; i8 = 10)
    {
      i1 += i8 + i7;
      if (this.n != null)
      {
        long l4 = this.n.longValue();
        i1 += qal.d(88) + qal.b(l4);
      }
      if (this.o != null)
      {
        long l3 = this.o.longValue();
        i1 += qal.d(96) + qal.b(l3);
      }
      if (this.p != null)
      {
        this.p.booleanValue();
        i1 += 1 + qal.d(104);
      }
      if (this.q != null)
      {
        long l2 = this.q.longValue();
        i1 += qal.d(112) + qal.b(l2);
      }
      if (this.r != null)
      {
        long l1 = this.r.longValue();
        i1 += qal.d(120) + qal.b(l1);
      }
      if (this.l != null)
      {
        String str2 = this.l;
        int i4 = qal.d(128);
        int i5 = qal.a(str2);
        i1 += i4 + (i5 + qal.d(i5));
      }
      if (this.m != null)
      {
        String str1 = this.m;
        int i2 = qal.d(136);
        int i3 = qal.a(str1);
        i1 += i2 + (i3 + qal.d(i3));
      }
      return i1;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      mos localmos = this.c;
      paramqal.c(10);
      if (localmos.ak < 0) {
        localmos.ak = localmos.a();
      }
      paramqal.c(localmos.ak);
      localmos.a(paramqal);
    }
    if (this.a != null)
    {
      String str10 = this.a;
      paramqal.c(18);
      paramqal.a(str10);
    }
    if (this.d != null)
    {
      String str9 = this.d;
      paramqal.c(26);
      paramqal.a(str9);
    }
    if (this.e != null)
    {
      String str8 = this.e;
      paramqal.c(34);
      paramqal.a(str8);
    }
    if (this.f != null)
    {
      String str7 = this.f;
      paramqal.c(42);
      paramqal.a(str7);
    }
    if (this.g != null)
    {
      String str6 = this.g;
      paramqal.c(50);
      paramqal.a(str6);
    }
    if (this.h != null)
    {
      String str5 = this.h;
      paramqal.c(58);
      paramqal.a(str5);
    }
    if (this.i != null)
    {
      String str4 = this.i;
      paramqal.c(66);
      paramqal.a(str4);
    }
    if (this.j != null)
    {
      String str3 = this.j;
      paramqal.c(74);
      paramqal.a(str3);
    }
    if (this.k != -2147483648)
    {
      int i2 = this.k;
      paramqal.c(80);
      paramqal.a(i2);
    }
    if (this.n != null)
    {
      long l4 = this.n.longValue();
      paramqal.c(88);
      paramqal.a(l4);
    }
    if (this.o != null)
    {
      long l3 = this.o.longValue();
      paramqal.c(96);
      paramqal.a(l3);
    }
    if (this.p != null)
    {
      boolean bool = this.p.booleanValue();
      paramqal.c(104);
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
    if (this.q != null)
    {
      long l2 = this.q.longValue();
      paramqal.c(112);
      paramqal.a(l2);
    }
    if (this.r != null)
    {
      long l1 = this.r.longValue();
      paramqal.c(120);
      paramqal.a(l1);
    }
    if (this.l != null)
    {
      String str2 = this.l;
      paramqal.c(130);
      paramqal.a(str2);
    }
    if (this.m != null)
    {
      String str1 = this.m;
      paramqal.c(138);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mom
 * JD-Core Version:    0.7.0.1
 */