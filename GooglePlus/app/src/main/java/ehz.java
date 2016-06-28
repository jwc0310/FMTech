import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;

public final class ehz
  implements DialogInterface.OnClickListener
{
  private final Activity a;
  private final bk b;
  private final Intent c;
  private final int d;
  
  public ehz(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    this.a = paramActivity;
    this.b = null;
    this.c = paramIntent;
    this.d = paramInt;
  }
  
  public ehz(bk parambk, Intent paramIntent, int paramInt)
  {
    this.a = null;
    this.b = parambk;
    this.c = paramIntent;
    this.d = paramInt;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      if ((this.c != null) && (this.b != null)) {
        this.b.a(this.c, this.d);
      }
      for (;;)
      {
        paramDialogInterface.dismiss();
        return;
        if (this.c != null) {
          this.a.startActivityForResult(this.c, this.d);
        }
      }
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehz
 * JD-Core Version:    0.7.0.1
 */