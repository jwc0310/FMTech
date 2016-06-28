import java.nio.ByteBuffer;

public final class nrk
  extends qan<nrk>
{
  public String a = null;
  public String b = null;
  public Boolean c = null;
  public Boolean d = null;
  private Long e = null;
  private String f = null;
  private Long g = null;
  private String h = null;
  private String i = null;
  private String j = null;
  
  public nrk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = super.a();
    if (this.a != null)
    {
      String str6 = this.a;
      int i9 = qal.d(8);
      int i10 = qal.a(str6);
      k += i9 + (i10 + qal.d(i10));
    }
    if (this.g != null)
    {
      long l2 = this.g.longValue();
      k += qal.d(16) + qal.b(l2);
    }
    if (this.e != null)
    {
      long l1 = this.e.longValue();
      k += qal.d(24) + qal.b(l1);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      k += 1 + qal.d(32);
    }
    if (this.f != null)
    {
      String str5 = this.f;
      int i7 = qal.d(40);
      int i8 = qal.a(str5);
      k += i7 + (i8 + qal.d(i8));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      k += 1 + qal.d(48);
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i5 = qal.d(56);
      int i6 = qal.a(str4);
      k += i5 + (i6 + qal.d(i6));
    }
    if (this.h != null)
    {
      String str3 = this.h;
      int i3 = qal.d(64);
      int i4 = qal.a(str3);
      k += i3 + (i4 + qal.d(i4));
    }
    if (this.i != null)
    {
      String str2 = this.i;
      int i1 = qal.d(72);
      int i2 = qal.a(str2);
      k += i1 + (i2 + qal.d(i2));
    }
    if (this.j != null)
    {
      String str1 = this.j;
      int m = qal.d(80);
      int n = qal.a(str1);
      k += m + (n + qal.d(n));
    }
    return k;
  }
  
  public final void a(qal paramqal)
  {
    int k = 1;
    if (this.a != null)
    {
      String str6 = this.a;
      paramqal.c(10);
      paramqal.a(str6);
    }
    if (this.g != null)
    {
      long l2 = this.g.longValue();
      paramqal.c(16);
      paramqal.a(l2);
    }
    if (this.e != null)
    {
      long l1 = this.e.longValue();
      paramqal.c(24);
      paramqal.a(l1);
    }
    if (this.c != null)
    {
      boolean bool2 = this.c.booleanValue();
      paramqal.c(32);
      if (bool2) {}
      byte b2;
      for (int m = k;; m = 0)
      {
        b2 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.f != null)
    {
      String str5 = this.f;
      paramqal.c(42);
      paramqal.a(str5);
    }
    if (this.d != null)
    {
      boolean bool1 = this.d.booleanValue();
      paramqal.c(48);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        k = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(58);
      paramqal.a(str4);
    }
    if (this.h != null)
    {
      String str3 = this.h;
      paramqal.c(66);
      paramqal.a(str3);
    }
    if (this.i != null)
    {
      String str2 = this.i;
      paramqal.c(74);
      paramqal.a(str2);
    }
    if (this.j != null)
    {
      String str1 = this.j;
      paramqal.c(82);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nrk
 * JD-Core Version:    0.7.0.1
 */