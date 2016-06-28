import java.nio.ByteBuffer;

public final class nwj
  extends qan<nwj>
{
  public nwh a = null;
  public nvi b = null;
  public int c = -2147483648;
  public qgi d = null;
  private nwv e = null;
  private String f = null;
  private int g = -2147483648;
  private nhs h = null;
  private nwk i = null;
  private Boolean j = null;
  private ope k = null;
  
  public nwj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = 10;
    int n = super.a();
    if (this.a != null)
    {
      nwh localnwh = this.a;
      int i20 = qal.d(8);
      int i21 = localnwh.a();
      localnwh.ak = i21;
      n += i20 + (i21 + qal.d(i21));
    }
    if (this.e != null)
    {
      nwv localnwv = this.e;
      int i18 = qal.d(24);
      int i19 = localnwv.a();
      localnwv.ak = i19;
      n += i18 + (i19 + qal.d(i19));
    }
    if (this.b != null)
    {
      nvi localnvi = this.b;
      int i16 = qal.d(32);
      int i17 = localnvi.a();
      localnvi.ak = i17;
      n += i16 + (i17 + qal.d(i17));
    }
    if (this.f != null)
    {
      String str = this.f;
      int i14 = qal.d(40);
      int i15 = qal.a(str);
      n += i14 + (i15 + qal.d(i15));
    }
    int i11;
    int i12;
    if (this.c != -2147483648)
    {
      i11 = this.c;
      i12 = qal.d(48);
      if (i11 < 0) {
        break label491;
      }
    }
    label491:
    for (int i13 = qal.d(i11);; i13 = m)
    {
      n += i13 + i12;
      if (this.d != null)
      {
        qgi localqgi = this.d;
        int i9 = qal.d(64);
        int i10 = localqgi.a();
        localqgi.ak = i10;
        n += i9 + (i10 + qal.d(i10));
      }
      if (this.g != -2147483648)
      {
        int i7 = this.g;
        int i8 = qal.d(72);
        if (i7 >= 0) {
          m = qal.d(i7);
        }
        n += i8 + m;
      }
      if (this.h != null)
      {
        nhs localnhs = this.h;
        int i5 = qal.d(80);
        int i6 = localnhs.a();
        localnhs.ak = i6;
        n += i5 + (i6 + qal.d(i6));
      }
      if (this.i != null)
      {
        nwk localnwk = this.i;
        int i3 = qal.d(88);
        int i4 = localnwk.a();
        localnwk.ak = i4;
        n += i3 + (i4 + qal.d(i4));
      }
      if (this.j != null)
      {
        this.j.booleanValue();
        n += 1 + qal.d(96);
      }
      if (this.k != null)
      {
        ope localope = this.k;
        int i1 = qal.d(104);
        int i2 = localope.a();
        localope.ak = i2;
        n += i1 + (i2 + qal.d(i2));
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nwh localnwh = this.a;
      paramqal.c(10);
      if (localnwh.ak < 0) {
        localnwh.ak = localnwh.a();
      }
      paramqal.c(localnwh.ak);
      localnwh.a(paramqal);
    }
    if (this.e != null)
    {
      nwv localnwv = this.e;
      paramqal.c(26);
      if (localnwv.ak < 0) {
        localnwv.ak = localnwv.a();
      }
      paramqal.c(localnwv.ak);
      localnwv.a(paramqal);
    }
    if (this.b != null)
    {
      nvi localnvi = this.b;
      paramqal.c(34);
      if (localnvi.ak < 0) {
        localnvi.ak = localnvi.a();
      }
      paramqal.c(localnvi.ak);
      localnvi.a(paramqal);
    }
    if (this.f != null)
    {
      String str = this.f;
      paramqal.c(42);
      paramqal.a(str);
    }
    if (this.c != -2147483648)
    {
      int i1 = this.c;
      paramqal.c(48);
      paramqal.a(i1);
    }
    if (this.d != null)
    {
      qgi localqgi = this.d;
      paramqal.c(66);
      if (localqgi.ak < 0) {
        localqgi.ak = localqgi.a();
      }
      paramqal.c(localqgi.ak);
      localqgi.a(paramqal);
    }
    if (this.g != -2147483648)
    {
      int n = this.g;
      paramqal.c(72);
      paramqal.a(n);
    }
    if (this.h != null)
    {
      nhs localnhs = this.h;
      paramqal.c(82);
      if (localnhs.ak < 0) {
        localnhs.ak = localnhs.a();
      }
      paramqal.c(localnhs.ak);
      localnhs.a(paramqal);
    }
    if (this.i != null)
    {
      nwk localnwk = this.i;
      paramqal.c(90);
      if (localnwk.ak < 0) {
        localnwk.ak = localnwk.a();
      }
      paramqal.c(localnwk.ak);
      localnwk.a(paramqal);
    }
    if (this.j != null)
    {
      boolean bool = this.j.booleanValue();
      paramqal.c(96);
      if (bool) {}
      byte b1;
      for (int m = 1;; m = 0)
      {
        b1 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.k != null)
    {
      ope localope = this.k;
      paramqal.c(106);
      if (localope.ak < 0) {
        localope.ak = localope.a();
      }
      paramqal.c(localope.ak);
      localope.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwj
 * JD-Core Version:    0.7.0.1
 */