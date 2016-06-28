import java.nio.ByteBuffer;

public final class oew
  extends qan<oew>
{
  public String a = null;
  public odm[] b = odm.b();
  private Boolean c = null;
  private Boolean d = null;
  private String e = null;
  
  public oew()
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
      int i3 = qal.d(8);
      int i4 = qal.a(str2);
      i += i3 + (i4 + qal.d(i4));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int m = i;
      for (int n = 0; n < this.b.length; n++)
      {
        odm localodm = this.b[n];
        if (localodm != null)
        {
          int i1 = qal.d(16);
          int i2 = localodm.a();
          localodm.ak = i2;
          m += i1 + (i2 + qal.d(i2));
        }
      }
      i = m;
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(32);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      int j = qal.d(40);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
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
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        odm localodm = this.b[k];
        if (localodm != null)
        {
          paramqal.c(18);
          if (localodm.ak < 0) {
            localodm.ak = localodm.a();
          }
          paramqal.c(localodm.ak);
          localodm.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      boolean bool2 = this.c.booleanValue();
      paramqal.c(24);
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
    if (this.d != null)
    {
      boolean bool1 = this.d.booleanValue();
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
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oew
 * JD-Core Version:    0.7.0.1
 */