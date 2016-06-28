public final class qms
  extends qan<qms>
{
  static final qms[] a = new qms[0];
  public Float b = null;
  public Float c = null;
  public Float d = null;
  public qmz e = null;
  public Float f = null;
  
  static
  {
    new qao(11, qnc.class, (int)330093682L, false);
  }
  
  public qms()
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
      i += qal.c(4, this.e);
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
      paramqal.a(4, this.e);
    }
    if (this.f != null) {
      paramqal.a(5, this.f.floatValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qms
 * JD-Core Version:    0.7.0.1
 */