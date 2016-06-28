import java.nio.ByteBuffer;

public final class nzx
  extends qan<nzx>
{
  private static volatile nzx[] a;
  private nzw b = null;
  private String c = null;
  private String d = null;
  private String e = null;
  private String f = null;
  private Boolean g = null;
  private Long h = null;
  private Long i = null;
  private Boolean j = null;
  private nzy[] k = nzy.b();
  private nzy[] l = nzy.b();
  private String m = null;
  private String n = null;
  
  public nzx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nzx[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nzx[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.b != null)
    {
      nzw localnzw = this.b;
      int i22 = qal.d(8);
      int i23 = localnzw.a();
      localnzw.ak = i23;
      i1 += i22 + (i23 + qal.d(i23));
    }
    if (this.c != null)
    {
      String str6 = this.c;
      int i20 = qal.d(16);
      int i21 = qal.a(str6);
      i1 += i20 + (i21 + qal.d(i21));
    }
    if (this.e != null)
    {
      String str5 = this.e;
      int i18 = qal.d(24);
      int i19 = qal.a(str5);
      i1 += i18 + (i19 + qal.d(i19));
    }
    if (this.f != null)
    {
      String str4 = this.f;
      int i16 = qal.d(32);
      int i17 = qal.a(str4);
      i1 += i16 + (i17 + qal.d(i17));
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      i1 += 1 + qal.d(40);
    }
    if (this.h != null)
    {
      long l2 = this.h.longValue();
      i1 += qal.d(48) + qal.b(l2);
    }
    if (this.i != null)
    {
      long l1 = this.i.longValue();
      i1 += qal.d(56) + qal.b(l1);
    }
    if (this.d != null)
    {
      String str3 = this.d;
      int i14 = qal.d(64);
      int i15 = qal.a(str3);
      i1 += i14 + (i15 + qal.d(i15));
    }
    if (this.j != null)
    {
      this.j.booleanValue();
      i1 += 1 + qal.d(72);
    }
    if ((this.k != null) && (this.k.length > 0))
    {
      int i10 = i1;
      for (int i11 = 0; i11 < this.k.length; i11++)
      {
        nzy localnzy2 = this.k[i11];
        if (localnzy2 != null)
        {
          int i12 = qal.d(80);
          int i13 = localnzy2.a();
          localnzy2.ak = i13;
          i10 += i12 + (i13 + qal.d(i13));
        }
      }
      i1 = i10;
    }
    if (this.l != null)
    {
      int i6 = this.l.length;
      int i7 = 0;
      if (i6 > 0) {
        while (i7 < this.l.length)
        {
          nzy localnzy1 = this.l[i7];
          if (localnzy1 != null)
          {
            int i8 = qal.d(88);
            int i9 = localnzy1.a();
            localnzy1.ak = i9;
            i1 += i8 + (i9 + qal.d(i9));
          }
          i7++;
        }
      }
    }
    if (this.m != null)
    {
      String str2 = this.m;
      int i4 = qal.d(96);
      int i5 = qal.a(str2);
      i1 += i4 + (i5 + qal.d(i5));
    }
    if (this.n != null)
    {
      String str1 = this.n;
      int i2 = qal.d(104);
      int i3 = qal.a(str1);
      i1 += i2 + (i3 + qal.d(i3));
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.b != null)
    {
      nzw localnzw = this.b;
      paramqal.c(10);
      if (localnzw.ak < 0) {
        localnzw.ak = localnzw.a();
      }
      paramqal.c(localnzw.ak);
      localnzw.a(paramqal);
    }
    if (this.c != null)
    {
      String str6 = this.c;
      paramqal.c(18);
      paramqal.a(str6);
    }
    if (this.e != null)
    {
      String str5 = this.e;
      paramqal.c(26);
      paramqal.a(str5);
    }
    if (this.f != null)
    {
      String str4 = this.f;
      paramqal.c(34);
      paramqal.a(str4);
    }
    if (this.g != null)
    {
      boolean bool2 = this.g.booleanValue();
      paramqal.c(40);
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
    if (this.h != null)
    {
      long l2 = this.h.longValue();
      paramqal.c(48);
      paramqal.a(l2);
    }
    if (this.i != null)
    {
      long l1 = this.i.longValue();
      paramqal.c(56);
      paramqal.a(l1);
    }
    if (this.d != null)
    {
      String str3 = this.d;
      paramqal.c(66);
      paramqal.a(str3);
    }
    if (this.j != null)
    {
      boolean bool1 = this.j.booleanValue();
      paramqal.c(72);
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
    if ((this.k != null) && (this.k.length > 0)) {
      for (int i4 = 0; i4 < this.k.length; i4++)
      {
        nzy localnzy2 = this.k[i4];
        if (localnzy2 != null)
        {
          paramqal.c(82);
          if (localnzy2.ak < 0) {
            localnzy2.ak = localnzy2.a();
          }
          paramqal.c(localnzy2.ak);
          localnzy2.a(paramqal);
        }
      }
    }
    if (this.l != null)
    {
      int i2 = this.l.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.l.length)
        {
          nzy localnzy1 = this.l[i3];
          if (localnzy1 != null)
          {
            paramqal.c(90);
            if (localnzy1.ak < 0) {
              localnzy1.ak = localnzy1.a();
            }
            paramqal.c(localnzy1.ak);
            localnzy1.a(paramqal);
          }
          i3++;
        }
      }
    }
    if (this.m != null)
    {
      String str2 = this.m;
      paramqal.c(98);
      paramqal.a(str2);
    }
    if (this.n != null)
    {
      String str1 = this.n;
      paramqal.c(106);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzx
 * JD-Core Version:    0.7.0.1
 */