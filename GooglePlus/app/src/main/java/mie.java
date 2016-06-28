public final class mie
  extends qan<mie>
{
  public Long a = null;
  private String b = null;
  private Long c = null;
  
  public mie()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      long l2 = this.a.longValue();
      i += qal.d(8) + qal.b(l2);
    }
    if (this.b != null)
    {
      String str = this.b;
      int j = qal.d(16);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    if (this.c != null)
    {
      long l1 = this.c.longValue();
      i += qal.d(24) + qal.b(l1);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      long l2 = this.a.longValue();
      paramqal.c(8);
      paramqal.a(l2);
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.c != null)
    {
      long l1 = this.c.longValue();
      paramqal.c(24);
      paramqal.a(l1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mie
 * JD-Core Version:    0.7.0.1
 */