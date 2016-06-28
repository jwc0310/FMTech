import java.nio.ByteBuffer;

public final class oap
  extends qan<oap>
{
  public Boolean a = null;
  public Boolean b = null;
  public oaq c = null;
  public oaq[] d = oaq.b();
  public Boolean e = null;
  private Boolean f = null;
  
  public oap()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      this.a.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i += 1 + qal.d(24);
    }
    if (this.c != null)
    {
      oaq localoaq2 = this.c;
      int i1 = qal.d(32);
      int i2 = localoaq2.a();
      localoaq2.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.d.length; k++)
      {
        oaq localoaq1 = this.d[k];
        if (localoaq1 != null)
        {
          int m = qal.d(40);
          int n = localoaq1.a();
          localoaq1.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i += 1 + qal.d(48);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      i += 1 + qal.d(56);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      boolean bool4 = this.a.booleanValue();
      paramqal.c(16);
      if (bool4) {}
      byte b4;
      for (int n = i;; n = 0)
      {
        b4 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.b != null)
    {
      boolean bool3 = this.b.booleanValue();
      paramqal.c(24);
      if (bool3) {}
      byte b3;
      for (int m = i;; m = 0)
      {
        b3 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.c != null)
    {
      oaq localoaq2 = this.c;
      paramqal.c(34);
      if (localoaq2.ak < 0) {
        localoaq2.ak = localoaq2.a();
      }
      paramqal.c(localoaq2.ak);
      localoaq2.a(paramqal);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int k = 0; k < this.d.length; k++)
      {
        oaq localoaq1 = this.d[k];
        if (localoaq1 != null)
        {
          paramqal.c(42);
          if (localoaq1.ak < 0) {
            localoaq1.ak = localoaq1.a();
          }
          paramqal.c(localoaq1.ak);
          localoaq1.a(paramqal);
        }
      }
    }
    if (this.e != null)
    {
      boolean bool2 = this.e.booleanValue();
      paramqal.c(48);
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
      paramqal.c(56);
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
 * Qualified Name:     oap
 * JD-Core Version:    0.7.0.1
 */