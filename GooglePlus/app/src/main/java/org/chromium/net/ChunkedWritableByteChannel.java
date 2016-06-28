package org.chromium.net;

import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;

@Deprecated
public class ChunkedWritableByteChannel
  implements WritableByteChannel
{
  final ArrayList<ByteBuffer> a = new ArrayList();
  ByteBuffer b;
  private ByteBuffer c;
  private int d;
  private boolean e;
  
  public final ByteBuffer a()
  {
    if (this.b != null)
    {
      this.b.flip();
      this.c = this.b;
      this.b = null;
    }
    for (;;)
    {
      return this.c;
      if ((this.c == null) || (this.d != this.c.capacity())) {
        if ((this.c == null) && (this.a.size() == 1))
        {
          this.c = ((ByteBuffer)this.a.get(0));
        }
        else
        {
          this.c = ByteBuffer.allocateDirect(this.d);
          int i = this.a.size();
          for (int j = 0; j < i; j++) {
            this.c.put((ByteBuffer)this.a.get(j));
          }
          this.c.rewind();
        }
      }
    }
  }
  
  public final byte[] b()
  {
    byte[] arrayOfByte = new byte[this.d];
    if (this.b != null)
    {
      this.b.flip();
      this.b.get(arrayOfByte);
    }
    for (;;)
    {
      return arrayOfByte;
      int i = this.a.size();
      int j = 0;
      int k = 0;
      while (j < i)
      {
        ByteBuffer localByteBuffer = (ByteBuffer)this.a.get(j);
        int m = localByteBuffer.remaining();
        localByteBuffer.get(arrayOfByte, k, m);
        localByteBuffer.rewind();
        k += m;
        j++;
      }
    }
  }
  
  public void close()
  {
    this.e = true;
  }
  
  public boolean isOpen()
  {
    return !this.e;
  }
  
  public int write(ByteBuffer paramByteBuffer)
  {
    if (this.e) {
      throw new ClosedChannelException();
    }
    int i = paramByteBuffer.remaining();
    this.d = (i + this.d);
    if (this.b != null)
    {
      if (i <= this.b.remaining())
      {
        this.b.put(paramByteBuffer);
        return i;
      }
      this.b.flip();
      this.a.add(this.b);
      this.b = null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(i);
    localByteBuffer.put(paramByteBuffer).rewind();
    this.a.add(localByteBuffer);
    return i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.ChunkedWritableByteChannel
 * JD-Core Version:    0.7.0.1
 */