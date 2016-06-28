public final class moc
  extends qan<moc>
{
  private Double a = null;
  private Double b = null;
  
  public moc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      this.a.doubleValue();
      i += 8 + qal.d(8);
    }
    if (this.b != null)
    {
      this.b.doubleValue();
      i += 8 + qal.d(16);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      double d2 = this.a.doubleValue();
      paramqal.c(9);
      paramqal.c(Double.doubleToLongBits(d2));
    }
    if (this.b != null)
    {
      double d1 = this.b.doubleValue();
      paramqal.c(17);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     moc
 * JD-Core Version:    0.7.0.1
 */