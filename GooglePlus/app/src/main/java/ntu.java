import java.nio.ByteBuffer;

public final class ntu
  extends qan<ntu>
{
  public Boolean a = null;
  public oih b = null;
  public ojf c = null;
  private okn d = null;
  private pss e = null;
  
  public ntu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      this.a.booleanValue();
      i += 1 + qal.d(8);
    }
    if (this.b != null)
    {
      oih localoih = this.b;
      int i3 = qal.d(16);
      int i4 = localoih.a();
      localoih.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      ojf localojf = this.c;
      int i1 = qal.d(24);
      int i2 = localojf.a();
      localojf.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      okn localokn = this.d;
      int m = qal.d(32);
      int n = localokn.a();
      localokn.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      pss localpss = this.e;
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
      boolean bool = this.a.booleanValue();
      paramqal.c(8);
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
    if (this.b != null)
    {
      oih localoih = this.b;
      paramqal.c(18);
      if (localoih.ak < 0) {
        localoih.ak = localoih.a();
      }
      paramqal.c(localoih.ak);
      localoih.a(paramqal);
    }
    if (this.c != null)
    {
      ojf localojf = this.c;
      paramqal.c(26);
      if (localojf.ak < 0) {
        localojf.ak = localojf.a();
      }
      paramqal.c(localojf.ak);
      localojf.a(paramqal);
    }
    if (this.d != null)
    {
      okn localokn = this.d;
      paramqal.c(34);
      if (localokn.ak < 0) {
        localokn.ak = localokn.a();
      }
      paramqal.c(localokn.ak);
      localokn.a(paramqal);
    }
    if (this.e != null)
    {
      pss localpss = this.e;
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
 * Qualified Name:     ntu
 * JD-Core Version:    0.7.0.1
 */