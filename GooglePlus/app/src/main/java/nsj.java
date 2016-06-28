public final class nsj
  extends qan<nsj>
{
  public String a = null;
  public ojl b = null;
  private Integer c = null;
  
  public nsj()
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
    int m;
    int n;
    if (this.c != null)
    {
      m = this.c.intValue();
      n = qal.d(16);
      if (m < 0) {
        break label134;
      }
    }
    label134:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.b != null)
      {
        ojl localojl = this.b;
        int j = qal.d(24);
        int k = localojl.a();
        localojl.ak = k;
        i += j + (k + qal.d(k));
      }
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
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      ojl localojl = this.b;
      paramqal.c(26);
      if (localojl.ak < 0) {
        localojl.ak = localojl.a();
      }
      paramqal.c(localojl.ak);
      localojl.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsj
 * JD-Core Version:    0.7.0.1
 */