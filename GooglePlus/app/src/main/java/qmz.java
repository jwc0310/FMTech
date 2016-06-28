public final class qmz
  extends qan<qmz>
{
  public Float a = null;
  public Float b = null;
  
  public qmz()
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmz
 * JD-Core Version:    0.7.0.1
 */