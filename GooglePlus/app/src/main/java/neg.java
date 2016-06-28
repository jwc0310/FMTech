public final class neg
  extends qan<neg>
{
  public int a = -2147483648;
  public ome b = null;
  public ndo c = null;
  
  public neg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i3;
    int i4;
    if (this.a != -2147483648)
    {
      int i2 = this.a;
      i3 = qal.d(8);
      if (i2 >= 0) {
        i4 = qal.d(i2);
      }
    }
    for (int j = i + (i4 + i3);; j = i)
    {
      if (this.b != null)
      {
        ome localome = this.b;
        int n = qal.d(16);
        int i1 = localome.a();
        localome.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.c != null)
      {
        ndo localndo = this.c;
        int k = qal.d(24);
        int m = localndo.a();
        localndo.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i4 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int i = this.a;
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      ome localome = this.b;
      paramqal.c(18);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    if (this.c != null)
    {
      ndo localndo = this.c;
      paramqal.c(26);
      if (localndo.ak < 0) {
        localndo.ak = localndo.a();
      }
      paramqal.c(localndo.ak);
      localndo.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     neg
 * JD-Core Version:    0.7.0.1
 */