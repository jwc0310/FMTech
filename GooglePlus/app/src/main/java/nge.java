public final class nge
  extends qan<nge>
{
  public okr[] a = okr.b();
  
  public nge()
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
        okr localokr = this.a[j];
        if (localokr != null)
        {
          int k = qal.d(8);
          int m = localokr.a();
          localokr.ak = m;
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
        okr localokr = this.a[i];
        if (localokr != null)
        {
          paramqal.c(10);
          if (localokr.ak < 0) {
            localokr.ak = localokr.a();
          }
          paramqal.c(localokr.ak);
          localokr.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nge
 * JD-Core Version:    0.7.0.1
 */