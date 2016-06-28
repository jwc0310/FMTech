import java.nio.ByteBuffer;

public final class mlg
  extends qan<mlg>
{
  private static volatile mlg[] d;
  public Boolean a = null;
  public Integer b = null;
  public mlf c = null;
  private Double e = null;
  private String f = null;
  private mli g = null;
  
  public mlg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mlg[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new mlg[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      this.a.booleanValue();
      i += 1 + qal.d(8);
    }
    int i3;
    int i4;
    if (this.b != null)
    {
      i3 = this.b.intValue();
      i4 = qal.d(16);
      if (i3 < 0) {
        break label233;
      }
    }
    label233:
    for (int i5 = qal.d(i3);; i5 = 10)
    {
      i += i5 + i4;
      if (this.e != null)
      {
        this.e.doubleValue();
        i += 8 + qal.d(24);
      }
      if (this.f != null)
      {
        String str = this.f;
        int i1 = qal.d(32);
        int i2 = qal.a(str);
        i += i1 + (i2 + qal.d(i2));
      }
      if (this.g != null)
      {
        mli localmli = this.g;
        int m = qal.d(40);
        int n = localmli.a();
        localmli.ak = n;
        i += m + (n + qal.d(n));
      }
      if (this.c != null)
      {
        mlf localmlf = this.c;
        int j = qal.d(48);
        int k = localmlf.a();
        localmlf.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      boolean bool = this.a.booleanValue();
      paramqal.c(8);
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
    if (this.b != null)
    {
      int i = this.b.intValue();
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.e != null)
    {
      double d1 = this.e.doubleValue();
      paramqal.c(25);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.f != null)
    {
      String str = this.f;
      paramqal.c(34);
      paramqal.a(str);
    }
    if (this.g != null)
    {
      mli localmli = this.g;
      paramqal.c(42);
      if (localmli.ak < 0) {
        localmli.ak = localmli.a();
      }
      paramqal.c(localmli.ak);
      localmli.a(paramqal);
    }
    if (this.c != null)
    {
      mlf localmlf = this.c;
      paramqal.c(50);
      if (localmlf.ak < 0) {
        localmlf.ak = localmlf.a();
      }
      paramqal.c(localmlf.ak);
      localmlf.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlg
 * JD-Core Version:    0.7.0.1
 */