import java.io.InputStream;
import java.nio.ByteBuffer;

public final class mfp
  extends InputStream
{
  private final ByteBuffer a;
  private int b = 0;
  
  public mfp(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
  }
  
  public final int available()
  {
    return this.a.remaining();
  }
  
  public final void mark(int paramInt)
  {
    this.b = this.a.position();
  }
  
  public final boolean markSupported()
  {
    return true;
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
    if (this.a.hasRemaining())
    {
      int i = Math.min(this.a.remaining(), paramInt2);
      this.a.get(paramArrayOfByte, paramInt1, i);
      return i;
    }
    return -1;
  }
  
  public final void reset()
  {
    this.a.position(this.b);
  }
  
  public final long skip(long paramLong)
  {
    int i = (int)Math.min(paramLong, this.a.remaining());
    this.a.position(i + this.a.position());
    return i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mfp
 * JD-Core Version:    0.7.0.1
 */