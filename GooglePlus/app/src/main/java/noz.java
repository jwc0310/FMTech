import java.nio.ByteBuffer;

public final class noz
  extends qan<noz>
{
  public npe a = null;
  public now b = null;
  public String c = null;
  public Boolean d = null;
  public Boolean e = null;
  public Boolean f = null;
  public Boolean g = null;
  public qbd h = null;
  public int i = -2147483648;
  private nov j = null;
  private Boolean k = null;
  private Boolean l = null;
  
  public noz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.a != null)
    {
      npe localnpe = this.a;
      int i11 = qal.d(8);
      int i12 = localnpe.a();
      localnpe.ak = i12;
      m += i11 + (i12 + qal.d(i12));
    }
    if (this.b != null)
    {
      now localnow = this.b;
      int i9 = qal.d(16);
      int i10 = localnow.a();
      localnow.ak = i10;
      m += i9 + (i10 + qal.d(i10));
    }
    if (this.c != null)
    {
      String str = this.c;
      int i7 = qal.d(24);
      int i8 = qal.a(str);
      m += i7 + (i8 + qal.d(i8));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      m += 1 + qal.d(32);
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      m += 1 + qal.d(40);
    }
    if (this.k != null)
    {
      this.k.booleanValue();
      m += 1 + qal.d(48);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      m += 1 + qal.d(56);
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      m += 1 + qal.d(64);
    }
    if (this.h != null)
    {
      qbd localqbd = this.h;
      int i5 = qal.d(72);
      int i6 = localqbd.a();
      localqbd.ak = i6;
      m += i5 + (i6 + qal.d(i6));
    }
    if (this.j != null)
    {
      nov localnov = this.j;
      int i3 = qal.d(80);
      int i4 = localnov.a();
      localnov.ak = i4;
      m += i3 + (i4 + qal.d(i4));
    }
    int n;
    int i1;
    if (this.i != -2147483648)
    {
      n = this.i;
      i1 = qal.d(88);
      if (n < 0) {
        break label429;
      }
    }
    label429:
    for (int i2 = qal.d(n);; i2 = 10)
    {
      m += i2 + i1;
      if (this.l != null)
      {
        this.l.booleanValue();
        m += 1 + qal.d(96);
      }
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
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
    if (this.b != null)
    {
      now localnow = this.b;
      paramqal.c(18);
      if (localnow.ak < 0) {
        localnow.ak = localnow.a();
      }
      paramqal.c(localnow.ak);
      localnow.a(paramqal);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(26);
      paramqal.a(str);
    }
    if (this.d != null)
    {
      boolean bool6 = this.d.booleanValue();
      paramqal.c(32);
      if (bool6) {}
      byte b6;
      for (int i5 = m;; i5 = 0)
      {
        b6 = (byte)i5;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b6);
    }
    if (this.e != null)
    {
      boolean bool5 = this.e.booleanValue();
      paramqal.c(40);
      if (bool5) {}
      byte b5;
      for (int i4 = m;; i4 = 0)
      {
        b5 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if (this.k != null)
    {
      boolean bool4 = this.k.booleanValue();
      paramqal.c(48);
      if (bool4) {}
      byte b4;
      for (int i3 = m;; i3 = 0)
      {
        b4 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.f != null)
    {
      boolean bool3 = this.f.booleanValue();
      paramqal.c(56);
      if (bool3) {}
      byte b3;
      for (int i2 = m;; i2 = 0)
      {
        b3 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.g != null)
    {
      boolean bool2 = this.g.booleanValue();
      paramqal.c(64);
      if (bool2) {}
      byte b2;
      for (int i1 = m;; i1 = 0)
      {
        b2 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.h != null)
    {
      qbd localqbd = this.h;
      paramqal.c(74);
      if (localqbd.ak < 0) {
        localqbd.ak = localqbd.a();
      }
      paramqal.c(localqbd.ak);
      localqbd.a(paramqal);
    }
    if (this.j != null)
    {
      nov localnov = this.j;
      paramqal.c(82);
      if (localnov.ak < 0) {
        localnov.ak = localnov.a();
      }
      paramqal.c(localnov.ak);
      localnov.a(paramqal);
    }
    if (this.i != -2147483648)
    {
      int n = this.i;
      paramqal.c(88);
      paramqal.a(n);
    }
    if (this.l != null)
    {
      boolean bool1 = this.l.booleanValue();
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
 * Qualified Name:     noz
 * JD-Core Version:    0.7.0.1
 */