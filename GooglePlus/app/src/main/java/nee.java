public final class nee
  extends qan<nee>
{
  private ned[] a = ned.b();
  
  static
  {
    new qao(11, nee.class, (int)722752386L, false);
  }
  
  public nee()
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
        ned localned = this.a[j];
        if (localned != null)
        {
          int k = qal.d(8);
          int m = localned.a();
          localned.ak = m;
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
        ned localned = this.a[i];
        if (localned != null)
        {
          paramqal.c(10);
          if (localned.ak < 0) {
            localned.ak = localned.a();
          }
          paramqal.c(localned.ak);
          localned.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nee
 * JD-Core Version:    0.7.0.1
 */