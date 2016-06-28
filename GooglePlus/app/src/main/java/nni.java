import java.nio.ByteBuffer;

public final class nni
  extends qan<nni>
{
  private static volatile nni[] c;
  public int a = -2147483648;
  public Boolean b = null;
  private Boolean d = null;
  private Boolean e = null;
  
  public nni()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nni[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new nni[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int m;
    int n;
    if (this.a != -2147483648)
    {
      int k = this.a;
      m = qal.d(8);
      if (k >= 0) {
        n = qal.d(k);
      }
    }
    for (int j = i + (n + m);; j = i)
    {
      if (this.b != null)
      {
        this.b.booleanValue();
        j += 1 + qal.d(16);
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        j += 1 + qal.d(24);
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        j += 1 + qal.d(32);
      }
      return j;
      n = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != -2147483648)
    {
      int m = this.a;
      paramqal.c(8);
      paramqal.a(m);
    }
    if (this.b != null)
    {
      boolean bool3 = this.b.booleanValue();
      paramqal.c(16);
      if (bool3) {}
      byte b3;
      for (int k = i;; k = 0)
      {
        b3 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.d != null)
    {
      boolean bool2 = this.d.booleanValue();
      paramqal.c(24);
      if (bool2) {}
      byte b2;
      for (int j = i;; j = 0)
      {
        b2 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.e != null)
    {
      boolean bool1 = this.e.booleanValue();
      paramqal.c(32);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nni
 * JD-Core Version:    0.7.0.1
 */