public final class qhx
  extends qan<qhx>
{
  public String a = null;
  private String b = null;
  private qgm c = null;
  private String d = null;
  
  public qhx()
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
      i += qal.c(2, this.c);
    }
    if (this.d != null) {
      i += qal.b(3, this.d);
    }
    if (this.b != null) {
      i += qal.b(4, this.b);
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
    if (this.d != null) {
      paramqal.a(3, this.d);
    }
    if (this.b != null) {
      paramqal.a(4, this.b);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qhx
 * JD-Core Version:    0.7.0.1
 */