package org.chromium.net;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class NetStringUtil
{
  @CalledByNative
  private static String convertToUnicode(ByteBuffer paramByteBuffer, String paramString)
  {
    try
    {
      String str = Charset.forName(paramString).newDecoder().decode(paramByteBuffer).toString();
      return str;
    }
    catch (Exception localException) {}
    return null;
  }
  
  @CalledByNative
  private static String convertToUnicodeAndNormalize(ByteBuffer paramByteBuffer, String paramString)
  {
    String str = convertToUnicode(paramByteBuffer, paramString);
    if (str == null) {
      return null;
    }
    return Normalizer.normalize(str, Normalizer.Form.NFC);
  }
  
  @CalledByNative
  private static String convertToUnicodeWithSubstitutions(ByteBuffer paramByteBuffer, String paramString)
  {
    try
    {
      CharsetDecoder localCharsetDecoder = Charset.forName(paramString).newDecoder();
      localCharsetDecoder.onMalformedInput(CodingErrorAction.REPLACE);
      localCharsetDecoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
      localCharsetDecoder.replaceWith("�");
      String str = localCharsetDecoder.decode(paramByteBuffer).toString();
      return str;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.NetStringUtil
 * JD-Core Version:    0.7.0.1
 */