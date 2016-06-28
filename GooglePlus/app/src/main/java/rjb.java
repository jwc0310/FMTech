import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import org.chromium.base.ThreadUtils;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

@SuppressLint({"NewApi"})
public final class rjb
  extends ConnectivityManager.NetworkCallback
{
  public rjb(NetworkChangeNotifierAutoDetect paramNetworkChangeNotifierAutoDetect) {}
  
  public final void onAvailable(Network paramNetwork)
  {
    rjc localrjc = new rjc(this, Integer.parseInt(paramNetwork.toString()), NetworkChangeNotifierAutoDetect.a(rja.a(this.a.e.a.getNetworkInfo(paramNetwork))));
    ThreadUtils.a().post(localrjc);
  }
  
  public final void onCapabilitiesChanged(Network paramNetwork, NetworkCapabilities paramNetworkCapabilities)
  {
    rjd localrjd = new rjd(this, Integer.parseInt(paramNetwork.toString()), NetworkChangeNotifierAutoDetect.a(rja.a(this.a.e.a.getNetworkInfo(paramNetwork))));
    ThreadUtils.a().post(localrjd);
  }
  
  public final void onLosing(Network paramNetwork, int paramInt)
  {
    rje localrje = new rje(this, Integer.parseInt(paramNetwork.toString()));
    ThreadUtils.a().post(localrje);
  }
  
  public final void onLost(Network paramNetwork)
  {
    rjf localrjf = new rjf(this, Integer.parseInt(paramNetwork.toString()));
    ThreadUtils.a().post(localrjf);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rjb
 * JD-Core Version:    0.7.0.1
 */