import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class eil
  implements Handler.Callback
{
  public final eim a;
  public final ArrayList<efg> b = new ArrayList();
  public final ArrayList<efg> c = new ArrayList();
  public final ArrayList<efi> d = new ArrayList();
  public volatile boolean e = false;
  public final AtomicInteger f = new AtomicInteger(0);
  public boolean g = false;
  public final Handler h;
  public final Object i = new Object();
  
  public eil(Looper paramLooper, eim parameim)
  {
    this.a = parameim;
    this.h = new Handler(paramLooper, this);
  }
  
  public final void a(int paramInt)
  {
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = this.h.getLooper();
    boolean bool = false;
    if (localLooper1 == localLooper2) {
      bool = true;
    }
    efj.a(bool, "onUnintentionalDisconnection must only be called on the Handler thread");
    this.h.removeMessages(1);
    synchronized (this.i)
    {
      this.g = true;
      ArrayList localArrayList = new ArrayList(this.b);
      int j = this.f.get();
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        efg localefg = (efg)localIterator.next();
        if ((this.e) && (this.f.get() == j)) {
          if (this.b.contains(localefg)) {
            localefg.a(paramInt);
          }
        }
      }
    }
    this.c.clear();
    this.g = false;
  }
  
  public final void a(efg paramefg)
  {
    efj.a(paramefg);
    synchronized (this.i)
    {
      if (this.b.contains(paramefg))
      {
        new StringBuilder("registerConnectionCallbacks(): listener ").append(paramefg).append(" is already registered");
        if (this.a.g()) {
          this.h.sendMessage(this.h.obtainMessage(1, paramefg));
        }
        return;
      }
      this.b.add(paramefg);
    }
  }
  
  public final void a(efi paramefi)
  {
    efj.a(paramefi);
    synchronized (this.i)
    {
      if (this.d.contains(paramefi))
      {
        new StringBuilder("registerConnectionFailedListener(): listener ").append(paramefi).append(" is already registered");
        return;
      }
      this.d.add(paramefi);
    }
  }
  
  public final boolean b(efg paramefg)
  {
    efj.a(paramefg);
    synchronized (this.i)
    {
      boolean bool = this.b.contains(paramefg);
      return bool;
    }
  }
  
  public final boolean b(efi paramefi)
  {
    efj.a(paramefi);
    synchronized (this.i)
    {
      boolean bool = this.d.contains(paramefi);
      return bool;
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      efg localefg = (efg)paramMessage.obj;
      synchronized (this.i)
      {
        if ((this.e) && (this.a.g()) && (this.b.contains(localefg))) {
          localefg.a(this.a.b());
        }
        return true;
      }
    }
    Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eil
 * JD-Core Version:    0.7.0.1
 */