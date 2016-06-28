public final class omk
  extends qan<omk>
{
  public omn[] a = omn.b();
  public omn b = null;
  
  public omk()
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
        omn localomn2 = this.a[m];
        if (localomn2 != null)
        {
          int n = qal.d(8);
          int i1 = localomn2.a();
          localomn2.ak = i1;
          i += n + (i1 + qal.d(i1));
        }
      }
    }
    if (this.b != null)
    {
      omn localomn1 = this.b;
      int j = qal.d(16);
      int k = localomn1.a();
      localomn1.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        omn localomn2 = this.a[i];
        if (localomn2 != null)
        {
          paramqal.c(10);
          if (localomn2.ak < 0) {
            localomn2.ak = localomn2.a();
          }
          paramqal.c(localomn2.ak);
          localomn2.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      omn localomn1 = this.b;
      paramqal.c(18);
      if (localomn1.ak < 0) {
        localomn1.ak = localomn1.a();
      }
      paramqal.c(localomn1.ak);
      localomn1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omk
 * JD-Core Version:    0.7.0.1
 */