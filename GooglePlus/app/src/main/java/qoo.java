public final class qoo
  extends qan<qoo>
{
  public String a = null;
  public qol b = null;
  private String c = null;
  private String d = null;
  
  public qoo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.b(1, this.a);
    }
    if (this.c != null) {
      i += qal.b(2, this.c);
    }
    if (this.b != null) {
      i += qal.c(3, this.b);
    }
    if (this.d != null) {
      i += qal.b(4, this.d);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if (this.c != null) {
      paramqal.a(2, this.c);
    }
    if (this.b != null) {
      paramqal.a(3, this.b);
    }
    if (this.d != null) {
      paramqal.a(4, this.d);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qoo
 * JD-Core Version:    0.7.0.1
 */