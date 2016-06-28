import java.nio.ByteBuffer;

public final class nwx
  extends qan<nwx>
{
  public int a = -2147483648;
  private Integer b = null;
  private int c = -2147483648;
  private Long d = null;
  private int[] e = qay.a;
  private nwq f = null;
  private Boolean g = null;
  private Boolean h = null;
  
  public nwx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i11;
    int i12;
    if (this.a != -2147483648)
    {
      int i10 = this.a;
      i11 = qal.d(8);
      if (i10 >= 0) {
        i12 = qal.d(i10);
      }
    }
    for (int k = j + (i12 + i11);; k = j)
    {
      int i9;
      label84:
      int i6;
      label126:
      int i1;
      label182:
      int i2;
      if (this.b != null)
      {
        int i7 = this.b.intValue();
        int i8 = qal.d(24);
        if (i7 >= 0)
        {
          i9 = qal.d(i7);
          k += i9 + i8;
        }
      }
      else
      {
        if (this.c != -2147483648)
        {
          int i4 = this.c;
          int i5 = qal.d(32);
          if (i4 < 0) {
            break label238;
          }
          i6 = qal.d(i4);
          k += i6 + i5;
        }
        if (this.d != null)
        {
          long l = this.d.longValue();
          k += qal.d(40) + qal.b(l);
        }
        if ((this.e == null) || (this.e.length <= 0)) {
          break label264;
        }
        i1 = 0;
        if (i1 >= this.e.length) {
          break label252;
        }
        i2 = this.e[i1];
        if (i2 < 0) {
          break label245;
        }
      }
      label238:
      label245:
      for (int i3 = qal.d(i2);; i3 = 10)
      {
        i += i3;
        i1++;
        break label182;
        i12 = 10;
        break;
        i9 = 10;
        break label84;
        i6 = 10;
        break label126;
      }
      label252:
      k = k + i + 1 * this.e.length;
      label264:
      if (this.f != null)
      {
        nwq localnwq = this.f;
        int m = qal.d(64);
        int n = localnwq.a();
        localnwq.ak = n;
        k += m + (n + qal.d(n));
      }
      if (this.g != null)
      {
        this.g.booleanValue();
        k += 1 + qal.d(72);
      }
      if (this.h != null)
      {
        this.h.booleanValue();
        k += 1 + qal.d(80);
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != -2147483648)
    {
      int i2 = this.a;
      paramqal.c(8);
      paramqal.a(i2);
    }
    if (this.b != null)
    {
      int i1 = this.b.intValue();
      paramqal.c(24);
      paramqal.a(i1);
    }
    if (this.c != -2147483648)
    {
      int n = this.c;
      paramqal.c(32);
      paramqal.a(n);
    }
    if (this.d != null)
    {
      long l = this.d.longValue();
      paramqal.c(40);
      paramqal.a(l);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int k = 0; k < this.e.length; k++)
      {
        int m = this.e[k];
        paramqal.c(48);
        paramqal.a(m);
      }
    }
    if (this.f != null)
    {
      nwq localnwq = this.f;
      paramqal.c(66);
      if (localnwq.ak < 0) {
        localnwq.ak = localnwq.a();
      }
      paramqal.c(localnwq.ak);
      localnwq.a(paramqal);
    }
    if (this.g != null)
    {
      boolean bool2 = this.g.booleanValue();
      paramqal.c(72);
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
    if (this.h != null)
    {
      boolean bool1 = this.h.booleanValue();
      paramqal.c(80);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwx
 * JD-Core Version:    0.7.0.1
 */