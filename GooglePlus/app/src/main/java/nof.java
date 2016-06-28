import java.nio.ByteBuffer;

public final class nof
  extends qan<nof>
{
  public mjk[] a = mjk.b();
  public nnr b = null;
  public Long c = null;
  public Long d = null;
  public noj e = null;
  public mjq f = null;
  private Boolean g = null;
  private mjq h = null;
  private Long i = null;
  private Boolean j = null;
  
  public nof()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i7 = 0; i7 < this.a.length; i7++)
      {
        mjk localmjk = this.a[i7];
        if (localmjk != null)
        {
          int i8 = qal.d(8);
          int i9 = localmjk.a();
          localmjk.ak = i9;
          k += i8 + (i9 + qal.d(i9));
        }
      }
    }
    if (this.b != null)
    {
      nnr localnnr = this.b;
      int i5 = qal.d(16);
      int i6 = localnnr.a();
      localnnr.ak = i6;
      k += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      long l3 = this.c.longValue();
      k += qal.d(24) + qal.b(l3);
    }
    if (this.d != null)
    {
      long l2 = this.d.longValue();
      k += qal.d(32) + qal.b(l2);
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      k += 1 + qal.d(40);
    }
    if (this.e != null)
    {
      noj localnoj = this.e;
      int i3 = qal.d(48);
      int i4 = localnoj.a();
      localnoj.ak = i4;
      k += i3 + (i4 + qal.d(i4));
    }
    if (this.h != null)
    {
      mjq localmjq2 = this.h;
      int i1 = qal.d(56);
      int i2 = localmjq2.a();
      localmjq2.ak = i2;
      k += i1 + (i2 + qal.d(i2));
    }
    if (this.f != null)
    {
      mjq localmjq1 = this.f;
      int m = qal.d(64);
      int n = localmjq1.a();
      localmjq1.ak = n;
      k += m + (n + qal.d(n));
    }
    if (this.i != null)
    {
      long l1 = this.i.longValue();
      k += qal.d(72) + qal.b(l1);
    }
    if (this.j != null)
    {
      this.j.booleanValue();
      k += 1 + qal.d(80);
    }
    return k;
  }
  
  public final void a(qal paramqal)
  {
    int k = 1;
    if ((this.a != null) && (this.a.length > 0)) {
      for (int n = 0; n < this.a.length; n++)
      {
        mjk localmjk = this.a[n];
        if (localmjk != null)
        {
          paramqal.c(10);
          if (localmjk.ak < 0) {
            localmjk.ak = localmjk.a();
          }
          paramqal.c(localmjk.ak);
          localmjk.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      nnr localnnr = this.b;
      paramqal.c(18);
      if (localnnr.ak < 0) {
        localnnr.ak = localnnr.a();
      }
      paramqal.c(localnnr.ak);
      localnnr.a(paramqal);
    }
    if (this.c != null)
    {
      long l3 = this.c.longValue();
      paramqal.c(24);
      paramqal.a(l3);
    }
    if (this.d != null)
    {
      long l2 = this.d.longValue();
      paramqal.c(32);
      paramqal.a(l2);
    }
    if (this.g != null)
    {
      boolean bool2 = this.g.booleanValue();
      paramqal.c(40);
      if (bool2) {}
      byte b2;
      for (int m = k;; m = 0)
      {
        b2 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.e != null)
    {
      noj localnoj = this.e;
      paramqal.c(50);
      if (localnoj.ak < 0) {
        localnoj.ak = localnoj.a();
      }
      paramqal.c(localnoj.ak);
      localnoj.a(paramqal);
    }
    if (this.h != null)
    {
      mjq localmjq2 = this.h;
      paramqal.c(58);
      if (localmjq2.ak < 0) {
        localmjq2.ak = localmjq2.a();
      }
      paramqal.c(localmjq2.ak);
      localmjq2.a(paramqal);
    }
    if (this.f != null)
    {
      mjq localmjq1 = this.f;
      paramqal.c(66);
      if (localmjq1.ak < 0) {
        localmjq1.ak = localmjq1.a();
      }
      paramqal.c(localmjq1.ak);
      localmjq1.a(paramqal);
    }
    if (this.i != null)
    {
      long l1 = this.i.longValue();
      paramqal.c(72);
      paramqal.a(l1);
    }
    if (this.j != null)
    {
      boolean bool1 = this.j.booleanValue();
      paramqal.c(80);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nof
 * JD-Core Version:    0.7.0.1
 */