import java.nio.ByteBuffer;

public final class nrh
  extends qan<nrh>
{
  public String a = null;
  public Long b = null;
  public Boolean c = null;
  public Long d = null;
  public String e = null;
  private String f = null;
  
  public nrh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i1 = qal.d(8);
      int i2 = qal.a(str3);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      i += qal.d(16) + qal.b(l2);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
    }
    if (this.d != null)
    {
      long l1 = this.d.longValue();
      i += qal.d(32) + qal.b(l1);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      int m = qal.d(40);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.f != null)
    {
      String str1 = this.f;
      int j = qal.d(48);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
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
      long l2 = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l2);
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
      paramqal.c(24);
      if (bool) {}
      byte b1;
      for (int i = 1;; i = 0)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.d != null)
    {
      long l1 = this.d.longValue();
      paramqal.c(32);
      paramqal.a(l1);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(50);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nrh
 * JD-Core Version:    0.7.0.1
 */