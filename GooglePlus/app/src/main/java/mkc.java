import java.nio.ByteBuffer;

public final class mkc
  extends qan<mkc>
{
  public String a = null;
  public int b = -2147483648;
  public Boolean c = null;
  public mkd d = null;
  public String e = null;
  private Boolean f = null;
  
  public mkc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str2 = this.a;
      int i4 = qal.d(8);
      int i5 = qal.a(str2);
      i += i4 + (i5 + qal.d(i5));
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      i += 1 + qal.d(16);
    }
    int i1;
    int i2;
    if (this.b != -2147483648)
    {
      i1 = this.b;
      i2 = qal.d(24);
      if (i1 < 0) {
        break label225;
      }
    }
    label225:
    for (int i3 = qal.d(i1);; i3 = 10)
    {
      i += i3 + i2;
      if (this.c != null)
      {
        this.c.booleanValue();
        i += 1 + qal.d(32);
      }
      if (this.d != null)
      {
        mkd localmkd = this.d;
        int m = qal.d(40);
        int n = localmkd.a();
        localmkd.ak = n;
        i += m + (n + qal.d(n));
      }
      if (this.e != null)
      {
        String str1 = this.e;
        int j = qal.d(48);
        int k = qal.a(str1);
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      String str2 = this.a;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.f != null)
    {
      boolean bool2 = this.f.booleanValue();
      paramqal.c(16);
      if (bool2) {}
      byte b2;
      for (int k = i;; k = 0)
      {
        b2 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.b != -2147483648)
    {
      int j = this.b;
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      boolean bool1 = this.c.booleanValue();
      paramqal.c(32);
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
    if (this.d != null)
    {
      mkd localmkd = this.d;
      paramqal.c(42);
      if (localmkd.ak < 0) {
        localmkd.ak = localmkd.a();
      }
      paramqal.c(localmkd.ak);
      localmkd.a(paramqal);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(50);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mkc
 * JD-Core Version:    0.7.0.1
 */