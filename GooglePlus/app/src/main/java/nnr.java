import java.nio.ByteBuffer;

public final class nnr
  extends qan<nnr>
{
  public Long a = null;
  public Integer b = null;
  public int[] c = qay.a;
  public String d = null;
  public int[] e = qay.a;
  public Boolean f = null;
  private Long g = null;
  private String[] h = qay.f;
  private byte[] i = null;
  private Long j = null;
  
  public nnr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int k = 0;
    int m = super.a();
    if (this.g != null)
    {
      long l3 = this.g.longValue();
      m += qal.d(8) + qal.b(l3);
    }
    if (this.a != null)
    {
      long l2 = this.a.longValue();
      m += qal.d(16) + qal.b(l2);
    }
    if (this.b != null)
    {
      int i13 = this.b.intValue();
      m += qal.d(24) + qal.d(i13);
    }
    if ((this.h != null) && (this.h.length > 0))
    {
      int i9 = 0;
      int i10 = 0;
      int i11 = 0;
      while (i9 < this.h.length)
      {
        String str2 = this.h[i9];
        if (str2 != null)
        {
          i11++;
          int i12 = qal.a(str2);
          i10 += i12 + qal.d(i12);
        }
        i9++;
      }
      m = m + i10 + i11 * 1;
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i5 = 0;
      int i6 = 0;
      if (i5 < this.c.length)
      {
        int i7 = this.c[i5];
        if (i7 >= 0) {}
        for (int i8 = qal.d(i7);; i8 = 10)
        {
          i6 += i8;
          i5++;
          break;
        }
      }
      m = m + i6 + 1 * this.c.length;
    }
    if (this.i != null)
    {
      byte[] arrayOfByte = this.i;
      m += qal.d(48) + (qal.d(arrayOfByte.length) + arrayOfByte.length);
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int i3 = qal.d(56);
      int i4 = qal.a(str1);
      m += i3 + (i4 + qal.d(i4));
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int n = 0;
      if (k < this.e.length)
      {
        int i1 = this.e[k];
        if (i1 >= 0) {}
        for (int i2 = qal.d(i1);; i2 = 10)
        {
          n += i2;
          k++;
          break;
        }
      }
      m = m + n + 1 * this.e.length;
    }
    if (this.f != null)
    {
      this.f.booleanValue();
      m += 1 + qal.d(72);
    }
    if (this.j != null)
    {
      long l1 = this.j.longValue();
      m += qal.d(80) + qal.b(l1);
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    if (this.g != null)
    {
      long l3 = this.g.longValue();
      paramqal.c(8);
      paramqal.a(l3);
    }
    if (this.a != null)
    {
      long l2 = this.a.longValue();
      paramqal.c(16);
      paramqal.a(l2);
    }
    if (this.b != null)
    {
      int i5 = this.b.intValue();
      paramqal.c(24);
      paramqal.c(i5);
    }
    if ((this.h != null) && (this.h.length > 0)) {
      for (int i4 = 0; i4 < this.h.length; i4++)
      {
        String str2 = this.h[i4];
        if (str2 != null)
        {
          paramqal.c(34);
          paramqal.a(str2);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i2 = 0; i2 < this.c.length; i2++)
      {
        int i3 = this.c[i2];
        paramqal.c(40);
        paramqal.a(i3);
      }
    }
    if (this.i != null)
    {
      byte[] arrayOfByte = this.i;
      paramqal.c(50);
      paramqal.c(arrayOfByte.length);
      int i1 = arrayOfByte.length;
      if (paramqal.a.remaining() >= i1) {
        paramqal.a.put(arrayOfByte, 0, i1);
      }
    }
    else
    {
      if (this.d != null)
      {
        String str1 = this.d;
        paramqal.c(58);
        paramqal.a(str1);
      }
      if ((this.e == null) || (this.e.length <= 0)) {
        break label357;
      }
      for (int m = 0; m < this.e.length; m++)
      {
        int n = this.e[m];
        paramqal.c(64);
        paramqal.a(n);
      }
    }
    throw new qam(paramqal.a.position(), paramqal.a.limit());
    label357:
    if (this.f != null)
    {
      boolean bool = this.f.booleanValue();
      paramqal.c(72);
      int k = 0;
      if (bool) {
        k = 1;
      }
      byte b1 = (byte)k;
      if (!paramqal.a.hasRemaining()) {
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.j != null)
    {
      long l1 = this.j.longValue();
      paramqal.c(80);
      paramqal.a(l1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nnr
 * JD-Core Version:    0.7.0.1
 */