import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.apps.plus.service.EsService;
import java.io.IOException;
import java.util.ArrayList;

public final class dlh
  implements Runnable
{
  public dlh(EsService paramEsService, Intent paramIntent, Context paramContext, int paramInt) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    String str1 = this.a.getStringExtra("square_id");
    String str2 = this.a.getStringExtra("suggestion_id");
    String str3 = this.a.getStringExtra("aid");
    lnu locallnu = lnu.a(efj.a(this.b, this.c, str3));
    int i = locallnu.a.size();
    int j = 0;
    for (;;)
    {
      int k;
      Context localContext;
      int m;
      if (j < i)
      {
        lnt locallnt = (lnt)locallnu.a.get(j);
        if ((TextUtils.equals(locallnt.a, str1)) && (TextUtils.equals(locallnt.g, str2)))
        {
          locallnt.h = true;
          k = 1;
          if (k != 0)
          {
            localContext = this.b;
            m = this.c;
          }
        }
      }
      try
      {
        efj.a(localContext, m, str3, lnu.a(locallnu));
        label150:
        this.d.b(this.a, new dmx(), null);
        return;
        j++;
        continue;
        k = 0;
      }
      catch (IOException localIOException)
      {
        break label150;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlh
 * JD-Core Version:    0.7.0.1
 */