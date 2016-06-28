import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

public final class rja
{
  public final ConnectivityManager a;
  
  rja()
  {
    this.a = null;
  }
  
  public rja(Context paramContext)
  {
    this.a = ((ConnectivityManager)paramContext.getSystemService("connectivity"));
  }
  
  public static rjh a(NetworkInfo paramNetworkInfo)
  {
    if ((paramNetworkInfo == null) || (!paramNetworkInfo.isConnected())) {
      return new rjh(false, -1, -1);
    }
    return new rjh(true, paramNetworkInfo.getType(), paramNetworkInfo.getSubtype());
  }
  
  @SuppressLint({"NewApi"})
  public final boolean a(Network paramNetwork)
  {
    NetworkCapabilities localNetworkCapabilities = this.a.getNetworkCapabilities(paramNetwork);
    return (localNetworkCapabilities != null) && (localNetworkCapabilities.hasCapability(12));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rja
 * JD-Core Version:    0.7.0.1
 */