public final class not
  extends qan<not>
{
  private nou[] a = nou.b();
  
  public not()
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
        nou localnou = this.a[j];
        if (localnou != null)
        {
          int k = qal.d(32);
          int m = localnou.a();
          localnou.ak = m;
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
        nou localnou = this.a[i];
        if (localnou != null)
        {
          paramqal.c(34);
          if (localnou.ak < 0) {
            localnou.ak = localnou.a();
          }
          paramqal.c(localnou.ak);
          localnou.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     not
 * JD-Core Version:    0.7.0.1
 */