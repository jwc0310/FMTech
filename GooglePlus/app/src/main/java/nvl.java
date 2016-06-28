public final class nvl
  extends qan<nvl>
{
  public Integer a = null;
  private Integer b = null;
  private Integer c = null;
  private String d = null;
  
  public nvl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i7;
    int i8;
    if (this.b != null)
    {
      int i6 = this.b.intValue();
      i7 = qal.d(8);
      if (i6 >= 0) {
        i8 = qal.d(i6);
      }
    }
    for (int k = j + (i8 + i7);; k = j)
    {
      int i3;
      int i4;
      if (this.c != null)
      {
        i3 = this.c.intValue();
        i4 = qal.d(16);
        if (i3 < 0) {
          break label184;
        }
      }
      label184:
      for (int i5 = qal.d(i3);; i5 = i)
      {
        k += i5 + i4;
        if (this.a != null)
        {
          int i1 = this.a.intValue();
          int i2 = qal.d(24);
          if (i1 >= 0) {
            i = qal.d(i1);
          }
          k += i + i2;
        }
        if (this.d != null)
        {
          String str = this.d;
          int m = qal.d(32);
          int n = qal.a(str);
          k += m + (n + qal.d(n));
        }
        return k;
        i8 = i;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      int k = this.b.intValue();
      paramqal.c(8);
      paramqal.a(k);
    }
    if (this.c != null)
    {
      int j = this.c.intValue();
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.a != null)
    {
      int i = this.a.intValue();
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(34);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nvl
 * JD-Core Version:    0.7.0.1
 */