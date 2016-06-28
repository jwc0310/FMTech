import java.nio.ByteBuffer;

public final class oky
  extends qan<oky>
{
  private static volatile oky[] d;
  public String a = null;
  public String b = null;
  public String c = null;
  private Boolean e = null;
  private Boolean f = null;
  private String g = null;
  private String h = null;
  private okz i = null;
  private Boolean j = null;
  
  public oky()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oky[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new oky[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int k = super.a();
    String str1 = this.a;
    int m = qal.d(8);
    int n = qal.a(str1);
    int i1 = k + (m + (n + qal.d(n)));
    String str2 = this.b;
    int i2 = qal.d(16);
    int i3 = qal.a(str2);
    int i4 = i1 + (i2 + (i3 + qal.d(i3)));
    this.e.booleanValue();
    int i5 = i4 + (1 + qal.d(24));
    this.f.booleanValue();
    int i6 = i5 + (1 + qal.d(32));
    if (this.c != null)
    {
      String str5 = this.c;
      int i13 = qal.d(40);
      int i14 = qal.a(str5);
      i6 += i13 + (i14 + qal.d(i14));
    }
    if (this.g != null)
    {
      String str4 = this.g;
      int i11 = qal.d(48);
      int i12 = qal.a(str4);
      i6 += i11 + (i12 + qal.d(i12));
    }
    if (this.h != null)
    {
      String str3 = this.h;
      int i9 = qal.d(56);
      int i10 = qal.a(str3);
      i6 += i9 + (i10 + qal.d(i10));
    }
    if (this.i != null)
    {
      okz localokz = this.i;
      int i7 = qal.d(64);
      int i8 = localokz.a();
      localokz.ak = i8;
      i6 += i7 + (i8 + qal.d(i8));
    }
    if (this.j != null)
    {
      this.j.booleanValue();
      i6 += 1 + qal.d(72);
    }
    return i6;
  }
  
  public final void a(qal paramqal)
  {
    int k = 1;
    String str1 = this.a;
    paramqal.c(10);
    paramqal.a(str1);
    String str2 = this.b;
    paramqal.c(18);
    paramqal.a(str2);
    boolean bool1 = this.e.booleanValue();
    paramqal.c(24);
    if (bool1) {}
    byte b1;
    for (int m = k;; m = 0)
    {
      b1 = (byte)m;
      if (paramqal.a.hasRemaining()) {
        break;
      }
      throw new qam(paramqal.a.position(), paramqal.a.limit());
    }
    paramqal.a.put(b1);
    boolean bool2 = this.f.booleanValue();
    paramqal.c(32);
    if (bool2) {}
    byte b2;
    for (int n = k;; n = 0)
    {
      b2 = (byte)n;
      if (paramqal.a.hasRemaining()) {
        break;
      }
      throw new qam(paramqal.a.position(), paramqal.a.limit());
    }
    paramqal.a.put(b2);
    if (this.c != null)
    {
      String str5 = this.c;
      paramqal.c(42);
      paramqal.a(str5);
    }
    if (this.g != null)
    {
      String str4 = this.g;
      paramqal.c(50);
      paramqal.a(str4);
    }
    if (this.h != null)
    {
      String str3 = this.h;
      paramqal.c(58);
      paramqal.a(str3);
    }
    if (this.i != null)
    {
      okz localokz = this.i;
      paramqal.c(66);
      if (localokz.ak < 0) {
        localokz.ak = localokz.a();
      }
      paramqal.c(localokz.ak);
      localokz.a(paramqal);
    }
    if (this.j != null)
    {
      boolean bool3 = this.j.booleanValue();
      paramqal.c(72);
      if (bool3) {}
      byte b3;
      for (;;)
      {
        b3 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        k = 0;
      }
      paramqal.a.put(b3);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oky
 * JD-Core Version:    0.7.0.1
 */