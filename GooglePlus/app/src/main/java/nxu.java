import java.nio.ByteBuffer;

public final class nxu
  extends qan<nxu>
{
  private static volatile nxu[] c;
  public nxt a = null;
  public nxt b = null;
  private Boolean d = null;
  
  public nxu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nxu[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new nxu[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nxt localnxt2 = this.a;
      int m = qal.d(8);
      int n = localnxt2.a();
      localnxt2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      nxt localnxt1 = this.b;
      int j = qal.d(16);
      int k = localnxt1.a();
      localnxt1.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(24);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nxt localnxt2 = this.a;
      paramqal.c(10);
      if (localnxt2.ak < 0) {
        localnxt2.ak = localnxt2.a();
      }
      paramqal.c(localnxt2.ak);
      localnxt2.a(paramqal);
    }
    if (this.b != null)
    {
      nxt localnxt1 = this.b;
      paramqal.c(18);
      if (localnxt1.ak < 0) {
        localnxt1.ak = localnxt1.a();
      }
      paramqal.c(localnxt1.ak);
      localnxt1.a(paramqal);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxu
 * JD-Core Version:    0.7.0.1
 */