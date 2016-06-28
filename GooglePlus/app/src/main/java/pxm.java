import java.io.IOException;

public abstract class pxm
  implements pzd
{
  public final byte[] e()
  {
    try
    {
      byte[] arrayOfByte = new byte[a()];
      pxx localpxx = pxx.a(arrayOfByte);
      a(localpxx);
      localpxx.h();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", localIOException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pxm
 * JD-Core Version:    0.7.0.1
 */