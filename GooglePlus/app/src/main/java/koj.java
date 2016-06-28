public final class koj
  extends qan<koj>
{
  public myt a = null;
  public Long b = null;
  public String c = null;
  public String d = null;
  public kok[] e = kok.b();
  
  public koj()
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
      int i5 = qal.d(8);
      int i6 = localmyt.a();
      localmyt.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      i += qal.d(16) + qal.b(l);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int i3 = qal.d(24);
      int i4 = qal.a(str2);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int i1 = qal.d(32);
      int i2 = qal.a(str1);
      i += i1 + (i2 + qal.d(i2));
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.e.length; k++)
      {
        kok localkok = this.e[k];
        if (localkok != null)
        {
          int m = qal.d(40);
          int n = localkok.a();
          localkok.ak = n;
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
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i = 0; i < this.e.length; i++)
      {
        kok localkok = this.e[i];
        if (localkok != null)
        {
          paramqal.c(42);
          if (localkok.ak < 0) {
            localkok.ak = localkok.a();
          }
          paramqal.c(localkok.ak);
          localkok.a(paramqal);
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     koj
 * JD-Core Version:    0.7.0.1
 */