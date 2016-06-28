import java.nio.ByteBuffer;

public final class neu
  extends qan<neu>
{
  private Boolean a = null;
  private ney b = null;
  
  static
  {
    new qao(11, neu.class, (int)428172042L, false);
  }
  
  public neu()
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
      ney localney = this.b;
      int j = qal.d(16);
      int k = localney.a();
      localney.ak = k;
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
      ney localney = this.b;
      paramqal.c(18);
      if (localney.ak < 0) {
        localney.ak = localney.a();
      }
      paramqal.c(localney.ak);
      localney.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     neu
 * JD-Core Version:    0.7.0.1
 */