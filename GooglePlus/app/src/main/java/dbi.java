import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.plus.phone.HomeActivity;
import java.lang.ref.WeakReference;

public class dbi
  implements cw<Integer>
{
  public static dbi a;
  public final Object b = new Object();
  public final Handler c = new Handler(Looper.getMainLooper(), new ag(this));
  public efj d;
  
  public static dbi a()
  {
    if (a == null) {
      a = new dbi();
    }
    return a;
  }
  
  public static boolean a(efj paramefj, int paramInt)
  {
    return (x)null.get() != null;
  }
  
  public final fu<Integer> a(int paramInt, Bundle paramBundle)
  {
    if ((paramInt == 1) && (this.e.d.e()))
    {
      ikt localikt = this.e.d;
      efj.k();
      int i = localikt.e;
      return ((izy)this.e.m.a(izy.class)).d(i);
    }
    return null;
  }
  
  public void a(efj paramefj)
  {
    this.c.removeCallbacksAndMessages(paramefj);
    this.c.sendMessageDelayed(Message.obtain(this.c, 0, paramefj), 2750);
  }
  
  public final void a(fu<Integer> paramfu) {}
  
  public void a(x paramx)
  {
    synchronized (this.b)
    {
      if (e(paramx)) {
        this.d = null;
      }
      return;
    }
  }
  
  public void a(x paramx, int paramInt)
  {
    synchronized (this.b)
    {
      if (e(paramx)) {
        a(this.d, paramInt);
      }
      while (!f(paramx)) {
        return;
      }
      a(null, paramInt);
    }
  }
  
  public void b(efj paramefj)
  {
    synchronized (this.b)
    {
      if ((this.d == paramefj) || (paramefj == null)) {
        a(paramefj, 2);
      }
      return;
    }
  }
  
  public void b(x paramx)
  {
    synchronized (this.b)
    {
      if (e(paramx)) {
        a(this.d);
      }
      return;
    }
  }
  
  public void c(x paramx)
  {
    synchronized (this.b)
    {
      if (e(paramx)) {
        this.c.removeCallbacksAndMessages(this.d);
      }
      return;
    }
  }
  
  public void d(x paramx)
  {
    synchronized (this.b)
    {
      if (e(paramx)) {
        a(this.d);
      }
      return;
    }
  }
  
  public boolean e(x paramx)
  {
    return (this.d != null) && (this.d.a(paramx));
  }
  
  public boolean f(x paramx)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbi
 * JD-Core Version:    0.7.0.1
 */