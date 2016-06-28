import java.nio.ByteBuffer;

public final class ntz
  extends qan<ntz>
{
  public Boolean a = null;
  private oir b = null;
  
  public ntz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    this.a.booleanValue();
    int j = i + (1 + qal.d(8));
    if (this.b != null)
    {
      oir localoir = this.b;
      int k = qal.d(16);
      int m = localoir.a();
      localoir.ak = m;
      j += k + (m + qal.d(m));
    }
    return j;
  }
  
  public final void a(qal paramqal)
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
    if (this.b != null)
    {
      oir localoir = this.b;
      paramqal.c(18);
      if (localoir.ak < 0) {
        localoir.ak = localoir.a();
      }
      paramqal.c(localoir.ak);
      localoir.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ntz
 * JD-Core Version:    0.7.0.1
 */