import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings.Secure;
import java.util.HashSet;
import java.util.Set;

public final class eg
{
  static final int a;
  private static final Object b = new Object();
  private static String c;
  private static Set<String> d = new HashSet();
  private static final Object g = new Object();
  private static en h;
  private static final ei i;
  private final Context e;
  private final NotificationManager f;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14) {
      i = new ek();
    }
    for (;;)
    {
      a = i.a();
      return;
      if (Build.VERSION.SDK_INT >= 5) {
        i = new ej();
      } else {
        i = new ei();
      }
    }
  }
  
  public eg(Context paramContext)
  {
    this.e = paramContext;
    this.f = ((NotificationManager)this.e.getSystemService("notification"));
  }
  
  public static Set<String> a(Context paramContext)
  {
    String str = Settings.Secure.getString(paramContext.getContentResolver(), "enabled_notification_listeners");
    HashSet localHashSet;
    if ((str != null) && (!str.equals(c)))
    {
      String[] arrayOfString = str.split(":");
      localHashSet = new HashSet(arrayOfString.length);
      int j = arrayOfString.length;
      for (int k = 0; k < j; k++)
      {
        ComponentName localComponentName = ComponentName.unflattenFromString(arrayOfString[k]);
        if (localComponentName != null) {
          localHashSet.add(localComponentName.getPackageName());
        }
      }
    }
    synchronized (b)
    {
      d = localHashSet;
      c = str;
      return d;
    }
  }
  
  private final void a(ep paramep)
  {
    synchronized (g)
    {
      if (h == null) {
        h = new en(this.e.getApplicationContext());
      }
      h.a.obtainMessage(0, paramep).sendToTarget();
      return;
    }
  }
  
  public final void a(String paramString, int paramInt)
  {
    i.a(this.f, paramString, paramInt);
    if (Build.VERSION.SDK_INT <= 19) {
      a(new eh(this.e.getPackageName(), paramInt, paramString));
    }
  }
  
  public final void a(String paramString, int paramInt, Notification paramNotification)
  {
    Bundle localBundle = df.a.a(paramNotification);
    if ((localBundle != null) && (localBundle.getBoolean("android.support.useSideChannel"))) {}
    for (int j = 1; j != 0; j = 0)
    {
      a(new el(this.e.getPackageName(), paramInt, paramString, paramNotification));
      i.a(this.f, paramString, paramInt);
      return;
    }
    i.a(this.f, paramString, paramInt, paramNotification);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eg
 * JD-Core Version:    0.7.0.1
 */