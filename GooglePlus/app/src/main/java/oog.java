import java.nio.ByteBuffer;

public final class oog
  extends qan<oog>
{
  public ooh a = null;
  public ooe[] b = ooe.b();
  public Boolean c = null;
  public String d = null;
  private String e = null;
  private ooi f = null;
  private Boolean g = null;
  private String[] h = qay.f;
  
  public oog()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null)
    {
      ooh localooh = this.a;
      int i11 = qal.d(8);
      int i12 = localooh.a();
      localooh.ak = i12;
      j += i11 + (i12 + qal.d(i12));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i7 = j;
      for (int i8 = 0; i8 < this.b.length; i8++)
      {
        ooe localooe = this.b[i8];
        if (localooe != null)
        {
          int i9 = qal.d(16);
          int i10 = localooe.a();
          localooe.ak = i10;
          i7 += i9 + (i10 + qal.d(i10));
        }
      }
      j = i7;
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      j += 1 + qal.d(24);
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      j += 1 + qal.d(32);
    }
    if (this.d != null)
    {
      String str3 = this.d;
      int i5 = qal.d(40);
      int i6 = qal.a(str3);
      j += i5 + (i6 + qal.d(i6));
    }
    if (this.f != null)
    {
      ooi localooi = this.f;
      int i3 = qal.d(64);
      int i4 = localooi.a();
      localooi.ak = i4;
      j += i3 + (i4 + qal.d(i4));
    }
    if ((this.h != null) && (this.h.length > 0))
    {
      int n = 0;
      int i1 = 0;
      while (i < this.h.length)
      {
        String str2 = this.h[i];
        if (str2 != null)
        {
          i1++;
          int i2 = qal.a(str2);
          n += i2 + qal.d(i2);
        }
        i++;
      }
      j = j + n + i1 * 2;
    }
    if (this.e != null)
    {
      String str1 = this.e;
      int k = qal.d(400);
      int m = qal.a(str1);
      j += k + (m + qal.d(m));
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != null)
    {
      ooh localooh = this.a;
      paramqal.c(10);
      if (localooh.ak < 0) {
        localooh.ak = localooh.a();
      }
      paramqal.c(localooh.ak);
      localooh.a(paramqal);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int n = 0; n < this.b.length; n++)
      {
        ooe localooe = this.b[n];
        if (localooe != null)
        {
          paramqal.c(18);
          if (localooe.ak < 0) {
            localooe.ak = localooe.a();
          }
          paramqal.c(localooe.ak);
          localooe.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      boolean bool2 = this.c.booleanValue();
      paramqal.c(24);
      if (bool2) {}
      byte b2;
      for (int m = i;; m = 0)
      {
        b2 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.g != null)
    {
      boolean bool1 = this.g.booleanValue();
      paramqal.c(32);
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
    if (this.d != null)
    {
      String str3 = this.d;
      paramqal.c(42);
      paramqal.a(str3);
    }
    if (this.f != null)
    {
      ooi localooi = this.f;
      paramqal.c(66);
      if (localooi.ak < 0) {
        localooi.ak = localooi.a();
      }
      paramqal.c(localooi.ak);
      localooi.a(paramqal);
    }
    if (this.h != null)
    {
      int j = this.h.length;
      int k = 0;
      if (j > 0) {
        while (k < this.h.length)
        {
          String str2 = this.h[k];
          if (str2 != null)
          {
            paramqal.c(394);
            paramqal.a(str2);
          }
          k++;
        }
      }
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(402);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oog
 * JD-Core Version:    0.7.0.1
 */