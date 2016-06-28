import java.nio.ByteBuffer;

public final class npw
  extends qan<npw>
{
  public String a = null;
  public Long b = null;
  public String c = null;
  public Boolean d = null;
  public String e = null;
  private onh f = null;
  private String g = null;
  private String h = null;
  private String i = null;
  
  public npw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    if (this.a != null)
    {
      String str6 = this.a;
      int i10 = qal.d(8);
      int i11 = qal.a(str6);
      j += i10 + (i11 + qal.d(i11));
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      j += qal.d(16) + qal.b(l);
    }
    if (this.c != null)
    {
      String str5 = this.c;
      int i8 = qal.d(24);
      int i9 = qal.a(str5);
      j += i8 + (i9 + qal.d(i9));
    }
    if (this.g != null)
    {
      String str4 = this.g;
      int i6 = qal.d(32);
      int i7 = qal.a(str4);
      j += i6 + (i7 + qal.d(i7));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      j += 1 + qal.d(40);
    }
    if (this.f != null)
    {
      onh localonh = this.f;
      int i4 = qal.d(48);
      int i5 = localonh.a();
      localonh.ak = i5;
      j += i4 + (i5 + qal.d(i5));
    }
    if (this.e != null)
    {
      String str3 = this.e;
      int i2 = qal.d(56);
      int i3 = qal.a(str3);
      j += i2 + (i3 + qal.d(i3));
    }
    if (this.h != null)
    {
      String str2 = this.h;
      int n = qal.d(64);
      int i1 = qal.a(str2);
      j += n + (i1 + qal.d(i1));
    }
    if (this.i != null)
    {
      String str1 = this.i;
      int k = qal.d(72);
      int m = qal.a(str1);
      j += k + (m + qal.d(m));
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str6 = this.a;
      paramqal.c(10);
      paramqal.a(str6);
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    if (this.c != null)
    {
      String str5 = this.c;
      paramqal.c(26);
      paramqal.a(str5);
    }
    if (this.g != null)
    {
      String str4 = this.g;
      paramqal.c(34);
      paramqal.a(str4);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
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
    if (this.f != null)
    {
      onh localonh = this.f;
      paramqal.c(50);
      if (localonh.ak < 0) {
        localonh.ak = localonh.a();
      }
      paramqal.c(localonh.ak);
      localonh.a(paramqal);
    }
    if (this.e != null)
    {
      String str3 = this.e;
      paramqal.c(58);
      paramqal.a(str3);
    }
    if (this.h != null)
    {
      String str2 = this.h;
      paramqal.c(66);
      paramqal.a(str2);
    }
    if (this.i != null)
    {
      String str1 = this.i;
      paramqal.c(74);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npw
 * JD-Core Version:    0.7.0.1
 */