public final class ohf
  extends qan<ohf>
{
  public mii[] a = mii.b();
  
  public ohf()
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
        mii localmii = this.a[j];
        if (localmii != null)
        {
          int k = qal.d(8);
          int m = localmii.a();
          localmii.ak = m;
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
        mii localmii = this.a[i];
        if (localmii != null)
        {
          paramqal.c(10);
          if (localmii.ak < 0) {
            localmii.ak = localmii.a();
          }
          paramqal.c(localmii.ak);
          localmii.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohf
 * JD-Core Version:    0.7.0.1
 */