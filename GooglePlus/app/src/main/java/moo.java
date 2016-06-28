public final class moo
  extends qan<moo>
{
  public String a = null;
  public Integer b = null;
  
  public moo()
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
      int k = qal.d(8);
      int m = qal.a(str);
      i += k + (m + qal.d(m));
    }
    if (this.b != null)
    {
      int j = this.b.intValue();
      i += qal.d(16) + qal.d(j);
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
      int i = this.b.intValue();
      paramqal.c(16);
      paramqal.c(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     moo
 * JD-Core Version:    0.7.0.1
 */