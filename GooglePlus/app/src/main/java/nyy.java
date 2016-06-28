public final class nyy
  extends qan<nyy>
{
  public String a = null;
  public nxl b = null;
  private int c = -2147483648;
  
  public nyy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i3;
    int i4;
    if (this.c != -2147483648)
    {
      int i2 = this.c;
      i3 = qal.d(8);
      if (i2 >= 0) {
        i4 = qal.d(i2);
      }
    }
    for (int j = i + (i4 + i3);; j = i)
    {
      if (this.a != null)
      {
        String str = this.a;
        int n = qal.d(16);
        int i1 = qal.a(str);
        j += n + (i1 + qal.d(i1));
      }
      if (this.b != null)
      {
        nxl localnxl = this.b;
        int k = qal.d(24);
        int m = localnxl.a();
        localnxl.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i4 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != -2147483648)
    {
      int i = this.c;
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      nxl localnxl = this.b;
      paramqal.c(26);
      if (localnxl.ak < 0) {
        localnxl.ak = localnxl.a();
      }
      paramqal.c(localnxl.ak);
      localnxl.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nyy
 * JD-Core Version:    0.7.0.1
 */