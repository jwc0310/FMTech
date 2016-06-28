import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;

public final class dle
  implements Runnable
{
  public dle(EsService paramEsService, Intent paramIntent, Context paramContext, int paramInt) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      String str = this.a.getStringExtra("person_id");
      if (this.a.getBooleanExtra("refresh", false)) {
        brn.b(this.b, this.c, str);
      }
      for (;;)
      {
        this.d.b(this.a, new dmx(), null);
        return;
        brn.a(this.b, this.c, str, true);
      }
      return;
    }
    catch (Exception localException)
    {
      this.d.b(this.a, new dmx(0, null, localException), null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dle
 * JD-Core Version:    0.7.0.1
 */