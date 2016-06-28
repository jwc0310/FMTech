public final class nrt
  extends qan<nrt>
{
  public long[] a = qay.b;
  public String b = null;
  
  public nrt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i1;
    if ((this.a != null) && (this.a.length > 0))
    {
      i1 = 0;
      while (i < this.a.length)
      {
        i1 += qal.b(this.a[i]);
        i++;
      }
    }
    for (int k = j + i1 + 1 * this.a.length;; k = j)
    {
      if (this.b != null)
      {
        String str = this.b;
        int m = qal.d(16);
        int n = qal.a(str);
        k += m + (n + qal.d(n));
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        long l = this.a[i];
        paramqal.c(8);
        paramqal.a(l);
      }
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nrt
 * JD-Core Version:    0.7.0.1
 */