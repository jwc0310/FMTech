public final class qpk
  extends qan<qpk>
{
  public String a = null;
  public String b = null;
  public String c = null;
  public qpo d = null;
  public int e = -2147483648;
  public qpl f = null;
  public qpm g = null;
  private Boolean h = null;
  
  public qpk()
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
    if (this.b != null) {
      i += qal.b(2, this.b);
    }
    if (this.c != null) {
      i += qal.b(3, this.c);
    }
    if (this.d != null) {
      i += qal.c(4, this.d);
    }
    if (this.e != -2147483648) {
      i += qal.e(5, this.e);
    }
    if (this.f != null) {
      i += qal.c(6, this.f);
    }
    if (this.h != null) {
      i += qal.b(7, this.h.booleanValue());
    }
    if (this.g != null) {
      i += qal.c(8, this.g);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if (this.b != null) {
      paramqal.a(2, this.b);
    }
    if (this.c != null) {
      paramqal.a(3, this.c);
    }
    if (this.d != null) {
      paramqal.a(4, this.d);
    }
    if (this.e != -2147483648) {
      paramqal.a(5, this.e);
    }
    if (this.f != null) {
      paramqal.a(6, this.f);
    }
    if (this.h != null) {
      paramqal.a(7, this.h.booleanValue());
    }
    if (this.g != null) {
      paramqal.a(8, this.g);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qpk
 * JD-Core Version:    0.7.0.1
 */