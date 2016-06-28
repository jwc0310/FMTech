public final class qbo
  extends qan<qbo>
{
  public Long a = null;
  public String b = null;
  public qbt[] c = qbt.b();
  public String d = null;
  
  public qbo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.e(1, this.a.longValue());
    }
    if (this.b != null) {
      i += qal.b(2, this.b);
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.c.length; k++)
      {
        qbt localqbt = this.c[k];
        if (localqbt != null) {
          j += qal.c(3, localqbt);
        }
      }
      i = j;
    }
    if (this.d != null) {
      i += qal.b(4, this.d);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.b(1, this.a.longValue());
    }
    if (this.b != null) {
      paramqal.a(2, this.b);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        qbt localqbt = this.c[i];
        if (localqbt != null) {
          paramqal.a(3, localqbt);
        }
      }
    }
    if (this.d != null) {
      paramqal.a(4, this.d);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qbo
 * JD-Core Version:    0.7.0.1
 */