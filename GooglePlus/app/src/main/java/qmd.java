public final class qmd
  extends qan<qmd>
{
  public qmp a = null;
  public int b = -2147483648;
  
  public qmd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.c(1, this.a);
    }
    if (this.b != -2147483648) {
      i += qal.e(2, this.b);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if (this.b != -2147483648) {
      paramqal.a(2, this.b);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmd
 * JD-Core Version:    0.7.0.1
 */