import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.List;

class dqs
{
  String a;
  
  public void a(Context paramContext)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(((iev)mbb.a(paramContext, iev.class)).a()).buildUpon().appendPath("downgrade").appendQueryParameter("gtuid", this.a).build());
    if (paramContext.getPackageManager().queryIntentActivities(localIntent, 0).size() > 0) {
      paramContext.startActivity(localIntent);
    }
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dqs
 * JD-Core Version:    0.7.0.1
 */