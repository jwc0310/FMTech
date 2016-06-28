public final class onj
  extends qan<onj>
{
  private static volatile onj[] c;
  public ood a = null;
  public mig[] b = mig.b();
  
  public onj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static onj[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new onj[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ood localood = this.a;
      int i1 = qal.d(8);
      int i2 = localood.a();
      localood.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        mig localmig = this.b[k];
        if (localmig != null)
        {
          int m = qal.d(16);
          int n = localmig.a();
          localmig.ak = n;
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
      ood localood = this.a;
      paramqal.c(10);
      if (localood.ak < 0) {
        localood.ak = localood.a();
      }
      paramqal.c(localood.ak);
      localood.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        mig localmig = this.b[i];
        if (localmig != null)
        {
          paramqal.c(18);
          if (localmig.ak < 0) {
            localmig.ak = localmig.a();
          }
          paramqal.c(localmig.ak);
          localmig.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     onj
 * JD-Core Version:    0.7.0.1
 */