import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.plus.settings.PhotosAboutSettingsActivity;

public final class dqg
  implements gqh
{
  private int a = -1;
  
  public dqg()
  {
    this(-1);
  }
  
  private dqg(int paramInt) {}
  
  public final boolean a(Activity paramActivity)
  {
    if (!"TRUE".equalsIgnoreCase(dun.d.a()))
    {
      Intent localIntent = new Intent(paramActivity, PhotosAboutSettingsActivity.class);
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
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dqg
 * JD-Core Version:    0.7.0.1
 */