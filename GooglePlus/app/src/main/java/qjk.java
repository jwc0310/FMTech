public final class qjk
  extends qan<qjk>
{
  public qjj[] a = qjj.b();
  private Boolean b = null;
  
  public qjk()
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
        qjj localqjj = this.a[j];
        if (localqjj != null) {
          i += qal.c(1, localqjj);
        }
      }
    }
    if (this.b != null) {
      i += qal.b(2, this.b.booleanValue());
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        qjj localqjj = this.a[i];
        if (localqjj != null) {
          paramqal.a(1, localqjj);
        }
      }
    }
    if (this.b != null) {
      paramqal.a(2, this.b.booleanValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qjk
 * JD-Core Version:    0.7.0.1
 */