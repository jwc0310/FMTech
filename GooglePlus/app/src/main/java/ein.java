import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class ein
{
  private static final Object a = new Object();
  private static ein b;
  
  public static ein a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null) {
        b = new eio(paramContext.getApplicationContext());
      }
      return b;
    }
  }
  
  public abstract boolean a(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString);
  
  public abstract boolean a(String paramString1, ServiceConnection paramServiceConnection, String paramString2);
  
  public abstract void b(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString);
  
  public abstract void b(String paramString1, ServiceConnection paramServiceConnection, String paramString2);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ein
 * JD-Core Version:    0.7.0.1
 */