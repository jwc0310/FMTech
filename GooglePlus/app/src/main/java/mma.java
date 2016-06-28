public final class mma
  extends qan<mma>
{
  public mmr[] a = mmr.b();
  
  public mma()
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
        mmr localmmr = this.a[j];
        if (localmmr != null)
        {
          int k = qal.d(8);
          int m = localmmr.a();
          localmmr.ak = m;
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
        mmr localmmr = this.a[i];
        if (localmmr != null)
        {
          paramqal.c(10);
          if (localmmr.ak < 0) {
            localmmr.ak = localmmr.a();
          }
          paramqal.c(localmmr.ak);
          localmmr.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mma
 * JD-Core Version:    0.7.0.1
 */