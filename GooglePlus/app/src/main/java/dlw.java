import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;
import java.io.IOException;

public final class dlw
  implements Runnable
{
  public dlw(EsService paramEsService, Context paramContext, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, byte[] paramArrayOfByte) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    EsService localEsService = this.g;
    Context localContext = this.a;
    int i = this.b;
    Intent localIntent = this.c;
    int j = this.d;
    int k = this.e;
    byte[] arrayOfByte = this.f;
    try
    {
      brg.a(localContext, i, arrayOfByte, brm.c, j, k);
      localEsService.b(localIntent, new dmx(), null);
      return;
    }
    catch (IOException localIOException)
    {
      localEsService.b(localIntent, new dmx(0, null, localIOException), null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlw
 * JD-Core Version:    0.7.0.1
 */