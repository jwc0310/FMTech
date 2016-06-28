import java.nio.ByteBuffer;

public final class ocb
  extends qan<ocb>
{
  private String a = null;
  private Boolean b = null;
  private obu c = null;
  private obv d = null;
  
  public ocb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i1 = qal.d(8);
      int i2 = qal.a(str);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.c != null)
    {
      obu localobu = this.c;
      int m = qal.d(24);
      int n = localobu.a();
      localobu.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      obv localobv = this.d;
      int j = qal.d(32);
      int k = localobv.a();
      localobv.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
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
      obu localobu = this.c;
      paramqal.c(26);
      if (localobu.ak < 0) {
        localobu.ak = localobu.a();
      }
      paramqal.c(localobu.ak);
      localobu.a(paramqal);
    }
    if (this.d != null)
    {
      obv localobv = this.d;
      paramqal.c(34);
      if (localobv.ak < 0) {
        localobv.ak = localobv.a();
      }
      paramqal.c(localobv.ak);
      localobv.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ocb
 * JD-Core Version:    0.7.0.1
 */