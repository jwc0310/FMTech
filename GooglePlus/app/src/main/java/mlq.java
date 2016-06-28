public final class mlq
  extends qan<mlq>
{
  public mlp a = null;
  
  public mlq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mlp localmlp = this.a;
      int j = qal.d(8);
      int k = localmlp.a();
      localmlp.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mlp localmlp = this.a;
      paramqal.c(10);
      if (localmlp.ak < 0) {
        localmlp.ak = localmlp.a();
      }
      paramqal.c(localmlp.ak);
      localmlp.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlq
 * JD-Core Version:    0.7.0.1
 */