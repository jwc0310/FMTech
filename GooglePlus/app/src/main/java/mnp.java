import java.nio.ByteBuffer;

public final class mnp
  extends qan<mnp>
{
  private Boolean a = null;
  private mns b = null;
  private Boolean c = null;
  private mnq d = null;
  
  public mnp()
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
      mns localmns = this.b;
      int m = qal.d(16);
      int n = localmns.a();
      localmns.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
    }
    if (this.d != null)
    {
      mnq localmnq = this.d;
      int j = qal.d(32);
      int k = localmnq.a();
      localmnq.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      boolean bool2 = this.a.booleanValue();
      paramqal.c(8);
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
    if (this.b != null)
    {
      mns localmns = this.b;
      paramqal.c(18);
      if (localmns.ak < 0) {
        localmns.ak = localmns.a();
      }
      paramqal.c(localmns.ak);
      localmns.a(paramqal);
    }
    if (this.c != null)
    {
      boolean bool1 = this.c.booleanValue();
      paramqal.c(24);
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
    if (this.d != null)
    {
      mnq localmnq = this.d;
      paramqal.c(34);
      if (localmnq.ak < 0) {
        localmnq.ak = localmnq.a();
      }
      paramqal.c(localmnq.ak);
      localmnq.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mnp
 * JD-Core Version:    0.7.0.1
 */