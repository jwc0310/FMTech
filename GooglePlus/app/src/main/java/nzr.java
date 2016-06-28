import java.nio.ByteBuffer;

public final class nzr
  extends qan<nzr>
{
  private static volatile nzr[] d;
  public orm a = null;
  public orn b = null;
  public String c = null;
  private Boolean e = null;
  private String f = null;
  private String g = null;
  
  public nzr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nzr[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new nzr[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      orm localorm = this.a;
      int i5 = qal.d(8);
      int i6 = localorm.a();
      localorm.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      orn localorn = this.b;
      int i3 = qal.d(16);
      int i4 = localorn.a();
      localorn.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i1 = qal.d(24);
      int i2 = qal.a(str3);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i += 1 + qal.d(32);
    }
    if (this.f != null)
    {
      String str2 = this.f;
      int m = qal.d(40);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.g != null)
    {
      String str1 = this.g;
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
      orm localorm = this.a;
      paramqal.c(10);
      if (localorm.ak < 0) {
        localorm.ak = localorm.a();
      }
      paramqal.c(localorm.ak);
      localorm.a(paramqal);
    }
    if (this.b != null)
    {
      orn localorn = this.b;
      paramqal.c(18);
      if (localorn.ak < 0) {
        localorn.ak = localorn.a();
      }
      paramqal.c(localorn.ak);
      localorn.a(paramqal);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
      paramqal.c(32);
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
    if (this.f != null)
    {
      String str2 = this.f;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(50);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzr
 * JD-Core Version:    0.7.0.1
 */