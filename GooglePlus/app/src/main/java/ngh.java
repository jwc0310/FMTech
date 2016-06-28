import java.nio.ByteBuffer;

public final class ngh
  extends qan<ngh>
{
  public qbd a = null;
  private Integer b = null;
  private Integer c = null;
  private Integer d = null;
  private String e = null;
  private Boolean f = null;
  private Boolean g = null;
  private Boolean h = null;
  
  public ngh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i9;
    int i10;
    if (this.b != null)
    {
      int i8 = this.b.intValue();
      i9 = qal.d(8);
      if (i8 >= 0) {
        i10 = qal.d(i8);
      }
    }
    for (int k = j + (i10 + i9);; k = j)
    {
      int i5;
      int i6;
      if (this.c != null)
      {
        i5 = this.c.intValue();
        i6 = qal.d(16);
        if (i5 < 0) {
          break label307;
        }
      }
      label307:
      for (int i7 = qal.d(i5);; i7 = i)
      {
        k += i7 + i6;
        if (this.d != null)
        {
          int i3 = this.d.intValue();
          int i4 = qal.d(24);
          if (i3 >= 0) {
            i = qal.d(i3);
          }
          k += i + i4;
        }
        if (this.e != null)
        {
          String str = this.e;
          int i1 = qal.d(32);
          int i2 = qal.a(str);
          k += i1 + (i2 + qal.d(i2));
        }
        if (this.f != null)
        {
          this.f.booleanValue();
          k += 1 + qal.d(40);
        }
        if (this.g != null)
        {
          this.g.booleanValue();
          k += 1 + qal.d(48);
        }
        if (this.a != null)
        {
          qbd localqbd = this.a;
          int m = qal.d(56);
          int n = localqbd.a();
          localqbd.ak = n;
          k += m + (n + qal.d(n));
        }
        if (this.h != null)
        {
          this.h.booleanValue();
          k += 1 + qal.d(64);
        }
        return k;
        i10 = i;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.b != null)
    {
      int i1 = this.b.intValue();
      paramqal.c(8);
      paramqal.a(i1);
    }
    if (this.c != null)
    {
      int n = this.c.intValue();
      paramqal.c(16);
      paramqal.a(n);
    }
    if (this.d != null)
    {
      int m = this.d.intValue();
      paramqal.c(24);
      paramqal.a(m);
    }
    if (this.e != null)
    {
      String str = this.e;
      paramqal.c(34);
      paramqal.a(str);
    }
    if (this.f != null)
    {
      boolean bool3 = this.f.booleanValue();
      paramqal.c(40);
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
    if (this.g != null)
    {
      boolean bool2 = this.g.booleanValue();
      paramqal.c(48);
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
    if (this.a != null)
    {
      qbd localqbd = this.a;
      paramqal.c(58);
      if (localqbd.ak < 0) {
        localqbd.ak = localqbd.a();
      }
      paramqal.c(localqbd.ak);
      localqbd.a(paramqal);
    }
    if (this.h != null)
    {
      boolean bool1 = this.h.booleanValue();
      paramqal.c(64);
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
 * Qualified Name:     ngh
 * JD-Core Version:    0.7.0.1
 */