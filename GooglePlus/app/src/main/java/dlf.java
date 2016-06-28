import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;

public final class dlf
  implements Runnable
{
  public dlf(EsService paramEsService, Context paramContext, int paramInt, Intent paramIntent) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      EsService.a(this.a, this.b, this.c);
      this.d.b(this.c, new dmx(), null);
      return;
    }
    catch (Exception localException)
    {
      this.d.b(this.c, new dmx(0, null, localException), null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlf
 * JD-Core Version:    0.7.0.1
 */