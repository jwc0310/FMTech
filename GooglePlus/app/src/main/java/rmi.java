public final class rmi
  extends qan<rmi>
{
  public Boolean a = null;
  public Boolean b = null;
  public Integer c = null;
  public Integer d = null;
  public Integer e = null;
  public rnk f = null;
  public int g = -2147483648;
  
  public rmi()
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
      i += qal.e(3, this.c.intValue());
    }
    if (this.d != null) {
      i += qal.e(4, this.d.intValue());
    }
    if (this.e != null) {
      i += qal.e(5, this.e.intValue());
    }
    if (this.f != null) {
      i += qal.c(6, this.f);
    }
    if (this.g != -2147483648) {
      i += qal.e(7, this.g);
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
      paramqal.a(3, this.c.intValue());
    }
    if (this.d != null) {
      paramqal.a(4, this.d.intValue());
    }
    if (this.e != null) {
      paramqal.a(5, this.e.intValue());
    }
    if (this.f != null) {
      paramqal.a(6, this.f);
    }
    if (this.g != -2147483648) {
      paramqal.a(7, this.g);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rmi
 * JD-Core Version:    0.7.0.1
 */