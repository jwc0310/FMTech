package org.chromium.base.metrics;

import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class RecordUserAction
{
  private static native void nativeRecordUserAction(String paramString);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.base.metrics.RecordUserAction
 * JD-Core Version:    0.7.0.1
 */