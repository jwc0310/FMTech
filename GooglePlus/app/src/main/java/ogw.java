import java.nio.ByteBuffer;

public final class ogw
  extends qan<ogw>
{
  public String a = null;
  public Boolean b = null;
  private Integer c = null;
  
  public ogw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    String str = this.a;
    int j = qal.d(8);
    int k = qal.a(str);
    int m = i + (j + (k + qal.d(k)));
    if (this.b != null)
    {
      this.b.booleanValue();
      m += 1 + qal.d(16);
    }
    int n;
    int i1;
    if (this.c != null)
    {
      n = this.c.intValue();
      i1 = qal.d(24);
      if (n < 0) {
        break label111;
      }
    }
    label111:
    for (int i2 = qal.d(n);; i2 = 10)
    {
      m += i2 + i1;
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    String str = this.a;
    paramqal.c(10);
    paramqal.a(str);
    if (this.b != null)
    {
      boolean bool = this.b.booleanValue();
      paramqal.c(16);
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
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(24);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogw
 * JD-Core Version:    0.7.0.1
 */