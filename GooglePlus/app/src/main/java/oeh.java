public final class oeh
  extends qan<oeh>
{
  public odw[] a = odw.b();
  
  public oeh()
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
        odw localodw = this.a[j];
        if (localodw != null)
        {
          int k = qal.d(8);
          int m = localodw.a();
          localodw.ak = m;
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
        odw localodw = this.a[i];
        if (localodw != null)
        {
          paramqal.c(10);
          if (localodw.ak < 0) {
            localodw.ak = localodw.a();
          }
          paramqal.c(localodw.ak);
          localodw.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oeh
 * JD-Core Version:    0.7.0.1
 */