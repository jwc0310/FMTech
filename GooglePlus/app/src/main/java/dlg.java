import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.apps.plus.service.EsService;
import java.io.IOException;

public final class dlg
  implements Runnable
{
  public dlg(EsService paramEsService, Intent paramIntent, Context paramContext, int paramInt) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    String str1 = this.a.getStringExtra("person_id");
    String str2 = this.a.getStringExtra("suggestion_id");
    String str3 = this.a.getStringExtra("aid");
    lnr locallnr = lnr.a(efj.a(this.b, this.c, str3));
    Context localContext;
    int i;
    if (locallnr.a(str1, str2))
    {
      localContext = this.b;
      i = this.c;
    }
    try
    {
      efj.a(localContext, i, str3, lnr.a(locallnr));
      label87:
      this.d.b(this.a, new dmx(), null);
      return;
    }
    catch (IOException localIOException)
    {
      break label87;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlg
 * JD-Core Version:    0.7.0.1
 */