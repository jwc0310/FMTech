import java.nio.ByteBuffer;

public final class ool
  extends qan<ool>
{
  private opo[] a = opo.c;
  private Integer b = null;
  private Boolean c = null;
  
  public ool()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i1 = 0; i1 < this.a.length; i1++)
      {
        opo localopo = this.a[i1];
        if (localopo != null)
        {
          int i2 = qal.d(8);
          int i3 = localopo.a();
          localopo.ak = i3;
          i += i2 + (i3 + qal.d(i3));
        }
      }
    }
    int j = this.b.intValue();
    int k = qal.d(16);
    if (j >= 0) {}
    for (int m = qal.d(j);; m = 10)
    {
      int n = i + (m + k);
      if (this.c != null)
      {
        this.c.booleanValue();
        n += 1 + qal.d(24);
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int k = 0; k < this.a.length; k++)
      {
        opo localopo = this.a[k];
        if (localopo != null)
        {
          paramqal.c(10);
          if (localopo.ak < 0) {
            localopo.ak = localopo.a();
          }
          paramqal.c(localopo.ak);
          localopo.a(paramqal);
        }
      }
    }
    int i = this.b.intValue();
    paramqal.c(16);
    paramqal.a(i);
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
 * Qualified Name:     ool
 * JD-Core Version:    0.7.0.1
 */