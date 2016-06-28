import java.nio.ByteBuffer;

public final class opn
  extends qan<opn>
{
  public Boolean a = null;
  private String b = null;
  private String c = null;
  
  public opn()
  {
    this.aj = null;
    this.ak = -1;
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
    if (this.a != null)
    {
      this.a.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.c != null)
    {
      String str1 = this.c;
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
    if (this.a != null)
    {
      boolean bool = this.a.booleanValue();
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
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(26);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     opn
 * JD-Core Version:    0.7.0.1
 */