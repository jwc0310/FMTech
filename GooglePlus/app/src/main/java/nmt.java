import java.nio.ByteBuffer;

public final class nmt
  extends qan<nmt>
{
  private int a = -2147483648;
  private Boolean b = null;
  private int c = -2147483648;
  private Boolean d = null;
  private Boolean e = null;
  private String f = null;
  private Integer g = null;
  private Integer h = null;
  private Boolean i = null;
  private String j = null;
  
  public nmt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = 10;
    int m = super.a();
    int i14;
    int i15;
    if (this.a != -2147483648)
    {
      int i13 = this.a;
      i14 = qal.d(8);
      if (i13 >= 0) {
        i15 = qal.d(i13);
      }
    }
    for (int n = m + (i15 + i14);; n = m)
    {
      if (this.b != null)
      {
        this.b.booleanValue();
        n += 1 + qal.d(16);
      }
      int i12;
      label109:
      int i5;
      int i6;
      if (this.c != -2147483648)
      {
        int i10 = this.c;
        int i11 = qal.d(24);
        if (i10 >= 0)
        {
          i12 = qal.d(i10);
          n += i12 + i11;
        }
      }
      else
      {
        if (this.d != null)
        {
          this.d.booleanValue();
          n += 1 + qal.d(32);
        }
        if (this.e != null)
        {
          this.e.booleanValue();
          n += 1 + qal.d(40);
        }
        if (this.f != null)
        {
          String str2 = this.f;
          int i8 = qal.d(48);
          int i9 = qal.a(str2);
          n += i8 + (i9 + qal.d(i9));
        }
        if (this.g != null)
        {
          i5 = this.g.intValue();
          i6 = qal.d(56);
          if (i5 < 0) {
            break label372;
          }
        }
      }
      label372:
      for (int i7 = qal.d(i5);; i7 = k)
      {
        n += i7 + i6;
        if (this.h != null)
        {
          int i3 = this.h.intValue();
          int i4 = qal.d(64);
          if (i3 >= 0) {
            k = qal.d(i3);
          }
          n += k + i4;
        }
        if (this.i != null)
        {
          this.i.booleanValue();
          n += 1 + qal.d(72);
        }
        if (this.j != null)
        {
          String str1 = this.j;
          int i1 = qal.d(80);
          int i2 = qal.a(str1);
          n += i1 + (i2 + qal.d(i2));
        }
        return n;
        i15 = k;
        break;
        i12 = k;
        break label109;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    int k = 1;
    if (this.a != -2147483648)
    {
      int i5 = this.a;
      paramqal.c(8);
      paramqal.a(i5);
    }
    if (this.b != null)
    {
      boolean bool4 = this.b.booleanValue();
      paramqal.c(16);
      if (bool4) {}
      byte b4;
      for (int i4 = k;; i4 = 0)
      {
        b4 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.c != -2147483648)
    {
      int i3 = this.c;
      paramqal.c(24);
      paramqal.a(i3);
    }
    if (this.d != null)
    {
      boolean bool3 = this.d.booleanValue();
      paramqal.c(32);
      if (bool3) {}
      byte b3;
      for (int i2 = k;; i2 = 0)
      {
        b3 = (byte)i2;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.e != null)
    {
      boolean bool2 = this.e.booleanValue();
      paramqal.c(40);
      if (bool2) {}
      byte b2;
      for (int i1 = k;; i1 = 0)
      {
        b2 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.f != null)
    {
      String str2 = this.f;
      paramqal.c(50);
      paramqal.a(str2);
    }
    if (this.g != null)
    {
      int n = this.g.intValue();
      paramqal.c(56);
      paramqal.a(n);
    }
    if (this.h != null)
    {
      int m = this.h.intValue();
      paramqal.c(64);
      paramqal.a(m);
    }
    if (this.i != null)
    {
      boolean bool1 = this.i.booleanValue();
      paramqal.c(72);
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
    if (this.j != null)
    {
      String str1 = this.j;
      paramqal.c(82);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmt
 * JD-Core Version:    0.7.0.1
 */