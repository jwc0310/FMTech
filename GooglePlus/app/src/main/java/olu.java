public final class olu
  extends qan<olu>
{
  private oky a = null;
  private olv b = null;
  private oky[] c = oky.b();
  
  public olu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      oky localoky2 = this.a;
      int i3 = qal.d(8);
      int i4 = localoky2.a();
      localoky2.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      olv localolv = this.b;
      int i1 = qal.d(16);
      int i2 = localolv.a();
      localolv.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.c.length; k++)
      {
        oky localoky1 = this.c[k];
        if (localoky1 != null)
        {
          int m = qal.d(24);
          int n = localoky1.a();
          localoky1.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oky localoky2 = this.a;
      paramqal.c(10);
      if (localoky2.ak < 0) {
        localoky2.ak = localoky2.a();
      }
      paramqal.c(localoky2.ak);
      localoky2.a(paramqal);
    }
    if (this.b != null)
    {
      olv localolv = this.b;
      paramqal.c(18);
      if (localolv.ak < 0) {
        localolv.ak = localolv.a();
      }
      paramqal.c(localolv.ak);
      localolv.a(paramqal);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        oky localoky1 = this.c[i];
        if (localoky1 != null)
        {
          paramqal.c(26);
          if (localoky1.ak < 0) {
            localoky1.ak = localoky1.a();
          }
          paramqal.c(localoky1.ak);
          localoky1.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olu
 * JD-Core Version:    0.7.0.1
 */