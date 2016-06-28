import java.nio.ByteBuffer;

public final class nhe
  extends qan<nhe>
{
  public int a = -2147483648;
  private Boolean b = null;
  
  public nhe()
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
    int j;
    int k;
    if (this.a != -2147483648)
    {
      j = this.a;
      k = qal.d(16);
      if (j < 0) {
        break label69;
      }
    }
    label69:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      boolean bool = this.b.booleanValue();
      paramqal.c(8);
      if (bool) {}
      byte b1;
      for (int j = 1;; j = 0)
      {
        b1 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.a != -2147483648)
    {
      int i = this.a;
      paramqal.c(16);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nhe
 * JD-Core Version:    0.7.0.1
 */