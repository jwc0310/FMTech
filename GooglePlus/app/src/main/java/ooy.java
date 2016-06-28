public final class ooy
  extends qan<ooy>
{
  private Long a = null;
  private Long b = null;
  private Long c = null;
  private Long d = null;
  
  public ooy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      long l4 = this.a.longValue();
      i += qal.d(8) + qal.b(l4);
    }
    if (this.b != null)
    {
      long l3 = this.b.longValue();
      i += qal.d(16) + qal.b(l3);
    }
    if (this.c != null)
    {
      long l2 = this.c.longValue();
      i += qal.d(24) + qal.b(l2);
    }
    if (this.d != null)
    {
      long l1 = this.d.longValue();
      i += qal.d(32) + qal.b(l1);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      long l4 = this.a.longValue();
      paramqal.c(8);
      paramqal.a(l4);
    }
    if (this.b != null)
    {
      long l3 = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l3);
    }
    if (this.c != null)
    {
      long l2 = this.c.longValue();
      paramqal.c(24);
      paramqal.a(l2);
    }
    if (this.d != null)
    {
      long l1 = this.d.longValue();
      paramqal.c(32);
      paramqal.a(l1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ooy
 * JD-Core Version:    0.7.0.1
 */