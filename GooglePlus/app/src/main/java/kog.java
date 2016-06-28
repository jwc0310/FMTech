import java.nio.ByteBuffer;

public final class kog
  extends qan<kog>
{
  public String a = null;
  public String b = null;
  public kob c = null;
  public kob d = null;
  public koh e = null;
  public koi[] f = koi.b();
  public String g = null;
  public String h = null;
  public Boolean i = null;
  public Boolean j = null;
  public Boolean k = null;
  public String l = null;
  public byte[] m = null;
  public kom n = null;
  
  public kog()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.a != null)
    {
      String str5 = this.a;
      int i22 = qal.d(8);
      int i23 = qal.a(str5);
      i1 += i22 + (i23 + qal.d(i23));
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i20 = qal.d(16);
      int i21 = qal.a(str4);
      i1 += i20 + (i21 + qal.d(i21));
    }
    if (this.c != null)
    {
      kob localkob2 = this.c;
      int i18 = qal.d(24);
      int i19 = localkob2.a();
      localkob2.ak = i19;
      i1 += i18 + (i19 + qal.d(i19));
    }
    if (this.d != null)
    {
      kob localkob1 = this.d;
      int i16 = qal.d(32);
      int i17 = localkob1.a();
      localkob1.ak = i17;
      i1 += i16 + (i17 + qal.d(i17));
    }
    if (this.e != null)
    {
      koh localkoh = this.e;
      int i14 = qal.d(40);
      int i15 = localkoh.a();
      localkoh.ak = i15;
      i1 += i14 + (i15 + qal.d(i15));
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int i10 = i1;
      for (int i11 = 0; i11 < this.f.length; i11++)
      {
        koi localkoi = this.f[i11];
        if (localkoi != null)
        {
          int i12 = qal.d(48);
          int i13 = localkoi.a();
          localkoi.ak = i13;
          i10 += i12 + (i13 + qal.d(i13));
        }
      }
      i1 = i10;
    }
    if (this.g != null)
    {
      String str3 = this.g;
      int i8 = qal.d(56);
      int i9 = qal.a(str3);
      i1 += i8 + (i9 + qal.d(i9));
    }
    if (this.h != null)
    {
      String str2 = this.h;
      int i6 = qal.d(64);
      int i7 = qal.a(str2);
      i1 += i6 + (i7 + qal.d(i7));
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      i1 += 1 + qal.d(72);
    }
    if (this.j != null)
    {
      this.j.booleanValue();
      i1 += 1 + qal.d(80);
    }
    if (this.k != null)
    {
      this.k.booleanValue();
      i1 += 1 + qal.d(88);
    }
    if (this.l != null)
    {
      String str1 = this.l;
      int i4 = qal.d(96);
      int i5 = qal.a(str1);
      i1 += i4 + (i5 + qal.d(i5));
    }
    if (this.m != null)
    {
      byte[] arrayOfByte = this.m;
      i1 += qal.d(104) + (qal.d(arrayOfByte.length) + arrayOfByte.length);
    }
    if (this.n != null)
    {
      kom localkom = this.n;
      int i2 = qal.d(112);
      int i3 = localkom.a();
      localkom.ak = i3;
      i1 += i2 + (i3 + qal.d(i3));
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.a != null)
    {
      String str5 = this.a;
      paramqal.c(10);
      paramqal.a(str5);
    }
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if (this.c != null)
    {
      kob localkob2 = this.c;
      paramqal.c(26);
      if (localkob2.ak < 0) {
        localkob2.ak = localkob2.a();
      }
      paramqal.c(localkob2.ak);
      localkob2.a(paramqal);
    }
    if (this.d != null)
    {
      kob localkob1 = this.d;
      paramqal.c(34);
      if (localkob1.ak < 0) {
        localkob1.ak = localkob1.a();
      }
      paramqal.c(localkob1.ak);
      localkob1.a(paramqal);
    }
    if (this.e != null)
    {
      koh localkoh = this.e;
      paramqal.c(42);
      if (localkoh.ak < 0) {
        localkoh.ak = localkoh.a();
      }
      paramqal.c(localkoh.ak);
      localkoh.a(paramqal);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int i5 = 0; i5 < this.f.length; i5++)
      {
        koi localkoi = this.f[i5];
        if (localkoi != null)
        {
          paramqal.c(50);
          if (localkoi.ak < 0) {
            localkoi.ak = localkoi.a();
          }
          paramqal.c(localkoi.ak);
          localkoi.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      String str3 = this.g;
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
      boolean bool3 = this.i.booleanValue();
      paramqal.c(72);
      if (bool3) {}
      byte b3;
      for (int i4 = i1;; i4 = 0)
      {
        b3 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.j != null)
    {
      boolean bool2 = this.j.booleanValue();
      paramqal.c(80);
      if (bool2) {}
      byte b2;
      for (int i3 = i1;; i3 = 0)
      {
        b2 = (byte)i3;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.k != null)
    {
      boolean bool1 = this.k.booleanValue();
      paramqal.c(88);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i1;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i1 = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.l != null)
    {
      String str1 = this.l;
      paramqal.c(98);
      paramqal.a(str1);
    }
    if (this.m != null)
    {
      byte[] arrayOfByte = this.m;
      paramqal.c(106);
      paramqal.c(arrayOfByte.length);
      int i2 = arrayOfByte.length;
      if (paramqal.a.remaining() >= i2) {
        paramqal.a.put(arrayOfByte, 0, i2);
      }
    }
    else
    {
      if (this.n != null)
      {
        kom localkom = this.n;
        paramqal.c(114);
        if (localkom.ak < 0) {
          localkom.ak = localkom.a();
        }
        paramqal.c(localkom.ak);
        localkom.a(paramqal);
      }
      super.a(paramqal);
      return;
    }
    throw new qam(paramqal.a.position(), paramqal.a.limit());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kog
 * JD-Core Version:    0.7.0.1
 */