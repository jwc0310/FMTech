import java.nio.ByteBuffer;

public final class oox
  extends qan<oox>
{
  private static volatile oox[] a;
  private ome b = null;
  private Long c = null;
  private Boolean d = null;
  private Boolean e = null;
  
  public oox()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oox[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new oox[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      ome localome = this.b;
      int j = qal.d(8);
      int k = localome.a();
      localome.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.c != null)
    {
      long l = this.c.longValue();
      i += qal.d(16) + qal.b(l);
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(24);
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i += 1 + qal.d(32);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.b != null)
    {
      ome localome = this.b;
      paramqal.c(10);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    if (this.c != null)
    {
      long l = this.c.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    if (this.d != null)
    {
      boolean bool2 = this.d.booleanValue();
      paramqal.c(24);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oox
 * JD-Core Version:    0.7.0.1
 */