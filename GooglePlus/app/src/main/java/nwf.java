import java.nio.ByteBuffer;

public final class nwf
  extends qan<nwf>
{
  private static volatile nwf[] f;
  public String a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public int e = -2147483648;
  private nwm g = null;
  private Boolean h = null;
  private String[] i = qay.f;
  private nxw[] j = nxw.b();
  
  public nwf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nwf[] b()
  {
    if (f == null) {}
    synchronized (qar.a)
    {
      if (f == null) {
        f = new nwf[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int k = super.a();
    if (this.g != null)
    {
      nwm localnwm = this.g;
      int i18 = qal.d(8);
      int i19 = localnwm.a();
      localnwm.ak = i19;
      k += i18 + (i19 + qal.d(i19));
    }
    if (this.a != null)
    {
      String str5 = this.a;
      int i16 = qal.d(16);
      int i17 = qal.a(str5);
      k += i16 + (i17 + qal.d(i17));
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i14 = qal.d(24);
      int i15 = qal.a(str4);
      k += i14 + (i15 + qal.d(i15));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i12 = qal.d(32);
      int i13 = qal.a(str3);
      k += i12 + (i13 + qal.d(i13));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i10 = qal.d(40);
      int i11 = qal.a(str2);
      k += i10 + (i11 + qal.d(i11));
    }
    if (this.h != null)
    {
      this.h.booleanValue();
      k += 1 + qal.d(48);
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
      k = k + i7 + i8 * 1;
    }
    if (this.j != null)
    {
      int i2 = this.j.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.j.length)
        {
          nxw localnxw = this.j[i3];
          if (localnxw != null)
          {
            int i4 = qal.d(64);
            int i5 = localnxw.a();
            localnxw.ak = i5;
            k += i4 + (i5 + qal.d(i5));
          }
          i3++;
        }
      }
    }
    int m;
    int n;
    if (this.e != -2147483648)
    {
      m = this.e;
      n = qal.d(72);
      if (m < 0) {
        break label455;
      }
    }
    label455:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      k += i1 + n;
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.g != null)
    {
      nwm localnwm = this.g;
      paramqal.c(10);
      if (localnwm.ak < 0) {
        localnwm.ak = localnwm.a();
      }
      paramqal.c(localnwm.ak);
      localnwm.a(paramqal);
    }
    if (this.a != null)
    {
      String str5 = this.a;
      paramqal.c(18);
      paramqal.a(str5);
    }
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(26);
      paramqal.a(str4);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(34);
      paramqal.a(str3);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.h != null)
    {
      boolean bool = this.h.booleanValue();
      paramqal.c(48);
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
    if ((this.i != null) && (this.i.length > 0)) {
      for (int i1 = 0; i1 < this.i.length; i1++)
      {
        String str1 = this.i[i1];
        if (str1 != null)
        {
          paramqal.c(58);
          paramqal.a(str1);
        }
      }
    }
    if (this.j != null)
    {
      int m = this.j.length;
      int n = 0;
      if (m > 0) {
        while (n < this.j.length)
        {
          nxw localnxw = this.j[n];
          if (localnxw != null)
          {
            paramqal.c(66);
            if (localnxw.ak < 0) {
              localnxw.ak = localnxw.a();
            }
            paramqal.c(localnxw.ak);
            localnxw.a(paramqal);
          }
          n++;
        }
      }
    }
    if (this.e != -2147483648)
    {
      int k = this.e;
      paramqal.c(72);
      paramqal.a(k);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwf
 * JD-Core Version:    0.7.0.1
 */