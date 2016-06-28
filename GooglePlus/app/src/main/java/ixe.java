import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class ixe<T extends WritableByteChannel>
  implements WritableByteChannel
{
  public final iwz a;
  public final T b;
  
  public ixe(T paramT, iwy paramiwy)
  {
    this.b = paramT;
    this.a = new iwz(paramiwy);
  }
  
  public final void close()
  {
    this.b.close();
  }
  
  public final boolean isOpen()
  {
    return this.b.isOpen();
  }
  
  public final int write(ByteBuffer paramByteBuffer)
  {
    int i = this.b.write(paramByteBuffer);
    this.a.a(i);
    return i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixe
 * JD-Core Version:    0.7.0.1
 */