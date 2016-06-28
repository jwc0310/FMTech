import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;

final class hzt
  implements fry
{
  hzt(Activity paramActivity) {}
  
  public final void a(frs paramfrs)
  {
    Activity localActivity = this.a;
    Uri.Builder localBuilder = hzr.a.buildUpon();
    try
    {
      str = localActivity.getPackageManager().getPackageInfo(localActivity.getPackageName(), 0).versionName;
      localBuilder.appendQueryParameter("version", str);
      Intent localIntent = new Intent("android.intent.action.VIEW", localBuilder.build());
      localIntent.addFlags(524288);
      localIntent.addCategory("android.intent.category.BROWSABLE");
      localActivity.startActivity(localIntent);
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        String str = "unknown";
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hzt
 * JD-Core Version:    0.7.0.1
 */