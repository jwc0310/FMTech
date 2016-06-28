package org.chromium.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeClassQualifiedName;
import rhr;
import riz;
import rja;
import rjh;

@JNINamespace
public class NetworkChangeNotifier
{
  static NetworkChangeNotifier a;
  private final Context b;
  private final ArrayList<Long> c;
  private final rhr<NetworkChangeNotifier.ConnectionTypeObserver> d;
  private NetworkChangeNotifierAutoDetect e;
  private int f = 0;
  private double g = (1.0D / 0.0D);
  
  private NetworkChangeNotifier(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    this.c = new ArrayList();
    this.d = new rhr();
  }
  
  public static double a(int paramInt)
  {
    return nativeGetMaxBandwidthForConnectionSubtype(paramInt);
  }
  
  private final void a(double paramDouble)
  {
    if (paramDouble == this.g) {}
    for (;;)
    {
      return;
      this.g = paramDouble;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext()) {
        nativeNotifyMaxBandwidthChanged(((Long)localIterator.next()).longValue(), paramDouble);
      }
    }
  }
  
  private final void b(int paramInt1, int paramInt2)
  {
    Iterator localIterator1 = this.c.iterator();
    while (localIterator1.hasNext()) {
      nativeNotifyConnectionTypeChanged(((Long)localIterator1.next()).longValue(), paramInt1, paramInt2);
    }
    Iterator localIterator2 = this.d.iterator();
    while (localIterator2.hasNext()) {
      localIterator2.next();
    }
  }
  
  private final void d(int paramInt)
  {
    this.f = paramInt;
    b(paramInt, getCurrentDefaultNetId());
  }
  
  @CalledByNative
  public static void fakeDefaultNetwork(int paramInt1, int paramInt2)
  {
    a.a(false, new RegistrationPolicyApplicationStatus());
    a.b(paramInt2, paramInt1);
  }
  
  @CalledByNative
  public static void fakeNetworkConnected(int paramInt1, int paramInt2)
  {
    a.a(false, new RegistrationPolicyApplicationStatus());
    a.a(paramInt1, paramInt2);
  }
  
  @CalledByNative
  public static void fakeNetworkDisconnected(int paramInt)
  {
    a.a(false, new RegistrationPolicyApplicationStatus());
    a.c(paramInt);
  }
  
  @CalledByNative
  public static void fakeNetworkSoonToBeDisconnected(int paramInt)
  {
    a.a(false, new RegistrationPolicyApplicationStatus());
    a.b(paramInt);
  }
  
  @CalledByNative
  public static void fakeUpdateActiveNetworkList(int[] paramArrayOfInt)
  {
    a.a(false, new RegistrationPolicyApplicationStatus());
    a.a(paramArrayOfInt);
  }
  
  @CalledByNative
  public static void forceConnectivityState(boolean paramBoolean)
  {
    a.a(false, new RegistrationPolicyApplicationStatus());
    NetworkChangeNotifier localNetworkChangeNotifier = a;
    boolean bool;
    int i;
    if (localNetworkChangeNotifier.f != 6)
    {
      bool = true;
      if (bool != paramBoolean)
      {
        i = 0;
        if (!paramBoolean) {
          break label75;
        }
        label40:
        localNetworkChangeNotifier.f = i;
        localNetworkChangeNotifier.b(i, localNetworkChangeNotifier.getCurrentDefaultNetId());
        if (!paramBoolean) {
          break label81;
        }
      }
    }
    label75:
    label81:
    for (double d1 = (1.0D / 0.0D);; d1 = 0.0D)
    {
      localNetworkChangeNotifier.a(d1);
      return;
      bool = false;
      break;
      i = 6;
      break label40;
    }
  }
  
  @CalledByNative
  public static NetworkChangeNotifier init(Context paramContext)
  {
    if (a == null) {
      a = new NetworkChangeNotifier(paramContext);
    }
    return a;
  }
  
  private static native double nativeGetMaxBandwidthForConnectionSubtype(int paramInt);
  
  @NativeClassQualifiedName
  private native void nativeNotifyConnectionTypeChanged(long paramLong, int paramInt1, int paramInt2);
  
  @NativeClassQualifiedName
  private native void nativeNotifyMaxBandwidthChanged(long paramLong, double paramDouble);
  
  @NativeClassQualifiedName
  private native void nativeNotifyOfNetworkConnect(long paramLong, int paramInt1, int paramInt2);
  
  @NativeClassQualifiedName
  private native void nativeNotifyOfNetworkDisconnect(long paramLong, int paramInt);
  
  @NativeClassQualifiedName
  private native void nativeNotifyOfNetworkSoonToDisconnect(long paramLong, int paramInt);
  
  @NativeClassQualifiedName
  private native void nativeNotifyUpdateActiveNetworkList(long paramLong, int[] paramArrayOfInt);
  
  public final void a(int paramInt1, int paramInt2)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      nativeNotifyOfNetworkConnect(((Long)localIterator.next()).longValue(), paramInt1, paramInt2);
    }
  }
  
  final void a(boolean paramBoolean, NetworkChangeNotifierAutoDetect.RegistrationPolicy paramRegistrationPolicy)
  {
    if (paramBoolean) {
      if (this.e == null)
      {
        this.e = new NetworkChangeNotifierAutoDetect(new riz(this), this.b, paramRegistrationPolicy);
        localrjh = rja.a(this.e.e.a.getActiveNetworkInfo());
        i = NetworkChangeNotifierAutoDetect.a(localrjh);
        this.f = i;
        b(i, getCurrentDefaultNetId());
        a(this.e.b(localrjh));
      }
    }
    while (this.e == null)
    {
      rjh localrjh;
      int i;
      return;
    }
    NetworkChangeNotifierAutoDetect localNetworkChangeNotifierAutoDetect = this.e;
    localNetworkChangeNotifierAutoDetect.d.b();
    localNetworkChangeNotifierAutoDetect.a();
    this.e = null;
  }
  
  public final void a(int[] paramArrayOfInt)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      nativeNotifyUpdateActiveNetworkList(((Long)localIterator.next()).longValue(), paramArrayOfInt);
    }
  }
  
  @CalledByNative
  public void addNativeObserver(long paramLong)
  {
    this.c.add(Long.valueOf(paramLong));
  }
  
  public final void b(int paramInt)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      nativeNotifyOfNetworkSoonToDisconnect(((Long)localIterator.next()).longValue(), paramInt);
    }
  }
  
  public final void c(int paramInt)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      nativeNotifyOfNetworkDisconnect(((Long)localIterator.next()).longValue(), paramInt);
    }
  }
  
  @CalledByNative
  public int getCurrentConnectionType()
  {
    return this.f;
  }
  
  @CalledByNative
  public int getCurrentDefaultNetId()
  {
    int i = -1;
    if (this.e == null) {}
    for (;;)
    {
      return i;
      NetworkChangeNotifierAutoDetect localNetworkChangeNotifierAutoDetect = this.e;
      if (Build.VERSION.SDK_INT >= 21)
      {
        rja localrja = localNetworkChangeNotifierAutoDetect.e;
        NetworkInfo localNetworkInfo1 = localrja.a.getActiveNetworkInfo();
        if (localNetworkInfo1 != null) {
          for (Network localNetwork : localrja.a.getAllNetworks()) {
            if (localrja.a(localNetwork))
            {
              NetworkInfo localNetworkInfo2 = localrja.a.getNetworkInfo(localNetwork);
              if ((localNetworkInfo2 != null) && (localNetworkInfo2.getType() == localNetworkInfo1.getType())) {
                i = Integer.parseInt(localNetwork.toString());
              }
            }
          }
        }
      }
    }
  }
  
  @CalledByNative
  public double getCurrentMaxBandwidthInMbps()
  {
    return this.g;
  }
  
  @CalledByNative
  public int[] getCurrentNetworksAndTypes()
  {
    if (this.e == null) {
      return new int[0];
    }
    NetworkChangeNotifierAutoDetect localNetworkChangeNotifierAutoDetect = this.e;
    if (Build.VERSION.SDK_INT < 21) {
      return new int[0];
    }
    Network[] arrayOfNetwork = localNetworkChangeNotifierAutoDetect.e.a.getAllNetworks();
    int[] arrayOfInt1 = new int[arrayOfNetwork.length << 1];
    int i = arrayOfNetwork.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Network localNetwork = arrayOfNetwork[j];
      if (localNetworkChangeNotifierAutoDetect.e.a(localNetwork))
      {
        int m = k + 1;
        arrayOfInt1[k] = Integer.parseInt(localNetwork.toString());
        k = m + 1;
        arrayOfInt1[m] = NetworkChangeNotifierAutoDetect.a(rja.a(localNetworkChangeNotifierAutoDetect.e.a.getNetworkInfo(localNetwork)));
      }
      j++;
    }
    int[] arrayOfInt2 = new int[k];
    System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, k);
    return arrayOfInt2;
  }
  
  @CalledByNative
  public void removeNativeObserver(long paramLong)
  {
    this.c.remove(Long.valueOf(paramLong));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.NetworkChangeNotifier
 * JD-Core Version:    0.7.0.1
 */