import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.notifications.service.GunsService;

public final class jca
  implements jdu
{
  public final void a(Intent paramIntent, Context paramContext)
  {
    int i = GunsService.a(paramIntent);
    if (i == -1) {
      return;
    }
    String[] arrayOfString = paramIntent.getStringArrayExtra("notification_keys");
    jah[] arrayOfjah = jdj.b(paramContext, i, arrayOfString);
    jae localjae = (jae)paramIntent.getSerializableExtra("notification_event_type");
    jbv.a(paramContext, i, arrayOfString, paramIntent.getStringExtra("view_id"));
    jbv.a(paramContext, i, arrayOfjah, localjae);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jca
 * JD-Core Version:    0.7.0.1
 */