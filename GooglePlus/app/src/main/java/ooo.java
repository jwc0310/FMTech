public final class ooo
  extends qan<ooo>
{
  private ood a = null;
  private String b = null;
  private String c = null;
  private ond[] d = ond.b();
  
  public ooo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ood localood = this.a;
      int i5 = qal.d(8);
      int i6 = localood.a();
      localood.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i3 = qal.d(16);
      int i4 = qal.a(str2);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int i1 = qal.d(24);
      int i2 = qal.a(str1);
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.d.length; k++)
      {
        ond localond = this.d[k];
        if (localond != null)
        {
          int m = qal.d(32);
          int n = localond.a();
          localond.ak = n;
          j += m + (n + qal.d(n));
        }
      }
      i = j;
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ood localood = this.a;
      paramqal.c(10);
      if (localood.ak < 0) {
        localood.ak = localood.a();
      }
      paramqal.c(localood.ak);
      localood.a(paramqal);
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
    if ((this.d != null) && (this.d.length > 0)) {
      for (int i = 0; i < this.d.length; i++)
      {
        ond localond = this.d[i];
        if (localond != null)
        {
          paramqal.c(34);
          if (localond.ak < 0) {
            localond.ak = localond.a();
          }
          paramqal.c(localond.ak);
          localond.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ooo
 * JD-Core Version:    0.7.0.1
 */