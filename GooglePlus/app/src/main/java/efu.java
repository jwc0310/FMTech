import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class efu
  implements egu
{
  private final egl a;
  
  public efu(egl paramegl)
  {
    this.a = paramegl;
  }
  
  private final <A extends efb> void a(egt<A> paramegt)
  {
    this.a.a(paramegt);
    efb localefb = this.a.a(paramegt.e());
    if ((!localefb.g()) && (this.a.n.containsKey(paramegt.e())))
    {
      paramegt.c(new Status(17));
      return;
    }
    paramegt.b(localefb);
  }
  
  public final <A extends efb, R extends efn, T extends efs<R, A>> T a(T paramT)
  {
    return b(paramT);
  }
  
  public final void a()
  {
    while (!this.a.f.isEmpty()) {
      try
      {
        a((egt)this.a.f.remove());
      }
      catch (DeadObjectException localDeadObjectException) {}
    }
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == 1)
    {
      egl localegl = this.a;
      if (!localegl.g)
      {
        localegl.g = true;
        if (localegl.l == null)
        {
          localegl.l = new egr(localegl);
          IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
          localIntentFilter.addDataScheme("package");
          localegl.d.getApplicationContext().registerReceiver(localegl.l, localIntentFilter);
        }
        localegl.j.sendMessageDelayed(localegl.j.obtainMessage(1), localegl.h);
        localegl.j.sendMessageDelayed(localegl.j.obtainMessage(2), localegl.i);
      }
    }
    Iterator localIterator = this.a.t.iterator();
    while (localIterator.hasNext()) {
      ((egt)localIterator.next()).b(new Status(8, "The connection to Google Play services was lost"));
    }
    this.a.a(null);
    this.a.c.a(paramInt);
    eil localeil = this.a.c;
    localeil.e = false;
    localeil.f.incrementAndGet();
    if (paramInt == 2) {
      this.a.b();
    }
  }
  
  public final void a(Bundle paramBundle) {}
  
  public final void a(ConnectionResult paramConnectionResult, eew<?> parameew, int paramInt) {}
  
  public final <A extends efb, T extends efs<? extends efn, A>> T b(T paramT)
  {
    try
    {
      a(paramT);
      return paramT;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      this.a.a(new efv(this, this));
    }
    return paramT;
  }
  
  public final void b()
  {
    this.a.n.clear();
    this.a.g();
    this.a.a(null);
    eil localeil = this.a.c;
    localeil.e = false;
    localeil.f.incrementAndGet();
  }
  
  public final void c() {}
  
  public final String d()
  {
    return "CONNECTED";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     efu
 * JD-Core Version:    0.7.0.1
 */