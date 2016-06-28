public final class qme
  extends qan<qme>
{
  public static final qao<qml, qme> a = new qao(11, qme.class, (int)325496562L, false);
  public Float b = null;
  public Float c = null;
  private Float d = null;
  private Float e = null;
  
  public qme()
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
    if (this.e != null) {
      i += qal.b(4, this.e.floatValue());
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
    if (this.e != null) {
      paramqal.a(4, this.e.floatValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qme
 * JD-Core Version:    0.7.0.1
 */