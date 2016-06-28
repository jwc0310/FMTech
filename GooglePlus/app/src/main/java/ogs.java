import java.nio.ByteBuffer;

public final class ogs
  extends qan<ogs>
{
  public String[] a = qay.f;
  public int b = -2147483648;
  public ogt c = null;
  public qbd d = null;
  public opu e = null;
  private Long f = null;
  private Boolean g = null;
  private qzk h = null;
  private Boolean i = null;
  
  public ogs()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int j = 0;
    int k = super.a();
    int i11;
    int i12;
    if ((this.a != null) && (this.a.length > 0))
    {
      i11 = 0;
      i12 = 0;
      while (j < this.a.length)
      {
        String str = this.a[j];
        if (str != null)
        {
          i12++;
          int i13 = qal.a(str);
          i11 += i13 + qal.d(i13);
        }
        j++;
      }
    }
    for (int m = k + i11 + i12 * 1;; m = k)
    {
      if (this.f != null)
      {
        long l = this.f.longValue();
        m += qal.d(16) + qal.b(l);
      }
      int i8;
      int i9;
      if (this.b != -2147483648)
      {
        i8 = this.b;
        i9 = qal.d(24);
        if (i8 < 0) {
          break label405;
        }
      }
      label405:
      for (int i10 = qal.d(i8);; i10 = 10)
      {
        m += i10 + i9;
        if (this.c != null)
        {
          ogt localogt = this.c;
          int i6 = qal.d(32);
          int i7 = localogt.a();
          localogt.ak = i7;
          m += i6 + (i7 + qal.d(i7));
        }
        if (this.d != null)
        {
          qbd localqbd = this.d;
          int i4 = qal.d(40);
          int i5 = localqbd.a();
          localqbd.ak = i5;
          m += i4 + (i5 + qal.d(i5));
        }
        if (this.e != null)
        {
          opu localopu = this.e;
          int i2 = qal.d(48);
          int i3 = localopu.a();
          localopu.ak = i3;
          m += i2 + (i3 + qal.d(i3));
        }
        if (this.g != null)
        {
          this.g.booleanValue();
          m += 1 + qal.d(56);
        }
        if (this.h != null)
        {
          qzk localqzk = this.h;
          int n = qal.d(64);
          int i1 = localqzk.a();
          localqzk.ak = i1;
          m += n + (i1 + qal.d(i1));
        }
        if (this.i != null)
        {
          this.i.booleanValue();
          m += 1 + qal.d(72);
        }
        return m;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    int j = 1;
    if ((this.a != null) && (this.a.length > 0)) {
      for (int n = 0; n < this.a.length; n++)
      {
        String str = this.a[n];
        if (str != null)
        {
          paramqal.c(10);
          paramqal.a(str);
        }
      }
    }
    if (this.f != null)
    {
      long l = this.f.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    if (this.b != -2147483648)
    {
      int m = this.b;
      paramqal.c(24);
      paramqal.a(m);
    }
    if (this.c != null)
    {
      ogt localogt = this.c;
      paramqal.c(34);
      if (localogt.ak < 0) {
        localogt.ak = localogt.a();
      }
      paramqal.c(localogt.ak);
      localogt.a(paramqal);
    }
    if (this.d != null)
    {
      qbd localqbd = this.d;
      paramqal.c(42);
      if (localqbd.ak < 0) {
        localqbd.ak = localqbd.a();
      }
      paramqal.c(localqbd.ak);
      localqbd.a(paramqal);
    }
    if (this.e != null)
    {
      opu localopu = this.e;
      paramqal.c(50);
      if (localopu.ak < 0) {
        localopu.ak = localopu.a();
      }
      paramqal.c(localopu.ak);
      localopu.a(paramqal);
    }
    if (this.g != null)
    {
      boolean bool2 = this.g.booleanValue();
      paramqal.c(56);
      if (bool2) {}
      byte b2;
      for (int k = j;; k = 0)
      {
        b2 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.h != null)
    {
      qzk localqzk = this.h;
      paramqal.c(66);
      if (localqzk.ak < 0) {
        localqzk.ak = localqzk.a();
      }
      paramqal.c(localqzk.ak);
      localqzk.a(paramqal);
    }
    if (this.i != null)
    {
      boolean bool1 = this.i.booleanValue();
      paramqal.c(72);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        j = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogs
 * JD-Core Version:    0.7.0.1
 */