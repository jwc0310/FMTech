public final class kol
  extends qan<kol>
{
  public myt a = null;
  public Long b = null;
  public String c = null;
  
  public kol()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      myt localmyt = this.a;
      int m = qal.d(8);
      int n = localmyt.a();
      localmyt.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      i += qal.d(16) + qal.b(l);
    }
    if (this.c != null)
    {
      String str = this.c;
      int j = qal.d(24);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      myt localmyt = this.a;
      paramqal.c(10);
      if (localmyt.ak < 0) {
        localmyt.ak = localmyt.a();
      }
      paramqal.c(localmyt.ak);
      localmyt.a(paramqal);
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(26);
      paramqal.a(str);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kol
 * JD-Core Version:    0.7.0.1
 */