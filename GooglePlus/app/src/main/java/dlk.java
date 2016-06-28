import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;

public final class dlk
  implements Runnable
{
  public dlk(EsService paramEsService, Context paramContext, int paramInt, boolean paramBoolean, Intent paramIntent) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    EsService localEsService = this.e;
    Context localContext = this.a;
    int i = this.b;
    boolean bool = this.c;
    Intent localIntent = this.d;
    kck localkck = new kck();
    localkck.a("People sync");
    try
    {
      if (((giz)mbb.a(localContext, giz.class)).a(i).c("is_google_plus")) {
        brn.a(localContext, i, localkck, bool);
      }
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
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlk
 * JD-Core Version:    0.7.0.1
 */