import android.content.Context;
import android.text.TextUtils;

final class hbb
  implements gji
{
  public final String a()
  {
    return "AutobackupAccountSettingsManager-AutoBackupAsAccountSettingMigration";
  }
  
  public final void a(Context paramContext, gje paramgje)
  {
    hbl localhbl = (hbl)mbb.a(paramContext, hbl.class);
    localhbl.a();
    if ((localhbl.a) && (TextUtils.equals(localhbl.b, paramgje.b("account_name")))) {}
    for (boolean bool = true;; bool = false)
    {
      gje localgje = paramgje.h("com.google.android.libraries.social.autobackup.AutobackupAccountSettingsManager");
      if (!localgje.a("auto_backup_enabled")) {
        localgje.c("auto_backup_enabled", bool);
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbb
 * JD-Core Version:    0.7.0.1
 */