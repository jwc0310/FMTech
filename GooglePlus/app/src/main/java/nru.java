public final class nru
  extends qan<nru>
{
  private ojf[] a = ojf.b();
  
  public nru()
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
        ojf localojf = this.a[j];
        if (localojf != null)
        {
          int k = qal.d(8);
          int m = localojf.a();
          localojf.ak = m;
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
        ojf localojf = this.a[i];
        if (localojf != null)
        {
          paramqal.c(10);
          if (localojf.ak < 0) {
            localojf.ak = localojf.a();
          }
          paramqal.c(localojf.ak);
          localojf.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nru
 * JD-Core Version:    0.7.0.1
 */