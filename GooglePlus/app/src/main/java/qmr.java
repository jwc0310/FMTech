public final class qmr
  extends qan<qmr>
{
  public static final qao<qml, qmr> a = new qao(11, qmr.class, (int)159979226L, false);
  public qms[] b = qms.a;
  
  public qmr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.b != null) && (this.b.length > 0)) {
      for (int j = 0; j < this.b.length; j++)
      {
        qms localqms = this.b[j];
        if (localqms != null) {
          i += qal.c(1, localqms);
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        qms localqms = this.b[i];
        if (localqms != null) {
          paramqal.a(1, localqms);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmr
 * JD-Core Version:    0.7.0.1
 */