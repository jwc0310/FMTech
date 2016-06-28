import java.nio.ByteBuffer;

public final class omy
  extends qan<omy>
{
  private static volatile omy[] f;
  public String a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public Boolean e = null;
  
  public omy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static omy[] b()
  {
    if (f == null) {}
    synchronized (qar.a)
    {
      if (f == null) {
        f = new omy[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str4 = this.a;
      int i3 = qal.d(8);
      int i4 = qal.a(str4);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      String str3 = this.b;
      int i1 = qal.d(16);
      int i2 = qal.a(str3);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int m = qal.d(24);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int j = qal.d(32);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i += 1 + qal.d(40);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str4 = this.a;
      paramqal.c(10);
      paramqal.a(str4);
    }
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
      paramqal.c(40);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omy
 * JD-Core Version:    0.7.0.1
 */