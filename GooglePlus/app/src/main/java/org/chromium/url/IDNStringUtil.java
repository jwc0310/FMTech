package org.chromium.url;

import java.net.IDN;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class IDNStringUtil
{
  @CalledByNative
  private static String idnToASCII(String paramString)
  {
    try
    {
      String str = IDN.toASCII(paramString, 2);
      return str;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.url.IDNStringUtil
 * JD-Core Version:    0.7.0.1
 */