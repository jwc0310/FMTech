package org.chromium.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkRequest;
import rja;
import rjh;

public abstract class NetworkChangeNotifierAutoDetect$RegistrationPolicy
{
  NetworkChangeNotifierAutoDetect a;
  
  protected final void a()
  {
    NetworkChangeNotifierAutoDetect localNetworkChangeNotifierAutoDetect = this.a;
    if (!localNetworkChangeNotifierAutoDetect.h)
    {
      rjh localrjh = rja.a(localNetworkChangeNotifierAutoDetect.e.a.getActiveNetworkInfo());
      localNetworkChangeNotifierAutoDetect.c(localrjh);
      localNetworkChangeNotifierAutoDetect.d(localrjh);
      localNetworkChangeNotifierAutoDetect.c.registerReceiver(localNetworkChangeNotifierAutoDetect, localNetworkChangeNotifierAutoDetect.a);
      localNetworkChangeNotifierAutoDetect.h = true;
      if (localNetworkChangeNotifierAutoDetect.f != null)
      {
        rja localrja = localNetworkChangeNotifierAutoDetect.e;
        NetworkRequest localNetworkRequest = localNetworkChangeNotifierAutoDetect.g;
        ConnectivityManager.NetworkCallback localNetworkCallback = localNetworkChangeNotifierAutoDetect.f;
        localrja.a.registerNetworkCallback(localNetworkRequest, localNetworkCallback);
        Network[] arrayOfNetwork = localNetworkChangeNotifierAutoDetect.e.a.getAllNetworks();
        int[] arrayOfInt = new int[arrayOfNetwork.length];
        for (int i = 0; i < arrayOfNetwork.length; i++) {
          arrayOfInt[i] = Integer.parseInt(arrayOfNetwork[i].toString());
        }
        localNetworkChangeNotifierAutoDetect.b.a(arrayOfInt);
      }
    }
  }
  
  protected void a(NetworkChangeNotifierAutoDetect paramNetworkChangeNotifierAutoDetect)
  {
    this.a = paramNetworkChangeNotifierAutoDetect;
  }
  
  protected abstract void b();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
 * JD-Core Version:    0.7.0.1
 */