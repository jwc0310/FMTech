public final class qha
  extends qan<qha>
{
  private static volatile qha[] d;
  public String a = null;
  public Integer b = null;
  public Integer c = null;
  private Boolean e = null;
  
  public qha()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static qha[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new qha[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a() + qal.b(1, this.a) + qal.g(2, this.b.intValue()) + qal.g(3, this.c.intValue());
    if (this.e != null) {
      i += qal.b(4, this.e.booleanValue());
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    paramqal.a(1, this.a);
    paramqal.c(2, this.b.intValue());
    paramqal.c(3, this.c.intValue());
    if (this.e != null) {
      paramqal.a(4, this.e.booleanValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qha
 * JD-Core Version:    0.7.0.1
 */