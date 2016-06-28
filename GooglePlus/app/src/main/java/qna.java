public final class qna
  extends qan<qna>
{
  public static final qao<qml, qna> a = new qao(11, qna.class, (int)388961858L, false);
  public Integer b = null;
  public Float c = null;
  public Float d = null;
  public Integer e = null;
  public Float f = null;
  public Float g = null;
  
  public qna()
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
      i += qal.e(4, this.e.intValue());
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
      paramqal.a(4, this.e.intValue());
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
 * Qualified Name:     qna
 * JD-Core Version:    0.7.0.1
 */