public final class omh
  extends qan<omh>
{
  private static volatile omh[] a;
  private omg[] b = omg.b();
  private omk c = null;
  
  public omh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static omh[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new omh[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.b != null) && (this.b.length > 0)) {
      for (int m = 0; m < this.b.length; m++)
      {
        omg localomg = this.b[m];
        if (localomg != null)
        {
          int n = qal.d(8);
          int i1 = localomg.a();
          localomg.ak = i1;
          i += n + (i1 + qal.d(i1));
        }
      }
    }
    if (this.c != null)
    {
      omk localomk = this.c;
      int j = qal.d(16);
      int k = localomk.a();
      localomk.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        omg localomg = this.b[i];
        if (localomg != null)
        {
          paramqal.c(10);
          if (localomg.ak < 0) {
            localomg.ak = localomg.a();
          }
          paramqal.c(localomg.ak);
          localomg.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      omk localomk = this.c;
      paramqal.c(18);
      if (localomk.ak < 0) {
        localomk.ak = localomk.a();
      }
      paramqal.c(localomk.ak);
      localomk.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     omh
 * JD-Core Version:    0.7.0.1
 */