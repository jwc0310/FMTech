public final class mox
  extends qan<mox>
{
  private Long a = null;
  private Long b = null;
  
  public mox()
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
      long l1 = this.b.longValue();
      i += qal.d(16) + qal.b(l1);
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
      long l1 = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mox
 * JD-Core Version:    0.7.0.1
 */