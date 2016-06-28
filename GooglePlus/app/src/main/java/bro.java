import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.service.EsService;

final class bro
  implements Runnable
{
  bro(Context paramContext, int paramInt) {}
  
  public final void run()
  {
    Context localContext = this.a;
    int i = this.b;
    Intent localIntent = EsService.e.a(localContext, EsService.class);
    localIntent.putExtra("op", 503);
    localIntent.putExtra("account_id", i);
    Integer.valueOf(EsService.a(localContext, localIntent));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bro
 * JD-Core Version:    0.7.0.1
 */