public final class oos
  extends qan<oos>
{
  private oor a = null;
  private int b = -2147483648;
  private oot c = null;
  
  public oos()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oor localoor = this.a;
      int i2 = qal.d(8);
      int i3 = localoor.a();
      localoor.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.b != -2147483648)
    {
      m = this.b;
      n = qal.d(16);
      if (m < 0) {
        break label140;
      }
    }
    label140:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.c != null)
      {
        oot localoot = this.c;
        int j = qal.d(24);
        int k = localoot.a();
        localoot.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oor localoor = this.a;
      paramqal.c(10);
      if (localoor.ak < 0) {
        localoor.ak = localoor.a();
      }
      paramqal.c(localoor.ak);
      localoor.a(paramqal);
    }
    if (this.b != -2147483648)
    {
      int i = this.b;
      paramqal.c(16);
      paramqal.a(i);
    }
    if (this.c != null)
    {
      oot localoot = this.c;
      paramqal.c(26);
      if (localoot.ak < 0) {
        localoot.ak = localoot.a();
      }
      paramqal.c(localoot.ak);
      localoot.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oos
 * JD-Core Version:    0.7.0.1
 */