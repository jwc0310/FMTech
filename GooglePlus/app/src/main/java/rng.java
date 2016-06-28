public final class rng
  extends qan<rng>
{
  public int a = -2147483648;
  public Integer b = null;
  public rnk c = null;
  public rmi d = null;
  
  public rng()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != -2147483648) {
      i += qal.e(1, this.a);
    }
    if (this.b != null) {
      i += qal.e(2, this.b.intValue());
    }
    if (this.c != null) {
      i += qal.c(3, this.c);
    }
    if (this.d != null) {
      i += qal.c(4, this.d);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648) {
      paramqal.a(1, this.a);
    }
    if (this.b != null) {
      paramqal.a(2, this.b.intValue());
    }
    if (this.c != null) {
      paramqal.a(3, this.c);
    }
    if (this.d != null) {
      paramqal.a(4, this.d);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rng
 * JD-Core Version:    0.7.0.1
 */