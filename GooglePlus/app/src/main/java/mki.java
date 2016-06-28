import java.nio.ByteBuffer;

public final class mki
  extends qan<mki>
{
  private String a = null;
  private String b = null;
  private String c = null;
  private String d = null;
  private String e = null;
  private mkk[] f = mkk.b();
  private String g = null;
  private String h = null;
  private String[] i = qay.f;
  private mkm j = null;
  private mkj[] k = mkj.b();
  private Boolean l = null;
  
  public mki()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.a != null)
    {
      String str8 = this.a;
      int i26 = qal.d(8);
      int i27 = qal.a(str8);
      m += i26 + (i27 + qal.d(i27));
    }
    if (this.b != null)
    {
      String str7 = this.b;
      int i24 = qal.d(16);
      int i25 = qal.a(str7);
      m += i24 + (i25 + qal.d(i25));
    }
    if (this.c != null)
    {
      String str6 = this.c;
      int i22 = qal.d(24);
      int i23 = qal.a(str6);
      m += i22 + (i23 + qal.d(i23));
    }
    if (this.d != null)
    {
      String str5 = this.d;
      int i20 = qal.d(32);
      int i21 = qal.a(str5);
      m += i20 + (i21 + qal.d(i21));
    }
    if (this.e != null)
    {
      String str4 = this.e;
      int i18 = qal.d(40);
      int i19 = qal.a(str4);
      m += i18 + (i19 + qal.d(i19));
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int i14 = m;
      for (int i15 = 0; i15 < this.f.length; i15++)
      {
        mkk localmkk = this.f[i15];
        if (localmkk != null)
        {
          int i16 = qal.d(48);
          int i17 = localmkk.a();
          localmkk.ak = i17;
          i14 += i16 + (i17 + qal.d(i17));
        }
      }
      m = i14;
    }
    if (this.g != null)
    {
      String str3 = this.g;
      int i12 = qal.d(56);
      int i13 = qal.a(str3);
      m += i12 + (i13 + qal.d(i13));
    }
    if (this.h != null)
    {
      String str2 = this.h;
      int i10 = qal.d(64);
      int i11 = qal.a(str2);
      m += i10 + (i11 + qal.d(i11));
    }
    if ((this.i != null) && (this.i.length > 0))
    {
      int i6 = 0;
      int i7 = 0;
      int i8 = 0;
      while (i6 < this.i.length)
      {
        String str1 = this.i[i6];
        if (str1 != null)
        {
          i8++;
          int i9 = qal.a(str1);
          i7 += i9 + qal.d(i9);
        }
        i6++;
      }
      m = m + i7 + i8 * 1;
    }
    if (this.j != null)
    {
      mkm localmkm = this.j;
      int i4 = qal.d(80);
      int i5 = localmkm.a();
      localmkm.ak = i5;
      m += i4 + (i5 + qal.d(i5));
    }
    if (this.k != null)
    {
      int n = this.k.length;
      int i1 = 0;
      if (n > 0) {
        while (i1 < this.k.length)
        {
          mkj localmkj = this.k[i1];
          if (localmkj != null)
          {
            int i2 = qal.d(88);
            int i3 = localmkj.a();
            localmkj.ak = i3;
            m += i2 + (i3 + qal.d(i3));
          }
          i1++;
        }
      }
    }
    if (this.l != null)
    {
      this.l.booleanValue();
      m += 1 + qal.d(96);
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str8 = this.a;
      paramqal.c(10);
      paramqal.a(str8);
    }
    if (this.b != null)
    {
      String str7 = this.b;
      paramqal.c(18);
      paramqal.a(str7);
    }
    if (this.c != null)
    {
      String str6 = this.c;
      paramqal.c(26);
      paramqal.a(str6);
    }
    if (this.d != null)
    {
      String str5 = this.d;
      paramqal.c(34);
      paramqal.a(str5);
    }
    if (this.e != null)
    {
      String str4 = this.e;
      paramqal.c(42);
      paramqal.a(str4);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i2 = 0; i2 < this.f.length; i2++)
      {
        mkk localmkk = this.f[i2];
        if (localmkk != null)
        {
          paramqal.c(50);
          if (localmkk.ak < 0) {
            localmkk.ak = localmkk.a();
          }
          paramqal.c(localmkk.ak);
          localmkk.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      String str3 = this.g;
      paramqal.c(58);
      paramqal.a(str3);
    }
    if (this.h != null)
    {
      String str2 = this.h;
      paramqal.c(66);
      paramqal.a(str2);
    }
    if ((this.i != null) && (this.i.length > 0)) {
      for (int i1 = 0; i1 < this.i.length; i1++)
      {
        String str1 = this.i[i1];
        if (str1 != null)
        {
          paramqal.c(74);
          paramqal.a(str1);
        }
      }
    }
    if (this.j != null)
    {
      mkm localmkm = this.j;
      paramqal.c(82);
      if (localmkm.ak < 0) {
        localmkm.ak = localmkm.a();
      }
      paramqal.c(localmkm.ak);
      localmkm.a(paramqal);
    }
    if ((this.k != null) && (this.k.length > 0)) {
      for (int n = 0; n < this.k.length; n++)
      {
        mkj localmkj = this.k[n];
        if (localmkj != null)
        {
          paramqal.c(90);
          if (localmkj.ak < 0) {
            localmkj.ak = localmkj.a();
          }
          paramqal.c(localmkj.ak);
          localmkj.a(paramqal);
        }
      }
    }
    if (this.l != null)
    {
      boolean bool = this.l.booleanValue();
      paramqal.c(96);
      int m = 0;
      if (bool) {
        m = 1;
      }
      byte b1 = (byte)m;
      if (!paramqal.a.hasRemaining()) {
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mki
 * JD-Core Version:    0.7.0.1
 */