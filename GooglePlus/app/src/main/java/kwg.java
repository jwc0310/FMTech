import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class kwg
  implements ServiceConnection
{
  kwg(kwe paramkwe) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.a.b = ((kwd)paramIBinder);
    this.a.b.a(this.a.a);
    if (this.a.b.b())
    {
      kwe.a(this.a);
      return;
    }
    if (this.a.b.a())
    {
      kwe.b(this.a);
      return;
    }
    kwe.c(this.a);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.a.b = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwg
 * JD-Core Version:    0.7.0.1
 */