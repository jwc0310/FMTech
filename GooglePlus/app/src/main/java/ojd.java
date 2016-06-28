public final class ojd
  extends qan<ojd>
{
  private static volatile ojd[] e;
  public String a = null;
  public Integer b = null;
  public Integer c = null;
  public Integer d = null;
  
  public ojd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ojd[] b()
  {
    if (e == null) {}
    synchronized (qar.a)
    {
      if (e == null) {
        e = new ojd[0];
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    String str = this.a;
    int k = qal.d(8);
    int m = qal.a(str);
    int n = j + (k + (m + qal.d(m)));
    int i8;
    int i9;
    if (this.b != null)
    {
      int i7 = this.b.intValue();
      i8 = qal.d(16);
      if (i7 >= 0) {
        i9 = qal.d(i7);
      }
    }
    for (int i1 = n + (i9 + i8);; i1 = n)
    {
      int i4;
      int i5;
      if (this.c != null)
      {
        i4 = this.c.intValue();
        i5 = qal.d(24);
        if (i4 < 0) {
          break label183;
        }
      }
      label183:
      for (int i6 = qal.d(i4);; i6 = i)
      {
        i1 += i6 + i5;
        if (this.d != null)
        {
          int i2 = this.d.intValue();
          int i3 = qal.d(32);
          if (i2 >= 0) {
            i = qal.d(i2);
          }
          i1 += i + i3;
        }
        return i1;
        i9 = i;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    String str = this.a;
    paramqal.c(10);
    paramqal.a(str);
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
 * Qualified Name:     ojd
 * JD-Core Version:    0.7.0.1
 */