import java.nio.ByteBuffer;

public final class npu
  extends qan<npu>
{
  public String[] a = qay.f;
  public String[] b = qay.f;
  public String c = null;
  public String d = null;
  public int e = -2147483648;
  public String f = null;
  public psm g = null;
  public Boolean h = null;
  private Boolean i = null;
  private int j = -2147483648;
  private String k = null;
  private String l = null;
  private Boolean m = null;
  private oih n = null;
  private Boolean o = null;
  
  public npu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = 0;
    int i3 = super.a();
    int i28;
    int i29;
    if ((this.a != null) && (this.a.length > 0))
    {
      int i27 = 0;
      i28 = 0;
      i29 = 0;
      while (i27 < this.a.length)
      {
        String str7 = this.a[i27];
        if (str7 != null)
        {
          i29++;
          int i30 = qal.a(str7);
          i28 += i30 + qal.d(i30);
        }
        i27++;
      }
    }
    for (int i4 = i3 + i28 + i29 * 1;; i4 = i3)
    {
      if (this.c != null)
      {
        String str6 = this.c;
        int i25 = qal.d(16);
        int i26 = qal.a(str6);
        i4 += i25 + (i26 + qal.d(i26));
      }
      if (this.f != null)
      {
        String str5 = this.f;
        int i23 = qal.d(24);
        int i24 = qal.a(str5);
        i4 += i23 + (i24 + qal.d(i24));
      }
      if (this.l != null)
      {
        String str4 = this.l;
        int i21 = qal.d(32);
        int i22 = qal.a(str4);
        i4 += i21 + (i22 + qal.d(i22));
      }
      if (this.m != null)
      {
        this.m.booleanValue();
        i4 += 1 + qal.d(40);
      }
      int i18;
      int i19;
      if (this.j != -2147483648)
      {
        i18 = this.j;
        i19 = qal.d(48);
        if (i18 < 0) {
          break label420;
        }
      }
      int i13;
      int i14;
      label420:
      for (int i20 = qal.d(i18);; i20 = i1)
      {
        i4 += i20 + i19;
        if (this.n != null)
        {
          oih localoih = this.n;
          int i16 = qal.d(56);
          int i17 = localoih.a();
          localoih.ak = i17;
          i4 += i16 + (i17 + qal.d(i17));
        }
        if ((this.b == null) || (this.b.length <= 0)) {
          break label438;
        }
        i13 = 0;
        i14 = 0;
        while (i2 < this.b.length)
        {
          String str3 = this.b[i2];
          if (str3 != null)
          {
            i14++;
            int i15 = qal.a(str3);
            i13 += i15 + qal.d(i15);
          }
          i2++;
        }
      }
      i4 = i4 + i13 + i14 * 1;
      label438:
      if (this.d != null)
      {
        String str2 = this.d;
        int i11 = qal.d(72);
        int i12 = qal.a(str2);
        i4 += i11 + (i12 + qal.d(i12));
      }
      if (this.g != null)
      {
        psm localpsm = this.g;
        int i9 = qal.d(80);
        int i10 = localpsm.a();
        localpsm.ak = i10;
        i4 += i9 + (i10 + qal.d(i10));
      }
      if (this.i != null)
      {
        this.i.booleanValue();
        i4 += 1 + qal.d(88);
      }
      if (this.o != null)
      {
        this.o.booleanValue();
        i4 += 1 + qal.d(96);
      }
      if (this.h != null)
      {
        this.h.booleanValue();
        i4 += 1 + qal.d(104);
      }
      if (this.e != -2147483648)
      {
        int i7 = this.e;
        int i8 = qal.d(112);
        if (i7 >= 0) {
          i1 = qal.d(i7);
        }
        i4 += i8 + i1;
      }
      if (this.k != null)
      {
        String str1 = this.k;
        int i5 = qal.d(120);
        int i6 = qal.a(str1);
        i4 += i5 + (i6 + qal.d(i6));
      }
      return i4;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i8 = 0; i8 < this.a.length; i8++)
      {
        String str7 = this.a[i8];
        if (str7 != null)
        {
          paramqal.c(10);
          paramqal.a(str7);
        }
      }
    }
    if (this.c != null)
    {
      String str6 = this.c;
      paramqal.c(18);
      paramqal.a(str6);
    }
    if (this.f != null)
    {
      String str5 = this.f;
      paramqal.c(26);
      paramqal.a(str5);
    }
    if (this.l != null)
    {
      String str4 = this.l;
      paramqal.c(34);
      paramqal.a(str4);
    }
    if (this.m != null)
    {
      boolean bool4 = this.m.booleanValue();
      paramqal.c(40);
      if (bool4) {}
      byte b4;
      for (int i7 = i1;; i7 = 0)
      {
        b4 = (byte)i7;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.j != -2147483648)
    {
      int i6 = this.j;
      paramqal.c(48);
      paramqal.a(i6);
    }
    if (this.n != null)
    {
      oih localoih = this.n;
      paramqal.c(58);
      if (localoih.ak < 0) {
        localoih.ak = localoih.a();
      }
      paramqal.c(localoih.ak);
      localoih.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i5 = 0; i5 < this.b.length; i5++)
      {
        String str3 = this.b[i5];
        if (str3 != null)
        {
          paramqal.c(66);
          paramqal.a(str3);
        }
      }
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(74);
      paramqal.a(str2);
    }
    if (this.g != null)
    {
      psm localpsm = this.g;
      paramqal.c(82);
      if (localpsm.ak < 0) {
        localpsm.ak = localpsm.a();
      }
      paramqal.c(localpsm.ak);
      localpsm.a(paramqal);
    }
    if (this.i != null)
    {
      boolean bool3 = this.i.booleanValue();
      paramqal.c(88);
      if (bool3) {}
      byte b3;
      for (int i4 = i1;; i4 = 0)
      {
        b3 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.o != null)
    {
      boolean bool2 = this.o.booleanValue();
      paramqal.c(96);
      if (bool2) {}
      byte b2;
      for (int i3 = i1;; i3 = 0)
      {
        b2 = (byte)i3;
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
      paramqal.c(104);
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
    if (this.e != -2147483648)
    {
      int i2 = this.e;
      paramqal.c(112);
      paramqal.a(i2);
    }
    if (this.k != null)
    {
      String str1 = this.k;
      paramqal.c(122);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npu
 * JD-Core Version:    0.7.0.1
 */