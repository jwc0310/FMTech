public final class qmb
  extends qan<qmb>
{
  public static final qao<qml, qmb> a = new qao(11, qmb.class, (int)338267866L, false);
  public Integer b = null;
  public Float c = null;
  public Float d = null;
  public Float e = null;
  public qmz f = null;
  public Float g = null;
  
  public qmb()
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
      i += qal.c(5, this.f);
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
      paramqal.a(5, this.f);
    }
    if (this.g != null) {
      paramqal.a(6, this.g.floatValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmb
 * JD-Core Version:    0.7.0.1
 */