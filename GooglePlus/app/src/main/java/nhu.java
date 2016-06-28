public final class nhu
  extends qan<nhu>
{
  private Float a = null;
  private Float b = null;
  private Float c = null;
  private Float d = null;
  
  public nhu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      this.a.floatValue();
      i += 4 + qal.d(8);
    }
    if (this.b != null)
    {
      this.b.floatValue();
      i += 4 + qal.d(16);
    }
    if (this.c != null)
    {
      this.c.floatValue();
      i += 4 + qal.d(24);
    }
    if (this.d != null)
    {
      this.d.floatValue();
      i += 4 + qal.d(32);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      float f4 = this.a.floatValue();
      paramqal.c(13);
      paramqal.e(Float.floatToIntBits(f4));
    }
    if (this.b != null)
    {
      float f3 = this.b.floatValue();
      paramqal.c(21);
      paramqal.e(Float.floatToIntBits(f3));
    }
    if (this.c != null)
    {
      float f2 = this.c.floatValue();
      paramqal.c(29);
      paramqal.e(Float.floatToIntBits(f2));
    }
    if (this.d != null)
    {
      float f1 = this.d.floatValue();
      paramqal.c(37);
      paramqal.e(Float.floatToIntBits(f1));
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nhu
 * JD-Core Version:    0.7.0.1
 */