import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class en
  implements ServiceConnection, Handler.Callback
{
  final Handler a;
  private final Context b;
  private final HandlerThread c;
  private final Map<ComponentName, eo> d = new HashMap();
  private Set<String> e = new HashSet();
  
  public en(Context paramContext)
  {
    this.b = paramContext;
    this.c = new HandlerThread("NotificationManagerCompat");
    this.c.start();
    this.a = new Handler(this.c.getLooper(), this);
  }
  
  private final void a(eo parameo)
  {
    if (parameo.b)
    {
      this.b.unbindService(this);
      parameo.b = false;
    }
    parameo.c = null;
  }
  
  private final void b(eo parameo)
  {
    if (this.a.hasMessages(3, parameo.a)) {
      return;
    }
    parameo.e = (1 + parameo.e);
    if (parameo.e > 6)
    {
      new StringBuilder("Giving up on delivering ").append(parameo.d.size()).append(" tasks to ").append(parameo.a).append(" after ").append(parameo.e).append(" retries");
      parameo.d.clear();
      return;
    }
    int i = 1000 * (1 << -1 + parameo.e);
    if (Log.isLoggable("NotifManCompat", 3)) {
      new StringBuilder("Scheduling retry for ").append(i).append(" ms");
    }
    Message localMessage = this.a.obtainMessage(3, parameo.a);
    this.a.sendMessageDelayed(localMessage, i);
  }
  
  private final void c(eo parameo)
  {
    if (Log.isLoggable("NotifManCompat", 3)) {
      new StringBuilder("Processing component ").append(parameo.a).append(", ").append(parameo.d.size()).append(" queued tasks");
    }
    if (parameo.d.isEmpty()) {}
    for (;;)
    {
      return;
      boolean bool;
      if (parameo.b)
      {
        bool = true;
        if ((!bool) || (parameo.c == null)) {
          b(parameo);
        }
      }
      else
      {
        Intent localIntent = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(parameo.a);
        parameo.b = this.b.bindService(localIntent, this, eg.a);
        if (parameo.b) {
          parameo.e = 0;
        }
        for (;;)
        {
          bool = parameo.b;
          break;
          new StringBuilder("Unable to bind to listener ").append(parameo.a);
          this.b.unbindService(this);
        }
      }
      ep localep = (ep)parameo.d.peek();
      if (localep != null) {}
      try
      {
        if (Log.isLoggable("NotifManCompat", 3)) {
          new StringBuilder("Sending task ").append(localep);
        }
        localep.a(parameo.c);
        parameo.d.remove();
      }
      catch (DeadObjectException localDeadObjectException)
      {
        if (Log.isLoggable("NotifManCompat", 3)) {
          new StringBuilder("Remote service has died: ").append(parameo.a);
        }
        if (parameo.d.isEmpty()) {
          continue;
        }
        b(parameo);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          new StringBuilder("RemoteException communicating with ").append(parameo.a);
        }
      }
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    case 0: 
      ep localep = (ep)paramMessage.obj;
      Set localSet = eg.a(this.b);
      if (!localSet.equals(this.e))
      {
        this.e = localSet;
        List localList = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 4);
        HashSet localHashSet = new HashSet();
        Iterator localIterator2 = localList.iterator();
        while (localIterator2.hasNext())
        {
          ResolveInfo localResolveInfo = (ResolveInfo)localIterator2.next();
          if (localSet.contains(localResolveInfo.serviceInfo.packageName))
          {
            ComponentName localComponentName5 = new ComponentName(localResolveInfo.serviceInfo.packageName, localResolveInfo.serviceInfo.name);
            if (localResolveInfo.serviceInfo.permission != null) {
              new StringBuilder("Permission present on component ").append(localComponentName5).append(", not adding listener record.");
            } else {
              localHashSet.add(localComponentName5);
            }
          }
        }
        Iterator localIterator3 = localHashSet.iterator();
        while (localIterator3.hasNext())
        {
          ComponentName localComponentName4 = (ComponentName)localIterator3.next();
          if (!this.d.containsKey(localComponentName4))
          {
            if (Log.isLoggable("NotifManCompat", 3)) {
              new StringBuilder("Adding listener record for ").append(localComponentName4);
            }
            this.d.put(localComponentName4, new eo(localComponentName4));
          }
        }
        Iterator localIterator4 = this.d.entrySet().iterator();
        while (localIterator4.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator4.next();
          if (!localHashSet.contains(localEntry.getKey()))
          {
            if (Log.isLoggable("NotifManCompat", 3)) {
              new StringBuilder("Removing listener record for ").append(localEntry.getKey());
            }
            a((eo)localEntry.getValue());
            localIterator4.remove();
          }
        }
      }
      Iterator localIterator1 = this.d.values().iterator();
      while (localIterator1.hasNext())
      {
        eo localeo4 = (eo)localIterator1.next();
        localeo4.d.add(localep);
        c(localeo4);
      }
      return true;
    case 1: 
      em localem = (em)paramMessage.obj;
      ComponentName localComponentName3 = localem.a;
      IBinder localIBinder = localem.b;
      eo localeo3 = (eo)this.d.get(localComponentName3);
      Object localObject;
      if (localeo3 != null)
      {
        if (localIBinder != null) {
          break label569;
        }
        localObject = null;
      }
      for (;;)
      {
        localeo3.c = ((cs)localObject);
        localeo3.e = 0;
        c(localeo3);
        return true;
        IInterface localIInterface = localIBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
        if ((localIInterface != null) && ((localIInterface instanceof cs))) {
          localObject = (cs)localIInterface;
        } else {
          localObject = new cu(localIBinder);
        }
      }
    case 2: 
      label569:
      ComponentName localComponentName2 = (ComponentName)paramMessage.obj;
      eo localeo2 = (eo)this.d.get(localComponentName2);
      if (localeo2 != null) {
        a(localeo2);
      }
      return true;
    }
    ComponentName localComponentName1 = (ComponentName)paramMessage.obj;
    eo localeo1 = (eo)this.d.get(localComponentName1);
    if (localeo1 != null) {
      c(localeo1);
    }
    return true;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (Log.isLoggable("NotifManCompat", 3)) {
      new StringBuilder("Connected to service ").append(paramComponentName);
    }
    this.a.obtainMessage(1, new em(paramComponentName, paramIBinder)).sendToTarget();
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    if (Log.isLoggable("NotifManCompat", 3)) {
      new StringBuilder("Disconnected from service ").append(paramComponentName);
    }
    this.a.obtainMessage(2, paramComponentName).sendToTarget();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     en
 * JD-Core Version:    0.7.0.1
 */