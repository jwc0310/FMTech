public final class qgz
  extends qan<qgz>
{
  public qgm a = null;
  public qha b = null;
  public qha[] c = qha.b();
  private Long d = null;
  private Long e = null;
  private Integer f = null;
  private qgm g = null;
  
  public qgz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.c(1, this.a);
    }
    if (this.b != null) {
      i += qal.c(2, this.b);
    }
    if (this.d != null) {
      i += qal.e(3, this.d.longValue());
    }
    if (this.e != null) {
      i += qal.e(4, this.e.longValue());
    }
    if (this.f != null) {
      i += qal.g(5, this.f.intValue());
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.c.length; k++)
      {
        qha localqha = this.c[k];
        if (localqha != null) {
          j += qal.c(6, localqha);
        }
      }
      i = j;
    }
    if (this.g != null) {
      i += qal.c(7, this.g);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if (this.b != null) {
      paramqal.a(2, this.b);
    }
    if (this.d != null) {
      paramqal.b(3, this.d.longValue());
    }
    if (this.e != null) {
      paramqal.b(4, this.e.longValue());
    }
    if (this.f != null) {
      paramqal.c(5, this.f.intValue());
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        qha localqha = this.c[i];
        if (localqha != null) {
          paramqal.a(6, localqha);
        }
      }
    }
    if (this.g != null) {
      paramqal.a(7, this.g);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qgz
 * JD-Core Version:    0.7.0.1
 */