import java.nio.ByteBuffer;

public final class obh
  extends qan<obh>
{
  private static volatile obh[] a;
  private String b = null;
  private Boolean c = null;
  private int d = -2147483648;
  
  public obh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static obh[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new obh[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str = this.b;
      int n = qal.d(8);
      int i1 = qal.a(str);
      i += n + (i1 + qal.d(i1));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(16);
    }
    int j;
    int k;
    if (this.d != -2147483648)
    {
      j = this.d;
      k = qal.d(24);
      if (j < 0) {
        break label110;
      }
    }
    label110:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
      paramqal.c(16);
      if (bool) {}
      byte b1;
      for (int j = 1;; j = 0)
      {
        b1 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.d != -2147483648)
    {
      int i = this.d;
      paramqal.c(24);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     obh
 * JD-Core Version:    0.7.0.1
 */