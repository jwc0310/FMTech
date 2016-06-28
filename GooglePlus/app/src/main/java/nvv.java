public final class nvv
  extends qan<nvv>
{
  private static volatile nvv[] h;
  public int a = -2147483648;
  public Double b = null;
  public Double c = null;
  public Long d = null;
  public Integer e = null;
  public String f = null;
  public String g = null;
  private nwm i = null;
  private nwm j = null;
  private String k = null;
  private String l = null;
  private Long m = null;
  private nvu[] n = nvu.b();
  
  public nvv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nvv[] b()
  {
    if (h == null) {}
    synchronized (qar.a)
    {
      if (h == null) {
        h = new nvv[0];
      }
      return h;
    }
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    int i23;
    int i24;
    if (this.a != -2147483648)
    {
      int i22 = this.a;
      i23 = qal.d(16);
      if (i22 >= 0) {
        i24 = qal.d(i22);
      }
    }
    for (int i3 = i2 + (i24 + i23);; i3 = i2)
    {
      if (this.b != null)
      {
        this.b.doubleValue();
        i3 += 8 + qal.d(24);
      }
      if (this.c != null)
      {
        this.c.doubleValue();
        i3 += 8 + qal.d(32);
      }
      if (this.d != null)
      {
        long l2 = this.d.longValue();
        i3 += qal.d(40) + qal.b(l2);
      }
      if (this.e != null)
      {
        int i20 = this.e.intValue();
        int i21 = qal.d(48);
        if (i20 >= 0) {
          i1 = qal.d(i20);
        }
        i3 += i1 + i21;
      }
      if (this.f != null)
      {
        String str4 = this.f;
        int i18 = qal.d(56);
        int i19 = qal.a(str4);
        i3 += i18 + (i19 + qal.d(i19));
      }
      if (this.k != null)
      {
        String str3 = this.k;
        int i16 = qal.d(64);
        int i17 = qal.a(str3);
        i3 += i16 + (i17 + qal.d(i17));
      }
      if (this.l != null)
      {
        String str2 = this.l;
        int i14 = qal.d(72);
        int i15 = qal.a(str2);
        i3 += i14 + (i15 + qal.d(i15));
      }
      if (this.g != null)
      {
        String str1 = this.g;
        int i12 = qal.d(80);
        int i13 = qal.a(str1);
        i3 += i12 + (i13 + qal.d(i13));
      }
      if (this.m != null)
      {
        long l1 = this.m.longValue();
        i3 += qal.d(88) + qal.b(l1);
      }
      if (this.i != null)
      {
        nwm localnwm2 = this.i;
        int i10 = qal.d(96);
        int i11 = localnwm2.a();
        localnwm2.ak = i11;
        i3 += i10 + (i11 + qal.d(i11));
      }
      if (this.j != null)
      {
        nwm localnwm1 = this.j;
        int i8 = qal.d(104);
        int i9 = localnwm1.a();
        localnwm1.ak = i9;
        i3 += i8 + (i9 + qal.d(i9));
      }
      if ((this.n != null) && (this.n.length > 0))
      {
        int i4 = i3;
        int i5 = 0;
        for (;;)
        {
          if (i5 < this.n.length)
          {
            nvu localnvu = this.n[i5];
            if (localnvu != null)
            {
              int i6 = qal.d(112);
              int i7 = localnvu.a();
              localnvu.ak = i7;
              i4 += i6 + (i7 + qal.d(i7));
            }
            i5++;
            continue;
            i24 = i1;
            break;
          }
        }
        i3 = i4;
      }
      return i3;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int i3 = this.a;
      paramqal.c(16);
      paramqal.a(i3);
    }
    if (this.b != null)
    {
      double d2 = this.b.doubleValue();
      paramqal.c(25);
      paramqal.c(Double.doubleToLongBits(d2));
    }
    if (this.c != null)
    {
      double d1 = this.c.doubleValue();
      paramqal.c(33);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.d != null)
    {
      long l2 = this.d.longValue();
      paramqal.c(40);
      paramqal.a(l2);
    }
    if (this.e != null)
    {
      int i2 = this.e.intValue();
      paramqal.c(48);
      paramqal.a(i2);
    }
    if (this.f != null)
    {
      String str4 = this.f;
      paramqal.c(58);
      paramqal.a(str4);
    }
    if (this.k != null)
    {
      String str3 = this.k;
      paramqal.c(66);
      paramqal.a(str3);
    }
    if (this.l != null)
    {
      String str2 = this.l;
      paramqal.c(74);
      paramqal.a(str2);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(82);
      paramqal.a(str1);
    }
    if (this.m != null)
    {
      long l1 = this.m.longValue();
      paramqal.c(88);
      paramqal.a(l1);
    }
    if (this.i != null)
    {
      nwm localnwm2 = this.i;
      paramqal.c(98);
      if (localnwm2.ak < 0) {
        localnwm2.ak = localnwm2.a();
      }
      paramqal.c(localnwm2.ak);
      localnwm2.a(paramqal);
    }
    if (this.j != null)
    {
      nwm localnwm1 = this.j;
      paramqal.c(106);
      if (localnwm1.ak < 0) {
        localnwm1.ak = localnwm1.a();
      }
      paramqal.c(localnwm1.ak);
      localnwm1.a(paramqal);
    }
    if ((this.n != null) && (this.n.length > 0)) {
      for (int i1 = 0; i1 < this.n.length; i1++)
      {
        nvu localnvu = this.n[i1];
        if (localnvu != null)
        {
          paramqal.c(114);
          if (localnvu.ak < 0) {
            localnvu.ak = localnvu.a();
          }
          paramqal.c(localnvu.ak);
          localnvu.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nvv
 * JD-Core Version:    0.7.0.1
 */