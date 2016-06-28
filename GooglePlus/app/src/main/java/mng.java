import java.nio.ByteBuffer;

public final class mng
  extends qan<mng>
{
  private static volatile mng[] a;
  private String b = null;
  private int c = -2147483648;
  private Boolean d = null;
  
  public mng()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mng[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mng[0];
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
    int j;
    int k;
    if (this.c != -2147483648)
    {
      j = this.c;
      k = qal.d(16);
      if (j < 0) {
        break label112;
      }
    }
    label112:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      if (this.d != null)
      {
        this.d.booleanValue();
        i += 1 + qal.d(24);
      }
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
    if (this.c != -2147483648)
    {
      int j = this.c;
      paramqal.c(16);
      paramqal.a(j);
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
 * Qualified Name:     mng
 * JD-Core Version:    0.7.0.1
 */