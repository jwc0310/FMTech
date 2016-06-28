import java.io.InputStream;
import java.nio.ByteBuffer;

final class hxn
  extends InputStream
{
  private ByteBuffer a;
  
  public hxn(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
  }
  
  public final int read()
  {
    if (!this.a.hasRemaining()) {
      return -1;
    }
    return 0xFF & this.a.get();
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!this.a.hasRemaining()) {
      return -1;
    }
    int i = Math.min(paramInt2, this.a.remaining());
    this.a.get(paramArrayOfByte, paramInt1, i);
    return i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxn
 * JD-Core Version:    0.7.0.1
 */