public final class qmh
  extends qan<qmh>
{
  public qnb a = null;
  private qmi b = null;
  private qmy c = null;
  
  public qmh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null) {
      i += qal.c(1, this.b);
    }
    if (this.a != null) {
      i += qal.c(2, this.a);
    }
    if (this.c != null) {
      i += qal.c(3, this.c);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null) {
      paramqal.a(1, this.b);
    }
    if (this.a != null) {
      paramqal.a(2, this.a);
    }
    if (this.c != null) {
      paramqal.a(3, this.c);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmh
 * JD-Core Version:    0.7.0.1
 */