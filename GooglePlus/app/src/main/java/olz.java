public final class olz
  extends qan<olz>
{
  private oky a = null;
  private oky[] b = oky.b();
  private olv c = null;
  
  public olz()
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
      int i3 = qal.d(32);
      int i4 = localoky2.a();
      localoky2.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int m = i;
      for (int n = 0; n < this.b.length; n++)
      {
        oky localoky1 = this.b[n];
        if (localoky1 != null)
        {
          int i1 = qal.d(40);
          int i2 = localoky1.a();
          localoky1.ak = i2;
          m += i1 + (i2 + qal.d(i2));
        }
      }
      i = m;
    }
    if (this.c != null)
    {
      olv localolv = this.c;
      int j = qal.d(48);
      int k = localolv.a();
      localolv.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      oky localoky2 = this.a;
      paramqal.c(34);
      if (localoky2.ak < 0) {
        localoky2.ak = localoky2.a();
      }
      paramqal.c(localoky2.ak);
      localoky2.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        oky localoky1 = this.b[i];
        if (localoky1 != null)
        {
          paramqal.c(42);
          if (localoky1.ak < 0) {
            localoky1.ak = localoky1.a();
          }
          paramqal.c(localoky1.ak);
          localoky1.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      olv localolv = this.c;
      paramqal.c(50);
      if (localolv.ak < 0) {
        localolv.ak = localolv.a();
      }
      paramqal.c(localolv.ak);
      localolv.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     olz
 * JD-Core Version:    0.7.0.1
 */