public final class ndh
  extends qan<ndh>
{
  public ndl[] a = ndl.b();
  private ndi[] b = ndi.b();
  
  public ndh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.b != null) && (this.b.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.b.length; i2++)
      {
        ndi localndi = this.b[i2];
        if (localndi != null)
        {
          int i3 = qal.d(24);
          int i4 = localndi.a();
          localndi.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      i = i1;
    }
    if (this.a != null)
    {
      int j = this.a.length;
      int k = 0;
      if (j > 0) {
        while (k < this.a.length)
        {
          ndl localndl = this.a[k];
          if (localndl != null)
          {
            int m = qal.d(32);
            int n = localndl.a();
            localndl.ak = n;
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
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        ndi localndi = this.b[k];
        if (localndi != null)
        {
          paramqal.c(26);
          if (localndi.ak < 0) {
            localndi.ak = localndi.a();
          }
          paramqal.c(localndi.ak);
          localndi.a(paramqal);
        }
      }
    }
    if (this.a != null)
    {
      int i = this.a.length;
      int j = 0;
      if (i > 0) {
        while (j < this.a.length)
        {
          ndl localndl = this.a[j];
          if (localndl != null)
          {
            paramqal.c(34);
            if (localndl.ak < 0) {
              localndl.ak = localndl.a();
            }
            paramqal.c(localndl.ak);
            localndl.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ndh
 * JD-Core Version:    0.7.0.1
 */