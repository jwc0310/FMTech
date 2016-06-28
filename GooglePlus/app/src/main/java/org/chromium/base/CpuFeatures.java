package org.chromium.base;

import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class CpuFeatures
{
  private static native int nativeGetCoreCount();
  
  private static native long nativeGetCpuFeatures();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.base.CpuFeatures
 * JD-Core Version:    0.7.0.1
 */