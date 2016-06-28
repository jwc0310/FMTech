public final class ohb
  extends qan<ohb>
{
  public Long a = null;
  public String[] b = qay.f;
  
  public ohb()
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
      long l = this.a.longValue();
      j += qal.d(8) + qal.b(l);
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.b.length)
      {
        String str = this.b[i];
        if (str != null)
        {
          m++;
          int n = qal.a(str);
          k += n + qal.d(n);
        }
        i++;
      }
      j = j + k + m * 1;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      long l = this.a.longValue();
      paramqal.c(8);
      paramqal.a(l);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        String str = this.b[i];
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
 * Qualified Name:     ohb
 * JD-Core Version:    0.7.0.1
 */