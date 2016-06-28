public final class qbn
  extends qan<qbn>
{
  public qbo a = null;
  public String b = null;
  public int c = -2147483648;
  private String d = null;
  
  public qbn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.c(1, this.a);
    }
    if (this.d != null) {
      i += qal.b(2, this.d);
    }
    if (this.b != null) {
      i += qal.b(3, this.b);
    }
    if (this.c != -2147483648) {
      i += qal.e(4, this.c);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if (this.d != null) {
      paramqal.a(2, this.d);
    }
    if (this.b != null) {
      paramqal.a(3, this.b);
    }
    if (this.c != -2147483648) {
      paramqal.a(4, this.c);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qbn
 * JD-Core Version:    0.7.0.1
 */