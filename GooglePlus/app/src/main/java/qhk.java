public final class qhk
  extends qan<qhk>
{
  public String a = null;
  public String b = null;
  public String[] c = qay.f;
  private Boolean d = null;
  
  public qhk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null) {
      j += qal.b(1, this.a);
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.c.length)
      {
        String str = this.c[i];
        if (str != null)
        {
          m++;
          int n = qal.a(str);
          k += n + qal.d(n);
        }
        i++;
      }
      j = j + k + m * 1;
    }
    if (this.b != null) {
      j += qal.b(3, this.b);
    }
    if (this.d != null) {
      j += qal.b(4, this.d.booleanValue());
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        String str = this.c[i];
        if (str != null) {
          paramqal.a(2, str);
        }
      }
    }
    if (this.b != null) {
      paramqal.a(3, this.b);
    }
    if (this.d != null) {
      paramqal.a(4, this.d.booleanValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qhk
 * JD-Core Version:    0.7.0.1
 */