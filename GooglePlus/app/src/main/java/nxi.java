public final class nxi
  extends qan<nxi>
{
  public String a = null;
  public nxj b = null;
  public int c = -2147483648;
  public nxh d = null;
  public Integer e = null;
  
  public nxi()
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
      String str = this.a;
      int i7 = qal.d(8);
      int i8 = qal.a(str);
      j += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      nxj localnxj = this.b;
      int i5 = qal.d(16);
      int i6 = localnxj.a();
      localnxj.ak = i6;
      j += i5 + (i6 + qal.d(i6));
    }
    int i2;
    int i3;
    if (this.c != -2147483648)
    {
      i2 = this.c;
      i3 = qal.d(24);
      if (i2 < 0) {
        break label227;
      }
    }
    label227:
    for (int i4 = qal.d(i2);; i4 = i)
    {
      j += i4 + i3;
      if (this.d != null)
      {
        nxh localnxh = this.d;
        int n = qal.d(32);
        int i1 = localnxh.a();
        localnxh.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.e != null)
      {
        int k = this.e.intValue();
        int m = qal.d(40);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
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
    if (this.b != null)
    {
      nxj localnxj = this.b;
      paramqal.c(18);
      if (localnxj.ak < 0) {
        localnxj.ak = localnxj.a();
      }
      paramqal.c(localnxj.ak);
      localnxj.a(paramqal);
    }
    if (this.c != -2147483648)
    {
      int j = this.c;
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.d != null)
    {
      nxh localnxh = this.d;
      paramqal.c(34);
      if (localnxh.ak < 0) {
        localnxh.ak = localnxh.a();
      }
      paramqal.c(localnxh.ak);
      localnxh.a(paramqal);
    }
    if (this.e != null)
    {
      int i = this.e.intValue();
      paramqal.c(40);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxi
 * JD-Core Version:    0.7.0.1
 */