public final class onx
  extends qan<onx>
{
  private String a = null;
  private ony b = null;
  private Integer c = null;
  
  public onx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i2 = qal.d(8);
      int i3 = qal.a(str);
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.b != null)
    {
      ony localony = this.b;
      int n = qal.d(16);
      int i1 = localony.a();
      localony.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.c != null)
    {
      j = this.c.intValue();
      k = qal.d(24);
      if (j < 0) {
        break label134;
      }
    }
    label134:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
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
      ony localony = this.b;
      paramqal.c(18);
      if (localony.ak < 0) {
        localony.ak = localony.a();
      }
      paramqal.c(localony.ak);
      localony.a(paramqal);
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
 * Qualified Name:     onx
 * JD-Core Version:    0.7.0.1
 */