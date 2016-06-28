import java.nio.ByteBuffer;

public final class obl
  extends qan<obl>
{
  public Boolean a = null;
  private Boolean b = null;
  private Boolean c = null;
  private Boolean d = null;
  private Boolean e = null;
  private Boolean f = null;
  private Boolean g = null;
  private nvp h = null;
  
  public obl()
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
      i += 1 + qal.d(8);
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(32);
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i += 1 + qal.d(40);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      i += 1 + qal.d(48);
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      i += 1 + qal.d(56);
    }
    if (this.h != null)
    {
      nvp localnvp = this.h;
      int j = qal.d(64);
      int k = localnvp.a();
      localnvp.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      boolean bool7 = this.a.booleanValue();
      paramqal.c(8);
      if (bool7) {}
      byte b7;
      for (int i2 = i;; i2 = 0)
      {
        b7 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b7);
    }
    if (this.b != null)
    {
      boolean bool6 = this.b.booleanValue();
      paramqal.c(16);
      if (bool6) {}
      byte b6;
      for (int i1 = i;; i1 = 0)
      {
        b6 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b6);
    }
    if (this.c != null)
    {
      boolean bool5 = this.c.booleanValue();
      paramqal.c(24);
      if (bool5) {}
      byte b5;
      for (int n = i;; n = 0)
      {
        b5 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if (this.d != null)
    {
      boolean bool4 = this.d.booleanValue();
      paramqal.c(32);
      if (bool4) {}
      byte b4;
      for (int m = i;; m = 0)
      {
        b4 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.e != null)
    {
      boolean bool3 = this.e.booleanValue();
      paramqal.c(40);
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
    if (this.f != null)
    {
      boolean bool2 = this.f.booleanValue();
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
    if (this.g != null)
    {
      boolean bool1 = this.g.booleanValue();
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
    if (this.h != null)
    {
      nvp localnvp = this.h;
      paramqal.c(66);
      if (localnvp.ak < 0) {
        localnvp.ak = localnvp.a();
      }
      paramqal.c(localnvp.ak);
      localnvp.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     obl
 * JD-Core Version:    0.7.0.1
 */