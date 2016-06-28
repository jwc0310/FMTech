import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public final class fws
  implements fxb
{
  public final void a(Context paramContext)
  {
    Intent localIntent = new Intent("com.google.android.gms.location.settings.GOOGLE_LOCATION_SETTINGS");
    localIntent.setFlags(268435456);
    localIntent.setPackage("com.google.android.gms");
    try
    {
      paramContext.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.e("GCoreLocationSettings", "Problem while starting settings activity" + localIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fws
 * JD-Core Version:    0.7.0.1
 */