public final class oem
  extends qan<oem>
{
  public String a = null;
  public odp b = null;
  public oen c = null;
  private int d = -2147483648;
  
  public oem()
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
    if (this.b != null)
    {
      odp localodp = this.b;
      int i2 = qal.d(16);
      int i3 = localodp.a();
      localodp.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.c != null)
    {
      oen localoen = this.c;
      int n = qal.d(24);
      int i1 = localoen.a();
      localoen.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.d != -2147483648)
    {
      j = this.d;
      k = qal.d(32);
      if (j < 0) {
        break label181;
      }
    }
    label181:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
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
      odp localodp = this.b;
      paramqal.c(18);
      if (localodp.ak < 0) {
        localodp.ak = localodp.a();
      }
      paramqal.c(localodp.ak);
      localodp.a(paramqal);
    }
    if (this.c != null)
    {
      oen localoen = this.c;
      paramqal.c(26);
      if (localoen.ak < 0) {
        localoen.ak = localoen.a();
      }
      paramqal.c(localoen.ak);
      localoen.a(paramqal);
    }
    if (this.d != -2147483648)
    {
      int i = this.d;
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oem
 * JD-Core Version:    0.7.0.1
 */