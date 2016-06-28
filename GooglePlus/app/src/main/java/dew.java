import android.content.Context;
import android.content.Intent;
import com.google.android.apps.photos.phone.PhotosHomeActivity;
import com.google.android.apps.plus.phone.HostAllFoldersTileActivity;
import com.google.android.apps.plus.phone.HostStreamAllFoldersTileActivity;
import com.google.android.apps.plus.settings.InstantUploadSettingsLauncherActivity;

public final class dew
  implements hcv
{
  public final Intent a(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, InstantUploadSettingsLauncherActivity.class);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public final Intent b(Context paramContext, int paramInt)
  {
    dbr localdbr = new dbr(paramContext, HostStreamAllFoldersTileActivity.class, paramInt);
    localdbr.a.setClass(paramContext, HostAllFoldersTileActivity.class);
    return localdbr.a();
  }
  
  public final Intent c(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, PhotosHomeActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    if (paramInt != -1) {
      localIntent.putExtra("account_id", paramInt);
    }
    localIntent.putExtra("tabs", 6);
    localIntent.addFlags(335544320);
    localIntent.setPackage(paramContext.getPackageName());
    return localIntent;
  }
  
  public final Intent d(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, PhotosHomeActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    if (paramInt != -1) {
      localIntent.putExtra("account_id", paramInt);
    }
    localIntent.putExtra("tabs", 6);
    localIntent.addFlags(335544320);
    localIntent.setPackage(paramContext.getPackageName());
    localIntent.putExtra("auto_backup_reminder_type_key", "auto_backup_off_reminder");
    localIntent.putExtra("auto_backup_account_id", paramInt);
    return localIntent;
  }
  
  public final Intent e(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, PhotosHomeActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    if (paramInt != -1) {
      localIntent.putExtra("account_id", paramInt);
    }
    localIntent.putExtra("tabs", 6);
    localIntent.addFlags(335544320);
    localIntent.setPackage(paramContext.getPackageName());
    localIntent.putExtra("auto_backup_reminder_type_key", "auto_backup_general_reminder");
    localIntent.putExtra("auto_backup_account_id", paramInt);
    return localIntent;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dew
 * JD-Core Version:    0.7.0.1
 */