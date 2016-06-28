package org.chromium.net;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.NetworkRequest;
import android.net.NetworkRequest.Builder;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import org.chromium.base.ThreadUtils;
import rja;
import rjb;
import rjg;
import rjh;
import rji;

public class NetworkChangeNotifierAutoDetect
  extends BroadcastReceiver
{
  final rjg a;
  public final NetworkChangeNotifierAutoDetect.Observer b;
  final Context c;
  final NetworkChangeNotifierAutoDetect.RegistrationPolicy d;
  public rja e;
  final ConnectivityManager.NetworkCallback f;
  final NetworkRequest g;
  boolean h;
  private rji i;
  private int j;
  private String k;
  private double l;
  
  @SuppressLint({"NewApi"})
  public NetworkChangeNotifierAutoDetect(NetworkChangeNotifierAutoDetect.Observer paramObserver, Context paramContext, NetworkChangeNotifierAutoDetect.RegistrationPolicy paramRegistrationPolicy)
  {
    ThreadUtils.b();
    this.b = paramObserver;
    this.c = paramContext.getApplicationContext();
    this.e = new rja(paramContext);
    this.i = new rji(paramContext);
    if (Build.VERSION.SDK_INT >= 21) {
      this.f = new rjb(this);
    }
    for (this.g = new NetworkRequest.Builder().addCapability(12).build();; this.g = null)
    {
      rjh localrjh = rja.a(this.e.a.getActiveNetworkInfo());
      this.j = a(localrjh);
      this.k = e(localrjh);
      this.l = b(localrjh);
      this.a = new rjg(this.i.c);
      this.d = paramRegistrationPolicy;
      this.d.a(this);
      return;
      this.f = null;
    }
  }
  
  public static int a(rjh paramrjh)
  {
    int m = 5;
    if (!paramrjh.a)
    {
      m = 6;
      return m;
    }
    switch (paramrjh.b)
    {
    case 6: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 8: 
    default: 
      return 0;
    case 9: 
      return 1;
    case 1: 
      return 2;
    case 7: 
      return 7;
    }
    switch (paramrjh.c)
    {
    case 13: 
    default: 
      return 0;
    case 1: 
    case 2: 
    case 4: 
    case 7: 
    case 11: 
      return 3;
    }
    return 4;
  }
  
  private final String e(rjh paramrjh)
  {
    String str;
    if (a(paramrjh) != 2) {
      str = "";
    }
    do
    {
      return str;
      Intent localIntent = this.i.a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
      if (localIntent == null) {
        break;
      }
      WifiInfo localWifiInfo = (WifiInfo)localIntent.getParcelableExtra("wifiInfo");
      if (localWifiInfo == null) {
        break;
      }
      str = localWifiInfo.getSSID();
    } while (str != null);
    return "";
  }
  
  public final void a()
  {
    if (!this.h) {}
    do
    {
      return;
      this.c.unregisterReceiver(this);
      this.h = false;
    } while (this.f == null);
    rja localrja = this.e;
    ConnectivityManager.NetworkCallback localNetworkCallback = this.f;
    localrja.a.unregisterNetworkCallback(localNetworkCallback);
  }
  
  public final double b(rjh paramrjh)
  {
    int m = 30;
    if (a(paramrjh) == 2)
    {
      rji localrji = this.i;
      int n;
      if ((!localrji.c) || (localrji.b == null)) {
        n = -1;
      }
      while (n != -1)
      {
        return n;
        WifiInfo localWifiInfo = localrji.b.getConnectionInfo();
        if (localWifiInfo == null) {
          n = -1;
        } else {
          n = localWifiInfo.getLinkSpeed();
        }
      }
    }
    if (!paramrjh.a) {
      m = 31;
    }
    for (;;)
    {
      return NetworkChangeNotifier.a(m);
      switch (paramrjh.b)
      {
      case 1: 
      case 6: 
      case 7: 
      case 9: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 8: 
      default: 
        break;
      case 0: 
        switch (paramrjh.c)
        {
        default: 
          break;
        case 1: 
          m = 4;
          break;
        case 2: 
          m = 5;
          break;
        case 4: 
          m = 2;
          break;
        case 7: 
          m = 3;
          break;
        case 11: 
          m = 1;
          break;
        case 3: 
          m = 6;
          break;
        case 5: 
          m = 7;
          break;
        case 6: 
          m = 8;
          break;
        case 8: 
          m = 11;
          break;
        case 9: 
          m = 12;
          break;
        case 10: 
          m = 9;
          break;
        case 12: 
          m = 10;
          break;
        case 14: 
          m = 13;
          break;
        case 15: 
          m = 14;
          break;
        case 13: 
          m = 15;
        }
        break;
      }
    }
  }
  
  final void c(rjh paramrjh)
  {
    int m = a(paramrjh);
    String str = e(paramrjh);
    if ((m == this.j) && (str.equals(this.k))) {
      return;
    }
    this.j = m;
    this.k = str;
    new StringBuilder("Network connectivity changed, type is: ").append(this.j);
    this.b.a(m);
  }
  
  final void d(rjh paramrjh)
  {
    double d1 = b(paramrjh);
    if (d1 == this.l) {
      return;
    }
    this.l = d1;
    this.b.a(d1);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    rjh localrjh = rja.a(this.e.a.getActiveNetworkInfo());
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramIntent.getAction()))
    {
      c(localrjh);
      d(localrjh);
    }
    while (!"android.net.wifi.RSSI_CHANGED".equals(paramIntent.getAction())) {
      return;
    }
    d(localrjh);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.NetworkChangeNotifierAutoDetect
 * JD-Core Version:    0.7.0.1
 */