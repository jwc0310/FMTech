public final class qhh
  extends qan<qhh>
{
  public qhg[] a = qhg.b();
  private int b = -2147483648;
  private int c = -2147483648;
  
  public qhh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != -2147483648) {
      i += qal.e(1, this.b);
    }
    if ((this.a != null) && (this.a.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.a.length; k++)
      {
        qhg localqhg = this.a[k];
        if (localqhg != null) {
          j += qal.c(2, localqhg);
        }
      }
      i = j;
    }
    if (this.c != -2147483648) {
      i += qal.e(3, this.c);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648) {
      paramqal.a(1, this.b);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        qhg localqhg = this.a[i];
        if (localqhg != null) {
          paramqal.a(2, localqhg);
        }
      }
    }
    if (this.c != -2147483648) {
      paramqal.a(3, this.c);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qhh
 * JD-Core Version:    0.7.0.1
 */