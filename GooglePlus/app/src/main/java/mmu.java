public final class mmu
  extends qan<mmu>
{
  private mml[] a = mml.b();
  
  public mmu()
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
        mml localmml = this.a[j];
        if (localmml != null)
        {
          int k = qal.d(8);
          int m = localmml.a();
          localmml.ak = m;
          i += k + (m + qal.d(m));
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
        mml localmml = this.a[i];
        if (localmml != null)
        {
          paramqal.c(10);
          if (localmml.ak < 0) {
            localmml.ak = localmml.a();
          }
          paramqal.c(localmml.ak);
          localmml.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mmu
 * JD-Core Version:    0.7.0.1
 */