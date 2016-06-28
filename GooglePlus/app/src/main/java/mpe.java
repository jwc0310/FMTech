import java.nio.ByteBuffer;

public final class mpe
  extends qan<mpe>
{
  private static volatile mpe[] a;
  private int b = -2147483648;
  private String c = null;
  private Boolean d = null;
  private Long e = null;
  private String f = null;
  
  public mpe()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mpe[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mpe[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int i3;
    int i4;
    if (this.b != -2147483648)
    {
      int i2 = this.b;
      i3 = qal.d(8);
      if (i2 >= 0) {
        i4 = qal.d(i2);
      }
    }
    for (int j = i + (i4 + i3);; j = i)
    {
      if (this.c != null)
      {
        String str2 = this.c;
        int n = qal.d(16);
        int i1 = qal.a(str2);
        j += n + (i1 + qal.d(i1));
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        j += 1 + qal.d(24);
      }
      if (this.e != null)
      {
        long l = this.e.longValue();
        j += qal.d(32) + qal.b(l);
      }
      if (this.f != null)
      {
        String str1 = this.f;
        int k = qal.d(40);
        int m = qal.a(str1);
        j += k + (m + qal.d(m));
      }
      return j;
      i4 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int j = this.b;
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(24);
      if (bool) {}
      byte b1;
      for (int i = 1;; i = 0)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.e != null)
    {
      long l = this.e.longValue();
      paramqal.c(32);
      paramqal.a(l);
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mpe
 * JD-Core Version:    0.7.0.1
 */