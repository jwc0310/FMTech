import java.nio.ByteBuffer;

public final class nvt
  extends qan<nvt>
{
  public nvl a = null;
  public nvl b = null;
  public Boolean c = null;
  
  public nvt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nvl localnvl2 = this.a;
      int m = qal.d(8);
      int n = localnvl2.a();
      localnvl2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      nvl localnvl1 = this.b;
      int j = qal.d(16);
      int k = localnvl1.a();
      localnvl1.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nvl localnvl2 = this.a;
      paramqal.c(10);
      if (localnvl2.ak < 0) {
        localnvl2.ak = localnvl2.a();
      }
      paramqal.c(localnvl2.ak);
      localnvl2.a(paramqal);
    }
    if (this.b != null)
    {
      nvl localnvl1 = this.b;
      paramqal.c(18);
      if (localnvl1.ak < 0) {
        localnvl1.ak = localnvl1.a();
      }
      paramqal.c(localnvl1.ak);
      localnvl1.a(paramqal);
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
      paramqal.c(24);
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
 * Qualified Name:     nvt
 * JD-Core Version:    0.7.0.1
 */