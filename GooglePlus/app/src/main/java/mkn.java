public final class mkn
  extends qan<mkn>
{
  public String a = null;
  private String b = null;
  private Integer c = null;
  private Integer d = null;
  
  public mkn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.a != null)
    {
      String str2 = this.a;
      int i5 = qal.d(8);
      int i6 = qal.a(str2);
      j += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int i3 = qal.d(16);
      int i4 = qal.a(str1);
      j += i3 + (i4 + qal.d(i4));
    }
    int n;
    int i1;
    if (this.c != null)
    {
      n = this.c.intValue();
      i1 = qal.d(24);
      if (n < 0) {
        break label173;
      }
    }
    label173:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.d != null)
      {
        int k = this.d.intValue();
        int m = qal.d(32);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
    }
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
    if (this.c != null)
    {
      int j = this.c.intValue();
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.d != null)
    {
      int i = this.d.intValue();
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mkn
 * JD-Core Version:    0.7.0.1
 */