import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

final class hyd
  extends FilterOutputStream
{
  final ByteBuffer a = ByteBuffer.allocate(4);
  
  public hyd(OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }
  
  public final hyd a(int paramInt)
  {
    this.a.rewind();
    this.a.putInt(paramInt);
    this.out.write(this.a.array());
    return this;
  }
  
  public final hyd a(short paramShort)
  {
    this.a.rewind();
    this.a.putShort(paramShort);
    this.out.write(this.a.array(), 0, 2);
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hyd
 * JD-Core Version:    0.7.0.1
 */