import java.nio.ByteBuffer;

public final class omb
  extends qan<omb>
{
  private Boolean a = null;
  private oky b = null;
  private oky c = null;
  private oky d = null;
  private olv e = null;
  
  public omb()
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
      i += 1 + qal.d(40);
    }
    if (this.b != null)
    {
      oky localoky3 = this.b;
      int i3 = qal.d(48);
      int i4 = localoky3.a();
      localoky3.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      oky localoky2 = this.c;
      int i1 = qal.d(56);
      int i2 = localoky2.a();
      localoky2.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      oky localoky1 = this.d;
      int m = qal.d(64);
      int n = localoky1.a();
      localoky1.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      olv localolv = this.e;
      int j = qal.d(72);
      int k = localolv.a();
      localolv.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      boolean bool = this.a.booleanValue();
      paramqal.c(40);
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
      oky localoky3 = this.b;
      paramqal.c(50);
      if (localoky3.ak < 0) {
        localoky3.ak = localoky3.a();
      }
      paramqal.c(localoky3.ak);
      localoky3.a(paramqal);
    }
    if (this.c != null)
    {
      oky localoky2 = this.c;
      paramqal.c(58);
      if (localoky2.ak < 0) {
        localoky2.ak = localoky2.a();
      }
      paramqal.c(localoky2.ak);
      localoky2.a(paramqal);
    }
    if (this.d != null)
    {
      oky localoky1 = this.d;
      paramqal.c(66);
      if (localoky1.ak < 0) {
        localoky1.ak = localoky1.a();
      }
      paramqal.c(localoky1.ak);
      localoky1.a(paramqal);
    }
    if (this.e != null)
    {
      olv localolv = this.e;
      paramqal.c(74);
      if (localolv.ak < 0) {
        localolv.ak = localolv.a();
      }
      paramqal.c(localolv.ak);
      localolv.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omb
 * JD-Core Version:    0.7.0.1
 */