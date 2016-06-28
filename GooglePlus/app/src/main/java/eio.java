import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;
import java.util.Set;

final class eio
  extends ein
  implements Handler.Callback
{
  private final HashMap<eip, eiq> a = new HashMap();
  private final Context b;
  private final Handler c;
  private final ejm d;
  private final long e;
  
  eio(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    this.c = new Handler(paramContext.getMainLooper(), this);
    this.d = ejm.a();
    this.e = 5000L;
  }
  
  private final boolean a(eip parameip, ServiceConnection paramServiceConnection, String paramString)
  {
    efj.b(paramServiceConnection, "ServiceConnection must not be null");
    for (;;)
    {
      eiq localeiq;
      synchronized (this.a)
      {
        localeiq = (eiq)this.a.get(parameip);
        if (localeiq == null)
        {
          localeiq = new eiq(this, parameip);
          localeiq.a(paramServiceConnection, paramString);
          localeiq.a(paramString);
          this.a.put(parameip, localeiq);
          boolean bool = localeiq.d;
          return bool;
        }
        this.c.removeMessages(0, localeiq);
        if (localeiq.b.contains(paramServiceConnection)) {
          throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + parameip);
        }
      }
      localeiq.a(paramServiceConnection, paramString);
      switch (localeiq.c)
      {
      case 1: 
        paramServiceConnection.onServiceConnected(localeiq.g, localeiq.e);
        break;
      case 2: 
        localeiq.a(paramString);
      }
    }
  }
  
  private final void b(eip parameip, ServiceConnection paramServiceConnection, String paramString)
  {
    efj.b(paramServiceConnection, "ServiceConnection must not be null");
    eiq localeiq;
    synchronized (this.a)
    {
      localeiq = (eiq)this.a.get(parameip);
      if (localeiq == null) {
        throw new IllegalStateException("Nonexistent connection status for service config: " + parameip);
      }
    }
    if (!localeiq.b.contains(paramServiceConnection)) {
      throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + parameip);
    }
    localeiq.h.d.a(localeiq.h.b, paramServiceConnection, null, null, 4);
    localeiq.b.remove(paramServiceConnection);
    if (localeiq.b.isEmpty())
    {
      Message localMessage = this.c.obtainMessage(0, localeiq);
      this.c.sendMessageDelayed(localMessage, this.e);
    }
  }
  
  public final boolean a(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    return a(new eip(paramComponentName), paramServiceConnection, paramString);
  }
  
  public final boolean a(String paramString1, ServiceConnection paramServiceConnection, String paramString2)
  {
    return a(new eip(paramString1), paramServiceConnection, paramString2);
  }
  
  public final void b(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    b(new eip(paramComponentName), paramServiceConnection, paramString);
  }
  
  public final void b(String paramString1, ServiceConnection paramServiceConnection, String paramString2)
  {
    b(new eip(paramString1), paramServiceConnection, paramString2);
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    }
    eiq localeiq = (eiq)paramMessage.obj;
    synchronized (this.a)
    {
      if (localeiq.b.isEmpty())
      {
        if (localeiq.d)
        {
          ejm localejm = localeiq.h.d;
          Context localContext = localeiq.h.b;
          eir localeir = localeiq.a;
          localContext.unbindService(localeir);
          localejm.a(localContext, localeir, null, null, 1);
          localeiq.d = false;
          localeiq.c = 2;
        }
        this.a.remove(localeiq.f);
      }
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eio
 * JD-Core Version:    0.7.0.1
 */