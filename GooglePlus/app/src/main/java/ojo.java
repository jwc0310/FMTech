import java.nio.ByteBuffer;

public final class ojo
  extends qan<ojo>
{
  public Long a = null;
  public Long b = null;
  public Boolean c = null;
  public Boolean d = null;
  
  public ojo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    long l1 = this.a.longValue();
    int j = i + (qal.d(8) + qal.b(l1));
    long l2 = this.b.longValue();
    int k = j + (qal.d(16) + qal.b(l2));
    this.c.booleanValue();
    int m = k + (1 + qal.d(24));
    if (this.d != null)
    {
      this.d.booleanValue();
      m += 1 + qal.d(32);
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    long l1 = this.a.longValue();
    paramqal.c(8);
    paramqal.a(l1);
    long l2 = this.b.longValue();
    paramqal.c(16);
    paramqal.a(l2);
    boolean bool1 = this.c.booleanValue();
    paramqal.c(24);
    if (bool1) {}
    byte b1;
    for (int j = i;; j = 0)
    {
      b1 = (byte)j;
      if (paramqal.a.hasRemaining()) {
        break;
      }
      throw new qam(paramqal.a.position(), paramqal.a.limit());
    }
    paramqal.a.put(b1);
    if (this.d != null)
    {
      boolean bool2 = this.d.booleanValue();
      paramqal.c(32);
      if (bool2) {}
      byte b2;
      for (;;)
      {
        b2 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i = 0;
      }
      paramqal.a.put(b2);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ojo
 * JD-Core Version:    0.7.0.1
 */