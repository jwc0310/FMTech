import java.nio.ByteBuffer;

public final class nsd
  extends qan<nsd>
{
  public oik a = null;
  public int b = -2147483648;
  public nsl c = null;
  private Boolean d = null;
  private Boolean e = null;
  
  public nsd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oik localoik = this.a;
      int i2 = qal.d(8);
      int i3 = localoik.a();
      localoik.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.b != -2147483648)
    {
      m = this.b;
      n = qal.d(16);
      if (m < 0) {
        break label195;
      }
    }
    label195:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.c != null)
      {
        nsl localnsl = this.c;
        int j = qal.d(24);
        int k = localnsl.a();
        localnsl.ak = k;
        i += j + (k + qal.d(k));
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        i += 1 + qal.d(32);
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        i += 1 + qal.d(40);
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      oik localoik = this.a;
      paramqal.c(10);
      if (localoik.ak < 0) {
        localoik.ak = localoik.a();
      }
      paramqal.c(localoik.ak);
      localoik.a(paramqal);
    }
    if (this.b != -2147483648)
    {
      int k = this.b;
      paramqal.c(16);
      paramqal.a(k);
    }
    if (this.c != null)
    {
      nsl localnsl = this.c;
      paramqal.c(26);
      if (localnsl.ak < 0) {
        localnsl.ak = localnsl.a();
      }
      paramqal.c(localnsl.ak);
      localnsl.a(paramqal);
    }
    if (this.d != null)
    {
      boolean bool2 = this.d.booleanValue();
      paramqal.c(32);
      if (bool2) {}
      byte b2;
      for (int j = i;; j = 0)
      {
        b2 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.e != null)
    {
      boolean bool1 = this.e.booleanValue();
      paramqal.c(40);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsd
 * JD-Core Version:    0.7.0.1
 */