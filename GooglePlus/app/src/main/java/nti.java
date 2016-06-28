import java.nio.ByteBuffer;

public final class nti
  extends qan<nti>
{
  public okn a = null;
  private ojf b = null;
  private Boolean c = null;
  
  public nti()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      ojf localojf = this.b;
      int m = qal.d(8);
      int n = localojf.a();
      localojf.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.a != null)
    {
      okn localokn = this.a;
      int j = qal.d(24);
      int k = localokn.a();
      localokn.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      ojf localojf = this.b;
      paramqal.c(10);
      if (localojf.ak < 0) {
        localojf.ak = localojf.a();
      }
      paramqal.c(localojf.ak);
      localojf.a(paramqal);
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
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
    if (this.a != null)
    {
      okn localokn = this.a;
      paramqal.c(26);
      if (localokn.ak < 0) {
        localokn.ak = localokn.a();
      }
      paramqal.c(localokn.ak);
      localokn.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nti
 * JD-Core Version:    0.7.0.1
 */