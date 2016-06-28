public final class ojy
  extends qan<ojy>
{
  private static volatile ojy[] d;
  public Integer a = null;
  public Integer b = null;
  public String c = null;
  private Integer e = null;
  
  public ojy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ojy[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new ojy[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int k = this.a.intValue();
    int m = qal.d(8);
    int n;
    int i1;
    int i2;
    int i3;
    if (k >= 0)
    {
      n = qal.d(k);
      i1 = j + (n + m);
      i2 = this.e.intValue();
      i3 = qal.d(16);
      if (i2 < 0) {
        break label168;
      }
    }
    label168:
    for (int i4 = qal.d(i2);; i4 = i)
    {
      int i5 = i1 + (i4 + i3);
      int i6 = this.b.intValue();
      int i7 = qal.d(24);
      if (i6 >= 0) {
        i = qal.d(i6);
      }
      int i8 = i5 + (i + i7);
      if (this.c != null)
      {
        String str = this.c;
        int i9 = qal.d(32);
        int i10 = qal.a(str);
        i8 += i9 + (i10 + qal.d(i10));
      }
      return i8;
      n = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = this.a.intValue();
    paramqal.c(8);
    paramqal.a(i);
    int j = this.e.intValue();
    paramqal.c(16);
    paramqal.a(j);
    int k = this.b.intValue();
    paramqal.c(24);
    paramqal.a(k);
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(34);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ojy
 * JD-Core Version:    0.7.0.1
 */