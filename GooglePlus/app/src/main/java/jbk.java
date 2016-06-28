import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.notifications.service.GunsService;

public final class jbk
  implements jab
{
  private Context a;
  
  public jbk(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(int paramInt, String paramString)
  {
    Intent localIntent = new Intent(this.a, GunsService.class);
    localIntent.setAction("com.google.android.libraries.social.notifications.impl.ACTOR_SELECTED");
    localIntent.putExtra("notification_keys", new String[] { paramString });
    localIntent.putExtra("account_id", paramInt);
    this.a.startService(localIntent);
  }
  
  public final void b(int paramInt, String paramString)
  {
    Intent localIntent = new Intent(this.a, GunsService.class);
    localIntent.setAction("com.google.android.libraries.social.notifications.impl.NOTIFICATION_SELECTED");
    localIntent.putExtra("notification_keys", new String[] { paramString });
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("from_system_tray", false);
    this.a.startService(localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jbk
 * JD-Core Version:    0.7.0.1
 */