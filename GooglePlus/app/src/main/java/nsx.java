import java.nio.ByteBuffer;

public final class nsx
  extends qan<nsx>
{
  public String a = null;
  public String b = null;
  public Boolean c = null;
  public nxh d = null;
  public Integer e = null;
  private Integer f = null;
  
  public nsx()
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
      String str2 = this.a;
      int i7 = qal.d(8);
      int i8 = qal.a(str2);
      j += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      String str1 = this.b;
      int i5 = qal.d(16);
      int i6 = qal.a(str1);
      j += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      j += 1 + qal.d(24);
    }
    int i2;
    int i3;
    if (this.f != null)
    {
      i2 = this.f.intValue();
      i3 = qal.d(32);
      if (i2 < 0) {
        break label246;
      }
    }
    label246:
    for (int i4 = qal.d(i2);; i4 = i)
    {
      j += i4 + i3;
      if (this.d != null)
      {
        nxh localnxh = this.d;
        int n = qal.d(40);
        int i1 = localnxh.a();
        localnxh.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.e != null)
      {
        int k = this.e.intValue();
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
      String str2 = this.a;
      paramqal.c(10);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      String str1 = this.b;
      paramqal.c(18);
      paramqal.a(str1);
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
      paramqal.c(24);
      if (bool) {}
      byte b1;
      for (int k = 1;; k = 0)
      {
        b1 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.f != null)
    {
      int j = this.f.intValue();
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.d != null)
    {
      nxh localnxh = this.d;
      paramqal.c(42);
      if (localnxh.ak < 0) {
        localnxh.ak = localnxh.a();
      }
      paramqal.c(localnxh.ak);
      localnxh.a(paramqal);
    }
    if (this.e != null)
    {
      int i = this.e.intValue();
      paramqal.c(48);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsx
 * JD-Core Version:    0.7.0.1
 */