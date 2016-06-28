import java.nio.ByteBuffer;

public final class occ
  extends qan<occ>
{
  private int a = -2147483648;
  private Boolean b = null;
  private oce c = null;
  private oce d = null;
  
  public occ()
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
        this.b.booleanValue();
        j += 1 + qal.d(16);
      }
      if (this.c != null)
      {
        oce localoce2 = this.c;
        int n = qal.d(24);
        int i1 = localoce2.a();
        localoce2.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.d != null)
      {
        oce localoce1 = this.d;
        int k = qal.d(32);
        int m = localoce1.a();
        localoce1.ak = m;
        j += k + (m + qal.d(m));
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
      boolean bool = this.b.booleanValue();
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
    if (this.c != null)
    {
      oce localoce2 = this.c;
      paramqal.c(26);
      if (localoce2.ak < 0) {
        localoce2.ak = localoce2.a();
      }
      paramqal.c(localoce2.ak);
      localoce2.a(paramqal);
    }
    if (this.d != null)
    {
      oce localoce1 = this.d;
      paramqal.c(34);
      if (localoce1.ak < 0) {
        localoce1.ak = localoce1.a();
      }
      paramqal.c(localoce1.ak);
      localoce1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     occ
 * JD-Core Version:    0.7.0.1
 */