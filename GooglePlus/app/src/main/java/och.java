import java.nio.ByteBuffer;

public final class och
  extends qan<och>
{
  public ocd[] a = ocd.b();
  public obw b = null;
  public int c = -2147483648;
  public int d = -2147483648;
  public Boolean e = null;
  public Boolean f = null;
  private String g = null;
  private Boolean h = null;
  private String i = null;
  private String j = null;
  private String k = null;
  private String l = null;
  
  public och()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = 10;
    int n = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i18 = 0; i18 < this.a.length; i18++)
      {
        ocd localocd = this.a[i18];
        if (localocd != null)
        {
          int i19 = qal.d(8);
          int i20 = localocd.a();
          localocd.ak = i20;
          n += i19 + (i20 + qal.d(i20));
        }
      }
    }
    if (this.b != null)
    {
      obw localobw = this.b;
      int i16 = qal.d(16);
      int i17 = localobw.a();
      localobw.ak = i17;
      n += i16 + (i17 + qal.d(i17));
    }
    int i13;
    int i14;
    if (this.c != -2147483648)
    {
      i13 = this.c;
      i14 = qal.d(24);
      if (i13 < 0) {
        break label503;
      }
    }
    label503:
    for (int i15 = qal.d(i13);; i15 = m)
    {
      n += i15 + i14;
      if (this.g != null)
      {
        String str5 = this.g;
        int i11 = qal.d(32);
        int i12 = qal.a(str5);
        n += i11 + (i12 + qal.d(i12));
      }
      if (this.h != null)
      {
        this.h.booleanValue();
        n += 1 + qal.d(40);
      }
      if (this.i != null)
      {
        String str4 = this.i;
        int i9 = qal.d(48);
        int i10 = qal.a(str4);
        n += i9 + (i10 + qal.d(i10));
      }
      if (this.j != null)
      {
        String str3 = this.j;
        int i7 = qal.d(56);
        int i8 = qal.a(str3);
        n += i7 + (i8 + qal.d(i8));
      }
      if (this.k != null)
      {
        String str2 = this.k;
        int i5 = qal.d(64);
        int i6 = qal.a(str2);
        n += i5 + (i6 + qal.d(i6));
      }
      if (this.d != -2147483648)
      {
        int i3 = this.d;
        int i4 = qal.d(72);
        if (i3 >= 0) {
          m = qal.d(i3);
        }
        n += i4 + m;
      }
      if (this.l != null)
      {
        String str1 = this.l;
        int i1 = qal.d(80);
        int i2 = qal.a(str1);
        n += i1 + (i2 + qal.d(i2));
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        n += 1 + qal.d(88);
      }
      if (this.f != null)
      {
        this.f.booleanValue();
        n += 1 + qal.d(96);
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i4 = 0; i4 < this.a.length; i4++)
      {
        ocd localocd = this.a[i4];
        if (localocd != null)
        {
          paramqal.c(10);
          if (localocd.ak < 0) {
            localocd.ak = localocd.a();
          }
          paramqal.c(localocd.ak);
          localocd.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      obw localobw = this.b;
      paramqal.c(18);
      if (localobw.ak < 0) {
        localobw.ak = localobw.a();
      }
      paramqal.c(localobw.ak);
      localobw.a(paramqal);
    }
    if (this.c != -2147483648)
    {
      int i3 = this.c;
      paramqal.c(24);
      paramqal.a(i3);
    }
    if (this.g != null)
    {
      String str5 = this.g;
      paramqal.c(34);
      paramqal.a(str5);
    }
    if (this.h != null)
    {
      boolean bool3 = this.h.booleanValue();
      paramqal.c(40);
      if (bool3) {}
      byte b3;
      for (int i2 = m;; i2 = 0)
      {
        b3 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.i != null)
    {
      String str4 = this.i;
      paramqal.c(50);
      paramqal.a(str4);
    }
    if (this.j != null)
    {
      String str3 = this.j;
      paramqal.c(58);
      paramqal.a(str3);
    }
    if (this.k != null)
    {
      String str2 = this.k;
      paramqal.c(66);
      paramqal.a(str2);
    }
    if (this.d != -2147483648)
    {
      int i1 = this.d;
      paramqal.c(72);
      paramqal.a(i1);
    }
    if (this.l != null)
    {
      String str1 = this.l;
      paramqal.c(82);
      paramqal.a(str1);
    }
    if (this.e != null)
    {
      boolean bool2 = this.e.booleanValue();
      paramqal.c(88);
      if (bool2) {}
      byte b2;
      for (int n = m;; n = 0)
      {
        b2 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.f != null)
    {
      boolean bool1 = this.f.booleanValue();
      paramqal.c(96);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     och
 * JD-Core Version:    0.7.0.1
 */