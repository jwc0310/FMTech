import java.nio.ByteBuffer;

public final class nxf
  extends qan<nxf>
{
  private static volatile nxf[] f;
  public String a = null;
  public String b = null;
  public String c = null;
  public Boolean d = null;
  public String e = null;
  private Integer g = null;
  private Integer h = null;
  private String i = null;
  private Integer j = null;
  private Integer k = null;
  
  public nxf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nxf[] b()
  {
    if (f == null) {}
    synchronized (qar.a)
    {
      if (f == null) {
        f = new nxf[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int m = 10;
    int n = super.a();
    if (this.a != null)
    {
      String str5 = this.a;
      int i20 = qal.d(8);
      int i21 = qal.a(str5);
      n += i20 + (i21 + qal.d(i21));
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i18 = qal.d(16);
      int i19 = qal.a(str4);
      n += i18 + (i19 + qal.d(i19));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i16 = qal.d(24);
      int i17 = qal.a(str3);
      n += i16 + (i17 + qal.d(i17));
    }
    int i15;
    int i12;
    label209:
    int i3;
    int i4;
    if (this.g != null)
    {
      int i13 = this.g.intValue();
      int i14 = qal.d(32);
      if (i13 >= 0)
      {
        i15 = qal.d(i13);
        n += i15 + i14;
      }
    }
    else
    {
      if (this.h != null)
      {
        int i10 = this.h.intValue();
        int i11 = qal.d(40);
        if (i10 < 0) {
          break label413;
        }
        i12 = qal.d(i10);
        n += i12 + i11;
      }
      if (this.i != null)
      {
        String str2 = this.i;
        int i8 = qal.d(48);
        int i9 = qal.a(str2);
        n += i8 + (i9 + qal.d(i9));
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        n += 1 + qal.d(56);
      }
      if (this.e != null)
      {
        String str1 = this.e;
        int i6 = qal.d(64);
        int i7 = qal.a(str1);
        n += i6 + (i7 + qal.d(i7));
      }
      if (this.j != null)
      {
        i3 = this.j.intValue();
        i4 = qal.d(72);
        if (i3 < 0) {
          break label419;
        }
      }
    }
    label413:
    label419:
    for (int i5 = qal.d(i3);; i5 = m)
    {
      n += i5 + i4;
      if (this.k != null)
      {
        int i1 = this.k.intValue();
        int i2 = qal.d(80);
        if (i1 >= 0) {
          m = qal.d(i1);
        }
        n += i2 + m;
      }
      return n;
      i15 = m;
      break;
      i12 = m;
      break label209;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str5 = this.a;
      paramqal.c(10);
      paramqal.a(str5);
    }
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.g != null)
    {
      int i3 = this.g.intValue();
      paramqal.c(32);
      paramqal.a(i3);
    }
    if (this.h != null)
    {
      int i2 = this.h.intValue();
      paramqal.c(40);
      paramqal.a(i2);
    }
    if (this.i != null)
    {
      String str2 = this.i;
      paramqal.c(50);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(56);
      if (bool) {}
      byte b1;
      for (int i1 = 1;; i1 = 0)
      {
        b1 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(66);
      paramqal.a(str1);
    }
    if (this.j != null)
    {
      int n = this.j.intValue();
      paramqal.c(72);
      paramqal.a(n);
    }
    if (this.k != null)
    {
      int m = this.k.intValue();
      paramqal.c(80);
      paramqal.a(m);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxf
 * JD-Core Version:    0.7.0.1
 */