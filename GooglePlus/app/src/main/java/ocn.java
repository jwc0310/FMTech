public final class ocn
  extends qan<ocn>
{
  public oco a = null;
  public mna[] b = mna.b();
  
  public ocn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oco localoco = this.a;
      int i1 = qal.d(8);
      int i2 = localoco.a();
      localoco.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        mna localmna = this.b[k];
        if (localmna != null)
        {
          int m = qal.d(16);
          int n = localmna.a();
          localmna.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oco localoco = this.a;
      paramqal.c(10);
      if (localoco.ak < 0) {
        localoco.ak = localoco.a();
      }
      paramqal.c(localoco.ak);
      localoco.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        mna localmna = this.b[i];
        if (localmna != null)
        {
          paramqal.c(18);
          if (localmna.ak < 0) {
            localmna.ak = localmna.a();
          }
          paramqal.c(localmna.ak);
          localmna.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ocn
 * JD-Core Version:    0.7.0.1
 */