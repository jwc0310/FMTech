import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;

public final class dln
  implements Runnable
{
  public dln(EsService paramEsService, Context paramContext, int paramInt, String paramString, boolean paramBoolean, Intent paramIntent) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      lmp.f(this.a, this.b, this.c, this.d);
      this.f.b(this.e, new dmx(), null);
      return;
    }
    catch (Exception localException)
    {
      this.f.b(this.e, new dmx(0, null, localException), null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dln
 * JD-Core Version:    0.7.0.1
 */