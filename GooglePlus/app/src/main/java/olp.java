public final class olp
  extends qan<olp>
{
  public String a = null;
  public Long b = null;
  private oky c = null;
  
  public olp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int m = qal.d(8);
      int n = qal.a(str);
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      i += qal.d(16) + qal.b(l);
    }
    if (this.c != null)
    {
      oky localoky = this.c;
      int j = qal.d(24);
      int k = localoky.a();
      localoky.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    if (this.c != null)
    {
      oky localoky = this.c;
      paramqal.c(26);
      if (localoky.ak < 0) {
        localoky.ak = localoky.a();
      }
      paramqal.c(localoky.ak);
      localoky.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olp
 * JD-Core Version:    0.7.0.1
 */