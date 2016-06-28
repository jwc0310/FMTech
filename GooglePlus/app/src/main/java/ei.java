import android.app.Notification;
import android.app.NotificationManager;

public class ei
{
  public static final int a = 2131755294;
  public static final int b = 2131756244;
  public static final int c = 2131756253;
  public static final int d = 2131756614;
  public static final int e = 2131756621;
  
  public int a()
  {
    return 1;
  }
  
  public void a(NotificationManager paramNotificationManager, String paramString, int paramInt)
  {
    paramNotificationManager.cancel(paramInt);
  }
  
  public void a(NotificationManager paramNotificationManager, String paramString, int paramInt, Notification paramNotification)
  {
    paramNotificationManager.notify(paramInt, paramNotification);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ei
 * JD-Core Version:    0.7.0.1
 */