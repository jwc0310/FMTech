public final class nnf
  extends qan<nnf>
{
  public nng[] a = nng.b();
  private int[] b = qay.a;
  
  public nnf()
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
      int i1 = j;
      for (int i2 = 0; i2 < this.a.length; i2++)
      {
        nng localnng = this.a[i2];
        if (localnng != null)
        {
          int i3 = qal.d(8);
          int i4 = localnng.a();
          localnng.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      j = i1;
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int k = 0;
      if (i < this.b.length)
      {
        int m = this.b[i];
        if (m >= 0) {}
        for (int n = qal.d(m);; n = 10)
        {
          k += n;
          i++;
          break;
        }
      }
      j = j + k + 1 * this.b.length;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int m = 0; m < this.a.length; m++)
      {
        nng localnng = this.a[m];
        if (localnng != null)
        {
          paramqal.c(10);
          if (localnng.ak < 0) {
            localnng.ak = localnng.a();
          }
          paramqal.c(localnng.ak);
          localnng.a(paramqal);
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
          int k = this.b[j];
          paramqal.c(16);
          paramqal.a(k);
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nnf
 * JD-Core Version:    0.7.0.1
 */