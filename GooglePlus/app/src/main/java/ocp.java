import java.nio.ByteBuffer;

public final class ocp
  extends qan<ocp>
{
  private String a = null;
  private Integer b = null;
  private String c = null;
  private String d = null;
  private Boolean e = null;
  
  public ocp()
  {
    this.aj = null;
    this.ak = -1;
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
    int i1;
    int i2;
    if (this.b != null)
    {
      i1 = this.b.intValue();
      i2 = qal.d(16);
      if (i1 < 0) {
        break label196;
      }
    }
    label196:
    for (int i3 = qal.d(i1);; i3 = 10)
    {
      i += i3 + i2;
      if (this.c != null)
      {
        String str2 = this.c;
        int m = qal.d(24);
        int n = qal.a(str2);
        i += m + (n + qal.d(n));
      }
      if (this.d != null)
      {
        String str1 = this.d;
        int j = qal.d(32);
        int k = qal.a(str1);
        i += j + (k + qal.d(k));
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        i += 1 + qal.d(40);
      }
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
    if (this.b != null)
    {
      int j = this.b.intValue();
      paramqal.c(16);
      paramqal.a(j);
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
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
      paramqal.c(40);
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ocp
 * JD-Core Version:    0.7.0.1
 */