public final class nji
  extends qan<nji>
{
  public njh[] a = njh.b();
  public Long b = null;
  public String c = null;
  public String d = null;
  public int e = -2147483648;
  
  public nji()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i4 = 0; i4 < this.a.length; i4++)
      {
        njh localnjh = this.a[i4];
        if (localnjh != null)
        {
          int i5 = qal.d(8);
          int i6 = localnjh.a();
          localnjh.ak = i6;
          i += i5 + (i6 + qal.d(i6));
        }
      }
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      i += qal.d(16) + qal.b(l);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int i2 = qal.d(24);
      int i3 = qal.a(str2);
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int n = qal.d(32);
      int i1 = qal.a(str1);
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.e != -2147483648)
    {
      j = this.e;
      k = qal.d(40);
      if (j < 0) {
        break label239;
      }
    }
    label239:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        njh localnjh = this.a[j];
        if (localnjh != null)
        {
          paramqal.c(10);
          if (localnjh.ak < 0) {
            localnjh.ak = localnjh.a();
          }
          paramqal.c(localnjh.ak);
          localnjh.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.e != -2147483648)
    {
      int i = this.e;
      paramqal.c(40);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nji
 * JD-Core Version:    0.7.0.1
 */