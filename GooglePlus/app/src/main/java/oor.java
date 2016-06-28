public final class oor
  extends qan<oor>
{
  public String a = null;
  public int b = -2147483648;
  public int c = -2147483648;
  public ont d = null;
  public int e = -2147483648;
  private omx f = null;
  private onx g = null;
  private opb h = null;
  
  public oor()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i14 = qal.d(8);
      int i15 = qal.a(str);
      j += i14 + (i15 + qal.d(i15));
    }
    int i13;
    int i8;
    int i9;
    if (this.b != -2147483648)
    {
      int i11 = this.b;
      int i12 = qal.d(16);
      if (i11 >= 0)
      {
        i13 = qal.d(i11);
        j += i13 + i12;
      }
    }
    else if (this.c != -2147483648)
    {
      i8 = this.c;
      i9 = qal.d(24);
      if (i8 < 0) {
        break label370;
      }
    }
    label370:
    for (int i10 = qal.d(i8);; i10 = i)
    {
      j += i10 + i9;
      if (this.f != null)
      {
        omx localomx = this.f;
        int i6 = qal.d(32);
        int i7 = localomx.a();
        localomx.ak = i7;
        j += i6 + (i7 + qal.d(i7));
      }
      if (this.g != null)
      {
        onx localonx = this.g;
        int i4 = qal.d(40);
        int i5 = localonx.a();
        localonx.ak = i5;
        j += i4 + (i5 + qal.d(i5));
      }
      if (this.h != null)
      {
        opb localopb = this.h;
        int i2 = qal.d(48);
        int i3 = localopb.a();
        localopb.ak = i3;
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.d != null)
      {
        ont localont = this.d;
        int n = qal.d(56);
        int i1 = localont.a();
        localont.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.e != -2147483648)
      {
        int k = this.e;
        int m = qal.d(64);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
      i13 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != -2147483648)
    {
      int k = this.b;
      paramqal.c(16);
      paramqal.a(k);
    }
    if (this.c != -2147483648)
    {
      int j = this.c;
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.f != null)
    {
      omx localomx = this.f;
      paramqal.c(34);
      if (localomx.ak < 0) {
        localomx.ak = localomx.a();
      }
      paramqal.c(localomx.ak);
      localomx.a(paramqal);
    }
    if (this.g != null)
    {
      onx localonx = this.g;
      paramqal.c(42);
      if (localonx.ak < 0) {
        localonx.ak = localonx.a();
      }
      paramqal.c(localonx.ak);
      localonx.a(paramqal);
    }
    if (this.h != null)
    {
      opb localopb = this.h;
      paramqal.c(50);
      if (localopb.ak < 0) {
        localopb.ak = localopb.a();
      }
      paramqal.c(localopb.ak);
      localopb.a(paramqal);
    }
    if (this.d != null)
    {
      ont localont = this.d;
      paramqal.c(58);
      if (localont.ak < 0) {
        localont.ak = localont.a();
      }
      paramqal.c(localont.ak);
      localont.a(paramqal);
    }
    if (this.e != -2147483648)
    {
      int i = this.e;
      paramqal.c(64);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oor
 * JD-Core Version:    0.7.0.1
 */