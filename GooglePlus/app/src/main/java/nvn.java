import java.nio.ByteBuffer;

public final class nvn
  extends qan<nvn>
{
  public nwn a = null;
  public nwp b = null;
  public nvr c = null;
  public nxn d = null;
  public nxn e = null;
  public String f = null;
  public nwg g = null;
  public nxg h = null;
  public nxe i = null;
  private Boolean j = null;
  
  public nvn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = super.a();
    if (this.b != null)
    {
      nwp localnwp = this.b;
      int i15 = qal.d(8);
      int i16 = localnwp.a();
      localnwp.ak = i16;
      k += i15 + (i16 + qal.d(i16));
    }
    if (this.c != null)
    {
      nvr localnvr = this.c;
      int i13 = qal.d(16);
      int i14 = localnvr.a();
      localnvr.ak = i14;
      k += i13 + (i14 + qal.d(i14));
    }
    if (this.d != null)
    {
      nxn localnxn2 = this.d;
      int i11 = qal.d(24);
      int i12 = localnxn2.a();
      localnxn2.ak = i12;
      k += i11 + (i12 + qal.d(i12));
    }
    if (this.e != null)
    {
      nxn localnxn1 = this.e;
      int i9 = qal.d(32);
      int i10 = localnxn1.a();
      localnxn1.ak = i10;
      k += i9 + (i10 + qal.d(i10));
    }
    if (this.f != null)
    {
      String str = this.f;
      int i7 = qal.d(40);
      int i8 = qal.a(str);
      k += i7 + (i8 + qal.d(i8));
    }
    if (this.g != null)
    {
      nwg localnwg = this.g;
      int i5 = qal.d(48);
      int i6 = localnwg.a();
      localnwg.ak = i6;
      k += i5 + (i6 + qal.d(i6));
    }
    if (this.h != null)
    {
      nxg localnxg = this.h;
      int i3 = qal.d(56);
      int i4 = localnxg.a();
      localnxg.ak = i4;
      k += i3 + (i4 + qal.d(i4));
    }
    if (this.i != null)
    {
      nxe localnxe = this.i;
      int i1 = qal.d(64);
      int i2 = localnxe.a();
      localnxe.ak = i2;
      k += i1 + (i2 + qal.d(i2));
    }
    if (this.a != null)
    {
      nwn localnwn = this.a;
      int m = qal.d(72);
      int n = localnwn.a();
      localnwn.ak = n;
      k += m + (n + qal.d(n));
    }
    if (this.j != null)
    {
      this.j.booleanValue();
      k += 1 + qal.d(80);
    }
    return k;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      nwp localnwp = this.b;
      paramqal.c(10);
      if (localnwp.ak < 0) {
        localnwp.ak = localnwp.a();
      }
      paramqal.c(localnwp.ak);
      localnwp.a(paramqal);
    }
    if (this.c != null)
    {
      nvr localnvr = this.c;
      paramqal.c(18);
      if (localnvr.ak < 0) {
        localnvr.ak = localnvr.a();
      }
      paramqal.c(localnvr.ak);
      localnvr.a(paramqal);
    }
    if (this.d != null)
    {
      nxn localnxn2 = this.d;
      paramqal.c(26);
      if (localnxn2.ak < 0) {
        localnxn2.ak = localnxn2.a();
      }
      paramqal.c(localnxn2.ak);
      localnxn2.a(paramqal);
    }
    if (this.e != null)
    {
      nxn localnxn1 = this.e;
      paramqal.c(34);
      if (localnxn1.ak < 0) {
        localnxn1.ak = localnxn1.a();
      }
      paramqal.c(localnxn1.ak);
      localnxn1.a(paramqal);
    }
    if (this.f != null)
    {
      String str = this.f;
      paramqal.c(42);
      paramqal.a(str);
    }
    if (this.g != null)
    {
      nwg localnwg = this.g;
      paramqal.c(50);
      if (localnwg.ak < 0) {
        localnwg.ak = localnwg.a();
      }
      paramqal.c(localnwg.ak);
      localnwg.a(paramqal);
    }
    if (this.h != null)
    {
      nxg localnxg = this.h;
      paramqal.c(58);
      if (localnxg.ak < 0) {
        localnxg.ak = localnxg.a();
      }
      paramqal.c(localnxg.ak);
      localnxg.a(paramqal);
    }
    if (this.i != null)
    {
      nxe localnxe = this.i;
      paramqal.c(66);
      if (localnxe.ak < 0) {
        localnxe.ak = localnxe.a();
      }
      paramqal.c(localnxe.ak);
      localnxe.a(paramqal);
    }
    if (this.a != null)
    {
      nwn localnwn = this.a;
      paramqal.c(74);
      if (localnwn.ak < 0) {
        localnwn.ak = localnwn.a();
      }
      paramqal.c(localnwn.ak);
      localnwn.a(paramqal);
    }
    if (this.j != null)
    {
      boolean bool = this.j.booleanValue();
      paramqal.c(80);
      if (bool) {}
      byte b1;
      for (int k = 1;; k = 0)
      {
        b1 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nvn
 * JD-Core Version:    0.7.0.1
 */