import java.nio.ByteBuffer;

public final class nsv
  extends qan<nsv>
{
  public String a = null;
  public String b = null;
  public oih c = null;
  public Boolean d = null;
  public nse e = null;
  public Boolean f = null;
  private String g = null;
  private Boolean h = null;
  private int i = -2147483648;
  private Boolean j = null;
  private pst k = null;
  
  public nsv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i13 = qal.d(8);
      int i14 = qal.a(str3);
      m += i13 + (i14 + qal.d(i14));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i11 = qal.d(16);
      int i12 = qal.a(str2);
      m += i11 + (i12 + qal.d(i12));
    }
    if (this.c != null)
    {
      oih localoih = this.c;
      int i9 = qal.d(24);
      int i10 = localoih.a();
      localoih.ak = i10;
      m += i9 + (i10 + qal.d(i10));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      m += 1 + qal.d(32);
    }
    int i6;
    int i7;
    if (this.i != -2147483648)
    {
      i6 = this.i;
      i7 = qal.d(40);
      if (i6 < 0) {
        break label413;
      }
    }
    label413:
    for (int i8 = qal.d(i6);; i8 = 10)
    {
      m += i8 + i7;
      if (this.j != null)
      {
        this.j.booleanValue();
        m += 1 + qal.d(48);
      }
      if (this.e != null)
      {
        nse localnse = this.e;
        int i4 = qal.d(56);
        int i5 = localnse.a();
        localnse.ak = i5;
        m += i4 + (i5 + qal.d(i5));
      }
      if (this.f != null)
      {
        this.f.booleanValue();
        m += 1 + qal.d(64);
      }
      if (this.g != null)
      {
        String str1 = this.g;
        int i2 = qal.d(72);
        int i3 = qal.a(str1);
        m += i2 + (i3 + qal.d(i3));
      }
      if (this.k != null)
      {
        pst localpst = this.k;
        int n = qal.d(80);
        int i1 = localpst.a();
        localpst.ak = i1;
        m += n + (i1 + qal.d(i1));
      }
      if (this.h != null)
      {
        this.h.booleanValue();
        m += 1 + qal.d(96);
      }
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      oih localoih = this.c;
      paramqal.c(26);
      if (localoih.ak < 0) {
        localoih.ak = localoih.a();
      }
      paramqal.c(localoih.ak);
      localoih.a(paramqal);
    }
    if (this.d != null)
    {
      boolean bool4 = this.d.booleanValue();
      paramqal.c(32);
      if (bool4) {}
      byte b4;
      for (int i3 = m;; i3 = 0)
      {
        b4 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.i != -2147483648)
    {
      int i2 = this.i;
      paramqal.c(40);
      paramqal.a(i2);
    }
    if (this.j != null)
    {
      boolean bool3 = this.j.booleanValue();
      paramqal.c(48);
      if (bool3) {}
      byte b3;
      for (int i1 = m;; i1 = 0)
      {
        b3 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.e != null)
    {
      nse localnse = this.e;
      paramqal.c(58);
      if (localnse.ak < 0) {
        localnse.ak = localnse.a();
      }
      paramqal.c(localnse.ak);
      localnse.a(paramqal);
    }
    if (this.f != null)
    {
      boolean bool2 = this.f.booleanValue();
      paramqal.c(64);
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
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(74);
      paramqal.a(str1);
    }
    if (this.k != null)
    {
      pst localpst = this.k;
      paramqal.c(82);
      if (localpst.ak < 0) {
        localpst.ak = localpst.a();
      }
      paramqal.c(localpst.ak);
      localpst.a(paramqal);
    }
    if (this.h != null)
    {
      boolean bool1 = this.h.booleanValue();
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
 * Qualified Name:     nsv
 * JD-Core Version:    0.7.0.1
 */