import java.nio.ByteBuffer;

public final class nnk
  extends qan<nnk>
{
  public int a = -2147483648;
  public Boolean b = null;
  public Long c = null;
  
  public nnk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int m;
    int n;
    if (this.a != -2147483648)
    {
      int k = this.a;
      m = qal.d(8);
      if (k >= 0) {
        n = qal.d(k);
      }
    }
    for (int j = i + (n + m);; j = i)
    {
      if (this.b != null)
      {
        this.b.booleanValue();
        j += 1 + qal.d(16);
      }
      if (this.c != null)
      {
        long l = this.c.longValue();
        j += qal.d(24) + qal.b(l);
      }
      return j;
      n = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int j = this.a;
      paramqal.c(8);
      paramqal.a(j);
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
    if (this.c != null)
    {
      long l = this.c.longValue();
      paramqal.c(24);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nnk
 * JD-Core Version:    0.7.0.1
 */