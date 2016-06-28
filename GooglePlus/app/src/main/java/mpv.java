import java.nio.ByteBuffer;

public final class mpv
  extends qan<mpv>
{
  public Boolean a = null;
  public rjp b = null;
  public String c = null;
  public String d = null;
  
  public mpv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      this.a.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.b != null)
    {
      rjp localrjp = this.b;
      int i1 = qal.d(24);
      int i2 = localrjp.a();
      localrjp.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int m = qal.d(32);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int j = qal.d(40);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
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
    if (this.b != null)
    {
      rjp localrjp = this.b;
      paramqal.c(26);
      if (localrjp.ak < 0) {
        localrjp.ak = localrjp.a();
      }
      paramqal.c(localrjp.ak);
      localrjp.a(paramqal);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpv
 * JD-Core Version:    0.7.0.1
 */