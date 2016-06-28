import java.nio.ByteBuffer;

public final class ofc
  extends qan<ofc>
{
  public oed a = null;
  private Boolean b = null;
  
  public ofc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      this.b.booleanValue();
      i += 1 + qal.d(8);
    }
    if (this.a != null)
    {
      oed localoed = this.a;
      int j = qal.d(16);
      int k = localoed.a();
      localoed.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      boolean bool = this.b.booleanValue();
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
    if (this.a != null)
    {
      oed localoed = this.a;
      paramqal.c(18);
      if (localoed.ak < 0) {
        localoed.ak = localoed.a();
      }
      paramqal.c(localoed.ak);
      localoed.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ofc
 * JD-Core Version:    0.7.0.1
 */