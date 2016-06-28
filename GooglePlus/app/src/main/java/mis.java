import java.nio.ByteBuffer;

public final class mis
  extends qan<mis>
{
  private mix a = null;
  private qbe b = null;
  private miu c = null;
  private Long d = null;
  private String e = null;
  private mit f = null;
  private String g = null;
  private Boolean h = null;
  private int i = -2147483648;
  private miw j = null;
  
  public mis()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = super.a();
    if (this.a != null)
    {
      mix localmix = this.a;
      int i14 = qal.d(8);
      int i15 = localmix.a();
      localmix.ak = i15;
      k += i14 + (i15 + qal.d(i15));
    }
    if (this.b != null)
    {
      qbe localqbe = this.b;
      int i12 = qal.d(16);
      int i13 = localqbe.a();
      localqbe.ak = i13;
      k += i12 + (i13 + qal.d(i13));
    }
    if (this.c != null)
    {
      miu localmiu = this.c;
      int i10 = qal.d(24);
      int i11 = localmiu.a();
      localmiu.ak = i11;
      k += i10 + (i11 + qal.d(i11));
    }
    if (this.d != null)
    {
      long l = this.d.longValue();
      k += qal.d(32) + qal.b(l);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      int i8 = qal.d(40);
      int i9 = qal.a(str2);
      k += i8 + (i9 + qal.d(i9));
    }
    if (this.f != null)
    {
      mit localmit = this.f;
      int i6 = qal.d(48);
      int i7 = localmit.a();
      localmit.ak = i7;
      k += i6 + (i7 + qal.d(i7));
    }
    if (this.g != null)
    {
      String str1 = this.g;
      int i4 = qal.d(56);
      int i5 = qal.a(str1);
      k += i4 + (i5 + qal.d(i5));
    }
    if (this.h != null)
    {
      this.h.booleanValue();
      k += 1 + qal.d(64);
    }
    int i1;
    int i2;
    if (this.i != -2147483648)
    {
      i1 = this.i;
      i2 = qal.d(72);
      if (i1 < 0) {
        break label421;
      }
    }
    label421:
    for (int i3 = qal.d(i1);; i3 = 10)
    {
      k += i3 + i2;
      if (this.j != null)
      {
        miw localmiw = this.j;
        int m = qal.d(80);
        int n = localmiw.a();
        localmiw.ak = n;
        k += m + (n + qal.d(n));
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mix localmix = this.a;
      paramqal.c(10);
      if (localmix.ak < 0) {
        localmix.ak = localmix.a();
      }
      paramqal.c(localmix.ak);
      localmix.a(paramqal);
    }
    if (this.b != null)
    {
      qbe localqbe = this.b;
      paramqal.c(18);
      if (localqbe.ak < 0) {
        localqbe.ak = localqbe.a();
      }
      paramqal.c(localqbe.ak);
      localqbe.a(paramqal);
    }
    if (this.c != null)
    {
      miu localmiu = this.c;
      paramqal.c(26);
      if (localmiu.ak < 0) {
        localmiu.ak = localmiu.a();
      }
      paramqal.c(localmiu.ak);
      localmiu.a(paramqal);
    }
    if (this.d != null)
    {
      long l = this.d.longValue();
      paramqal.c(32);
      paramqal.a(l);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.f != null)
    {
      mit localmit = this.f;
      paramqal.c(50);
      if (localmit.ak < 0) {
        localmit.ak = localmit.a();
      }
      paramqal.c(localmit.ak);
      localmit.a(paramqal);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(58);
      paramqal.a(str1);
    }
    if (this.h != null)
    {
      boolean bool = this.h.booleanValue();
      paramqal.c(64);
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
    if (this.i != -2147483648)
    {
      int k = this.i;
      paramqal.c(72);
      paramqal.a(k);
    }
    if (this.j != null)
    {
      miw localmiw = this.j;
      paramqal.c(82);
      if (localmiw.ak < 0) {
        localmiw.ak = localmiw.a();
      }
      paramqal.c(localmiw.ak);
      localmiw.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mis
 * JD-Core Version:    0.7.0.1
 */