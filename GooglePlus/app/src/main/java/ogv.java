import java.nio.ByteBuffer;

public final class ogv
  extends qan<ogv>
{
  public String a = null;
  public String b = null;
  private Long c = null;
  private Boolean d = null;
  private int e = -2147483648;
  private ogt f = null;
  private qbd g = null;
  private opu h = null;
  private int i = -2147483648;
  private qzk j = null;
  
  public ogv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = 10;
    int m = super.a();
    String str1 = this.a;
    int n = qal.d(8);
    int i1 = qal.a(str1);
    int i2 = m + (n + (i1 + qal.d(i1)));
    if (this.c != null)
    {
      long l = this.c.longValue();
      i2 += qal.d(16) + qal.b(l);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i16 = qal.d(24);
      int i17 = qal.a(str2);
      i2 += i16 + (i17 + qal.d(i17));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i2 += 1 + qal.d(32);
    }
    int i13;
    int i14;
    if (this.e != -2147483648)
    {
      i13 = this.e;
      i14 = qal.d(40);
      if (i13 < 0) {
        break label432;
      }
    }
    label432:
    for (int i15 = qal.d(i13);; i15 = k)
    {
      i2 += i15 + i14;
      if (this.f != null)
      {
        ogt localogt = this.f;
        int i11 = qal.d(48);
        int i12 = localogt.a();
        localogt.ak = i12;
        i2 += i11 + (i12 + qal.d(i12));
      }
      if (this.g != null)
      {
        qbd localqbd = this.g;
        int i9 = qal.d(56);
        int i10 = localqbd.a();
        localqbd.ak = i10;
        i2 += i9 + (i10 + qal.d(i10));
      }
      if (this.h != null)
      {
        opu localopu = this.h;
        int i7 = qal.d(64);
        int i8 = localopu.a();
        localopu.ak = i8;
        i2 += i7 + (i8 + qal.d(i8));
      }
      if (this.i != -2147483648)
      {
        int i5 = this.i;
        int i6 = qal.d(72);
        if (i5 >= 0) {
          k = qal.d(i5);
        }
        i2 += i6 + k;
      }
      if (this.j != null)
      {
        qzk localqzk = this.j;
        int i3 = qal.d(80);
        int i4 = localqzk.a();
        localqzk.ak = i4;
        i2 += i3 + (i4 + qal.d(i4));
      }
      return i2;
    }
  }
  
  public final void a(qal paramqal)
  {
    String str1 = this.a;
    paramqal.c(10);
    paramqal.a(str1);
    if (this.c != null)
    {
      long l = this.c.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(32);
      if (bool) {}
      byte b1;
      for (int n = 1;; n = 0)
      {
        b1 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.e != -2147483648)
    {
      int m = this.e;
      paramqal.c(40);
      paramqal.a(m);
    }
    if (this.f != null)
    {
      ogt localogt = this.f;
      paramqal.c(50);
      if (localogt.ak < 0) {
        localogt.ak = localogt.a();
      }
      paramqal.c(localogt.ak);
      localogt.a(paramqal);
    }
    if (this.g != null)
    {
      qbd localqbd = this.g;
      paramqal.c(58);
      if (localqbd.ak < 0) {
        localqbd.ak = localqbd.a();
      }
      paramqal.c(localqbd.ak);
      localqbd.a(paramqal);
    }
    if (this.h != null)
    {
      opu localopu = this.h;
      paramqal.c(66);
      if (localopu.ak < 0) {
        localopu.ak = localopu.a();
      }
      paramqal.c(localopu.ak);
      localopu.a(paramqal);
    }
    if (this.i != -2147483648)
    {
      int k = this.i;
      paramqal.c(72);
      paramqal.a(k);
    }
    if (this.j != null)
    {
      qzk localqzk = this.j;
      paramqal.c(82);
      if (localqzk.ak < 0) {
        localqzk.ak = localqzk.a();
      }
      paramqal.c(localqzk.ak);
      localqzk.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogv
 * JD-Core Version:    0.7.0.1
 */