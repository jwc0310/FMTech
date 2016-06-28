public final class nrr
  extends qan<nrr>
{
  private qfe a = null;
  private qfi b = null;
  private pxd c = null;
  private reu d = null;
  private Long e = null;
  
  public nrr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      qfe localqfe = this.a;
      int i3 = qal.d(8);
      int i4 = localqfe.a();
      localqfe.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      qfi localqfi = this.b;
      int i1 = qal.d(16);
      int i2 = localqfi.a();
      localqfi.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      pxd localpxd = this.c;
      int m = qal.d(24);
      int n = localpxd.a();
      localpxd.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      reu localreu = this.d;
      int j = qal.d(32);
      int k = localreu.a();
      localreu.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.e != null)
    {
      long l = this.e.longValue();
      i += qal.d(40) + qal.b(l);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      qfe localqfe = this.a;
      paramqal.c(10);
      if (localqfe.ak < 0) {
        localqfe.ak = localqfe.a();
      }
      paramqal.c(localqfe.ak);
      localqfe.a(paramqal);
    }
    if (this.b != null)
    {
      qfi localqfi = this.b;
      paramqal.c(18);
      if (localqfi.ak < 0) {
        localqfi.ak = localqfi.a();
      }
      paramqal.c(localqfi.ak);
      localqfi.a(paramqal);
    }
    if (this.c != null)
    {
      pxd localpxd = this.c;
      paramqal.c(26);
      if (localpxd.ak < 0) {
        localpxd.ak = localpxd.a();
      }
      paramqal.c(localpxd.ak);
      localpxd.a(paramqal);
    }
    if (this.d != null)
    {
      reu localreu = this.d;
      paramqal.c(34);
      if (localreu.ak < 0) {
        localreu.ak = localreu.a();
      }
      paramqal.c(localreu.ak);
      localreu.a(paramqal);
    }
    if (this.e != null)
    {
      long l = this.e.longValue();
      paramqal.c(40);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nrr
 * JD-Core Version:    0.7.0.1
 */