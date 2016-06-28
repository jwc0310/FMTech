public final class ofy
  extends qan<ofy>
{
  private ofx[] a = ofx.b();
  
  public ofy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        ofx localofx = this.a[j];
        if (localofx != null)
        {
          int k = qal.d(8);
          int m = localofx.a();
          localofx.ak = m;
          i += k + (m + qal.d(m));
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        ofx localofx = this.a[i];
        if (localofx != null)
        {
          paramqal.c(10);
          if (localofx.ak < 0) {
            localofx.ak = localofx.a();
          }
          paramqal.c(localofx.ak);
          localofx.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ofy
 * JD-Core Version:    0.7.0.1
 */