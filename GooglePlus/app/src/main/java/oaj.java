import java.nio.ByteBuffer;

public final class oaj
  extends qan<oaj>
{
  public Long a = null;
  public Boolean b = null;
  public osc c = null;
  private Boolean d = null;
  
  public oaj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      long l = this.a.longValue();
      i += qal.d(8) + qal.b(l);
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i += 1 + qal.d(24);
    }
    if (this.c != null)
    {
      osc localosc = this.c;
      int j = qal.d(32);
      int k = localosc.a();
      localosc.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      long l = this.a.longValue();
      paramqal.c(8);
      paramqal.a(l);
    }
    if (this.d != null)
    {
      boolean bool2 = this.d.booleanValue();
      paramqal.c(16);
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
    if (this.b != null)
    {
      boolean bool1 = this.b.booleanValue();
      paramqal.c(24);
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
    if (this.c != null)
    {
      osc localosc = this.c;
      paramqal.c(34);
      if (localosc.ak < 0) {
        localosc.ak = localosc.a();
      }
      paramqal.c(localosc.ak);
      localosc.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oaj
 * JD-Core Version:    0.7.0.1
 */