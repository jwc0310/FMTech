import java.io.IOException;

public final class kmx
  implements kmw<kog>
{
  public final kog a(byte[] paramArrayOfByte)
  {
    kog localkog = new kog();
    try
    {
      qat.b(localkog, paramArrayOfByte, 0, paramArrayOfByte.length);
      return localkog;
    }
    catch (qas localqas)
    {
      throw new IOException(localqas);
    }
  }
  
  public final byte[] a(kog paramkog)
  {
    return qat.a(paramkog);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kmx
 * JD-Core Version:    0.7.0.1
 */