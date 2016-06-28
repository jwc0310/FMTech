import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.util.Base64;

public final class evq
  extends gk
{
  private static String a = "gcm.googleapis.com/refresh";
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent.setComponent(null);
    paramIntent.setPackage(paramContext.getPackageName());
    if (Build.VERSION.SDK_INT <= 18) {
      paramIntent.removeCategory(paramContext.getPackageName());
    }
    String str1 = paramIntent.getStringExtra("from");
    if (("com.google.android.c2dm.intent.REGISTRATION".equals(paramIntent.getAction())) || ("google.com/iid".equals(str1)) || (a.equals(str1))) {
      paramIntent.setAction("com.google.android.gms.iid.InstanceID");
    }
    String str2 = paramIntent.getStringExtra("gcm.rawData64");
    if (str2 != null)
    {
      paramIntent.putExtra("rawData", Base64.decode(str2, 0));
      paramIntent.removeExtra("gcm.rawData64");
    }
    if ("com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction())) {
      a(paramContext, paramIntent);
    }
    for (;;)
    {
      if (isOrderedBroadcast()) {
        setResultCode(-1);
      }
      return;
      a(paramContext, paramIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     evq
 * JD-Core Version:    0.7.0.1
 */