import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;

final class abk
  implements IBinder.DeathRecipient
{
  final Messenger a;
  final abp b;
  int c = 1;
  int d = 1;
  int e;
  int f;
  final SparseArray<aar> g = new SparseArray();
  private final Messenger i;
  
  public abk(abj paramabj, Messenger paramMessenger)
  {
    this.a = paramMessenger;
    this.b = new abp(this);
    this.i = new Messenger(this.b);
  }
  
  public final void a(int paramInt)
  {
    int j = this.c;
    this.c = (j + 1);
    a(5, j, paramInt, null, null);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("volume", paramInt2);
    int j = this.c;
    this.c = (j + 1);
    a(7, j, paramInt1, null, localBundle);
  }
  
  public final void a(aae paramaae)
  {
    int j = this.c;
    this.c = (j + 1);
    if (paramaae != null) {}
    for (Bundle localBundle = paramaae.a;; localBundle = null)
    {
      a(10, j, 0, localBundle, null);
      return;
    }
  }
  
  public final boolean a()
  {
    int j = this.c;
    this.c = (j + 1);
    this.f = j;
    if (!a(1, this.f, 1, null, null)) {
      return false;
    }
    try
    {
      this.a.getBinder().linkToDeath(this, 0);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      binderDied();
    }
    return false;
  }
  
  final boolean a(int paramInt1, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
  {
    Message localMessage = Message.obtain();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramObject;
    localMessage.setData(paramBundle);
    localMessage.replyTo = this.i;
    try
    {
      this.a.send(localMessage);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      if (paramInt1 != 2) {
        Log.e("MediaRouteProviderProxy", "Could not send message to service.", localRemoteException);
      }
      return false;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      label74:
      break label74;
    }
  }
  
  public final boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    int j = this.e;
    boolean bool = false;
    if (j == 0)
    {
      int k = this.f;
      bool = false;
      if (paramInt1 == k)
      {
        bool = false;
        if (paramInt2 > 0)
        {
          this.f = 0;
          this.e = paramInt2;
          abj.a(this.h, this, aak.a(paramBundle));
          abj localabj = this.h;
          if (localabj.n == this)
          {
            localabj.o = true;
            int m = localabj.l.size();
            for (int n = 0; n < m; n++) {
              ((abn)localabj.l.get(n)).a(localabj.n);
            }
            aae localaae = localabj.e;
            if (localaae != null) {
              localabj.n.a(localaae);
            }
          }
          bool = true;
        }
      }
    }
    return bool;
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("volume", paramInt2);
    int j = this.c;
    this.c = (j + 1);
    a(8, j, paramInt1, null, localBundle);
  }
  
  public final void binderDied()
  {
    this.h.k.post(new abm(this));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abk
 * JD-Core Version:    0.7.0.1
 */