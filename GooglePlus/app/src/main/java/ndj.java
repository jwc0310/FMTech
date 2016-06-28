import java.nio.ByteBuffer;

public final class ndj
  extends qan<ndj>
{
  public miv a = null;
  public ome b = null;
  private String c = null;
  private String d = null;
  private String e = null;
  private Boolean f = null;
  private Boolean g = null;
  
  public ndj()
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
      int i5 = qal.d(16);
      int i6 = qal.a(str3);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i3 = qal.d(24);
      int i4 = qal.a(str2);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.e != null)
    {
      String str1 = this.e;
      int i1 = qal.d(32);
      int i2 = qal.a(str1);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.a != null)
    {
      miv localmiv = this.a;
      int m = qal.d(40);
      int n = localmiv.a();
      localmiv.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      i += 1 + qal.d(48);
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      i += 1 + qal.d(56);
    }
    if (this.b != null)
    {
      ome localome = this.b;
      int j = qal.d(64);
      int k = localome.a();
      localome.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.a != null)
    {
      miv localmiv = this.a;
      paramqal.c(42);
      if (localmiv.ak < 0) {
        localmiv.ak = localmiv.a();
      }
      paramqal.c(localmiv.ak);
      localmiv.a(paramqal);
    }
    if (this.f != null)
    {
      boolean bool2 = this.f.booleanValue();
      paramqal.c(48);
      if (bool2) {}
      byte b2;
      for (int j = i;; j = 0)
      {
        b2 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.g != null)
    {
      boolean bool1 = this.g.booleanValue();
      paramqal.c(56);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.b != null)
    {
      ome localome = this.b;
      paramqal.c(66);
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
 * Qualified Name:     ndj
 * JD-Core Version:    0.7.0.1
 */