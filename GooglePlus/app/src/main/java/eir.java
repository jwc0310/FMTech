import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

public final class eir
  implements ServiceConnection
{
  public eir(eiq parameiq) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (eio.a(this.a.h))
    {
      this.a.e = paramIBinder;
      this.a.g = paramComponentName;
      Iterator localIterator = this.a.b.iterator();
      if (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
      }
    }
    this.a.c = 1;
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (eio.a(this.a.h))
    {
      this.a.e = null;
      this.a.g = paramComponentName;
      Iterator localIterator = this.a.b.iterator();
      if (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
      }
    }
    this.a.c = 2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eir
 * JD-Core Version:    0.7.0.1
 */