import java.nio.ByteBuffer;

public final class njy
  extends qan<njy>
{
  private static volatile njy[] a;
  private Long b = null;
  private Long c = null;
  private Boolean d = null;
  private Integer e = null;
  private String f = null;
  
  public njy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static njy[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new njy[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      i += qal.d(8) + qal.b(l2);
    }
    if (this.c != null)
    {
      long l1 = this.c.longValue();
      i += qal.d(16) + qal.b(l1);
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(24);
    }
    int m;
    int n;
    if (this.e != null)
    {
      m = this.e.intValue();
      n = qal.d(32);
      if (m < 0) {
        break label172;
      }
    }
    label172:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.f != null)
      {
        String str = this.f;
        int j = qal.d(40);
        int k = qal.a(str);
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      paramqal.c(8);
      paramqal.a(l2);
    }
    if (this.c != null)
    {
      long l1 = this.c.longValue();
      paramqal.c(16);
      paramqal.a(l1);
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
    if (this.f != null)
    {
      String str = this.f;
      paramqal.c(42);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     njy
 * JD-Core Version:    0.7.0.1
 */