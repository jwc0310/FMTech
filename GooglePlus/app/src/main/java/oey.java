public final class oey
  extends qan<oey>
{
  public String a = null;
  public int b = -2147483648;
  
  public oey()
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
      int n = qal.d(8);
      int i1 = qal.a(str);
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.b != -2147483648)
    {
      j = this.b;
      k = qal.d(16);
      if (j < 0) {
        break label85;
      }
    }
    label85:
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
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(16);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oey
 * JD-Core Version:    0.7.0.1
 */