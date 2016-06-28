import java.nio.ByteBuffer;

public final class nxq
  extends qan<nxq>
{
  private static volatile nxq[] d;
  public nwm a = null;
  public nvq b = null;
  public String c = null;
  private Boolean e = null;
  
  public nxq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nxq[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new nxq[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nwm localnwm = this.a;
      int i1 = qal.d(8);
      int i2 = localnwm.a();
      localnwm.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      nvq localnvq = this.b;
      int m = qal.d(16);
      int n = localnvq.a();
      localnvq.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      String str = this.c;
      int j = qal.d(24);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i += 1 + qal.d(32);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nwm localnwm = this.a;
      paramqal.c(10);
      if (localnwm.ak < 0) {
        localnwm.ak = localnwm.a();
      }
      paramqal.c(localnwm.ak);
      localnwm.a(paramqal);
    }
    if (this.b != null)
    {
      nvq localnvq = this.b;
      paramqal.c(18);
      if (localnvq.ak < 0) {
        localnvq.ak = localnvq.a();
      }
      paramqal.c(localnvq.ak);
      localnvq.a(paramqal);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(26);
      paramqal.a(str);
    }
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
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
 * Qualified Name:     nxq
 * JD-Core Version:    0.7.0.1
 */