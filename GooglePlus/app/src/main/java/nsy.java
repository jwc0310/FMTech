public final class nsy
  extends qan<nsy>
{
  public ojj a = null;
  
  public nsy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ojj localojj = this.a;
      int j = qal.d(8);
      int k = localojj.a();
      localojj.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ojj localojj = this.a;
      paramqal.c(10);
      if (localojj.ak < 0) {
        localojj.ak = localojj.a();
      }
      paramqal.c(localojj.ak);
      localojj.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsy
 * JD-Core Version:    0.7.0.1
 */