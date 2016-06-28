import java.nio.ByteBuffer;

public final class olc
  extends qan<olc>
{
  public String a = null;
  public String b = null;
  private String c = null;
  private Boolean d = null;
  private Boolean e = null;
  
  public olc()
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
      int i1 = qal.d(8);
      int i2 = qal.a(str3);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.a != null)
    {
      String str2 = this.a;
      int m = qal.d(16);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int j = qal.d(24);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(40);
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i += 1 + qal.d(48);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      String str1 = this.b;
      paramqal.c(26);
      paramqal.a(str1);
    }
    if (this.d != null)
    {
      boolean bool2 = this.d.booleanValue();
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
 * Qualified Name:     olc
 * JD-Core Version:    0.7.0.1
 */