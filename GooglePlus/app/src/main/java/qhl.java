public final class qhl
  extends qan<qhl>
{
  public qgm a = null;
  private String b = null;
  
  public qhl()
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
    if (this.b != null) {
      i += qal.b(2, this.b);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if (this.b != null) {
      paramqal.a(2, this.b);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qhl
 * JD-Core Version:    0.7.0.1
 */