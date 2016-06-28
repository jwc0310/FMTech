public final class ndd
  extends qan<ndd>
{
  private Float a = null;
  private Integer b = null;
  private Integer c = null;
  private String d = null;
  private Double e = null;
  private Double f = null;
  
  public ndd()
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
      this.a.floatValue();
      j += 4 + qal.d(8);
    }
    int i2;
    int i3;
    if (this.b != null)
    {
      i2 = this.b.intValue();
      i3 = qal.d(16);
      if (i2 < 0) {
        break label212;
      }
    }
    label212:
    for (int i4 = qal.d(i2);; i4 = i)
    {
      j += i4 + i3;
      if (this.c != null)
      {
        int n = this.c.intValue();
        int i1 = qal.d(24);
        if (n >= 0) {
          i = qal.d(n);
        }
        j += i1 + i;
      }
      if (this.d != null)
      {
        String str = this.d;
        int k = qal.d(32);
        int m = qal.a(str);
        j += k + (m + qal.d(m));
      }
      if (this.e != null)
      {
        this.e.doubleValue();
        j += 8 + qal.d(40);
      }
      if (this.f != null)
      {
        this.f.doubleValue();
        j += 8 + qal.d(48);
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      float f1 = this.a.floatValue();
      paramqal.c(13);
      paramqal.e(Float.floatToIntBits(f1));
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
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(34);
      paramqal.a(str);
    }
    if (this.e != null)
    {
      double d2 = this.e.doubleValue();
      paramqal.c(41);
      paramqal.c(Double.doubleToLongBits(d2));
    }
    if (this.f != null)
    {
      double d1 = this.f.doubleValue();
      paramqal.c(49);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ndd
 * JD-Core Version:    0.7.0.1
 */