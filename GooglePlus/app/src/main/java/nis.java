import java.nio.ByteBuffer;

public final class nis
  extends qan<nis>
{
  private String a = null;
  private Integer b = null;
  private Boolean c = null;
  private Boolean d = null;
  private Integer e = null;
  
  public nis()
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
      String str = this.a;
      int i3 = qal.d(8);
      int i4 = qal.a(str);
      j += i3 + (i4 + qal.d(i4));
    }
    int n;
    int i1;
    if (this.b != null)
    {
      n = this.b.intValue();
      i1 = qal.d(16);
      if (n < 0) {
        break label182;
      }
    }
    label182:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.c != null)
      {
        this.c.booleanValue();
        j += 1 + qal.d(24);
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        j += 1 + qal.d(32);
      }
      if (this.e != null)
      {
        int k = this.e.intValue();
        int m = qal.d(40);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      int m = this.b.intValue();
      paramqal.c(16);
      paramqal.a(m);
    }
    if (this.c != null)
    {
      boolean bool2 = this.c.booleanValue();
      paramqal.c(24);
      if (bool2) {}
      byte b2;
      for (int k = i;; k = 0)
      {
        b2 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.d != null)
    {
      boolean bool1 = this.d.booleanValue();
      paramqal.c(32);
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
    if (this.e != null)
    {
      int j = this.e.intValue();
      paramqal.c(40);
      paramqal.a(j);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nis
 * JD-Core Version:    0.7.0.1
 */