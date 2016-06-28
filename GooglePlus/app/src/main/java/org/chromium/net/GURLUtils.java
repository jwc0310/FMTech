package org.chromium.net;

import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public final class GURLUtils
{
  private static native String nativeGetOrigin(String paramString);
  
  private static native String nativeGetScheme(String paramString);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.GURLUtils
 * JD-Core Version:    0.7.0.1
 */