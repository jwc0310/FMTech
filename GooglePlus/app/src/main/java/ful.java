import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.List;

public class ful
{
  public final evt a;
  
  public ful(Activity paramActivity)
  {
    this.a = new evt(paramActivity);
  }
  
  public void a(Intent paramIntent)
  {
    evt localevt = this.a;
    if ((!paramIntent.getAction().equals("com.google.android.gms.googlehelp.HELP")) || (!paramIntent.hasExtra("EXTRA_GOOGLE_HELP"))) {
      throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
    }
    int i = eer.a(localevt.a);
    if (i == 0)
    {
      ewm.a(localevt.b, new evu(localevt, paramIntent));
      return;
    }
    GoogleHelp localGoogleHelp = (GoogleHelp)paramIntent.getParcelableExtra("EXTRA_GOOGLE_HELP");
    Intent localIntent = new Intent("android.intent.action.VIEW").setData(localGoogleHelp.q);
    if (i != 7)
    {
      if (localevt.a.getPackageManager().queryIntentActivities(localIntent, 0).size() > 0) {}
      for (int j = 1; j != 0; j = 0)
      {
        localevt.a.startActivity(localIntent);
        return;
      }
    }
    eer.a(i, localevt.a, 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ful
 * JD-Core Version:    0.7.0.1
 */