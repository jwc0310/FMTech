public final class mjc
  extends qan<mjc>
{
  public String[] a = qay.f;
  
  public mjc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.a.length)
      {
        String str = this.a[i];
        if (str != null)
        {
          m++;
          int n = qal.a(str);
          k += n + qal.d(n);
        }
        i++;
      }
      return j + k + m * 1;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        String str = this.a[i];
        if (str != null)
        {
          paramqal.c(18);
          paramqal.a(str);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mjc
 * JD-Core Version:    0.7.0.1
 */