import java.nio.ByteBuffer;

public final class nww
  extends qan<nww>
{
  private Long a = null;
  private Long b = null;
  private Boolean c = null;
  
  public nww()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      long l2 = this.a.longValue();
      i += qal.d(8) + qal.b(l2);
    }
    if (this.b != null)
    {
      long l1 = this.b.longValue();
      i += qal.d(16) + qal.b(l1);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      long l2 = this.a.longValue();
      paramqal.c(8);
      paramqal.a(l2);
    }
    if (this.b != null)
    {
      long l1 = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l1);
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
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
 * Qualified Name:     nww
 * JD-Core Version:    0.7.0.1
 */