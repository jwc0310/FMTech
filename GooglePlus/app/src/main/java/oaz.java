public final class oaz
  extends qan<oaz>
{
  private ndm a = null;
  
  public oaz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ndm localndm = this.a;
      int j = qal.d(8);
      int k = localndm.a();
      localndm.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ndm localndm = this.a;
      paramqal.c(10);
      if (localndm.ak < 0) {
        localndm.ak = localndm.a();
      }
      paramqal.c(localndm.ak);
      localndm.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oaz
 * JD-Core Version:    0.7.0.1
 */