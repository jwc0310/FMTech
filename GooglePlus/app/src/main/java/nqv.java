import java.nio.ByteBuffer;

public final class nqv
  extends qan<nqv>
{
  public ojf a = null;
  public ojo b = null;
  public pss c = null;
  private Boolean d = null;
  private nrq e = null;
  
  public nqv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ojf localojf = this.a;
      int i3 = qal.d(8);
      int i4 = localojf.a();
      localojf.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.e != null)
    {
      nrq localnrq = this.e;
      int i1 = qal.d(24);
      int i2 = localnrq.a();
      localnrq.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      ojo localojo = this.b;
      int m = qal.d(32);
      int n = localojo.a();
      localojo.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      pss localpss = this.c;
      int j = qal.d(40);
      int k = localpss.a();
      localpss.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ojf localojf = this.a;
      paramqal.c(10);
      if (localojf.ak < 0) {
        localojf.ak = localojf.a();
      }
      paramqal.c(localojf.ak);
      localojf.a(paramqal);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
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
    if (this.e != null)
    {
      nrq localnrq = this.e;
      paramqal.c(26);
      if (localnrq.ak < 0) {
        localnrq.ak = localnrq.a();
      }
      paramqal.c(localnrq.ak);
      localnrq.a(paramqal);
    }
    if (this.b != null)
    {
      ojo localojo = this.b;
      paramqal.c(34);
      if (localojo.ak < 0) {
        localojo.ak = localojo.a();
      }
      paramqal.c(localojo.ak);
      localojo.a(paramqal);
    }
    if (this.c != null)
    {
      pss localpss = this.c;
      paramqal.c(42);
      if (localpss.ak < 0) {
        localpss.ak = localpss.a();
      }
      paramqal.c(localpss.ak);
      localpss.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqv
 * JD-Core Version:    0.7.0.1
 */