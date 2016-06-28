import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public final class ixc<T extends ReadableByteChannel>
  implements ReadableByteChannel
{
  private final iwz a;
  private final T b;
  
  public ixc(T paramT, iwy paramiwy, long paramLong)
  {
    this(paramT, new iwz(paramiwy, paramLong));
  }
  
  private ixc(T paramT, iwz paramiwz)
  {
    this.b = paramT;
    this.a = paramiwz;
  }
  
  public final void close()
  {
    this.b.close();
  }
  
  public final boolean isOpen()
  {
    return this.b.isOpen();
  }
  
  public final int read(ByteBuffer paramByteBuffer)
  {
    int i = this.b.read(paramByteBuffer);
    if (i >= 0) {
      this.a.a(i);
    }
    return i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixc
 * JD-Core Version:    0.7.0.1
 */