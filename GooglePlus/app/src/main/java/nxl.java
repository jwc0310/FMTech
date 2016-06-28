public final class nxl
  extends qan<nxl>
{
  public String a = null;
  public int b = -2147483648;
  public nvm c = null;
  public nvn d = null;
  public nxv e = null;
  public nwt f = null;
  public String g = null;
  public nxk h = null;
  private String i = null;
  
  public nxl()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i15 = qal.d(8);
      int i16 = qal.a(str3);
      j += i15 + (i16 + qal.d(i16));
    }
    int i12;
    int i13;
    if (this.b != -2147483648)
    {
      i12 = this.b;
      i13 = qal.d(16);
      if (i12 < 0) {
        break label408;
      }
    }
    label408:
    for (int i14 = qal.d(i12);; i14 = 10)
    {
      j += i14 + i13;
      if (this.c != null)
      {
        nvm localnvm = this.c;
        int i10 = qal.d(24);
        int i11 = localnvm.a();
        localnvm.ak = i11;
        j += i10 + (i11 + qal.d(i11));
      }
      if (this.d != null)
      {
        nvn localnvn = this.d;
        int i8 = qal.d(32);
        int i9 = localnvn.a();
        localnvn.ak = i9;
        j += i8 + (i9 + qal.d(i9));
      }
      if (this.e != null)
      {
        nxv localnxv = this.e;
        int i6 = qal.d(40);
        int i7 = localnxv.a();
        localnxv.ak = i7;
        j += i6 + (i7 + qal.d(i7));
      }
      if (this.f != null)
      {
        nwt localnwt = this.f;
        int i4 = qal.d(48);
        int i5 = localnwt.a();
        localnwt.ak = i5;
        j += i4 + (i5 + qal.d(i5));
      }
      if (this.g != null)
      {
        String str2 = this.g;
        int i2 = qal.d(56);
        int i3 = qal.a(str2);
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.h != null)
      {
        nxk localnxk = this.h;
        int n = qal.d(64);
        int i1 = localnxk.a();
        localnxk.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.i != null)
      {
        String str1 = this.i;
        int k = qal.d(72);
        int m = qal.a(str1);
        j += k + (m + qal.d(m));
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.b != -2147483648)
    {
      int j = this.b;
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      nvm localnvm = this.c;
      paramqal.c(26);
      if (localnvm.ak < 0) {
        localnvm.ak = localnvm.a();
      }
      paramqal.c(localnvm.ak);
      localnvm.a(paramqal);
    }
    if (this.d != null)
    {
      nvn localnvn = this.d;
      paramqal.c(34);
      if (localnvn.ak < 0) {
        localnvn.ak = localnvn.a();
      }
      paramqal.c(localnvn.ak);
      localnvn.a(paramqal);
    }
    if (this.e != null)
    {
      nxv localnxv = this.e;
      paramqal.c(42);
      if (localnxv.ak < 0) {
        localnxv.ak = localnxv.a();
      }
      paramqal.c(localnxv.ak);
      localnxv.a(paramqal);
    }
    if (this.f != null)
    {
      nwt localnwt = this.f;
      paramqal.c(50);
      if (localnwt.ak < 0) {
        localnwt.ak = localnwt.a();
      }
      paramqal.c(localnwt.ak);
      localnwt.a(paramqal);
    }
    if (this.g != null)
    {
      String str2 = this.g;
      paramqal.c(58);
      paramqal.a(str2);
    }
    if (this.h != null)
    {
      nxk localnxk = this.h;
      paramqal.c(66);
      if (localnxk.ak < 0) {
        localnxk.ak = localnxk.a();
      }
      paramqal.c(localnxk.ak);
      localnxk.a(paramqal);
    }
    if (this.i != null)
    {
      String str1 = this.i;
      paramqal.c(74);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxl
 * JD-Core Version:    0.7.0.1
 */