import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class egl
  implements efd
{
  final Lock a = new ReentrantLock();
  final Condition b;
  final eil c;
  final Context d;
  final Looper e;
  final Queue<egt<?>> f = new LinkedList();
  volatile boolean g;
  long h = 120000L;
  long i = 5000L;
  final egp j;
  final eeo k;
  BroadcastReceiver l;
  final Map<efc<?>, efb> m = new HashMap();
  final Map<efc<?>, ConnectionResult> n = new HashMap();
  Set<Scope> o = new HashSet();
  final ehq p;
  final Map<eew<?>, Integer> q;
  final eex<? extends fpe, foh> r;
  volatile egu s;
  final Set<egt<?>> t = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
  private ConnectionResult u = null;
  private final Set<egw<?>> v = Collections.newSetFromMap(new WeakHashMap());
  private final egs w = new egs(this);
  private final efg x = new egm(this);
  private final eim y = new egn(this);
  
  public egl(Context paramContext, Looper paramLooper, ehq paramehq, eeo parameeo, eex<? extends fpe, foh> parameex, Map<eew<?>, eey> paramMap, ArrayList<efg> paramArrayList, ArrayList<efi> paramArrayList1, int paramInt1, int paramInt2)
  {
    this.d = paramContext;
    this.c = new eil(paramLooper, this.y);
    this.e = paramLooper;
    this.j = new egp(this, paramLooper);
    this.k = parameeo;
    this.q = new HashMap();
    this.b = this.a.newCondition();
    this.s = new egk(this);
    Iterator localIterator1 = paramArrayList.iterator();
    while (localIterator1.hasNext())
    {
      efg localefg = (efg)localIterator1.next();
      this.c.a(localefg);
    }
    Iterator localIterator2 = paramArrayList1.iterator();
    while (localIterator2.hasNext())
    {
      efi localefi = (efi)localIterator2.next();
      this.c.a(localefi);
    }
    Map localMap = paramehq.d;
    Iterator localIterator3 = paramMap.keySet().iterator();
    eew localeew;
    Object localObject;
    if (localIterator3.hasNext())
    {
      localeew = (eew)localIterator3.next();
      localObject = paramMap.get(localeew);
      if (localMap.get(localeew) == null) {
        break label468;
      }
      localMap.get(localeew);
    }
    label468:
    for (int i1 = 2;; i1 = 0)
    {
      this.q.put(localeew, Integer.valueOf(i1));
      efb localefb = localeew.a().a(paramContext, paramLooper, paramehq, localObject, this.x, new ego(this, localeew, i1));
      this.m.put(localeew.b(), localefb);
      break;
      this.p = paramehq;
      this.r = parameex;
      return;
    }
  }
  
  public final Looper a()
  {
    return this.e;
  }
  
  public final ConnectionResult a(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool1;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool1 = true;
    }
    for (;;)
    {
      efj.a(bool1, "blockingConnect must not be called on the UI thread");
      this.a.lock();
      try
      {
        b();
        long l1 = paramTimeUnit.toNanos(paramLong);
        for (;;)
        {
          boolean bool2 = this.s instanceof efw;
          if (!bool2) {
            break;
          }
          try
          {
            l1 = this.b.awaitNanos(l1);
            if (l1 <= 0L)
            {
              ConnectionResult localConnectionResult5 = new ConnectionResult(14, null);
              return localConnectionResult5;
            }
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
            ConnectionResult localConnectionResult4 = new ConnectionResult(15, null);
            return localConnectionResult4;
          }
        }
        bool1 = false;
        continue;
        if ((this.s instanceof efu))
        {
          ConnectionResult localConnectionResult3 = ConnectionResult.a;
          return localConnectionResult3;
        }
        if (this.u != null)
        {
          ConnectionResult localConnectionResult2 = this.u;
          return localConnectionResult2;
        }
        ConnectionResult localConnectionResult1 = new ConnectionResult(13, null);
        return localConnectionResult1;
      }
      finally
      {
        this.a.unlock();
      }
    }
  }
  
  public final <C extends efb> C a(efc<C> paramefc)
  {
    efb localefb = (efb)this.m.get(paramefc);
    efj.b(localefb, "Appropriate Api was not requested.");
    return localefb;
  }
  
  public final <A extends efb, R extends efn, T extends efs<R, A>> T a(T paramT)
  {
    if (paramT.g != null) {}
    for (boolean bool = true;; bool = false)
    {
      efj.b(bool, "This task can not be enqueued (it's probably a Batch or malformed)");
      efj.b(this.m.containsKey(paramT.g), "GoogleApiClient is not configured to use the API required for this call.");
      this.a.lock();
      try
      {
        efs localefs = this.s.a(paramT);
        return localefs;
      }
      finally
      {
        this.a.unlock();
      }
    }
  }
  
  public final <L> egw<L> a(L paramL)
  {
    efj.b(paramL, "Listener must not be null");
    this.a.lock();
    try
    {
      egw localegw = new egw(this.e, paramL);
      this.v.add(localegw);
      return localegw;
    }
    finally
    {
      this.a.unlock();
    }
  }
  
  final void a(ConnectionResult paramConnectionResult)
  {
    this.a.lock();
    try
    {
      this.u = paramConnectionResult;
      this.s = new egk(this);
      this.s.a();
      this.b.signalAll();
      return;
    }
    finally
    {
      this.a.unlock();
    }
  }
  
  public final void a(efg paramefg)
  {
    this.c.a(paramefg);
  }
  
  public final void a(efi paramefi)
  {
    this.c.a(paramefi);
  }
  
  final void a(egq paramegq)
  {
    Message localMessage = this.j.obtainMessage(3, paramegq);
    this.j.sendMessage(localMessage);
  }
  
  final <A extends efb> void a(egt<A> paramegt)
  {
    this.t.add(paramegt);
    paramegt.a(this.w);
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("mState=").append(this.s.d());
    paramPrintWriter.append(" mResuming=").print(this.g);
    paramPrintWriter.append(" mWorkQueue.size()=").print(this.f.size());
    paramPrintWriter.append(" mUnconsumedRunners.size()=").println(this.t.size());
    String str = paramString + "  ";
    Iterator localIterator = this.q.keySet().iterator();
    while (localIterator.hasNext())
    {
      eew localeew = (eew)localIterator.next();
      paramPrintWriter.append(paramString).append(localeew.a).println(":");
      ((efb)this.m.get(localeew.b())).a(str, paramPrintWriter);
    }
  }
  
  public final <A extends efb, T extends efs<? extends efn, A>> T b(T paramT)
  {
    boolean bool;
    if (paramT.g != null) {
      bool = true;
    }
    for (;;)
    {
      efj.b(bool, "This task can not be executed (it's probably a Batch or malformed)");
      this.a.lock();
      try
      {
        if (!this.g) {
          break label116;
        }
        this.f.add(paramT);
        while (!this.f.isEmpty())
        {
          egt localegt = (egt)this.f.remove();
          a(localegt);
          localegt.c(Status.c);
        }
        bool = false;
      }
      finally
      {
        this.a.unlock();
      }
    }
    this.a.unlock();
    return paramT;
    label116:
    efs localefs = this.s.b(paramT);
    this.a.unlock();
    return localefs;
  }
  
  public final void b()
  {
    this.a.lock();
    try
    {
      this.s.c();
      return;
    }
    finally
    {
      this.a.unlock();
    }
  }
  
  public final boolean b(efg paramefg)
  {
    return this.c.b(paramefg);
  }
  
  public final boolean b(efi paramefi)
  {
    return this.c.b(paramefi);
  }
  
  public final ConnectionResult c()
  {
    boolean bool1;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool1 = true;
    }
    for (;;)
    {
      efj.a(bool1, "blockingConnect must not be called on the UI thread");
      this.a.lock();
      try
      {
        b();
        for (;;)
        {
          boolean bool2 = this.s instanceof efw;
          if (!bool2) {
            break label92;
          }
          try
          {
            this.b.await();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
            ConnectionResult localConnectionResult4 = new ConnectionResult(15, null);
            return localConnectionResult4;
          }
        }
        bool1 = false;
        continue;
        label92:
        if ((this.s instanceof efu))
        {
          ConnectionResult localConnectionResult3 = ConnectionResult.a;
          return localConnectionResult3;
        }
        if (this.u != null)
        {
          ConnectionResult localConnectionResult2 = this.u;
          return localConnectionResult2;
        }
        ConnectionResult localConnectionResult1 = new ConnectionResult(13, null);
        return localConnectionResult1;
      }
      finally
      {
        this.a.unlock();
      }
    }
  }
  
  public final void c(efg paramefg)
  {
    eil localeil = this.c;
    efj.a(paramefg);
    synchronized (localeil.i)
    {
      if (!localeil.b.remove(paramefg)) {
        new StringBuilder("unregisterConnectionCallbacks(): listener ").append(paramefg).append(" not found");
      }
      while (!localeil.g) {
        return;
      }
      localeil.c.add(paramefg);
    }
  }
  
  public final void c(efi paramefi)
  {
    eil localeil = this.c;
    efj.a(paramefi);
    synchronized (localeil.i)
    {
      if (!localeil.d.remove(paramefi)) {
        new StringBuilder("unregisterConnectionFailedListener(): listener ").append(paramefi).append(" not found");
      }
      return;
    }
  }
  
  public final void d()
  {
    this.a.lock();
    try
    {
      h();
      this.s.b();
      return;
    }
    finally
    {
      this.a.unlock();
    }
  }
  
  public final boolean e()
  {
    return this.s instanceof efu;
  }
  
  public final boolean f()
  {
    return this.s instanceof efw;
  }
  
  final void g()
  {
    Iterator localIterator1 = this.t.iterator();
    while (localIterator1.hasNext())
    {
      egt localegt = (egt)localIterator1.next();
      localegt.a(null);
      localegt.c();
    }
    this.t.clear();
    Iterator localIterator2 = this.v.iterator();
    while (localIterator2.hasNext()) {
      ((egw)localIterator2.next()).b = null;
    }
    this.v.clear();
  }
  
  final boolean h()
  {
    if (!this.g) {
      return false;
    }
    this.g = false;
    this.j.removeMessages(2);
    this.j.removeMessages(1);
    if (this.l != null)
    {
      this.d.getApplicationContext().unregisterReceiver(this.l);
      this.l = null;
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egl
 * JD-Core Version:    0.7.0.1
 */