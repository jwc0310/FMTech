import android.content.Intent;

public final class jeg
  implements icb
{
  public final void a(Intent paramIntent1, Intent paramIntent2)
  {
    paramIntent2.putExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", paramIntent1.getBooleanExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", false));
    paramIntent2.putExtra("com.google.android.libraries.social.notifications.notif_id", paramIntent1.getStringExtra("com.google.android.libraries.social.notifications.notif_id"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jeg
 * JD-Core Version:    0.7.0.1
 */