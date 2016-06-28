public final class nmr
  extends qan<nmr>
{
  private static volatile nmr[] a;
  private nms[] b = nms.b();
  
  public nmr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nmr[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nmr[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.b != null) && (this.b.length > 0)) {
      for (int j = 0; j < this.b.length; j++)
      {
        nms localnms = this.b[j];
        if (localnms != null)
        {
          int k = qal.d(8);
          int m = localnms.a();
          localnms.ak = m;
          i += k + (m + qal.d(m));
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        nms localnms = this.b[i];
        if (localnms != null)
        {
          paramqal.c(10);
          if (localnms.ak < 0) {
            localnms.ak = localnms.a();
          }
          paramqal.c(localnms.ak);
          localnms.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nmr
 * JD-Core Version:    0.7.0.1
 */