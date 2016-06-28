import android.content.Context;
import java.io.IOException;

public final class kkm
  implements iyn<kkg>
{
  private Context a;
  
  public kkm(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private final kkg b(int paramInt, byte[] paramArrayOfByte)
  {
    koj localkoj = new koj();
    try
    {
      qat.b(localkoj, paramArrayOfByte, 0, paramArrayOfByte.length);
      return new kkg(this.a, paramInt, localkoj);
    }
    catch (qas localqas)
    {
      throw new IOException(localqas);
    }
  }
  
  public final String a()
  {
    return "network_post_request_handle";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkm
 * JD-Core Version:    0.7.0.1
 */