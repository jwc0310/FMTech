import java.nio.ByteBuffer;

public final class oak
  extends qan<oak>
{
  public Boolean a = null;
  public qoh b = null;
  public oal c = null;
  public Boolean d = null;
  
  public oak()
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
      i += 1 + qal.d(8);
    }
    if (this.b != null)
    {
      qoh localqoh = this.b;
      int m = qal.d(16);
      int n = localqoh.a();
      localqoh.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      oal localoal = this.c;
      int j = qal.d(24);
      int k = localoal.a();
      localoal.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(32);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      boolean bool2 = this.a.booleanValue();
      paramqal.c(8);
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
    if (this.b != null)
    {
      qoh localqoh = this.b;
      paramqal.c(18);
      if (localqoh.ak < 0) {
        localqoh.ak = localqoh.a();
      }
      paramqal.c(localqoh.ak);
      localqoh.a(paramqal);
    }
    if (this.c != null)
    {
      oal localoal = this.c;
      paramqal.c(26);
      if (localoal.ak < 0) {
        localoal.ak = localoal.a();
      }
      paramqal.c(localoal.ak);
      localoal.a(paramqal);
    }
    if (this.d != null)
    {
      boolean bool1 = this.d.booleanValue();
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
 * Qualified Name:     oak
 * JD-Core Version:    0.7.0.1
 */