public final class rgw
  extends qan<rgw>
{
  public Long a = null;
  public Boolean b = null;
  public Integer c = null;
  public String d = null;
  
  public rgw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null) {
      i += qal.e(1, this.a.longValue());
    }
    if (this.b != null) {
      i += qal.b(2, this.b.booleanValue());
    }
    if (this.c != null) {
      i += qal.e(3, this.c.intValue());
    }
    if (this.d != null) {
      i += qal.b(4, this.d);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.b(1, this.a.longValue());
    }
    if (this.b != null) {
      paramqal.a(2, this.b.booleanValue());
    }
    if (this.c != null) {
      paramqal.a(3, this.c.intValue());
    }
    if (this.d != null) {
      paramqal.a(4, this.d);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rgw
 * JD-Core Version:    0.7.0.1
 */