import java.nio.ByteBuffer;

public final class mos
  extends qan<mos>
{
  public Boolean a = null;
  private Boolean b = null;
  private int c = -2147483648;
  private Long d = null;
  private String e = null;
  private Boolean f = null;
  private Boolean g = null;
  private mng[] h = mng.b();
  private int i = -2147483648;
  private mmz[] j = mmz.b();
  private Long k = null;
  private mnn l = null;
  private Boolean m = null;
  
  public mos()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int n = 10;
    int i1 = super.a();
    if (this.b != null)
    {
      this.b.booleanValue();
      i1 += 1 + qal.d(8);
    }
    int i16;
    int i17;
    if (this.c != -2147483648)
    {
      i16 = this.c;
      i17 = qal.d(16);
      if (i16 < 0) {
        break label379;
      }
    }
    int i8;
    label379:
    for (int i18 = qal.d(i16);; i18 = n)
    {
      i1 += i18 + i17;
      if (this.f != null)
      {
        this.f.booleanValue();
        i1 += 1 + qal.d(24);
      }
      if (this.g != null)
      {
        this.g.booleanValue();
        i1 += 1 + qal.d(32);
      }
      if (this.k != null)
      {
        long l2 = this.k.longValue();
        i1 += qal.d(40) + qal.b(l2);
      }
      if (this.i != -2147483648)
      {
        int i14 = this.i;
        int i15 = qal.d(48);
        if (i14 >= 0) {
          n = qal.d(i14);
        }
        i1 += i15 + n;
      }
      if (this.a != null)
      {
        this.a.booleanValue();
        i1 += 1 + qal.d(56);
      }
      if (this.d != null)
      {
        long l1 = this.d.longValue();
        i1 += qal.d(64) + qal.b(l1);
      }
      if (this.e != null)
      {
        String str = this.e;
        int i12 = qal.d(72);
        int i13 = qal.a(str);
        i1 += i12 + (i13 + qal.d(i13));
      }
      if ((this.j == null) || (this.j.length <= 0)) {
        break label388;
      }
      i8 = i1;
      for (int i9 = 0; i9 < this.j.length; i9++)
      {
        mmz localmmz = this.j[i9];
        if (localmmz != null)
        {
          int i10 = qal.d(80);
          int i11 = localmmz.a();
          localmmz.ak = i11;
          i8 += i10 + (i11 + qal.d(i11));
        }
      }
    }
    i1 = i8;
    label388:
    if (this.l != null)
    {
      mnn localmnn = this.l;
      int i6 = qal.d(88);
      int i7 = localmnn.a();
      localmnn.ak = i7;
      i1 += i6 + (i7 + qal.d(i7));
    }
    if (this.m != null)
    {
      this.m.booleanValue();
      i1 += 1 + qal.d(96);
    }
    if (this.h != null)
    {
      int i2 = this.h.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.h.length)
        {
          mng localmng = this.h[i3];
          if (localmng != null)
          {
            int i4 = qal.d(104);
            int i5 = localmng.a();
            localmng.ak = i5;
            i1 += i4 + (i5 + qal.d(i5));
          }
          i3++;
        }
      }
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    int n = 1;
    if (this.b != null)
    {
      boolean bool5 = this.b.booleanValue();
      paramqal.c(8);
      if (bool5) {}
      byte b5;
      for (int i9 = n;; i9 = 0)
      {
        b5 = (byte)i9;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if (this.c != -2147483648)
    {
      int i8 = this.c;
      paramqal.c(16);
      paramqal.a(i8);
    }
    if (this.f != null)
    {
      boolean bool4 = this.f.booleanValue();
      paramqal.c(24);
      if (bool4) {}
      byte b4;
      for (int i7 = n;; i7 = 0)
      {
        b4 = (byte)i7;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.g != null)
    {
      boolean bool3 = this.g.booleanValue();
      paramqal.c(32);
      if (bool3) {}
      byte b3;
      for (int i6 = n;; i6 = 0)
      {
        b3 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.k != null)
    {
      long l2 = this.k.longValue();
      paramqal.c(40);
      paramqal.a(l2);
    }
    if (this.i != -2147483648)
    {
      int i5 = this.i;
      paramqal.c(48);
      paramqal.a(i5);
    }
    if (this.a != null)
    {
      boolean bool2 = this.a.booleanValue();
      paramqal.c(56);
      if (bool2) {}
      byte b2;
      for (int i4 = n;; i4 = 0)
      {
        b2 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.d != null)
    {
      long l1 = this.d.longValue();
      paramqal.c(64);
      paramqal.a(l1);
    }
    if (this.e != null)
    {
      String str = this.e;
      paramqal.c(74);
      paramqal.a(str);
    }
    if ((this.j != null) && (this.j.length > 0)) {
      for (int i3 = 0; i3 < this.j.length; i3++)
      {
        mmz localmmz = this.j[i3];
        if (localmmz != null)
        {
          paramqal.c(82);
          if (localmmz.ak < 0) {
            localmmz.ak = localmmz.a();
          }
          paramqal.c(localmmz.ak);
          localmmz.a(paramqal);
        }
      }
    }
    if (this.l != null)
    {
      mnn localmnn = this.l;
      paramqal.c(90);
      if (localmnn.ak < 0) {
        localmnn.ak = localmnn.a();
      }
      paramqal.c(localmnn.ak);
      localmnn.a(paramqal);
    }
    if (this.m != null)
    {
      boolean bool1 = this.m.booleanValue();
      paramqal.c(96);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        n = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.h != null)
    {
      int i1 = this.h.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.h.length)
        {
          mng localmng = this.h[i2];
          if (localmng != null)
          {
            paramqal.c(106);
            if (localmng.ak < 0) {
              localmng.ak = localmng.a();
            }
            paramqal.c(localmng.ak);
            localmng.a(paramqal);
          }
          i2++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mos
 * JD-Core Version:    0.7.0.1
 */