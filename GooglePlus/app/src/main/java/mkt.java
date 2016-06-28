public final class mkt
  extends qan<mkt>
{
  public mkn a = null;
  public mkr[] b = mkr.b();
  public String c = null;
  public String d = null;
  public mkq[] e = mkq.b();
  private String f = null;
  private mkn g = null;
  private mkn h = null;
  
  public mkt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      mkn localmkn3 = this.a;
      int i15 = qal.d(8);
      int i16 = localmkn3.a();
      localmkn3.ak = i16;
      i += i15 + (i16 + qal.d(i16));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i11 = i;
      for (int i12 = 0; i12 < this.b.length; i12++)
      {
        mkr localmkr = this.b[i12];
        if (localmkr != null)
        {
          int i13 = qal.d(16);
          int i14 = localmkr.a();
          localmkr.ak = i14;
          i11 += i13 + (i14 + qal.d(i14));
        }
      }
      i = i11;
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i9 = qal.d(24);
      int i10 = qal.a(str3);
      i += i9 + (i10 + qal.d(i10));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i7 = qal.d(32);
      int i8 = qal.a(str2);
      i += i7 + (i8 + qal.d(i8));
    }
    if (this.e != null)
    {
      int i3 = this.e.length;
      int i4 = 0;
      if (i3 > 0) {
        while (i4 < this.e.length)
        {
          mkq localmkq = this.e[i4];
          if (localmkq != null)
          {
            int i5 = qal.d(40);
            int i6 = localmkq.a();
            localmkq.ak = i6;
            i += i5 + (i6 + qal.d(i6));
          }
          i4++;
        }
      }
    }
    if (this.f != null)
    {
      String str1 = this.f;
      int i1 = qal.d(48);
      int i2 = qal.a(str1);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.g != null)
    {
      mkn localmkn2 = this.g;
      int m = qal.d(56);
      int n = localmkn2.a();
      localmkn2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.h != null)
    {
      mkn localmkn1 = this.h;
      int j = qal.d(64);
      int k = localmkn1.a();
      localmkn1.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mkn localmkn3 = this.a;
      paramqal.c(10);
      if (localmkn3.ak < 0) {
        localmkn3.ak = localmkn3.a();
      }
      paramqal.c(localmkn3.ak);
      localmkn3.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        mkr localmkr = this.b[k];
        if (localmkr != null)
        {
          paramqal.c(18);
          if (localmkr.ak < 0) {
            localmkr.ak = localmkr.a();
          }
          paramqal.c(localmkr.ak);
          localmkr.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      int i = this.e.length;
      int j = 0;
      if (i > 0) {
        while (j < this.e.length)
        {
          mkq localmkq = this.e[j];
          if (localmkq != null)
          {
            paramqal.c(42);
            if (localmkq.ak < 0) {
              localmkq.ak = localmkq.a();
            }
            paramqal.c(localmkq.ak);
            localmkq.a(paramqal);
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
    if (this.g != null)
    {
      mkn localmkn2 = this.g;
      paramqal.c(58);
      if (localmkn2.ak < 0) {
        localmkn2.ak = localmkn2.a();
      }
      paramqal.c(localmkn2.ak);
      localmkn2.a(paramqal);
    }
    if (this.h != null)
    {
      mkn localmkn1 = this.h;
      paramqal.c(66);
      if (localmkn1.ak < 0) {
        localmkn1.ak = localmkn1.a();
      }
      paramqal.c(localmkn1.ak);
      localmkn1.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mkt
 * JD-Core Version:    0.7.0.1
 */