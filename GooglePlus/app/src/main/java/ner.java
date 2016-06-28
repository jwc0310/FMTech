public final class ner
  extends qan<ner>
{
  public String a = null;
  public ney b = null;
  
  static
  {
    new qao(11, ner.class, (int)562759954L, false);
  }
  
  public ner()
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
      int m = qal.d(8);
      int n = qal.a(str);
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      ney localney = this.b;
      int j = qal.d(16);
      int k = localney.a();
      localney.ak = k;
      i += j + (k + qal.d(k));
    }
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
    if (this.b != null)
    {
      ney localney = this.b;
      paramqal.c(18);
      if (localney.ak < 0) {
        localney.ak = localney.a();
      }
      paramqal.c(localney.ak);
      localney.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ner
 * JD-Core Version:    0.7.0.1
 */