public final class mnn
  extends qan<mnn>
{
  private mno[] a = mno.b();
  private int[] b = qay.a;
  
  public mnn()
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
        mno localmno = this.a[i2];
        if (localmno != null)
        {
          int i3 = qal.d(8);
          int i4 = localmno.a();
          localmno.ak = i4;
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
        mno localmno = this.a[m];
        if (localmno != null)
        {
          paramqal.c(10);
          if (localmno.ak < 0) {
            localmno.ak = localmno.a();
          }
          paramqal.c(localmno.ak);
          localmno.a(paramqal);
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
 * Qualified Name:     mnn
 * JD-Core Version:    0.7.0.1
 */