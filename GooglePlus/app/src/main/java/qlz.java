public final class qlz
  extends qan<qlz>
{
  public static final qao<qml, qlz> a = new qao(11, qlz.class, (int)625287698L, false);
  public qma[] b = qma.b();
  private qml c = null;
  private Boolean d = null;
  
  public qlz()
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
        qma localqma = this.b[j];
        if (localqma != null) {
          i += qal.c(1, localqma);
        }
      }
    }
    if (this.c != null) {
      i += qal.c(2, this.c);
    }
    if (this.d != null) {
      i += qal.b(3, this.d.booleanValue());
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        qma localqma = this.b[i];
        if (localqma != null) {
          paramqal.a(1, localqma);
        }
      }
    }
    if (this.c != null) {
      paramqal.a(2, this.c);
    }
    if (this.d != null) {
      paramqal.a(3, this.d.booleanValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qlz
 * JD-Core Version:    0.7.0.1
 */