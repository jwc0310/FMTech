import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.plus.settings.GplusAboutSettingsActivity;

public final class doi
  implements gqh
{
  private int a = -1;
  
  public doi()
  {
    this(-1);
  }
  
  private doi(int paramInt) {}
  
  public final boolean a(Activity paramActivity)
  {
    if ("TRUE".equalsIgnoreCase(dun.d.a())) {
      return false;
    }
    Intent localIntent = new Intent(paramActivity, GplusAboutSettingsActivity.class);
    localIntent.putExtra("privacy_uri", "http://m.google.com/app/plus/serviceurl?type=privacy");
    localIntent.putExtra("terms_uri", "http://m.google.com/app/plus/serviceurl?type=tos");
    if (this.a >= 0) {
      paramActivity.startActivityForResult(localIntent, this.a);
    }
    for (;;)
    {
      return true;
      paramActivity.startActivity(localIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     doi
 * JD-Core Version:    0.7.0.1
 */