import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;

final class iyw
{
  final Context a;
  private final NotificationManager b;
  
  public iyw(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((NotificationManager)paramContext.getSystemService("notification"));
  }
  
  final void a(int paramInt)
  {
    NotificationManager localNotificationManager = this.b;
    String str1 = String.valueOf(this.a.getPackageName());
    String str2 = String.valueOf(":notifications:share_queue");
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      localNotificationManager.cancel(str3, paramInt);
      return;
    }
  }
  
  final void a(Notification paramNotification, String paramString, int paramInt)
  {
    NotificationManager localNotificationManager = this.b;
    String str1 = String.valueOf(this.a.getPackageName());
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      localNotificationManager.notify(str3, paramInt, paramNotification);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iyw
 * JD-Core Version:    0.7.0.1
 */