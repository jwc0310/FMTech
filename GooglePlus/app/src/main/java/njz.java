public final class njz
  extends qan<njz>
{
  private Long a = null;
  
  public njz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      long l = this.a.longValue();
      i += qal.d(8) + qal.b(l);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      long l = this.a.longValue();
      paramqal.c(8);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     njz
 * JD-Core Version:    0.7.0.1
 */