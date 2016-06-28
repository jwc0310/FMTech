public final class mmp
  extends qan<mmp>
{
  public mmn[] a = mmn.b();
  
  public mmp()
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
        mmn localmmn = this.a[j];
        if (localmmn != null)
        {
          int k = qal.d(8);
          int m = localmmn.a();
          localmmn.ak = m;
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
        mmn localmmn = this.a[i];
        if (localmmn != null)
        {
          paramqal.c(10);
          if (localmmn.ak < 0) {
            localmmn.ak = localmmn.a();
          }
          paramqal.c(localmmn.ak);
          localmmn.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mmp
 * JD-Core Version:    0.7.0.1
 */