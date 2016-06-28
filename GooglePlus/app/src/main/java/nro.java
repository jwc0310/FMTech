public final class nro
  extends qan<nro>
{
  public int a = -2147483648;
  public Long b = null;
  public Integer c = null;
  public String d = null;
  public pst e = null;
  public psm f = null;
  
  public nro()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i8;
    int i9;
    if (this.c != null)
    {
      int i7 = this.c.intValue();
      i8 = qal.d(16);
      if (i7 >= 0) {
        i9 = qal.d(i7);
      }
    }
    for (int k = j + (i9 + i8);; k = j)
    {
      if (this.d != null)
      {
        String str = this.d;
        int i5 = qal.d(24);
        int i6 = qal.a(str);
        k += i5 + (i6 + qal.d(i6));
      }
      if (this.e != null)
      {
        pst localpst = this.e;
        int i3 = qal.d(32);
        int i4 = localpst.a();
        localpst.ak = i4;
        k += i3 + (i4 + qal.d(i4));
      }
      if (this.f != null)
      {
        psm localpsm = this.f;
        int i1 = qal.d(40);
        int i2 = localpsm.a();
        localpsm.ak = i2;
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.a != -2147483648)
      {
        int m = this.a;
        int n = qal.d(48);
        if (m >= 0) {
          i = qal.d(m);
        }
        k += i + n;
      }
      if (this.b != null)
      {
        long l = this.b.longValue();
        k += qal.d(56) + qal.b(l);
      }
      return k;
      i9 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      int j = this.c.intValue();
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(26);
      paramqal.a(str);
    }
    if (this.e != null)
    {
      pst localpst = this.e;
      paramqal.c(34);
      if (localpst.ak < 0) {
        localpst.ak = localpst.a();
      }
      paramqal.c(localpst.ak);
      localpst.a(paramqal);
    }
    if (this.f != null)
    {
      psm localpsm = this.f;
      paramqal.c(42);
      if (localpsm.ak < 0) {
        localpsm.ak = localpsm.a();
      }
      paramqal.c(localpsm.ak);
      localpsm.a(paramqal);
    }
    if (this.a != -2147483648)
    {
      int i = this.a;
      paramqal.c(48);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      paramqal.c(56);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nro
 * JD-Core Version:    0.7.0.1
 */