import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;

public final class dll
  implements Runnable
{
  public dll(EsService paramEsService, Context paramContext, int paramInt1, String paramString1, int paramInt2, String paramString2, byte[] paramArrayOfByte, Intent paramIntent) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      boolean bool = bqo.a(this.a, this.b, this.c, this.d, this.e, this.f);
      this.h.b(this.g, new dmx(bool), null);
      return;
    }
    catch (Exception localException)
    {
      this.h.b(this.g, new dmx(0, null, localException), null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dll
 * JD-Core Version:    0.7.0.1
 */