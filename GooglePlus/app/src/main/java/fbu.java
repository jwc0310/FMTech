import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender.SendIntentException;
import com.google.android.gms.common.api.Status;

public final class fbu
  implements fnx
{
  private final Status a;
  private final PendingIntent b;
  
  public fbu(Status paramStatus, PendingIntent paramPendingIntent)
  {
    this.a = paramStatus;
    this.b = paramPendingIntent;
  }
  
  public final void a(Context paramContext)
  {
    try
    {
      paramContext.startIntentSender(this.b.getIntentSender(), null, 0, 0, 0);
      return;
    }
    catch (IntentSender.SendIntentException localSendIntentException)
    {
      localSendIntentException.printStackTrace();
    }
  }
  
  public final Status as_()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fbu
 * JD-Core Version:    0.7.0.1
 */