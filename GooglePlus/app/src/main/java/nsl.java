import java.nio.ByteBuffer;

public final class nsl
  extends qan<nsl>
{
  public Boolean a = null;
  public Boolean b = null;
  public Boolean c = null;
  public Boolean d = null;
  public Boolean e = null;
  public Boolean f = null;
  public Boolean g = null;
  public Boolean h = null;
  public Boolean i = null;
  public int j = -2147483648;
  public Boolean k = null;
  public Boolean l = null;
  public Boolean m = null;
  public nse n = null;
  public Boolean o = null;
  private int p = -2147483648;
  
  public nsl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 10;
    int i2 = super.a();
    if (this.a != null)
    {
      this.a.booleanValue();
      i2 += 1 + qal.d(8);
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i2 += 1 + qal.d(16);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i2 += 1 + qal.d(24);
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i2 += 1 + qal.d(32);
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i2 += 1 + qal.d(40);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      i2 += 1 + qal.d(48);
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      i2 += 1 + qal.d(56);
    }
    if (this.h != null)
    {
      this.h.booleanValue();
      i2 += 1 + qal.d(64);
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      i2 += 1 + qal.d(72);
    }
    int i7;
    int i8;
    if (this.p != -2147483648)
    {
      i7 = this.p;
      i8 = qal.d(80);
      if (i7 < 0) {
        break label466;
      }
    }
    label466:
    for (int i9 = qal.d(i7);; i9 = i1)
    {
      i2 += i9 + i8;
      if (this.j != -2147483648)
      {
        int i5 = this.j;
        int i6 = qal.d(88);
        if (i5 >= 0) {
          i1 = qal.d(i5);
        }
        i2 += i6 + i1;
      }
      if (this.k != null)
      {
        this.k.booleanValue();
        i2 += 1 + qal.d(96);
      }
      if (this.l != null)
      {
        this.l.booleanValue();
        i2 += 1 + qal.d(104);
      }
      if (this.m != null)
      {
        this.m.booleanValue();
        i2 += 1 + qal.d(112);
      }
      if (this.n != null)
      {
        nse localnse = this.n;
        int i3 = qal.d(120);
        int i4 = localnse.a();
        localnse.ak = i4;
        i2 += i3 + (i4 + qal.d(i4));
      }
      if (this.o != null)
      {
        this.o.booleanValue();
        i2 += 1 + qal.d(128);
      }
      return i2;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.a != null)
    {
      boolean bool13 = this.a.booleanValue();
      paramqal.c(8);
      if (bool13) {}
      byte b13;
      for (int i15 = i1;; i15 = 0)
      {
        b13 = (byte)i15;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b13);
    }
    if (this.b != null)
    {
      boolean bool12 = this.b.booleanValue();
      paramqal.c(16);
      if (bool12) {}
      byte b12;
      for (int i14 = i1;; i14 = 0)
      {
        b12 = (byte)i14;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b12);
    }
    if (this.c != null)
    {
      boolean bool11 = this.c.booleanValue();
      paramqal.c(24);
      if (bool11) {}
      byte b11;
      for (int i13 = i1;; i13 = 0)
      {
        b11 = (byte)i13;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b11);
    }
    if (this.d != null)
    {
      boolean bool10 = this.d.booleanValue();
      paramqal.c(32);
      if (bool10) {}
      byte b10;
      for (int i12 = i1;; i12 = 0)
      {
        b10 = (byte)i12;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b10);
    }
    if (this.e != null)
    {
      boolean bool9 = this.e.booleanValue();
      paramqal.c(40);
      if (bool9) {}
      byte b9;
      for (int i11 = i1;; i11 = 0)
      {
        b9 = (byte)i11;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b9);
    }
    if (this.f != null)
    {
      boolean bool8 = this.f.booleanValue();
      paramqal.c(48);
      if (bool8) {}
      byte b8;
      for (int i10 = i1;; i10 = 0)
      {
        b8 = (byte)i10;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b8);
    }
    if (this.g != null)
    {
      boolean bool7 = this.g.booleanValue();
      paramqal.c(56);
      if (bool7) {}
      byte b7;
      for (int i9 = i1;; i9 = 0)
      {
        b7 = (byte)i9;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b7);
    }
    if (this.h != null)
    {
      boolean bool6 = this.h.booleanValue();
      paramqal.c(64);
      if (bool6) {}
      byte b6;
      for (int i8 = i1;; i8 = 0)
      {
        b6 = (byte)i8;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b6);
    }
    if (this.i != null)
    {
      boolean bool5 = this.i.booleanValue();
      paramqal.c(72);
      if (bool5) {}
      byte b5;
      for (int i7 = i1;; i7 = 0)
      {
        b5 = (byte)i7;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if (this.p != -2147483648)
    {
      int i6 = this.p;
      paramqal.c(80);
      paramqal.a(i6);
    }
    if (this.j != -2147483648)
    {
      int i5 = this.j;
      paramqal.c(88);
      paramqal.a(i5);
    }
    if (this.k != null)
    {
      boolean bool4 = this.k.booleanValue();
      paramqal.c(96);
      if (bool4) {}
      byte b4;
      for (int i4 = i1;; i4 = 0)
      {
        b4 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.l != null)
    {
      boolean bool3 = this.l.booleanValue();
      paramqal.c(104);
      if (bool3) {}
      byte b3;
      for (int i3 = i1;; i3 = 0)
      {
        b3 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.m != null)
    {
      boolean bool2 = this.m.booleanValue();
      paramqal.c(112);
      if (bool2) {}
      byte b2;
      for (int i2 = i1;; i2 = 0)
      {
        b2 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.n != null)
    {
      nse localnse = this.n;
      paramqal.c(122);
      if (localnse.ak < 0) {
        localnse.ak = localnse.a();
      }
      paramqal.c(localnse.ak);
      localnse.a(paramqal);
    }
    if (this.o != null)
    {
      boolean bool1 = this.o.booleanValue();
      paramqal.c(128);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i1 = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsl
 * JD-Core Version:    0.7.0.1
 */