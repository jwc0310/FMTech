import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class mab
{
  public static void a(DataOutputStream paramDataOutputStream, String paramString)
  {
    if (paramString != null)
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      paramDataOutputStream.writeShort(arrayOfByte.length);
      paramDataOutputStream.write(arrayOfByte);
      return;
    }
    paramDataOutputStream.writeShort(0);
  }
  
  public static void a(DataOutputStream paramDataOutputStream, List<String> paramList)
  {
    paramDataOutputStream.writeInt(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      a(paramDataOutputStream, (String)localIterator.next());
    }
  }
  
  public static void a(DataOutputStream paramDataOutputStream, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      paramDataOutputStream.writeInt(0);
      return;
    }
    paramDataOutputStream.writeInt(paramArrayOfByte.length);
    paramDataOutputStream.write(paramArrayOfByte);
  }
  
  public static byte[] b(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getInt();
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public static byte[] b(List<String> paramList)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    if (paramList == null) {
      return null;
    }
    try
    {
      a(localDataOutputStream, paramList);
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      return arrayOfByte;
    }
    finally
    {
      localDataOutputStream.close();
    }
  }
  
  public static List<String> c(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getInt();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(d(paramByteBuffer));
    }
    return localArrayList;
  }
  
  public static String d(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort();
    if (i > 0)
    {
      byte[] arrayOfByte = new byte[i];
      paramByteBuffer.get(arrayOfByte);
      return e(arrayOfByte);
    }
    return null;
  }
  
  public static List<String> d(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getInt();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(d(localByteBuffer));
    }
    return localArrayList;
  }
  
  public static String e(byte[] paramArrayOfByte)
  {
    try
    {
      String str = new String(paramArrayOfByte, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mab
 * JD-Core Version:    0.7.0.1
 */