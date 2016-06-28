public final class ogx
  extends qan<ogx>
{
  public String a = null;
  public Integer b = null;
  public int[] c = qay.a;
  
  public ogx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    String str = this.a;
    int k = qal.d(8);
    int m = qal.a(str);
    int n = j + (k + (m + qal.d(m)));
    int i6;
    int i7;
    if (this.b != null)
    {
      int i5 = this.b.intValue();
      i6 = qal.d(16);
      if (i5 >= 0) {
        i7 = qal.d(i5);
      }
    }
    for (int i1 = n + (i7 + i6);; i1 = n)
    {
      if ((this.c != null) && (this.c.length > 0))
      {
        int i2 = 0;
        label103:
        if (i2 < this.c.length)
        {
          int i3 = this.c[i2];
          if (i3 >= 0) {}
          for (int i4 = qal.d(i3);; i4 = 10)
          {
            i += i4;
            i2++;
            break label103;
            i7 = 10;
            break;
          }
        }
        i1 = i1 + i + 1 * this.c.length;
      }
      return i1;
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
 * Qualified Name:     ogx
 * JD-Core Version:    0.7.0.1
 */