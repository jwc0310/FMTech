public final class qak
{
  final byte[] a;
  public int b;
  public int c;
  public int d = 2147483647;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i = 64;
  
  public qak(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.b = paramInt1;
    this.e = (paramInt1 + paramInt2);
    this.c = paramInt1;
  }
  
  public static qak a(byte[] paramArrayOfByte)
  {
    return new qak(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  private void f(int paramInt)
  {
    if (paramInt < 0) {
      throw new qas("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    if (paramInt + this.c > this.d)
    {
      f(this.d - this.c);
      throw new qas("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
    if (paramInt <= this.e - this.c)
    {
      this.c = (paramInt + this.c);
      return;
    }
    throw new qas("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
  }
  
  private byte p()
  {
    if (this.c == this.e) {
      throw new qas("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
    byte[] arrayOfByte = this.a;
    int j = this.c;
    this.c = (j + 1);
    return arrayOfByte[j];
  }
  
  public final int a()
  {
    if (this.c == this.e) {}
    for (int j = 1; j != 0; j = 0)
    {
      this.g = 0;
      return 0;
    }
    this.g = i();
    if (this.g == 0) {
      throw new qas("Protocol message contained an invalid tag (zero).");
    }
    return this.g;
  }
  
  public final void a(int paramInt)
  {
    if (this.g != paramInt) {
      throw new qas("Protocol message end-group tag did not match expected tag.");
    }
  }
  
  public final void a(qat paramqat)
  {
    int j = i();
    if (this.h >= this.i) {
      throw new qas("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
    int k = c(j);
    this.h = (1 + this.h);
    paramqat.a(this);
    a(0);
    this.h = (-1 + this.h);
    this.d = k;
    m();
  }
  
  public final void a(qat paramqat, int paramInt)
  {
    if (this.h >= this.i) {
      throw new qas("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
    this.h = (1 + this.h);
    paramqat.a(this);
    a(0x4 | paramInt << 3);
    this.h = (-1 + this.h);
  }
  
  public final double b()
  {
    return Double.longBitsToDouble(l());
  }
  
  public final boolean b(int paramInt)
  {
    switch (paramInt & 0x7)
    {
    default: 
      throw new qas("Protocol message tag had invalid wire type.");
    case 0: 
      i();
      return true;
    case 1: 
      l();
      return true;
    case 2: 
      f(i());
      return true;
    case 3: 
      int j;
      do
      {
        j = a();
      } while ((j != 0) && (b(j)));
      a(0x4 | paramInt >>> 3 << 3);
      return true;
    case 4: 
      return false;
    }
    k();
    return true;
  }
  
  public final float c()
  {
    return Float.intBitsToFloat(k());
  }
  
  public final int c(int paramInt)
  {
    if (paramInt < 0) {
      throw new qas("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    int j = paramInt + this.c;
    int k = this.d;
    if (j > k) {
      throw new qas("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
    this.d = j;
    m();
    return k;
  }
  
  public final long d()
  {
    return j();
  }
  
  public final void d(int paramInt)
  {
    this.d = paramInt;
    m();
  }
  
  public final int e()
  {
    return i();
  }
  
  public final void e(int paramInt)
  {
    if (paramInt > this.c - this.b)
    {
      int j = this.c - this.b;
      throw new IllegalArgumentException(50 + "Position " + paramInt + " is beyond current " + j);
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException(24 + "Bad position " + paramInt);
    }
    this.c = (paramInt + this.b);
  }
  
  public final boolean f()
  {
    return i() != 0;
  }
  
  public final String g()
  {
    int j = i();
    if (j < 0) {
      throw new qas("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    if (j > this.e - this.c) {
      throw new qas("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
    String str = new String(this.a, this.c, j, "UTF-8");
    this.c = (j + this.c);
    return str;
  }
  
  public final byte[] h()
  {
    int j = i();
    if (j < 0) {
      throw new qas("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    if (j == 0) {
      return qay.h;
    }
    if (j > this.e - this.c) {
      throw new qas("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
    byte[] arrayOfByte = new byte[j];
    System.arraycopy(this.a, this.c, arrayOfByte, 0, j);
    this.c = (j + this.c);
    return arrayOfByte;
  }
  
  public final int i()
  {
    int j = p();
    if (j >= 0) {}
    int i5;
    do
    {
      return j;
      int k = j & 0x7F;
      int m = p();
      if (m >= 0) {
        return k | m << 7;
      }
      int n = k | (m & 0x7F) << 7;
      int i1 = p();
      if (i1 >= 0) {
        return n | i1 << 14;
      }
      int i2 = n | (i1 & 0x7F) << 14;
      int i3 = p();
      if (i3 >= 0) {
        return i2 | i3 << 21;
      }
      int i4 = i2 | (i3 & 0x7F) << 21;
      i5 = p();
      j = i4 | i5 << 28;
    } while (i5 >= 0);
    for (int i6 = 0;; i6++)
    {
      if (i6 >= 5) {
        break label151;
      }
      if (p() >= 0) {
        break;
      }
    }
    label151:
    throw new qas("CodedInputStream encountered a malformed varint.");
  }
  
  public final long j()
  {
    int j = 0;
    long l = 0L;
    while (j < 64)
    {
      int k = p();
      l |= (k & 0x7F) << j;
      if ((k & 0x80) == 0) {
        return l;
      }
      j += 7;
    }
    throw new qas("CodedInputStream encountered a malformed varint.");
  }
  
  public final int k()
  {
    int j = p();
    int k = p();
    int m = p();
    int n = p();
    return j & 0xFF | (k & 0xFF) << 8 | (m & 0xFF) << 16 | (n & 0xFF) << 24;
  }
  
  public final long l()
  {
    int j = p();
    int k = p();
    int m = p();
    int n = p();
    int i1 = p();
    int i2 = p();
    int i3 = p();
    int i4 = p();
    return 0xFF & j | (0xFF & k) << 8 | (0xFF & m) << 16 | (0xFF & n) << 24 | (0xFF & i1) << 32 | (0xFF & i2) << 40 | (0xFF & i3) << 48 | (0xFF & i4) << 56;
  }
  
  public final void m()
  {
    this.e += this.f;
    int j = this.e;
    if (j > this.d)
    {
      this.f = (j - this.d);
      this.e -= this.f;
      return;
    }
    this.f = 0;
  }
  
  public final int n()
  {
    if (this.d == 2147483647) {
      return -1;
    }
    int j = this.c;
    return this.d - j;
  }
  
  public final int o()
  {
    return this.c - this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qak
 * JD-Core Version:    0.7.0.1
 */