package com.google.android.webp;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import java.nio.ByteBuffer;

public class WebpDecoder
{
  private static final boolean a;
  
  static
  {
    System.loadLibrary("webp_android");
    int i = version();
    int j = i >> 16;
    int k = 0xFF & i >> 8;
    int m = i & 0xFF;
    new StringBuilder(64).append("Native WEBP decoder, version=").append(j).append(".").append(k).append(".").append(m);
    if (Build.VERSION.SDK_INT < 11) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public static boolean a(ByteBuffer paramByteBuffer, Bitmap paramBitmap)
  {
    if (!paramByteBuffer.isDirect()) {
      throw new IllegalArgumentException("Cannot pass non-direct bytebuffer");
    }
    return decodeInto(paramByteBuffer, paramByteBuffer.remaining(), paramBitmap, a);
  }
  
  private static native boolean decodeInto(ByteBuffer paramByteBuffer, int paramInt, Bitmap paramBitmap, boolean paramBoolean);
  
  public static native WebpDecoder.Config getConfig(ByteBuffer paramByteBuffer);
  
  public static native int version();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.webp.WebpDecoder
 * JD-Core Version:    0.7.0.1
 */