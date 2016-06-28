public final class rlc
  extends qan<rlc>
{
  private static volatile rlc[] d;
  public Integer a = null;
  public String b = null;
  public String c = null;
  
  public rlc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static rlc[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new rlc[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.e(1, this.a.intValue());
    }
    if (this.b != null) {
      i += qal.b(2, this.b);
    }
    if (this.c != null) {
      i += qal.b(3, this.c);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a.intValue());
    }
    if (this.b != null) {
      paramqal.a(2, this.b);
    }
    if (this.c != null) {
      paramqal.a(3, this.c);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rlc
 * JD-Core Version:    0.7.0.1
 */