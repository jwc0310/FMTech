import java.nio.ByteBuffer;

public final class mmr
  extends qan<mmr>
{
  private static volatile mmr[] e;
  public String a = null;
  public String b = null;
  public Boolean c = null;
  public String d = null;
  
  public mmr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mmr[] b()
  {
    if (e == null) {}
    synchronized (qar.a)
    {
      if (e == null) {
        e = new mmr[0];
      }
      return e;
    }
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
      String str2 = this.b;
      int m = qal.d(16);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int j = qal.d(32);
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
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
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
      String str1 = this.d;
      paramqal.c(34);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mmr
 * JD-Core Version:    0.7.0.1
 */