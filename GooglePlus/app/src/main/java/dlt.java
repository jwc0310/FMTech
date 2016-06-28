import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;

public final class dlt
  implements Runnable
{
  public dlt(EsService paramEsService, boolean paramBoolean, Context paramContext, int paramInt, Intent paramIntent) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      if (this.a) {}
      for (bsn localbsn = bsn.c;; localbsn = bsn.b)
      {
        bry.a(this.b, this.c, null, localbsn);
        this.e.b(this.d, new dmx(), null);
        return;
      }
      return;
    }
    catch (Exception localException)
    {
      this.e.b(this.d, new dmx(0, null, localException), null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlt
 * JD-Core Version:    0.7.0.1
 */