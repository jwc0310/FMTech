public final class ohn
  extends qan<ohn>
{
  public onj[] a = onj.b();
  private String b = null;
  
  public ohn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    String str = this.b;
    int j = qal.d(8);
    int k = qal.a(str);
    int m = i + (j + (k + qal.d(k)));
    if ((this.a != null) && (this.a.length > 0))
    {
      int n = m;
      for (int i1 = 0; i1 < this.a.length; i1++)
      {
        onj localonj = this.a[i1];
        if (localonj != null)
        {
          int i2 = qal.d(16);
          int i3 = localonj.a();
          localonj.ak = i3;
          n += i2 + (i3 + qal.d(i3));
        }
      }
      m = n;
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    String str = this.b;
    paramqal.c(10);
    paramqal.a(str);
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        onj localonj = this.a[i];
        if (localonj != null)
        {
          paramqal.c(18);
          if (localonj.ak < 0) {
            localonj.ak = localonj.a();
          }
          paramqal.c(localonj.ak);
          localonj.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohn
 * JD-Core Version:    0.7.0.1
 */