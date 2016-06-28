public final class qmc
  extends qan<qmc>
{
  public static final qao<qml, qmc> a = new qao(11, qmc.class, (int)611388194L, false);
  public Float b = null;
  public Float c = null;
  public Float d = null;
  
  public qmc()
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
      i += qal.b(2, this.c.floatValue());
    }
    if (this.d != null) {
      i += qal.b(3, this.d.floatValue());
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null) {
      paramqal.a(1, this.b.floatValue());
    }
    if (this.c != null) {
      paramqal.a(2, this.c.floatValue());
    }
    if (this.d != null) {
      paramqal.a(3, this.d.floatValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmc
 * JD-Core Version:    0.7.0.1
 */