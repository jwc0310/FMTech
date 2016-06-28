import java.nio.ByteBuffer;

public final class ojm
  extends qan<ojm>
{
  private static volatile ojm[] k;
  public String a = null;
  public ojv b = null;
  public int c = -2147483648;
  public ojh d = null;
  public oji e = null;
  public ojv f = null;
  public ojv[] g = ojv.b();
  public Boolean h = null;
  public Boolean i = null;
  public int j = -2147483648;
  private oki l = null;
  private oki m = null;
  private String[] n = qay.f;
  private oki[] o = oki.b();
  private Boolean p = null;
  private ojz q = null;
  private String r = null;
  
  public ojm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ojm[] b()
  {
    if (k == null) {}
    synchronized (qar.a)
    {
      if (k == null) {
        k = new ojm[0];
      }
      return k;
    }
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    String str1 = this.a;
    int i3 = qal.d(8);
    int i4 = qal.a(str1);
    int i5 = i2 + (i3 + (i4 + qal.d(i4)));
    if (this.b != null)
    {
      ojv localojv3 = this.b;
      int i37 = qal.d(16);
      int i38 = localojv3.a();
      localojv3.ak = i38;
      i5 += i37 + (i38 + qal.d(i38));
    }
    int i34;
    int i35;
    if (this.c != -2147483648)
    {
      i34 = this.c;
      i35 = qal.d(24);
      if (i34 < 0) {
        break label312;
      }
    }
    int i27;
    int i28;
    label312:
    for (int i36 = qal.d(i34);; i36 = i1)
    {
      i5 += i36 + i35;
      if (this.d != null)
      {
        ojh localojh = this.d;
        int i32 = qal.d(32);
        int i33 = localojh.a();
        localojh.ak = i33;
        i5 += i32 + (i33 + qal.d(i33));
      }
      if (this.f != null)
      {
        ojv localojv2 = this.f;
        int i30 = qal.d(40);
        int i31 = localojv2.a();
        localojv2.ak = i31;
        i5 += i30 + (i31 + qal.d(i31));
      }
      if ((this.n == null) || (this.n.length <= 0)) {
        break label330;
      }
      int i26 = 0;
      i27 = 0;
      i28 = 0;
      while (i26 < this.n.length)
      {
        String str3 = this.n[i26];
        if (str3 != null)
        {
          i28++;
          int i29 = qal.a(str3);
          i27 += i29 + qal.d(i29);
        }
        i26++;
      }
    }
    i5 = i5 + i27 + i28 * 1;
    label330:
    if ((this.g != null) && (this.g.length > 0))
    {
      int i22 = i5;
      for (int i23 = 0; i23 < this.g.length; i23++)
      {
        ojv localojv1 = this.g[i23];
        if (localojv1 != null)
        {
          int i24 = qal.d(56);
          int i25 = localojv1.a();
          localojv1.ak = i25;
          i22 += i24 + (i25 + qal.d(i25));
        }
      }
      i5 = i22;
    }
    if (this.h != null)
    {
      this.h.booleanValue();
      i5 += 1 + qal.d(64);
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      i5 += 1 + qal.d(72);
    }
    if (this.j != -2147483648)
    {
      int i20 = this.j;
      int i21 = qal.d(80);
      if (i20 >= 0) {
        i1 = qal.d(i20);
      }
      i5 += i21 + i1;
    }
    if (this.q != null)
    {
      ojz localojz = this.q;
      int i18 = qal.d(88);
      int i19 = localojz.a();
      localojz.ak = i19;
      i5 += i18 + (i19 + qal.d(i19));
    }
    if (this.e != null)
    {
      oji localoji = this.e;
      int i16 = qal.d(96);
      int i17 = localoji.a();
      localoji.ak = i17;
      i5 += i16 + (i17 + qal.d(i17));
    }
    if (this.p != null)
    {
      this.p.booleanValue();
      i5 += 1 + qal.d(104);
    }
    if (this.r != null)
    {
      String str2 = this.r;
      int i14 = qal.d(112);
      int i15 = qal.a(str2);
      i5 += i14 + (i15 + qal.d(i15));
    }
    if (this.l != null)
    {
      oki localoki3 = this.l;
      int i12 = qal.d(120);
      int i13 = localoki3.a();
      localoki3.ak = i13;
      i5 += i12 + (i13 + qal.d(i13));
    }
    if (this.m != null)
    {
      oki localoki2 = this.m;
      int i10 = qal.d(128);
      int i11 = localoki2.a();
      localoki2.ak = i11;
      i5 += i10 + (i11 + qal.d(i11));
    }
    if (this.o != null)
    {
      int i6 = this.o.length;
      int i7 = 0;
      if (i6 > 0) {
        while (i7 < this.o.length)
        {
          oki localoki1 = this.o[i7];
          if (localoki1 != null)
          {
            int i8 = qal.d(136);
            int i9 = localoki1.a();
            localoki1.ak = i9;
            i5 += i8 + (i9 + qal.d(i9));
          }
          i7++;
        }
      }
    }
    return i5;
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    String str1 = this.a;
    paramqal.c(10);
    paramqal.a(str1);
    if (this.b != null)
    {
      ojv localojv3 = this.b;
      paramqal.c(18);
      if (localojv3.ak < 0) {
        localojv3.ak = localojv3.a();
      }
      paramqal.c(localojv3.ak);
      localojv3.a(paramqal);
    }
    if (this.c != -2147483648)
    {
      int i9 = this.c;
      paramqal.c(24);
      paramqal.a(i9);
    }
    if (this.d != null)
    {
      ojh localojh = this.d;
      paramqal.c(34);
      if (localojh.ak < 0) {
        localojh.ak = localojh.a();
      }
      paramqal.c(localojh.ak);
      localojh.a(paramqal);
    }
    if (this.f != null)
    {
      ojv localojv2 = this.f;
      paramqal.c(42);
      if (localojv2.ak < 0) {
        localojv2.ak = localojv2.a();
      }
      paramqal.c(localojv2.ak);
      localojv2.a(paramqal);
    }
    if ((this.n != null) && (this.n.length > 0)) {
      for (int i8 = 0; i8 < this.n.length; i8++)
      {
        String str3 = this.n[i8];
        if (str3 != null)
        {
          paramqal.c(50);
          paramqal.a(str3);
        }
      }
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int i7 = 0; i7 < this.g.length; i7++)
      {
        ojv localojv1 = this.g[i7];
        if (localojv1 != null)
        {
          paramqal.c(58);
          if (localojv1.ak < 0) {
            localojv1.ak = localojv1.a();
          }
          paramqal.c(localojv1.ak);
          localojv1.a(paramqal);
        }
      }
    }
    if (this.h != null)
    {
      boolean bool3 = this.h.booleanValue();
      paramqal.c(64);
      if (bool3) {}
      byte b3;
      for (int i6 = i1;; i6 = 0)
      {
        b3 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.i != null)
    {
      boolean bool2 = this.i.booleanValue();
      paramqal.c(72);
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
    if (this.j != -2147483648)
    {
      int i4 = this.j;
      paramqal.c(80);
      paramqal.a(i4);
    }
    if (this.q != null)
    {
      ojz localojz = this.q;
      paramqal.c(90);
      if (localojz.ak < 0) {
        localojz.ak = localojz.a();
      }
      paramqal.c(localojz.ak);
      localojz.a(paramqal);
    }
    if (this.e != null)
    {
      oji localoji = this.e;
      paramqal.c(98);
      if (localoji.ak < 0) {
        localoji.ak = localoji.a();
      }
      paramqal.c(localoji.ak);
      localoji.a(paramqal);
    }
    if (this.p != null)
    {
      boolean bool1 = this.p.booleanValue();
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
    if (this.r != null)
    {
      String str2 = this.r;
      paramqal.c(114);
      paramqal.a(str2);
    }
    if (this.l != null)
    {
      oki localoki3 = this.l;
      paramqal.c(122);
      if (localoki3.ak < 0) {
        localoki3.ak = localoki3.a();
      }
      paramqal.c(localoki3.ak);
      localoki3.a(paramqal);
    }
    if (this.m != null)
    {
      oki localoki2 = this.m;
      paramqal.c(130);
      if (localoki2.ak < 0) {
        localoki2.ak = localoki2.a();
      }
      paramqal.c(localoki2.ak);
      localoki2.a(paramqal);
    }
    if (this.o != null)
    {
      int i2 = this.o.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.o.length)
        {
          oki localoki1 = this.o[i3];
          if (localoki1 != null)
          {
            paramqal.c(138);
            if (localoki1.ak < 0) {
              localoki1.ak = localoki1.a();
            }
            paramqal.c(localoki1.ak);
            localoki1.a(paramqal);
          }
          i3++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ojm
 * JD-Core Version:    0.7.0.1
 */