public final class ndr
  extends qan<ndr>
{
  private static volatile ndr[] e;
  public Integer a = null;
  public Integer b = null;
  public Integer c = null;
  public String d = null;
  
  public ndr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ndr[] b()
  {
    if (e == null) {}
    synchronized (qar.a)
    {
      if (e == null) {
        e = new ndr[0];
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      int i1 = this.a.intValue();
      i += qal.d(8) + qal.d(i1);
    }
    if (this.b != null)
    {
      int n = this.b.intValue();
      i += qal.d(16) + qal.d(n);
    }
    if (this.c != null)
    {
      int m = this.c.intValue();
      i += qal.d(24) + qal.d(m);
    }
    if (this.d != null)
    {
      String str = this.d;
      int j = qal.d(32);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int k = this.a.intValue();
      paramqal.c(8);
      paramqal.c(k);
    }
    if (this.b != null)
    {
      int j = this.b.intValue();
      paramqal.c(16);
      paramqal.c(j);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(24);
      paramqal.c(i);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(34);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ndr
 * JD-Core Version:    0.7.0.1
 */