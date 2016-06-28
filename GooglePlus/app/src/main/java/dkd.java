import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

final class dkd
  implements gji
{
  dkd(dka paramdka) {}
  
  public final String a()
  {
    return "AllPhotosSyncManager-InitialMigration";
  }
  
  public final void a(Context paramContext, gje paramgje)
  {
    String str1 = paramgje.b("gaia_id");
    gje localgje = paramgje.h("AllPhotosSyncManager");
    String[] arrayOfString = { "local_media_inserted", "fetched_all_remote_photos", "received_tickle_since_last_sync", "synced_initial_max", "synced_server_max", "initial_sync_complete", "pressed_load_more" };
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a.a);
    for (int i = 0; i < 7; i++)
    {
      String str2 = arrayOfString[i];
      localgje.c(str2, localSharedPreferences.getBoolean(1 + String.valueOf(str2).length() + String.valueOf(str1).length() + str2 + ":" + str1, false));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkd
 * JD-Core Version:    0.7.0.1
 */