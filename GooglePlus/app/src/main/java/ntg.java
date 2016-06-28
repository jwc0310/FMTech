public final class ntg
  extends qan<ntg>
{
  public opo a = null;
  
  public ntg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      opo localopo = this.a;
      int j = qal.d(8);
      int k = localopo.a();
      localopo.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      opo localopo = this.a;
      paramqal.c(10);
      if (localopo.ak < 0) {
        localopo.ak = localopo.a();
      }
      paramqal.c(localopo.ak);
      localopo.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ntg
 * JD-Core Version:    0.7.0.1
 */