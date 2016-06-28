import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;

public final class dlv
  implements Runnable
{
  public dlv(EsService paramEsService, Context paramContext, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, byte[] paramArrayOfByte, boolean paramBoolean) {}
  
  public final void run()
  {
    boolean bool1 = true;
    Process.setThreadPriority(10);
    localEsService = this.h;
    Context localContext = this.a;
    int i = this.b;
    localIntent = this.c;
    int j = this.d;
    int k = this.e;
    byte[] arrayOfByte = this.f;
    boolean bool2 = this.g;
    localkck = new kck();
    localkck.n = bool1;
    localkck.a("Notification sync");
    if (!bool2) {}
    for (;;)
    {
      try
      {
        brg.a(localContext, i, localkck, null, brm.c, j, k, arrayOfByte, bool1);
        localEsService.b(localIntent, new dmx(), null);
        return;
      }
      catch (Exception localException)
      {
        localEsService.b(localIntent, new dmx(0, null, localException), null);
        return;
      }
      finally
      {
        localkck.e();
      }
      bool1 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlv
 * JD-Core Version:    0.7.0.1
 */