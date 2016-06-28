import java.nio.ByteBuffer;

public final class nuc
  extends qan<nuc>
{
  public nue[] a = nue.b();
  public Long b = null;
  private String c = null;
  private nud d = null;
  private String e = null;
  private nul f = null;
  private Boolean g = null;
  private Boolean h = null;
  private nuk i = null;
  private Long j = null;
  private int k = -2147483648;
  
  public nuc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.d != null)
    {
      nud localnud = this.d;
      int i15 = qal.d(16);
      int i16 = localnud.a();
      localnud.ak = i16;
      m += i15 + (i16 + qal.d(i16));
    }
    if ((this.a != null) && (this.a.length > 0))
    {
      int i11 = m;
      for (int i12 = 0; i12 < this.a.length; i12++)
      {
        nue localnue = this.a[i12];
        if (localnue != null)
        {
          int i13 = qal.d(24);
          int i14 = localnue.a();
          localnue.ak = i14;
          i11 += i13 + (i14 + qal.d(i14));
        }
      }
      m = i11;
    }
    if (this.e != null)
    {
      String str2 = this.e;
      int i9 = qal.d(32);
      int i10 = qal.a(str2);
      m += i9 + (i10 + qal.d(i10));
    }
    if (this.f != null)
    {
      nul localnul = this.f;
      int i7 = qal.d(40);
      int i8 = localnul.a();
      localnul.ak = i8;
      m += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      m += qal.d(48) + qal.b(l2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int i5 = qal.d(56);
      int i6 = qal.a(str1);
      m += i5 + (i6 + qal.d(i6));
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      m += 1 + qal.d(64);
    }
    if (this.h != null)
    {
      this.h.booleanValue();
      m += 1 + qal.d(72);
    }
    if (this.i != null)
    {
      nuk localnuk = this.i;
      int i3 = qal.d(88);
      int i4 = localnuk.a();
      localnuk.ak = i4;
      m += i3 + (i4 + qal.d(i4));
    }
    if (this.j != null)
    {
      long l1 = this.j.longValue();
      m += qal.d(96) + qal.b(l1);
    }
    int n;
    int i1;
    if (this.k != -2147483648)
    {
      n = this.k;
      i1 = qal.d(104);
      if (n < 0) {
        break label471;
      }
    }
    label471:
    for (int i2 = qal.d(n);; i2 = 10)
    {
      m += i2 + i1;
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
    if (this.d != null)
    {
      nud localnud = this.d;
      paramqal.c(18);
      if (localnud.ak < 0) {
        localnud.ak = localnud.a();
      }
      paramqal.c(localnud.ak);
      localnud.a(paramqal);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i2 = 0; i2 < this.a.length; i2++)
      {
        nue localnue = this.a[i2];
        if (localnue != null)
        {
          paramqal.c(26);
          if (localnue.ak < 0) {
            localnue.ak = localnue.a();
          }
          paramqal.c(localnue.ak);
          localnue.a(paramqal);
        }
      }
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.f != null)
    {
      nul localnul = this.f;
      paramqal.c(42);
      if (localnul.ak < 0) {
        localnul.ak = localnul.a();
      }
      paramqal.c(localnul.ak);
      localnul.a(paramqal);
    }
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      paramqal.c(48);
      paramqal.a(l2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(58);
      paramqal.a(str1);
    }
    if (this.g != null)
    {
      boolean bool2 = this.g.booleanValue();
      paramqal.c(64);
      if (bool2) {}
      byte b2;
      for (int i1 = m;; i1 = 0)
      {
        b2 = (byte)i1;
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
      paramqal.c(72);
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
      nuk localnuk = this.i;
      paramqal.c(90);
      if (localnuk.ak < 0) {
        localnuk.ak = localnuk.a();
      }
      paramqal.c(localnuk.ak);
      localnuk.a(paramqal);
    }
    if (this.j != null)
    {
      long l1 = this.j.longValue();
      paramqal.c(96);
      paramqal.a(l1);
    }
    if (this.k != -2147483648)
    {
      int n = this.k;
      paramqal.c(104);
      paramqal.a(n);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nuc
 * JD-Core Version:    0.7.0.1
 */