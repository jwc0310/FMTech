import java.nio.ByteBuffer;

public final class oci
  extends qan<oci>
{
  public ocf a = null;
  public Boolean b = null;
  public Boolean c = null;
  private String d = null;
  private Boolean e = null;
  private ocf f = null;
  private String g = null;
  private String h = null;
  
  public oci()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ocf localocf2 = this.a;
      int i5 = qal.d(8);
      int i6 = localocf2.a();
      localocf2.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.d != null)
    {
      String str3 = this.d;
      int i3 = qal.d(24);
      int i4 = qal.a(str3);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i += 1 + qal.d(32);
    }
    if (this.f != null)
    {
      ocf localocf1 = this.f;
      int i1 = qal.d(40);
      int i2 = localocf1.a();
      localocf1.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.g != null)
    {
      String str2 = this.g;
      int m = qal.d(48);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.h != null)
    {
      String str1 = this.h;
      int j = qal.d(56);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(64);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      ocf localocf2 = this.a;
      paramqal.c(10);
      if (localocf2.ak < 0) {
        localocf2.ak = localocf2.a();
      }
      paramqal.c(localocf2.ak);
      localocf2.a(paramqal);
    }
    if (this.b != null)
    {
      boolean bool3 = this.b.booleanValue();
      paramqal.c(16);
      if (bool3) {}
      byte b3;
      for (int k = i;; k = 0)
      {
        b3 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.d != null)
    {
      String str3 = this.d;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.e != null)
    {
      boolean bool2 = this.e.booleanValue();
      paramqal.c(32);
      if (bool2) {}
      byte b2;
      for (int j = i;; j = 0)
      {
        b2 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.f != null)
    {
      ocf localocf1 = this.f;
      paramqal.c(42);
      if (localocf1.ak < 0) {
        localocf1.ak = localocf1.a();
      }
      paramqal.c(localocf1.ak);
      localocf1.a(paramqal);
    }
    if (this.g != null)
    {
      String str2 = this.g;
      paramqal.c(50);
      paramqal.a(str2);
    }
    if (this.h != null)
    {
      String str1 = this.h;
      paramqal.c(58);
      paramqal.a(str1);
    }
    if (this.c != null)
    {
      boolean bool1 = this.c.booleanValue();
      paramqal.c(64);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oci
 * JD-Core Version:    0.7.0.1
 */