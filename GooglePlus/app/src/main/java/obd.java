import java.nio.ByteBuffer;

public final class obd
  extends qan<obd>
{
  public int a = -2147483648;
  private obe[] b = obe.b();
  private String c = null;
  private Boolean d = null;
  private String e = null;
  private Boolean f = null;
  private obe g = null;
  private String h = null;
  private Boolean i = null;
  private String j = null;
  private Boolean k = null;
  private Boolean l = null;
  
  public obd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = super.a();
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i13 = 0; i13 < this.b.length; i13++)
      {
        obe localobe2 = this.b[i13];
        if (localobe2 != null)
        {
          int i14 = qal.d(8);
          int i15 = localobe2.a();
          localobe2.ak = i15;
          m += i14 + (i15 + qal.d(i15));
        }
      }
    }
    if (this.c != null)
    {
      String str4 = this.c;
      int i11 = qal.d(48);
      int i12 = qal.a(str4);
      m += i11 + (i12 + qal.d(i12));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      m += 1 + qal.d(56);
    }
    if (this.e != null)
    {
      String str3 = this.e;
      int i9 = qal.d(64);
      int i10 = qal.a(str3);
      m += i9 + (i10 + qal.d(i10));
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      m += 1 + qal.d(72);
    }
    if (this.g != null)
    {
      obe localobe1 = this.g;
      int i7 = qal.d(80);
      int i8 = localobe1.a();
      localobe1.ak = i8;
      m += i7 + (i8 + qal.d(i8));
    }
    if (this.h != null)
    {
      String str2 = this.h;
      int i5 = qal.d(88);
      int i6 = qal.a(str2);
      m += i5 + (i6 + qal.d(i6));
    }
    int i2;
    int i3;
    if (this.a != -2147483648)
    {
      i2 = this.a;
      i3 = qal.d(96);
      if (i2 < 0) {
        break label470;
      }
    }
    label470:
    for (int i4 = qal.d(i2);; i4 = 10)
    {
      m += i4 + i3;
      if (this.i != null)
      {
        this.i.booleanValue();
        m += 1 + qal.d(104);
      }
      if (this.j != null)
      {
        String str1 = this.j;
        int n = qal.d(112);
        int i1 = qal.a(str1);
        m += n + (i1 + qal.d(i1));
      }
      if (this.k != null)
      {
        this.k.booleanValue();
        m += 1 + qal.d(120);
      }
      if (this.l != null)
      {
        this.l.booleanValue();
        m += 1 + qal.d(128);
      }
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i5 = 0; i5 < this.b.length; i5++)
      {
        obe localobe2 = this.b[i5];
        if (localobe2 != null)
        {
          paramqal.c(10);
          if (localobe2.ak < 0) {
            localobe2.ak = localobe2.a();
          }
          paramqal.c(localobe2.ak);
          localobe2.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      String str4 = this.c;
      paramqal.c(50);
      paramqal.a(str4);
    }
    if (this.d != null)
    {
      boolean bool5 = this.d.booleanValue();
      paramqal.c(56);
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
    if (this.e != null)
    {
      String str3 = this.e;
      paramqal.c(66);
      paramqal.a(str3);
    }
    if (this.f != null)
    {
      boolean bool4 = this.f.booleanValue();
      paramqal.c(72);
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
    if (this.g != null)
    {
      obe localobe1 = this.g;
      paramqal.c(82);
      if (localobe1.ak < 0) {
        localobe1.ak = localobe1.a();
      }
      paramqal.c(localobe1.ak);
      localobe1.a(paramqal);
    }
    if (this.h != null)
    {
      String str2 = this.h;
      paramqal.c(90);
      paramqal.a(str2);
    }
    if (this.a != -2147483648)
    {
      int i2 = this.a;
      paramqal.c(96);
      paramqal.a(i2);
    }
    if (this.i != null)
    {
      boolean bool3 = this.i.booleanValue();
      paramqal.c(104);
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
      String str1 = this.j;
      paramqal.c(114);
      paramqal.a(str1);
    }
    if (this.k != null)
    {
      boolean bool2 = this.k.booleanValue();
      paramqal.c(120);
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
      paramqal.c(128);
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
 * Qualified Name:     obd
 * JD-Core Version:    0.7.0.1
 */