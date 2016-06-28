import java.nio.ByteBuffer;

public final class nxo
  extends qan<nxo>
{
  public Boolean a = null;
  public Boolean b = null;
  public Boolean c = null;
  public Boolean d = null;
  private Boolean e = null;
  private Boolean f = null;
  private Boolean g = null;
  private Boolean h = null;
  private Boolean i = null;
  private Boolean j = null;
  private Boolean k = null;
  
  public nxo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.e != null)
    {
      this.e.booleanValue();
      m += 1 + qal.d(8);
    }
    if (this.a != null)
    {
      this.a.booleanValue();
      m += 1 + qal.d(16);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      m += 1 + qal.d(24);
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      m += 1 + qal.d(40);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      m += 1 + qal.d(48);
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      m += 1 + qal.d(56);
    }
    if (this.h != null)
    {
      this.h.booleanValue();
      m += 1 + qal.d(64);
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      m += 1 + qal.d(72);
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      m += 1 + qal.d(80);
    }
    if (this.j != null)
    {
      this.j.booleanValue();
      m += 1 + qal.d(88);
    }
    if (this.k != null)
    {
      this.k.booleanValue();
      m += 1 + qal.d(96);
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
    if (this.e != null)
    {
      boolean bool11 = this.e.booleanValue();
      paramqal.c(8);
      if (bool11) {}
      byte b11;
      for (int i9 = m;; i9 = 0)
      {
        b11 = (byte)i9;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b11);
    }
    if (this.a != null)
    {
      boolean bool10 = this.a.booleanValue();
      paramqal.c(16);
      if (bool10) {}
      byte b10;
      for (int i8 = m;; i8 = 0)
      {
        b10 = (byte)i8;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b10);
    }
    if (this.f != null)
    {
      boolean bool9 = this.f.booleanValue();
      paramqal.c(24);
      if (bool9) {}
      byte b9;
      for (int i7 = m;; i7 = 0)
      {
        b9 = (byte)i7;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b9);
    }
    if (this.b != null)
    {
      boolean bool8 = this.b.booleanValue();
      paramqal.c(40);
      if (bool8) {}
      byte b8;
      for (int i6 = m;; i6 = 0)
      {
        b8 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b8);
    }
    if (this.c != null)
    {
      boolean bool7 = this.c.booleanValue();
      paramqal.c(48);
      if (bool7) {}
      byte b7;
      for (int i5 = m;; i5 = 0)
      {
        b7 = (byte)i5;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b7);
    }
    if (this.g != null)
    {
      boolean bool6 = this.g.booleanValue();
      paramqal.c(56);
      if (bool6) {}
      byte b6;
      for (int i4 = m;; i4 = 0)
      {
        b6 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b6);
    }
    if (this.h != null)
    {
      boolean bool5 = this.h.booleanValue();
      paramqal.c(64);
      if (bool5) {}
      byte b5;
      for (int i3 = m;; i3 = 0)
      {
        b5 = (byte)i3;
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
      paramqal.c(72);
      if (bool4) {}
      byte b4;
      for (int i2 = m;; i2 = 0)
      {
        b4 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.i != null)
    {
      boolean bool3 = this.i.booleanValue();
      paramqal.c(80);
      if (bool3) {}
      byte b3;
      for (int i1 = m;; i1 = 0)
      {
        b3 = (byte)i1;
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
      paramqal.c(88);
      if (bool2) {}
      byte b2;
      for (int n = m;; n = 0)
      {
        b2 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.k != null)
    {
      boolean bool1 = this.k.booleanValue();
      paramqal.c(96);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        m = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxo
 * JD-Core Version:    0.7.0.1
 */