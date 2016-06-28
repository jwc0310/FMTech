public final class nmz
  extends qan<nmz>
{
  public nni[] a = nni.b();
  
  public nmz()
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
        nni localnni = this.a[j];
        if (localnni != null)
        {
          int k = qal.d(8);
          int m = localnni.a();
          localnni.ak = m;
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
        nni localnni = this.a[i];
        if (localnni != null)
        {
          paramqal.c(10);
          if (localnni.ak < 0) {
            localnni.ak = localnni.a();
          }
          paramqal.c(localnni.ak);
          localnni.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmz
 * JD-Core Version:    0.7.0.1
 */