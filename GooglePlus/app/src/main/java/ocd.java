import java.nio.ByteBuffer;

public final class ocd
  extends qan<ocd>
{
  private static volatile ocd[] a;
  private int b = -2147483648;
  private int c = -2147483648;
  private String d = null;
  private ocg e = null;
  private ocb f = null;
  private Boolean g = null;
  private Boolean h = null;
  private oca[] i = oca.b();
  private String j = null;
  
  public ocd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ocd[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new ocd[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int k = 10;
    int m = super.a();
    int i16;
    int i17;
    if (this.b != -2147483648)
    {
      int i15 = this.b;
      i16 = qal.d(8);
      if (i15 >= 0) {
        i17 = qal.d(i15);
      }
    }
    for (int n = m + (i17 + i16);; n = m)
    {
      if (this.c != -2147483648)
      {
        int i13 = this.c;
        int i14 = qal.d(16);
        if (i13 >= 0) {
          k = qal.d(i13);
        }
        n += k + i14;
      }
      if (this.d != null)
      {
        String str2 = this.d;
        int i11 = qal.d(24);
        int i12 = qal.a(str2);
        n += i11 + (i12 + qal.d(i12));
      }
      if (this.f != null)
      {
        ocb localocb = this.f;
        int i9 = qal.d(32);
        int i10 = localocb.a();
        localocb.ak = i10;
        n += i9 + (i10 + qal.d(i10));
      }
      if (this.g != null)
      {
        this.g.booleanValue();
        n += 1 + qal.d(40);
      }
      if (this.h != null)
      {
        this.h.booleanValue();
        n += 1 + qal.d(48);
      }
      if ((this.i != null) && (this.i.length > 0))
      {
        int i5 = n;
        int i6 = 0;
        for (;;)
        {
          if (i6 < this.i.length)
          {
            oca localoca = this.i[i6];
            if (localoca != null)
            {
              int i7 = qal.d(56);
              int i8 = localoca.a();
              localoca.ak = i8;
              i5 += i7 + (i8 + qal.d(i8));
            }
            i6++;
            continue;
            i17 = k;
            break;
          }
        }
        n = i5;
      }
      if (this.j != null)
      {
        String str1 = this.j;
        int i3 = qal.d(64);
        int i4 = qal.a(str1);
        n += i3 + (i4 + qal.d(i4));
      }
      if (this.e != null)
      {
        ocg localocg = this.e;
        int i1 = qal.d(72);
        int i2 = localocg.a();
        localocg.ak = i2;
        n += i1 + (i2 + qal.d(i2));
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    int k = 1;
    if (this.b != -2147483648)
    {
      int i3 = this.b;
      paramqal.c(8);
      paramqal.a(i3);
    }
    if (this.c != -2147483648)
    {
      int i2 = this.c;
      paramqal.c(16);
      paramqal.a(i2);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.f != null)
    {
      ocb localocb = this.f;
      paramqal.c(34);
      if (localocb.ak < 0) {
        localocb.ak = localocb.a();
      }
      paramqal.c(localocb.ak);
      localocb.a(paramqal);
    }
    if (this.g != null)
    {
      boolean bool2 = this.g.booleanValue();
      paramqal.c(40);
      if (bool2) {}
      byte b2;
      for (int i1 = k;; i1 = 0)
      {
        b2 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.h != null)
    {
      boolean bool1 = this.h.booleanValue();
      paramqal.c(48);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        k = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.i != null)
    {
      int m = this.i.length;
      int n = 0;
      if (m > 0) {
        while (n < this.i.length)
        {
          oca localoca = this.i[n];
          if (localoca != null)
          {
            paramqal.c(58);
            if (localoca.ak < 0) {
              localoca.ak = localoca.a();
            }
            paramqal.c(localoca.ak);
            localoca.a(paramqal);
          }
          n++;
        }
      }
    }
    if (this.j != null)
    {
      String str1 = this.j;
      paramqal.c(66);
      paramqal.a(str1);
    }
    if (this.e != null)
    {
      ocg localocg = this.e;
      paramqal.c(74);
      if (localocg.ak < 0) {
        localocg.ak = localocg.a();
      }
      paramqal.c(localocg.ak);
      localocg.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ocd
 * JD-Core Version:    0.7.0.1
 */