public final class ocj
  extends qan<ocj>
{
  public ocl[] a = ocl.b();
  
  public ocj()
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
        ocl localocl = this.a[j];
        if (localocl != null)
        {
          int k = qal.d(8);
          int m = localocl.a();
          localocl.ak = m;
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
        ocl localocl = this.a[i];
        if (localocl != null)
        {
          paramqal.c(10);
          if (localocl.ak < 0) {
            localocl.ak = localocl.a();
          }
          paramqal.c(localocl.ak);
          localocl.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ocj
 * JD-Core Version:    0.7.0.1
 */