import java.nio.ByteBuffer;

public final class nxz
  extends qan<nxz>
{
  private static volatile nxz[] d;
  public int a = -2147483648;
  public nxu[] b = nxu.b();
  public Boolean c = null;
  
  public nxz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nxz[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new nxz[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int j = this.a;
    int k = qal.d(8);
    if (j >= 0) {}
    int i1;
    for (int m = qal.d(j);; m = 10)
    {
      n = i + (m + k);
      if ((this.b == null) || (this.b.length <= 0)) {
        break label134;
      }
      i1 = n;
      for (int i2 = 0; i2 < this.b.length; i2++)
      {
        nxu localnxu = this.b[i2];
        if (localnxu != null)
        {
          int i3 = qal.d(16);
          int i4 = localnxu.a();
          localnxu.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
    }
    int n = i1;
    label134:
    if (this.c != null)
    {
      this.c.booleanValue();
      n += 1 + qal.d(24);
    }
    return n;
  }
  
  public final void a(qal paramqal)
  {
    int i = this.a;
    paramqal.c(8);
    paramqal.a(i);
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        nxu localnxu = this.b[k];
        if (localnxu != null)
        {
          paramqal.c(18);
          if (localnxu.ak < 0) {
            localnxu.ak = localnxu.a();
          }
          paramqal.c(localnxu.ak);
          localnxu.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
      paramqal.c(24);
      int j = 0;
      if (bool) {
        j = 1;
      }
      byte b1 = (byte)j;
      if (!paramqal.a.hasRemaining()) {
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxz
 * JD-Core Version:    0.7.0.1
 */