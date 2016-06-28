import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class efw
  implements egu
{
  final egl a;
  final Lock b;
  final Context c;
  fpe d;
  boolean e;
  boolean f;
  ehs g;
  boolean h;
  boolean i;
  private final eeo j;
  private ConnectionResult k;
  private int l;
  private int m = 0;
  private boolean n = false;
  private int o;
  private final Bundle p = new Bundle();
  private final Set<efc> q = new HashSet();
  private int r;
  private final ehq s;
  private final Map<eew<?>, Integer> t;
  private final eex<? extends fpe, foh> u;
  private ArrayList<Future<?>> v = new ArrayList();
  
  public efw(egl paramegl, ehq paramehq, Map<eew<?>, Integer> paramMap, eeo parameeo, eex<? extends fpe, foh> parameex, Lock paramLock, Context paramContext)
  {
    this.a = paramegl;
    this.s = paramehq;
    this.t = paramMap;
    this.j = parameeo;
    this.u = parameex;
    this.b = paramLock;
    this.c = paramContext;
  }
  
  private final void a(boolean paramBoolean)
  {
    if (this.d != null)
    {
      if ((this.d.g()) && (paramBoolean)) {
        this.d.f();
      }
      this.d.a();
      this.g = null;
    }
  }
  
  private static String c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 0: 
      return "STEP_GETTING_SERVICE_BINDINGS";
    case 1: 
      return "STEP_VALIDATING_ACCOUNT";
    case 2: 
      return "STEP_AUTHENTICATING";
    }
    return "STEP_GETTING_REMOTE_SERVICE";
  }
  
  private final void k()
  {
    boolean bool1 = true;
    egl localegl = this.a;
    localegl.a.lock();
    try
    {
      localegl.h();
      localegl.s = new efu(localegl);
      localegl.s.a();
      localegl.b.signalAll();
      localegl.a.unlock();
      egv.a.execute(new efx(this));
      if (this.d != null)
      {
        if (this.h) {
          this.d.a(this.g, this.i);
        }
        a(false);
      }
      Iterator localIterator1 = this.a.n.keySet().iterator();
      while (localIterator1.hasNext())
      {
        efc localefc = (efc)localIterator1.next();
        ((efb)this.a.m.get(localefc)).a();
      }
      this.n = false;
    }
    finally
    {
      localegl.a.unlock();
    }
    b();
    return;
    Bundle localBundle;
    eil localeil;
    boolean bool2;
    if (this.p.isEmpty())
    {
      localBundle = null;
      localeil = this.a.c;
      if (Looper.myLooper() != localeil.h.getLooper()) {
        break label304;
      }
      bool2 = bool1;
      label246:
      efj.a(bool2, "onConnectionSuccess must only be called on the Handler thread");
    }
    for (;;)
    {
      synchronized (localeil.i)
      {
        if (localeil.g) {
          break label310;
        }
        i1 = bool1;
        if (i1 != 0) {
          break label316;
        }
        throw new IllegalStateException();
      }
      localBundle = this.p;
      break;
      label304:
      bool2 = false;
      break label246;
      label310:
      int i1 = 0;
    }
    label316:
    localeil.h.removeMessages(1);
    localeil.g = true;
    if (localeil.c.size() == 0) {}
    for (;;)
    {
      if (!bool1) {
        throw new IllegalStateException();
      }
      ArrayList localArrayList = new ArrayList(localeil.b);
      int i2 = localeil.f.get();
      Iterator localIterator2 = localArrayList.iterator();
      while (localIterator2.hasNext())
      {
        efg localefg = (efg)localIterator2.next();
        if ((!localeil.e) || (!localeil.a.g()) || (localeil.f.get() != i2)) {
          break;
        }
        if (!localeil.c.contains(localefg)) {
          localefg.a(localBundle);
        }
      }
      localeil.c.clear();
      localeil.g = false;
      return;
      bool1 = false;
    }
  }
  
  private final void l()
  {
    Iterator localIterator = this.v.iterator();
    while (localIterator.hasNext()) {
      ((Future)localIterator.next()).cancel(true);
    }
    this.v.clear();
  }
  
  public final <A extends efb, R extends efn, T extends efs<R, A>> T a(T paramT)
  {
    this.a.f.add(paramT);
    return paramT;
  }
  
  public final void a()
  {
    this.a.c.e = true;
    this.a.n.clear();
    this.n = false;
    this.e = false;
    this.k = null;
    this.m = 0;
    this.r = 2;
    this.f = false;
    this.h = false;
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.t.keySet().iterator();
    while (localIterator.hasNext())
    {
      eew localeew = (eew)localIterator.next();
      efb localefb = (efb)this.a.m.get(localeew.b());
      int i1 = ((Integer)this.t.get(localeew)).intValue();
      localeew.a();
      if (localefb.h())
      {
        this.e = true;
        if (i1 < this.r) {
          this.r = i1;
        }
        if (i1 != 0) {
          this.q.add(localeew.b());
        }
      }
      localHashMap.put(localefb, new egd(this, localeew, i1));
    }
    if (this.e)
    {
      this.s.h = Integer.valueOf(System.identityHashCode(this.a));
      egh localegh = new egh(this);
      this.d = ((fpe)this.u.a(this.c, this.a.e, this.s, this.s.g, localegh, localegh));
    }
    this.o = this.a.m.size();
    this.v.add(egv.a.submit(new ege(this, localHashMap)));
  }
  
  public final void a(int paramInt)
  {
    b(new ConnectionResult(8, null));
  }
  
  public final void a(Bundle paramBundle)
  {
    if (!b(3)) {}
    do
    {
      return;
      if (paramBundle != null) {
        this.p.putAll(paramBundle);
      }
    } while (!e());
    k();
  }
  
  public final void a(ConnectionResult paramConnectionResult, eew<?> parameew, int paramInt)
  {
    if (!b(3)) {}
    do
    {
      return;
      b(paramConnectionResult, parameew, paramInt);
    } while (!e());
    k();
  }
  
  final boolean a(ConnectionResult paramConnectionResult)
  {
    return (this.r == 2) || ((this.r == 1) && (!paramConnectionResult.a()));
  }
  
  public final <A extends efb, T extends efs<? extends efn, A>> T b(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public final void b()
  {
    Iterator localIterator = this.a.f.iterator();
    while (localIterator.hasNext())
    {
      egt localegt = (egt)localIterator.next();
      if (localegt.f() != 1)
      {
        localegt.c();
        localIterator.remove();
      }
    }
    this.a.g();
    if ((this.k == null) && (!this.a.f.isEmpty()))
    {
      this.n = true;
      return;
    }
    l();
    a(true);
    this.a.n.clear();
    this.a.a(null);
    eil localeil = this.a.c;
    localeil.e = false;
    localeil.f.incrementAndGet();
  }
  
  final void b(ConnectionResult paramConnectionResult)
  {
    this.n = false;
    l();
    boolean bool1;
    eil localeil1;
    boolean bool2;
    if (!paramConnectionResult.a())
    {
      bool1 = true;
      a(bool1);
      this.a.n.clear();
      this.a.a(paramConnectionResult);
      if ((!this.a.g) || (!eeo.a(this.c, paramConnectionResult.c)))
      {
        this.a.h();
        localeil1 = this.a.c;
        if (Looper.myLooper() != localeil1.h.getLooper()) {
          break label235;
        }
        bool2 = true;
        label101:
        efj.a(bool2, "onConnectionFailure must only be called on the Handler thread");
        localeil1.h.removeMessages(1);
      }
    }
    for (;;)
    {
      synchronized (localeil1.i)
      {
        ArrayList localArrayList = new ArrayList(localeil1.d);
        int i1 = localeil1.f.get();
        Iterator localIterator = localArrayList.iterator();
        if (localIterator.hasNext())
        {
          efi localefi = (efi)localIterator.next();
          if ((!localeil1.e) || (localeil1.f.get() != i1))
          {
            eil localeil2 = this.a.c;
            localeil2.e = false;
            localeil2.f.incrementAndGet();
            return;
            bool1 = false;
            break;
            label235:
            bool2 = false;
            break label101;
          }
          if (!localeil1.d.contains(localefi)) {
            continue;
          }
          localefi.a(paramConnectionResult);
        }
      }
    }
  }
  
  final void b(ConnectionResult paramConnectionResult, eew<?> parameew, int paramInt)
  {
    int i1 = 1;
    int i2;
    if (paramInt != 2)
    {
      parameew.a();
      if (paramInt == i1)
      {
        if (!paramConnectionResult.a()) {
          break label88;
        }
        i2 = i1;
        if (i2 == 0) {
          break label111;
        }
      }
      if ((this.k != null) && (2147483647 >= this.l)) {
        break label111;
      }
    }
    for (;;)
    {
      if (i1 != 0)
      {
        this.k = paramConnectionResult;
        this.l = 2147483647;
      }
      this.a.n.put(parameew.b(), paramConnectionResult);
      return;
      label88:
      if (eeo.a(paramConnectionResult.c) != null)
      {
        i2 = i1;
        break;
      }
      i2 = 0;
      break;
      label111:
      i1 = 0;
    }
  }
  
  final boolean b(int paramInt)
  {
    if (this.m != paramInt)
    {
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient connecting is in step " + c(this.m) + " but received callback for step " + c(paramInt));
      b(new ConnectionResult(8, null));
      return false;
    }
    return true;
  }
  
  public final void c()
  {
    this.n = false;
  }
  
  public final String d()
  {
    return "CONNECTING";
  }
  
  final boolean e()
  {
    this.o = (-1 + this.o);
    if (this.o > 0) {
      return false;
    }
    if (this.o < 0)
    {
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
      b(new ConnectionResult(8, null));
      return false;
    }
    if (this.k != null)
    {
      b(this.k);
      return false;
    }
    return true;
  }
  
  final void f()
  {
    if (this.o != 0) {}
    ArrayList localArrayList;
    do
    {
      do
      {
        return;
        if (!this.e) {
          break;
        }
      } while (!this.f);
      localArrayList = new ArrayList();
      this.m = 1;
      this.o = this.a.m.size();
      Iterator localIterator = this.a.m.keySet().iterator();
      while (localIterator.hasNext())
      {
        efc localefc = (efc)localIterator.next();
        if (this.a.n.containsKey(localefc))
        {
          if (e()) {
            g();
          }
        }
        else {
          localArrayList.add(this.a.m.get(localefc));
        }
      }
    } while (localArrayList.isEmpty());
    this.v.add(egv.a.submit(new egi(this, localArrayList)));
    return;
    h();
  }
  
  final void g()
  {
    this.m = 2;
    this.a.o = j();
    this.v.add(egv.a.submit(new egc(this)));
  }
  
  final void h()
  {
    ArrayList localArrayList = new ArrayList();
    this.m = 3;
    this.o = this.a.m.size();
    Iterator localIterator = this.a.m.keySet().iterator();
    while (localIterator.hasNext())
    {
      efc localefc = (efc)localIterator.next();
      if (this.a.n.containsKey(localefc))
      {
        if (e()) {
          k();
        }
      }
      else {
        localArrayList.add(this.a.m.get(localefc));
      }
    }
    if (!localArrayList.isEmpty()) {
      this.v.add(egv.a.submit(new egg(this, localArrayList)));
    }
  }
  
  final void i()
  {
    this.e = false;
    this.a.o = Collections.emptySet();
    Iterator localIterator = this.q.iterator();
    while (localIterator.hasNext())
    {
      efc localefc = (efc)localIterator.next();
      if (!this.a.n.containsKey(localefc)) {
        this.a.n.put(localefc, new ConnectionResult(17, null));
      }
    }
  }
  
  final Set<Scope> j()
  {
    HashSet localHashSet = new HashSet(this.s.b);
    Map localMap = this.s.d;
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      eew localeew = (eew)localIterator.next();
      if (!this.a.n.containsKey(localeew.b()))
      {
        localMap.get(localeew);
        localHashSet.addAll(null);
      }
    }
    return localHashSet;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     efw
 * JD-Core Version:    0.7.0.1
 */