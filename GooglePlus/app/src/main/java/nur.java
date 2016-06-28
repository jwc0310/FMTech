public final class nur
  extends qan<nur>
{
  public nuc a = null;
  public nus[] b = nus.b();
  
  static
  {
    new qao(11, nur.class, (int)548546138L, false);
  }
  
  public nur()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nuc localnuc = this.a;
      int i1 = qal.d(8);
      int i2 = localnuc.a();
      localnuc.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        nus localnus = this.b[k];
        if (localnus != null)
        {
          int m = qal.d(16);
          int n = localnus.a();
          localnus.ak = n;
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
      nuc localnuc = this.a;
      paramqal.c(10);
      if (localnuc.ak < 0) {
        localnuc.ak = localnuc.a();
      }
      paramqal.c(localnuc.ak);
      localnuc.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        nus localnus = this.b[i];
        if (localnus != null)
        {
          paramqal.c(18);
          if (localnus.ak < 0) {
            localnus.ak = localnus.a();
          }
          paramqal.c(localnus.ak);
          localnus.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nur
 * JD-Core Version:    0.7.0.1
 */