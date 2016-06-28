import java.nio.ByteBuffer;

public final class nrz
  extends qan<nrz>
{
  private Boolean a = null;
  private Integer b = null;
  private Integer c = null;
  private String d = null;
  
  public nrz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.a != null)
    {
      this.a.booleanValue();
      j += 1 + qal.d(8);
    }
    int i2;
    int i3;
    if (this.b != null)
    {
      i2 = this.b.intValue();
      i3 = qal.d(16);
      if (i2 < 0) {
        break label158;
      }
    }
    label158:
    for (int i4 = qal.d(i2);; i4 = i)
    {
      j += i4 + i3;
      if (this.c != null)
      {
        int n = this.c.intValue();
        int i1 = qal.d(24);
        if (n >= 0) {
          i = qal.d(n);
        }
        j += i1 + i;
      }
      if (this.d != null)
      {
        String str = this.d;
        int k = qal.d(32);
        int m = qal.a(str);
        j += k + (m + qal.d(m));
      }
      return j;
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
      for (int k = 1;; k = 0)
      {
        b1 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.b != null)
    {
      int j = this.b.intValue();
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(34);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nrz
 * JD-Core Version:    0.7.0.1
 */