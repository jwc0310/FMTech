public final class nqn
  extends qan<nqn>
{
  public nql a = null;
  public String b = null;
  private Integer c = null;
  private String d = null;
  
  public nqn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nql localnql = this.a;
      int i4 = qal.d(8);
      int i5 = localnql.a();
      localnql.ak = i5;
      i += i4 + (i5 + qal.d(i5));
    }
    int i1;
    int i2;
    if (this.c != null)
    {
      i1 = this.c.intValue();
      i2 = qal.d(16);
      if (i1 < 0) {
        break label176;
      }
    }
    label176:
    for (int i3 = qal.d(i1);; i3 = 10)
    {
      i += i3 + i2;
      if (this.b != null)
      {
        String str2 = this.b;
        int m = qal.d(24);
        int n = qal.a(str2);
        i += m + (n + qal.d(n));
      }
      if (this.d != null)
      {
        String str1 = this.d;
        int j = qal.d(32);
        int k = qal.a(str1);
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nql localnql = this.a;
      paramqal.c(10);
      if (localnql.ak < 0) {
        localnql.ak = localnql.a();
      }
      paramqal.c(localnql.ak);
      localnql.a(paramqal);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(34);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqn
 * JD-Core Version:    0.7.0.1
 */