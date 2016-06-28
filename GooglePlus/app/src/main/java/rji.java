import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;

public final class rji
{
  public final Context a;
  public final WifiManager b;
  public final boolean c;
  
  rji()
  {
    this.a = null;
    this.b = null;
    this.c = false;
  }
  
  public rji(Context paramContext)
  {
    this.a = paramContext;
    boolean bool;
    if (this.a.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", this.a.getPackageName()) == 0)
    {
      bool = true;
      this.c = bool;
      if (!this.c) {
        break label69;
      }
    }
    label69:
    for (WifiManager localWifiManager = (WifiManager)this.a.getSystemService("wifi");; localWifiManager = null)
    {
      this.b = localWifiManager;
      return;
      bool = false;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rji
 * JD-Core Version:    0.7.0.1
 */