import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;

public final class dlq
  implements Runnable
{
  public dlq(EsService paramEsService, Context paramContext, int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, Intent paramIntent) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    try
    {
      bln localbln = new bln(this.a, this.b, this.c, this.d, this.e, this.f, true);
      localbln.i();
      if (!localbln.n()) {}
      for (boolean bool = true;; bool = false)
      {
        dmu localdmu2 = new dmu(bool);
        localdmu2.a = this.d;
        localdmu2.b = this.c;
        this.h.b(this.g, localdmu2, null);
        return;
      }
      dmu localdmu1;
      return;
    }
    catch (Exception localException)
    {
      localdmu1 = new dmu(false);
      localdmu1.a = this.d;
      localdmu1.b = this.c;
      this.h.b(this.g, localdmu1, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlq
 * JD-Core Version:    0.7.0.1
 */