public final class mmo
  extends qan<mmo>
{
  public mmn a = null;
  
  public mmo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mmn localmmn = this.a;
      int j = qal.d(8);
      int k = localmmn.a();
      localmmn.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mmn localmmn = this.a;
      paramqal.c(10);
      if (localmmn.ak < 0) {
        localmmn.ak = localmmn.a();
      }
      paramqal.c(localmmn.ak);
      localmmn.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mmo
 * JD-Core Version:    0.7.0.1
 */