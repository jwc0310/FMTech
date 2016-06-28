import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.os.Build.VERSION;
import android.util.Log;

final class ixi
  implements ixf
{
  private final ixm a;
  private final ConnectivityManager b;
  
  public ixi(Context paramContext)
  {
    this.a = ((ixm)mbb.a(paramContext, ixm.class));
    this.b = ((ConnectivityManager)paramContext.getSystemService("connectivity"));
    new ixl(this);
  }
  
  @TargetApi(14)
  private static boolean a(NetworkInfo paramNetworkInfo)
  {
    if (Log.isLoggable("NetworkCapability", 3))
    {
      String str = String.valueOf(paramNetworkInfo);
      new StringBuilder(16 + String.valueOf(str).length()).append("Active network: ").append(str);
    }
    boolean bool;
    if ((paramNetworkInfo != null) && (paramNetworkInfo.isConnected())) {
      bool = true;
    }
    while (Build.VERSION.SDK_INT >= 14) {
      if ((bool) && (paramNetworkInfo.getDetailedState() != NetworkInfo.DetailedState.BLOCKED))
      {
        return true;
        bool = false;
      }
      else
      {
        return false;
      }
    }
    return bool;
  }
  
  public final boolean a()
  {
    return a(this.b.getActiveNetworkInfo());
  }
  
  public final boolean b()
  {
    return a(this.b.getNetworkInfo(1));
  }
  
  public final boolean c()
  {
    return a(this.b.getNetworkInfo(1));
  }
  
  public final boolean d()
  {
    NetworkInfo localNetworkInfo = this.b.getNetworkInfo(0);
    boolean bool = false;
    if (localNetworkInfo != null) {
      bool = true;
    }
    return bool;
  }
  
  public final boolean e()
  {
    ConnectivityManager localConnectivityManager = this.b;
    return iv.a.a(localConnectivityManager);
  }
  
  public final boolean f()
  {
    NetworkInfo localNetworkInfo = this.b.getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isRoaming());
  }
  
  public final boolean g()
  {
    if (Build.VERSION.SDK_INT < 14) {
      return this.b.getBackgroundDataSetting();
    }
    NetworkInfo localNetworkInfo = this.b.getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isConnected());
  }
  
  public final boolean h()
  {
    NetworkInfo localNetworkInfo = this.b.getActiveNetworkInfo();
    if (localNetworkInfo == null) {}
    for (int i = -1;; i = localNetworkInfo.getType())
    {
      if (Log.isLoggable("NetworkCapability", 4)) {
        new StringBuilder(32).append("Active network type: ").append(i);
      }
      switch (i)
      {
      case 8: 
      default: 
        return true;
      }
    }
    return true;
    return false;
  }
  
  public final boolean i()
  {
    if (a(this.b.getNetworkInfo(1)))
    {
      ConnectivityManager localConnectivityManager = this.b;
      if (!iv.a.a(localConnectivityManager)) {}
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final int j()
  {
    return this.a.a();
  }
  
  public final int k()
  {
    return (int)this.a.c;
  }
  
  public final int l()
  {
    return this.a.b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixi
 * JD-Core Version:    0.7.0.1
 */