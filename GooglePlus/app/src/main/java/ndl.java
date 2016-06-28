import java.nio.ByteBuffer;

public final class ndl
  extends qan<ndl>
{
  private static volatile ndl[] b;
  public ndj a = null;
  private ndc c = null;
  private Integer d = null;
  private ndk[] e = ndk.b();
  private Boolean f = null;
  private String g = null;
  private String h = null;
  private Boolean i = null;
  private Boolean j = null;
  private Boolean k = null;
  private Boolean l = null;
  
  public ndl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ndl[] b()
  {
    if (b == null) {}
    synchronized (qar.a)
    {
      if (b == null) {
        b = new ndl[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.a != null)
    {
      ndj localndj = this.a;
      int i13 = qal.d(8);
      int i14 = localndj.a();
      localndj.ak = i14;
      m += i13 + (i14 + qal.d(i14));
    }
    if (this.c != null)
    {
      ndc localndc = this.c;
      int i11 = qal.d(16);
      int i12 = localndc.a();
      localndc.ak = i12;
      m += i11 + (i12 + qal.d(i12));
    }
    int i8;
    int i9;
    if (this.d != null)
    {
      i8 = this.d.intValue();
      i9 = qal.d(24);
      if (i8 < 0) {
        break label232;
      }
    }
    int i4;
    label232:
    for (int i10 = qal.d(i8);; i10 = 10)
    {
      m += i10 + i9;
      if ((this.e == null) || (this.e.length <= 0)) {
        break label242;
      }
      i4 = m;
      for (int i5 = 0; i5 < this.e.length; i5++)
      {
        ndk localndk = this.e[i5];
        if (localndk != null)
        {
          int i6 = qal.d(32);
          int i7 = localndk.a();
          localndk.ak = i7;
          i4 += i6 + (i7 + qal.d(i7));
        }
      }
    }
    m = i4;
    label242:
    if (this.f != null)
    {
      this.f.booleanValue();
      m += 1 + qal.d(40);
    }
    if (this.g != null)
    {
      String str2 = this.g;
      int i2 = qal.d(48);
      int i3 = qal.a(str2);
      m += i2 + (i3 + qal.d(i3));
    }
    if (this.h != null)
    {
      String str1 = this.h;
      int n = qal.d(56);
      int i1 = qal.a(str1);
      m += n + (i1 + qal.d(i1));
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      m += 1 + qal.d(64);
    }
    if (this.j != null)
    {
      this.j.booleanValue();
      m += 1 + qal.d(72);
    }
    if (this.k != null)
    {
      this.k.booleanValue();
      m += 1 + qal.d(80);
    }
    if (this.l != null)
    {
      this.l.booleanValue();
      m += 1 + qal.d(88);
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
    if (this.a != null)
    {
      ndj localndj = this.a;
      paramqal.c(10);
      if (localndj.ak < 0) {
        localndj.ak = localndj.a();
      }
      paramqal.c(localndj.ak);
      localndj.a(paramqal);
    }
    if (this.c != null)
    {
      ndc localndc = this.c;
      paramqal.c(18);
      if (localndc.ak < 0) {
        localndc.ak = localndc.a();
      }
      paramqal.c(localndc.ak);
      localndc.a(paramqal);
    }
    if (this.d != null)
    {
      int i5 = this.d.intValue();
      paramqal.c(24);
      paramqal.a(i5);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i4 = 0; i4 < this.e.length; i4++)
      {
        ndk localndk = this.e[i4];
        if (localndk != null)
        {
          paramqal.c(34);
          if (localndk.ak < 0) {
            localndk.ak = localndk.a();
          }
          paramqal.c(localndk.ak);
          localndk.a(paramqal);
        }
      }
    }
    if (this.f != null)
    {
      boolean bool5 = this.f.booleanValue();
      paramqal.c(40);
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
    if (this.g != null)
    {
      String str2 = this.g;
      paramqal.c(50);
      paramqal.a(str2);
    }
    if (this.h != null)
    {
      String str1 = this.h;
      paramqal.c(58);
      paramqal.a(str1);
    }
    if (this.i != null)
    {
      boolean bool4 = this.i.booleanValue();
      paramqal.c(64);
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
    if (this.j != null)
    {
      boolean bool3 = this.j.booleanValue();
      paramqal.c(72);
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
    if (this.k != null)
    {
      boolean bool2 = this.k.booleanValue();
      paramqal.c(80);
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
    if (this.l != null)
    {
      boolean bool1 = this.l.booleanValue();
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
 * Qualified Name:     ndl
 * JD-Core Version:    0.7.0.1
 */