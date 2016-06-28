import java.io.IOException;
import java.nio.ByteBuffer;

public class eyk
{
  public volatile int b = -1;
  
  public static final void a(eyk parameyk, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      eyd localeyd = new eyd(paramArrayOfByte, 0, paramInt2);
      parameyk.a(localeyd);
      if (localeyd.a.remaining() != 0) {
        throw new IllegalStateException("Did not write as much data as expected.");
      }
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", localIOException);
    }
  }
  
  public int a()
  {
    return 0;
  }
  
  public void a(eyd parameyd) {}
  
  public eyk c()
  {
    return (eyk)super.clone();
  }
  
  public String toString()
  {
    return efj.a(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyk
 * JD-Core Version:    0.7.0.1
 */