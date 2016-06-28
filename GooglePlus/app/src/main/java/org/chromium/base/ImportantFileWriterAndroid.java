package org.chromium.base;

import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class ImportantFileWriterAndroid
{
  private static native boolean nativeWriteFileAtomically(String paramString, byte[] paramArrayOfByte);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.base.ImportantFileWriterAndroid
 * JD-Core Version:    0.7.0.1
 */