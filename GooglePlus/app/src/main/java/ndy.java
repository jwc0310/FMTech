public final class ndy
  extends qan<ndy>
{
  private static volatile ndy[] h;
  public ndt a = null;
  public String b = null;
  public String c = null;
  public ndx d = null;
  public neg e = null;
  public nea f = null;
  public String g = null;
  private omk i = null;
  
  public ndy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ndy[] b()
  {
    if (h == null) {}
    synchronized (qar.a)
    {
      if (h == null) {
        h = new ndy[0];
      }
      return h;
    }
  }
  
  protected final int a()
  {
    int j = super.a();
    if (this.a != null)
    {
      ndt localndt = this.a;
      int i12 = qal.d(8);
      int i13 = localndt.a();
      localndt.ak = i13;
      j += i12 + (i13 + qal.d(i13));
    }
    if (this.b != null)
    {
      String str3 = this.b;
      int i10 = qal.d(16);
      int i11 = qal.a(str3);
      j += i10 + (i11 + qal.d(i11));
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int i8 = qal.d(24);
      int i9 = qal.a(str2);
      j += i8 + (i9 + qal.d(i9));
    }
    if (this.d != null)
    {
      ndx localndx = this.d;
      int i6 = qal.d(32);
      int i7 = localndx.a();
      localndx.ak = i7;
      j += i6 + (i7 + qal.d(i7));
    }
    if (this.i != null)
    {
      omk localomk = this.i;
      int i4 = qal.d(40);
      int i5 = localomk.a();
      localomk.ak = i5;
      j += i4 + (i5 + qal.d(i5));
    }
    if (this.e != null)
    {
      neg localneg = this.e;
      int i2 = qal.d(48);
      int i3 = localneg.a();
      localneg.ak = i3;
      j += i2 + (i3 + qal.d(i3));
    }
    if (this.f != null)
    {
      nea localnea = this.f;
      int n = qal.d(56);
      int i1 = localnea.a();
      localnea.ak = i1;
      j += n + (i1 + qal.d(i1));
    }
    if (this.g != null)
    {
      String str1 = this.g;
      int k = qal.d(64);
      int m = qal.a(str1);
      j += k + (m + qal.d(m));
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ndt localndt = this.a;
      paramqal.c(10);
      if (localndt.ak < 0) {
        localndt.ak = localndt.a();
      }
      paramqal.c(localndt.ak);
      localndt.a(paramqal);
    }
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      ndx localndx = this.d;
      paramqal.c(34);
      if (localndx.ak < 0) {
        localndx.ak = localndx.a();
      }
      paramqal.c(localndx.ak);
      localndx.a(paramqal);
    }
    if (this.i != null)
    {
      omk localomk = this.i;
      paramqal.c(42);
      if (localomk.ak < 0) {
        localomk.ak = localomk.a();
      }
      paramqal.c(localomk.ak);
      localomk.a(paramqal);
    }
    if (this.e != null)
    {
      neg localneg = this.e;
      paramqal.c(50);
      if (localneg.ak < 0) {
        localneg.ak = localneg.a();
      }
      paramqal.c(localneg.ak);
      localneg.a(paramqal);
    }
    if (this.f != null)
    {
      nea localnea = this.f;
      paramqal.c(58);
      if (localnea.ak < 0) {
        localnea.ak = localnea.a();
      }
      paramqal.c(localnea.ak);
      localnea.a(paramqal);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(66);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ndy
 * JD-Core Version:    0.7.0.1
 */