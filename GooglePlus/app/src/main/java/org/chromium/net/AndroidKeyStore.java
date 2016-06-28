package org.chromium.net;

import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public abstract interface AndroidKeyStore
{
  @CalledByNative
  public abstract byte[] getECKeyOrder(AndroidPrivateKey paramAndroidPrivateKey);
  
  @CalledByNative
  public abstract Object getOpenSSLEngineForPrivateKey(AndroidPrivateKey paramAndroidPrivateKey);
  
  @CalledByNative
  public abstract long getOpenSSLHandleForPrivateKey(AndroidPrivateKey paramAndroidPrivateKey);
  
  @CalledByNative
  public abstract int getPrivateKeyType(AndroidPrivateKey paramAndroidPrivateKey);
  
  @CalledByNative
  public abstract byte[] getRSAKeyModulus(AndroidPrivateKey paramAndroidPrivateKey);
  
  @CalledByNative
  public abstract byte[] rawSignDigestWithPrivateKey(AndroidPrivateKey paramAndroidPrivateKey, byte[] paramArrayOfByte);
  
  @CalledByNative
  public abstract void releaseKey(AndroidPrivateKey paramAndroidPrivateKey);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.AndroidKeyStore
 * JD-Core Version:    0.7.0.1
 */