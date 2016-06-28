import java.nio.ByteBuffer;

public final class npi
  extends qan<npi>
{
  private static volatile npi[] a;
  private String b = null;
  private Boolean c = null;
  private String d = null;
  
  public npi()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static npi[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new npi[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str2 = this.b;
      int m = qal.d(8);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int j = qal.d(24);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
      paramqal.c(16);
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
      String str1 = this.d;
      paramqal.c(26);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npi
 * JD-Core Version:    0.7.0.1
 */