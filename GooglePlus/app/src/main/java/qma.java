public final class qma
  extends qan<qma>
{
  private static volatile qma[] h;
  public byte[] a = null;
  public Integer b = null;
  public Integer c = null;
  public Float d = null;
  public Float e = null;
  public Boolean f = null;
  public Float g = null;
  
  public qma()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static qma[] b()
  {
    if (h == null) {}
    synchronized (qar.a)
    {
      if (h == null) {
        h = new qma[0];
      }
      return h;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.b(1, this.a);
    }
    if (this.b != null) {
      i += qal.e(2, this.b.intValue());
    }
    if (this.c != null) {
      i += qal.e(3, this.c.intValue());
    }
    if (this.d != null) {
      i += qal.b(4, this.d.floatValue());
    }
    if (this.e != null) {
      i += qal.b(5, this.e.floatValue());
    }
    if (this.f != null) {
      i += qal.b(6, this.f.booleanValue());
    }
    if (this.g != null) {
      i += qal.b(7, this.g.floatValue());
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if (this.b != null) {
      paramqal.a(2, this.b.intValue());
    }
    if (this.c != null) {
      paramqal.a(3, this.c.intValue());
    }
    if (this.d != null) {
      paramqal.a(4, this.d.floatValue());
    }
    if (this.e != null) {
      paramqal.a(5, this.e.floatValue());
    }
    if (this.f != null) {
      paramqal.a(6, this.f.booleanValue());
    }
    if (this.g != null) {
      paramqal.a(7, this.g.floatValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qma
 * JD-Core Version:    0.7.0.1
 */