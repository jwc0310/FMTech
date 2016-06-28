import java.nio.ByteBuffer;

public final class oig
  extends qan<oig>
{
  public Boolean a = null;
  public Boolean b = null;
  public int c = -2147483648;
  private Boolean d = null;
  
  public oig()
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
      this.b.booleanValue();
      i += 1 + qal.d(16);
    }
    int j;
    int k;
    if (this.c != -2147483648)
    {
      j = this.c;
      k = qal.d(24);
      if (j < 0) {
        break label121;
      }
    }
    label121:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      if (this.d != null)
      {
        this.d.booleanValue();
        i += 1 + qal.d(32);
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      boolean bool3 = this.a.booleanValue();
      paramqal.c(8);
      if (bool3) {}
      byte b3;
      for (int m = i;; m = 0)
      {
        b3 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.b != null)
    {
      boolean bool2 = this.b.booleanValue();
      paramqal.c(16);
      if (bool2) {}
      byte b2;
      for (int k = i;; k = 0)
      {
        b2 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.c != -2147483648)
    {
      int j = this.c;
      paramqal.c(24);
      paramqal.a(j);
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
 * Qualified Name:     oig
 * JD-Core Version:    0.7.0.1
 */