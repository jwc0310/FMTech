public final class nzm
  extends qan<nzm>
{
  private static volatile nzm[] a;
  private qpk b = null;
  
  public nzm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nzm[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nzm[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      qpk localqpk = this.b;
      int j = qal.d(8);
      int k = localqpk.a();
      localqpk.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      qpk localqpk = this.b;
      paramqal.c(10);
      if (localqpk.ak < 0) {
        localqpk.ak = localqpk.a();
      }
      paramqal.c(localqpk.ak);
      localqpk.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzm
 * JD-Core Version:    0.7.0.1
 */