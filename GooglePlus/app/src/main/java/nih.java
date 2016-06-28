public final class nih
  extends qan<nih>
{
  public int a = -2147483648;
  public int b = -2147483648;
  private Integer c = null;
  private Integer d = null;
  
  public nih()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i8;
    int i9;
    if (this.a != -2147483648)
    {
      int i7 = this.a;
      i8 = qal.d(8);
      if (i7 >= 0) {
        i9 = qal.d(i7);
      }
    }
    for (int k = j + (i9 + i8);; k = j)
    {
      int i6;
      label85:
      int i1;
      int i2;
      if (this.c != null)
      {
        int i4 = this.c.intValue();
        int i5 = qal.d(16);
        if (i4 >= 0)
        {
          i6 = qal.d(i4);
          k += i6 + i5;
        }
      }
      else if (this.d != null)
      {
        i1 = this.d.intValue();
        i2 = qal.d(24);
        if (i1 < 0) {
          break label190;
        }
      }
      label190:
      for (int i3 = qal.d(i1);; i3 = i)
      {
        k += i3 + i2;
        if (this.b != -2147483648)
        {
          int m = this.b;
          int n = qal.d(32);
          if (m >= 0) {
            i = qal.d(m);
          }
          k += i + n;
        }
        return k;
        i9 = i;
        break;
        i6 = i;
        break label85;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int m = this.a;
      paramqal.c(8);
      paramqal.a(m);
    }
    if (this.c != null)
    {
      int k = this.c.intValue();
      paramqal.c(16);
      paramqal.a(k);
    }
    if (this.d != null)
    {
      int j = this.d.intValue();
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nih
 * JD-Core Version:    0.7.0.1
 */