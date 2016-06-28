public final class qmm
  extends qan<qmm>
{
  public static final qao<qml, qmm> a = new qao(11, qmm.class, (int)360731882L, false);
  public Integer b = null;
  public Float c = null;
  public Integer d = null;
  public Integer e = null;
  
  public qmm()
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
      i += qal.e(3, this.d.intValue());
    }
    if (this.e != null) {
      i += qal.e(4, this.e.intValue());
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
      paramqal.a(3, this.d.intValue());
    }
    if (this.e != null) {
      paramqal.a(4, this.e.intValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmm
 * JD-Core Version:    0.7.0.1
 */