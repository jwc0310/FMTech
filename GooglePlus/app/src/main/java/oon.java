import java.nio.ByteBuffer;

public final class oon
  extends qan<oon>
{
  public omz a = null;
  public omz b = null;
  public omz c = null;
  private Boolean d = null;
  
  public oon()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      omz localomz3 = this.a;
      int i1 = qal.d(8);
      int i2 = localomz3.a();
      localomz3.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      omz localomz2 = this.b;
      int m = qal.d(16);
      int n = localomz2.a();
      localomz2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      omz localomz1 = this.c;
      int j = qal.d(24);
      int k = localomz1.a();
      localomz1.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(32);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      omz localomz3 = this.a;
      paramqal.c(10);
      if (localomz3.ak < 0) {
        localomz3.ak = localomz3.a();
      }
      paramqal.c(localomz3.ak);
      localomz3.a(paramqal);
    }
    if (this.b != null)
    {
      omz localomz2 = this.b;
      paramqal.c(18);
      if (localomz2.ak < 0) {
        localomz2.ak = localomz2.a();
      }
      paramqal.c(localomz2.ak);
      localomz2.a(paramqal);
    }
    if (this.c != null)
    {
      omz localomz1 = this.c;
      paramqal.c(26);
      if (localomz1.ak < 0) {
        localomz1.ak = localomz1.a();
      }
      paramqal.c(localomz1.ak);
      localomz1.a(paramqal);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(32);
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
 * Qualified Name:     oon
 * JD-Core Version:    0.7.0.1
 */