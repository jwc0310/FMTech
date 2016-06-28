public final class qom
  extends qan<qom>
{
  public Boolean a = null;
  public Boolean b = null;
  public Boolean c = null;
  private Boolean d = null;
  
  public qom()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.b(1, this.a.booleanValue());
    }
    if (this.b != null) {
      i += qal.b(2, this.b.booleanValue());
    }
    if (this.c != null) {
      i += qal.b(3, this.c.booleanValue());
    }
    if (this.d != null) {
      i += qal.b(4, this.d.booleanValue());
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a.booleanValue());
    }
    if (this.b != null) {
      paramqal.a(2, this.b.booleanValue());
    }
    if (this.c != null) {
      paramqal.a(3, this.c.booleanValue());
    }
    if (this.d != null) {
      paramqal.a(4, this.d.booleanValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qom
 * JD-Core Version:    0.7.0.1
 */