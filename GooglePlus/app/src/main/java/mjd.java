import java.nio.ByteBuffer;

public final class mjd
  extends qan<mjd>
{
  private static volatile mjd[] l;
  public String a = null;
  public String b = null;
  public mks c = null;
  public int d = -2147483648;
  public int e = -2147483648;
  public Long f = null;
  public Long g = null;
  public Boolean h = null;
  public mjy i = null;
  public mjc j = null;
  public int k = -2147483648;
  private mjg[] m = mjg.b();
  private Long n = null;
  private String o = null;
  
  public mjd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mjd[] b()
  {
    if (l == null) {}
    synchronized (qar.a)
    {
      if (l == null) {
        l = new mjd[0];
      }
      return l;
    }
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i25 = qal.d(8);
      int i26 = qal.a(str3);
      i2 += i25 + (i26 + qal.d(i26));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i23 = qal.d(16);
      int i24 = qal.a(str2);
      i2 += i23 + (i24 + qal.d(i24));
    }
    if ((this.m != null) && (this.m.length > 0))
    {
      int i19 = i2;
      for (int i20 = 0; i20 < this.m.length; i20++)
      {
        mjg localmjg = this.m[i20];
        if (localmjg != null)
        {
          int i21 = qal.d(24);
          int i22 = localmjg.a();
          localmjg.ak = i22;
          i19 += i21 + (i22 + qal.d(i22));
        }
      }
      i2 = i19;
    }
    if (this.c != null)
    {
      mks localmks = this.c;
      int i17 = qal.d(32);
      int i18 = localmks.a();
      localmks.ak = i18;
      i2 += i17 + (i18 + qal.d(i18));
    }
    int i16;
    int i11;
    int i12;
    if (this.d != -2147483648)
    {
      int i14 = this.d;
      int i15 = qal.d(40);
      if (i14 >= 0)
      {
        i16 = qal.d(i14);
        i2 += i16 + i15;
      }
    }
    else
    {
      if (this.n != null)
      {
        long l3 = this.n.longValue();
        i2 += qal.d(48) + qal.b(l3);
      }
      if (this.e != -2147483648)
      {
        i11 = this.e;
        i12 = qal.d(56);
        if (i11 < 0) {
          break label610;
        }
      }
    }
    label610:
    for (int i13 = qal.d(i11);; i13 = i1)
    {
      i2 += i13 + i12;
      if (this.o != null)
      {
        String str1 = this.o;
        int i9 = qal.d(64);
        int i10 = qal.a(str1);
        i2 += i9 + (i10 + qal.d(i10));
      }
      if (this.f != null)
      {
        long l2 = this.f.longValue();
        i2 += qal.d(72) + qal.b(l2);
      }
      if (this.g != null)
      {
        long l1 = this.g.longValue();
        i2 += qal.d(80) + qal.b(l1);
      }
      if (this.h != null)
      {
        this.h.booleanValue();
        i2 += 1 + qal.d(88);
      }
      if (this.i != null)
      {
        mjy localmjy = this.i;
        int i7 = qal.d(96);
        int i8 = localmjy.a();
        localmjy.ak = i8;
        i2 += i7 + (i8 + qal.d(i8));
      }
      if (this.j != null)
      {
        mjc localmjc = this.j;
        int i5 = qal.d(104);
        int i6 = localmjc.a();
        localmjc.ak = i6;
        i2 += i5 + (i6 + qal.d(i6));
      }
      if (this.k != -2147483648)
      {
        int i3 = this.k;
        int i4 = qal.d(112);
        if (i3 >= 0) {
          i1 = qal.d(i3);
        }
        i2 += i4 + i1;
      }
      return i2;
      i16 = i1;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if ((this.m != null) && (this.m.length > 0)) {
      for (int i5 = 0; i5 < this.m.length; i5++)
      {
        mjg localmjg = this.m[i5];
        if (localmjg != null)
        {
          paramqal.c(26);
          if (localmjg.ak < 0) {
            localmjg.ak = localmjg.a();
          }
          paramqal.c(localmjg.ak);
          localmjg.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      mks localmks = this.c;
      paramqal.c(34);
      if (localmks.ak < 0) {
        localmks.ak = localmks.a();
      }
      paramqal.c(localmks.ak);
      localmks.a(paramqal);
    }
    if (this.d != -2147483648)
    {
      int i4 = this.d;
      paramqal.c(40);
      paramqal.a(i4);
    }
    if (this.n != null)
    {
      long l3 = this.n.longValue();
      paramqal.c(48);
      paramqal.a(l3);
    }
    if (this.e != -2147483648)
    {
      int i3 = this.e;
      paramqal.c(56);
      paramqal.a(i3);
    }
    if (this.o != null)
    {
      String str1 = this.o;
      paramqal.c(66);
      paramqal.a(str1);
    }
    if (this.f != null)
    {
      long l2 = this.f.longValue();
      paramqal.c(72);
      paramqal.a(l2);
    }
    if (this.g != null)
    {
      long l1 = this.g.longValue();
      paramqal.c(80);
      paramqal.a(l1);
    }
    if (this.h != null)
    {
      boolean bool = this.h.booleanValue();
      paramqal.c(88);
      int i2 = 0;
      if (bool) {
        i2 = 1;
      }
      byte b1 = (byte)i2;
      if (!paramqal.a.hasRemaining()) {
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.i != null)
    {
      mjy localmjy = this.i;
      paramqal.c(98);
      if (localmjy.ak < 0) {
        localmjy.ak = localmjy.a();
      }
      paramqal.c(localmjy.ak);
      localmjy.a(paramqal);
    }
    if (this.j != null)
    {
      mjc localmjc = this.j;
      paramqal.c(106);
      if (localmjc.ak < 0) {
        localmjc.ak = localmjc.a();
      }
      paramqal.c(localmjc.ak);
      localmjc.a(paramqal);
    }
    if (this.k != -2147483648)
    {
      int i1 = this.k;
      paramqal.c(112);
      paramqal.a(i1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mjd
 * JD-Core Version:    0.7.0.1
 */