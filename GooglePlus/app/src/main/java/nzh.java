import java.nio.ByteBuffer;

public final class nzh
  extends qan<nzh>
{
  public onm a = null;
  public opp b = null;
  public Boolean c = null;
  private Integer d = null;
  private opf e = null;
  private Boolean f = null;
  private olm g = null;
  
  public nzh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i7;
    int i8;
    if (this.d != null)
    {
      int i6 = this.d.intValue();
      i7 = qal.d(8);
      if (i6 >= 0) {
        i8 = qal.d(i6);
      }
    }
    for (int j = i + (i8 + i7);; j = i)
    {
      if (this.a != null)
      {
        onm localonm = this.a;
        int i4 = qal.d(16);
        int i5 = localonm.a();
        localonm.ak = i5;
        j += i4 + (i5 + qal.d(i5));
      }
      if (this.b != null)
      {
        opp localopp = this.b;
        int i2 = qal.d(24);
        int i3 = localopp.a();
        localopp.ak = i3;
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.c != null)
      {
        this.c.booleanValue();
        j += 1 + qal.d(32);
      }
      if (this.e != null)
      {
        opf localopf = this.e;
        int n = qal.d(40);
        int i1 = localopf.a();
        localopf.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.f != null)
      {
        this.f.booleanValue();
        j += 1 + qal.d(48);
      }
      if (this.g != null)
      {
        olm localolm = this.g;
        int k = qal.d(56);
        int m = localolm.a();
        localolm.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i8 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.d != null)
    {
      int k = this.d.intValue();
      paramqal.c(8);
      paramqal.a(k);
    }
    if (this.a != null)
    {
      onm localonm = this.a;
      paramqal.c(18);
      if (localonm.ak < 0) {
        localonm.ak = localonm.a();
      }
      paramqal.c(localonm.ak);
      localonm.a(paramqal);
    }
    if (this.b != null)
    {
      opp localopp = this.b;
      paramqal.c(26);
      if (localopp.ak < 0) {
        localopp.ak = localopp.a();
      }
      paramqal.c(localopp.ak);
      localopp.a(paramqal);
    }
    if (this.c != null)
    {
      boolean bool2 = this.c.booleanValue();
      paramqal.c(32);
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
    if (this.e != null)
    {
      opf localopf = this.e;
      paramqal.c(42);
      if (localopf.ak < 0) {
        localopf.ak = localopf.a();
      }
      paramqal.c(localopf.ak);
      localopf.a(paramqal);
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
      olm localolm = this.g;
      paramqal.c(58);
      if (localolm.ak < 0) {
        localolm.ak = localolm.a();
      }
      paramqal.c(localolm.ak);
      localolm.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzh
 * JD-Core Version:    0.7.0.1
 */