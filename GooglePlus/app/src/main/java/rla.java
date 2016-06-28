public final class rla
  extends qan<rla>
{
  public String[] a = qay.f;
  private Integer b = null;
  
  public rla()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.b != null) {
      j += qal.e(1, this.b.intValue());
    }
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
      j = j + k + m * 1;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null) {
      paramqal.a(1, this.b.intValue());
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        String str = this.a[i];
        if (str != null) {
          paramqal.a(2, str);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rla
 * JD-Core Version:    0.7.0.1
 */