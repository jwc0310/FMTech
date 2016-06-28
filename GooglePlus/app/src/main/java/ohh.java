public final class ohh
  extends qan<ohh>
{
  public oms a = null;
  
  public ohh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oms localoms = this.a;
      int j = qal.d(8);
      int k = localoms.a();
      localoms.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oms localoms = this.a;
      paramqal.c(10);
      if (localoms.ak < 0) {
        localoms.ak = localoms.a();
      }
      paramqal.c(localoms.ak);
      localoms.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohh
 * JD-Core Version:    0.7.0.1
 */