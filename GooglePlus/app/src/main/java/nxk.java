public final class nxk
  extends qan<nxk>
{
  public omm[] a = omm.b();
  private oku b = null;
  
  public nxk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      oku localoku = this.b;
      int i1 = qal.d(8);
      int i2 = localoku.a();
      localoku.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.a != null) && (this.a.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.a.length; k++)
      {
        omm localomm = this.a[k];
        if (localomm != null)
        {
          int m = qal.d(16);
          int n = localomm.a();
          localomm.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      oku localoku = this.b;
      paramqal.c(10);
      if (localoku.ak < 0) {
        localoku.ak = localoku.a();
      }
      paramqal.c(localoku.ak);
      localoku.a(paramqal);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        omm localomm = this.a[i];
        if (localomm != null)
        {
          paramqal.c(18);
          if (localomm.ak < 0) {
            localomm.ak = localomm.a();
          }
          paramqal.c(localomm.ak);
          localomm.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxk
 * JD-Core Version:    0.7.0.1
 */