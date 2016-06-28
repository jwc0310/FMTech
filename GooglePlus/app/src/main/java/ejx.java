import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class ejx
{
  private int a;
  
  protected ejx(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length == 25) {}
    for (boolean bool = true;; bool = false)
    {
      efj.b(bool, "cert hash data has incorrect length");
      this.a = Arrays.hashCode(paramArrayOfByte);
      return;
    }
  }
  
  protected static byte[] a(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("ISO-8859-1");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError(localUnsupportedEncodingException);
    }
  }
  
  abstract byte[] a();
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof ejx))) {
      return false;
    }
    ejx localejx = (ejx)paramObject;
    return Arrays.equals(a(), localejx.a());
  }
  
  public int hashCode()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ejx
 * JD-Core Version:    0.7.0.1
 */