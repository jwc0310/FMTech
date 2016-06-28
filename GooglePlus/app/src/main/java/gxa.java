import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.Locale;

final class gxa
  implements Handler.Callback, gww
{
  private final List<gxd> a;
  private final HandlerThread b;
  private Handler c;
  
  public gxa(Context paramContext)
  {
    this.a = mbb.c(paramContext, gxd.class);
    this.b = new HandlerThread("AnalyticsLogger", 10);
    this.b.start();
    this.c = new Handler(this.b.getLooper(), this);
  }
  
  public final void a(Context paramContext, gwv paramgwv)
  {
    long l1 = 0L;
    if (Build.VERSION.SDK_INT > 16) {}
    for (long l2 = SystemClock.elapsedRealtimeNanos();; l2 = l1)
    {
      paramgwv.a(paramContext);
      if (Log.isLoggable("AnalyticsLogger", 3)) {
        paramgwv.toString();
      }
      Bundle localBundle = new Bundle();
      for (int i = 0; i < this.a.size(); i++) {
        ((gxd)this.a.get(i)).a(paramContext, paramgwv, localBundle);
      }
      Message localMessage = Message.obtain(this.c, 1);
      localMessage.obj = paramgwv;
      localMessage.setData(localBundle);
      this.c.sendMessage(localMessage);
      if (Build.VERSION.SDK_INT > 16) {
        l1 = SystemClock.elapsedRealtimeNanos() - l2;
      }
      if (Log.isLoggable("AnalyticsLatency", 3))
      {
        Locale localLocale = Locale.US;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Long.valueOf(l1);
        String.format(localLocale, "Latency: %dns", arrayOfObject);
      }
      return;
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    boolean bool = true;
    switch (paramMessage.what)
    {
    default: 
      bool = false;
    }
    gwv localgwv;
    int j;
    do
    {
      return bool;
      localgwv = (gwv)paramMessage.obj;
      Bundle localBundle = paramMessage.getData();
      int i = 0;
      j = 0;
      while (i < this.a.size())
      {
        if (((gxd)this.a.get(i)).a(localgwv, localBundle)) {
          j = bool;
        }
        i++;
      }
    } while ((j != 0) || (!Log.isLoggable("AnalyticsLogger", 3)));
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[bool];
    arrayOfObject[0] = localgwv.toString();
    String.format(localLocale, "Event not handled: %s", arrayOfObject);
    return bool;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gxa
 * JD-Core Version:    0.7.0.1
 */