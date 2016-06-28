import java.nio.ByteBuffer;

public final class ope
  extends qan<ope>
{
  public opo[] a = opo.c;
  public oqw[] b = oqw.b();
  public String c = null;
  public byte[] d = null;
  private opg e = null;
  private String f = null;
  private onc[] g = onc.b();
  private ool h = null;
  private int i = -2147483648;
  private olg j = null;
  private olm k = null;
  private olg[] l = olg.b();
  private opk m = null;
  
  public ope()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int n = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i30 = n;
      for (int i31 = 0; i31 < this.a.length; i31++)
      {
        opo localopo = this.a[i31];
        if (localopo != null)
        {
          int i32 = qal.d(8);
          int i33 = localopo.a();
          localopo.ak = i33;
          i30 += i32 + (i33 + qal.d(i33));
        }
      }
      n = i30;
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int i28 = qal.d(16);
      int i29 = qal.a(str2);
      n += i28 + (i29 + qal.d(i29));
    }
    if (this.e != null)
    {
      opg localopg = this.e;
      int i26 = qal.d(24);
      int i27 = localopg.a();
      localopg.ak = i27;
      n += i26 + (i27 + qal.d(i27));
    }
    if (this.f != null)
    {
      String str1 = this.f;
      int i24 = qal.d(32);
      int i25 = qal.a(str1);
      n += i24 + (i25 + qal.d(i25));
    }
    if ((this.g != null) && (this.g.length > 0))
    {
      int i20 = n;
      for (int i21 = 0; i21 < this.g.length; i21++)
      {
        onc localonc = this.g[i21];
        if (localonc != null)
        {
          int i22 = qal.d(40);
          int i23 = localonc.a();
          localonc.ak = i23;
          i20 += i22 + (i23 + qal.d(i23));
        }
      }
      n = i20;
    }
    if (this.h != null)
    {
      ool localool = this.h;
      int i18 = qal.d(48);
      int i19 = localool.a();
      localool.ak = i19;
      n += i18 + (i19 + qal.d(i19));
    }
    int i15;
    int i16;
    if (this.i != -2147483648)
    {
      i15 = this.i;
      i16 = qal.d(56);
      if (i15 < 0) {
        break label495;
      }
    }
    int i11;
    label495:
    for (int i17 = qal.d(i15);; i17 = 10)
    {
      n += i17 + i16;
      if ((this.b == null) || (this.b.length <= 0)) {
        break label505;
      }
      i11 = n;
      for (int i12 = 0; i12 < this.b.length; i12++)
      {
        oqw localoqw = this.b[i12];
        if (localoqw != null)
        {
          int i13 = qal.d(64);
          int i14 = localoqw.a();
          localoqw.ak = i14;
          i11 += i13 + (i14 + qal.d(i14));
        }
      }
    }
    n = i11;
    label505:
    if (this.j != null)
    {
      olg localolg2 = this.j;
      int i9 = qal.d(72);
      int i10 = localolg2.a();
      localolg2.ak = i10;
      n += i9 + (i10 + qal.d(i10));
    }
    if (this.d != null)
    {
      byte[] arrayOfByte = this.d;
      n += qal.d(80) + (qal.d(arrayOfByte.length) + arrayOfByte.length);
    }
    if (this.k != null)
    {
      olm localolm = this.k;
      int i7 = qal.d(88);
      int i8 = localolm.a();
      localolm.ak = i8;
      n += i7 + (i8 + qal.d(i8));
    }
    if (this.l != null)
    {
      int i3 = this.l.length;
      int i4 = 0;
      if (i3 > 0) {
        while (i4 < this.l.length)
        {
          olg localolg1 = this.l[i4];
          if (localolg1 != null)
          {
            int i5 = qal.d(96);
            int i6 = localolg1.a();
            localolg1.ak = i6;
            n += i5 + (i6 + qal.d(i6));
          }
          i4++;
        }
      }
    }
    if (this.m != null)
    {
      opk localopk = this.m;
      int i1 = qal.d(104);
      int i2 = localopk.a();
      localopk.ak = i2;
      n += i1 + (i2 + qal.d(i2));
    }
    return n;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i6 = 0; i6 < this.a.length; i6++)
      {
        opo localopo = this.a[i6];
        if (localopo != null)
        {
          paramqal.c(10);
          if (localopo.ak < 0) {
            localopo.ak = localopo.a();
          }
          paramqal.c(localopo.ak);
          localopo.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      opg localopg = this.e;
      paramqal.c(26);
      if (localopg.ak < 0) {
        localopg.ak = localopg.a();
      }
      paramqal.c(localopg.ak);
      localopg.a(paramqal);
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int i5 = 0; i5 < this.g.length; i5++)
      {
        onc localonc = this.g[i5];
        if (localonc != null)
        {
          paramqal.c(42);
          if (localonc.ak < 0) {
            localonc.ak = localonc.a();
          }
          paramqal.c(localonc.ak);
          localonc.a(paramqal);
        }
      }
    }
    if (this.h != null)
    {
      ool localool = this.h;
      paramqal.c(50);
      if (localool.ak < 0) {
        localool.ak = localool.a();
      }
      paramqal.c(localool.ak);
      localool.a(paramqal);
    }
    if (this.i != -2147483648)
    {
      int i4 = this.i;
      paramqal.c(56);
      paramqal.a(i4);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i3 = 0; i3 < this.b.length; i3++)
      {
        oqw localoqw = this.b[i3];
        if (localoqw != null)
        {
          paramqal.c(66);
          if (localoqw.ak < 0) {
            localoqw.ak = localoqw.a();
          }
          paramqal.c(localoqw.ak);
          localoqw.a(paramqal);
        }
      }
    }
    if (this.j != null)
    {
      olg localolg2 = this.j;
      paramqal.c(74);
      if (localolg2.ak < 0) {
        localolg2.ak = localolg2.a();
      }
      paramqal.c(localolg2.ak);
      localolg2.a(paramqal);
    }
    if (this.d != null)
    {
      byte[] arrayOfByte = this.d;
      paramqal.c(82);
      paramqal.c(arrayOfByte.length);
      int i2 = arrayOfByte.length;
      if (paramqal.a.remaining() >= i2) {
        paramqal.a.put(arrayOfByte, 0, i2);
      }
    }
    else
    {
      if (this.k != null)
      {
        olm localolm = this.k;
        paramqal.c(90);
        if (localolm.ak < 0) {
          localolm.ak = localolm.a();
        }
        paramqal.c(localolm.ak);
        localolm.a(paramqal);
      }
      if (this.l == null) {
        break label713;
      }
      int n = this.l.length;
      int i1 = 0;
      if (n <= 0) {
        break label713;
      }
      while (i1 < this.l.length)
      {
        olg localolg1 = this.l[i1];
        if (localolg1 != null)
        {
          paramqal.c(98);
          if (localolg1.ak < 0) {
            localolg1.ak = localolg1.a();
          }
          paramqal.c(localolg1.ak);
          localolg1.a(paramqal);
        }
        i1++;
      }
    }
    throw new qam(paramqal.a.position(), paramqal.a.limit());
    label713:
    if (this.m != null)
    {
      opk localopk = this.m;
      paramqal.c(106);
      if (localopk.ak < 0) {
        localopk.ak = localopk.a();
      }
      paramqal.c(localopk.ak);
      localopk.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ope
 * JD-Core Version:    0.7.0.1
 */