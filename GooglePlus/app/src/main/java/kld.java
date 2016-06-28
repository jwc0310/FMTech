import android.content.Context;
import java.io.IOException;

public final class kld
  implements iyn<klb>
{
  private final Context a;
  
  public kld(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private klb b(int paramInt, byte[] paramArrayOfByte)
  {
    kol localkol = new kol();
    try
    {
      qat.b(localkol, paramArrayOfByte, 0, paramArrayOfByte.length);
      return new klb(this.a, paramInt, localkol);
    }
    catch (qas localqas)
    {
      throw new IOException(localqas);
    }
  }
  
  public final String a()
  {
    return "reshare_network_request";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kld
 * JD-Core Version:    0.7.0.1
 */