public final class ndk
  extends qan<ndk>
{
  private static volatile ndk[] a;
  private miy b = null;
  private String c = null;
  private Integer d = null;
  private String e = null;
  private int f = -2147483648;
  private ome g = null;
  
  public ndk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ndk[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new ndk[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.c != null)
    {
      String str2 = this.c;
      int i9 = qal.d(16);
      int i10 = qal.a(str2);
      j += i9 + (i10 + qal.d(i10));
    }
    int i6;
    int i7;
    if (this.d != null)
    {
      i6 = this.d.intValue();
      i7 = qal.d(24);
      if (i6 < 0) {
        break label268;
      }
    }
    label268:
    for (int i8 = qal.d(i6);; i8 = i)
    {
      j += i8 + i7;
      if (this.b != null)
      {
        miy localmiy = this.b;
        int i4 = qal.d(48);
        int i5 = localmiy.a();
        localmiy.ak = i5;
        j += i4 + (i5 + qal.d(i5));
      }
      if (this.e != null)
      {
        String str1 = this.e;
        int i2 = qal.d(56);
        int i3 = qal.a(str1);
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.f != -2147483648)
      {
        int n = this.f;
        int i1 = qal.d(64);
        if (n >= 0) {
          i = qal.d(n);
        }
        j += i1 + i;
      }
      if (this.g != null)
      {
        ome localome = this.g;
        int k = qal.d(72);
        int m = localome.a();
        localome.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      int j = this.d.intValue();
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.b != null)
    {
      miy localmiy = this.b;
      paramqal.c(50);
      if (localmiy.ak < 0) {
        localmiy.ak = localmiy.a();
      }
      paramqal.c(localmiy.ak);
      localmiy.a(paramqal);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(58);
      paramqal.a(str1);
    }
    if (this.f != -2147483648)
    {
      int i = this.f;
      paramqal.c(64);
      paramqal.a(i);
    }
    if (this.g != null)
    {
      ome localome = this.g;
      paramqal.c(74);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ndk
 * JD-Core Version:    0.7.0.1
 */