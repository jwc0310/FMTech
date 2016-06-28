public final class ngp
  extends qan<ngp>
{
  public qbr[] a = qbr.b();
  private String b = null;
  
  public ngp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int m = 0; m < this.a.length; m++)
      {
        qbr localqbr = this.a[m];
        if (localqbr != null)
        {
          int n = qal.d(8);
          int i1 = localqbr.a();
          localqbr.ak = i1;
          i += n + (i1 + qal.d(i1));
        }
      }
    }
    if (this.b != null)
    {
      String str = this.b;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        qbr localqbr = this.a[i];
        if (localqbr != null)
        {
          paramqal.c(10);
          if (localqbr.ak < 0) {
            localqbr.ak = localqbr.a();
          }
          paramqal.c(localqbr.ak);
          localqbr.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ngp
 * JD-Core Version:    0.7.0.1
 */