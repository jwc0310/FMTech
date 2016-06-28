public final class off
  extends qan<off>
{
  public odt a = null;
  
  public off()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      odt localodt = this.a;
      int j = qal.d(8);
      int k = localodt.a();
      localodt.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      odt localodt = this.a;
      paramqal.c(10);
      if (localodt.ak < 0) {
        localodt.ak = localodt.a();
      }
      paramqal.c(localodt.ak);
      localodt.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     off
 * JD-Core Version:    0.7.0.1
 */