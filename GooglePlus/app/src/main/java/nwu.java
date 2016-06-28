import java.nio.ByteBuffer;

public final class nwu
  extends qan<nwu>
{
  private static volatile nwu[] d;
  public String a = null;
  public String b = null;
  public Boolean c = null;
  private Boolean e = null;
  private Integer f = null;
  
  public nwu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nwu[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new nwu[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str2 = this.a;
      int i2 = qal.d(8);
      int i3 = qal.a(str2);
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int n = qal.d(16);
      int i1 = qal.a(str1);
      i += n + (i1 + qal.d(i1));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i += 1 + qal.d(32);
    }
    int j;
    int k;
    if (this.f != null)
    {
      j = this.f.intValue();
      k = qal.d(40);
      if (j < 0) {
        break label177;
      }
    }
    label177:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      String str1 = this.b;
      paramqal.c(18);
      paramqal.a(str1);
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
    if (this.e != null)
    {
      boolean bool1 = this.e.booleanValue();
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
    if (this.f != null)
    {
      int j = this.f.intValue();
      paramqal.c(40);
      paramqal.a(j);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwu
 * JD-Core Version:    0.7.0.1
 */