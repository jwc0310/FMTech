public final class nyv
  extends qan<nyv>
{
  public qfp a = null;
  
  public nyv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      qfp localqfp = this.a;
      int j = qal.d(8);
      int k = localqfp.a();
      localqfp.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      qfp localqfp = this.a;
      paramqal.c(10);
      if (localqfp.ak < 0) {
        localqfp.ak = localqfp.a();
      }
      paramqal.c(localqfp.ak);
      localqfp.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nyv
 * JD-Core Version:    0.7.0.1
 */