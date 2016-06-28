import java.nio.ByteBuffer;

public final class nma
  extends qan<nma>
{
  private Integer a = null;
  private Integer b = null;
  private Integer c = null;
  private int d = -2147483648;
  private Boolean e = null;
  private Boolean f = null;
  private String g = null;
  private String h = null;
  
  public nma()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i12;
    int i13;
    if (this.a != null)
    {
      int i11 = this.a.intValue();
      i12 = qal.d(8);
      if (i11 >= 0) {
        i13 = qal.d(i11);
      }
    }
    for (int k = j + (i13 + i12);; k = j)
    {
      int i10;
      label86:
      int i5;
      int i6;
      if (this.b != null)
      {
        int i8 = this.b.intValue();
        int i9 = qal.d(16);
        if (i8 >= 0)
        {
          i10 = qal.d(i8);
          k += i10 + i9;
        }
      }
      else if (this.c != null)
      {
        i5 = this.c.intValue();
        i6 = qal.d(24);
        if (i5 < 0) {
          break label323;
        }
      }
      label323:
      for (int i7 = qal.d(i5);; i7 = i)
      {
        k += i7 + i6;
        if (this.d != -2147483648)
        {
          int i3 = this.d;
          int i4 = qal.d(32);
          if (i3 >= 0) {
            i = qal.d(i3);
          }
          k += i + i4;
        }
        if (this.e != null)
        {
          this.e.booleanValue();
          k += 1 + qal.d(40);
        }
        if (this.f != null)
        {
          this.f.booleanValue();
          k += 1 + qal.d(48);
        }
        if (this.g != null)
        {
          String str2 = this.g;
          int i1 = qal.d(56);
          int i2 = qal.a(str2);
          k += i1 + (i2 + qal.d(i2));
        }
        if (this.h != null)
        {
          String str1 = this.h;
          int m = qal.d(64);
          int n = qal.a(str1);
          k += m + (n + qal.d(n));
        }
        return k;
        i13 = i;
        break;
        i10 = i;
        break label86;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      int i1 = this.a.intValue();
      paramqal.c(8);
      paramqal.a(i1);
    }
    if (this.b != null)
    {
      int n = this.b.intValue();
      paramqal.c(16);
      paramqal.a(n);
    }
    if (this.c != null)
    {
      int m = this.c.intValue();
      paramqal.c(24);
      paramqal.a(m);
    }
    if (this.d != -2147483648)
    {
      int k = this.d;
      paramqal.c(32);
      paramqal.a(k);
    }
    if (this.e != null)
    {
      boolean bool2 = this.e.booleanValue();
      paramqal.c(40);
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
    if (this.f != null)
    {
      boolean bool1 = this.f.booleanValue();
      paramqal.c(48);
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
    if (this.g != null)
    {
      String str2 = this.g;
      paramqal.c(58);
      paramqal.a(str2);
    }
    if (this.h != null)
    {
      String str1 = this.h;
      paramqal.c(66);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nma
 * JD-Core Version:    0.7.0.1
 */