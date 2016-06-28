import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;

public final class dli
  implements Runnable
{
  public dli(EsService paramEsService, Context paramContext, int paramInt, String paramString1, String paramString2, Intent paramIntent) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      boolean bool = bqo.a(this.a, this.b, this.c, this.d);
      this.f.b(this.e, new dmx(bool), null);
      return;
    }
    catch (Exception localException)
    {
      this.f.b(this.e, new dmx(0, null, localException), null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dli
 * JD-Core Version:    0.7.0.1
 */