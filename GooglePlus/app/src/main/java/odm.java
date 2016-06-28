import java.nio.ByteBuffer;

public final class odm
  extends qan<odm>
{
  private static volatile odm[] f;
  public int a = -2147483648;
  public Integer b = null;
  public String c = null;
  public String d = null;
  public Boolean e = null;
  private Boolean g = null;
  
  public odm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static odm[] b()
  {
    if (f == null) {}
    synchronized (qar.a)
    {
      if (f == null) {
        f = new odm[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i6;
    int i7;
    if (this.a != -2147483648)
    {
      int i5 = this.a;
      i6 = qal.d(8);
      if (i5 >= 0) {
        i7 = qal.d(i5);
      }
    }
    for (int k = j + (i7 + i6);; k = j)
    {
      if (this.b != null)
      {
        int i3 = this.b.intValue();
        int i4 = qal.d(16);
        if (i3 >= 0) {
          i = qal.d(i3);
        }
        k += i + i4;
      }
      if (this.c != null)
      {
        String str2 = this.c;
        int i1 = qal.d(24);
        int i2 = qal.a(str2);
        k += i1 + (i2 + qal.d(i2));
      }
      if (this.d != null)
      {
        String str1 = this.d;
        int m = qal.d(32);
        int n = qal.a(str1);
        k += m + (n + qal.d(n));
      }
      if (this.g != null)
      {
        this.g.booleanValue();
        k += 1 + qal.d(40);
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        k += 1 + qal.d(48);
      }
      return k;
      i7 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != -2147483648)
    {
      int m = this.a;
      paramqal.c(8);
      paramqal.a(m);
    }
    if (this.b != null)
    {
      int k = this.b.intValue();
      paramqal.c(16);
      paramqal.a(k);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.g != null)
    {
      boolean bool2 = this.g.booleanValue();
      paramqal.c(40);
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
    if (this.e != null)
    {
      boolean bool1 = this.e.booleanValue();
      paramqal.c(48);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     odm
 * JD-Core Version:    0.7.0.1
 */