import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class hwx
{
  static boolean a = false;
  
  public static void a(Context paramContext, bw parambw)
  {
    hww localhww1 = new hww(paramContext);
    hww localhww2;
    hwz localhwz;
    if ((localhww1.a.getSharedPreferences("es-app-upgrade-preferences", 0).getBoolean(localhww1.a(".app_upgrade.show"), false)) && (!a))
    {
      localhww2 = new hww(paramContext);
      if (!"required".equals(localhww2.a.getSharedPreferences("es-app-upgrade-preferences", 0).getString(localhww2.a(".app_upgrade.status"), null))) {
        break label144;
      }
      localhwz = hwz.a(paramContext.getString(efj.LD), paramContext.getString(efj.LE), paramContext.getString(efj.LF), null);
      localhwz.b(false);
    }
    for (;;)
    {
      if (localhwz != null) {
        localhwz.ab = new hwy(parambw, paramContext);
      }
      try
      {
        localhwz.a(parambw, "app_upgrade");
        a = true;
        return;
        label144:
        boolean bool = localhww2.a();
        localhwz = null;
        if (!bool) {
          continue;
        }
        localhwz = hwz.a(paramContext.getString(efj.LB), paramContext.getString(efj.LC), paramContext.getString(efj.LF), paramContext.getString(efj.LA));
        localhwz.b(true);
        SharedPreferences.Editor localEditor = localhww2.a.getSharedPreferences("es-app-upgrade-preferences", 0).edit();
        localEditor.putLong(localhww2.a(".app_upgrade.timestamp_user"), System.currentTimeMillis());
        if (localhww2.a()) {
          localEditor.putBoolean(localhww2.a(".app_upgrade.show"), false);
        }
        localEditor.apply();
      }
      catch (Exception localException)
      {
        for (;;)
        {
          String str = String.valueOf(localException);
          new StringBuilder(41 + String.valueOf(str).length()).append("AlertFragmentDialog.show threw exception ").append(str);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwx
 * JD-Core Version:    0.7.0.1
 */