public final class nmq
  extends qan<nmq>
{
  private static volatile nmq[] a;
  private Long b = null;
  private nmr[] c = nmr.b();
  
  public nmq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nmq[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nmq[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      long l = this.b.longValue();
      i += qal.d(8) + qal.b(l);
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.c.length; k++)
      {
        nmr localnmr = this.c[k];
        if (localnmr != null)
        {
          int m = qal.d(16);
          int n = localnmr.a();
          localnmr.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      long l = this.b.longValue();
      paramqal.c(8);
      paramqal.a(l);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        nmr localnmr = this.c[i];
        if (localnmr != null)
        {
          paramqal.c(18);
          if (localnmr.ak < 0) {
            localnmr.ak = localnmr.a();
          }
          paramqal.c(localnmr.ak);
          localnmr.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmq
 * JD-Core Version:    0.7.0.1
 */