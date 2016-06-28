import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class jqt
  extends mab
{
  public final String a;
  public final String b;
  public final okn c;
  
  public jqt(String paramString1, String paramString2, okn paramokn)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramokn;
  }
  
  public static jqt a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    String str1 = d(localByteBuffer);
    String str2 = d(localByteBuffer);
    try
    {
      byte[] arrayOfByte = b(localByteBuffer);
      okn localokn = (okn)qat.b(new okn(), arrayOfByte, 0, arrayOfByte.length);
      return new jqt(str1, str2, localokn);
    }
    catch (qas localqas)
    {
      Log.e("DbCollectionData", "Unable to parse Tile from byte array.", localqas);
    }
    return null;
  }
  
  public static byte[] a(jqt paramjqt)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(64);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      a(localDataOutputStream, paramjqt.a);
      a(localDataOutputStream, paramjqt.b);
      if (paramjqt.c == null) {}
      byte[] arrayOfByte2;
      for (Object localObject = null;; localObject = arrayOfByte2)
      {
        a(localDataOutputStream, (byte[])localObject);
        byte[] arrayOfByte1 = localByteArrayOutputStream.toByteArray();
        localDataOutputStream.close();
        return arrayOfByte1;
        arrayOfByte2 = qat.a(paramjqt.c);
      }
      return null;
    }
    catch (IOException localIOException)
    {
      Log.e("DbCollectionData", "Unable to serialize collection data.", localIOException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jqt
 * JD-Core Version:    0.7.0.1
 */