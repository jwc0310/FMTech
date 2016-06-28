import java.nio.ByteBuffer;

public final class nrx
  extends qan<nrx>
{
  private int a = -2147483648;
  private oib b = null;
  private nry c = null;
  private Boolean d = null;
  
  public nrx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i3;
    int i4;
    if (this.a != -2147483648)
    {
      int i2 = this.a;
      i3 = qal.d(8);
      if (i2 >= 0) {
        i4 = qal.d(i2);
      }
    }
    for (int j = i + (i4 + i3);; j = i)
    {
      if (this.b != null)
      {
        oib localoib = this.b;
        int n = qal.d(16);
        int i1 = localoib.a();
        localoib.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.c != null)
      {
        nry localnry = this.c;
        int k = qal.d(24);
        int m = localnry.a();
        localnry.ak = m;
        j += k + (m + qal.d(m));
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        j += 1 + qal.d(32);
      }
      return j;
      i4 = 10;
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
      oib localoib = this.b;
      paramqal.c(18);
      if (localoib.ak < 0) {
        localoib.ak = localoib.a();
      }
      paramqal.c(localoib.ak);
      localoib.a(paramqal);
    }
    if (this.c != null)
    {
      nry localnry = this.c;
      paramqal.c(26);
      if (localnry.ak < 0) {
        localnry.ak = localnry.a();
      }
      paramqal.c(localnry.ak);
      localnry.a(paramqal);
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
 * Qualified Name:     nrx
 * JD-Core Version:    0.7.0.1
 */