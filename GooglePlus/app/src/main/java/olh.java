public final class olh
  extends qan<olh>
{
  private oli[] a = oli.b();
  
  public olh()
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
        oli localoli = this.a[j];
        if (localoli != null)
        {
          int k = qal.d(8);
          int m = localoli.a();
          localoli.ak = m;
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
        oli localoli = this.a[i];
        if (localoli != null)
        {
          paramqal.c(10);
          if (localoli.ak < 0) {
            localoli.ak = localoli.a();
          }
          paramqal.c(localoli.ak);
          localoli.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olh
 * JD-Core Version:    0.7.0.1
 */