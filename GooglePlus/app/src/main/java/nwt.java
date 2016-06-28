import java.nio.ByteBuffer;

public final class nwt
  extends qan<nwt>
{
  public int a = -2147483648;
  public nwj b = null;
  public oks c = null;
  private Boolean d = null;
  private nvk e = null;
  private int f = -2147483648;
  
  public nwt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i8;
    int i9;
    if (this.a != -2147483648)
    {
      int i7 = this.a;
      i8 = qal.d(8);
      if (i7 >= 0) {
        i9 = qal.d(i7);
      }
    }
    for (int k = j + (i9 + i8);; k = j)
    {
      if (this.d != null)
      {
        this.d.booleanValue();
        k += 1 + qal.d(16);
      }
      if (this.e != null)
      {
        nvk localnvk = this.e;
        int i5 = qal.d(24);
        int i6 = localnvk.a();
        localnvk.ak = i6;
        k += i5 + (i6 + qal.d(i6));
      }
      if (this.f != -2147483648)
      {
        int i3 = this.f;
        int i4 = qal.d(32);
        if (i3 >= 0) {
          i = qal.d(i3);
        }
        k += i + i4;
      }
      if (this.b != null)
      {
        nwj localnwj = this.b;
        int i1 = qal.d(40);
        int i2 = localnwj.a();
        localnwj.ak = i2;
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.c != null)
      {
        oks localoks = this.c;
        int m = qal.d(48);
        int n = localoks.a();
        localoks.ak = n;
        k += m + (n + qal.d(n));
      }
      return k;
      i9 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int k = this.a;
      paramqal.c(8);
      paramqal.a(k);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(16);
      if (bool) {}
      byte b1;
      for (int j = 1;; j = 0)
      {
        b1 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.e != null)
    {
      nvk localnvk = this.e;
      paramqal.c(26);
      if (localnvk.ak < 0) {
        localnvk.ak = localnvk.a();
      }
      paramqal.c(localnvk.ak);
      localnvk.a(paramqal);
    }
    if (this.f != -2147483648)
    {
      int i = this.f;
      paramqal.c(32);
      paramqal.a(i);
    }
    if (this.b != null)
    {
      nwj localnwj = this.b;
      paramqal.c(42);
      if (localnwj.ak < 0) {
        localnwj.ak = localnwj.a();
      }
      paramqal.c(localnwj.ak);
      localnwj.a(paramqal);
    }
    if (this.c != null)
    {
      oks localoks = this.c;
      paramqal.c(50);
      if (localoks.ak < 0) {
        localoks.ak = localoks.a();
      }
      paramqal.c(localoks.ak);
      localoks.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwt
 * JD-Core Version:    0.7.0.1
 */