import java.nio.ByteBuffer;

public final class ojb
  extends qan<ojb>
{
  public Integer a = null;
  public Integer b = null;
  public Integer c = null;
  public Boolean d = null;
  public Boolean e = null;
  private Boolean f = null;
  
  public ojb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i5;
    int i6;
    if (this.a != null)
    {
      int i4 = this.a.intValue();
      i5 = qal.d(8);
      if (i4 >= 0) {
        i6 = qal.d(i4);
      }
    }
    for (int k = j + (i6 + i5);; k = j)
    {
      int i1;
      int i2;
      if (this.b != null)
      {
        i1 = this.b.intValue();
        i2 = qal.d(16);
        if (i1 < 0) {
          break label218;
        }
      }
      label218:
      for (int i3 = qal.d(i1);; i3 = i)
      {
        k += i3 + i2;
        if (this.c != null)
        {
          int m = this.c.intValue();
          int n = qal.d(24);
          if (m >= 0) {
            i = qal.d(m);
          }
          k += i + n;
        }
        if (this.d != null)
        {
          this.d.booleanValue();
          k += 1 + qal.d(32);
        }
        if (this.e != null)
        {
          this.e.booleanValue();
          k += 1 + qal.d(40);
        }
        if (this.f != null)
        {
          this.f.booleanValue();
          k += 1 + qal.d(48);
        }
        return k;
        i6 = i;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      int i1 = this.a.intValue();
      paramqal.c(8);
      paramqal.a(i1);
    }
    if (this.b != null)
    {
      int n = this.b.intValue();
      paramqal.c(16);
      paramqal.a(n);
    }
    if (this.c != null)
    {
      int m = this.c.intValue();
      paramqal.c(24);
      paramqal.a(m);
    }
    if (this.d != null)
    {
      boolean bool3 = this.d.booleanValue();
      paramqal.c(32);
      if (bool3) {}
      byte b3;
      for (int k = i;; k = 0)
      {
        b3 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.e != null)
    {
      boolean bool2 = this.e.booleanValue();
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
    if (this.f != null)
    {
      boolean bool1 = this.f.booleanValue();
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
 * Qualified Name:     ojb
 * JD-Core Version:    0.7.0.1
 */