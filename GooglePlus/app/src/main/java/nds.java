public final class nds
  extends qan<nds>
{
  public ndp[] a = ndp.b();
  
  public nds()
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
        ndp localndp = this.a[j];
        if (localndp != null)
        {
          int k = qal.d(8);
          int m = localndp.a();
          localndp.ak = m;
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
        ndp localndp = this.a[i];
        if (localndp != null)
        {
          paramqal.c(10);
          if (localndp.ak < 0) {
            localndp.ak = localndp.a();
          }
          paramqal.c(localndp.ak);
          localndp.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nds
 * JD-Core Version:    0.7.0.1
 */