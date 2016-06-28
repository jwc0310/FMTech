import java.nio.ByteBuffer;

public final class nkc
  extends qan<nkc>
{
  private Boolean a = null;
  private Boolean b = null;
  private Integer c = null;
  private Integer d = null;
  private Integer e = null;
  private Integer f = null;
  
  public nkc()
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
      this.a.booleanValue();
      j += 1 + qal.d(8);
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      j += 1 + qal.d(16);
    }
    int i8;
    int i5;
    label136:
    int n;
    int i1;
    if (this.c != null)
    {
      int i6 = this.c.intValue();
      int i7 = qal.d(24);
      if (i6 >= 0)
      {
        i8 = qal.d(i6);
        j += i8 + i7;
      }
    }
    else
    {
      if (this.d != null)
      {
        int i3 = this.d.intValue();
        int i4 = qal.d(32);
        if (i3 < 0) {
          break label233;
        }
        i5 = qal.d(i3);
        j += i5 + i4;
      }
      if (this.e != null)
      {
        n = this.e.intValue();
        i1 = qal.d(40);
        if (n < 0) {
          break label239;
        }
      }
    }
    label233:
    label239:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.f != null)
      {
        int k = this.f.intValue();
        int m = qal.d(48);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
      i8 = i;
      break;
      i5 = i;
      break label136;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      boolean bool2 = this.a.booleanValue();
      paramqal.c(8);
      if (bool2) {}
      byte b2;
      for (int i1 = i;; i1 = 0)
      {
        b2 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.b != null)
    {
      boolean bool1 = this.b.booleanValue();
      paramqal.c(16);
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
    if (this.c != null)
    {
      int n = this.c.intValue();
      paramqal.c(24);
      paramqal.a(n);
    }
    if (this.d != null)
    {
      int m = this.d.intValue();
      paramqal.c(32);
      paramqal.a(m);
    }
    if (this.e != null)
    {
      int k = this.e.intValue();
      paramqal.c(40);
      paramqal.a(k);
    }
    if (this.f != null)
    {
      int j = this.f.intValue();
      paramqal.c(48);
      paramqal.a(j);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nkc
 * JD-Core Version:    0.7.0.1
 */