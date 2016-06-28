import java.nio.ByteBuffer;

public final class okn
  extends qan<okn>
{
  private static volatile okn[] k;
  public String a = null;
  public String b = null;
  public String[] c = qay.f;
  public String d = null;
  public ojd e = null;
  public String f = null;
  public ojv g = null;
  public oki h = null;
  public okn[] i = b();
  public int j = -2147483648;
  private Boolean l = null;
  
  public okn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static okn[] b()
  {
    if (k == null) {}
    synchronized (qar.a)
    {
      if (k == null) {
        k = new okn[0];
      }
      return k;
    }
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.a != null)
    {
      String str5 = this.a;
      int i23 = qal.d(8);
      int i24 = qal.a(str5);
      m += i23 + (i24 + qal.d(i24));
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i21 = qal.d(16);
      int i22 = qal.a(str4);
      m += i21 + (i22 + qal.d(i22));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i17 = 0;
      int i18 = 0;
      int i19 = 0;
      while (i17 < this.c.length)
      {
        String str3 = this.c[i17];
        if (str3 != null)
        {
          i19++;
          int i20 = qal.a(str3);
          i18 += i20 + qal.d(i20);
        }
        i17++;
      }
      m = m + i18 + i19 * 1;
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i15 = qal.d(32);
      int i16 = qal.a(str2);
      m += i15 + (i16 + qal.d(i16));
    }
    if (this.e != null)
    {
      ojd localojd = this.e;
      int i13 = qal.d(40);
      int i14 = localojd.a();
      localojd.ak = i14;
      m += i13 + (i14 + qal.d(i14));
    }
    if (this.f != null)
    {
      String str1 = this.f;
      int i11 = qal.d(48);
      int i12 = qal.a(str1);
      m += i11 + (i12 + qal.d(i12));
    }
    if (this.l != null)
    {
      this.l.booleanValue();
      m += 1 + qal.d(56);
    }
    if (this.i != null)
    {
      int i7 = this.i.length;
      int i8 = 0;
      if (i7 > 0) {
        while (i8 < this.i.length)
        {
          okn localokn = this.i[i8];
          if (localokn != null)
          {
            int i9 = qal.d(64);
            int i10 = localokn.a();
            localokn.ak = i10;
            m += i9 + (i10 + qal.d(i10));
          }
          i8++;
        }
      }
    }
    int i4;
    int i5;
    if (this.j != -2147483648)
    {
      i4 = this.j;
      i5 = qal.d(72);
      if (i4 < 0) {
        break label551;
      }
    }
    label551:
    for (int i6 = qal.d(i4);; i6 = 10)
    {
      m += i6 + i5;
      if (this.g != null)
      {
        ojv localojv = this.g;
        int i2 = qal.d(80);
        int i3 = localojv.a();
        localojv.ak = i3;
        m += i2 + (i3 + qal.d(i3));
      }
      if (this.h != null)
      {
        oki localoki = this.h;
        int n = qal.d(88);
        int i1 = localoki.a();
        localoki.ak = i1;
        m += n + (i1 + qal.d(i1));
      }
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str5 = this.a;
      paramqal.c(10);
      paramqal.a(str5);
    }
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i3 = 0; i3 < this.c.length; i3++)
      {
        String str3 = this.c[i3];
        if (str3 != null)
        {
          paramqal.c(26);
          paramqal.a(str3);
        }
      }
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      ojd localojd = this.e;
      paramqal.c(42);
      if (localojd.ak < 0) {
        localojd.ak = localojd.a();
      }
      paramqal.c(localojd.ak);
      localojd.a(paramqal);
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(50);
      paramqal.a(str1);
    }
    if (this.l != null)
    {
      boolean bool = this.l.booleanValue();
      paramqal.c(56);
      if (bool) {}
      byte b1;
      for (int i2 = 1;; i2 = 0)
      {
        b1 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.i != null)
    {
      int n = this.i.length;
      int i1 = 0;
      if (n > 0) {
        while (i1 < this.i.length)
        {
          okn localokn = this.i[i1];
          if (localokn != null)
          {
            paramqal.c(66);
            if (localokn.ak < 0) {
              localokn.ak = localokn.a();
            }
            paramqal.c(localokn.ak);
            localokn.a(paramqal);
          }
          i1++;
        }
      }
    }
    if (this.j != -2147483648)
    {
      int m = this.j;
      paramqal.c(72);
      paramqal.a(m);
    }
    if (this.g != null)
    {
      ojv localojv = this.g;
      paramqal.c(82);
      if (localojv.ak < 0) {
        localojv.ak = localojv.a();
      }
      paramqal.c(localojv.ak);
      localojv.a(paramqal);
    }
    if (this.h != null)
    {
      oki localoki = this.h;
      paramqal.c(90);
      if (localoki.ak < 0) {
        localoki.ak = localoki.a();
      }
      paramqal.c(localoki.ak);
      localoki.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     okn
 * JD-Core Version:    0.7.0.1
 */