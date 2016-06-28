public final class qgl
  extends qan<qgl>
{
  public qgj[] a = qgj.b();
  private qkb b = null;
  private qjv c = null;
  private qgm d = null;
  private qfz e = null;
  private qju f = null;
  private qjd g = null;
  private String h = null;
  
  public qgl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        qgj localqgj = this.a[j];
        if (localqgj != null) {
          i += qal.c(1, localqgj);
        }
      }
    }
    if (this.c != null) {
      i += qal.c(2, this.c);
    }
    if (this.b != null) {
      i += qal.c(3, this.b);
    }
    if (this.d != null) {
      i += qal.c(4, this.d);
    }
    if (this.e != null) {
      i += qal.c(5, this.e);
    }
    if (this.f != null) {
      i += qal.c(6, this.f);
    }
    if (this.g != null) {
      i += qal.c(7, this.g);
    }
    if (this.h != null) {
      i += qal.b(8, this.h);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        qgj localqgj = this.a[i];
        if (localqgj != null) {
          paramqal.a(1, localqgj);
        }
      }
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
    if (this.e != null) {
      paramqal.a(5, this.e);
    }
    if (this.f != null) {
      paramqal.a(6, this.f);
    }
    if (this.g != null) {
      paramqal.a(7, this.g);
    }
    if (this.h != null) {
      paramqal.a(8, this.h);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qgl
 * JD-Core Version:    0.7.0.1
 */