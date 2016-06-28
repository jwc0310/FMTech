public final class ndv
  extends qan<ndv>
{
  private qbe[] a = qbe.b();
  private ndw[] b = ndw.b();
  
  public ndv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.a.length; i2++)
      {
        qbe localqbe = this.a[i2];
        if (localqbe != null)
        {
          int i3 = qal.d(8);
          int i4 = localqbe.a();
          localqbe.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      i = i1;
    }
    if (this.b != null)
    {
      int j = this.b.length;
      int k = 0;
      if (j > 0) {
        while (k < this.b.length)
        {
          ndw localndw = this.b[k];
          if (localndw != null)
          {
            int m = qal.d(16);
            int n = localndw.a();
            localndw.ak = n;
            i += m + (n + qal.d(n));
          }
          k++;
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int k = 0; k < this.a.length; k++)
      {
        qbe localqbe = this.a[k];
        if (localqbe != null)
        {
          paramqal.c(10);
          if (localqbe.ak < 0) {
            localqbe.ak = localqbe.a();
          }
          paramqal.c(localqbe.ak);
          localqbe.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      int i = this.b.length;
      int j = 0;
      if (i > 0) {
        while (j < this.b.length)
        {
          ndw localndw = this.b[j];
          if (localndw != null)
          {
            paramqal.c(18);
            if (localndw.ak < 0) {
              localndw.ak = localndw.a();
            }
            paramqal.c(localndw.ak);
            localndw.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ndv
 * JD-Core Version:    0.7.0.1
 */