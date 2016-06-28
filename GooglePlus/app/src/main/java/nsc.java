public final class nsc
  extends qan<nsc>
{
  public String a = null;
  public nsr b = null;
  private Integer c = null;
  private Integer d = null;
  private nsu e = null;
  
  public nsc()
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
    if (this.c != null)
    {
      int i7 = this.c.intValue();
      i8 = qal.d(8);
      if (i7 >= 0) {
        i9 = qal.d(i7);
      }
    }
    for (int k = j + (i9 + i8);; k = j)
    {
      if (this.a != null)
      {
        String str = this.a;
        int i5 = qal.d(16);
        int i6 = qal.a(str);
        k += i5 + (i6 + qal.d(i6));
      }
      if (this.b != null)
      {
        nsr localnsr = this.b;
        int i3 = qal.d(24);
        int i4 = localnsr.a();
        localnsr.ak = i4;
        k += i3 + (i4 + qal.d(i4));
      }
      if (this.e != null)
      {
        nsu localnsu = this.e;
        int i1 = qal.d(32);
        int i2 = localnsu.a();
        localnsu.ak = i2;
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.d != null)
      {
        int m = this.d.intValue();
        int n = qal.d(40);
        if (m >= 0) {
          i = qal.d(m);
        }
        k += i + n;
      }
      return k;
      i9 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      int j = this.c.intValue();
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      nsr localnsr = this.b;
      paramqal.c(26);
      if (localnsr.ak < 0) {
        localnsr.ak = localnsr.a();
      }
      paramqal.c(localnsr.ak);
      localnsr.a(paramqal);
    }
    if (this.e != null)
    {
      nsu localnsu = this.e;
      paramqal.c(34);
      if (localnsu.ak < 0) {
        localnsu.ak = localnsu.a();
      }
      paramqal.c(localnsu.ak);
      localnsu.a(paramqal);
    }
    if (this.d != null)
    {
      int i = this.d.intValue();
      paramqal.c(40);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsc
 * JD-Core Version:    0.7.0.1
 */