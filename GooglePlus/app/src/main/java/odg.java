import java.nio.ByteBuffer;

public final class odg
  extends qan<odg>
{
  private static volatile odg[] h;
  public ors a = null;
  public Integer b = null;
  public ors[] c = ors.b();
  public String d = null;
  public qoq[] e = qoq.b();
  public int f = -2147483648;
  public Boolean g = null;
  private Double i = null;
  private Integer j = null;
  private Integer k = null;
  private String[] l = qay.f;
  private odg[] m = b();
  private String n = null;
  
  public odg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static odg[] b()
  {
    if (h == null) {}
    synchronized (qar.a)
    {
      if (h == null) {
        h = new odg[0];
      }
      return h;
    }
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if (this.a != null)
    {
      ors localors2 = this.a;
      int i34 = qal.d(8);
      int i35 = localors2.a();
      localors2.ak = i35;
      i2 += i34 + (i35 + qal.d(i35));
    }
    int i31;
    int i32;
    if (this.b != null)
    {
      i31 = this.b.intValue();
      i32 = qal.d(16);
      if (i31 < 0) {
        break label187;
      }
    }
    int i27;
    label187:
    for (int i33 = qal.d(i31);; i33 = i1)
    {
      i2 += i33 + i32;
      if ((this.c == null) || (this.c.length <= 0)) {
        break label196;
      }
      i27 = i2;
      for (int i28 = 0; i28 < this.c.length; i28++)
      {
        ors localors1 = this.c[i28];
        if (localors1 != null)
        {
          int i29 = qal.d(24);
          int i30 = localors1.a();
          localors1.ak = i30;
          i27 += i29 + (i30 + qal.d(i30));
        }
      }
    }
    i2 = i27;
    label196:
    if (this.i != null)
    {
      this.i.doubleValue();
      i2 += 8 + qal.d(32);
    }
    if (this.d != null)
    {
      String str3 = this.d;
      int i25 = qal.d(40);
      int i26 = qal.a(str3);
      i2 += i25 + (i26 + qal.d(i26));
    }
    int i24;
    int i19;
    int i20;
    if (this.j != null)
    {
      int i22 = this.j.intValue();
      int i23 = qal.d(48);
      if (i22 >= 0)
      {
        i24 = qal.d(i22);
        i2 += i24 + i23;
      }
    }
    else if (this.k != null)
    {
      i19 = this.k.intValue();
      i20 = qal.d(56);
      if (i19 < 0) {
        break label483;
      }
    }
    int i13;
    label483:
    for (int i21 = qal.d(i19);; i21 = i1)
    {
      i2 += i21 + i20;
      if (this.f != -2147483648)
      {
        int i17 = this.f;
        int i18 = qal.d(80);
        if (i17 >= 0) {
          i1 = qal.d(i17);
        }
        i2 += i18 + i1;
      }
      if ((this.m == null) || (this.m.length <= 0)) {
        break label492;
      }
      i13 = i2;
      for (int i14 = 0; i14 < this.m.length; i14++)
      {
        odg localodg = this.m[i14];
        if (localodg != null)
        {
          int i15 = qal.d(88);
          int i16 = localodg.a();
          localodg.ak = i16;
          i13 += i15 + (i16 + qal.d(i16));
        }
      }
      i24 = i1;
      break;
    }
    i2 = i13;
    label492:
    if (this.g != null)
    {
      this.g.booleanValue();
      i2 += 1 + qal.d(96);
    }
    if ((this.l != null) && (this.l.length > 0))
    {
      int i9 = 0;
      int i10 = 0;
      int i11 = 0;
      while (i9 < this.l.length)
      {
        String str2 = this.l[i9];
        if (str2 != null)
        {
          i11++;
          int i12 = qal.a(str2);
          i10 += i12 + qal.d(i12);
        }
        i9++;
      }
      i2 = i2 + i10 + i11 * 1;
    }
    if (this.e != null)
    {
      int i5 = this.e.length;
      int i6 = 0;
      if (i5 > 0) {
        while (i6 < this.e.length)
        {
          qoq localqoq = this.e[i6];
          if (localqoq != null)
          {
            int i7 = qal.d(120);
            int i8 = localqoq.a();
            localqoq.ak = i8;
            i2 += i7 + (i8 + qal.d(i8));
          }
          i6++;
        }
      }
    }
    if (this.n != null)
    {
      String str1 = this.n;
      int i3 = qal.d(128);
      int i4 = qal.a(str1);
      i2 += i3 + (i4 + qal.d(i4));
    }
    return i2;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ors localors2 = this.a;
      paramqal.c(10);
      if (localors2.ak < 0) {
        localors2.ak = localors2.a();
      }
      paramqal.c(localors2.ak);
      localors2.a(paramqal);
    }
    if (this.b != null)
    {
      int i10 = this.b.intValue();
      paramqal.c(16);
      paramqal.a(i10);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i9 = 0; i9 < this.c.length; i9++)
      {
        ors localors1 = this.c[i9];
        if (localors1 != null)
        {
          paramqal.c(26);
          if (localors1.ak < 0) {
            localors1.ak = localors1.a();
          }
          paramqal.c(localors1.ak);
          localors1.a(paramqal);
        }
      }
    }
    if (this.i != null)
    {
      double d1 = this.i.doubleValue();
      paramqal.c(33);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.d != null)
    {
      String str3 = this.d;
      paramqal.c(42);
      paramqal.a(str3);
    }
    if (this.j != null)
    {
      int i8 = this.j.intValue();
      paramqal.c(48);
      paramqal.a(i8);
    }
    if (this.k != null)
    {
      int i7 = this.k.intValue();
      paramqal.c(56);
      paramqal.a(i7);
    }
    if (this.f != -2147483648)
    {
      int i6 = this.f;
      paramqal.c(80);
      paramqal.a(i6);
    }
    if ((this.m != null) && (this.m.length > 0)) {
      for (int i5 = 0; i5 < this.m.length; i5++)
      {
        odg localodg = this.m[i5];
        if (localodg != null)
        {
          paramqal.c(90);
          if (localodg.ak < 0) {
            localodg.ak = localodg.a();
          }
          paramqal.c(localodg.ak);
          localodg.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      boolean bool = this.g.booleanValue();
      paramqal.c(96);
      if (bool) {}
      byte b1;
      for (int i4 = 1;; i4 = 0)
      {
        b1 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if ((this.l != null) && (this.l.length > 0)) {
      for (int i3 = 0; i3 < this.l.length; i3++)
      {
        String str2 = this.l[i3];
        if (str2 != null)
        {
          paramqal.c(114);
          paramqal.a(str2);
        }
      }
    }
    if (this.e != null)
    {
      int i1 = this.e.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.e.length)
        {
          qoq localqoq = this.e[i2];
          if (localqoq != null)
          {
            paramqal.c(122);
            if (localqoq.ak < 0) {
              localqoq.ak = localqoq.a();
            }
            paramqal.c(localqoq.ak);
            localqoq.a(paramqal);
          }
          i2++;
        }
      }
    }
    if (this.n != null)
    {
      String str1 = this.n;
      paramqal.c(130);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odg
 * JD-Core Version:    0.7.0.1
 */