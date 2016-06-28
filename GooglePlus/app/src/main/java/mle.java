public final class mle
  extends qan<mle>
{
  private String a = null;
  private int b = -2147483648;
  private int[] c = qay.a;
  
  public mle()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i4 = qal.d(8);
      int i5 = qal.a(str);
      j += i4 + (i5 + qal.d(i5));
    }
    int i3;
    int k;
    label107:
    int m;
    if (this.b != -2147483648)
    {
      int i1 = this.b;
      int i2 = qal.d(16);
      if (i1 >= 0)
      {
        i3 = qal.d(i1);
        j += i3 + i2;
      }
    }
    else
    {
      if ((this.c == null) || (this.c.length <= 0)) {
        return j;
      }
      k = 0;
      if (k >= this.c.length) {
        break label161;
      }
      m = this.c[k];
      if (m < 0) {
        break label154;
      }
    }
    label154:
    for (int n = qal.d(m);; n = 10)
    {
      i += n;
      k++;
      break label107;
      i3 = 10;
      break;
    }
    label161:
    j = j + i + 1 * this.c.length;
    return j;
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
      int k = this.b;
      paramqal.c(16);
      paramqal.a(k);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        int j = this.c[i];
        paramqal.c(24);
        paramqal.a(j);
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mle
 * JD-Core Version:    0.7.0.1
 */