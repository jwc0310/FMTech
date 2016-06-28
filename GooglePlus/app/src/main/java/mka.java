public final class mka
  extends qan<mka>
{
  public static final qao<mjy, mka> a = new qao(11, mka.class, (int)650425490L, false);
  public mjz[] b = mjz.b();
  private String c = null;
  
  public mka()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.c != null)
    {
      String str = this.c;
      int i1 = qal.d(8);
      int i2 = qal.a(str);
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        mjz localmjz = this.b[k];
        if (localmjz != null)
        {
          int m = qal.d(16);
          int n = localmjz.a();
          localmjz.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(10);
      paramqal.a(str);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        mjz localmjz = this.b[i];
        if (localmjz != null)
        {
          paramqal.c(18);
          if (localmjz.ak < 0) {
            localmjz.ak = localmjz.a();
          }
          paramqal.c(localmjz.ak);
          localmjz.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mka
 * JD-Core Version:    0.7.0.1
 */