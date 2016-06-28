import java.nio.ByteBuffer;

public final class nko
  extends qan<nko>
{
  private static volatile nko[] a;
  private int b = -2147483648;
  private Boolean c = null;
  private Boolean d = null;
  private Boolean e = null;
  private Integer f = null;
  private nka[] g = nka.b();
  private String h = null;
  private Integer i = null;
  
  public nko()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nko[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new nko[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int j = 10;
    int k = super.a();
    int i12;
    int i13;
    if (this.b != -2147483648)
    {
      int i11 = this.b;
      i12 = qal.d(8);
      if (i11 >= 0) {
        i13 = qal.d(i11);
      }
    }
    for (int m = k + (i13 + i12);; m = k)
    {
      if (this.c != null)
      {
        this.c.booleanValue();
        m += 1 + qal.d(16);
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        m += 1 + qal.d(24);
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        m += 1 + qal.d(32);
      }
      int i8;
      int i9;
      if (this.f != null)
      {
        i8 = this.f.intValue();
        i9 = qal.d(40);
        if (i8 < 0) {
          break label262;
        }
      }
      int i4;
      label262:
      for (int i10 = qal.d(i8);; i10 = j)
      {
        m += i10 + i9;
        if ((this.g == null) || (this.g.length <= 0)) {
          break label271;
        }
        i4 = m;
        for (int i5 = 0; i5 < this.g.length; i5++)
        {
          nka localnka = this.g[i5];
          if (localnka != null)
          {
            int i6 = qal.d(48);
            int i7 = localnka.a();
            localnka.ak = i7;
            i4 += i6 + (i7 + qal.d(i7));
          }
        }
        i13 = j;
        break;
      }
      m = i4;
      label271:
      if (this.h != null)
      {
        String str = this.h;
        int i2 = qal.d(56);
        int i3 = qal.a(str);
        m += i2 + (i3 + qal.d(i3));
      }
      if (this.i != null)
      {
        int n = this.i.intValue();
        int i1 = qal.d(64);
        if (n >= 0) {
          j = qal.d(n);
        }
        m += j + i1;
      }
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    int j = 1;
    if (this.b != -2147483648)
    {
      int i4 = this.b;
      paramqal.c(8);
      paramqal.a(i4);
    }
    if (this.c != null)
    {
      boolean bool3 = this.c.booleanValue();
      paramqal.c(16);
      if (bool3) {}
      byte b3;
      for (int i3 = j;; i3 = 0)
      {
        b3 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.d != null)
    {
      boolean bool2 = this.d.booleanValue();
      paramqal.c(24);
      if (bool2) {}
      byte b2;
      for (int i2 = j;; i2 = 0)
      {
        b2 = (byte)i2;
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
      paramqal.c(32);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        j = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.f != null)
    {
      int i1 = this.f.intValue();
      paramqal.c(40);
      paramqal.a(i1);
    }
    if (this.g != null)
    {
      int m = this.g.length;
      int n = 0;
      if (m > 0) {
        while (n < this.g.length)
        {
          nka localnka = this.g[n];
          if (localnka != null)
          {
            paramqal.c(50);
            if (localnka.ak < 0) {
              localnka.ak = localnka.a();
            }
            paramqal.c(localnka.ak);
            localnka.a(paramqal);
          }
          n++;
        }
      }
    }
    if (this.h != null)
    {
      String str = this.h;
      paramqal.c(58);
      paramqal.a(str);
    }
    if (this.i != null)
    {
      int k = this.i.intValue();
      paramqal.c(64);
      paramqal.a(k);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nko
 * JD-Core Version:    0.7.0.1
 */