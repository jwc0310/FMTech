import java.nio.ByteBuffer;

public final class nrl
  extends qan<nrl>
{
  public Boolean a = null;
  public oks b = null;
  
  public nrl()
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
      oks localoks = this.b;
      int j = qal.d(16);
      int k = localoks.a();
      localoks.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      boolean bool = this.a.booleanValue();
      paramqal.c(8);
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
    if (this.b != null)
    {
      oks localoks = this.b;
      paramqal.c(18);
      if (localoks.ak < 0) {
        localoks.ak = localoks.a();
      }
      paramqal.c(localoks.ak);
      localoks.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nrl
 * JD-Core Version:    0.7.0.1
 */