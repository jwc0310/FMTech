import java.nio.ByteBuffer;

public final class nth
  extends qan<nth>
{
  public Boolean a = null;
  
  public nth()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    this.a.booleanValue();
    return i + (1 + qal.d(8));
  }
  
  public final void a(qal paramqal)
  {
    boolean bool = this.a.booleanValue();
    paramqal.c(8);
    if (bool) {}
    byte b;
    for (int i = 1;; i = 0)
    {
      b = (byte)i;
      if (paramqal.a.hasRemaining()) {
        break;
      }
      throw new qam(paramqal.a.position(), paramqal.a.limit());
    }
    paramqal.a.put(b);
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nth
 * JD-Core Version:    0.7.0.1
 */