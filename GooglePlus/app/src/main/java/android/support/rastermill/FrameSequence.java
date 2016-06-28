package android.support.rastermill;

import android.graphics.Bitmap;
import eez;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class FrameSequence
{
  public final int a;
  public final int b;
  public final boolean c;
  public final int d;
  public final int e;
  private final long f;
  
  static
  {
    System.loadLibrary("framesequence");
  }
  
  private FrameSequence(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4)
  {
    this.f = paramLong;
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramBoolean;
    this.d = paramInt3;
    this.e = paramInt4;
  }
  
  public static FrameSequence a(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer == null) {
      throw new IllegalArgumentException();
    }
    if (!paramByteBuffer.isDirect())
    {
      if (paramByteBuffer.hasArray())
      {
        byte[] arrayOfByte = paramByteBuffer.array();
        int i = paramByteBuffer.position();
        int j = paramByteBuffer.remaining();
        if (arrayOfByte == null) {
          throw new IllegalArgumentException();
        }
        if ((i < 0) || (j < 0) || (i + j > arrayOfByte.length)) {
          throw new IllegalArgumentException("invalid offset/length parameters");
        }
        return nativeDecodeByteArray(arrayOfByte, i, j);
      }
      throw new IllegalArgumentException("Cannot have non-direct ByteBuffer with no byte array");
    }
    return nativeDecodeByteBuffer(paramByteBuffer, paramByteBuffer.position(), paramByteBuffer.remaining());
  }
  
  private static native long nativeCreateState(long paramLong);
  
  private static native FrameSequence nativeDecodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  private static native FrameSequence nativeDecodeByteBuffer(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2);
  
  private static native FrameSequence nativeDecodeStream(InputStream paramInputStream, byte[] paramArrayOfByte);
  
  private static native void nativeDestroyFrameSequence(long paramLong);
  
  private static native void nativeDestroyState(long paramLong);
  
  private static native long nativeGetFrame(long paramLong, int paramInt1, Bitmap paramBitmap, int paramInt2);
  
  public final eez a()
  {
    if (this.f == 0L) {
      throw new IllegalStateException("attempted to use incorrectly built FrameSequence");
    }
    long l = nativeCreateState(this.f);
    if (l == 0L) {
      return null;
    }
    return new eez(l);
  }
  
  protected void finalize()
  {
    try
    {
      if (this.f != 0L) {
        nativeDestroyFrameSequence(this.f);
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.rastermill.FrameSequence
 * JD-Core Version:    0.7.0.1
 */