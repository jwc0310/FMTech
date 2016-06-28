import java.nio.ByteBuffer;

public final class nox
  extends qan<nox>
{
  public npe a = null;
  public Boolean b = null;
  public Boolean c = null;
  public Integer d = null;
  private String e = null;
  
  public nox()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      npe localnpe = this.a;
      int i2 = qal.d(8);
      int i3 = localnpe.a();
      localnpe.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.d != null)
    {
      m = this.d.intValue();
      n = qal.d(16);
      if (m < 0) {
        break label189;
      }
    }
    label189:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.e != null)
      {
        String str = this.e;
        int j = qal.d(24);
        int k = qal.a(str);
        i += j + (k + qal.d(k));
      }
      if (this.b != null)
      {
        this.b.booleanValue();
        i += 1 + qal.d(32);
      }
      if (this.c != null)
      {
        this.c.booleanValue();
        i += 1 + qal.d(40);
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      npe localnpe = this.a;
      paramqal.c(10);
      if (localnpe.ak < 0) {
        localnpe.ak = localnpe.a();
      }
      paramqal.c(localnpe.ak);
      localnpe.a(paramqal);
    }
    if (this.d != null)
    {
      int k = this.d.intValue();
      paramqal.c(16);
      paramqal.a(k);
    }
    if (this.e != null)
    {
      String str = this.e;
      paramqal.c(26);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      boolean bool2 = this.b.booleanValue();
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
    if (this.c != null)
    {
      boolean bool1 = this.c.booleanValue();
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
 * Qualified Name:     nox
 * JD-Core Version:    0.7.0.1
 */