import java.nio.ByteBuffer;

public final class nwn
  extends qan<nwn>
{
  public String a = null;
  public String b = null;
  public String c = null;
  public Boolean d = null;
  private nwm e = null;
  private Long f = null;
  
  public nwn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.e != null)
    {
      nwm localnwm = this.e;
      int i3 = qal.d(8);
      int i4 = localnwm.a();
      localnwm.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.a != null)
    {
      String str3 = this.a;
      int i1 = qal.d(16);
      int i2 = qal.a(str3);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int m = qal.d(24);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int j = qal.d(32);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(40);
    }
    if (this.f != null)
    {
      long l = this.f.longValue();
      i += qal.d(48) + qal.b(l);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.e != null)
    {
      nwm localnwm = this.e;
      paramqal.c(10);
      if (localnwm.ak < 0) {
        localnwm.ak = localnwm.a();
      }
      paramqal.c(localnwm.ak);
      localnwm.a(paramqal);
    }
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
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
    if (this.f != null)
    {
      long l = this.f.longValue();
      paramqal.c(48);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwn
 * JD-Core Version:    0.7.0.1
 */