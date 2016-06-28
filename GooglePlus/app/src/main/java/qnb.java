public final class qnb
  extends qan<qnb>
{
  public int a = -2147483648;
  private qlo b = null;
  private pxb c = null;
  private pmg d = null;
  private pjf e = null;
  private Integer f = null;
  private qnv g = null;
  private Float h = null;
  private Boolean i = null;
  
  public qnb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    if (this.b != null) {
      j += qal.c(1, this.b);
    }
    if (this.c != null) {
      j += qal.c(2, this.c);
    }
    if (this.d != null) {
      j += qal.c(3, this.d);
    }
    if (this.e != null) {
      j += qal.c(4, this.e);
    }
    if (this.f != null) {
      j += qal.e(5, this.f.intValue());
    }
    if (this.a != -2147483648) {
      j += qal.e(6, this.a);
    }
    if (this.g != null) {
      j += qal.c(7, this.g);
    }
    if (this.h != null) {
      j += qal.b(10, this.h.floatValue());
    }
    if (this.i != null) {
      j += qal.b(11, this.i.booleanValue());
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null) {
      paramqal.a(1, this.b);
    }
    if (this.c != null) {
      paramqal.a(2, this.c);
    }
    if (this.d != null) {
      paramqal.a(3, this.d);
    }
    if (this.e != null) {
      paramqal.a(4, this.e);
    }
    if (this.f != null) {
      paramqal.a(5, this.f.intValue());
    }
    if (this.a != -2147483648) {
      paramqal.a(6, this.a);
    }
    if (this.g != null) {
      paramqal.a(7, this.g);
    }
    if (this.h != null) {
      paramqal.a(10, this.h.floatValue());
    }
    if (this.i != null) {
      paramqal.a(11, this.i.booleanValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qnb
 * JD-Core Version:    0.7.0.1
 */