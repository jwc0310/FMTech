public final class nqh
  extends qan<nqh>
{
  public qmg a = null;
  
  public nqh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      qmg localqmg = this.a;
      int j = qal.d(8);
      int k = localqmg.a();
      localqmg.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      qmg localqmg = this.a;
      paramqal.c(10);
      if (localqmg.ak < 0) {
        localqmg.ak = localqmg.a();
      }
      paramqal.c(localqmg.ak);
      localqmg.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqh
 * JD-Core Version:    0.7.0.1
 */