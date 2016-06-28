public final class nug
  extends qan<nug>
{
  public Long a = null;
  private nuh[] b = nuh.b();
  
  public nug()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      long l = this.a.longValue();
      i += qal.d(8) + qal.b(l);
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        nuh localnuh = this.b[k];
        if (localnuh != null)
        {
          int m = qal.d(16);
          int n = localnuh.a();
          localnuh.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      long l = this.a.longValue();
      paramqal.c(8);
      paramqal.a(l);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        nuh localnuh = this.b[i];
        if (localnuh != null)
        {
          paramqal.c(18);
          if (localnuh.ak < 0) {
            localnuh.ak = localnuh.a();
          }
          paramqal.c(localnuh.ak);
          localnuh.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nug
 * JD-Core Version:    0.7.0.1
 */