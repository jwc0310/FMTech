public final class oei
  extends qan<oei>
{
  private ody[] a = ody.a;
  
  public oei()
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
        ody localody = this.a[j];
        if (localody != null)
        {
          int k = qal.d(8);
          int m = localody.a();
          localody.ak = m;
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
        ody localody = this.a[i];
        if (localody != null)
        {
          paramqal.c(10);
          if (localody.ak < 0) {
            localody.ak = localody.a();
          }
          paramqal.c(localody.ak);
          localody.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oei
 * JD-Core Version:    0.7.0.1
 */