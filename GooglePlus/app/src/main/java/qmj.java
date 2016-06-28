public final class qmj
  extends qan<qmj>
{
  public static final qao<qml, qmj> a = new qao(11, qmj.class, (int)355666674L, false);
  public Integer b = null;
  public Float c = null;
  public Float d = null;
  public Float e = null;
  public Float f = null;
  public Float g = null;
  
  public qmj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null) {
      i += qal.e(1, this.b.intValue());
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
      paramqal.a(1, this.b.intValue());
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
 * Qualified Name:     qmj
 * JD-Core Version:    0.7.0.1
 */