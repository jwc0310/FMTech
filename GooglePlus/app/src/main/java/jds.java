public final class jds
  extends qan<jds>
{
  public jdt[] a = jdt.b();
  
  public jds()
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
        jdt localjdt = this.a[j];
        if (localjdt != null)
        {
          int k = qal.d(8);
          int m = localjdt.a();
          localjdt.ak = m;
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
        jdt localjdt = this.a[i];
        if (localjdt != null)
        {
          paramqal.c(10);
          if (localjdt.ak < 0) {
            localjdt.ak = localjdt.a();
          }
          paramqal.c(localjdt.ak);
          localjdt.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jds
 * JD-Core Version:    0.7.0.1
 */