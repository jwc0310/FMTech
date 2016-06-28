import java.nio.ByteBuffer;

public final class ngs
  extends qan<ngs>
{
  private static volatile ngs[] h;
  public ngw[] a = ngw.b();
  public ngu b = null;
  public ngt c = null;
  public ngx d = null;
  public Boolean e = null;
  public Boolean f = null;
  public int g = -2147483648;
  private ngv i = null;
  private int j = -2147483648;
  private Boolean k = null;
  private Boolean l = null;
  
  public ngs()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ngs[] b()
  {
    if (h == null) {}
    synchronized (qar.a)
    {
      if (h == null) {
        h = new ngs[0];
      }
      return h;
    }
  }
  
  protected final int a()
  {
    int m = 10;
    int n = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i14 = 0; i14 < this.a.length; i14++)
      {
        ngw localngw = this.a[i14];
        if (localngw != null)
        {
          int i15 = qal.d(8);
          int i16 = localngw.a();
          localngw.ak = i16;
          n += i15 + (i16 + qal.d(i16));
        }
      }
    }
    if (this.b != null)
    {
      ngu localngu = this.b;
      int i12 = qal.d(16);
      int i13 = localngu.a();
      localngu.ak = i13;
      n += i12 + (i13 + qal.d(i13));
    }
    if (this.c != null)
    {
      ngt localngt = this.c;
      int i10 = qal.d(24);
      int i11 = localngt.a();
      localngt.ak = i11;
      n += i10 + (i11 + qal.d(i11));
    }
    if (this.d != null)
    {
      ngx localngx = this.d;
      int i8 = qal.d(32);
      int i9 = localngx.a();
      localngx.ak = i9;
      n += i8 + (i9 + qal.d(i9));
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      n += 1 + qal.d(40);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      n += 1 + qal.d(48);
    }
    int i5;
    int i6;
    if (this.g != -2147483648)
    {
      i5 = this.g;
      i6 = qal.d(56);
      if (i5 < 0) {
        break label467;
      }
    }
    label467:
    for (int i7 = qal.d(i5);; i7 = m)
    {
      n += i7 + i6;
      if (this.j != -2147483648)
      {
        int i3 = this.j;
        int i4 = qal.d(64);
        if (i3 >= 0) {
          m = qal.d(i3);
        }
        n += i4 + m;
      }
      if (this.k != null)
      {
        this.k.booleanValue();
        n += 1 + qal.d(72);
      }
      if (this.i != null)
      {
        ngv localngv = this.i;
        int i1 = qal.d(80);
        int i2 = localngv.a();
        localngv.ak = i2;
        n += i1 + (i2 + qal.d(i2));
      }
      if (this.l != null)
      {
        this.l.booleanValue();
        n += 1 + qal.d(88);
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i5 = 0; i5 < this.a.length; i5++)
      {
        ngw localngw = this.a[i5];
        if (localngw != null)
        {
          paramqal.c(10);
          if (localngw.ak < 0) {
            localngw.ak = localngw.a();
          }
          paramqal.c(localngw.ak);
          localngw.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      ngu localngu = this.b;
      paramqal.c(18);
      if (localngu.ak < 0) {
        localngu.ak = localngu.a();
      }
      paramqal.c(localngu.ak);
      localngu.a(paramqal);
    }
    if (this.c != null)
    {
      ngt localngt = this.c;
      paramqal.c(26);
      if (localngt.ak < 0) {
        localngt.ak = localngt.a();
      }
      paramqal.c(localngt.ak);
      localngt.a(paramqal);
    }
    if (this.d != null)
    {
      ngx localngx = this.d;
      paramqal.c(34);
      if (localngx.ak < 0) {
        localngx.ak = localngx.a();
      }
      paramqal.c(localngx.ak);
      localngx.a(paramqal);
    }
    if (this.e != null)
    {
      boolean bool4 = this.e.booleanValue();
      paramqal.c(40);
      if (bool4) {}
      byte b4;
      for (int i4 = m;; i4 = 0)
      {
        b4 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.f != null)
    {
      boolean bool3 = this.f.booleanValue();
      paramqal.c(48);
      if (bool3) {}
      byte b3;
      for (int i3 = m;; i3 = 0)
      {
        b3 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.g != -2147483648)
    {
      int i2 = this.g;
      paramqal.c(56);
      paramqal.a(i2);
    }
    if (this.j != -2147483648)
    {
      int i1 = this.j;
      paramqal.c(64);
      paramqal.a(i1);
    }
    if (this.k != null)
    {
      boolean bool2 = this.k.booleanValue();
      paramqal.c(72);
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
    if (this.i != null)
    {
      ngv localngv = this.i;
      paramqal.c(82);
      if (localngv.ak < 0) {
        localngv.ak = localngv.a();
      }
      paramqal.c(localngv.ak);
      localngv.a(paramqal);
    }
    if (this.l != null)
    {
      boolean bool1 = this.l.booleanValue();
      paramqal.c(88);
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
 * Qualified Name:     ngs
 * JD-Core Version:    0.7.0.1
 */