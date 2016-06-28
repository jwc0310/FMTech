public final class nnc
  extends qan<nnc>
{
  public nnd[] a = nnd.b();
  private nne[] b = nne.b();
  
  public nnc()
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
        nne localnne = this.b[i2];
        if (localnne != null)
        {
          int i3 = qal.d(8) << 1;
          int i4 = localnne.a();
          localnne.ak = i4;
          i1 += i3 + i4;
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
          nnd localnnd = this.a[k];
          if (localnnd != null)
          {
            int m = qal.d(24);
            int n = localnnd.a();
            localnnd.ak = n;
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
        nne localnne = this.b[k];
        if (localnne != null)
        {
          paramqal.c(11);
          localnne.a(paramqal);
          paramqal.c(12);
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
          nnd localnnd = this.a[j];
          if (localnnd != null)
          {
            paramqal.c(26);
            if (localnnd.ak < 0) {
              localnnd.ak = localnnd.a();
            }
            paramqal.c(localnnd.ak);
            localnnd.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nnc
 * JD-Core Version:    0.7.0.1
 */