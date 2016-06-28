public final class nwz
  extends qan<nwz>
{
  public nvf[] a = nvf.b();
  public String b = null;
  public String c = null;
  
  public nwz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i1 = 0; i1 < this.a.length; i1++)
      {
        nvf localnvf = this.a[i1];
        if (localnvf != null)
        {
          int i2 = qal.d(8);
          int i3 = localnvf.a();
          localnvf.ak = i3;
          i += i2 + (i3 + qal.d(i3));
        }
      }
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int m = qal.d(16);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int j = qal.d(24);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        nvf localnvf = this.a[i];
        if (localnvf != null)
        {
          paramqal.c(10);
          if (localnvf.ak < 0) {
            localnvf.ak = localnvf.a();
          }
          paramqal.c(localnvf.ak);
          localnvf.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(26);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwz
 * JD-Core Version:    0.7.0.1
 */