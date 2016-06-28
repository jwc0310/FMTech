import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class egk
  implements egu
{
  private final egl a;
  
  public egk(egl paramegl)
  {
    this.a = paramegl;
  }
  
  public final <A extends efb, R extends efn, T extends efs<R, A>> T a(T paramT)
  {
    this.a.f.add(paramT);
    return paramT;
  }
  
  public final void a()
  {
    Iterator localIterator = this.a.m.values().iterator();
    while (localIterator.hasNext()) {
      ((efb)localIterator.next()).a();
    }
    this.a.o = Collections.emptySet();
  }
  
  public final void a(int paramInt) {}
  
  public final void a(Bundle paramBundle) {}
  
  public final void a(ConnectionResult paramConnectionResult, eew<?> parameew, int paramInt) {}
  
  public final <A extends efb, T extends efs<? extends efn, A>> T b(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public final void b()
  {
    Iterator localIterator = this.a.f.iterator();
    while (localIterator.hasNext()) {
      ((egt)localIterator.next()).c();
    }
    this.a.f.clear();
    this.a.n.clear();
    this.a.g();
  }
  
  public final void c()
  {
    egl localegl = this.a;
    localegl.a.lock();
    try
    {
      localegl.s = new efw(localegl, localegl.p, localegl.q, localegl.k, localegl.r, localegl.a, localegl.d);
      localegl.s.a();
      localegl.b.signalAll();
      return;
    }
    finally
    {
      localegl.a.unlock();
    }
  }
  
  public final String d()
  {
    return "DISCONNECTED";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egk
 * JD-Core Version:    0.7.0.1
 */