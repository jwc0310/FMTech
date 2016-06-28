import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class iw
  implements ix
{
  public final boolean a(ConnectivityManager paramConnectivityManager)
  {
    NetworkInfo localNetworkInfo = paramConnectivityManager.getActiveNetworkInfo();
    if (localNetworkInfo == null) {
      return true;
    }
    switch (localNetworkInfo.getType())
    {
    case 0: 
    default: 
      return true;
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iw
 * JD-Core Version:    0.7.0.1
 */