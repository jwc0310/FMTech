public final class qmv
  extends qan<qmv>
{
  public static final qao<qml, qmv> a = new qao(11, qmv.class, (int)584431770L, false);
  public Float b = null;
  public Float c = null;
  public Float d = null;
  public Float e = null;
  public Float f = null;
  
  public qmv()
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
    if (this.f != null) {
      i += qal.b(5, this.f.floatValue());
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
    if (this.f != null) {
      paramqal.a(5, this.f.floatValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmv
 * JD-Core Version:    0.7.0.1
 */