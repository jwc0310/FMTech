public final class qmg
  extends qan<qmg>
{
  public qml[] a = qml.b();
  public Long b = null;
  public qmd c = null;
  public int d = -2147483648;
  public qmh e = null;
  
  public qmg()
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
        qml localqml = this.a[j];
        if (localqml != null) {
          i += qal.c(1, localqml);
        }
      }
    }
    if (this.b != null) {
      i += qal.e(2, this.b.longValue());
    }
    if (this.c != null) {
      i += qal.c(3, this.c);
    }
    if (this.d != -2147483648) {
      i += qal.e(4, this.d);
    }
    if (this.e != null) {
      i += qal.c(5, this.e);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        qml localqml = this.a[i];
        if (localqml != null) {
          paramqal.a(1, localqml);
        }
      }
    }
    if (this.b != null) {
      paramqal.b(2, this.b.longValue());
    }
    if (this.c != null) {
      paramqal.a(3, this.c);
    }
    if (this.d != -2147483648) {
      paramqal.a(4, this.d);
    }
    if (this.e != null) {
      paramqal.a(5, this.e);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmg
 * JD-Core Version:    0.7.0.1
 */