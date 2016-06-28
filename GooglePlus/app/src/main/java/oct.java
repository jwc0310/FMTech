public final class oct
  extends qan<oct>
{
  private String a = null;
  private int[] b = qay.a;
  
  public oct()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i1 = qal.d(8);
      int i2 = qal.a(str);
      j += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int k = 0;
      if (i < this.b.length)
      {
        int m = this.b[i];
        if (m >= 0) {}
        for (int n = qal.d(m);; n = 10)
        {
          k += n;
          i++;
          break;
        }
      }
      j = j + k + 1 * this.b.length;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        int j = this.b[i];
        paramqal.c(16);
        paramqal.a(j);
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oct
 * JD-Core Version:    0.7.0.1
 */