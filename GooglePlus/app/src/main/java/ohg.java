import java.nio.ByteBuffer;

public final class ohg
  extends qan<ohg>
{
  public String[] a = qay.f;
  public mmw b = null;
  public Boolean c = null;
  private opu d = null;
  
  public ohg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i3;
    int i4;
    if ((this.a != null) && (this.a.length > 0))
    {
      i3 = 0;
      i4 = 0;
      while (i < this.a.length)
      {
        String str = this.a[i];
        if (str != null)
        {
          i4++;
          int i5 = qal.a(str);
          i3 += i5 + qal.d(i5);
        }
        i++;
      }
    }
    for (int k = j + i3 + i4 * 1;; k = j)
    {
      if (this.b != null)
      {
        mmw localmmw = this.b;
        int i1 = qal.d(16);
        int i2 = localmmw.a();
        localmmw.ak = i2;
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.c != null)
      {
        this.c.booleanValue();
        k += 1 + qal.d(24);
      }
      if (this.d != null)
      {
        opu localopu = this.d;
        int m = qal.d(32);
        int n = localopu.a();
        localopu.ak = n;
        k += m + (n + qal.d(n));
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        String str = this.a[j];
        if (str != null)
        {
          paramqal.c(10);
          paramqal.a(str);
        }
      }
    }
    if (this.b != null)
    {
      mmw localmmw = this.b;
      paramqal.c(18);
      if (localmmw.ak < 0) {
        localmmw.ak = localmmw.a();
      }
      paramqal.c(localmmw.ak);
      localmmw.a(paramqal);
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
      paramqal.c(24);
      int i = 0;
      if (bool) {
        i = 1;
      }
      byte b1 = (byte)i;
      if (!paramqal.a.hasRemaining()) {
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.d != null)
    {
      opu localopu = this.d;
      paramqal.c(34);
      if (localopu.ak < 0) {
        localopu.ak = localopu.a();
      }
      paramqal.c(localopu.ak);
      localopu.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohg
 * JD-Core Version:    0.7.0.1
 */