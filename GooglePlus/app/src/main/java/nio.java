import java.nio.ByteBuffer;

public final class nio
  extends qan<nio>
{
  private static volatile nio[] c;
  public String a = null;
  public String b = null;
  private String d = null;
  private Boolean e = null;
  private Integer f = null;
  
  public nio()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nio[] b()
  {
    if (c == null) {}
    synchronized (qar.a)
    {
      if (c == null) {
        c = new nio[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i4 = qal.d(8);
      int i5 = qal.a(str3);
      i += i4 + (i5 + qal.d(i5));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i2 = qal.d(16);
      int i3 = qal.a(str2);
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i += 1 + qal.d(24);
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int n = qal.d(32);
      int i1 = qal.a(str1);
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.f != null)
    {
      j = this.f.intValue();
      k = qal.d(40);
      if (j < 0) {
        break label193;
      }
    }
    label193:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
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
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
      paramqal.c(24);
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
    if (this.b != null)
    {
      String str1 = this.b;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.f != null)
    {
      int i = this.f.intValue();
      paramqal.c(40);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nio
 * JD-Core Version:    0.7.0.1
 */