import java.nio.ByteBuffer;

public final class onm
  extends qan<onm>
{
  public Boolean a = null;
  public Boolean b = null;
  public Boolean c = null;
  public Boolean d = null;
  public Boolean e = null;
  private Boolean f = null;
  private Boolean g = null;
  private Boolean h = null;
  private Boolean i = null;
  private Boolean j = null;
  
  public onm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = super.a();
    if (this.f != null)
    {
      this.f.booleanValue();
      k += 1 + qal.d(8);
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      k += 1 + qal.d(16);
    }
    if (this.a != null)
    {
      this.a.booleanValue();
      k += 1 + qal.d(24);
    }
    if (this.h != null)
    {
      this.h.booleanValue();
      k += 1 + qal.d(32);
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      k += 1 + qal.d(40);
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      k += 1 + qal.d(48);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      k += 1 + qal.d(56);
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      k += 1 + qal.d(64);
    }
    if (this.j != null)
    {
      this.j.booleanValue();
      k += 1 + qal.d(72);
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      k += 1 + qal.d(80);
    }
    return k;
  }
  
  public final void a(qal paramqal)
  {
    int k = 1;
    if (this.f != null)
    {
      boolean bool10 = this.f.booleanValue();
      paramqal.c(8);
      if (bool10) {}
      byte b10;
      for (int i7 = k;; i7 = 0)
      {
        b10 = (byte)i7;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b10);
    }
    if (this.g != null)
    {
      boolean bool9 = this.g.booleanValue();
      paramqal.c(16);
      if (bool9) {}
      byte b9;
      for (int i6 = k;; i6 = 0)
      {
        b9 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b9);
    }
    if (this.a != null)
    {
      boolean bool8 = this.a.booleanValue();
      paramqal.c(24);
      if (bool8) {}
      byte b8;
      for (int i5 = k;; i5 = 0)
      {
        b8 = (byte)i5;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b8);
    }
    if (this.h != null)
    {
      boolean bool7 = this.h.booleanValue();
      paramqal.c(32);
      if (bool7) {}
      byte b7;
      for (int i4 = k;; i4 = 0)
      {
        b7 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b7);
    }
    if (this.i != null)
    {
      boolean bool6 = this.i.booleanValue();
      paramqal.c(40);
      if (bool6) {}
      byte b6;
      for (int i3 = k;; i3 = 0)
      {
        b6 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b6);
    }
    if (this.b != null)
    {
      boolean bool5 = this.b.booleanValue();
      paramqal.c(48);
      if (bool5) {}
      byte b5;
      for (int i2 = k;; i2 = 0)
      {
        b5 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if (this.c != null)
    {
      boolean bool4 = this.c.booleanValue();
      paramqal.c(56);
      if (bool4) {}
      byte b4;
      for (int i1 = k;; i1 = 0)
      {
        b4 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.d != null)
    {
      boolean bool3 = this.d.booleanValue();
      paramqal.c(64);
      if (bool3) {}
      byte b3;
      for (int n = k;; n = 0)
      {
        b3 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.j != null)
    {
      boolean bool2 = this.j.booleanValue();
      paramqal.c(72);
      if (bool2) {}
      byte b2;
      for (int m = k;; m = 0)
      {
        b2 = (byte)m;
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
      paramqal.c(80);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        k = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     onm
 * JD-Core Version:    0.7.0.1
 */