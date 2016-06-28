import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;

public class ih
{
  public final Intent a = new Intent("android.intent.action.VIEW");
  public ArrayList<Bundle> b = null;
  public Bundle c = null;
  
  public ih()
  {
    this(null);
  }
  
  public ih(ub paramub)
  {
    if (paramub != null) {
      this.a.setPackage(paramub.e().getPackageName());
    }
    Bundle localBundle = new Bundle();
    IBinder localIBinder = null;
    if (paramub == null)
    {
      if (Build.VERSION.SDK_INT < 18) {
        break label93;
      }
      localBundle.putBinder("android.support.customtabs.extra.SESSION", localIBinder);
    }
    for (;;)
    {
      this.a.putExtras(localBundle);
      return;
      localIBinder = paramub.d();
      break;
      label93:
      aau.a(localBundle, "android.support.customtabs.extra.SESSION", localIBinder);
    }
  }
  
  public efj a()
  {
    return new efj(this.a, this.c);
  }
  
  public ih a(int paramInt)
  {
    this.a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", paramInt);
    return this;
  }
  
  public ih a(Context paramContext, int paramInt1, int paramInt2)
  {
    this.c = ActivityOptions.makeCustomAnimation(paramContext, paramInt1, paramInt2).toBundle();
    return this;
  }
  
  public ih a(Bitmap paramBitmap)
  {
    this.a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", paramBitmap);
    return this;
  }
  
  public ih a(Bitmap paramBitmap, String paramString, PendingIntent paramPendingIntent)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("android.support.customtabs.customaction.ICON", paramBitmap);
    localBundle.putString("android.support.customtabs.customaction.DESCRIPTION", paramString);
    localBundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", paramPendingIntent);
    this.a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", localBundle);
    return this;
  }
  
  public ih a(boolean paramBoolean)
  {
    this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ih
 * JD-Core Version:    0.7.0.1
 */