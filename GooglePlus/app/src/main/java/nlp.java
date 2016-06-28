public final class nlp
  extends qan<nlp>
{
  private Integer a = null;
  private String b = null;
  private String c = null;
  private nlq d = null;
  
  public nlp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i5;
    int i6;
    if (this.a != null)
    {
      int i4 = this.a.intValue();
      i5 = qal.d(8);
      if (i4 >= 0) {
        i6 = qal.d(i4);
      }
    }
    for (int j = i + (i6 + i5);; j = i)
    {
      if (this.b != null)
      {
        String str2 = this.b;
        int i2 = qal.d(16);
        int i3 = qal.a(str2);
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.c != null)
      {
        String str1 = this.c;
        int n = qal.d(24);
        int i1 = qal.a(str1);
        j += n + (i1 + qal.d(i1));
      }
      if (this.d != null)
      {
        nlq localnlq = this.d;
        int k = qal.d(32);
        int m = localnlq.a();
        localnlq.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i6 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int i = this.a.intValue();
      paramqal.c(8);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(26);
      paramqal.a(str1);
    }
    if (this.d != null)
    {
      nlq localnlq = this.d;
      paramqal.c(34);
      if (localnlq.ak < 0) {
        localnlq.ak = localnlq.a();
      }
      paramqal.c(localnlq.ak);
      localnlq.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nlp
 * JD-Core Version:    0.7.0.1
 */