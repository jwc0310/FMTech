public final class odr
  extends qan<odr>
{
  public odq[] a = odq.b();
  
  public odr()
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
        odq localodq = this.a[j];
        if (localodq != null)
        {
          int k = qal.d(88);
          int m = localodq.a();
          localodq.ak = m;
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
        odq localodq = this.a[i];
        if (localodq != null)
        {
          paramqal.c(90);
          if (localodq.ak < 0) {
            localodq.ak = localodq.a();
          }
          paramqal.c(localodq.ak);
          localodq.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odr
 * JD-Core Version:    0.7.0.1
 */