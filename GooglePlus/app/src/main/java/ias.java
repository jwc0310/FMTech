import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public final class ias
{
  private static final MessageDigest b;
  private static final int c;
  public final byte[] a;
  
  static
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("md5");
      b = localMessageDigest;
      c = localMessageDigest.getDigestLength();
      return;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new IllegalStateException(localNoSuchAlgorithmException);
    }
  }
  
  public ias(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length != c)) {
      throw new IllegalArgumentException();
    }
    this.a = paramArrayOfByte;
  }
  
  public static ias a(InputStream paramInputStream)
  {
    try
    {
      localDigestInputStream = new DigestInputStream(paramInputStream, b);
      byte[] arrayOfByte;
      int i;
      if (localDigestInputStream == null) {
        break label60;
      }
    }
    finally
    {
      try
      {
        arrayOfByte = new byte[8192];
        do
        {
          i = localDigestInputStream.read(arrayOfByte);
        } while (i >= 0);
        localDigestInputStream.close();
        return new ias(localDigestInputStream.getMessageDigest().digest());
      }
      finally
      {
        DigestInputStream localDigestInputStream;
        break label52;
      }
      localObject1 = finally;
      localDigestInputStream = null;
    }
    label52:
    localDigestInputStream.close();
    label60:
    throw localObject1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ias)) {
      return false;
    }
    ias localias = (ias)paramObject;
    return Arrays.equals(this.a, localias.a);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ias
 * JD-Core Version:    0.7.0.1
 */