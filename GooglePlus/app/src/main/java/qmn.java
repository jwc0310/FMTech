public final class qmn
  extends qan<qmn>
{
  public static final qao<qml, qmn> a = new qao(11, qmn.class, (int)600045770L, false);
  public Float b = null;
  public Integer c = null;
  public Float d = null;
  
  public qmn()
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
      i += qal.e(2, this.c.intValue());
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
      paramqal.a(2, this.c.intValue());
    }
    if (this.d != null) {
      paramqal.a(3, this.d.floatValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmn
 * JD-Core Version:    0.7.0.1
 */