public final class qlx
  extends qan<qlx>
{
  public static final qao<qml, qlx> a = new qao(11, qlx.class, (int)343417394L, false);
  public Float b = null;
  public Float c = null;
  public Integer d = null;
  public Float e = null;
  private Float f = null;
  private Float g = null;
  
  public qlx()
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
      i += qal.e(3, this.d.intValue());
    }
    if (this.e != null) {
      i += qal.b(4, this.e.floatValue());
    }
    if (this.f != null) {
      i += qal.b(5, this.f.floatValue());
    }
    if (this.g != null) {
      i += qal.b(6, this.g.floatValue());
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
      paramqal.a(3, this.d.intValue());
    }
    if (this.e != null) {
      paramqal.a(4, this.e.floatValue());
    }
    if (this.f != null) {
      paramqal.a(5, this.f.floatValue());
    }
    if (this.g != null) {
      paramqal.a(6, this.g.floatValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qlx
 * JD-Core Version:    0.7.0.1
 */