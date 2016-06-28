public final class nsu
  extends qan<nsu>
{
  public String a = null;
  public int b = -2147483648;
  private Long c = null;
  private nsp[] d = nsp.b();
  
  public nsu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i4 = qal.d(8);
      int i5 = qal.a(str);
      i += i4 + (i5 + qal.d(i5));
    }
    int i1;
    int i2;
    if (this.b != -2147483648)
    {
      i1 = this.b;
      i2 = qal.d(24);
      if (i1 < 0) {
        break label200;
      }
    }
    int j;
    label200:
    for (int i3 = qal.d(i1);; i3 = 10)
    {
      i += i3 + i2;
      if (this.c != null)
      {
        long l = this.c.longValue();
        i += qal.d(32) + qal.b(l);
      }
      if ((this.d == null) || (this.d.length <= 0)) {
        return i;
      }
      j = i;
      for (int k = 0; k < this.d.length; k++)
      {
        nsp localnsp = this.d[k];
        if (localnsp != null)
        {
          int m = qal.d(40);
          int n = localnsp.a();
          localnsp.ak = n;
          j += m + (n + qal.d(n));
        }
      }
    }
    i = j;
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != -2147483648)
    {
      int j = this.b;
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      long l = this.c.longValue();
      paramqal.c(32);
      paramqal.a(l);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i = 0; i < this.d.length; i++)
      {
        nsp localnsp = this.d[i];
        if (localnsp != null)
        {
          paramqal.c(42);
          if (localnsp.ak < 0) {
            localnsp.ak = localnsp.a();
          }
          paramqal.c(localnsp.ak);
          localnsp.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsu
 * JD-Core Version:    0.7.0.1
 */