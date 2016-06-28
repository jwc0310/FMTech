public final class nsf
  extends qan<nsf>
{
  public int a = -2147483648;
  private String b = null;
  private nsb[] c = nsb.b();
  
  public nsf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str = this.b;
      int i4 = qal.d(8);
      int i5 = qal.a(str);
      i += i4 + (i5 + qal.d(i5));
    }
    int i1;
    int i2;
    if (this.a != -2147483648)
    {
      i1 = this.a;
      i2 = qal.d(16);
      if (i1 < 0) {
        break label170;
      }
    }
    int j;
    label170:
    for (int i3 = qal.d(i1);; i3 = 10)
    {
      i += i3 + i2;
      if ((this.c == null) || (this.c.length <= 0)) {
        return i;
      }
      j = i;
      for (int k = 0; k < this.c.length; k++)
      {
        nsb localnsb = this.c[k];
        if (localnsb != null)
        {
          int m = qal.d(24);
          int n = localnsb.a();
          localnsb.ak = n;
          j += m + (n + qal.d(n));
        }
      }
    }
    i = j;
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.a != -2147483648)
    {
      int j = this.a;
      paramqal.c(16);
      paramqal.a(j);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        nsb localnsb = this.c[i];
        if (localnsb != null)
        {
          paramqal.c(26);
          if (localnsb.ak < 0) {
            localnsb.ak = localnsb.a();
          }
          paramqal.c(localnsb.ak);
          localnsb.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsf
 * JD-Core Version:    0.7.0.1
 */