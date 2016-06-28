import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public class b
  implements ServiceConnection
{
  public b() {}
  
  public b(bvv parambvv)
  {
    this();
  }
  
  public void a(efj paramefj)
  {
    bvv.a(this.a, paramefj);
    bvv.a(this.a).b(0L);
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      a(new c(this, (g)localObject, paramComponentName));
      return;
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
      if ((localIInterface != null) && ((localIInterface instanceof g))) {
        localObject = (g)localIInterface;
      } else {
        localObject = new i(paramIBinder);
      }
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    bvv.a(this.a, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     b
 * JD-Core Version:    0.7.0.1
 */