import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;

public final class dlm
  implements Runnable
{
  public dlm(EsService paramEsService, Intent paramIntent, Context paramContext, int paramInt) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      bgp.b(this.d, this.a.getIntExtra("account_id", -1), true);
      dkq.a(this.b, this.c);
      this.d.b(this.a, new dmx(), null);
      return;
    }
    catch (Exception localException)
    {
      this.d.b(this.a, new dmx(0, null, localException), null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlm
 * JD-Core Version:    0.7.0.1
 */