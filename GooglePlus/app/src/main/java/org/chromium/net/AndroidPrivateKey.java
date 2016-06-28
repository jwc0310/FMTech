package org.chromium.net;

import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public abstract interface AndroidPrivateKey
{
  @CalledByNative
  public abstract AndroidKeyStore getKeyStore();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.AndroidPrivateKey
 * JD-Core Version:    0.7.0.1
 */