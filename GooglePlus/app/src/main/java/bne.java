import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.service.EsService;
import java.util.List;

final class bne
  implements Runnable
{
  bne(bnd parambnd, long paramLong, List paramList) {}
  
  public final void run()
  {
    bnd localbnd = this.c;
    efj.e(localbnd.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = localbnd.e;
    int i = this.c.a;
    long l = this.a;
    String[] arrayOfString = (String[])this.b.toArray(new String[this.b.size()]);
    Intent localIntent = EsService.e.a(localContext, EsService.class);
    localIntent.putExtra("op", 25);
    localIntent.putExtra("account_id", i);
    localIntent.putExtra("activity_id_list", arrayOfString);
    localIntent.putExtra("timestamp", l);
    localIntent.putExtra("mark_operation", 2);
    Integer.valueOf(EsService.a(localContext, localIntent));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bne
 * JD-Core Version:    0.7.0.1
 */