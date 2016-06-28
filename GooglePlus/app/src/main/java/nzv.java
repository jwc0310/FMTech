public final class nzv
  extends qan<nzv>
{
  private nzu[] a = nzu.b();
  
  public nzv()
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
        nzu localnzu = this.a[j];
        if (localnzu != null)
        {
          int k = qal.d(8);
          int m = localnzu.a();
          localnzu.ak = m;
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
        nzu localnzu = this.a[i];
        if (localnzu != null)
        {
          paramqal.c(10);
          if (localnzu.ak < 0) {
            localnzu.ak = localnzu.a();
          }
          paramqal.c(localnzu.ak);
          localnzu.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzv
 * JD-Core Version:    0.7.0.1
 */