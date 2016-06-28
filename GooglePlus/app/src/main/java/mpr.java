import java.nio.ByteBuffer;

public final class mpr
  extends qan<mpr>
{
  private String a = null;
  private String b = null;
  private Integer c = null;
  private String d = null;
  private Boolean e = null;
  private int f = -2147483648;
  
  public mpr()
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
      String str3 = this.a;
      int i7 = qal.d(8);
      int i8 = qal.a(str3);
      j += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i5 = qal.d(16);
      int i6 = qal.a(str2);
      j += i5 + (i6 + qal.d(i6));
    }
    int i2;
    int i3;
    if (this.c != null)
    {
      i2 = this.c.intValue();
      i3 = qal.d(24);
      if (i2 < 0) {
        break label238;
      }
    }
    label238:
    for (int i4 = qal.d(i2);; i4 = i)
    {
      j += i4 + i3;
      if (this.d != null)
      {
        String str1 = this.d;
        int n = qal.d(32);
        int i1 = qal.a(str1);
        j += n + (i1 + qal.d(i1));
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        j += 1 + qal.d(40);
      }
      if (this.f != -2147483648)
      {
        int k = this.f;
        int m = qal.d(48);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
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
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      int k = this.c.intValue();
      paramqal.c(24);
      paramqal.a(k);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
      paramqal.c(40);
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
    if (this.f != -2147483648)
    {
      int i = this.f;
      paramqal.c(48);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpr
 * JD-Core Version:    0.7.0.1
 */