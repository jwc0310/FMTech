import java.nio.ByteBuffer;

public final class oow
  extends qan<oow>
{
  public ome a = null;
  private Boolean b = null;
  private Boolean c = null;
  private Boolean d = null;
  private Boolean e = null;
  private Boolean f = null;
  private Boolean g = null;
  private String[] h = qay.f;
  private Boolean i = null;
  private String j = null;
  private Boolean k = null;
  private Boolean l = null;
  private Boolean m = null;
  private oox[] n = oox.b();
  private ooy o = null;
  
  public oow()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.b != null)
    {
      this.b.booleanValue();
      i1 += 1 + qal.d(24);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i1 += 1 + qal.d(40);
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i1 += 1 + qal.d(48);
    }
    if (this.e != null)
    {
      this.e.booleanValue();
      i1 += 1 + qal.d(56);
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      i1 += 1 + qal.d(112);
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      i1 += 1 + qal.d(120);
    }
    if (this.a != null)
    {
      ome localome = this.a;
      int i14 = qal.d(128);
      int i15 = localome.a();
      localome.ak = i15;
      i1 += i14 + (i15 + qal.d(i15));
    }
    if ((this.h != null) && (this.h.length > 0))
    {
      int i10 = 0;
      int i11 = 0;
      int i12 = 0;
      while (i10 < this.h.length)
      {
        String str2 = this.h[i10];
        if (str2 != null)
        {
          i12++;
          int i13 = qal.a(str2);
          i11 += i13 + qal.d(i13);
        }
        i10++;
      }
      i1 = i1 + i11 + i12 * 2;
    }
    if (this.i != null)
    {
      this.i.booleanValue();
      i1 += 1 + qal.d(144);
    }
    if (this.j != null)
    {
      String str1 = this.j;
      int i8 = qal.d(152);
      int i9 = qal.a(str1);
      i1 += i8 + (i9 + qal.d(i9));
    }
    if (this.k != null)
    {
      this.k.booleanValue();
      i1 += 1 + qal.d(160);
    }
    if (this.l != null)
    {
      this.l.booleanValue();
      i1 += 1 + qal.d(168);
    }
    if (this.m != null)
    {
      this.m.booleanValue();
      i1 += 1 + qal.d(176);
    }
    if (this.n != null)
    {
      int i4 = this.n.length;
      int i5 = 0;
      if (i4 > 0) {
        while (i5 < this.n.length)
        {
          oox localoox = this.n[i5];
          if (localoox != null)
          {
            int i6 = qal.d(184);
            int i7 = localoox.a();
            localoox.ak = i7;
            i1 += i6 + (i7 + qal.d(i7));
          }
          i5++;
        }
      }
    }
    if (this.o != null)
    {
      ooy localooy = this.o;
      int i2 = qal.d(192);
      int i3 = localooy.a();
      localooy.ak = i3;
      i1 += i2 + (i3 + qal.d(i3));
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    int i1 = 1;
    if (this.b != null)
    {
      boolean bool10 = this.b.booleanValue();
      paramqal.c(24);
      if (bool10) {}
      byte b10;
      for (int i13 = i1;; i13 = 0)
      {
        b10 = (byte)i13;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b10);
    }
    if (this.c != null)
    {
      boolean bool9 = this.c.booleanValue();
      paramqal.c(40);
      if (bool9) {}
      byte b9;
      for (int i12 = i1;; i12 = 0)
      {
        b9 = (byte)i12;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b9);
    }
    if (this.d != null)
    {
      boolean bool8 = this.d.booleanValue();
      paramqal.c(48);
      if (bool8) {}
      byte b8;
      for (int i11 = i1;; i11 = 0)
      {
        b8 = (byte)i11;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b8);
    }
    if (this.e != null)
    {
      boolean bool7 = this.e.booleanValue();
      paramqal.c(56);
      if (bool7) {}
      byte b7;
      for (int i10 = i1;; i10 = 0)
      {
        b7 = (byte)i10;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b7);
    }
    if (this.f != null)
    {
      boolean bool6 = this.f.booleanValue();
      paramqal.c(112);
      if (bool6) {}
      byte b6;
      for (int i9 = i1;; i9 = 0)
      {
        b6 = (byte)i9;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b6);
    }
    if (this.g != null)
    {
      boolean bool5 = this.g.booleanValue();
      paramqal.c(120);
      if (bool5) {}
      byte b5;
      for (int i8 = i1;; i8 = 0)
      {
        b5 = (byte)i8;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b5);
    }
    if (this.a != null)
    {
      ome localome = this.a;
      paramqal.c(130);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    if ((this.h != null) && (this.h.length > 0)) {
      for (int i7 = 0; i7 < this.h.length; i7++)
      {
        String str2 = this.h[i7];
        if (str2 != null)
        {
          paramqal.c(138);
          paramqal.a(str2);
        }
      }
    }
    if (this.i != null)
    {
      boolean bool4 = this.i.booleanValue();
      paramqal.c(144);
      if (bool4) {}
      byte b4;
      for (int i6 = i1;; i6 = 0)
      {
        b4 = (byte)i6;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b4);
    }
    if (this.j != null)
    {
      String str1 = this.j;
      paramqal.c(154);
      paramqal.a(str1);
    }
    if (this.k != null)
    {
      boolean bool3 = this.k.booleanValue();
      paramqal.c(160);
      if (bool3) {}
      byte b3;
      for (int i5 = i1;; i5 = 0)
      {
        b3 = (byte)i5;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
    }
    if (this.l != null)
    {
      boolean bool2 = this.l.booleanValue();
      paramqal.c(168);
      if (bool2) {}
      byte b2;
      for (int i4 = i1;; i4 = 0)
      {
        b2 = (byte)i4;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.m != null)
    {
      boolean bool1 = this.m.booleanValue();
      paramqal.c(176);
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
    if (this.n != null)
    {
      int i2 = this.n.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.n.length)
        {
          oox localoox = this.n[i3];
          if (localoox != null)
          {
            paramqal.c(186);
            if (localoox.ak < 0) {
              localoox.ak = localoox.a();
            }
            paramqal.c(localoox.ak);
            localoox.a(paramqal);
          }
          i3++;
        }
      }
    }
    if (this.o != null)
    {
      ooy localooy = this.o;
      paramqal.c(194);
      if (localooy.ak < 0) {
        localooy.ak = localooy.a();
      }
      paramqal.c(localooy.ak);
      localooy.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oow
 * JD-Core Version:    0.7.0.1
 */