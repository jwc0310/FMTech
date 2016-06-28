import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.notifications.service.GunsService;

public final class jbo
  implements jdu
{
  private static final String a = jdr.a("SelectedIntentHandler");
  
  public final void a(Intent paramIntent, Context paramContext)
  {
    int i = GunsService.a(paramIntent);
    if (i == -1)
    {
      jdr.b(a, "Invalid account ID", new IllegalArgumentException());
      return;
    }
    String[] arrayOfString = paramIntent.getStringArrayExtra("notification_keys");
    jae localjae = (jae)paramIntent.getSerializableExtra("notification_event_type");
    if (!paramIntent.hasExtra("from_system_tray")) {
      jdr.b(a, "Extra not set: EXTRA_FROM_SYSTEM_TRAY", new IllegalArgumentException());
    }
    boolean bool = paramIntent.getBooleanExtra("from_system_tray", true);
    jah[] arrayOfjah = jdj.b(paramContext, i, arrayOfString);
    int j;
    jay localjay;
    if (arrayOfString.length == 1)
    {
      j = 2;
      localjay = (jay)mbb.b(paramContext, jay.class);
      if (localjay != null) {
        if (!bool) {
          break label161;
        }
      }
    }
    label161:
    for (jaz localjaz = jaz.a;; localjaz = jaz.b)
    {
      localjay.a(i, arrayOfjah, localjaz);
      jbv.a(paramContext, i, arrayOfString, j);
      jbv.a(paramContext, i, arrayOfjah, localjae);
      return;
      j = 4;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jbo
 * JD-Core Version:    0.7.0.1
 */