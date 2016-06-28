import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;

final class ds
  extends do
{
  public final Notification a(dk paramdk, dl paramdl)
  {
    Context localContext = paramdk.a;
    Notification localNotification = paramdk.x;
    CharSequence localCharSequence1 = paramdk.b;
    CharSequence localCharSequence2 = paramdk.c;
    CharSequence localCharSequence3 = paramdk.f;
    int i = paramdk.g;
    PendingIntent localPendingIntent = paramdk.d;
    Bitmap localBitmap = paramdk.e;
    Notification.Builder localBuilder1 = new Notification.Builder(localContext).setWhen(localNotification.when).setSmallIcon(localNotification.icon, localNotification.iconLevel).setContent(localNotification.contentView).setTicker(localNotification.tickerText, null).setSound(localNotification.sound, localNotification.audioStreamType).setVibrate(localNotification.vibrate).setLights(localNotification.ledARGB, localNotification.ledOnMS, localNotification.ledOffMS);
    boolean bool1;
    boolean bool2;
    label170:
    boolean bool3;
    label193:
    Notification.Builder localBuilder4;
    if ((0x2 & localNotification.flags) != 0)
    {
      bool1 = true;
      Notification.Builder localBuilder2 = localBuilder1.setOngoing(bool1);
      if ((0x8 & localNotification.flags) == 0) {
        break label281;
      }
      bool2 = true;
      Notification.Builder localBuilder3 = localBuilder2.setOnlyAlertOnce(bool2);
      if ((0x10 & localNotification.flags) == 0) {
        break label287;
      }
      bool3 = true;
      localBuilder4 = localBuilder3.setAutoCancel(bool3).setDefaults(localNotification.defaults).setContentTitle(localCharSequence1).setContentText(localCharSequence2).setContentInfo(localCharSequence3).setContentIntent(localPendingIntent).setDeleteIntent(localNotification.deleteIntent);
      if ((0x80 & localNotification.flags) == 0) {
        break label293;
      }
    }
    label281:
    label287:
    label293:
    for (boolean bool4 = true;; bool4 = false)
    {
      return localBuilder4.setFullScreenIntent(null, bool4).setLargeIcon(localBitmap).setNumber(i).getNotification();
      bool1 = false;
      break;
      bool2 = false;
      break label170;
      bool3 = false;
      break label193;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ds
 * JD-Core Version:    0.7.0.1
 */