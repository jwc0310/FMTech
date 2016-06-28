import java.nio.ByteBuffer;

public final class nsh
  extends qan<nsh>
{
  public String a = null;
  public String b = null;
  public Boolean c = null;
  public String d = null;
  private Boolean e = null;
  
  public nsh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    String str1 = this.a;
    int j = qal.d(8);
    int k = qal.a(str1);
    int m = i + (j + (k + qal.d(k)));
    String str2 = this.b;
    int n = qal.d(16);
    int i1 = qal.a(str2);
    int i2 = m + (n + (i1 + qal.d(i1)));
    if (this.c != null)
    {
      this.c.booleanValue();
      i2 += 1 + qal.d(24);
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i2 += 1 + qal.d(32);
    }
    if (this.d != null)
    {
      String str3 = this.d;
      int i3 = qal.d(40);
      int i4 = qal.a(str3);
      i2 += i3 + (i4 + qal.d(i4));
    }
    return i2;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    String str1 = this.a;
    paramqal.c(10);
    paramqal.a(str1);
    String str2 = this.b;
    paramqal.c(18);
    paramqal.a(str2);
    if (this.c != null)
    {
      boolean bool2 = this.c.booleanValue();
      paramqal.c(24);
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
    if (this.e != null)
    {
      boolean bool1 = this.e.booleanValue();
      paramqal.c(32);
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
    if (this.d != null)
    {
      String str3 = this.d;
      paramqal.c(42);
      paramqal.a(str3);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsh
 * JD-Core Version:    0.7.0.1
 */