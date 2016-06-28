import java.nio.ByteBuffer;

public final class ntc
  extends qan<ntc>
{
  public String a = null;
  public Boolean b = null;
  public int[] c = qay.a;
  public Integer d = null;
  public Integer e = null;
  public int f = -2147483648;
  public String g = null;
  public Boolean h = null;
  private Integer i = null;
  private Boolean j = null;
  private Boolean k = null;
  
  public ntc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = 0;
    int n = 10;
    int i1 = super.a();
    if (this.a != null)
    {
      String str2 = this.a;
      int i18 = qal.d(8);
      int i19 = qal.a(str2);
      i1 += i18 + (i19 + qal.d(i19));
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i1 += 1 + qal.d(16);
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i15 = 0;
      if (m < this.c.length)
      {
        int i16 = this.c[m];
        if (i16 >= 0) {}
        for (int i17 = qal.d(i16);; i17 = n)
        {
          i15 += i17;
          m++;
          break;
        }
      }
      i1 = i1 + i15 + 1 * this.c.length;
    }
    int i14;
    int i11;
    label233:
    int i6;
    int i7;
    if (this.d != null)
    {
      int i12 = this.d.intValue();
      int i13 = qal.d(32);
      if (i12 >= 0)
      {
        i14 = qal.d(i12);
        i1 += i14 + i13;
      }
    }
    else
    {
      if (this.e != null)
      {
        int i9 = this.e.intValue();
        int i10 = qal.d(40);
        if (i9 < 0) {
          break label448;
        }
        i11 = qal.d(i9);
        i1 += i11 + i10;
      }
      if (this.i != null)
      {
        i6 = this.i.intValue();
        i7 = qal.d(48);
        if (i6 < 0) {
          break label454;
        }
      }
    }
    label448:
    label454:
    for (int i8 = qal.d(i6);; i8 = n)
    {
      i1 += i8 + i7;
      if (this.f != -2147483648)
      {
        int i4 = this.f;
        int i5 = qal.d(56);
        if (i4 >= 0) {
          n = qal.d(i4);
        }
        i1 += i5 + n;
      }
      if (this.g != null)
      {
        String str1 = this.g;
        int i2 = qal.d(64);
        int i3 = qal.a(str1);
        i1 += i2 + (i3 + qal.d(i3));
      }
      if (this.j != null)
      {
        this.j.booleanValue();
        i1 += 1 + qal.d(72);
      }
      if (this.k != null)
      {
        this.k.booleanValue();
        i1 += 1 + qal.d(80);
      }
      if (this.h != null)
      {
        this.h.booleanValue();
        i1 += 1 + qal.d(88);
      }
      return i1;
      i14 = n;
      break;
      i11 = n;
      break label233;
    }
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      boolean bool4 = this.b.booleanValue();
      paramqal.c(16);
      if (bool4) {}
      byte b4;
      for (int i8 = m;; i8 = 0)
      {
        b4 = (byte)i8;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i6 = 0; i6 < this.c.length; i6++)
      {
        int i7 = this.c[i6];
        paramqal.c(24);
        paramqal.a(i7);
      }
    }
    if (this.d != null)
    {
      int i5 = this.d.intValue();
      paramqal.c(32);
      paramqal.a(i5);
    }
    if (this.e != null)
    {
      int i4 = this.e.intValue();
      paramqal.c(40);
      paramqal.a(i4);
    }
    if (this.i != null)
    {
      int i3 = this.i.intValue();
      paramqal.c(48);
      paramqal.a(i3);
    }
    if (this.f != -2147483648)
    {
      int i2 = this.f;
      paramqal.c(56);
      paramqal.a(i2);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(66);
      paramqal.a(str1);
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
    if (this.h != null)
    {
      boolean bool1 = this.h.booleanValue();
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
 * Qualified Name:     ntc
 * JD-Core Version:    0.7.0.1
 */