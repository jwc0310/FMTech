public final class njs
  extends qan<njs>
{
  public Integer a = null;
  private Integer b = null;
  private Integer c = null;
  private Integer d = null;
  
  public njs()
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
    if (this.a != null)
    {
      int i7 = this.a.intValue();
      i8 = qal.d(8);
      if (i7 >= 0) {
        i9 = qal.d(i7);
      }
    }
    for (int k = j + (i9 + i8);; k = j)
    {
      int i6;
      label86:
      int i1;
      int i2;
      if (this.b != null)
      {
        int i4 = this.b.intValue();
        int i5 = qal.d(16);
        if (i4 >= 0)
        {
          i6 = qal.d(i4);
          k += i6 + i5;
        }
      }
      else if (this.c != null)
      {
        i1 = this.c.intValue();
        i2 = qal.d(24);
        if (i1 < 0) {
          break label192;
        }
      }
      label192:
      for (int i3 = qal.d(i1);; i3 = i)
      {
        k += i3 + i2;
        if (this.d != null)
        {
          int m = this.d.intValue();
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
        break label86;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int m = this.a.intValue();
      paramqal.c(8);
      paramqal.a(m);
    }
    if (this.b != null)
    {
      int k = this.b.intValue();
      paramqal.c(16);
      paramqal.a(k);
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
 * Qualified Name:     njs
 * JD-Core Version:    0.7.0.1
 */