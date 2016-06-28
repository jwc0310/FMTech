public final class ooi
  extends qan<ooi>
{
  private String a = null;
  private pqm b = null;
  
  public ooi()
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
      pqm localpqm = this.b;
      int j = qal.d(16);
      int k = localpqm.a();
      localpqm.ak = k;
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
      pqm localpqm = this.b;
      paramqal.c(18);
      if (localpqm.ak < 0) {
        localpqm.ak = localpqm.a();
      }
      paramqal.c(localpqm.ak);
      localpqm.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ooi
 * JD-Core Version:    0.7.0.1
 */