import java.nio.ByteBuffer;

public final class nhx
  extends qan<nhx>
{
  public String a = null;
  public String b = null;
  public String c = null;
  public nho d = null;
  public Integer e = null;
  private qhg[] f = qhg.b();
  private qhg[] g = qhg.b();
  private qjq h = null;
  private qjp i = null;
  private String j = null;
  private String k = null;
  private Boolean l = null;
  private int[] m = qay.a;
  private Boolean n = null;
  
  public nhx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = 0;
    int i3 = super.a();
    if (this.a != null)
    {
      String str5 = this.a;
      int i31 = qal.d(8);
      int i32 = qal.a(str5);
      i3 += i31 + (i32 + qal.d(i32));
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int i27 = i3;
      for (int i28 = 0; i28 < this.f.length; i28++)
      {
        qhg localqhg2 = this.f[i28];
        if (localqhg2 != null)
        {
          int i29 = qal.d(16);
          int i30 = localqhg2.a();
          localqhg2.ak = i30;
          i27 += i29 + (i30 + qal.d(i30));
        }
      }
      i3 = i27;
    }
    if ((this.g != null) && (this.g.length > 0))
    {
      int i23 = i3;
      for (int i24 = 0; i24 < this.g.length; i24++)
      {
        qhg localqhg1 = this.g[i24];
        if (localqhg1 != null)
        {
          int i25 = qal.d(24);
          int i26 = localqhg1.a();
          localqhg1.ak = i26;
          i23 += i25 + (i26 + qal.d(i26));
        }
      }
      i3 = i23;
    }
    if (this.h != null)
    {
      qjq localqjq = this.h;
      int i21 = qal.d(32);
      int i22 = localqjq.a();
      localqjq.ak = i22;
      i3 += i21 + (i22 + qal.d(i22));
    }
    if (this.i != null)
    {
      qjp localqjp = this.i;
      int i19 = qal.d(40);
      int i20 = localqjp.a();
      localqjp.ak = i20;
      i3 += i19 + (i20 + qal.d(i20));
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i17 = qal.d(48);
      int i18 = qal.a(str4);
      i3 += i17 + (i18 + qal.d(i18));
    }
    if (this.j != null)
    {
      String str3 = this.j;
      int i15 = qal.d(56);
      int i16 = qal.a(str3);
      i3 += i15 + (i16 + qal.d(i16));
    }
    if (this.k != null)
    {
      String str2 = this.k;
      int i13 = qal.d(64);
      int i14 = qal.a(str2);
      i3 += i13 + (i14 + qal.d(i14));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int i11 = qal.d(72);
      int i12 = qal.a(str1);
      i3 += i11 + (i12 + qal.d(i12));
    }
    if (this.l != null)
    {
      this.l.booleanValue();
      i3 += 1 + qal.d(80);
    }
    if (this.d != null)
    {
      nho localnho = this.d;
      int i9 = qal.d(88);
      int i10 = localnho.a();
      localnho.ak = i10;
      i3 += i9 + (i10 + qal.d(i10));
    }
    if ((this.m != null) && (this.m.length > 0))
    {
      int i6 = 0;
      if (i2 < this.m.length)
      {
        int i7 = this.m[i2];
        if (i7 >= 0) {}
        for (int i8 = qal.d(i7);; i8 = i1)
        {
          i6 += i8;
          i2++;
          break;
        }
      }
      i3 = i3 + i6 + 1 * this.m.length;
    }
    if (this.e != null)
    {
      int i4 = this.e.intValue();
      int i5 = qal.d(104);
      if (i4 >= 0) {
        i1 = qal.d(i4);
      }
      i3 += i5 + i1;
    }
    if (this.n != null)
    {
      this.n.booleanValue();
      i3 += 1 + qal.d(112);
    }
    return i3;
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.a != null)
    {
      String str5 = this.a;
      paramqal.c(10);
      paramqal.a(str5);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i7 = 0; i7 < this.f.length; i7++)
      {
        qhg localqhg2 = this.f[i7];
        if (localqhg2 != null)
        {
          paramqal.c(18);
          if (localqhg2.ak < 0) {
            localqhg2.ak = localqhg2.a();
          }
          paramqal.c(localqhg2.ak);
          localqhg2.a(paramqal);
        }
      }
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int i6 = 0; i6 < this.g.length; i6++)
      {
        qhg localqhg1 = this.g[i6];
        if (localqhg1 != null)
        {
          paramqal.c(26);
          if (localqhg1.ak < 0) {
            localqhg1.ak = localqhg1.a();
          }
          paramqal.c(localqhg1.ak);
          localqhg1.a(paramqal);
        }
      }
    }
    if (this.h != null)
    {
      qjq localqjq = this.h;
      paramqal.c(34);
      if (localqjq.ak < 0) {
        localqjq.ak = localqjq.a();
      }
      paramqal.c(localqjq.ak);
      localqjq.a(paramqal);
    }
    if (this.i != null)
    {
      qjp localqjp = this.i;
      paramqal.c(42);
      if (localqjp.ak < 0) {
        localqjp.ak = localqjp.a();
      }
      paramqal.c(localqjp.ak);
      localqjp.a(paramqal);
    }
    if (this.b != null)
    {
      String str4 = this.b;
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
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(74);
      paramqal.a(str1);
    }
    if (this.l != null)
    {
      boolean bool2 = this.l.booleanValue();
      paramqal.c(80);
      if (bool2) {}
      byte b2;
      for (int i5 = i1;; i5 = 0)
      {
        b2 = (byte)i5;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.d != null)
    {
      nho localnho = this.d;
      paramqal.c(90);
      if (localnho.ak < 0) {
        localnho.ak = localnho.a();
      }
      paramqal.c(localnho.ak);
      localnho.a(paramqal);
    }
    if ((this.m != null) && (this.m.length > 0)) {
      for (int i3 = 0; i3 < this.m.length; i3++)
      {
        int i4 = this.m[i3];
        paramqal.c(96);
        paramqal.a(i4);
      }
    }
    if (this.e != null)
    {
      int i2 = this.e.intValue();
      paramqal.c(104);
      paramqal.a(i2);
    }
    if (this.n != null)
    {
      boolean bool1 = this.n.booleanValue();
      paramqal.c(112);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i1 = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nhx
 * JD-Core Version:    0.7.0.1
 */