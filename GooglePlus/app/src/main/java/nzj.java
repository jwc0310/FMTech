import java.nio.ByteBuffer;

public final class nzj
  extends qan<nzj>
{
  public String a = null;
  public nzh b = null;
  private Boolean c = null;
  private Integer d = null;
  private onm e = null;
  private opp f = null;
  private String g = null;
  
  public nzj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str2 = this.a;
      int i8 = qal.d(8);
      int i9 = qal.a(str2);
      i += i8 + (i9 + qal.d(i9));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(16);
    }
    int i5;
    int i6;
    if (this.d != null)
    {
      i5 = this.d.intValue();
      i6 = qal.d(24);
      if (i5 < 0) {
        break label297;
      }
    }
    label297:
    for (int i7 = qal.d(i5);; i7 = 10)
    {
      i += i7 + i6;
      if (this.e != null)
      {
        onm localonm = this.e;
        int i3 = qal.d(32);
        int i4 = localonm.a();
        localonm.ak = i4;
        i += i3 + (i4 + qal.d(i4));
      }
      if (this.f != null)
      {
        opp localopp = this.f;
        int i1 = qal.d(40);
        int i2 = localopp.a();
        localopp.ak = i2;
        i += i1 + (i2 + qal.d(i2));
      }
      if (this.b != null)
      {
        nzh localnzh = this.b;
        int m = qal.d(48);
        int n = localnzh.a();
        localnzh.ak = n;
        i += m + (n + qal.d(n));
      }
      if (this.g != null)
      {
        String str1 = this.g;
        int j = qal.d(56);
        int k = qal.a(str1);
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
      paramqal.c(16);
      if (bool) {}
      byte b1;
      for (int j = 1;; j = 0)
      {
        b1 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.d != null)
    {
      int i = this.d.intValue();
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.e != null)
    {
      onm localonm = this.e;
      paramqal.c(34);
      if (localonm.ak < 0) {
        localonm.ak = localonm.a();
      }
      paramqal.c(localonm.ak);
      localonm.a(paramqal);
    }
    if (this.f != null)
    {
      opp localopp = this.f;
      paramqal.c(42);
      if (localopp.ak < 0) {
        localopp.ak = localopp.a();
      }
      paramqal.c(localopp.ak);
      localopp.a(paramqal);
    }
    if (this.b != null)
    {
      nzh localnzh = this.b;
      paramqal.c(50);
      if (localnzh.ak < 0) {
        localnzh.ak = localnzh.a();
      }
      paramqal.c(localnzh.ak);
      localnzh.a(paramqal);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(58);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzj
 * JD-Core Version:    0.7.0.1
 */