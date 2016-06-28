import android.app.Notification;

final class dr
  extends do
{
  public final Notification a(dk paramdk, dl paramdl)
  {
    Notification localNotification = paramdk.x;
    localNotification.setLatestEventInfo(paramdk.a, paramdk.b, paramdk.c, paramdk.d);
    localNotification.setLatestEventInfo(paramdk.a, paramdk.b, paramdk.c, paramdk.d);
    localNotification.fullScreenIntent = null;
    if (paramdk.h > 0) {
      localNotification.flags = (0x80 | localNotification.flags);
    }
    return localNotification;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dr
 * JD-Core Version:    0.7.0.1
 */