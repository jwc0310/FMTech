import java.nio.ByteBuffer;

public final class olj
  extends qan<olj>
{
  private static volatile olj[] a;
  private int b = -2147483648;
  private String c = null;
  private Boolean d = null;
  private Integer e = null;
  
  public olj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static olj[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new olj[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i4;
    int i5;
    if (this.b != -2147483648)
    {
      int i3 = this.b;
      i4 = qal.d(8);
      if (i3 >= 0) {
        i5 = qal.d(i3);
      }
    }
    for (int k = j + (i5 + i4);; k = j)
    {
      if (this.c != null)
      {
        String str = this.c;
        int i1 = qal.d(16);
        int i2 = qal.a(str);
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        k += 1 + qal.d(24);
      }
      if (this.e != null)
      {
        int m = this.e.intValue();
        int n = qal.d(32);
        if (m >= 0) {
          i = qal.d(m);
        }
        k += i + n;
      }
      return k;
      i5 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int k = this.b;
      paramqal.c(8);
      paramqal.a(k);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(24);
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
    if (this.e != null)
    {
      int i = this.e.intValue();
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olj
 * JD-Core Version:    0.7.0.1
 */