import java.nio.ByteBuffer;

public final class ndm
  extends qan<ndm>
{
  private int a = -2147483648;
  private int b = -2147483648;
  private ndn[] c = ndn.b();
  private Boolean d = null;
  private int e = -2147483648;
  private int f = -2147483648;
  private int g = -2147483648;
  
  public ndm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i15;
    int i16;
    if (this.a != -2147483648)
    {
      int i14 = this.a;
      i15 = qal.d(8);
      if (i14 >= 0) {
        i16 = qal.d(i14);
      }
    }
    for (int k = j + (i16 + i15);; k = j)
    {
      int i11;
      int i12;
      if (this.b != -2147483648)
      {
        i11 = this.b;
        i12 = qal.d(16);
        if (i11 < 0) {
          break label186;
        }
      }
      int i7;
      label186:
      for (int i13 = qal.d(i11);; i13 = i)
      {
        k += i13 + i12;
        if ((this.c == null) || (this.c.length <= 0)) {
          break label195;
        }
        i7 = k;
        for (int i8 = 0; i8 < this.c.length; i8++)
        {
          ndn localndn = this.c[i8];
          if (localndn != null)
          {
            int i9 = qal.d(24);
            int i10 = localndn.a();
            localndn.ak = i10;
            i7 += i9 + (i10 + qal.d(i10));
          }
        }
        i16 = i;
        break;
      }
      k = i7;
      label195:
      if (this.d != null)
      {
        this.d.booleanValue();
        k += 1 + qal.d(32);
      }
      int i6;
      int i1;
      int i2;
      if (this.e != -2147483648)
      {
        int i4 = this.e;
        int i5 = qal.d(40);
        if (i4 >= 0)
        {
          i6 = qal.d(i4);
          k += i6 + i5;
        }
      }
      else if (this.f != -2147483648)
      {
        i1 = this.f;
        i2 = qal.d(48);
        if (i1 < 0) {
          break label352;
        }
      }
      label352:
      for (int i3 = qal.d(i1);; i3 = i)
      {
        k += i3 + i2;
        if (this.g != -2147483648)
        {
          int m = this.g;
          int n = qal.d(56);
          if (m >= 0) {
            i = qal.d(m);
          }
          k += i + n;
        }
        return k;
        i6 = i;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int i2 = this.a;
      paramqal.c(8);
      paramqal.a(i2);
    }
    if (this.b != -2147483648)
    {
      int i1 = this.b;
      paramqal.c(16);
      paramqal.a(i1);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int n = 0; n < this.c.length; n++)
      {
        ndn localndn = this.c[n];
        if (localndn != null)
        {
          paramqal.c(26);
          if (localndn.ak < 0) {
            localndn.ak = localndn.a();
          }
          paramqal.c(localndn.ak);
          localndn.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(32);
      int m = 0;
      if (bool) {
        m = 1;
      }
      byte b1 = (byte)m;
      if (!paramqal.a.hasRemaining()) {
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.e != -2147483648)
    {
      int k = this.e;
      paramqal.c(40);
      paramqal.a(k);
    }
    if (this.f != -2147483648)
    {
      int j = this.f;
      paramqal.c(48);
      paramqal.a(j);
    }
    if (this.g != -2147483648)
    {
      int i = this.g;
      paramqal.c(56);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ndm
 * JD-Core Version:    0.7.0.1
 */