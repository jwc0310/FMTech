public final class nhh
  extends qan<nhh>
{
  public qbe a = null;
  private qbv b = null;
  
  public nhh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      qbv localqbv = this.b;
      int m = qal.d(8);
      int n = localqbv.a();
      localqbv.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.a != null)
    {
      qbe localqbe = this.a;
      int j = qal.d(16);
      int k = localqbe.a();
      localqbe.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      qbv localqbv = this.b;
      paramqal.c(10);
      if (localqbv.ak < 0) {
        localqbv.ak = localqbv.a();
      }
      paramqal.c(localqbv.ak);
      localqbv.a(paramqal);
    }
    if (this.a != null)
    {
      qbe localqbe = this.a;
      paramqal.c(18);
      if (localqbe.ak < 0) {
        localqbe.ak = localqbe.a();
      }
      paramqal.c(localqbe.ak);
      localqbe.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nhh
 * JD-Core Version:    0.7.0.1
 */