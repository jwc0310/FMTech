public final class oef
  extends qan<oef>
{
  public Integer a = null;
  private Integer b = null;
  private Long c = null;
  private Long d = null;
  private String e = null;
  
  public oef()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i4;
    int i5;
    if (this.b != null)
    {
      int i3 = this.b.intValue();
      i4 = qal.d(8);
      if (i3 >= 0) {
        i5 = qal.d(i3);
      }
    }
    for (int k = j + (i5 + i4);; k = j)
    {
      if (this.a != null)
      {
        int i1 = this.a.intValue();
        int i2 = qal.d(16);
        if (i1 >= 0) {
          i = qal.d(i1);
        }
        k += i + i2;
      }
      if (this.c != null)
      {
        long l2 = this.c.longValue();
        k += qal.d(24) + qal.b(l2);
      }
      if (this.d != null)
      {
        long l1 = this.d.longValue();
        k += qal.d(32) + qal.b(l1);
      }
      if (this.e != null)
      {
        String str = this.e;
        int m = qal.d(40);
        int n = qal.a(str);
        k += m + (n + qal.d(n));
      }
      return k;
      i5 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      int j = this.b.intValue();
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.a != null)
    {
      int i = this.a.intValue();
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      long l2 = this.c.longValue();
      paramqal.c(24);
      paramqal.a(l2);
    }
    if (this.d != null)
    {
      long l1 = this.d.longValue();
      paramqal.c(32);
      paramqal.a(l1);
    }
    if (this.e != null)
    {
      String str = this.e;
      paramqal.c(42);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oef
 * JD-Core Version:    0.7.0.1
 */