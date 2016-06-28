import java.nio.ByteBuffer;

public final class npd
  extends qan<npd>
{
  private mmw a = null;
  private Boolean b = null;
  
  public npd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mmw localmmw = this.a;
      int j = qal.d(8);
      int k = localmmw.a();
      localmmw.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i += 1 + qal.d(16);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mmw localmmw = this.a;
      paramqal.c(10);
      if (localmmw.ak < 0) {
        localmmw.ak = localmmw.a();
      }
      paramqal.c(localmmw.ak);
      localmmw.a(paramqal);
    }
    if (this.b != null)
    {
      boolean bool = this.b.booleanValue();
      paramqal.c(16);
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
 * Qualified Name:     npd
 * JD-Core Version:    0.7.0.1
 */