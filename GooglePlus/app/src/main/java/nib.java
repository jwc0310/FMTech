import java.nio.ByteBuffer;

public final class nib
  extends qan<nib>
{
  public Integer a = null;
  public Integer b = null;
  public Double c = null;
  public String d = null;
  private Boolean e = null;
  
  public nib()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i4;
    int i5;
    if (this.a != null)
    {
      int i3 = this.a.intValue();
      i4 = qal.d(8);
      if (i3 >= 0) {
        i5 = qal.d(i3);
      }
    }
    for (int k = j + (i5 + i4);; k = j)
    {
      if (this.b != null)
      {
        int i1 = this.b.intValue();
        int i2 = qal.d(16);
        if (i1 >= 0) {
          i = qal.d(i1);
        }
        k += i + i2;
      }
      if (this.c != null)
      {
        this.c.doubleValue();
        k += 8 + qal.d(24);
      }
      if (this.d != null)
      {
        String str = this.d;
        int m = qal.d(32);
        int n = qal.a(str);
        k += m + (n + qal.d(n));
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        k += 1 + qal.d(40);
      }
      return k;
      i5 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int k = this.a.intValue();
      paramqal.c(8);
      paramqal.a(k);
    }
    if (this.b != null)
    {
      int j = this.b.intValue();
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      double d1 = this.c.doubleValue();
      paramqal.c(25);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(34);
      paramqal.a(str);
    }
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nib
 * JD-Core Version:    0.7.0.1
 */