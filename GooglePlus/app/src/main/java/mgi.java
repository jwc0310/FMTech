public final class mgi
  extends qan<mgi>
{
  public mgj a = null;
  
  public mgi()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mgj localmgj = this.a;
      int j = qal.d(8);
      int k = localmgj.a();
      localmgj.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mgj localmgj = this.a;
      paramqal.c(10);
      if (localmgj.ak < 0) {
        localmgj.ak = localmgj.a();
      }
      paramqal.c(localmgj.ak);
      localmgj.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mgi
 * JD-Core Version:    0.7.0.1
 */