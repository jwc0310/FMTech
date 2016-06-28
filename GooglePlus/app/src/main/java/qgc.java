public final class qgc
  extends qan<qgc>
{
  public qga[] a = qga.b();
  
  public qgc()
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
        qga localqga = this.a[j];
        if (localqga != null) {
          i += qal.c(1, localqga);
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        qga localqga = this.a[i];
        if (localqga != null) {
          paramqal.a(1, localqga);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qgc
 * JD-Core Version:    0.7.0.1
 */