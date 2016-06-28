import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;

public final class dlj
  implements Runnable
{
  public dlj(EsService paramEsService, Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean1, boolean paramBoolean2, Intent paramIntent) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      kbw localkbw = bqo.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
      this.k.b(this.j, new dmx(localkbw), null);
      return;
    }
    catch (Exception localException)
    {
      this.k.b(this.j, new dmx(0, null, localException), null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlj
 * JD-Core Version:    0.7.0.1
 */