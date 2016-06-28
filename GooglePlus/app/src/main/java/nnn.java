public final class nnn
  extends qan<nnn>
{
  public mjy[] a = mjy.b();
  public nno b = null;
  public Long c = null;
  
  public nnn()
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
        mjy localmjy = this.a[m];
        if (localmjy != null)
        {
          int n = qal.d(8);
          int i1 = localmjy.a();
          localmjy.ak = i1;
          i += n + (i1 + qal.d(i1));
        }
      }
    }
    if (this.b != null)
    {
      nno localnno = this.b;
      int j = qal.d(16);
      int k = localnno.a();
      localnno.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.c != null)
    {
      long l = this.c.longValue();
      i += qal.d(24) + qal.b(l);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        mjy localmjy = this.a[i];
        if (localmjy != null)
        {
          paramqal.c(10);
          if (localmjy.ak < 0) {
            localmjy.ak = localmjy.a();
          }
          paramqal.c(localmjy.ak);
          localmjy.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      nno localnno = this.b;
      paramqal.c(18);
      if (localnno.ak < 0) {
        localnno.ak = localnno.a();
      }
      paramqal.c(localnno.ak);
      localnno.a(paramqal);
    }
    if (this.c != null)
    {
      long l = this.c.longValue();
      paramqal.c(24);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nnn
 * JD-Core Version:    0.7.0.1
 */