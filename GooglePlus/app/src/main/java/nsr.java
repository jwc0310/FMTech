public final class nsr
  extends qan<nsr>
{
  public int a = -2147483648;
  public int b = -2147483648;
  private nsk c = null;
  private Integer d = null;
  private int e = -2147483648;
  
  public nsr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.c != null)
    {
      nsk localnsk = this.c;
      int i9 = qal.d(8);
      int i10 = localnsk.a();
      localnsk.ak = i10;
      j += i9 + (i10 + qal.d(i10));
    }
    int i8;
    int i5;
    label132:
    int n;
    int i1;
    if (this.a != -2147483648)
    {
      int i6 = this.a;
      int i7 = qal.d(16);
      if (i6 >= 0)
      {
        i8 = qal.d(i6);
        j += i8 + i7;
      }
    }
    else
    {
      if (this.b != -2147483648)
      {
        int i3 = this.b;
        int i4 = qal.d(24);
        if (i3 < 0) {
          break label228;
        }
        i5 = qal.d(i3);
        j += i5 + i4;
      }
      if (this.d != null)
      {
        n = this.d.intValue();
        i1 = qal.d(32);
        if (n < 0) {
          break label234;
        }
      }
    }
    label228:
    label234:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.e != -2147483648)
      {
        int k = this.e;
        int m = qal.d(40);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
      i8 = i;
      break;
      i5 = i;
      break label132;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      nsk localnsk = this.c;
      paramqal.c(10);
      if (localnsk.ak < 0) {
        localnsk.ak = localnsk.a();
      }
      paramqal.c(localnsk.ak);
      localnsk.a(paramqal);
    }
    if (this.a != -2147483648)
    {
      int m = this.a;
      paramqal.c(16);
      paramqal.a(m);
    }
    if (this.b != -2147483648)
    {
      int k = this.b;
      paramqal.c(24);
      paramqal.a(k);
    }
    if (this.d != null)
    {
      int j = this.d.intValue();
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.e != -2147483648)
    {
      int i = this.e;
      paramqal.c(40);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsr
 * JD-Core Version:    0.7.0.1
 */