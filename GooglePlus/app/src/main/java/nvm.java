import java.nio.ByteBuffer;

public final class nvm
  extends qan<nvm>
{
  public nwx a = null;
  public nwe b = null;
  public nxo c = null;
  public String d = null;
  public nxm e = null;
  private Boolean f = null;
  private Boolean g = null;
  private Boolean h = null;
  private nvo i = null;
  private nxy j = null;
  private Boolean k = null;
  
  public nvm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.a != null)
    {
      nwx localnwx = this.a;
      int i12 = qal.d(8);
      int i13 = localnwx.a();
      localnwx.ak = i13;
      m += i12 + (i13 + qal.d(i13));
    }
    if (this.b != null)
    {
      nwe localnwe = this.b;
      int i10 = qal.d(16);
      int i11 = localnwe.a();
      localnwe.ak = i11;
      m += i10 + (i11 + qal.d(i11));
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      m += 1 + qal.d(24);
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      m += 1 + qal.d(32);
    }
    if (this.h != null)
    {
      this.h.booleanValue();
      m += 1 + qal.d(40);
    }
    if (this.i != null)
    {
      nvo localnvo = this.i;
      int i8 = qal.d(48);
      int i9 = localnvo.a();
      localnvo.ak = i9;
      m += i8 + (i9 + qal.d(i9));
    }
    if (this.c != null)
    {
      nxo localnxo = this.c;
      int i6 = qal.d(56);
      int i7 = localnxo.a();
      localnxo.ak = i7;
      m += i6 + (i7 + qal.d(i7));
    }
    if (this.j != null)
    {
      nxy localnxy = this.j;
      int i4 = qal.d(64);
      int i5 = localnxy.a();
      localnxy.ak = i5;
      m += i4 + (i5 + qal.d(i5));
    }
    if (this.d != null)
    {
      String str = this.d;
      int i2 = qal.d(72);
      int i3 = qal.a(str);
      m += i2 + (i3 + qal.d(i3));
    }
    if (this.e != null)
    {
      nxm localnxm = this.e;
      int n = qal.d(80);
      int i1 = localnxm.a();
      localnxm.ak = i1;
      m += n + (i1 + qal.d(i1));
    }
    if (this.k != null)
    {
      this.k.booleanValue();
      m += 1 + qal.d(88);
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
    if (this.a != null)
    {
      nwx localnwx = this.a;
      paramqal.c(10);
      if (localnwx.ak < 0) {
        localnwx.ak = localnwx.a();
      }
      paramqal.c(localnwx.ak);
      localnwx.a(paramqal);
    }
    if (this.b != null)
    {
      nwe localnwe = this.b;
      paramqal.c(18);
      if (localnwe.ak < 0) {
        localnwe.ak = localnwe.a();
      }
      paramqal.c(localnwe.ak);
      localnwe.a(paramqal);
    }
    if (this.f != null)
    {
      boolean bool4 = this.f.booleanValue();
      paramqal.c(24);
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
    if (this.g != null)
    {
      boolean bool3 = this.g.booleanValue();
      paramqal.c(32);
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
    if (this.h != null)
    {
      boolean bool2 = this.h.booleanValue();
      paramqal.c(40);
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
    if (this.i != null)
    {
      nvo localnvo = this.i;
      paramqal.c(50);
      if (localnvo.ak < 0) {
        localnvo.ak = localnvo.a();
      }
      paramqal.c(localnvo.ak);
      localnvo.a(paramqal);
    }
    if (this.c != null)
    {
      nxo localnxo = this.c;
      paramqal.c(58);
      if (localnxo.ak < 0) {
        localnxo.ak = localnxo.a();
      }
      paramqal.c(localnxo.ak);
      localnxo.a(paramqal);
    }
    if (this.j != null)
    {
      nxy localnxy = this.j;
      paramqal.c(66);
      if (localnxy.ak < 0) {
        localnxy.ak = localnxy.a();
      }
      paramqal.c(localnxy.ak);
      localnxy.a(paramqal);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(74);
      paramqal.a(str);
    }
    if (this.e != null)
    {
      nxm localnxm = this.e;
      paramqal.c(82);
      if (localnxm.ak < 0) {
        localnxm.ak = localnxm.a();
      }
      paramqal.c(localnxm.ak);
      localnxm.a(paramqal);
    }
    if (this.k != null)
    {
      boolean bool1 = this.k.booleanValue();
      paramqal.c(88);
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
 * Qualified Name:     nvm
 * JD-Core Version:    0.7.0.1
 */