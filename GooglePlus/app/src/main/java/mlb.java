public final class mlb
  extends qan<mlb>
{
  public mla a = null;
  public int b = -2147483648;
  private mkx c = null;
  
  public mlb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mla localmla = this.a;
      int i2 = qal.d(8);
      int i3 = localmla.a();
      localmla.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.c != null)
    {
      mkx localmkx = this.c;
      int n = qal.d(16);
      int i1 = localmkx.a();
      localmkx.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.b != -2147483648)
    {
      j = this.b;
      k = qal.d(24);
      if (j < 0) {
        break label140;
      }
    }
    label140:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mla localmla = this.a;
      paramqal.c(10);
      if (localmla.ak < 0) {
        localmla.ak = localmla.a();
      }
      paramqal.c(localmla.ak);
      localmla.a(paramqal);
    }
    if (this.c != null)
    {
      mkx localmkx = this.c;
      paramqal.c(18);
      if (localmkx.ak < 0) {
        localmkx.ak = localmkx.a();
      }
      paramqal.c(localmkx.ak);
      localmkx.a(paramqal);
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(24);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlb
 * JD-Core Version:    0.7.0.1
 */