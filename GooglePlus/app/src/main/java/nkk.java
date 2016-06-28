public final class nkk
  extends qan<nkk>
{
  private nki[] a = nki.b();
  private nki[] b = nki.b();
  
  public nkk()
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
        nki localnki2 = this.a[i2];
        if (localnki2 != null)
        {
          int i3 = qal.d(8);
          int i4 = localnki2.a();
          localnki2.ak = i4;
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
          nki localnki1 = this.b[k];
          if (localnki1 != null)
          {
            int m = qal.d(16);
            int n = localnki1.a();
            localnki1.ak = n;
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
        nki localnki2 = this.a[k];
        if (localnki2 != null)
        {
          paramqal.c(10);
          if (localnki2.ak < 0) {
            localnki2.ak = localnki2.a();
          }
          paramqal.c(localnki2.ak);
          localnki2.a(paramqal);
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
          nki localnki1 = this.b[j];
          if (localnki1 != null)
          {
            paramqal.c(18);
            if (localnki1.ak < 0) {
              localnki1.ak = localnki1.a();
            }
            paramqal.c(localnki1.ak);
            localnki1.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nkk
 * JD-Core Version:    0.7.0.1
 */