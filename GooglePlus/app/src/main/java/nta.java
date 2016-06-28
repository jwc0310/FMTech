public final class nta
  extends qan<nta>
{
  public String a = null;
  private Integer b = null;
  private nsk c = null;
  
  public nta()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i3;
    int i4;
    if (this.b != null)
    {
      int i2 = this.b.intValue();
      i3 = qal.d(8);
      if (i2 >= 0) {
        i4 = qal.d(i2);
      }
    }
    for (int j = i + (i4 + i3);; j = i)
    {
      if (this.a != null)
      {
        String str = this.a;
        int n = qal.d(16);
        int i1 = qal.a(str);
        j += n + (i1 + qal.d(i1));
      }
      if (this.c != null)
      {
        nsk localnsk = this.c;
        int k = qal.d(24);
        int m = localnsk.a();
        localnsk.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i4 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      int i = this.b.intValue();
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.c != null)
    {
      nsk localnsk = this.c;
      paramqal.c(26);
      if (localnsk.ak < 0) {
        localnsk.ak = localnsk.a();
      }
      paramqal.c(localnsk.ak);
      localnsk.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nta
 * JD-Core Version:    0.7.0.1
 */