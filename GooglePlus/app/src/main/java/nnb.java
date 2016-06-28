public final class nnb
  extends qan<nnb>
{
  public nnk a = null;
  
  public nnb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nnk localnnk = this.a;
      int j = qal.d(8);
      int k = localnnk.a();
      localnnk.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nnk localnnk = this.a;
      paramqal.c(10);
      if (localnnk.ak < 0) {
        localnnk.ak = localnnk.a();
      }
      paramqal.c(localnnk.ak);
      localnnk.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nnb
 * JD-Core Version:    0.7.0.1
 */