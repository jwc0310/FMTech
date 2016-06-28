public final class qmp
  extends qan<qmp>
{
  public Float a = null;
  public Float b = null;
  public Float c = null;
  public Float d = null;
  
  public qmp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.b(1, this.a.floatValue());
    }
    if (this.b != null) {
      i += qal.b(2, this.b.floatValue());
    }
    if (this.c != null) {
      i += qal.b(3, this.c.floatValue());
    }
    if (this.d != null) {
      i += qal.b(4, this.d.floatValue());
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a.floatValue());
    }
    if (this.b != null) {
      paramqal.a(2, this.b.floatValue());
    }
    if (this.c != null) {
      paramqal.a(3, this.c.floatValue());
    }
    if (this.d != null) {
      paramqal.a(4, this.d.floatValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmp
 * JD-Core Version:    0.7.0.1
 */