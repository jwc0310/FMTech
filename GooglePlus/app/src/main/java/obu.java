public final class obu
  extends qan<obu>
{
  private Integer a = null;
  private Integer b = null;
  private Integer c = null;
  
  public obu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i5;
    int i6;
    if (this.a != null)
    {
      int i4 = this.a.intValue();
      i5 = qal.d(8);
      if (i4 >= 0) {
        i6 = qal.d(i4);
      }
    }
    for (int k = j + (i6 + i5);; k = j)
    {
      int i1;
      int i2;
      if (this.b != null)
      {
        i1 = this.b.intValue();
        i2 = qal.d(16);
        if (i1 < 0) {
          break label143;
        }
      }
      label143:
      for (int i3 = qal.d(i1);; i3 = i)
      {
        k += i3 + i2;
        if (this.c != null)
        {
          int m = this.c.intValue();
          int n = qal.d(24);
          if (m >= 0) {
            i = qal.d(m);
          }
          k += i + n;
        }
        return k;
        i6 = i;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int k = this.a.intValue();
      paramqal.c(8);
      paramqal.a(k);
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
 * Qualified Name:     obu
 * JD-Core Version:    0.7.0.1
 */