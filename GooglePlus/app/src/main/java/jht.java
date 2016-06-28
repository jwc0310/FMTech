import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class jht
  extends mab
{
  public static byte[] a(odr paramodr)
  {
    int i = 0;
    if (paramodr == null) {
      return new byte[0];
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      if (Log.isLoggable("DbRelatedLinks", 2))
      {
        String str = String.valueOf(Arrays.toString(paramodr.a));
        if (str.length() == 0) {
          break label129;
        }
        "RelatedLinks.link: ".concat(str);
      }
      for (;;)
      {
        localDataOutputStream.writeInt(paramodr.a.length);
        odq[] arrayOfodq = paramodr.a;
        int j = arrayOfodq.length;
        while (i < j)
        {
          odq localodq = arrayOfodq[i];
          a(localDataOutputStream, localodq.a);
          a(localDataOutputStream, localodq.b);
          a(localDataOutputStream, localodq.c);
          i++;
        }
        label129:
        new String("RelatedLinks.link: ");
      }
    }
    finally
    {
      localDataOutputStream.close();
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static odr c(byte[] paramArrayOfByte)
  {
    odr localodr;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      localodr = null;
    }
    for (;;)
    {
      return localodr;
      ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
      localodr = new odr();
      int i = localByteBuffer.getInt();
      localodr.a = new odq[i];
      for (int j = 0; j < i; j++)
      {
        odq localodq = new odq();
        localodq.a = d(localByteBuffer);
        localodq.b = d(localByteBuffer);
        localodq.c = d(localByteBuffer);
        localodr.a[j] = localodq;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jht
 * JD-Core Version:    0.7.0.1
 */