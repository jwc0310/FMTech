public final class odc
  extends qan<odc>
{
  public odb[] a = odb.a;
  
  static
  {
    new qao(11, odc.class, (int)399726754L, false);
  }
  
  public odc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        odb localodb = this.a[j];
        if (localodb != null)
        {
          int k = qal.d(8);
          int m = localodb.a();
          localodb.ak = m;
          i += k + (m + qal.d(m));
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        odb localodb = this.a[i];
        if (localodb != null)
        {
          paramqal.c(10);
          if (localodb.ak < 0) {
            localodb.ak = localodb.a();
          }
          paramqal.c(localodb.ak);
          localodb.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odc
 * JD-Core Version:    0.7.0.1
 */