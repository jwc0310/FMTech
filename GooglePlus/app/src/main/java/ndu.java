import java.nio.ByteBuffer;

public final class ndu
  extends qan<ndu>
{
  public Boolean a = null;
  public Boolean b = null;
  public Boolean c = null;
  public Boolean d = null;
  
  public ndu()
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
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
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
      boolean bool4 = this.a.booleanValue();
      paramqal.c(8);
      if (bool4) {}
      byte b4;
      for (int m = i;; m = 0)
      {
        b4 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
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
    if (this.c != null)
    {
      boolean bool2 = this.c.booleanValue();
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
 * Qualified Name:     ndu
 * JD-Core Version:    0.7.0.1
 */