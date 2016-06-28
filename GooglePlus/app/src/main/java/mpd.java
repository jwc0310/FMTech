public final class mpd
  extends qan<mpd>
{
  private String a = null;
  private String b = null;
  private String c = null;
  private mmz[] d = mmz.b();
  
  public mpd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i5 = qal.d(8);
      int i6 = qal.a(str3);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i3 = qal.d(16);
      int i4 = qal.a(str2);
      i += i3 + (i4 + qal.d(i4));
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int m = i;
      for (int n = 0; n < this.d.length; n++)
      {
        mmz localmmz = this.d[n];
        if (localmmz != null)
        {
          int i1 = qal.d(24);
          int i2 = localmmz.a();
          localmmz.ak = i2;
          m += i1 + (i2 + qal.d(i2));
        }
      }
      i = m;
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int j = qal.d(32);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i = 0; i < this.d.length; i++)
      {
        mmz localmmz = this.d[i];
        if (localmmz != null)
        {
          paramqal.c(26);
          if (localmmz.ak < 0) {
            localmmz.ak = localmmz.a();
          }
          paramqal.c(localmmz.ak);
          localmmz.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(34);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpd
 * JD-Core Version:    0.7.0.1
 */