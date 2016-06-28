import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

final class hxo
  extends FilterInputStream
{
  int a = 0;
  final ByteBuffer b = ByteBuffer.wrap(this.c);
  private final byte[] c = new byte[8];
  
  protected hxo(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public final short a()
  {
    a(this.c, 0, 2);
    this.b.rewind();
    return this.b.getShort();
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (read(paramArrayOfByte, 0, paramInt2) != paramInt2) {
      throw new EOFException();
    }
  }
  
  public final int b()
  {
    a(this.c, 0, 4);
    this.b.rewind();
    return this.b.getInt();
  }
  
  public final int read()
  {
    int i = this.in.read();
    int j = this.a;
    if (i >= 0) {}
    for (int k = 1;; k = 0)
    {
      this.a = (k + j);
      return i;
    }
  }
  
  public final int read(byte[] paramArrayOfByte)
  {
    int i = this.in.read(paramArrayOfByte);
    this.a += Math.max(i, 0);
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = this.in.read(paramArrayOfByte, paramInt1, paramInt2);
    this.a += Math.max(i, 0);
    return i;
  }
  
  public final long skip(long paramLong)
  {
    long l = this.in.skip(paramLong);
    this.a = ((int)(l + this.a));
    return l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxo
 * JD-Core Version:    0.7.0.1
 */