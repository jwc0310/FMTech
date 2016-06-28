import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

final class abj
  extends aaf
  implements ServiceConnection
{
  static final boolean i = Log.isLoggable("MediaRouteProviderProxy", 3);
  final ComponentName j;
  final abo k;
  final ArrayList<abn> l = new ArrayList();
  boolean m;
  abk n;
  boolean o;
  private boolean p;
  
  public abj(Context paramContext, ComponentName paramComponentName)
  {
    super(paramContext, new aai(paramComponentName));
    this.j = paramComponentName;
    this.k = new abo(this);
  }
  
  public final aaj a(String paramString)
  {
    aak localaak = this.g;
    if (localaak != null)
    {
      localaak.b();
      List localList = localaak.a;
      int i1 = localList.size();
      for (int i2 = 0; i2 < i1; i2++) {
        if (((aac)localList.get(i2)).a.getString("id").equals(paramString))
        {
          abn localabn = new abn(this, paramString);
          this.l.add(localabn);
          if (this.o) {
            localabn.a(this.n);
          }
          b();
          return localabn;
        }
      }
    }
    return null;
  }
  
  public final void a()
  {
    if (!this.m)
    {
      if (i) {
        new StringBuilder().append(this).append(": Starting");
      }
      this.m = true;
      b();
    }
  }
  
  final void b()
  {
    if (c())
    {
      d();
      return;
    }
    e();
  }
  
  public final void b(aae paramaae)
  {
    if (this.o) {
      this.n.a(paramaae);
    }
    b();
  }
  
  final boolean c()
  {
    if (this.m)
    {
      if (this.e != null) {}
      while (!this.l.isEmpty()) {
        return true;
      }
    }
    return false;
  }
  
  final void d()
  {
    Intent localIntent;
    if (!this.p)
    {
      if (i) {
        new StringBuilder().append(this).append(": Binding");
      }
      localIntent = new Intent("android.media.MediaRouteProviderService");
      localIntent.setComponent(this.j);
    }
    try
    {
      this.p = this.a.bindService(localIntent, this, 1);
      if ((!this.p) && (i)) {
        new StringBuilder().append(this).append(": Bind failed");
      }
      return;
    }
    catch (SecurityException localSecurityException)
    {
      while (!i) {}
      new StringBuilder().append(this).append(": Bind failed");
    }
  }
  
  final void e()
  {
    if (this.p)
    {
      if (i) {
        new StringBuilder().append(this).append(": Unbinding");
      }
      this.p = false;
      f();
      this.a.unbindService(this);
    }
  }
  
  final void f()
  {
    if (this.n != null)
    {
      a(null);
      this.o = false;
      int i1 = this.l.size();
      for (int i2 = 0; i2 < i1; i2++) {
        ((abn)this.l.get(i2)).d();
      }
      abk localabk = this.n;
      localabk.a(2, 0, 0, null, null);
      localabk.b.a.clear();
      localabk.a.getBinder().unlinkToDeath(localabk, 0);
      localabk.h.k.post(new abl(localabk));
      this.n = null;
    }
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (i) {
      new StringBuilder().append(this).append(": Connected");
    }
    Messenger localMessenger;
    if (this.p)
    {
      f();
      if (paramIBinder == null) {
        break label80;
      }
      localMessenger = new Messenger(paramIBinder);
      if (!efj.a(localMessenger)) {
        break label110;
      }
      abk localabk = new abk(this, localMessenger);
      if (!localabk.a()) {
        break label85;
      }
      this.n = localabk;
    }
    label80:
    label85:
    while (!i)
    {
      return;
      localMessenger = null;
      break;
    }
    new StringBuilder().append(this).append(": Registration failed");
    return;
    label110:
    Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    if (i) {
      new StringBuilder().append(this).append(": Service disconnected");
    }
    f();
  }
  
  public final String toString()
  {
    return "Service connection " + this.j.flattenToShortString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abj
 * JD-Core Version:    0.7.0.1
 */