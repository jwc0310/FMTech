import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class qal
{
  public final ByteBuffer a;
  
  private qal(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
    this.a.order(ByteOrder.LITTLE_ENDIAN);
  }
  
  public qal(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public static int a(CharSequence paramCharSequence)
  {
    int i = 0;
    int j = paramCharSequence.length();
    for (int k = 0; (k < j) && (paramCharSequence.charAt(k) < ''); k++) {}
    for (;;)
    {
      if (k < j)
      {
        int i1 = paramCharSequence.charAt(k);
        if (i1 < 2048)
        {
          m += (127 - i1 >>> 31);
          k++;
          continue;
        }
        int i2 = paramCharSequence.length();
        if (k < i2)
        {
          int i3 = paramCharSequence.charAt(k);
          if (i3 < 2048) {
            i += (127 - i3 >>> 31);
          }
          for (;;)
          {
            k++;
            break;
            i += 2;
            if ((55296 <= i3) && (i3 <= 57343))
            {
              if (Character.codePointAt(paramCharSequence, k) < 65536) {
                throw new IllegalArgumentException(39 + "Unpaired surrogate at index " + k);
              }
              k++;
            }
          }
        }
      }
      for (int n = m + i;; n = m)
      {
        if (n < j)
        {
          long l = 4294967296L + n;
          throw new IllegalArgumentException(54 + "UTF-8 length does not fit in int: " + l);
        }
        return n;
      }
      int m = j;
    }
  }
  
  private static int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramCharSequence.length();
    int j = 0;
    int k = paramInt1 + paramInt2;
    while ((j < i) && (j + paramInt1 < k))
    {
      int i10 = paramCharSequence.charAt(j);
      if (i10 >= 128) {
        break;
      }
      paramArrayOfByte[(paramInt1 + j)] = ((byte)i10);
      j++;
    }
    if (j == i) {
      return paramInt1 + i;
    }
    int m = paramInt1 + j;
    if (j < i)
    {
      int n = paramCharSequence.charAt(j);
      int i6;
      if ((n < 128) && (m < k))
      {
        i6 = m + 1;
        paramArrayOfByte[m] = ((byte)n);
      }
      for (;;)
      {
        j++;
        m = i6;
        break;
        if ((n < 2048) && (m <= k - 2))
        {
          int i9 = m + 1;
          paramArrayOfByte[m] = ((byte)(0x3C0 | n >>> 6));
          i6 = i9 + 1;
          paramArrayOfByte[i9] = ((byte)(0x80 | n & 0x3F));
        }
        else if (((n < 55296) || (57343 < n)) && (m <= k - 3))
        {
          int i7 = m + 1;
          paramArrayOfByte[m] = ((byte)(0x1E0 | n >>> 12));
          int i8 = i7 + 1;
          paramArrayOfByte[i7] = ((byte)(0x80 | 0x3F & n >>> 6));
          i6 = i8 + 1;
          paramArrayOfByte[i8] = ((byte)(0x80 | n & 0x3F));
        }
        else
        {
          if (m > k - 4) {
            break label466;
          }
          char c;
          if (j + 1 != paramCharSequence.length())
          {
            j++;
            c = paramCharSequence.charAt(j);
            if (Character.isSurrogatePair(n, c)) {}
          }
          else
          {
            int i1 = j - 1;
            throw new IllegalArgumentException(39 + "Unpaired surrogate at index " + i1);
          }
          int i2 = Character.toCodePoint(n, c);
          int i3 = m + 1;
          paramArrayOfByte[m] = ((byte)(0xF0 | i2 >>> 18));
          int i4 = i3 + 1;
          paramArrayOfByte[i3] = ((byte)(0x80 | 0x3F & i2 >>> 12));
          int i5 = i4 + 1;
          paramArrayOfByte[i4] = ((byte)(0x80 | 0x3F & i2 >>> 6));
          i6 = i5 + 1;
          paramArrayOfByte[i5] = ((byte)(0x80 | i2 & 0x3F));
        }
      }
      label466:
      throw new ArrayIndexOutOfBoundsException(37 + "Failed writing " + n + " at index " + m);
    }
    return m;
  }
  
  public static qal a(byte[] paramArrayOfByte)
  {
    return new qal(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  private static void a(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.isReadOnly()) {
      throw new ReadOnlyBufferException();
    }
    if (paramByteBuffer.hasArray()) {
      try
      {
        paramByteBuffer.position(a(paramCharSequence, paramByteBuffer.array(), paramByteBuffer.arrayOffset() + paramByteBuffer.position(), paramByteBuffer.remaining()) - paramByteBuffer.arrayOffset());
        return;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
      {
        BufferOverflowException localBufferOverflowException = new BufferOverflowException();
        localBufferOverflowException.initCause(localArrayIndexOutOfBoundsException);
        throw localBufferOverflowException;
      }
    }
    b(paramCharSequence, paramByteBuffer);
  }
  
  public static int b(int paramInt)
  {
    if (paramInt >= 0) {
      return d(paramInt);
    }
    return 10;
  }
  
  public static int b(int paramInt, double paramDouble)
  {
    return 8 + d(0x0 | paramInt << 3);
  }
  
  public static int b(int paramInt, float paramFloat)
  {
    return 4 + d(0x0 | paramInt << 3);
  }
  
  public static int b(int paramInt, String paramString)
  {
    int i = d(0x0 | paramInt << 3);
    int j = a(paramString);
    return i + (j + d(j));
  }
  
  public static int b(int paramInt, qat paramqat)
  {
    int i = d(0x0 | paramInt << 3) << 1;
    int j = paramqat.a();
    paramqat.ak = j;
    return i + j;
  }
  
  public static int b(int paramInt, boolean paramBoolean)
  {
    return 1 + d(0x0 | paramInt << 3);
  }
  
  public static int b(int paramInt, byte[] paramArrayOfByte)
  {
    return d(0x0 | paramInt << 3) + (d(paramArrayOfByte.length) + paramArrayOfByte.length);
  }
  
  public static int b(long paramLong)
  {
    if ((0xFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if ((0xFFFFC000 & paramLong) == 0L) {
      return 2;
    }
    if ((0xFFE00000 & paramLong) == 0L) {
      return 3;
    }
    if ((0xF0000000 & paramLong) == 0L) {
      return 4;
    }
    if ((0x0 & paramLong) == 0L) {
      return 5;
    }
    if ((0x0 & paramLong) == 0L) {
      return 6;
    }
    if ((0x0 & paramLong) == 0L) {
      return 7;
    }
    if ((0x0 & paramLong) == 0L) {
      return 8;
    }
    if ((0x0 & paramLong) == 0L) {
      return 9;
    }
    return 10;
  }
  
  public static int b(String paramString)
  {
    int i = a(paramString);
    return i + d(i);
  }
  
  public static int b(byte[] paramArrayOfByte)
  {
    return d(paramArrayOfByte.length) + paramArrayOfByte.length;
  }
  
  private static void b(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    int i = paramCharSequence.length();
    int j = 0;
    if (j < i)
    {
      int k = paramCharSequence.charAt(j);
      if (k < 128) {
        paramByteBuffer.put((byte)k);
      }
      for (;;)
      {
        j++;
        break;
        if (k < 2048)
        {
          paramByteBuffer.put((byte)(0x3C0 | k >>> 6));
          paramByteBuffer.put((byte)(0x80 | k & 0x3F));
        }
        else if ((k < 55296) || (57343 < k))
        {
          paramByteBuffer.put((byte)(0x1E0 | k >>> 12));
          paramByteBuffer.put((byte)(0x80 | 0x3F & k >>> 6));
          paramByteBuffer.put((byte)(0x80 | k & 0x3F));
        }
        else
        {
          char c;
          if (j + 1 != paramCharSequence.length())
          {
            j++;
            c = paramCharSequence.charAt(j);
            if (Character.isSurrogatePair(k, c)) {}
          }
          else
          {
            int m = j - 1;
            throw new IllegalArgumentException(39 + "Unpaired surrogate at index " + m);
          }
          int n = Character.toCodePoint(k, c);
          paramByteBuffer.put((byte)(0xF0 | n >>> 18));
          paramByteBuffer.put((byte)(0x80 | 0x3F & n >>> 12));
          paramByteBuffer.put((byte)(0x80 | 0x3F & n >>> 6));
          paramByteBuffer.put((byte)(0x80 | n & 0x3F));
        }
      }
    }
  }
  
  public static int c(int paramInt, qat paramqat)
  {
    int i = d(0x0 | paramInt << 3);
    int j = paramqat.a();
    paramqat.ak = j;
    return i + (j + d(j));
  }
  
  public static int d(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xFFFFC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((0xF0000000 & paramInt) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static int d(int paramInt, long paramLong)
  {
    return d(0x0 | paramInt << 3) + b(paramLong);
  }
  
  public static int e(int paramInt1, int paramInt2)
  {
    int i = d(0x0 | paramInt1 << 3);
    if (paramInt2 >= 0) {}
    for (int j = d(paramInt2);; j = 10) {
      return j + i;
    }
  }
  
  public static int e(int paramInt, long paramLong)
  {
    return d(0x0 | paramInt << 3) + b(paramLong);
  }
  
  public static int f(int paramInt1, int paramInt2)
  {
    return 4 + d(0x0 | paramInt1 << 3);
  }
  
  public static int f(int paramInt, long paramLong)
  {
    return 8 + d(0x0 | paramInt << 3);
  }
  
  private void f(int paramInt)
  {
    byte b = (byte)paramInt;
    if (!this.a.hasRemaining()) {
      throw new qam(this.a.position(), this.a.limit());
    }
    this.a.put(b);
  }
  
  public static int g(int paramInt1, int paramInt2)
  {
    return d(0x0 | paramInt1 << 3) + d(paramInt2);
  }
  
  public static int h(int paramInt1, int paramInt2)
  {
    return 4 + d(0x0 | paramInt1 << 3);
  }
  
  public final void a(int paramInt)
  {
    if (paramInt >= 0)
    {
      c(paramInt);
      return;
    }
    a(paramInt);
  }
  
  public final void a(int paramInt, double paramDouble)
  {
    c(0x1 | paramInt << 3);
    c(Double.doubleToLongBits(paramDouble));
  }
  
  public final void a(int paramInt, float paramFloat)
  {
    c(0x5 | paramInt << 3);
    e(Float.floatToIntBits(paramFloat));
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    c(0x0 | paramInt1 << 3);
    a(paramInt2);
  }
  
  public final void a(int paramInt, long paramLong)
  {
    c(0x0 | paramInt << 3);
    a(paramLong);
  }
  
  public final void a(int paramInt, String paramString)
  {
    c(0x2 | paramInt << 3);
    int i;
    int j;
    try
    {
      i = d(paramString.length());
      if (i != d(3 * paramString.length())) {
        break label170;
      }
      j = this.a.position();
      if (this.a.remaining() < i) {
        throw new qam(i + j, this.a.limit());
      }
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      qam localqam = new qam(this.a.position(), this.a.limit());
      localqam.initCause(localBufferOverflowException);
      throw localqam;
    }
    this.a.position(j + i);
    a(paramString, this.a);
    int k = this.a.position();
    this.a.position(j);
    c(k - j - i);
    this.a.position(k);
    return;
    label170:
    c(a(paramString));
    a(paramString, this.a);
  }
  
  public final void a(int paramInt, qat paramqat)
  {
    c(0x2 | paramInt << 3);
    if (paramqat.ak < 0) {
      paramqat.ak = paramqat.a();
    }
    c(paramqat.ak);
    paramqat.a(this);
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    c(0x0 | paramInt << 3);
    int i = 0;
    if (paramBoolean) {
      i = 1;
    }
    byte b = (byte)i;
    if (!this.a.hasRemaining()) {
      throw new qam(this.a.position(), this.a.limit());
    }
    this.a.put(b);
  }
  
  public final void a(int paramInt, byte[] paramArrayOfByte)
  {
    c(0x2 | paramInt << 3);
    c(paramArrayOfByte.length);
    int i = paramArrayOfByte.length;
    if (this.a.remaining() >= i)
    {
      this.a.put(paramArrayOfByte, 0, i);
      return;
    }
    throw new qam(this.a.position(), this.a.limit());
  }
  
  public final void a(long paramLong)
  {
    for (;;)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        f((int)paramLong);
        return;
      }
      f(0x80 | 0x7F & (int)paramLong);
      paramLong >>>= 7;
    }
  }
  
  public final void a(String paramString)
  {
    int i;
    int j;
    try
    {
      i = d(paramString.length());
      if (i != d(3 * paramString.length())) {
        break label158;
      }
      j = this.a.position();
      if (this.a.remaining() < i) {
        throw new qam(i + j, this.a.limit());
      }
    }
    catch (BufferOverflowException localBufferOverflowException)
    {
      qam localqam = new qam(this.a.position(), this.a.limit());
      localqam.initCause(localBufferOverflowException);
      throw localqam;
    }
    this.a.position(j + i);
    a(paramString, this.a);
    int k = this.a.position();
    this.a.position(j);
    c(k - j - i);
    this.a.position(k);
    return;
    label158:
    c(a(paramString));
    a(paramString, this.a);
  }
  
  public final void a(qat paramqat)
  {
    if (paramqat.ak < 0) {
      paramqat.ak = paramqat.a();
    }
    c(paramqat.ak);
    paramqat.a(this);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    byte b;
    for (int i = 1;; i = 0)
    {
      b = (byte)i;
      if (this.a.hasRemaining()) {
        break;
      }
      throw new qam(this.a.position(), this.a.limit());
    }
    this.a.put(b);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    c(0x5 | paramInt1 << 3);
    e(paramInt2);
  }
  
  public final void b(int paramInt, long paramLong)
  {
    c(0x0 | paramInt << 3);
    a(paramLong);
  }
  
  public final void c(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        f(paramInt);
        return;
      }
      f(0x80 | paramInt & 0x7F);
      paramInt >>>= 7;
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    c(0x0 | paramInt1 << 3);
    c(paramInt2);
  }
  
  public final void c(int paramInt, long paramLong)
  {
    c(0x1 | paramInt << 3);
    c(paramLong);
  }
  
  public final void c(long paramLong)
  {
    if (this.a.remaining() < 8) {
      throw new qam(this.a.position(), this.a.limit());
    }
    this.a.putLong(paramLong);
  }
  
  public final void c(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    if (this.a.remaining() >= i)
    {
      this.a.put(paramArrayOfByte, 0, i);
      return;
    }
    throw new qam(this.a.position(), this.a.limit());
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    c(0x5 | paramInt1 << 3);
    e(paramInt2);
  }
  
  public final void e(int paramInt)
  {
    if (this.a.remaining() < 4) {
      throw new qam(this.a.position(), this.a.limit());
    }
    this.a.putInt(paramInt);
  }
  
  public final void i(int paramInt1, int paramInt2)
  {
    c(paramInt2 | paramInt1 << 3);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qal
 * JD-Core Version:    0.7.0.1
 */