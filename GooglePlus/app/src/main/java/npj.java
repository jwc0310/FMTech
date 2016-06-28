import java.nio.ByteBuffer;

public final class npj
  extends qan<npj>
{
  public oml a = null;
  private Boolean b = null;
  
  public npj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oml localoml = this.a;
      int j = qal.d(8);
      int k = localoml.a();
      localoml.ak = k;
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
      oml localoml = this.a;
      paramqal.c(10);
      if (localoml.ak < 0) {
        localoml.ak = localoml.a();
      }
      paramqal.c(localoml.ak);
      localoml.a(paramqal);
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
 * Qualified Name:     npj
 * JD-Core Version:    0.7.0.1
 */