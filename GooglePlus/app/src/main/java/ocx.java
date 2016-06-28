public final class ocx
  extends qan<ocx>
{
  private String a = null;
  private Integer b = null;
  private Integer c = null;
  
  public ocx()
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
      String str = this.a;
      int i3 = qal.d(8);
      int i4 = qal.a(str);
      j += i3 + (i4 + qal.d(i4));
    }
    int n;
    int i1;
    if (this.b != null)
    {
      n = this.b.intValue();
      i1 = qal.d(16);
      if (n < 0) {
        break label132;
      }
    }
    label132:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.c != null)
      {
        int k = this.c.intValue();
        int m = qal.d(24);
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
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      int j = this.b.intValue();
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(24);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ocx
 * JD-Core Version:    0.7.0.1
 */