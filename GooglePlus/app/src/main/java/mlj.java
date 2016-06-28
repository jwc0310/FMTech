public final class mlj
  extends qan<mlj>
{
  private static volatile mlj[] d;
  public String a = null;
  public String b = null;
  public mmr[] c = mmr.b();
  
  public mlj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mlj[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new mlj[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str2 = this.a;
      int i3 = qal.d(8);
      int i4 = qal.a(str2);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int i1 = qal.d(16);
      int i2 = qal.a(str1);
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.c.length; k++)
      {
        mmr localmmr = this.c[k];
        if (localmmr != null)
        {
          int m = qal.d(24);
          int n = localmmr.a();
          localmmr.ak = n;
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
      String str2 = this.a;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      String str1 = this.b;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        mmr localmmr = this.c[i];
        if (localmmr != null)
        {
          paramqal.c(26);
          if (localmmr.ak < 0) {
            localmmr.ak = localmmr.a();
          }
          paramqal.c(localmmr.ak);
          localmmr.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mlj
 * JD-Core Version:    0.7.0.1
 */