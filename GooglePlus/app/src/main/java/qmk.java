public final class qmk
  extends qan<qmk>
{
  public int[] a = qay.a;
  
  public qmk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int k = 0;
      if (i < this.a.length)
      {
        int m = this.a[i];
        if (m >= 0) {}
        for (int n = qal.d(m);; n = 10)
        {
          k += n;
          i++;
          break;
        }
      }
      return j + k + 1 * this.a.length;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++) {
        paramqal.a(1, this.a[i]);
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qmk
 * JD-Core Version:    0.7.0.1
 */