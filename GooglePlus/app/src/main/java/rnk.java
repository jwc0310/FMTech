public final class rnk
  extends qan<rnk>
{
  public Integer a = null;
  public Integer b = null;
  public Integer c = null;
  public Integer d = null;
  
  public rnk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.e(1, this.a.intValue());
    }
    if (this.b != null) {
      i += qal.e(2, this.b.intValue());
    }
    if (this.c != null) {
      i += qal.e(3, this.c.intValue());
    }
    if (this.d != null) {
      i += qal.e(4, this.d.intValue());
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a.intValue());
    }
    if (this.b != null) {
      paramqal.a(2, this.b.intValue());
    }
    if (this.c != null) {
      paramqal.a(3, this.c.intValue());
    }
    if (this.d != null) {
      paramqal.a(4, this.d.intValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rnk
 * JD-Core Version:    0.7.0.1
 */