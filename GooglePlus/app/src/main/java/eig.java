import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class eig
  implements ServiceConnection
{
  private final int a;
  
  public eig(eib parameib, int paramInt)
  {
    this.a = paramInt;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    efj.b(paramIBinder, "Expecting a valid IBinder");
    eib localeib1 = this.b;
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      eib.a(localeib1, (eiz)localObject);
      eib localeib2 = this.b;
      int i = this.a;
      localeib2.k.sendMessage(localeib2.k.obtainMessage(6, i, -1, new eij(localeib2)));
      return;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      if ((localIInterface != null) && ((localIInterface instanceof eiz))) {
        localObject = (eiz)localIInterface;
      } else {
        localObject = new ejb(paramIBinder);
      }
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.b.k.sendMessage(this.b.k.obtainMessage(4, this.a, 1));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eig
 * JD-Core Version:    0.7.0.1
 */