import java.nio.ByteBuffer;

public final class nqb
  extends qan<nqb>
{
  private static volatile nqb[] e;
  public oim a = null;
  public okn b = null;
  public Boolean c = null;
  public String d = null;
  private nqy f = null;
  private nqy g = null;
  private pss h = null;
  private Boolean i = null;
  private psl j = null;
  private nqk k = null;
  
  public nqb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nqb[] b()
  {
    if (e == null) {}
    synchronized (qar.a)
    {
      if (e == null) {
        e = new nqb[0];
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.f != null)
    {
      nqy localnqy2 = this.f;
      int i14 = qal.d(8);
      int i15 = localnqy2.a();
      localnqy2.ak = i15;
      m += i14 + (i15 + qal.d(i15));
    }
    if (this.g != null)
    {
      nqy localnqy1 = this.g;
      int i12 = qal.d(16);
      int i13 = localnqy1.a();
      localnqy1.ak = i13;
      m += i12 + (i13 + qal.d(i13));
    }
    if (this.a != null)
    {
      oim localoim = this.a;
      int i10 = qal.d(24);
      int i11 = localoim.a();
      localoim.ak = i11;
      m += i10 + (i11 + qal.d(i11));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      m += 1 + qal.d(32);
    }
    if (this.b != null)
    {
      okn localokn = this.b;
      int i8 = qal.d(40);
      int i9 = localokn.a();
      localokn.ak = i9;
      m += i8 + (i9 + qal.d(i9));
    }
    if (this.d != null)
    {
      String str = this.d;
      int i6 = qal.d(48);
      int i7 = qal.a(str);
      m += i6 + (i7 + qal.d(i7));
    }
    if (this.j != null)
    {
      psl localpsl = this.j;
      int i4 = qal.d(56);
      int i5 = localpsl.a();
      localpsl.ak = i5;
      m += i4 + (i5 + qal.d(i5));
    }
    if (this.h != null)
    {
      pss localpss = this.h;
      int i2 = qal.d(64);
      int i3 = localpss.a();
      localpss.ak = i3;
      m += i2 + (i3 + qal.d(i3));
    }
    if (this.k != null)
    {
      nqk localnqk = this.k;
      int n = qal.d(72);
      int i1 = localnqk.a();
      localnqk.ak = i1;
      m += n + (i1 + qal.d(i1));
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      m += 1 + qal.d(80);
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
    if (this.f != null)
    {
      nqy localnqy2 = this.f;
      paramqal.c(10);
      if (localnqy2.ak < 0) {
        localnqy2.ak = localnqy2.a();
      }
      paramqal.c(localnqy2.ak);
      localnqy2.a(paramqal);
    }
    if (this.g != null)
    {
      nqy localnqy1 = this.g;
      paramqal.c(18);
      if (localnqy1.ak < 0) {
        localnqy1.ak = localnqy1.a();
      }
      paramqal.c(localnqy1.ak);
      localnqy1.a(paramqal);
    }
    if (this.a != null)
    {
      oim localoim = this.a;
      paramqal.c(26);
      if (localoim.ak < 0) {
        localoim.ak = localoim.a();
      }
      paramqal.c(localoim.ak);
      localoim.a(paramqal);
    }
    if (this.c != null)
    {
      boolean bool2 = this.c.booleanValue();
      paramqal.c(32);
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
    if (this.b != null)
    {
      okn localokn = this.b;
      paramqal.c(42);
      if (localokn.ak < 0) {
        localokn.ak = localokn.a();
      }
      paramqal.c(localokn.ak);
      localokn.a(paramqal);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(50);
      paramqal.a(str);
    }
    if (this.j != null)
    {
      psl localpsl = this.j;
      paramqal.c(58);
      if (localpsl.ak < 0) {
        localpsl.ak = localpsl.a();
      }
      paramqal.c(localpsl.ak);
      localpsl.a(paramqal);
    }
    if (this.h != null)
    {
      pss localpss = this.h;
      paramqal.c(66);
      if (localpss.ak < 0) {
        localpss.ak = localpss.a();
      }
      paramqal.c(localpss.ak);
      localpss.a(paramqal);
    }
    if (this.k != null)
    {
      nqk localnqk = this.k;
      paramqal.c(74);
      if (localnqk.ak < 0) {
        localnqk.ak = localnqk.a();
      }
      paramqal.c(localnqk.ak);
      localnqk.a(paramqal);
    }
    if (this.i != null)
    {
      boolean bool1 = this.i.booleanValue();
      paramqal.c(80);
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
 * Qualified Name:     nqb
 * JD-Core Version:    0.7.0.1
 */