import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.plus.permissions.NoPermissionsActivity;

public final class cxh
  implements View.OnClickListener
{
  public cxh(NoPermissionsActivity paramNoPermissionsActivity) {}
  
  public final void onClick(View paramView)
  {
    NoPermissionsActivity localNoPermissionsActivity = this.a;
    Intent localIntent = new Intent();
    localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
    localIntent.addCategory("android.intent.category.DEFAULT");
    String str1 = String.valueOf(localNoPermissionsActivity.getPackageName());
    if (str1.length() != 0) {}
    for (String str2 = "package:".concat(str1);; str2 = new String("package:"))
    {
      localIntent.setData(Uri.parse(str2));
      localNoPermissionsActivity.startActivity(localIntent);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxh
 * JD-Core Version:    0.7.0.1
 */