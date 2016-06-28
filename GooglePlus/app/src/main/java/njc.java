import java.nio.ByteBuffer;

public final class njc
  extends qan<njc>
{
  public int a = -2147483648;
  private Integer b = null;
  private Integer c = null;
  private Boolean d = null;
  private Boolean e = null;
  private Boolean f = null;
  private int[] g = qay.a;
  private Integer h = null;
  private Boolean i = null;
  
  public njc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int j = 0;
    int k = 10;
    int m = super.a();
    int i13;
    int i14;
    if (this.b != null)
    {
      int i12 = this.b.intValue();
      i13 = qal.d(8);
      if (i12 >= 0) {
        i14 = qal.d(i12);
      }
    }
    for (int n = m + (i14 + i13);; n = m)
    {
      int i11;
      label89:
      int i8;
      label187:
      int i3;
      label242:
      int i4;
      if (this.c != null)
      {
        int i9 = this.c.intValue();
        int i10 = qal.d(16);
        if (i9 >= 0)
        {
          i11 = qal.d(i9);
          n += i11 + i10;
        }
      }
      else
      {
        if (this.d != null)
        {
          this.d.booleanValue();
          n += 1 + qal.d(24);
        }
        if (this.e != null)
        {
          this.e.booleanValue();
          n += 1 + qal.d(32);
        }
        if (this.a != -2147483648)
        {
          int i6 = this.a;
          int i7 = qal.d(40);
          if (i6 < 0) {
            break label296;
          }
          i8 = qal.d(i6);
          n += i8 + i7;
        }
        if (this.f != null)
        {
          this.f.booleanValue();
          n += 1 + qal.d(48);
        }
        if ((this.g == null) || (this.g.length <= 0)) {
          break label322;
        }
        i3 = 0;
        if (i3 >= this.g.length) {
          break label308;
        }
        i4 = this.g[i3];
        if (i4 < 0) {
          break label302;
        }
      }
      label296:
      label302:
      for (int i5 = qal.d(i4);; i5 = k)
      {
        j += i5;
        i3++;
        break label242;
        i14 = k;
        break;
        i11 = k;
        break label89;
        i8 = k;
        break label187;
      }
      label308:
      n = n + j + 1 * this.g.length;
      label322:
      if (this.h != null)
      {
        int i1 = this.h.intValue();
        int i2 = qal.d(64);
        if (i1 >= 0) {
          k = qal.d(i1);
        }
        n += k + i2;
      }
      if (this.i != null)
      {
        this.i.booleanValue();
        n += 1 + qal.d(72);
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    int j = 1;
    if (this.b != null)
    {
      int i6 = this.b.intValue();
      paramqal.c(8);
      paramqal.a(i6);
    }
    if (this.c != null)
    {
      int i5 = this.c.intValue();
      paramqal.c(16);
      paramqal.a(i5);
    }
    if (this.d != null)
    {
      boolean bool4 = this.d.booleanValue();
      paramqal.c(24);
      if (bool4) {}
      byte b4;
      for (int i4 = j;; i4 = 0)
      {
        b4 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.e != null)
    {
      boolean bool3 = this.e.booleanValue();
      paramqal.c(32);
      if (bool3) {}
      byte b3;
      for (int i3 = j;; i3 = 0)
      {
        b3 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.a != -2147483648)
    {
      int i2 = this.a;
      paramqal.c(40);
      paramqal.a(i2);
    }
    if (this.f != null)
    {
      boolean bool2 = this.f.booleanValue();
      paramqal.c(48);
      if (bool2) {}
      byte b2;
      for (int i1 = j;; i1 = 0)
      {
        b2 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int m = 0; m < this.g.length; m++)
      {
        int n = this.g[m];
        paramqal.c(56);
        paramqal.a(n);
      }
    }
    if (this.h != null)
    {
      int k = this.h.intValue();
      paramqal.c(64);
      paramqal.a(k);
    }
    if (this.i != null)
    {
      boolean bool1 = this.i.booleanValue();
      paramqal.c(72);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        j = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     njc
 * JD-Core Version:    0.7.0.1
 */