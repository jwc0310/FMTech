public final class qmt
  extends qan<qmt>
{
  public static final qao<qml, qmt> a = new qao(11, qmt.class, (int)344987650L, false);
  public Float b = null;
  public qmd c = null;
  private int d = -2147483648;
  
  public qmt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null) {
      i += qal.b(1, this.b.floatValue());
    }
    if (this.c != null) {
      i += qal.c(2, this.c);
    }
    if (this.d != -2147483648) {
      i += qal.e(3, this.d);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null) {
      paramqal.a(1, this.b.floatValue());
    }
    if (this.c != null) {
      paramqal.a(2, this.c);
    }
    if (this.d != -2147483648) {
      paramqal.a(3, this.d);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmt
 * JD-Core Version:    0.7.0.1
 */