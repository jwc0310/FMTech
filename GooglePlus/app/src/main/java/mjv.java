public final class mjv
  extends qan<mjv>
{
  public String a = null;
  public mjr[] b = mjr.b();
  private String c = null;
  private mjs d = null;
  private mjw[] e = mjw.b();
  private String f = null;
  
  public mjv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.c != null)
    {
      String str3 = this.c;
      int i11 = qal.d(8);
      int i12 = qal.a(str3);
      i += i11 + (i12 + qal.d(i12));
    }
    if (this.a != null)
    {
      String str2 = this.a;
      int i9 = qal.d(16);
      int i10 = qal.a(str2);
      i += i9 + (i10 + qal.d(i10));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.b.length; i6++)
      {
        mjr localmjr = this.b[i6];
        if (localmjr != null)
        {
          int i7 = qal.d(24);
          int i8 = localmjr.a();
          localmjr.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if (this.d != null)
    {
      mjs localmjs = this.d;
      int i3 = qal.d(32);
      int i4 = localmjs.a();
      localmjs.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.e != null)
    {
      int m = this.e.length;
      int n = 0;
      if (m > 0) {
        while (n < this.e.length)
        {
          mjw localmjw = this.e[n];
          if (localmjw != null)
          {
            int i1 = qal.d(40);
            int i2 = localmjw.a();
            localmjw.ak = i2;
            i += i1 + (i2 + qal.d(i2));
          }
          n++;
        }
      }
    }
    if (this.f != null)
    {
      String str1 = this.f;
      int j = qal.d(48);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        mjr localmjr = this.b[k];
        if (localmjr != null)
        {
          paramqal.c(26);
          if (localmjr.ak < 0) {
            localmjr.ak = localmjr.a();
          }
          paramqal.c(localmjr.ak);
          localmjr.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      mjs localmjs = this.d;
      paramqal.c(34);
      if (localmjs.ak < 0) {
        localmjs.ak = localmjs.a();
      }
      paramqal.c(localmjs.ak);
      localmjs.a(paramqal);
    }
    if (this.e != null)
    {
      int i = this.e.length;
      int j = 0;
      if (i > 0) {
        while (j < this.e.length)
        {
          mjw localmjw = this.e[j];
          if (localmjw != null)
          {
            paramqal.c(42);
            if (localmjw.ak < 0) {
              localmjw.ak = localmjw.a();
            }
            paramqal.c(localmjw.ak);
            localmjw.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(50);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mjv
 * JD-Core Version:    0.7.0.1
 */