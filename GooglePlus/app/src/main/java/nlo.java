public final class nlo
  extends qan<nlo>
{
  private nlm[] a = nlm.b();
  private nlp b = null;
  
  public nlo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int m = 0; m < this.a.length; m++)
      {
        nlm localnlm = this.a[m];
        if (localnlm != null)
        {
          int n = qal.d(8);
          int i1 = localnlm.a();
          localnlm.ak = i1;
          i += n + (i1 + qal.d(i1));
        }
      }
    }
    if (this.b != null)
    {
      nlp localnlp = this.b;
      int j = qal.d(16);
      int k = localnlp.a();
      localnlp.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        nlm localnlm = this.a[i];
        if (localnlm != null)
        {
          paramqal.c(10);
          if (localnlm.ak < 0) {
            localnlm.ak = localnlm.a();
          }
          paramqal.c(localnlm.ak);
          localnlm.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      nlp localnlp = this.b;
      paramqal.c(18);
      if (localnlp.ak < 0) {
        localnlp.ak = localnlp.a();
      }
      paramqal.c(localnlp.ak);
      localnlp.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nlo
 * JD-Core Version:    0.7.0.1
 */