import java.nio.ByteBuffer;

public final class ojs
  extends qan<ojs>
{
  private static volatile ojs[] a;
  private String b = null;
  private String c = null;
  private Boolean d = null;
  private Boolean e = null;
  private Boolean f = null;
  
  public ojs()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ojs[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new ojs[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    String str1 = this.b;
    int j = qal.d(8);
    int k = qal.a(str1);
    int m = i + (j + (k + qal.d(k)));
    String str2 = this.c;
    int n = qal.d(16);
    int i1 = qal.a(str2);
    int i2 = m + (n + (i1 + qal.d(i1)));
    if (this.d != null)
    {
      this.d.booleanValue();
      i2 += 1 + qal.d(24);
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i2 += 1 + qal.d(32);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      i2 += 1 + qal.d(40);
    }
    return i2;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    String str1 = this.b;
    paramqal.c(10);
    paramqal.a(str1);
    String str2 = this.c;
    paramqal.c(18);
    paramqal.a(str2);
    if (this.d != null)
    {
      boolean bool3 = this.d.booleanValue();
      paramqal.c(24);
      if (bool3) {}
      byte b3;
      for (int k = i;; k = 0)
      {
        b3 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.e != null)
    {
      boolean bool2 = this.e.booleanValue();
      paramqal.c(32);
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
    if (this.f != null)
    {
      boolean bool1 = this.f.booleanValue();
      paramqal.c(40);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ojs
 * JD-Core Version:    0.7.0.1
 */