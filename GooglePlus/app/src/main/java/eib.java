import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.ValidateAccountRequest;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class eib<T extends IInterface>
  implements efb, eim
{
  public static final String[] m = { "service_esmobile", "service_googleme" };
  private final ehq a;
  private final ein b;
  private final Object c = new Object();
  private eiz d;
  private efh e;
  private T f;
  private final ArrayList<eie<?>> g = new ArrayList();
  private eig h;
  public final Context i;
  public final Looper j;
  final Handler k;
  public AtomicInteger l = new AtomicInteger(0);
  private int n = 1;
  private final Set<Scope> o;
  private final Account p;
  private final efg q;
  private final efi r;
  private final int s;
  
  public eib(Context paramContext, Looper paramLooper, int paramInt, ehq paramehq, efg paramefg, efi paramefi)
  {
    this(paramContext, paramLooper, ein.a(paramContext), eeo.b, paramInt, paramehq, (efg)efj.a(paramefg), (efi)efj.a(paramefi));
  }
  
  private eib(Context paramContext, Looper paramLooper, ein paramein, eeo parameeo, int paramInt, ehq paramehq, efg paramefg, efi paramefi)
  {
    this.i = ((Context)efj.b(paramContext, "Context must not be null"));
    this.j = ((Looper)efj.b(paramLooper, "Looper must not be null"));
    this.b = ((ein)efj.b(paramein, "Supervisor must not be null"));
    efj.b(parameeo, "API availability must not be null");
    this.k = new eid(this, paramLooper);
    this.s = paramInt;
    this.a = ((ehq)efj.a(paramehq));
    this.p = paramehq.a;
    this.o = a(paramehq.c);
    this.q = paramefg;
    this.r = paramefi;
  }
  
  private final Set<Scope> a(Set<Scope> paramSet)
  {
    if (paramSet == null) {}
    Iterator localIterator;
    do
    {
      while (!localIterator.hasNext())
      {
        return paramSet;
        localIterator = paramSet.iterator();
      }
    } while (paramSet.contains((Scope)localIterator.next()));
    throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
  }
  
  private final void a(int paramInt, T paramT)
  {
    int i1 = 1;
    int i2;
    int i3;
    if (paramInt == 3)
    {
      i2 = i1;
      if (paramT == null) {
        break label42;
      }
      i3 = i1;
      label17:
      if (i2 != i3) {
        break label48;
      }
    }
    for (;;)
    {
      if (i1 != 0) {
        break label53;
      }
      throw new IllegalArgumentException();
      i2 = 0;
      break;
      label42:
      i3 = 0;
      break label17;
      label48:
      i1 = 0;
    }
    for (;;)
    {
      label53:
      synchronized (this.c)
      {
        this.n = paramInt;
        this.f = paramT;
        switch (paramInt)
        {
        case 3: 
        default: 
          return;
        case 2: 
          if (this.h != null)
          {
            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c());
            this.b.b(c(), this.h, this.a.f);
            this.l.incrementAndGet();
          }
          this.h = new eig(this, this.l.get());
          if (this.b.a(c(), this.h, this.a.f)) {
            continue;
          }
          Log.e("GmsClient", "unable to connect to service: " + c());
          this.k.sendMessage(this.k.obtainMessage(3, this.l.get(), 9));
        }
      }
      if (this.h != null)
      {
        this.b.b(c(), this.h, this.a.f);
        this.h = null;
      }
    }
  }
  
  private final boolean a(int paramInt1, int paramInt2, T paramT)
  {
    synchronized (this.c)
    {
      if (this.n != paramInt1) {
        return false;
      }
      a(paramInt2, paramT);
      return true;
    }
  }
  
  protected static void i() {}
  
  public abstract T a(IBinder paramIBinder);
  
  public void a()
  {
    this.l.incrementAndGet();
    synchronized (this.g)
    {
      int i1 = this.g.size();
      for (int i2 = 0; i2 < i1; i2++) {
        ((eie)this.g.get(i2)).c();
      }
      this.g.clear();
      a(1, null);
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    this.k.sendMessage(this.k.obtainMessage(4, this.l.get(), paramInt));
  }
  
  public void a(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    this.k.sendMessage(this.k.obtainMessage(1, paramInt2, -1, new eii(this, paramInt1, paramIBinder, paramBundle)));
  }
  
  public void a(ConnectionResult paramConnectionResult) {}
  
  public final void a(efh paramefh)
  {
    this.e = ((efh)efj.b(paramefh, "Connection progress callbacks cannot be null."));
    a(2, null);
  }
  
  public final void a(ehs paramehs)
  {
    ValidateAccountRequest localValidateAccountRequest = new ValidateAccountRequest(paramehs, (Scope[])this.o.toArray(new Scope[this.o.size()]), this.i.getPackageName(), null);
    try
    {
      this.d.a(new eif(this, this.l.get()), localValidateAccountRequest);
      return;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      a(1);
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  public final void a(ehs paramehs, Set<Scope> paramSet)
  {
    for (;;)
    {
      try
      {
        Bundle localBundle = e();
        localGetServiceRequest = new GetServiceRequest(this.s);
        localGetServiceRequest.d = this.i.getPackageName();
        localGetServiceRequest.g = localBundle;
        if (paramSet != null) {
          localGetServiceRequest.f = ((Scope[])paramSet.toArray(new Scope[paramSet.size()]));
        }
        if (!h()) {
          continue;
        }
        if (this.p == null) {
          continue;
        }
        localAccount = this.p;
        localGetServiceRequest.h = localAccount;
        if (paramehs != null) {
          localGetServiceRequest.e = paramehs.asBinder();
        }
      }
      catch (DeadObjectException localDeadObjectException)
      {
        GetServiceRequest localGetServiceRequest;
        Account localAccount;
        a(1);
        return;
        if (!m()) {
          continue;
        }
        localGetServiceRequest.h = this.p;
        continue;
      }
      catch (RemoteException localRemoteException) {}
      this.d.a(new eif(this, this.l.get()), localGetServiceRequest);
      return;
      localAccount = new Account("<<default account>>", "com.google");
    }
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    IInterface localIInterface;
    for (;;)
    {
      synchronized (this.c)
      {
        int i1 = this.n;
        localIInterface = this.f;
        paramPrintWriter.append(paramString).append("mConnectState=");
        switch (i1)
        {
        default: 
          paramPrintWriter.print("UNKNOWN");
          paramPrintWriter.append(" mService=");
          if (localIInterface != null) {
            break label139;
          }
          paramPrintWriter.println("null");
          return;
        }
      }
      paramPrintWriter.print("CONNECTING");
      continue;
      paramPrintWriter.print("CONNECTED");
      continue;
      paramPrintWriter.print("DISCONNECTING");
      continue;
      paramPrintWriter.print("DISCONNECTED");
    }
    label139:
    paramPrintWriter.append(d()).append("@").println(Integer.toHexString(System.identityHashCode(localIInterface.asBinder())));
  }
  
  public Bundle b()
  {
    return null;
  }
  
  public abstract String c();
  
  public abstract String d();
  
  public Bundle e()
  {
    return new Bundle();
  }
  
  public final boolean g()
  {
    for (;;)
    {
      synchronized (this.c)
      {
        if (this.n == 3)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean h()
  {
    return false;
  }
  
  public final boolean j()
  {
    for (;;)
    {
      synchronized (this.c)
      {
        if (this.n == 2)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final void k()
  {
    if (!g()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
  }
  
  public final T l()
  {
    synchronized (this.c)
    {
      if (this.n == 4) {
        throw new DeadObjectException();
      }
    }
    k();
    if (this.f != null) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(bool, "Client is connected but service is null");
      IInterface localIInterface = this.f;
      return localIInterface;
    }
  }
  
  public boolean m()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eib
 * JD-Core Version:    0.7.0.1
 */