public final class nny
  extends qan<nny>
{
  public nnz[] a = nnz.b();
  public int b = -2147483648;
  public String c = null;
  
  public nny()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i2 = 0; i2 < this.a.length; i2++)
      {
        nnz localnnz = this.a[i2];
        if (localnnz != null)
        {
          int i3 = qal.d(8);
          int i4 = localnnz.a();
          localnnz.ak = i4;
          i += i3 + (i4 + qal.d(i4));
        }
      }
    }
    int m;
    int n;
    if (this.b != -2147483648)
    {
      m = this.b;
      n = qal.d(16);
      if (m < 0) {
        break label169;
      }
    }
    label169:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.c != null)
      {
        String str = this.c;
        int j = qal.d(24);
        int k = qal.a(str);
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        nnz localnnz = this.a[j];
        if (localnnz != null)
        {
          paramqal.c(10);
          if (localnnz.ak < 0) {
            localnnz.ak = localnnz.a();
          }
          paramqal.c(localnnz.ak);
          localnnz.a(paramqal);
        }
      }
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(26);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nny
 * JD-Core Version:    0.7.0.1
 */